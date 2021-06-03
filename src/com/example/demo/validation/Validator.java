package com.example.demo.validation;

public class Validator {
public boolean validPrix(float prix)
{
return 	prix>100;

}
public boolean validDescription(String description)
{
return description.length()>10;	
}
public boolean validContenuDescription(String description)
{
return description.trim().contains(" ");

}
public boolean testNotBlank(String valeur)
{
return !valeur.isEmpty();	
}
public boolean testLonguer(String chaine)
{
return chaine.length() >5;	
}
public boolean testDuree(int duree)
{
return duree>2 && duree<100;	
}
}
