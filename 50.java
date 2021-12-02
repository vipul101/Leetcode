class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        
        long temp = n;
        if(temp<0) temp *= -1;
        while(temp >0){
            if(temp%2 == 1){
                result = result * x;
                temp -= 1; 
            }
            else{
                x=x*x;
                temp /=2;
            }
        }
        if(n<0) result = (double)(1.0)/(double)(result);
        return result;
    }
}
