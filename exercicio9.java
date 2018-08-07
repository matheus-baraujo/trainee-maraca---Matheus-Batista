class exercicio9{
    static long fib(int n){
      if(n<2){
        return n;
      }else{
        return fib(n-1) + fib(n-2);
       }  
    }

    static void main(String args[]){
        for(int i= 0; i<14; i++){
            System.out.print(fib(i) + " ");
         }   
    }        
