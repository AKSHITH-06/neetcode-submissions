class Solution {
    public boolean isPalindrome(String s) {
        //String n=s.replace(" ","");
        StringBuilder st=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(Character.isLetterOrDigit(ch)){st.append(ch);}
        }
        String n=st.toString();

        String m=n.toLowerCase();
        int i=0;
        int j=m.length()-1;
        int dummy=0;
        while(i<j){
            if(m.charAt(i)==m.charAt(j)){i++;j--;}
            else {dummy=1;break;}
        }

        if(dummy==0){
            return true;
        }
        else{
            return false;
        }
    }
}
