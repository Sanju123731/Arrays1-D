class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int candies[]=new int[n];
        for(int i=0;i<n;i++)
        {
            candies[i]=1;
        }
        // / left pass-> right
        for(int i=1;i<n;i++)
          {
            if(ratings[i]>ratings[i-1])
            {
                candies[i]=Math.max(candies[i],candies[i-1]+1);
            }
          }
        //   right pass->left
            for(int i=n-2;i>=0;i--)
          {
            if(ratings[i]>ratings[i+1])
            {
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
          }
          int total=0;
          for(int c=0;c<candies.length;c++)
          {
            total+=candies[c];
          }
          return total;

    }
}