package virtua.training.primeng.jsweet.todo;

import virtua.training.primeng.jsweet.todo.model.*;
import virtua.training.primeng.jsweet.todo.service.*;
import virtua.training.primeng.jsweet.todo.resource.*;
import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import java.util.HashSet;
import java.util.Set;

/**
 * Application instance for this web app. Provides configuration info and alleviates the need to define a servlet in
 * web.xml.
 *
 * @author Kito D. Mann
 */
@ApplicationScoped
@ApplicationPath("/resources/")
public class TodoApplication extends Application {

    private static final Set<Class<?>> appClasses = new HashSet<>();

    static {
        appClasses.add(TaskService.class);
        appClasses.add(UserService.class);
        appClasses.add(TaskResource.class);
        appClasses.add(User.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return appClasses;
    }

}