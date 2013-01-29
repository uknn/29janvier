//david lafreniere, samuel forcier
public class testeChiffre {

    public testeChiffre() {
    }
    public static void main(String[] args)
    {
    	chiffre E = new chiffre();
    	String b = "salutgogo";
    	System.out.println("mot a encrypter: "+b);
    	
    	String a=E.encrypte(b,"sa");
    	System.out.println("mot encrypter: "+a);
    	
    	chiffre D = new chiffre();
    	System.out.println("mot decrypter: "+D.decrypte(a,"sa"));
    }
    
}