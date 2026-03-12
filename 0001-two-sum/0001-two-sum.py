class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hashMap={}
        for i in range(len(nums)):
            num=target-nums[i]
            if num in hashMap and hashMap[num]!=i:
                return [i,hashMap[num]]
            hashMap[nums[i]]=i