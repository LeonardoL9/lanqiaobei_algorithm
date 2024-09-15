import java.util.Arrays;

public class ArrayOutput {
    public static void main(String[] args) {
        int[] array = {0, 1};

        // 使用 Arrays.stream() + String.join() 实现输出 [0,1]
        String result = "[" + String.join(",",
                Arrays.stream(array)
                        .mapToObj(String::valueOf)
                        .toArray(String[]::new)) + "]";

        System.out.println(result);
    }
}
