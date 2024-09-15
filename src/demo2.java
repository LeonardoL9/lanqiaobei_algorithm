public class demo2 {
    public static void main(String[] args) {
        int count=5;
        for(int i=10;i<10000;i++){
            int j=i*i*i;
            String st=j+"";
            if(st.endsWith(String.valueOf(i)))
                count++;

        }
        System.out.println(count);

    }
}
