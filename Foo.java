public class Foo {
	public static void main(String[] arg) {
		Foo f = new Foo();
		int length = f.getPositive();
		System.out.println("Foo: length="+length);	
	}
	
	public int getPositive() {
		return 10;
	}
}
