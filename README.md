# CoffeeMachine
Simple Coffee Machine from JetBrain Academy

Stage 5/6: Keep track of the supplies

Description
But just one action isn’t interesting. Let's improve the program so it can do multiple actions, one after another. 
The program should repeatedly ask what the user wants to do. If the user types "buy", "fill" or "take", then just do what the program did in the previous step. 
However, if the user wants to switch off the coffee machine, he should type "exit". 
Then the program should terminate. Also, when the user types "remaining", the program should output all the resources that the coffee machine has.

Also, do not forget that you can be out of resources for making coffee. If the coffee machine doesn’t have enough resources to make coffee, 
the program should output a message that says it can't make a cup of coffee.

And the last improvement to the program at this step—if the user types "buy" to buy a cup of coffee and then changes his mind, 
he should be able to type "back" to return into the main cycle.

Instruction

Write a program that will work endlessly to make coffee for all interested persons until the shutdown signal is given.

Stage 6/6: Brush up your code

Description
Let's redesign our program and write a class that represents the coffee machine. 
The class should have a method that takes a string as input. Every time the user inputs a line (a string) to the console, 
the program invokes this method with one argument: the line that user input to the console. 
This system simulates pretty accurately how real-world electronic devices work. 
External components (like buttons on the coffee machine or tapping on the screen) generate events that pass into the single interface of the program.

The class should not use system input at all; it only should handle input that comes to it via this method and its string argument.

The first problem that comes to mind: how to write that method in a way that it represents all that coffee machine can do? 
If the user inputs a single number, how can the method determine what that number is: a variant of coffee chosen by the user or the number of the disposable cups 
that a special worker added into the coffee machine?

The right solution to this problem is to store the current state of the machine. The coffee machine has several states it can be in. 
For example, the state could be "choosing an action" or "choosing a variant of coffee". 
Every time the user inputs something and a program passes that line to the method, the program determines how to interpret this line using the information
about the current state. After processing this line, the state of the coffee machine can be changed or can stay the same. 
The most efficient way of handling states is using an enum with all predefined states.

Remember, that:

For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.

Instruction
Refactor the program. Make it so that you can communicate with the coffee machine through a single method.

