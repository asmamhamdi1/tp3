 public class Adress {

        public String gouvernorat;
        public String ville;
        public int codepostal;

        public Adress(String gouvernorat, String ville, int codepostal) {
            this.gouvernorat = gouvernorat;
            this.ville = ville;
            this.codepostal = codepostal;
        }

        public Adress() {
        }
        public void Afficher(){
            System.out.println("gouvernorat:"+gouvernorat+"ville"+ ville+"codepostal"+codepostal);
        }

    }