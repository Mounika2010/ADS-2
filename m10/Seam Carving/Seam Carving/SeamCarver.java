
public class SeamCarver {
	// create a seam carver object based on the given picture
	Picture pic;

	private int width;

	private int height;

	int[][] energy;


	public SeamCarver(Picture picture) {
		this.pic = picture;
		this.width = pic.width();
		this.height = pic.height();


	}
	// current picture
	public Picture picture() {
		return pic;
	}
	// width of current picture
	public int width() {
		return width;
	}

	// height of current picture
	public int height() {
		return height;
	}

	// energy of pixel at column x and row y
	public double energy(int x, int y) {
		return 0;
	}

	// sequence of indices for horizontal seam
	public int[] findHorizontalSeam() {
		return new int[0];
	}

	// sequence of indices for vertical seam
	public int[] findVerticalSeam() {
		return new int[0];
	}

	// remove horizontal seam from current picture
	public void removeHorizontalSeam(int[] seam) {

	}

	// remove vertical seam from current picture
	public void removeVerticalSeam(int[] seam) {

	}
}