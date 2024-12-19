package com.example.demo.commom;

import java.util.Scanner;
// 第十五届蓝桥杯第四题
public class lanqiaobei_lp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(),res=0;
        while(n-->0){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            int x=sc.nextInt(),y=sc.nextInt();
            if(b>1&&y>0){
                int t=Math.min(b/2,y);
                res+=6*t;
                y-=t;
                b-=t*2;
            }

            if(a>0&&y>0){
                int t=Math.min(a,y);
                res+=t*2;
                a-=t;
                y-=t;
                x+=t;
            }

            if(a>1&&x>0){
                int t=Math.min(a/2,x);
                res+=t*4;
                x-=t;
                a-=t*2;
            }
            int count=x+y;
            if(c>0&&count>0){
                int t=Math.min(c,count);
                res+=t*4;
                count-=t;
            }
            if(b>0&&count>0){
                int t=Math.min(b,count);
                res+=t*3;
                count-=t;
            }
            if(a>0&&count>0){
                int t=Math.min(a,count);
                res+=t*2;
                count-=t;
            }
            System.out.println(res);
        }


    }
}
