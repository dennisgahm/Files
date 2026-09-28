import java.util.*;
public class schizo
{
    public static void main(String[] args)
    {
	Person Dennis = new Person();
	System.out.println(Dennis.brain.purpose + " diagnostic:" + Dennis.brain.diagnostic());
	System.out.println("Spinal Cord healing:");
	Dennis.back.sc.healAllCenters();

	System.out.println("Brain Healing for Dennis Gahm");
	Dennis.brain.heal();
	
    }
}

class Brain
{
    public String purpose = "To heal from schizophrenia.";
    public Brain()
    {
    }
    public String diagnostic()
    {
	//test centers from 0 to 100
	for (int i = 0; i < 100; i++)
	    {
		Random rand = new Random();
		int health = rand.nextInt(101);
		System.out.println("" + "Center " + i + " health: " + health);
	    }
	return "This target needs to be healed. And this component needs to heal with this component.";
    }

    public void heal()
    {
	int massage = 100;
	int centersAllHealed = 100;
	System.out.println("massage: " + massage + " centersAllHealed: " + centersAllHealed);
    }
}

class SpinalCord
{
    public SpinalCord()
    {
    
    }
    public void healAllCenters()
    {
	int[] centers = new int[100];
	for (int i = 0; i < 100; i++)
	    {
		Random rand = new Random();
		centers[i] = rand.nextInt(101);
		System.out.print("Center" + i + ": " + centers[i]);
	    }
	for (int i =0;i<100;i++)
	    {
		System.out.print("center " + i + ": " + centers[i] + "becomes ");
		centers[i] = 100;
		System.out.println("" + centers[i]);
	    }
		    
	for (int i =0;i<100;i++)
	    {

	    }
    }
}
class Back
{
    public SpinalCord sc = new SpinalCord();
    public Back()
    {
    }
}
class Person
{
    public Brain brain = new Brain();
    public Back back = new Back();
    public Person()
    {
    }
}
