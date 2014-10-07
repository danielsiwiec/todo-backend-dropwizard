package resources;

import model.Todo;

import javax.ws.rs.*;
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

    @DELETE
    public void emptyDelete() {
    }
}