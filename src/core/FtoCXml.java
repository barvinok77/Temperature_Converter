package core;

import java.text.DecimalFormat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/temp/xml/f=>c")
public class FtoCXml {
       @GET
       @Path("{input}")
       @Produces("application/xml")
       public String convertCtoFfromInput(@PathParam("input") Double input) {
              DecimalFormat df = new DecimalFormat("####0.00");
              Double fahrenheit = input;
              Double celsius = ((fahrenheit - 32) / 9) * 5;
              String f = df.format(fahrenheit).toString();
              String c = df.format(celsius).toString();
              return "<calc>" + "<fahrenheit>" + f + "</fahrenheit>" + "<celsius>" + c + "</celsius>" + "</calc>";            
      }
}
