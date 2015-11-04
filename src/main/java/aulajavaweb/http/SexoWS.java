package aulajavaweb.http;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import aulajavaweb.model.enums.Sexo;

@Path("sexo")
public class SexoWS {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Sexo[] findAll() {
		return Sexo.values();
	}

}