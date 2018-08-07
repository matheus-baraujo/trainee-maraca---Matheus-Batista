Class exercicio4{
    static void main(String args[]){
        for(int n=1; n<10; n++){
          for(int k=1; k<10; k++){
             if(n*k > k*k){
                System.out.println();
                break;
             }   
             else{
                System.out.print(n*k);
                System.out.print(" ");
             }   
          }   
        }     
    }
}    
