public class demo1 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <=2019; i++) {
            //将数字转为字符串
            String j=i+"";
            if(j.contains("2")||j.contains("0")||j.contains("1")||j.contains("9")){
                count+=i;
            }
        }
        System.out.println(count);
    }
}
