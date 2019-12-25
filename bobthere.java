public boolean bobThere(String str) {
  char c[]=str.toCharArray();
  int l=c.length;
  int i;
  if(l==1)
  {
    return false;
  }
  else
  {
  for(i=0;i<l-2;i++)
  {
    if(c[i]=='b' && (c[i+1]>='a' && c[i+1]<='z' || c[i+1]>='0' && c[i+1]<='9') && c[i+2]=='b')
    {
      return true;
      
    }
  }
  }
  return false;
}
