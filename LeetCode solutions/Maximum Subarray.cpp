class Solution {
public:
    int maxSubArray(vector<int>& nums) {
       int n = nums.size();
       int max = INT_MIN;
       int curr = 0;

       for (int i = 0; i <= n - 1; i++) {
          curr += nums[i];

       if (curr > max) {
          max = curr;
    }

       if (curr < 0) {
          curr = 0;
    }
  }
    return max; 
    }       
};
