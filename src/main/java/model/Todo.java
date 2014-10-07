package model;

import com.sun.jersey.server.linking.Ref;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import resources.TodoResource;

import java.net.URI;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
public class Todo {

    private String title;
    private int id;
    private Boolean completed;
    @Ref(resource = TodoResource.class, style = Ref.Style.ABSOLUTE, method = "getById")
    private URI url;

    public void setId(int id){
        this.id = id;
    }

    public Todo patchFrom(Todo patch) {

        if (patch.completed != null) {
            completed = patch.completed;
        }

        if (patch.title != null) {
            title = patch.title;
        }

        return this;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
