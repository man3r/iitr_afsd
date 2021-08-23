package iitr_afsd;

//Test comments
// Added under b1
class First

{

    int i;

}

class Second extends First

{

    int j;

    void display()

    {

        super.i = j + 1;

        System.out.println(j + " " + i);

    }

}

public class Test {

    public static void main(String args[])

    {

        Second obj = new Second();

        obj.i = 1;

        obj.j = 2;

        obj.display();

    }

}
