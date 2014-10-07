package resources;

import com.google.common.collect.Lists;
import model.Todo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {

    @GET
    public List<String> emptyGet() {
        return Lists.newArrayList();
    }

    @POST
    public Todo addTodos(Todo todo) {
        return todo;
    }

    @DELETE
    public void emptyDelete() {
    }
}