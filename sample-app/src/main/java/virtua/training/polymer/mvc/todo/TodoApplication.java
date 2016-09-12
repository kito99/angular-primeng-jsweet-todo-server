package virtua.training.polymer.mvc.todo;

import javax.mvc.security.Csrf;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.Map;

/**
 * Application instance for this web app. Provides configuration info and alleviates the need to define a servlet in
 * web.xml.
 *
 * @author Kito D. Mann
 */
@ApplicationPath("/resources/")
public class TodoApplication extends Application {

}