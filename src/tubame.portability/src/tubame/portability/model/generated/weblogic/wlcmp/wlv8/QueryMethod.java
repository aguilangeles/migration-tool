//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:28 AM JST 
//

package tubame.portability.model.generated.weblogic.wlcmp.wlv8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "methodName", "methodParams" })
@XmlRootElement(name = "query-method")
public class QueryMethod {

    @XmlElement(name = "method-name", required = true)
    protected String methodName;
    @XmlElement(name = "method-params", required = true)
    protected MethodParams methodParams;

    /**
     * Gets the value of the methodName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMethodName(String value) {
        this.methodName = value;
    }

    /**
     * Gets the value of the methodParams property.
     * 
     * @return possible object is {@link MethodParams }
     * 
     */
    public MethodParams getMethodParams() {
        return methodParams;
    }

    /**
     * Sets the value of the methodParams property.
     * 
     * @param value
     *            allowed object is {@link MethodParams }
     * 
     */
    public void setMethodParams(MethodParams value) {
        this.methodParams = value;
    }

}
