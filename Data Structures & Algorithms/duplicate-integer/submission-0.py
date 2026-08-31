class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        n=len(nums)
        sets=set(nums)
        m=len(sets)

        if n==m:
            return False
        else:
            return True
        