import java.util.*;
class Q3_1 {
	int [] array = new int [30];
	public static void main() {
		int s1 = -1, s2 = 9, s3 = 19;
		s1 = push(3, s1);
		s1 = push(4, s1);
		pushS2(5);
		pushS3(7);
		pushS3(2);
		popS1();
		popS2();
		popS3();
		outputS1();
		outputS2();
		outputS3();
	}
	public static int pushS1(int num, int top) {
		array[++top] = num;
		return top;
	}
	public static int pop(int top, int height) {
		if (height == 0) return null;
		array[top--] = num;
	}
}
