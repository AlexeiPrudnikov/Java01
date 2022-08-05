public class Main {
    public static void main(String[] args) {
    }

    // Задача № 1
    // https://leetcode.com/problems/duplicate-zeros/
    public static void duplicateZeros(int[] arr) {
        int[] temp = arr.clone();
        int arrIndex = 0;
        int i = 0;
        while (arrIndex < arr.length) {
            if (temp[i] == 0) {
                arr[arrIndex] = 0;
                arrIndex++;
                if (arrIndex < arr.length) arr[arrIndex] = 0;
            } else {
                arr[arrIndex] = temp[i];
            }
            arrIndex++;
            i++;
        }
    }

    // Задача № 2
    // https://leetcode.com/problems/remove-element/
    public static int removeElement(int[] nums, int val) {
        int result = 0;
        int leftPoint = 0;
        int rightPoint = nums.length - 1;
        int temp = 0;
        while (leftPoint <= rightPoint) {
            if (nums[leftPoint] == val) {
                if (nums[rightPoint] == val) {
                    rightPoint--;
                } else {
                    temp = nums[leftPoint];
                    nums[leftPoint] = nums[rightPoint];
                    nums[rightPoint] = temp;
                }
            } else {
                leftPoint++;
            }
        }
        return leftPoint;
    }

    // Задача № 3
    // https://leetcode.com/problems/reverse-words-in-a-string/
    public static String reverseWords(String s) {
        String result = s.trim();
        String[] words = result.split(" ");
        int countEmpty = 0;
        for (String i : words) {
            if (i == "") countEmpty++;
        }
        String[] resultWords = new String[words.length - countEmpty];
        int index = 0;
        for (String word : words) {
            if (word != "") {
                resultWords[index] = word;
                index++;
            }
        }
        String temp = "";
        int resultLen = resultWords.length;
        for (int i = 0; i < resultLen / 2; i++) {
            temp = resultWords[i];
            resultWords[i] = resultWords[resultLen - i - 1];
            resultWords[resultLen - i - 1] = temp;
        }
        result = String.join(" ", resultWords);
        return result;
    }
}