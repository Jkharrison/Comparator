import java.util.Comparator;
import java.util.TreeSet;
class PersonComparator implements Comparator<Person>
{
    public int compare(Person a, Person b)
    {
        // Simply Sorting by weight.
        if(a.weight < b.weight)
        {
            return -1;
        }
        else if(a.weight > b.weight)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
class Person
{
    int height;
    int weight;
    String name;
    Person()
    {
        this.height = 0;
        this.weight = 0;
        this.name = "";
    }
    Person(int a, int b, String str)
    {
        this.height = a;
        this.weight = b;
        this.name = str;
    }
    public String toString()
    {
        // System.out.println(this.name);
        String ret = this.name;
        ret += " Height: " + this.height;
        ret += ", Weight: " + this.weight + "|";
        return ret;
    }
}
class Main
{
    public static void main(String[] args)
    {
        PersonComparator comp = new PersonComparator();
        Person one = new Person(50, 100, "Person 1");
        Person two = new Person(100, 50, "Person 2"); // Should be first
        Person three = new Person(90, 90, "Person 3");
        Person four = new Person(40, 40, "Person 4");
        TreeSet<Person> ts = new TreeSet<Person>(comp);
        ts.add(one);
        ts.add(two);
        ts.add(three);
        ts.add(four);
        System.out.println(ts);
    }
}
