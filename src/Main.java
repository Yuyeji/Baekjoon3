import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());   // 두 줄 읽기!!!!
        int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken());

        /*
        for(int i = 0 ; i < N ; i++){
            int num = Integer.parseInt(st2.nextToken());   // 두번째 줄에서 잘라옴
            if(num < X)
                System.out.print(num+" ");
        }
        */

        //StringBuilder 사용
        StringBuilder builder = new StringBuilder();

        for(int i=0 ; i<N ; i++){
            int num = Integer.parseInt(st2.nextToken());
            if(num < X)
                builder.append(num).append(" ");
        }
        System.out.println(builder);
    }
}
