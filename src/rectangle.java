public class Rectangle {
	public init length;
	public init width;
	public Rectangle (init length , init width) {

		this.length = length;
		this.width = width;
	}
	
	public init getArea() {
	
		return length * width;
	}

	public init getPerimeter () {
	
		return 2 * (length + width);
	}
}
