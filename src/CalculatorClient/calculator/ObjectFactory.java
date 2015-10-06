
package calculator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the calculator package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MultiplayResponse_QNAME = new QName("http://calculator/", "multiplayResponse");
    private final static QName _Multiplay_QNAME = new QName("http://calculator/", "multiplay");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: calculator
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Multiplay }
     * 
     */
    public Multiplay createMultiplay() {
        return new Multiplay();
    }

    /**
     * Create an instance of {@link MultiplayResponse }
     * 
     */
    public MultiplayResponse createMultiplayResponse() {
        return new MultiplayResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator/", name = "multiplayResponse")
    public JAXBElement<MultiplayResponse> createMultiplayResponse(MultiplayResponse value) {
        return new JAXBElement<MultiplayResponse>(_MultiplayResponse_QNAME, MultiplayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator/", name = "multiplay")
    public JAXBElement<Multiplay> createMultiplay(Multiplay value) {
        return new JAXBElement<Multiplay>(_Multiplay_QNAME, Multiplay.class, null, value);
    }

}
