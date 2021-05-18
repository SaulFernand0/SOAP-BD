package pe.edu.upeu.ws.daoImp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import pe.edu.upeu.ws.dao.Cliente;
import pe.edu.upeu.ws.dao.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClienteDao", targetNamespace = "http://dao.ws.upeu.edu.pe/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClienteDao {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns pe.edu.upeu.ws.dao.Cliente
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readVenta", targetNamespace = "http://dao.ws.upeu.edu.pe/", className = "pe.edu.upeu.ws.dao.ReadVenta")
    @ResponseWrapper(localName = "readVentaResponse", targetNamespace = "http://dao.ws.upeu.edu.pe/", className = "pe.edu.upeu.ws.dao.ReadVentaResponse")
    @Action(input = "http://dao.ws.upeu.edu.pe/ClienteDao/readVentaRequest", output = "http://dao.ws.upeu.edu.pe/ClienteDao/readVentaResponse")
    public Cliente readVenta(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

}