//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:38 AM JST 
//

package tubame.portability.model.generated.jboss.jboss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "partitionName", "homeLoadBalancePolicy",
        "beanLoadBalancePolicy", "sessionStateManagerJndiName" })
@XmlRootElement(name = "cluster-config")
public class ClusterConfig {

    @XmlElement(name = "partition-name")
    protected String partitionName;
    @XmlElement(name = "home-load-balance-policy")
    protected String homeLoadBalancePolicy;
    @XmlElement(name = "bean-load-balance-policy")
    protected String beanLoadBalancePolicy;
    @XmlElement(name = "session-state-manager-jndi-name")
    protected String sessionStateManagerJndiName;

    /**
     * Gets the value of the partitionName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPartitionName() {
        return partitionName;
    }

    /**
     * Sets the value of the partitionName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPartitionName(String value) {
        this.partitionName = value;
    }

    /**
     * Gets the value of the homeLoadBalancePolicy property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHomeLoadBalancePolicy() {
        return homeLoadBalancePolicy;
    }

    /**
     * Sets the value of the homeLoadBalancePolicy property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setHomeLoadBalancePolicy(String value) {
        this.homeLoadBalancePolicy = value;
    }

    /**
     * Gets the value of the beanLoadBalancePolicy property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBeanLoadBalancePolicy() {
        return beanLoadBalancePolicy;
    }

    /**
     * Sets the value of the beanLoadBalancePolicy property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setBeanLoadBalancePolicy(String value) {
        this.beanLoadBalancePolicy = value;
    }

    /**
     * Gets the value of the sessionStateManagerJndiName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSessionStateManagerJndiName() {
        return sessionStateManagerJndiName;
    }

    /**
     * Sets the value of the sessionStateManagerJndiName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSessionStateManagerJndiName(String value) {
        this.sessionStateManagerJndiName = value;
    }

}
