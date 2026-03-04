# 📱 Android Calculator App

![Platform](https://img.shields.io/badge/platform-Android-green)
![Language](https://img.shields.io/badge/language-Java-blue)
![IDE](https://img.shields.io/badge/IDE-Android%20Studio-orange)
![Library](https://img.shields.io/badge/library-exp4j-red)

A simple and responsive **Android Calculator Application** built using **Java** and **Android Studio**.
The app supports basic arithmetic operations and evaluates mathematical expressions dynamically using the **exp4j** expression library.

---

## 🚀 Features

* Perform basic arithmetic operations

  * Addition (+)
  * Subtraction (-)
  * Multiplication (*)
  * Division (/)
  * Modulus (%)

* Supports **decimal numbers**

* Displays results up to **4 decimal places**

* Handles **invalid expressions safely**

* Clean and responsive **Material-style UI**

* **Clear button** to reset the expression

* Prevents **invalid operator inputs**

---

## 🛠 Technologies Used

* **Java**
* **Android Studio**
* **XML (Android Layouts)**
* **exp4j Library** for mathematical expression evaluation

---

## 📦 Library Used

The app uses **exp4j** to evaluate mathematical expressions entered by the user.

Add this dependency in your `build.gradle`:

```
implementation 'net.objecthunter:exp4j:0.4.8'
```

---

## ⚙️ How It Works

1. The user enters numbers and operators using the calculator buttons.
2. The expression is displayed in the result `TextView`.
3. When the **equals (=)** button is pressed:

   * The expression is passed to **exp4j**
   * The expression is evaluated
   * The result is formatted to **4 decimal places**
4. Invalid expressions are handled using **exception handling** to prevent crashes.

---

## 📁 Project Structure

```
app
 ├── java/com/example/btmessanger
 │      └── MainActivity.java
 │
 ├── res
 │    ├── layout
 │    │      └── activity_main.xml
 │    │
 │    ├── drawable
 │    │      └── UI resources
 │    │
 │    └── values
 │           └── colors, strings, themes
```

---

## 📸 Screenshot

<img width="350" src="https://github.com/user-attachments/assets/83175061-85ed-45a6-ab98-3d4bbeaeebd6" />

---

## 🔮 Future Improvements

* Scientific calculator functions
* Expression history
* Dark mode support
* Better input validation
* Keyboard input support

---

## 👨‍💻 Author

**Narendra Nelluri**

---
## How to Run
* clone this repo into your android studio
* select your avd
* run it
* if you want to build
* click on menu->build->Generate apk bundle or apks->Generate APKs
* build starts then click on locate thats where your apk will be named app-debug
* rename it and send it to your mobile then use it

## 📄 License

This project is open-source and available under the **MIT License**.
