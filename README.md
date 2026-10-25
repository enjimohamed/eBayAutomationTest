Overview
This project automates the testing of the eBay website using Selenium WebDriver, Java, and TestNG.
It follows the Page Object Model (POM) design pattern to organize page interactions and test logic.

Technologies Used
Java
Selenium WebDriver
TestNG
Maven
IntelliJ IDEA
Google Chrome

Prerequisites
Before running the project, ensure you have installed:
JDK 19 or a compatible Java version
IntelliJ IDEA
Google Chrome
Maven (or use the Maven Wrapper if included)

Test Scenario
The automated test performs the following steps:
Opens the eBay website.
Verifies that the homepage is displayed.
Searches for "mazda mx-5".
Verifies and logs the number of search results.
Opens the first search result.
Verifies that the item details page is displayed.

How to Run the Project
Clone or download this repository.
Open the project in IntelliJ IDEA.
Allow Maven to import the dependencies from pom.xml.
Locate the ebaytest TestNG class.
Right-click the class and select Run 'ebaytest'.


