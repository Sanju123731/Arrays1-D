class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int currG=0;
        int totalGas=0;
        int totalCost=0;
        for(int i=0;i<gas.length;i++)
        {
            totalGas+=gas[i];
        }
         for(int i=0;i<cost.length;i++)
        {
            totalCost+=cost[i];
        }
        if(totalGas<totalCost) return -1;
        for(int i=0;i<gas.length;i++)
        {
        currG+=(gas[i]-cost[i]);
       if(currG<0)
       {
        start=i+1;
        currG=0;
       }
        }
        return start;
    }
}