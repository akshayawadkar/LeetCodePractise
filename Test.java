public class Test {

    public static void main(String[] args) {

        String str = "amazing";

        int split = 3;

        for(int i = 0; i < str.length() - split; i = i + split){
            System.out.println(str.substring(i, i+ split));
        }


    }
}
