# Advanced Calculator

A Java Swing desktop calculator with support for real numbers, parentheses, basic arithmetic operations, result clearing, and character deletion.

## Features

- Addition, subtraction, multiplication, and division
- Percentage operation
- Decimal numbers
- Parentheses
- Clear and backspace buttons
- GUI built with Java Swing

## Versions

The project includes two versions of the same calculator:

```text
CalculatorAvansatCuIcons.java      # Version with custom button icons
CalculatorAvansatFaraIcons.java    # Version without custom button icons
```

Both versions have the same functionality. The icon-based version uses the files from the `resources/` folder.

## Run

Compile one of the versions:

```bash
javac -d . CalculatorAvansatFaraIcons.java
```

Run it:

```bash
java L07.CalculatorAvansatFaraIcons
```

For the icon version:

```bash
javac -d . CalculatorAvansatCuIcons.java
java L07.CalculatorAvansatCuIcons
```

## Notes

For the icon version, keep the `resources/` folder in the project directory so the application can load the button icons correctly.
