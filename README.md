<p align="center">
  <img src="./img.png" alt="Project Banner" width="100%">
</p>

# Project Name
SkillBarter


# Team Name 
 Team Name: Duo
# Team Members
 Team Members
- Member 1: Anna Rachel Mathew - College of Engineering,Chengannur
- Member 2: Diya Shibu - College of Engineering,Chengannur

### Hosted Project Link
https://github.com/diyashibu07/SKILLBARTER.git
### Project Description
This project is a simple website where people can share and learn skills. Users earn credits by teaching a skill and use those credits to learn from others. It helps people learn from each other in an easy and interactive way.

### The Problem statement
Many talented individuals possess valuable skills but lack financial resources to monetize or share them through paid platforms. At the same time, many eager learners are unable to afford expensive courses. This creates a gap where knowledge exists, demand exists, but money becomes the barrier preventing skill exchange.

### The Solution
SkillBarter is a community-based platform where people exchange skills using credits instead of money. Users earn credits by teaching what they know and use those credits to learn something new, removing financial barriers to education.

---

## Technical Details

### Technologies/Components Used

**For Software:**
- Languages used: HTML,CSS,JavaScript,Java
- Frameworks used: None
- Libraries used: None
- Tools used: Visual Studio Code,Browser,Git

**For Hardware:**
- Main components:Laptop
- Specifications:Any system capable of running a modern web browser
- Tools required: Internet browser, code editor

---

## Features

List the key features of your project:
- Feature 1: Skill publishing(Mentor)
- Feature 2:  Skill publishing(Learner)
- Feature 3: Credit system
- Feature 4: Personal Dashboard

---

## Implementation

### For Software:

#### Installation
```bash
No installation required.

Just download or clone the project folder and open the HTML files in a browser.
```

#### Run
```bash
Open index.html in any modern web browser
```

### For Hardware:

#### Components Required
Not applicable – this is a software‑based web application.



#### Circuit Setup
Not applicable.

---

## Project Documentation

### For Software:

#### Screenshots (Add at least 3)

![alt text](<Screenshot 2026-02-28 094121.png>)
Home Page

![alt text](<Screenshot 2026-02-28 094210.png>)
Learn a skill

![alt text](<Screenshot 2026-02-28 094435.png>)
Teach a skill

#### Diagrams

**System Architecture:**
The SkillBarter system is a client‑side web application built using HTML, CSS and JavaScript.
The user interacts with the web interface (Mentor, Learner and Dashboard pages).
All data such as skills, learned skills and credits are stored and retrieved using the browser’s LocalStorage.
JavaScript handles user actions, data validation, credit management and dynamic UI updates

**Application Workflow:**



Users can choose to act as a Mentor or Learner. Mentors publish skills with learning material and earn credits. Learners browse available skills and spend credits to learn them. All activities update the dashboard and are stored locally in the browser.


---

### For Hardware:

#### Schematic & Circuit
Circuit:This project does not use any hardware components. It is a fully software‑based web application.

Schematic:Not applicable, as no electronic or hardware schematic is required for this project.





## Additional Documentation

### For Web Projects with Backend:

#### API Documentation

**Base URL:** ` http://127.0.0.1:5500/  `

##### Endpoints

**GET /api/endpoint**
- **Description:** Retrieves all available skills published by mentors.


- **Parameters:**
  - None
  
- **Response:**
```json
{
{
  "status": "success",
  "data": [
    {
      "title": "Web Design",
      "content": "Learn basic HTML and CSS",
      "fileName": "notes.pdf"
    }
  ]
}
}
```

**POST /api/endpoint**
- **Description:** [What it does]
- **Request Body:**
```json
{
  {
  "title": "JavaScript Basics",
  "content": "Introduction to JavaScript",
  "fileData": "base64_file_data"
}



}
```
- **Response:**
```json
{
  {
  "title": "JavaScript Basics",
  "content": "Introduction to JavaScript",
  "fileData": "base64_file_data"
}


}
```

[Add more endpoints as needed...]

---

### For Mobile Apps:






## Project Demo

### Video
https://drive.google.com/file/d/1jhMOsqiqZjbThX604SKT8XxEkwD0ucJl/view?usp=drivesdk

The video demonstrates user registration and login, publishing a skill as a mentor, earning credits, learning a skill as a learner, credit deduction, and viewing activity in the dashboard

### Additional Demos


---

## AI Tools Used (Optional - For Transparency Bonus)

If you used AI tools during development, document them here for transparency:

**Tool Used:**  GitHub Copilot, ChatGPT,Gemini

**Purpose:** [What you used it for]
- Example: UI improvement suggestions
- Example:JavaScript debugging help
- Example:Feature implementation guidance (credits, dashboard, animations)



**Key Prompts Used:**
Create a credit system using localStorage”

“Add a popup animation when credits increase”

“Improve UI layout for a web learning platform”

**Percentage of AI-generated code:** ~ 25%

**Human Contributions:**
- Complete project planning and structure
- HTML, CSS and JavaScript integration
-Feature implementation and testing,UI/UX design    decisions
-Documentation and presentation



*Note: Proper documentation of AI usage demonstrates transparency and earns bonus points in evaluation!*

---

## Team Contributions

Diya Shibu – Backend development, UI design, animations, feature implementation (credits, dashboard, mentor & learner modules), documentation

Anna Rachel Mathew – Frontend development, Project planning, feature design, testing, documentation and presentation support

## License

This project is licensed under the MIT License – see the LICENSE file for details.



**Common License Options:**
- MIT License (Permissive, widely used)
- Apache 2.0 (Permissive with patent grant)
- GPL v3 (Copyleft, requires derivative works to be open source)

---

Made with ❤️ at TinkerHub
