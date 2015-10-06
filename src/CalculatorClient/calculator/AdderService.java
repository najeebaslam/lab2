
package calculator;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AdderService", targetNamespace = "http://calculator/", wsdlLocation = "http://localhost:1234/calculator/adder?wsdl")
public class AdderService
    extends Service
{

    private final static URL ADDERSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADDERSERVICE_EXCEPTION;
    private final static QName ADDERSERVICE_QNAME = new QName("http://calculator/", "AdderService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1234/calculator/adder?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADDERSERVICE_WSDL_LOCATION = url;
        ADDERSERVICE_EXCEPTION = e;
    }

    public AdderService() {
        super(__getWsdlLocation(), ADDERSERVICE_QNAME);
    }

    public AdderService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADDERSERVICE_QNAME, features);
    }

    public AdderService(URL wsdlLocation) {
        super(wsdlLocation, ADDERSERVICE_QNAME);
    }

    public AdderService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADDERSERVICE_QNAME, features);
    }

    public AdderService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdderService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Adder
     */
    @WebEndpoint(name = "AdderPort")
    public Adder getAdderPort() {
        return super.getPort(new QName("http://calculator/", "AdderPort"), Adder.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Adder
     */
    @WebEndpoint(name = "AdderPort")
    public Adder getAdderPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://calculator/", "AdderPort"), Adder.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADDERSERVICE_EXCEPTION!= null) {
            throw ADDERSERVICE_EXCEPTION;
        }
        return ADDERSERVICE_WSDL_LOCATION;
    }

}
