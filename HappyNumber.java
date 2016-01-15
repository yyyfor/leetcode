public class Solution {
    public boolean isHappy(int n) {
        if ( n ==1) return true;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        while(!map.containsKey(n))
        {
            int n2 = n;
            int result = 0;
            while(n!=0)
            {
                int n3 = n%10;
                result += n3*n3;
                n/=10;
            }
            if(result ==1) return true;
            else
            {
            map.put(n2,0);
            n = result;
            }
        }
        return false;
    }
}