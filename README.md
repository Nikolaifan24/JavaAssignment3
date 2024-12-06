# JavaFX Calculator Application

This project is a simple calculator application built with JavaFX, demonstrating basic arithmetic operations through a graphical user interface.

The JavaFX Calculator Application provides a user-friendly interface for performing addition, subtraction, multiplication, and division operations on two input numbers. It showcases the implementation of the Model-View-Controller (MVC) architectural pattern in a JavaFX context, separating the business logic, user interface, and control flow into distinct components.

Key features of this application include:
- A clean and intuitive graphical user interface
- Support for basic arithmetic operations (addition, subtraction, multiplication, division)
- Input validation and error handling
- Modular design following MVC principles

## Repository Structure

```
assignment-3-javafx/
├── pom.xml
└── src/
    └── main/
        └── java/
            ├── com/
            │   └── ilac/
            │       └── assignment3javafx/
            │           ├── CalculatorController.java
            │           ├── CalculatorModel.java
            │           └── CalculatorView.java
            └── module-info.java
```

### Key Files:
- `pom.xml`: Maven project configuration file
- `CalculatorView.java`: Main entry point and UI setup
- `CalculatorController.java`: Handles user interactions and updates the view
- `CalculatorModel.java`: Contains the business logic for arithmetic operations
- `module-info.java`: Defines the module and its dependencies

## Usage Instructions

### Installation

Prerequisites:
- Java Development Kit (JDK) 21 or later
- Apache Maven 3.6.0 or later

To install the application, follow these steps:

1. Clone the repository:
   ```
   git clone <repository-url>
   cd assignment-3-javafx
   ```

2. Build the project using Maven:
   ```
   mvn clean package
   ```

### Running the Application

To run the application, execute the following command from the project root directory:

```
mvn javafx:run
```

This will start the JavaFX application, and you should see the calculator interface.

### Using the Calculator

1. Enter the first number in the top text field.
2. Enter the second number in the bottom text field.
3. Click on one of the operation buttons (Sum, Subtraction, Multiplication, Division) to perform the calculation.
4. The result will be displayed in the result label.

Example:
```
Input 1: 10
Input 2: 5
Operation: Sum
Result: The result is: 15.0
```

### Error Handling

The application includes basic error handling:
- If you leave a field empty or enter non-numeric values, you'll see an error message: "Please, type a number on both fields."
- For division, if you attempt to divide by zero, you'll see an error message: "Please, type a number on both fields. The second number cannot be zero."

### Troubleshooting

Common issues and solutions:

1. Application fails to start
   - Ensure you have JDK 21 or later installed and set in your PATH.
   - Verify that Maven is correctly installed and configured.
   - Check the console output for specific error messages.

2. Calculation produces unexpected results
   - Verify that you've entered valid numeric inputs in both fields.
   - Ensure you're using the correct operation button for your intended calculation.

For debugging:
- Run the application with Maven's debug configuration:
  ```
  mvn javafx:run -Djavafx.debug
  ```
- Look for log output in the console, which may provide more information about any errors.

## Data Flow

The data flow in this calculator application follows the MVC pattern:

1. User inputs numbers into text fields in the View (CalculatorView).
2. User clicks an operation button, triggering an action in the Controller (CalculatorController).
3. Controller retrieves input values and creates a Model instance (CalculatorModel).
4. Controller calls the appropriate method on the Model to perform the calculation.
5. Model performs the calculation and returns the result to the Controller.
6. Controller updates the View with the result or error message.

```
[User Input] -> [View] -> [Controller] -> [Model]
                 ^                           |
                 |                           |
                 +------ [Result] <----------+
```

Note: The View doesn't interact directly with the Model, maintaining a clear separation of concerns.
