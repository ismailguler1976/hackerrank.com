package hac.singleton;

class Singleton {
	private static Singleton single_instance = null;
	public String str;

	private Singleton() {
		str = "Hello I am a singleton! Let me say hello world to you";
	}

	public static Singleton getSingleInstance() {
		if (single_instance == null)
			single_instance = new Singleton();
		return single_instance;

	}
}

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
