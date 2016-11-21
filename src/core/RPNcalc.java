package core;

import java.util.Stack;

public class RPNcalc {

	public int Calculate(String expr) {
		// TODO Auto-generated method stub
		
		
		String []input = expr.split(",");
		Stack<String> mystack = new Stack<String>();
		int  n1,n2;
		int res;
		if (input.length != 0){
		for(int i=0;i<input.length;i++){
			switch(input[i]){
			
				case "+":
					n1 = Integer.valueOf(mystack.pop());
					n2 = Integer.valueOf(mystack.pop());
					res = n1 + n2;
					mystack.push(Integer.toString(res));
					break;
				case "-":
					n1 = Integer.valueOf((String) mystack.pop());
					n2 = Integer.valueOf((String) mystack.pop());
					res = n1 - n2;
					mystack.push(Integer.toString(res));
					break;
				case "*":
					n1 = Integer.valueOf((String) mystack.pop());
					n2 = Integer.valueOf((String) mystack.pop());
					res = n1 * n2;
					mystack.push(Integer.toString(res));
					break;
				case "/":
					n1 = Integer.valueOf((String) mystack.pop());
					n2 = Integer.valueOf((String) mystack.pop());
					res = n1 / n2;
					mystack.push(Integer.toString(res));
					break;
				case "%":
					n1 = Integer.valueOf((String) mystack.pop());
					n2 = Integer.valueOf((String) mystack.pop());
					res = n1 % n2;
					mystack.push(Integer.toString(res));
					break;
				default:
					mystack.push(input[i]);
			}
			
				
		}
		if (mystack.size() == 1){
			return Integer.valueOf((String) mystack.pop());
		}
		
		//return 0;
	}
		return 0;
	}
}
