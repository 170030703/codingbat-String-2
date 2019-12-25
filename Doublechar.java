public String doubleChar(String str) {
  char s[]=str.toCharArray();
  int l=s.length;
  char c[]=new char[l*2];
  
  int i=0;
  for(int j=0;j<l;j++)
  {
    c[i]=s[j];
    c[i+1]=s[j];
    i=i+2;
  }
  String m=new String(c);
  return m;
  
}
