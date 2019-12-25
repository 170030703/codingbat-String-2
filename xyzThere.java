public boolean xyzThere(String str) {
  char s[]=str.toCharArray();
  int l=s.length;
  int i;
  int c=str.indexOf('x');
  for(i=0;i<l-2;i++)
  {
    if(c==0)
    {
      if(s[i]=='x' && s[i+1]=='y' && s[i+2]=='z')
    {
      return true;
      
    }
    }
      
    
    else if(s[i]=='x' && s[i+1]=='y' && s[i+2]=='z' && s[i-1]!='.')
    {
      return true;
      
    }
  }
  return false;
  
}
