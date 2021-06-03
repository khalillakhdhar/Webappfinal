package com.example.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.el.util.Validation;
import com.example.demo.validation.Validator;
/**
 * Servlet implementation class FormationServlet
 */
@WebServlet("/FormationServlet")
public class FormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		Validator v=new Validator();
		String erreur="ajout avec succés";
		RequestDispatcher rd=request.getRequestDispatcher("index");
		String titre=request.getParameter("titre");
		if(!v.testLonguer(titre))
		{
			erreur="la longueur du titre est incorrecte";
		}
		String description=request.getParameter("description");
		if(!v.testNotBlank(description)||(!v.validContenuDescription(description)))
		{
			erreur="la description doit se composer de plusieur mots ";
		}
		float prix=Float.parseFloat(request.getParameter("prix"));
		if(!v.validPrix(prix))
		{
			erreur="le prix dois être >100";
		}
		rd.forward(request, response);
		
		}
		
	}


