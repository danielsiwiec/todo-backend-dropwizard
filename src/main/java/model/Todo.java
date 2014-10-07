package model;

import com.sun.jersey.server.linking.Link;
import com.sun.jersey.server.linking.Ref;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import resources.TodoResource;

import java.net.URI;

@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class Todo {

    private final String title;
    private int id;
    private boolean completed = false;
    @Ref(resource = TodoResource.class, style = Ref.Style.ABSOLUTE, method = "getById")
    private URI url;

    public Todo(){
        title = "";
    }

    public void setId(int id){
        this.id = id;
    }
}
