package patternprac;
//1
//01
//101
//0101
//10101

public class BTriangle {
    public static void main(String[] args)
        {
            int row =5;
            //inner loop for rows
            for (int i =1;i<=row;i++)
            {
                for (int j=1;j<=i;j++)
                {
                    if((i+j)%2==0)
                    {
                        System.out.print(1+" ");
                    }
                    else
                    {
                        System.out.print(0+" ");
                    }
                }
                System.out.println();
            }
    }

}
