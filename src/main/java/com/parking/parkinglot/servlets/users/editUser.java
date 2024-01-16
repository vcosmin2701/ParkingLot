package com.parking.parkinglot.servlets.users;

import com.parking.parkinglot.common.UserDto;
import com.parking.parkinglot.ejb.UserBean;
import jakarta.inject.Inject;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "editUser", value = "/editUser")
public class editUser extends HttpServlet {
    @Inject
    UserBean usersBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long userId = Long.parseLong(request.getParameter("id"));
        UserDto userDto = usersBean.findById(userId);
        request.setAttribute("user", userDto);

        request.getRequestDispatcher("/WEB-INF/pages/users/editUser.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String password= request.getParameter("password");
        Long userId = Long.parseLong(request.getParameter("user_id"));

        usersBean.updatePassword(userId, password);

        response.sendRedirect(request.getContextPath()+"/Users");
    }
}