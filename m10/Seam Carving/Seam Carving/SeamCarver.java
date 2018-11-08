import java.lang.IllegalArgumentException;
public class SeamCarver {
	// create a seam carver object based on the given picture
	private Picture pic;

	

	// int[][] energy;


	public SeamCarver(Picture picture) {
		this.pic = picture;
		// this.width = pic.width();
		// this.height = pic.height();
		 if (picture == null) {
		 	throw new IllegalArgumentException("picture is null");
		 }

	}

	// private void calculateEnergies() {
	// 	for (int i = 0; i < pic.width(); i++);
	// 		for (int j = 0; i < pic.height(); j++) {

	// 		}
	// }
	// current picture
	public Picture picture() {
		return pic;
	}
	// width of current picture
	public int width() {
		return pic.width();
	}

	// height of current picture
	public int height() {
		return pic.height();
	}

	// energy of pixel at column x and row y
	public double energy(int x, int y) {
		return 0;
		// if (x == 0 || y == 0 || pic.width() - 1 == x || pic.width() - 1 == y) {
		// 	return 1000.0;
		// }
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