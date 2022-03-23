/**
 * BJ 1085 직사각형에서 탈출
 * @ prob : https://www.acmicpc.net/problem/1085
 * @ level : B3
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1085_직사각형에서탈출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;
        min = Math.min(min, x);
        min = Math.min(min, y);
        min = Math.min(min, w - x);
        min = Math.min(min, h - y);

        System.out.println(min);

        br.close();
    }
}
