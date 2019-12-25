public int countHi(String str) {
  
  int i,count=0;
  char[] a = str.toCharArray(); 
  int len=a.length;
  if(len==1)
  {
    count=0;
  }
  else
  {
  for(i=0;i<len;i++)
  {
    if(a[i]=='h')
    {
      if(a[i+1]=='i')
      {
      count++;
     }
    }
  }
  }
  return count;
}
