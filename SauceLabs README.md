# Automation Testing Framework – SauceDemo & REST API

## Introduction
This project is a **comprehensive test automation framework** that validates both **UI functionalities** of the [SauceDemo e-commerce website](https://www.saucedemo.com/) and **REST APIs**.  

It ensures **end-to-end quality assurance** by covering:  
- **UI Automation Testing** with [![Selenium](https://img.shields.io/badge/Selenium-43B02A?logo=selenium&logoColor=white)](https://www.selenium.dev/) + [![TestNG](https://img.shields.io/badge/TestNG-%23E23337.svg?logo=testng&logoColor=white)](https://testng.org/) + [![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?logo=cucumber&logoColor=white)](https://cucumber.io/)  
- **API Automation Testing** with [![REST Assured](https://img.shields.io/badge/REST%20Assured-009688?logo=java&logoColor=white)](https://rest-assured.io/)  

The framework ensures **scalability, reusability, and maintainability**.  

---

## Project Type
✅ Test Automation Framework  
- UI Testing (Frontend)  
- API Testing (Backend)  

---

## Deployed App (for testing)
- 🌐 **SauceDemo Website:** https://www.saucedemo.com/  
- 🌐 **Sample REST API:** https://reqres.in/  

---

## Directory Structure
```
automation-framework/
├─ src/test/java/
│  ├─ uiTests/
│  │   ├─ pageObjects/
│  │   ├─ stepDefinitions/
│  │   ├─ features/
│  │   ├─ testRunners/
│  │
│  ├─ apiTests/
│  │   ├─ tests/
│  │   ├─ utils/
│
├─ reports/
├─ pom.xml
```

---

## Video Walkthrough of the project
🎥 [Attach a 2–3 min demo walkthrough video showing test executions and reports]  

---

## Video Walkthrough of the codebase
🎥 [Attach a 3–5 min walkthrough video of framework structure & code explanation]  

---

## Features
- ✅ **UI Automation (SauceDemo)**  
  - Login with valid & invalid credentials  
  - Product search, add to cart, checkout flow  
  - Logout functionality  
- ✅ **API Testing (ReqRes API)**  
  - Validate GET, POST, PUT, DELETE requests  
  - JSON schema validation  
  - Response status, headers, and payload verification  
- ✅ **Reporting** using **[Allure Reports](https://allurereport.org/)** or **[Extent Reports](https://extentreports.com/)**  
- ✅ **Reusable Utilities** for config, logging, and data handling  
- ✅ **Maven + TestNG Integration** for CI/CD compatibility  

---

## Design Decisions & Assumptions
- **Page Object Model (POM)** for UI automation.  
- **Cucumber (BDD)** for feature-driven tests.  
- API payloads and test data stored in JSON/properties files.  
- Reports auto-generated after every run.  
- CI/CD compatible with **GitHub Actions / Jenkins**.  

---

## Installation & Getting Started
### 1. Clone the repo
```bash
git clone https://github.com/your-username/automation-framework.git
cd automation-framework
```

### 2. Install dependencies
```bash
mvn clean install
```

### 3. Run UI Tests
```bash
mvn test -Dcucumber.options="--tags @ui"
```

### 4. Run API Tests
```bash
mvn test -Dcucumber.options="--tags @api"
```

---

## Usage
- Reports available in `/reports`.  
- Use Maven profiles to run only UI, only API, or combined tests.  

```bash
# Run only UI Tests
mvn test -P ui-tests

# Run only API Tests
mvn test -P api-tests

# Run full regression suite
mvn test -P regression
```

---

## Credentials
For **SauceDemo**:  
- 👤 Standard User → `standard_user` / `secret_sauce`  
- 🔒 Locked Out User → `locked_out_user` / `secret_sauce`  

For **API Testing (ReqRes)** → No authentication required.  

---

## APIs Used
- [ReqRes API](https://reqres.in/) – mock REST API  

---

## API Endpoints (Examples)
- `GET /api/users?page=2` → Retrieve users  
- `POST /api/users` → Create user  
- `PUT /api/users/2` → Update user  
- `DELETE /api/users/2` → Delete user  

---

## Technology Stack
- [![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?logo=openjdk&logoColor=white)](https://www.java.com/)  
- [![Maven](https://img.shields.io/badge/Maven-C71A36?logo=apachemaven&logoColor=white)](https://maven.apache.org/)  
- [![Selenium](https://img.shields.io/badge/Selenium-43B02A?logo=selenium&logoColor=white)](https://www.selenium.dev/)  
- [![TestNG](https://img.shields.io/badge/TestNG-%23E23337.svg?logo=testng&logoColor=white)](https://testng.org/)  
- [![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?logo=cucumber&logoColor=white)](https://cucumber.io/)  
- [![REST Assured](https://img.shields.io/badge/REST%20Assured-009688?logo=java&logoColor=white)](https://rest-assured.io/)  
- [![Allure](https://img.shields.io/badge/Allure-FF6F00?logo=allure&logoColor=white)](https://allurereport.org/)  
