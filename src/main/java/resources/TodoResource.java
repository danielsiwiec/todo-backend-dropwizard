package resources;

import model.Todo;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {

    @GET
    public void emptyGet() {
    }

    @POST
    public Todo addTodos(Todo todo) {
        return todo;
    }
}