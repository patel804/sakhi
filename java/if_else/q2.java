
class q2 {

    public static void main(String[] args) {
        int num1 = 78;
        int num2 = 67;
        int num3 = 34;

        int max;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }

        System.out.println("Maximum number is: " + max);
    }
}
