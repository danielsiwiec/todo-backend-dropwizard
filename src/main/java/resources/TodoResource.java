package resources;

import com.google.common.collect.Maps;
import io.dropwizard.jersey.PATCH;
import model.Todo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.Map;

@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {

    private Map<Integer, Todo> todos = Maps.newHashMap();
    private int counter = 0;

    @GET
    public Collection<Todo> get() {
        return todos.values();
    }

    @GET
    @Path("{id}")
    public Todo getById(@PathParam("id") int id) {
        return todos.get(id);
    }

    @POST
    public Todo addTodos(Todo todo) {
        todo.setId(++counter);
        todo.setCompleted(false);
        todos.put(counter, todo);
        return todo;
    }

    @DELETE
    public void delete() {
        todos.clear();
    }

    @PATCH
    @Path("{id}")
    public Todo edit(@PathParam("id") int id, Todo patch) {
        Todo todo = todos.get(id);
        Todo patchedTodo = todo.patchFrom(patch);
        todos.put(id, patchedTodo);
        return patchedTodo;
    }
}