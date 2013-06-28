
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;

/** Tutorial 1 creating a simple model
 */

public class Tutorial01 extends Object {
    // some definitions
    static String personURI    = "http://www.cinema.com.br";
    static String fullName     = "Rodrigo Costa";
    static String fullName2    = "Tiago Aurelio";
    
  public static void main (String args[]) {
		// create an empty model
        Model model = ModelFactory.createDefaultModel();

        // create the resource
        Resource johnSmith = model.createResource(personURI);

        //add the property
        //johnSmith.addProperty(VCARD.FN, fullName);
        johnSmith.addProperty(VCARD.FN, fullName);
        johnSmith.addProperty(VCARD.FN, fullName2);
        model.write(System.out);
      }
}
