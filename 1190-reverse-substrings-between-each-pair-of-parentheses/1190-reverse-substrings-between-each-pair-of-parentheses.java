class Solution {
    public String reverseParentheses(String s) {

        Stack<Character> stk = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == ')') {

                StringBuilder temp = new StringBuilder();

                while (stk.peek() != '(') {
                    temp.append(stk.pop());
                }

                stk.pop(); // remove '('

                for (char c : temp.toString().toCharArray()) {
                    stk.push(c);
                }

            } else {
                stk.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : stk) {
            ans.append(ch);
        }

        return ans.toString();
    }
}