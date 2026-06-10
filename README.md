# Task - 1
## Number Game

This is a simple Java Number Guessing Game project.
The program generates a random number between 1 and 100, and the player tries to guess the correct number.
The program accepts user input and compares the guessed number with the generated number. If the guess is higher than the actual number, the program displays “Too High”. If the guess is lower, it displays “Too Low”. The game continues until the player guesses the correct number or the number of attempts are reached.

### Features
- Random number generation
- User input handling
- High/Low guess hints
- Limited number of attempts
- Multiple game rounds
- Final score display

### Technologies Used
- Java
- Random Class
- Scanner Class
- Loops
- Conditional Statements

### How to run
#### Using VS Code

1. Open the project folder in VS Code.
2. Open the file:

   NumberGame.java

3. Compile the program:

   javac NumberGame.java

4. Run the program:

   java NumberGame

### Sample Output
   
Welcome to the Number Guessing Game!

Guess a number between 1 and 100

You only have 5 attempts!

##### Attempt 1 of 5

Enter your guess: 50

 Too low!
 
 Remaining Attempts: 4

##### Attempt 2 of 5

Enter your guess: 75

 Too high!
 
 Remaining Attempts: 3

##### Attempt 3 of 5

Enter your guess: 65

 Too low!
 
 Remaining Attempts: 2

##### Attempt 4 of 5

Enter your guess: 70

 Correct! You guessed the number.
 
 Round Score: 2

Do you want to play again? (yes/no): no

 Game Over!
 
 Final Score: 2
