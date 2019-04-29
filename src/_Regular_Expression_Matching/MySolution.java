package _Regular_Expression_Matching;

public class MySolution {
    public static void main(String[] args) {
        System.out.println(isMatch("aab", "c*a*b"));
    }

    /**
     * wrong answer
     */
    public static boolean isMatch(String s, String p) {
        for (int i = 0, j = 0; j < p.length() && i < s.length();) { // j is index of p, i is index of s
            char p_c = p.charAt(j);
            switch (p_c) {
                case '.':
                    j++;
                    i++;
                    break;
                case '*':
                    System.out.println("*");
                    break;
                default:
                    if (s.charAt(i++) != p_c) {
                        if (j < p.length() - 1 && p.charAt(j + 1) == '*'){
                            j += 2;
                            continue;
                        }
                        return false;
                    }
                    j++;
                    break;
            }
        }
        return true;
    }
}
