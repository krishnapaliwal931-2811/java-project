Tic-Tac-Toe
-------------
Problem Statement
------------------
The game of Tic-Tac-Toe is simple but logic-intensive. The aim here is to simulate this in Java, while using only the usual principles of programming. This project solves the problem of translating real-world rules of gameplay, such as turn-based playing and checking for a winner, into the structured code format of loops, arrays, and conditionals.

Project Scope
--------------
 1.This project will develop a text-based, two-player version of the game, running in the console.
 
 2.The development will cover: Create a 3x3 data structure to represent the board using arrays.
 
 3.Build a loop to handle player switching between X and O.
 
 4.Logic implementation to validate moves: ensure players choose valid grid positions.
 
 5.Write algorithms for checking the board state after each turn to declare a win or a draw.
 
 Note: This version focuses purely on the game's logic and does not include a GUI or AI opponents.
 

Target Users
-------------
The target users are those who are beginning to program and students. It is designed for:

Anyone learning Java who wants to see how loops, methods, and arrays work in practice.

Students who need a clear example of how to manage "state" in a program.

Hobbyists who want a straightforward codebase which they may later extend, such as by adding an AI player or a GUI.

High-Level Features
--------------------
Turn-Based Gameplay: Switch between Player X and Player O seamlessly.

Live Board Display: The grid is reprinted after every move, allowing the players to see the state of the game.

Input Validation
-----------------
The game avoids errors by taking numbered inputs (0-8) corresponding to grid positions.

Win Detection: This code automatically checks all rows, columns, and diagonals for a winner.

Draw Handling: If the board fills up without a winner, the game recognizes the stalemate and exits gracefully.
