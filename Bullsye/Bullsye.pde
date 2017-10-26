
void setup(){
  
  size (1000,1000);
  
  for (int i=1000;i>10;i-=10){
    
    
  if (i%20==0){
 
      fill (#FFFFFF);
   
  } 
  
    
  else {
  
    fill (#FF0808);
  }
    ellipse (500,500,i,i);
 
  }
}