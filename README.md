# eBay Web Test Automation

Automates the following user flow on https://www.ebay.com/ using Selenium WebDriver, Java and TestNG, following the Page Object Model.

## Test Scenario
1. Open the eBay website
2. Verify the home page is displayed
3. Search for "mazda mx-5"
4. Verify the search results are displayed
5. Log the number of search results (products displayed on the page, plus eBay's reported total)
6. Open the first search result
7. Verify the item details page is displayed

## Technologies
- Java 19
- Selenium WebDriver 4
- TestNG
- Maven
- Google Chrome

## Prerequisites
- JDK 19 or a compatible version
- Maven 3.6+
- Google Chrome (the driver is downloaded automatically by Selenium Manager)

## How to Run

**From the command line**
```bash
git clone <your-repo-url>
cd eBayAutomationTest
mvn clean test
```

**From IntelliJ IDEA**
1. Open the project and let Maven import the dependencies from `pom.xml`
2. Open the `eBayTest` class
3. Right-click it and choose **Run 'eBayTest'**

## Output
The number of search results is printed in the console.

## Demo
[Video link]
