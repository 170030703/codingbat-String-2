public String repeatEnd(String str, int n) {
  char s[]=str.toCharArray();
  int l=s.length;
  char c[]=new char[n*n];
  int p=l-n;
  int k=p;
  
  
  for(int j=0;j<n*n;j++)
  {
    c[j]=s[p];
    p++;
    
    if(p==l)
    {
      p=k;
    }
    
    
    
  }
  String m=new String(c);
  return m;
}
