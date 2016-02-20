import org.apache.commons.math3.util.FastMath;

public class Bar {
	public static void main(String[] arg) {
		Bar f = new Bar();
		double tan = f.getTan();
		System.out.println("Foo: tan="+tan);
	}

	public double getTan() {
		return FastMath.tan(10);
	}
}
