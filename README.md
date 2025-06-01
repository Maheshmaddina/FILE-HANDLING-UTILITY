# INTERACTIVE-QUIZ-APPLICATION

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: MAHESH MADDINA

*INTERN ID*: CT06DF1416

*DOMAIN*: JAVA PROGRAMMING

*DURATION*:6 WEEKS

*MENTOR*: NEELA SANTOSH

## DESCRIPTIONS

 Description:
The Java program named FileHandler demonstrates basic file operations: reading, writing, and modifying text files using standard Java I/O classes.
PLATFORM USED : VISUAL STUDIO CODE.

1. Writing to a File:
The writeFile method accepts a file path and a string content. It uses a BufferedWriter with FileWriter to write the content to the specified file. If the file already exists, it is overwritten. This demonstrates how to create and populate a text file in Java.

2. Reading from a File:
The readFile method reads the contents of a text file line by line using a BufferedReader. Each line is printed to the console. This method helps in viewing the contents of the file to verify what is written or modified.

3. Modifying a File:
The modifyFile method performs a simple find-and-replace operation. It reads all lines from the file using Files.readAllLines, replaces every occurrence of a given word (target) with a new word (replacement), and writes the modified lines back to the same file using Files.write. This effectively updates the file in place.

4. Main Method (Program Flow):
The main method demonstrates how the above methods work together:

It first writes sample content to example.txt.

Then it reads and prints the content.

After that, it replaces the word "world" with "Java" using the modifyFile method.

Finally, it reads and prints the updated file to show the modification.

# Technologies Used:
File I/O Classes: BufferedWriter, BufferedReader, FileWriter, FileReader.

NIO Package: Files, Paths for simplified file read/write operations.

Collections: List and ArrayList to store and manipulate file lines.

# Purpose:
This program is useful for beginners learning Java I/O operations. It shows how to:

Create and write to a file.

Read file content line by line.

Perform simple text replacement in a file.

The logic is clear and modular, making it easy to expand (e.g., user input, appending, or deleting lines).


## OUTPUT: 
![Image](https://github.com/user-attachments/assets/11106693-14d4-41fe-8fc5-2184de83210b)
