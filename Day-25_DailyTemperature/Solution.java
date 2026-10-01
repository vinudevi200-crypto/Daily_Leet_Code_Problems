class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int count=0;
        int answer[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[i]<temperatures[j]){
                    count=j-i;
                    answer[i]=count;
                    break;
                }
                else{
                    answer[i]=0;
                    }
            }
        }
        return answer;
    }
}
