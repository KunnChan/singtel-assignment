package min.challenge.singtel;

import min.challenge.singtel.model.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
class SingtelchallengeApplicationTests {

	@Test
	void contextLoads() {

		List<Animal> animals = Arrays.asList(
				new Butterfly(),
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Dog(),
				new Cat());

		int flyCount = 0, walkCount = 0, singCount = 0, swimCount = 0;
		for (Animal animal : animals) {
			if (animal.canFly()) flyCount++;
			if (animal.canWalk()) walkCount++;
			if (animal.canSing()) singCount++;
			if (animal.canSwim()) swimCount++;
		}

		assertEquals(4, flyCount);
		assertEquals(8, walkCount);
		assertEquals(7, singCount);
		assertEquals(5, swimCount);


	}

}
