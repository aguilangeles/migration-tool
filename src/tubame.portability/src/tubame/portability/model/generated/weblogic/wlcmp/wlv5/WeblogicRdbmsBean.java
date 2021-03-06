//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:27 AM JST 
//

package tubame.portability.model.generated.weblogic.wlcmp.wlv5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "poolName", "schemaName", "tableName",
        "attributeMap", "finderList", "options" })
@XmlRootElement(name = "weblogic-rdbms-bean")
public class WeblogicRdbmsBean {

    @XmlElement(name = "pool-name", required = true)
    protected String poolName;
    @XmlElement(name = "schema-name")
    protected String schemaName;
    @XmlElement(name = "table-name", required = true)
    protected String tableName;
    @XmlElement(name = "attribute-map", required = true)
    protected AttributeMap attributeMap;
    @XmlElement(name = "finder-list")
    protected FinderList finderList;
    protected Options options;

    /**
     * Gets the value of the poolName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * Sets the value of the poolName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPoolName(String value) {
        this.poolName = value;
    }

    /**
     * Gets the value of the schemaName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Sets the value of the schemaName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the attributeMap property.
     * 
     * @return possible object is {@link AttributeMap }
     * 
     */
    public AttributeMap getAttributeMap() {
        return attributeMap;
    }

    /**
     * Sets the value of the attributeMap property.
     * 
     * @param value
     *            allowed object is {@link AttributeMap }
     * 
     */
    public void setAttributeMap(AttributeMap value) {
        this.attributeMap = value;
    }

    /**
     * Gets the value of the finderList property.
     * 
     * @return possible object is {@link FinderList }
     * 
     */
    public FinderList getFinderList() {
        return finderList;
    }

    /**
     * Sets the value of the finderList property.
     * 
     * @param value
     *            allowed object is {@link FinderList }
     * 
     */
    public void setFinderList(FinderList value) {
        this.finderList = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return possible object is {@link Options }
     * 
     */
    public Options getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *            allowed object is {@link Options }
     * 
     */
    public void setOptions(Options value) {
        this.options = value;
    }

}
