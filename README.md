# Credit Card Validation API

This repo is a backened solution of credit card validation.

You can create dummy credit card number from her : https://www.akto.io/tools/credit-card-generator

## Prerequisite

Before running this application ensure you have following installed in your system

- Java Development Kit (JDK)
- Apache Maven
- Your preferred Integrated Development Environment (IDE) for easier navigation and execution (e.g. IntelliJ IDEA, Eclipse, VS Code)

# How to run this application

1. Clone this Git repository to your local machine using following command:
```bash
git clone https://github.com/saketksinha/Credit-Card-validation.git
```
2. Open the project in your preferred IDE.

3. Build the project using Maven by running the following command in the project's root directory:
```bash
mvn clean install
   ```
4.  Start the Spring Boot application by running the following command:
```bash
mvn spring-boot:run
```

This will start the application

## API Usage
The application exposes a simple API endpoint for credit card validation. You can send POST requests to http://localhost:8080/validate with a JSON body containing credit card details. Here's an example request:

```json
{
"cardNumber": "4916011117218331",
"expiryDate": "02/27",
"cvv": "279"
}
```
The API will respond with either "Success!" if the credit card information is valid or "Invalid Credit Card information." if it's not.

## Frontend Solution is in progress......
