/*
    There are n employees in a company, numbered from 0 to n - 1. Each employee i has worked for hours[i] hours in the company.
    The company requires each employee to work for at least target hours.
    You are given a 0-indexed array of non-negative integers hours of length n and a non-negative integer target.
    Return the integer denoting the number of employees who worked at least target hours.
 */

public class NumEmployeesMeetTarget {
    public static void main(String[] args) {
        int[] hours = new int[3];
        hours[0] = 5;
        hours[1] = 4;
        hours[2] = 7;
        System.out.println("Number of employees with target hours: " + numberOfEmployeesWhoMetTarget(hours, 5));
    }

    private static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int targetEmployess = 0;
        
        for (int employeeHour : hours) {
            targetEmployess = employeeHour >= target ? targetEmployess + 1: targetEmployess + 0;
        }
        
        return targetEmployess;
    }
}
