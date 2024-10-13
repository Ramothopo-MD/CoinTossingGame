Coin Tossing Web Application
Overview
This is a Java web application where users can guess the outcome of a coin toss and track their performance (number of correct guesses). The application uses servlets for handling user sessions and managing game logic.

Features
User Login: Verifies user credentials and initiates a session.
Coin Toss Game: Allows users to guess the result of a coin toss and track the number of correct guesses.
Session Tracking: Tracks the user's session, including the number of games played and correct guesses.
Technologies Used
Java Servlets: Handles HTTP requests and manages the session state.
JSP (JavaServer Pages): Displays user interface pages.
Servlet API: Version 3.1 (defined in web.xml).
HTML/CSS/Bootstrap: For front-end styling (if used).
JSP Pages: session_started.jsp and guess_toss.jsp.
Project Structure
bash
Copy code
/src
    /za/ac/tut
        LoginServlet.java
        StartSession.java
        coinTossingServlet.java
        CoinTossManager.java
        CredentialsManager.java
        CoinTossingInterface.java
        CredentialsCheckerInterface.java
/web
    /WEB-INF
        web.xml
    /jsp
        session_started.jsp
        guess_toss.jsp
Key Files:
web.xml: Configures servlet mappings and session parameters.
StartSession.java: Initializes a user session, setting default values like count and numCorrectGuesses.
coinTossingServlet.java: Generates a random coin toss and forwards the result to the user for a guess.
CoinTossManager.java: Handles the core logic for tossing the coin, comparing user guesses, and updating session attributes.
CredentialsManager.java: Verifies user credentials.
Setup Instructions
Prerequisites:
Java Development Kit (JDK): Version 8 or later.
Apache Tomcat: Servlet container to deploy and run the application.
Maven/Gradle: (optional) For dependency management and build.
XAMPP: (optional) As a local development environment.
Steps to Run:
Clone the Repository:

bash

git clone <repository-url>
Build the Project:

If using Maven, run:
bash
Copy code
mvn clean install
Or, using Gradle:
bash

gradle build
Deploy to Tomcat:

Copy the .war file to the webapps directory of your Tomcat server.
Start the Tomcat server.
Access the Application:

Open a web browser and navigate to http://localhost:8080/your-app-name.
Testing:

Once deployed, you can start the session and begin guessing the coin toss results. The game will track your number of correct guesses.
Example URLs
Start Session: /StartSession.do
Coin Toss: /coinTossingServlet.do
Guess Toss: After the toss, a JSP page (guess_toss.jsp) is used to capture the user’s guess.
Future Enhancements
Add more user authentication features.
Improve the UI with enhanced styling.
Implement more games or challenges within the same session.
