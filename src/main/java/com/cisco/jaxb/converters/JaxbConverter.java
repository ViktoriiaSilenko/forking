package com.cisco.jaxb.converters;


import com.cisco.jaxb.BiometryCallRq;
import com.cisco.jaxb.BiometryCallRs;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

public class JaxbConverter {

    public static BiometryCallRq toBiometryCallRq(String xml) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(BiometryCallRq.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        StringReader reader = new StringReader(xml);
        return (BiometryCallRq) unmarshaller.unmarshal(reader);
    }

    public static String toXml(BiometryCallRs response) {
        try
        {
            JAXBContext jaxbContext = JAXBContext.newInstance(BiometryCallRs.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter sw = new StringWriter();

            jaxbMarshaller.marshal(response, sw);

            return sw.toString();

        } catch (JAXBException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static BiometryCallRs convertFrom(BiometryCallRq request) {
        BiometryCallRs response = new BiometryCallRs();
        response.setBusinessInfo(request.getBusinessInfo());
        response.setGeneralInfo(request.getGeneralInfo());

        return response;
    }

}
