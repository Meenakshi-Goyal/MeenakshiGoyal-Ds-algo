class Divisor{
    public int divisor(int n){
        int sum=0;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                sum+=i;
                if(count>4)
                    return 0;
            }
        }
        if(count==4)
            return sum;
        else
            return 0;
    }
}
class Solution {
    public int sumFourDivisors(int[] nums) {
        int a = 0;
        Divisor dv = new Divisor();
        Map<Integer,Integer> dct = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(!dct.containsKey(i))
                dct.put(i,dv.divisor(nums[i]));
            a = a + dct.get(i).intValue();

        }
        return a;
    }
}
