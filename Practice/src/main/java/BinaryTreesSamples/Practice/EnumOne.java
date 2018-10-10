package BinaryTreesSamples.Practice;

enum EnumOne
{
    ONE;
     
//    {
//        System.out.println("ONE");
//    }
     
    enum EnumTwo
    {
        TWO;
         
        {
            System.out.println("TWO");
        }
    }

    public static void main(String[] args)
    {
        System.out.println(EnumOne.EnumTwo.TWO);
    }
}
