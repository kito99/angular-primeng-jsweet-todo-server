package virtua.primeng_jsweet_jaxrs_todo.resource;

import virtua.primeng_jsweet_jaxrs_todo.model.Task;
import virtua.primeng_jsweet_jaxrs_todo.service.TaskService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;
import java.util.logging.Logger;

/**
 * Primary resource -- handles all MVC Controller and REST-based functionality for managing tasks.
 * <p>
 * Created: 21 Oct 2015
 *
 * @author Kito D. Mann
 */
// tag::jaxrs-simple[]
@ApplicationScoped
@Path("/tasks")
public class TaskResource {
    private final static Logger logger = Logger.getLogger(TaskResource.class.getName());

    @Inject
    private TaskService taskService;

    @Path("{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateTask(@PathParam("id") String id, Task task) {
        Optional<Task> currentTask = taskService.get(id);
        if (currentTask.isPresent()) {
            taskService.update(task);
        } else {
            taskService.add(task);
        }
        return Response.ok().build();
    }

    @Path("add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addTask(Task task) {
        taskService.add(task);
        return Response.ok(task).build();
    }

    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTask(@PathParam("id") String id) {
        Optional<Task> task = taskService.get(id);
        if (task.isPresent()) {
            return Response.ok(task.get()).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

// end::jaxrs-simple[]

    @Path("{id}")
    @DELETE
    public Response removeTask(@PathParam("id") String id) {
        taskService.remove(id);
        return Response.ok().build();
    }

    @Path("list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTasks() {
        Task[] tasks = taskService.getTasks();
        return Response.ok(tasks).build();
    }
}
