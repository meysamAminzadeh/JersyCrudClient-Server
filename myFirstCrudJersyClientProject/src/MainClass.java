import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;
import org.json.simple.JSONObject;

import javax.ws.rs.core.UriBuilder;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
      // WebResource resource = client.resource("http://localhost:9999/myFirstCrudJersyProject/ws/person/insertPerson");

        Client client = Client.create();
      /*  WebResource resource = client.resource(UriBuilder
                .fromUri("http://localhost:9999/").build());

        List<PersonTO> personTOList = resource.path("ws/person/allPerson").accept("application/xml")
                .get(new GenericType<List<PersonTO>>(){});

        for(PersonTO psn : personTOList)
        {
            System.out.println(psn.getId());
            System.out.println(psn.getName());
            System.out.println(psn.getFamily());
        }
 */
       /* WebResource resource = client.resource(UriBuilder
                .fromUri("http://localhost:9999/").build());

        List<PersonTO> personTOList = resource.path("ws/person/allPersonJson").accept("application/json")
                .get(new GenericType<List<PersonTO>>(){});

        for(PersonTO psn : personTOList)
        {
            System.out.println(psn.getId());
            System.out.println(psn.getName());
            System.out.println(psn.getFamily());
        }*/


       /*WebResource resource = client.resource(UriBuilder.fromUri("http://localhost:9999/").build());

     PersonTO psn = resource.path("ws/person/personById").queryParam("id","2")
             .accept("application/json").get(PersonTO.class);

        System.out.println(psn.getId());
        System.out.println(psn.getName());
        System.out.println(psn.getFamily());*/

    /*   WebResource resource = client.resource(UriBuilder.fromUri("http://localhost:9999/").build());

     PersonTO psn = resource.path("ws/person/findById/2")
             .accept("application/json").get(PersonTO.class);

        System.out.println(psn.getId());
        System.out.println(psn.getName());
        System.out.println(psn.getFamily());
     */

      /*
        WebResource resource = client.resource(UriBuilder.fromUri("http://localhost:9999/").build());

        List<PersonTO> personTOList = resource.path("ws/person/personByNameFamily").queryParam("name","amir").
                queryParam("family","aghaei").accept("application/json").get(new GenericType<List<PersonTO>>(){});

        for(PersonTO psn : personTOList)
        {
            System.out.println(psn.getId());
            System.out.println(psn.getName());
            System.out.println(psn.getFamily());
        }
*/




/*
        WebResource resource = client.resource("http://localhost:9999/ws/person/insertPersonTo");


        PersonTO personTO = new PersonTO();
        personTO.setFamily("ALIREAL");
        personTO.setId(10);
        personTO.setName("akbar");

       ClientResponse response = resource.type("application/json").post(ClientResponse.class,personTO);
       System.out.println("output from server : "+response.getEntity(String.class));
*/


    /*    WebResource resource = client.resource("http://localhost:9999/ws/person/insertPerson");

        Form form = new Form();
        form.add("name","alireza");
        form.add("family","seifi");

        ClientResponse response = resource.type("application/json").post(ClientResponse.class,form);
        System.out.println("output from server : "+response.getEntity(String.class));
*/

    /*    WebResource resource = client.resource("http://localhost:9999/ws/person/UpdatePerson/0");


        PersonTO personTO = new PersonTO();
        personTO.setFamily("update");
        personTO.setId(0);
        personTO.setName("OK");

       ClientResponse response = resource.type("application/json").put(ClientResponse.class,personTO);
*/
        WebResource resource = client.resource("http://localhost:9999/ws/person/deletePerson/5");
        ClientResponse response = resource.type("application/json").delete(ClientResponse.class);







    }
}
