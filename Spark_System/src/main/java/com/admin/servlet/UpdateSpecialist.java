package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.SpecialistDao;
import com.db.DBConnect;
import com.beans.Specialist;

@WebServlet("/updateDoctor")
public class UpdateSpecialist extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			String fullName = req.getParameter("full_name");
			String profession = req.getParameter(" profession");
			String contact_no = req.getParameter("contact_no");
			String email = req.getParameter("email");
			String password = req.getParameter("password");

			int spe_id = Integer.parseInt(req.getParameter("spe_id"));

			Specialist s = new Specialist(fullName,profession, contact_no,email, password);

			SpecialistDao dao = new SpecialistDao(DBConnect.getConn());
			HttpSession session = req.getSession();

			if (dao.updateSpecialist(s)) {
				session.setAttribute("succMsg", "Doctor Update Sucessfully..");
				resp.sendRedirect("admin/view_doctor.jsp");
			} else {
				session.setAttribute("errorMsg", "something wrong on server");
				resp.sendRedirect("admin/view_doctor.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}