/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebListener
public class PageViewListener implements ServletRequestListener {

    private static int viewCount = 0;

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        viewCount++;
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        
    }

    public static int getViewCount() {
        return viewCount;
    }
}