package com.cisco.pt.gwxmf;

import com.cisco.jaxb.BiometryCallRq;
import com.cisco.jaxb.BiometryCallRs;
import com.cisco.jaxb.ErrorInfoType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import static com.cisco.jaxb.converters.JaxbConverter.*;


@WebServlet("/forkctrl/call")
public class CallServlet extends HttpServlet {
    private static final long serialVersionUID = -3462096228274971485L;

    @Override
    protected void doPost(HttpServletRequest httpRequest, HttpServletResponse httpResponse)
            throws ServletException, IOException {

        String xmlFromRequest = readXmlFromRequest(httpRequest);

        String xmlResponse = createXmlResponse(xmlFromRequest);

        httpResponse.getWriter().println(xmlResponse);
    }

    private String createXmlResponse(String xmlFromRequest) {
        BiometryCallRs response = new BiometryCallRs();
        try {
            BiometryCallRq parsedRequest = toBiometryCallRq(xmlFromRequest);
            response = convertFrom(parsedRequest);
        } catch (JAXBException e) {
            e.printStackTrace();
            ErrorInfoType errorInfo = getErrorInfo(e);
            response.setErrorInfo(errorInfo);
        }
        return toXml(response);
    }

    private String readXmlFromRequest(HttpServletRequest httpRequest) {
        String xmlFromRequest = null;
        try {
            byte[] xmlData = new byte[httpRequest.getContentLength()];

            InputStream sis = httpRequest.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(sis);

            bis.read(xmlData, 0, xmlData.length);

            if (httpRequest.getCharacterEncoding() != null) {
                xmlFromRequest = new String(xmlData, httpRequest.getCharacterEncoding());
            } else {
                xmlFromRequest = new String(xmlData);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return xmlFromRequest;
    }

    private ErrorInfoType getErrorInfo(JAXBException e) {
        ErrorInfoType errorInfo = new ErrorInfoType();
        errorInfo.setErrorDescription(e.getMessage());
        errorInfo.setErrorCode(e.getErrorCode());
        return errorInfo;
    }

}
