package SQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
Crate following Employee, Address and Department tables in HSQL

One department can have many employees, one employee can have many addresses, multiple employees can live in one address (many to many)

Write a program to add, update, delete on these tables

Write a program to read all the data and print a pretty report in the hierarchy of department, employee and address

Read, only the employees which belong to department id ex 21 and live at address with zip code 20171
 */

/*
CREATE TABLE Employee(
ID varchar(100),
Name varchar(1000),
Department varchar(1000)
);

CREATE TABLE EmployeeAddress(
EmployeeID varchar(100),
AddressID varchar(1000)
);

CREATE TABLE Address(
Street VARCHAR(1000),
Unit VARCHAR(1000),
City VARCHAR(1000),
State VARCHAR(1000),
Zipcode INT
);
 */

public class HSQLDBExample {
public static void main(String[] args){
    Connection con = HSQLDBConnection.getConnection();
    try {

        /*
        ADD
         */

        PreparedStatement insert = con.prepareStatement(
                "INSERT INTO PUBLIC.EMPLOYEE(ID, Name , Department) " +
                        "VALUES ('E3', 'Anand Prabhu', 'Technology');"
        );
        insert.executeUpdate();

        PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM PUBLIC.EMPLOYEE;"
        );
        System.out.println(ps.executeQuery());

        /*
        UPDATE
         */

       /*
        DELETE
         */


    } catch(SQLException e) {
        e.printStackTrace();

    }

}
}