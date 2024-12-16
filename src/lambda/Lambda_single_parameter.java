package lambda;

interface Say {
	public String say(String name);
}

public class Lambda_single_parameter {
	public static void main(String[] args) {
		Say s1 = (name) -> {
			return "Hello " + name;
		};
		System.out.println(s1.say("Sahil"));
	}
}
