package programmers;

public class Solution6 {


  public static void main(String[] args) {
    Solution7 sol = new Solution7();
    System.out.println(sol.solution(45)); 
  }



  //  public static void conversion(int number, int N) {
  //
  //  }
}


class Solution7 {
  public int solution(int n) {
    //    int answer = 0;
    //    String ans = "";
    //
    //    while (n > 0) {                       //3진법 공식
    //      ans = (n % 3) + ans;
    //      n /= 3;
    //    }
    //
    //    StringBuffer sb = new StringBuffer(ans);
    //    String reverse = sb.reverse().toString();
    //
    //    answer = Integer.parseInt(reverse, 3);


    int answer = 0;
    String ans = "";

    while (n > 0) {
      ans = ans + (n % 3);
      n /= 3;
    }

    answer = Integer.parseInt(ans, 3);


    return answer;
  }
}