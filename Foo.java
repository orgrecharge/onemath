import org.apache.commons.math3.util.FastMath;

public class Foo {
	public static void main(String[] arg) {
		Foo f = new Foo();
		double tan = f.getTan();
		System.out.println("Foo: tan="+tan);
	}

	public double getTan() {
		return FastMath.tan(10);
	}
}
