import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] value = {3,4};
        changeValue(value);
        System.out.println(Arrays.toString(value));

    }
    public static Integer[] changeValue(Integer[] value) {
        value = new Integer[]{99, 2};
        return value;
    }
}