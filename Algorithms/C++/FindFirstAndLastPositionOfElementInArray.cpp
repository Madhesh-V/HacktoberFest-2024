class Solution{
public:
    vector<int> searchRange(vector<int> &nums, int target)
    {
        int maxi, mini;
        if (binary_search(nums.begin(), nums.end(), target))
        {
            mini = lower_bound(nums.begin(), nums.end(), target) - nums.begin();
            maxi = upper_bound(nums.begin(), nums.end(), target) - (++nums.begin());
        }
        else
        {
            maxi = -1;
            mini = -1;
        }
        return {mini, maxi};
    }
};