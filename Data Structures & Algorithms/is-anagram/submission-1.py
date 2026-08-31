class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        count=0
        if (len(s)==len(t)):
            m=list(s)
            list.sort(m)
            n=list(t)
            list.sort(n)
            for i in range(len(m)):
                if(m[i]==n[i]):
                    count=count+1
            if(count==len(m)):
                return True
            else:
                return False
        else:
            return False