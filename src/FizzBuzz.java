public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String str = "";
            if (i % 3 == 0) str += "Fizz";//If i is divisible by 3
            if (i % 5 == 0) str += "Buzz";//If i is divisible by 5
            if (!str.equals("")) System.out.println(str);
            else System.out.println(i);
        }
    }

}
