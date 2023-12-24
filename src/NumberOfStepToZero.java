/*
    Given an integer num, return the number of steps to reduce it to zero.
    In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
*/

public class NumberOfStepToZero {
    public static void main(String[] args) {
        System.out.println("Number of steps to zero from: " + 6 + " is: " + numberOfSteps(6));
        System.out.println("=========================");
        System.out.println("Number of steps to zero from: " + 8 + " is: " + numberOfSteps(8));
        System.out.println("=========================");
        System.out.println("Number of steps to zero from: " + 10 + " is: " + numberOfSteps(10));
    }

    private static int numberOfSteps(int num) {
        int steps = 0;

        while (num != 0) {
            num = (num % 2 == 0) ? num / 2 : num - 1;
            steps++;
        }
        return steps;
    }
}
