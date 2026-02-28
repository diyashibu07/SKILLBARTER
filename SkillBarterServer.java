import com.sun.net.httpserver.HttpServer;
import java.io.*;
import java.net.InetSocketAddress;
import java.util.*;

public class SkillBarterServer {

    static List<String> skills = new ArrayList<>();
    static List<String> contents = new ArrayList<>();
    static int credits = 0;
    static boolean trialUsed = false;

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // TEACH
        server.createContext("/teach", exchange -> {

            if (exchange.getRequestMethod().equalsIgnoreCase("POST")) {

                BufferedReader br = new BufferedReader(
                        new InputStreamReader(exchange.getRequestBody()));

                String body = br.readLine(); // title=Java&content=Basics
                String[] data = body.split("&");

                String title = data[0].split("=")[1];
                String content = data[1].split("=")[1];

                skills.add(title);
                contents.add(content);
                credits++;

                String response = "Skill published. Credits: " + credits;

                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });

        // LEARN
        server.createContext("/learn", exchange -> {

            if (skills.isEmpty()) {
                String response = "No skills available.";
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
                return;
            }

            String response;

            if (credits > 0) {
                credits--;
                response = "Learning: " + skills.get(0) +
                        "\nContent: " + contents.get(0) +
                        "\nCredits left: " + credits;

            } else if (!trialUsed) {
                trialUsed = true;
                response = "Free Trial Used!\nLearning: " +
                        skills.get(0) +
                        "\nContent: " + contents.get(0);
            } else {
                response = "Out of credits. Please teach to earn.";
            }

            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        });

        server.start();
        System.out.println("Server running at http://localhost:8080");
    }
}