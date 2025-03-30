# Bookbot Java Edition

This is an Java version of a project I first made in Python for Boot.dev. A simple Java console application that reads a text file, counts the number of letters, and displays the results (including a frequency breakdown for each letter) in the terminal.

## Features

- **File Reading:** Reads all lines from a specified text file.
- **Letter Counting:** Counts the total number of letters (ignoring case) in the file.
- **Frequency Breakdown:** Displays the frequency for each letter from 'a' to 'z'.
- **Error Handling:** Provides basic error handling if the file is not found or cannot be read.

## Prerequisites

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) (JDK 8 or later is recommended)
- A text editor or IDE such as Visual Studio Code, IntelliJ IDEA, or Eclipse.

## Getting Started

### 1. Clone the Repository

Clone the repository to your local machine:

```bash
git clone https://github.com/yourusername/LetterCounter.git
cd LetterCounter 
``` 

## 2. Add Your Text File 

Place the text file you want to analyze (e.g., `sample.txt`) in the project directory.
If your text file is located elsewhere, update the `filePath` variable in `LetterCounter.java` accordingly. 

## 3. Compile and Run the Program 

**Using the Command Line** 

1. **Compile the Java Program:** 
```bash
javac LetterCounter.java 
``` 

2. **Run the Program:** 
```bash 
java LetterCounter 
```  

The program will read the contents of `sample.txt`, count the letters, and display both the total count and the individual frequencies on the terminal. 

## Project Structure 

```cpp
LetterCounter/
├── LetterCounter.java    // Main Java source file containing the logic to count letters
├── sample.txt            // Text file to be analyzed (ensure this file exists or update the file path)
└── README.md             // Project documentation and instructions
``` 

## Customization 

- **File Path:** Modify the filePath variable in LetterCounter.java if your text file is located in a different directory. 
- **Error Handling:** The current implementation checks if the file can be read and prints an error message if not. You can extend this to handle additional exceptions or add logging as needed.