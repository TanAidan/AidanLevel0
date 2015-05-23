import java.util.Random;


public class magic {
public static void main(String[] args) {
	int ran = new Random().nextInt(3);
	System.out.println(++ran);
	if(ran==1)
	{
		System.out.println("sure");
	}
	if(ran==2)
	{
		System.out.println("not in your lifetime");
	}
	if(ran==3)
	{
		
		System.out.println("if u think so");
	}
	}
}

