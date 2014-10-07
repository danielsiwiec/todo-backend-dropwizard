package resources;

import com.google.common.collect.Lists;
import model.Todo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {

    List<Todo> todos = Lists.newArrayList();

    @GET
    public List<Todo> get() {
        return todos;
    }

    @POST
    public Todo addTodos(Todo todo) {
        todos.add(todo);
        return todo;
    }

    @DELETE
    public void delete() {
        todos.clear();
    }
}