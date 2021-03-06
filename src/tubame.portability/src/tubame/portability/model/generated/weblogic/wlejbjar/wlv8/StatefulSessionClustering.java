//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:37 AM JST 
//

package tubame.portability.model.generated.weblogic.wlejbjar.wlv8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "homeIsClusterable", "homeLoadAlgorithm",
        "homeCallRouterClassName", "useServersideStubs", "replicationType" })
@XmlRootElement(name = "stateful-session-clustering")
public class StatefulSessionClustering {

    @XmlElement(name = "home-is-clusterable")
    protected String homeIsClusterable;
    @XmlElement(name = "home-load-algorithm")
    protected String homeLoadAlgorithm;
    @XmlElement(name = "home-call-router-class-name")
    protected String homeCallRouterClassName;
    @XmlElement(name = "use-serverside-stubs")
    protected String useServersideStubs;
    @XmlElement(name = "replication-type")
    protected String replicationType;

    /**
     * Gets the value of the homeIsClusterable property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHomeIsClusterable() {
        return homeIsClusterable;
    }

    /**
     * Sets the value of the homeIsClusterable property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setHomeIsClusterable(String value) {
        this.homeIsClusterable = value;
    }

    /**
     * Gets the value of the homeLoadAlgorithm property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHomeLoadAlgorithm() {
        return homeLoadAlgorithm;
    }

    /**
     * Sets the value of the homeLoadAlgorithm property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setHomeLoadAlgorithm(String value) {
        this.homeLoadAlgorithm = value;
    }

    /**
     * Gets the value of the homeCallRouterClassName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHomeCallRouterClassName() {
        return homeCallRouterClassName;
    }

    /**
     * Sets the value of the homeCallRouterClassName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setHomeCallRouterClassName(String value) {
        this.homeCallRouterClassName = value;
    }

    /**
     * Gets the value of the useServersideStubs property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUseServersideStubs() {
        return useServersideStubs;
    }

    /**
     * Sets the value of the useServersideStubs property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setUseServersideStubs(String value) {
        this.useServersideStubs = value;
    }

    /**
     * Gets the value of the replicationType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getReplicationType() {
        return replicationType;
    }

    /**
     * Sets the value of the replicationType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setReplicationType(String value) {
        this.replicationType = value;
    }

}
