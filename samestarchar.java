public boolean sameStarChar(String str) {
  int l=str.length();
  int i,z=0,k=0;
  
  for(i=1;i<str.length()-1;i++)
  {
    if(str.charAt(i)=='*')
    {
      k++;
      if(str.charAt(i-1)==str.charAt(i+1))
       z++;
       else
       z--;
       
      
    }
  }
  if(z==k)
  return true;
  else 
  return false;
}
