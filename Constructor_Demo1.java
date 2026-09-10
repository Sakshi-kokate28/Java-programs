class Demo 
{
    public Demo()
    {
        System.out.println("Inside Default Constructor");
    }
    public Demo(int i, int j)
    {
        System.out.println("Inside Parameterized Constructor");
    }
}

class Constructor_Demo1
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();

        Demo dobj1 = new Demo();

    }
}