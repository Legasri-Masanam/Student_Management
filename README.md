#  Student Management Console Application

A simple Java-based console application for managing student records.
This project is designed using core **Object-Oriented Programming (OOP)** concepts and adheres to **SOLID principles**, making it modular, maintainable, and extensible.

---

## Features

- ✅ Add a new student  
- ✅ View all students  
- ✅ Search for a student by roll number  
- ✅ Delete a student  
- ✅ Update student details (name, age, grade, marks)  
- ✅ Display the class topper  
- ✅ Exit the application  


## OBJECT-ORIENTED PROGRAMMING (OOP) CONCEPTS USED:

OOP Concept	How It’s Applied

-Encapsulation	Each class (Student, StudentServicesIMPL) hides its data and exposes only necessary methods. Fields in Student are private.

-Abstraction	StudentServices interface abstracts the operations that can be done to a student.

-Inheritance	While not class inheritance, StudentServicesIMPL implements an interface (a form of inheritance).

-Polymorphism	You are using the interface type StudentServices in the console class. This allows flexibility to swap implementation if needed.

## SOLID PRINCIPLES IN ACTION:

Principle	Where It’s Applied
S - Single Responsibility	Each class has a single job: Student represents data, StudentServicesIMPL handles logic, StudentConsoleApp handles UI.

O - Open/Closed	Your StudentServices interface allows for extension (new implementations) without modifying existing code.

L - Liskov Substitution	You can substitute StudentServicesIMPL wherever StudentServices is expected.

I - Interface Segregation	You're using a focused interface (StudentServices) with only relevant methods.

D - Dependency Inversion	Your console depends on StudentServices (an abstraction), not a concrete implementation (StudentServicesIMPL), e.g., StudentServices studentServices = new StudentServicesIMPL();.

## How to Run

1. Clone this repository or download the source code.
2. Compile all `.java` files:
   ```bash
   javac *.java
