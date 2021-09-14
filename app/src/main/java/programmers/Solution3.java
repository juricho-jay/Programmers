package programmers;

import java.util.Arrays;

public class Solution3 {

  static int[] arr = {1,3,2,5,4};



  public static void main(String[] args) {
    Solution5 sol = new Solution5();

    System.out.println(sol.solution(arr, 9));
  }
}

class Solution4 {
  public int solution(int[] d, int budget) {
    int answer = 0;

    int total = 0;

    Arrays.sort(d);

    for (int i = 0; i < d.length; i++) {
      total += d[i];
      if (total < budget) {
        answer++;
      } else if (total == budget) {
        answer++;
        break;
      } else {
        break;
      }
    }
    return answer;
  }
}

class Solution5 {
  public int solution(int[] d, int budget) {
    int answer = 0;
    Arrays.sort(d);

    for (int i = 0; i < d.length; i++) {
      budget -= d[i];

      if (budget < 0) break;

      answer++;

    }
    return answer;
  }
}




