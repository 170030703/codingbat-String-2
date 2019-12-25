public boolean catDog(String str) {
  char c[]=str.toCharArray();
  int l=c.length;
  int i,count1=0,count2=0;
  for(i=0;i<l-2;i++)
  {
    if(c[i]=='c' && c[i+1]=='a' && c[i+2]=='t')
    {
      count1++;
      
    }
  }
  for(i=0;i<l-2;i++)
  {
    if(c[i]=='d' && c[i+1]=='o' && c[i+2]=='g')
    {
      count2++;
      
    }
  }
  if(count1==count2)
  {
    return true;
  }
  else
  {
    return false;
  }
}
