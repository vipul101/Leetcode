class Solution {
  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
      for(int i=0;i<tokens.length;i++){
        if(!tokens[i].equals("+")  && !tokens[i].equals("-")  && !tokens[i].equals("*")  && !tokens[i].equals("/") ){
          stack.push(Integer.parseInt(tokens[i]));
        }else{
          int one = stack.pop();
          int two = stack.pop();
          switch(tokens[i]){
            case "+":
            stack.push(one+two);
            break;
            case "-":
            stack.push(two-one);
            break;
            case "*":
            stack.push(two*one);
            break;
            case "/":
            stack.push(two/one);
            break;
        }
      }
    }
    return stack.pop();
  }
}
