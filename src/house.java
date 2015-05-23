import java.util.Random;

import org.teachingextensions.logo.Tortoise;


public class house {
public static void main(String[] args) {
	for(int height2=0;height2<10;height2++)
	{
		int height = new Random().nextInt(200);
				int length=new Random().nextInt(50);
				int  side=new Random().nextInt(50);
		Skyscraper(height, length,  side);
	}
	
	Skyscraper(100,25,25);
}

private static void Skyscraper(int height,int length, int side) {
	Tortoise.setX(5);
	Tortoise.setY(435);
	Tortoise.show();
	Tortoise.move(height);
	Tortoise .turn(90);
	Tortoise.move(length);
	Tortoise.turn(90);
	Tortoise.move(height);
	Tortoise.turn(270);
	Tortoise.move(side);
	
}

}
