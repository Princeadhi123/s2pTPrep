package Login;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Date;

@Path("/login")
public class LoginController {
	@GET
	@Path("/login1")
    public String pojo() {
        return "pojo ok @ " + new Date().toString();
    }
	
	@GET
	@Path("/login2")
    public String pojo1() {
        return "pojo ok 2 @ " + new Date().toString();
    }
}
