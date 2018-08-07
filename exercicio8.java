class exercicio8{
    static void main(String args[]){
        int x0, x1, x2;
        x0=0;
        x1=1;
        for(int i=0; i<14; i++){
           x2 = x0+x1;
           x0 = x1;
           x1 = x2;
           
           System.out.println(x2);
        }   
    }    
}
