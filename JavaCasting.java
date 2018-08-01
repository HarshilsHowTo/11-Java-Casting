public class JavaCasting {

    public static void main(String[] args) {

//        int num = 4;
//        System.out.println(num);
//
//        double castToDouble = (double) num;
//        System.out.println(castToDouble);
//
//        double newNum = 4.8;
//        System.out.println(newNum);
//
//        int castToInt = (int) newNum;
//        System.out.println(castToInt);
//
//        int tortoiseAge = 146;
//        byte convertToByte = (byte) tortoiseAge;
//        System.out.println(convertToByte);

        int num1 = 2;
        double num2 = 2.4;
        System.out.println(num1 + num2);
        
        String test = String.valueOf(num1);
        double backToInt = Double.valueOf(test);
        System.out.println(backToInt);



    }
}
