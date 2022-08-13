

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.student;
import com.google.gson.*;
/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String jsonString = "{\"name\":\"Maxsu\", \"age\":24}"; 
		String jsonString=request.getParameter("stuData");
	      GsonBuilder builder = new GsonBuilder(); 
	      //builder.setPrettyPrinting(); 

	      Gson gson = builder.create(); 
	      student student = gson.fromJson(jsonString, student.class); 
	      response.getWriter().append(student.toString());
	      System.out.println(student);    
	      jsonString = gson.toJson(student); 
	      System.out.println(jsonString);  

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
