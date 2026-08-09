import java.util.Scanner;

public class Leedcode704 {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {-1, 0, 3, 5, 9, 12};

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = search(nums, target);

        System.out.println("Target index: " + result);

        sc.close();
    }
}
