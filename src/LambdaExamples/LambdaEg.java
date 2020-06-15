package LambdaExamples;

/*
Create functional interfaces for at least 5 business scenario

Write lambda programs for these functional interfaces

Write multi-threading using Lambda and Java 8 based threading programs

Perform list, map and file operations using lambda and stream

Create a list of employees from the file, put each employee list in a map where key is department id

Write map into a file where key is department id

write filters to shorten list, write map to put changed value of employee, like bonus

Run the sequential and parallel stream on a large number of employees like 100K

Write Date and Time using new java 8 APIs, create a from date, to date, and timestamp functionality that also compares dates and provides multiple date operations
 */

public class LambdaEg {
}

@FunctionalInterface
interface StatisticalOperation {
    public double operate(int a, int b, int c);
}

@FunctionalInterface
interface HelloMessage{
    public double message(String name);
}



