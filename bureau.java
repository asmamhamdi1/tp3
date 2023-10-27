public class bureau {
    public int code;
    public String nom1;
    public chercheur C[];

    public bureau(){
    }
    public bureau(int code,String nom,chercheur C[]){
         this.code=c;
         this.nom1=nom;
         this.C=new chercheur[5];
         this.C=C;
         
         }
        public void affiche()
        {
             System.out.println(" code= " +code+ "nom = "+nom);
             int i;
             int n=this.C.length;
             for(i=0; i<n; i++){

                 this.C[i].affichcher();

             }
         }
         public String toString(){
            String result="code: "+code+"nom: "+nom;
            int i;
            int n=this.C.length;
            for(i=0; i<n; i++){
                result+=this.C[i].toString();
        
            }
            return result;
         }
}