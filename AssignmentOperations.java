public class AssignmentOperators {
    public static void main(String[] args) {
        int num = 10;  // initial value

        System.out.println("Initial value: " + num);

        // Using += operator
        num += 5;  // same as num = num + 5
        System.out.println("After += 5, value = " + num);

        // Using -= operator
        num -= 3;  // same as num = num - 3
        System.out.println("After -= 3, value = " + num);

        // Using *= operator
        num *= 2;  // same as num = num * 2
        System.out.println("After *= 2, value = " + num);
    }
}