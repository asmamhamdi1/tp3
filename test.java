public class test {
    public static void main(String[] args) {
       adresse adr;
       adr=new Adresse();
        adr.ville="kasserine";
        adr.gouvernorat="kasserine";
        adr.codpostal=1200;
        adr.afficher();
        adr.modifier(1987);
        adr.afficher();
        adresse adr2=new Adresse(9100,"sidibouzid","bouzid");
        adr2.afficher();
        adr2.modifier(10100);
        adr2.afficher();
        chercheur C1=new chercheur();
        C1.nom="bilel";
        C1.poste="ingenieur";
        chercheur C2=new chercheur("asma","ingenieur",15);
        C2.afficher();
        System.out.println("nombre de chercheur "+C1.nbc);
        C2.comparer(C1);
        C2.modifier(5468466);
        C1.modifier(777777);
        chercheur C3=new chercheur();
        C3.ajouter("bilel","etudiant",520);
        C3.afficher();
        System.out.println("nombre de chercheur "+C3.nbc);
        chercheur CT[]={C1,C2,C3};
        bureau b1=new bureau(111,"bur1",CT);
        bureau b2=new bureau(121,"bur1",CT);
        bureau bt[]={b1,b2};
        laboratoire l=new laboratoire("lab1","spc1",adr,bt);
        System.out.println(l);
        l.afficher(;)
    }
}