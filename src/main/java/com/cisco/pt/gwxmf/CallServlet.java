package com.cisco.pt.gwxmf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;


@WebServlet("/forkctrl/call")
public class CallServlet extends HttpServlet {
    private static final long serialVersionUID = -3462096228274971485L;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String xml = null;
        try {
            byte[] xmlData = new byte[request.getContentLength()];

            InputStream sis = request.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(sis);

            bis.read(xmlData, 0, xmlData.length);

            if (request.getCharacterEncoding() != null) {
                xml = new String(xmlData, request.getCharacterEncoding());
            } else {
                xml = new String(xmlData);
            }
        } catch (IOException ioe) {

        }

        response.getWriter().println(xml);
    }
}
