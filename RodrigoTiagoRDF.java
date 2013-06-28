
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;


public class RodrigoTiagoRDF extends Object {
    
    // some definitions
    /*static String tutorialURI  = "http://hostname/rdf/tutorial/";
    static String briansName   = "Brian McBride";
    static String briansEmail1 = "brian_mcbride@hp.com";
    static String briansEmail2 = "brian_mcbride@hpl.hp.com";
    static String title        = "An Introduction to RDF and the Jena API";
    static String date         = "23/01/2001";*/
    
    public static void main (String args[]) {
    
        //definições
        String personURI1    = "http://www.rodrigo.com.br";
        String givenName    = "Rodrigo";
        String familyName   = "Costa";
        String fullName     = "Rodrigo Cunha da Costa";
        String email       = "costa.rodrigoc@gmail.com";

        String personURI2    = "http://www.thiago.com.br";
        String givenName2    = "Thiago";
        String familyName2   = "Aurélio";
        String fullName2     = givenName2 + " " + familyName2;
        String email2      	 = "thiago_aurelio18@hotmail.com";

        // cria um modelo vazio
        Model model = ModelFactory.createDefaultModel();

        // cria um resource
        //Resource completo = model.createResource(personURI);
        //completo.addProperty(VCARD.FN, fullName);
        //completo.addProperty(VCARD.N,

        /*Resource rodrigo = model.createResource(personURI1);
        rodrigo.addProperty(VCARD.FN, fullName);
        rodrigo.addProperty(VCARD.EMAIL, email);*/
        Resource rodrigo = model.createResource(personURI1);
        rodrigo.addProperty(VCARD.Given, givenName);
        rodrigo.addProperty(VCARD.Family, familyName);
        rodrigo.addProperty(VCARD.EMAIL, email);
        
        Resource thiago = model.createResource(personURI2);
        thiago.addProperty(VCARD.FN, fullName2);
        thiago.addProperty(VCARD.EMAIL, email2);

        //Resource completo = model.createResource(personURI);

        
        /*Resource johnSmith 
          = model.createResource(personURI)
                 .addProperty(VCARD.FN, fullName)
                 .addProperty(VCARD.N, 
                              model.createResource()
                                   .addProperty(VCARD.Given, givenName)
                                   .addProperty(VCARD.Family, familyName));
*/        
        // now write the model in XML form to a file
        model.write(System.out);
    }
}
