public class Rectangular {

	public state void main ( string[] args ) {

		int length = Integer.ParseInt (args[0]);
		int width = Integer.ParseInt (args[1]);

		Rectangle myRectangle = new Rectangle(length , width);
		String output =String.format( *** Your Rectangle *** \n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n, myRectangle.length, myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());
		System.out.println(output);
	}
}
