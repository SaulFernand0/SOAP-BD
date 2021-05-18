package pe.edu.upeu.ws.daoImp;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ClienteDaoImpService", targetNamespace = "http://daoImp.ws.upeu.edu.pe/", wsdlLocation = "http://localhost:6061/soap/cliente?wsdl")
public class ClienteDaoImpService
    extends Service
{

    private final static URL CLIENTEDAOIMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException CLIENTEDAOIMPSERVICE_EXCEPTION;
    private final static QName CLIENTEDAOIMPSERVICE_QNAME = new QName("http://daoImp.ws.upeu.edu.pe/", "ClienteDaoImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:6061/soap/cliente?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CLIENTEDAOIMPSERVICE_WSDL_LOCATION = url;
        CLIENTEDAOIMPSERVICE_EXCEPTION = e;
    }

    public ClienteDaoImpService() {
        super(__getWsdlLocation(), CLIENTEDAOIMPSERVICE_QNAME);
    }

    public ClienteDaoImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CLIENTEDAOIMPSERVICE_QNAME, features);
    }

    public ClienteDaoImpService(URL wsdlLocation) {
        super(wsdlLocation, CLIENTEDAOIMPSERVICE_QNAME);
    }

    public ClienteDaoImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CLIENTEDAOIMPSERVICE_QNAME, features);
    }

    public ClienteDaoImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClienteDaoImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ClienteDao
     */
    @WebEndpoint(name = "ClienteDaoImpPort")
    public ClienteDao getClienteDaoImpPort() {
        return super.getPort(new QName("http://daoImp.ws.upeu.edu.pe/", "ClienteDaoImpPort"), ClienteDao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClienteDao
     */
    @WebEndpoint(name = "ClienteDaoImpPort")
    public ClienteDao getClienteDaoImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://daoImp.ws.upeu.edu.pe/", "ClienteDaoImpPort"), ClienteDao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CLIENTEDAOIMPSERVICE_EXCEPTION!= null) {
            throw CLIENTEDAOIMPSERVICE_EXCEPTION;
        }
        return CLIENTEDAOIMPSERVICE_WSDL_LOCATION;
    }

}
