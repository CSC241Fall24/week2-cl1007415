// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        // TODO: Implement the recursive function
         if(n < 3)
        {
            return n;
        }else if(n >= 3)
        {
            return fRecursive(n-1) + 2 * fRecursive(n-2) + 3 * fRecursive(n-3);
        }
        return 0;
    }

    public static int fIterative(int n) {
        // TODO: Implement the iterative function
        return 0;
    }
}
