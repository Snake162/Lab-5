CSCI-2467 Lab 5 – Holding Tank Class
Background
You will create a Java class that simulates a water holding tank. The holding tank can hold volumes of water (measured in gallons) that range from 0 (empty) up to a maximum. If more than the maximum capacity is added to the holding tank, an overflow valve causes the excess to be dumped into the sewer system. 
Assignment
The class will be named HoldingTank. The class attributes will consist of two int fields – current and maxCapacity. The fields must be private. The current field represents the current number of gallons of water in the tank. The maxCapacity field represents the maximum number of gallons of water that the tank can hold.
The class will contain the following methods:
Constructor – the constructor will initialize the two fields. If current is greater than maxCapacity, it will be set to maxCapacity.
Getters – there will be a getter for each field.
Setters – no setters will be defined for this class
void add(int volume) – add volume gallons to the tank. If the current volume exceeds maxCapacity, it will be set to maxCapacity.
void drain(int volume) – try to remove volume gallons from the tank. If resulting current volume is less than zero, set it to zero.
void print() – prints the current volume of the tank (in gallons)
Now create a Main class with a main method to test the HoldingTank class. Add the following code to the main method.
1)	Create an instance of HoldingTank, named tank with a maximum capacity of 1000 gallons and a current volume of 600 gallons.
2)	Print the current volume of the tank
3)	Add 300 gallons
4)	Drain 50 gallons
5)	Print the current volume of the tank
6)	Add 500 gallons
7)	Drain 250 gallons
8)	Print the current volume of the tank
9)	Drain 1200 gallons
10)	Add 200 gallons
11)	Drain 25 gallons
12)	Print the current volume of the tank 
Example Output
The tank volume is 600 gallons
The tank volume is 850 gallons
The tank volume is 750 gallons
The tank volume is 175 gallons
