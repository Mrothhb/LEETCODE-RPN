class Solution {
    public int evalRPN(String[] tokens) {
        ArrayList<String> stack = new ArrayList<String>();
        for(String token : tokens) {
            stack.add(token);
        }
        
        int val = 0;
        
        for(int i = 0; i < stack.size(); i ++){
            if(stack.get(i).equals("+")) {
                int ind = i;
                int ind1 = i-1;
                int ind2 = i-2;
                val = Integer.valueOf(stack.get(i-2)) + Integer.valueOf(stack.get(i-1));
                stack.set(ind, String.valueOf(val));
                stack.remove(ind1);
                stack.remove(ind2);
            
                i = 0;                
            }
            System.out.println(stack.size());
            if(stack.get(i).equals("*")) {
                int ind = i;
                int ind1 = i-1;
                int ind2 = i-2;
                val = Integer.valueOf(stack.get(i-2)) * Integer.valueOf(stack.get(i-1));
                stack.set(ind, String.valueOf(val));
                stack.remove(ind1);
                stack.remove(ind2);
                i = 0;               
            }
               if(stack.get(i).equals("/")) {
                int ind = i;
                int ind1 = i-1;
                int ind2 = i-2;
                val = Integer.valueOf(stack.get(i-2)) / Integer.valueOf(stack.get(i-1));
                stack.set(ind, String.valueOf(val));
                stack.remove(ind1);
                stack.remove(ind2);
                i = 0;               
            }
               if(stack.get(i).equals("-")) {
                int ind = i;
                int ind1 = i-1;
                int ind2 = i-2;
                val = Integer.valueOf(stack.get(i-2)) - Integer.valueOf(stack.get(i-1));
                stack.set(ind, String.valueOf(val));
                stack.remove(ind1);
                stack.remove(ind2);
                i = 0;               
            }
        }

        return val;
    }
}