# student-grades-polymorphism
A program that finds a college student's average and final grades.

## Assignment
Write a program to find the average and final grade for a college student's course work.

## Constraints
- Student type can be either Grad or UnderGrad.
- Both student types can have any number of the following:
  - Assignments
  - Discussions
  - Midweek Assignments
- Grad students have one additional assignment - a Final Thesis.
- The final average for UnderGrad students is based on the following:
  - Assignments @ 65%
  - Discussions @ 25%
  - Midweek Assignments @ 10%
- The final average for Grad students is based on the following:
  - Assignments @ 40%
  - Discussions @ 15%
  - Midweek Assignments @ 15%
  - Final Thesis @ 30%
- Grades should be of type double.
- UnderGrad and Grad students can have one extra credit point for the IDEA Course Survey added to their final average.

## Requirements
- Request the first and last name of a student (separately).
- Request student type of either UnderGrad or Grad.
- Request the number of Assignments, Discussions, and Midweek Assignments.
- Enter grades for each category.
- Ask the student if they took the IDEA Survey.
- Use separate (external to the main class) subclasses.
- Subclasses should use constructors and initializers as well as set and get methods.
- UnderGrad and Grad student should be subclasses of a Student superclass.
- Final grade averages should output to two decimal places.
- Implement a loop to return and enter a new set of student grades (run the program again) if the user wishes to.

## Notes
- Student type subclasses (Grad & UnderGrad) will hold the differences between the student types.
- The Student superclass can do the averaging.
- Consider using boxed ArrayLists for holding the grades from the different grade categories.
