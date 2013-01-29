//david lafreniere, samuel forcier
public class chiffre extends carreV implements inter{
public chiffre()
{
}
public String decrypte(String mot, String cle)
{
	int decalage=0;
	int colonne=0;
	int i;
	int j;
	String bcle= cle;
	String resultat="";
	
	while (bcle.length() < mot.length())
	{
		bcle += cle;
	}
	for(i=0; i< mot.length();i++)
	{
	for(j =0; j<26;j++)
	{
		if(bcle.charAt(i)==carreV[0].charAt(j))
			{
				decalage =j;
			}	
	}
	for(int k=0;k<26;k++)
		{
			if(mot.charAt(i)==carreV[decalage].charAt(k))
			{
				colonne =k;
			}
		}
		
		resultat+=carreV[0].charAt(colonne);
	}
	return resultat;
}

public String encrypte(String mot, String cle)
{
	int decalage=0;
	int colonne=0;
	int i;
	String bcle= cle;
	String resultat="";
	
	while (bcle.length() < mot.length())
	{
		bcle += cle;
	}
	
	for(i = 0;i<mot.length(); i++)
	{
		for(int j=0;j<26;j++)
		{
			if(bcle.charAt(i)==carreV[0].charAt(j))
			{
				decalage = j;
			}
		}
		for(int k=0;k<26;k++)
		{
			if(mot.charAt(i)==carreV[0].charAt(k))
			{
				colonne =k;
			}
		}
		
		resultat+=carreV[decalage].charAt(colonne);
	}
	return resultat;
}
}

//carreV[11].charAt(position);
//carreV[0].charAt(i)=message.charAt(j);
//position = j;
