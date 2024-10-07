public class string_test1 {
    public static void main(String[] args) {
        String str1 = ("abc"); 
        String str2 = ("abc");
        String str3 = new String("abc");
        boolean value;
        if (str1 == str2 && str1 == str3) {
           value = true;
           System.out.println(value);

        }
        else{
            value = false;
          System.out.println(value);
        }

    }
}
