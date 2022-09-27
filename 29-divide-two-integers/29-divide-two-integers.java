class Solution {
    public int divide(int dividend, int divisor) {
        
//        int x = 0;
//         if(dividend>0 && divisor>0){
//              while(dividend >= divisor){
//             x++;
//             dividend = dividend- divisor;
//         }
        
//         }
        
//         if(dividend < 0 && divisor>0){
//             dividend = dividend*-1;
//             while(dividend > divisor){
//             x++;
//             dividend = dividend- divisor;
//             }
//             x =  x*(-1);
            
//         }
        
//         if(dividend>0 && divisor<0){
//             divisor = divisor*(-1);
//             while(dividend > divisor){
//             x++;
//             dividend = dividend- divisor;
//              }
//            x =  x*(-1);
//         }
//         if(dividend<0 && divisor<0){
//              while(dividend < divisor){
//             x++;
//             dividend = dividend-divisor;
//         }
        
//         }
       
//         return x;
        int p=dividend/divisor;
        if(dividend==-2147483648 && divisor==-1)
            return 2147483647;
        return p;
    }
}