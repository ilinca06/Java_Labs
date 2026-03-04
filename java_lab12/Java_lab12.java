/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_lab12;

/**
 *
 * @author PC
 */
public class Java_lab12 {

    public static void main(String[] args) {
        if(args.length < 2)
        {
            System.out.println("Not enough arguments!");
            System.exit(-1);
        }
        int n = Integer.parseInt(args[0]);
        String shape = args[1];
        
        Java_lab12 java_lab12=new Java_lab12();
        java_lab12.homework(n, shape);
    }
    void homework(int n, String shape)
    {
        long t1=System.currentTimeMillis();
        int[][] image= new int[n][n];
        int i, j;
        if(shape.equals("rectangle"))
        {
            for(i=0; i<n; i++)
            {
                for(j=0; j<n; j++)
                {
                    image[i][j]=255;
                }
            }
            for(i=n/4; i<n*3/4; i++)
            {
                for(j=n/4; j<n*3/4; j++)
                {
                    image[i][j]=0;
                }
            }
        }
        else
        {
            if(shape.equals("circle"))
            {
                int x, y, r;
                x=n/2;
                y=n/2;
                r=n/3;
                for(i=0; i<n; i++)
                {
                    for(j=0; j<n; j++)
                    {
                        if((i-x)*(i-x) + (j-y)*(j-y) <= r*r)
                        {
                            image[i][j]=255;
                        }
                    }
                }
            }
            else
            {
                System.out.println("Eroare, forma necunoscuta!");
                return;
            }
        }
        
        long t2=System.currentTimeMillis();
        System.out.println("Timp de rulare: " + (t2-t1) + " ms");
        
        if(n<=100)
        {
            MatriceEstetica(n, image);
        }
        else{
            System.out.println("Matricea este prea mare pentru a fi afisata pe ecran!");
        }
        
    }
    
    void MatriceEstetica(int n, int image[][])
    {
        StringBuilder sb = new StringBuilder();
        int i, j;
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if(image[i][j] == 0)
                {
                    sb.append("@@");  // \u2588\u2588
                }
                else
                {
                    sb.append("..");   // \u2591\u2591
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
