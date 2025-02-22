# Selenium Practice Java

## Overview
This repository contains Java-based Selenium WebDriver automation scripts for practice and learning purposes. It demonstrates various Selenium functionalities, including web element interactions, waits, handling alerts, and more.

## Features
- Web automation using **Selenium WebDriver**
- Implementation of **Page Object Model (POM)**
- Usage of **Explicit and Implicit Waits**
- Handling **alerts, frames, and dropdowns**
- Taking **screenshots** during execution
- Logging events using **WebDriverEventListener**
- Managing test execution with **TestNG**

## GitHub Actions CI/CD Integration

Successfully implemented **GitHub Actions** for automated testing and continuous integration.  
Every push and pull request to the `main` branch triggers a workflow that:

- **Builds the project** using Maven.
- **Runs Selenium tests** in a headless Chrome browser.
- **Ensures test stability** with automatic Chrome and ChromeDriver setup.

### How It Works
1. GitHub Actions installs **JDK 17** and **Maven**.
2. It sets up **Google Chrome and ChromeDriver**.
3. Runs `mvn clean test` in the `demo` folder.
4. Reports build status in the GitHub repository.

## Prerequisites
Ensure you have the following installed:
- **Java JDK** (Version 8 or later)
- **Maven** (for dependency management)
- **Selenium WebDriver**
- **TestNG** (for test execution)
- **ChromeDriver/GeckoDriver** (for browser automation)

## Installation
1. Clone this repository:
   ```sh
   git clone https://github.com/MahmudulHasan/SeleniumPracticeJava.git
   ```
2. Navigate to the project directory:
   ```sh
   cd SeleniumPracticeJava
   ```
3. Install dependencies using Maven:
   ```sh
   mvn clean install
   ```

## Running Tests
Run tests using TestNG:
```sh
mvn test
```
Or specify a TestNG XML suite:
```sh
mvn test -DsuiteXmlFile=src/test/resources/testng.xml
```

## Project Structure
```
SeleniumPracticeJava/
├── src/
│   ├── main/java/ (Main automation code)
│   ├── test/java/ (Test cases)
│   ├── resources/ (Test data, configuration files)
│
├── pom.xml (Maven dependencies)
├── README.md (Project documentation)
```

## Contributing
Feel free to fork this repository and submit pull requests for improvements or new test cases.

## License
This project is open-source and available under the **MIT License**.

---
### Author
[Mahmudul Hasan](https://github.com/MahmudulHasan)

