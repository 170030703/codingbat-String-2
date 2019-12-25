public int countCode(String str) {
  char a[]=str.toCharArray();
  int l=a.length;
  int i,count=0;
  if(l==1)
  {
    count=0;
  }
  else
  {
  for(i=0;i<l-3;i++)
  {
    if(a[i]=='c' && a[i+1]=='o' && (a[i+2]>='a' && a[i+2]<='z') && a[i+3]=='e')
    {
      count++;
    }
  }
  }
  return count;
}
