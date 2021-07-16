package string.anagram;
public class Anagram {
    String A,B;
    Anagram(String A,String B){
        this.A=A;
        this.B=B;
    }
    void checkAnagram(){
        char[] C=A.toCharArray();
        char[] D= B.toCharArray();
        int count=0, count1=0;
        int len=C.length, len1=D.length;
        for (int i=0;i<C.length;i++){
            if (C[i]==' ') len--;
            if(C[i]!=' '){
                for (int j=0;j<D.length;j++){
                    if (C[i]==D[j]){
                        D[j]='*';
                        count++;
                        break;
                    }
                }
            }
        }
        for (int i=0;i<len1;i++){
            if(D[i]==' ' || D[i]=='*') count1++;
        }
        if (count==len && count1==len1) System.out.println("true");
        else System.out.println("false");
    }
}
