public class ClassB

{

    private int data;

    public ClassB()

    {

        data = 5;

    }

    public int getData()

    {

        return this.data;

    }

}

class ClassA extends ClassB

{

    private int data;

    public ClassA()

    {

        data = 6;

    }

    public int getData()

    {

        return data;

    }

    public static void main(String[] args)

    {

        ClassA myData = new ClassA();

        System.out.println(myData.getData());

    }

}