import java.util.*;

public class Java
{
    public static void main(String[] args)
    {
	//sample problem
	interval i1 = new interval(0, 10);
	interval i2 = new interval(10,13);
	interval i3 = new interval(13,19);
	job j1 = new job(10, 3);
	job j2 = new job(3, 10);
	ArrayList<job> jobs = new ArrayList<job>();
	jobs.add(j1);
	jobs.add(j2);
	    
	for (int i=0;i<100;i++){
	    Random rand = new Random();
	    jobs.add(new job(rand.nextInt(10), rand.nextInt(10)));
	    System.out.println(jobs.get(i).times + " " + jobs.get(i).length);
	}
	
	
    }
}

class job
{
    public int times;
    public int length;
    public job(int t, int l)
    {
	times = t;
	length = l;
    }
}
class interval
{
    int start;
    int end;

    public interval(int s, int e)
    {
	start =s;
	end =e;
    }
}
