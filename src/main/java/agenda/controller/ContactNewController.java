package agenda.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import agenda.model.Contact;
import agenda.model.repository.ContactRepository;

@WebServlet("/contactnew")
public class ContactNewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final Logger log = Logger.getLogger(ContactUpdateController.class.getName());

	public ContactNewController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Request data
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");

		if (name == null || phone == null) {
			log.log(Level.SEVERE, "Error creating contact. Empty parameters ");
			request.getRequestDispatcher("/error.jsp").forward(request, response);
			return;
		}

		// Create contact
		ContactRepository repository = ContactRepository.getInstance();
		repository.addContact(name, phone);

		// Log
		log.log(Level.FINE,
				"New contact request. Name=" + name + ", Telephone= " + phone + ". Forwarding to contact list view.");

		// Forward to contact list view
		request.setAttribute("message", "Contact created successfully");
		request.getRequestDispatcher("/contactlist").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
