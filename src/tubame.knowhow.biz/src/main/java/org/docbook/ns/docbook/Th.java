
package org.docbook.ns.docbook;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://docbook.org/ns/docbook}inlinemediaobject"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}remark"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}superscript"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}subscript"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}xref"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}link"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}olink"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}anchor"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}biblioref"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}alt"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}annotation"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}indexterm"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}abbrev"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}acronym"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}date"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}emphasis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}footnote"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}footnoteref"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}foreignphrase"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}phrase"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}quote"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}wordasword"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}firstterm"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}glossterm"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}coref"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}trademark"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}productnumber"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}productname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}database"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}application"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}hardware"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}citation"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}citerefentry"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}citetitle"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}citebiblioid"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}author"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}person"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}personname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}org"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}orgname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}editor"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}jobtitle"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}replaceable"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}package"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}parameter"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}termdef"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}nonterminal"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}systemitem"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}option"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}optional"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}property"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}inlineequation"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}tag"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}markup"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}token"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}symbol"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}literal"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}code"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}constant"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}email"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}uri"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}guiicon"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}guibutton"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}guimenuitem"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}guimenu"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}guisubmenu"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}guilabel"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}menuchoice"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}mousebutton"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}keycombo"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}keycap"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}keycode"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}keysym"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}shortcut"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}accel"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}prompt"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}envar"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}filename"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}command"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}computeroutput"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}userinput"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}function"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}varname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}returnvalue"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}type"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}classname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}exceptionname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}interfacename"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}methodname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}modifier"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}initializer"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}ooclass"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}ooexception"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}oointerface"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}errorcode"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}errortext"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}errorname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}errortype"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}itemizedlist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}orderedlist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}procedure"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}simplelist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}variablelist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}segmentedlist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}glosslist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}bibliolist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}calloutlist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}qandaset"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}example"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}figure"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}table"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}equation"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}informalexample"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}informalfigure"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}informaltable"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}informalequation"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}sidebar"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}blockquote"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}address"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}epigraph"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}mediaobject"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}screenshot"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}task"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}productionset"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}constraintdef"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}msgset"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}screen"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}literallayout"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}programlistingco"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}screenco"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}programlisting"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}synopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}bridgehead"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}revhistory"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}funcsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}classsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}methodsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}constructorsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}destructorsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}fieldsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}cmdsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}caution"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}important"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}note"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}tip"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}warning"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}para"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}formalpara"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}simpara"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://docbook.org/ns/docbook}db.common.attributes"/>
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onclick" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ondblclick" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onmousedown" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onmouseup" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onmouseover" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onmousemove" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onmouseout" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onkeypress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onkeydown" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="onkeyup" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="abbr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="axis" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="headers" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="scope">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="row"/>
 *             &lt;enumeration value="col"/>
 *             &lt;enumeration value="rowgroup"/>
 *             &lt;enumeration value="colgroup"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rowspan" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="colspan" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="align">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="left"/>
 *             &lt;enumeration value="center"/>
 *             &lt;enumeration value="right"/>
 *             &lt;enumeration value="justify"/>
 *             &lt;enumeration value="char"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="char" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="charoff" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="valign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="top"/>
 *             &lt;enumeration value="middle"/>
 *             &lt;enumeration value="bottom"/>
 *             &lt;enumeration value="baseline"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "th")
public class Th {

    @XmlElementRefs({
        @XmlElementRef(name = "important", namespace = "http://docbook.org/ns/docbook", type = Important.class, required = false),
        @XmlElementRef(name = "type", namespace = "http://docbook.org/ns/docbook", type = Type.class, required = false),
        @XmlElementRef(name = "initializer", namespace = "http://docbook.org/ns/docbook", type = Initializer.class, required = false),
        @XmlElementRef(name = "informalexample", namespace = "http://docbook.org/ns/docbook", type = Informalexample.class, required = false),
        @XmlElementRef(name = "link", namespace = "http://docbook.org/ns/docbook", type = Link.class, required = false),
        @XmlElementRef(name = "annotation", namespace = "http://docbook.org/ns/docbook", type = Annotation.class, required = false),
        @XmlElementRef(name = "exceptionname", namespace = "http://docbook.org/ns/docbook", type = Exceptionname.class, required = false),
        @XmlElementRef(name = "errortype", namespace = "http://docbook.org/ns/docbook", type = Errortype.class, required = false),
        @XmlElementRef(name = "returnvalue", namespace = "http://docbook.org/ns/docbook", type = Returnvalue.class, required = false),
        @XmlElementRef(name = "ooexception", namespace = "http://docbook.org/ns/docbook", type = Ooexception.class, required = false),
        @XmlElementRef(name = "classsynopsis", namespace = "http://docbook.org/ns/docbook", type = Classsynopsis.class, required = false),
        @XmlElementRef(name = "synopsis", namespace = "http://docbook.org/ns/docbook", type = Synopsis.class, required = false),
        @XmlElementRef(name = "productname", namespace = "http://docbook.org/ns/docbook", type = Productname.class, required = false),
        @XmlElementRef(name = "revhistory", namespace = "http://docbook.org/ns/docbook", type = Revhistory.class, required = false),
        @XmlElementRef(name = "programlistingco", namespace = "http://docbook.org/ns/docbook", type = Programlistingco.class, required = false),
        @XmlElementRef(name = "systemitem", namespace = "http://docbook.org/ns/docbook", type = Systemitem.class, required = false),
        @XmlElementRef(name = "note", namespace = "http://docbook.org/ns/docbook", type = Note.class, required = false),
        @XmlElementRef(name = "uri", namespace = "http://docbook.org/ns/docbook", type = Uri.class, required = false),
        @XmlElementRef(name = "simpara", namespace = "http://docbook.org/ns/docbook", type = Simpara.class, required = false),
        @XmlElementRef(name = "orgname", namespace = "http://docbook.org/ns/docbook", type = Orgname.class, required = false),
        @XmlElementRef(name = "prompt", namespace = "http://docbook.org/ns/docbook", type = Prompt.class, required = false),
        @XmlElementRef(name = "biblioref", namespace = "http://docbook.org/ns/docbook", type = Biblioref.class, required = false),
        @XmlElementRef(name = "date", namespace = "http://docbook.org/ns/docbook", type = Date.class, required = false),
        @XmlElementRef(name = "foreignphrase", namespace = "http://docbook.org/ns/docbook", type = Foreignphrase.class, required = false),
        @XmlElementRef(name = "methodname", namespace = "http://docbook.org/ns/docbook", type = Methodname.class, required = false),
        @XmlElementRef(name = "shortcut", namespace = "http://docbook.org/ns/docbook", type = Shortcut.class, required = false),
        @XmlElementRef(name = "example", namespace = "http://docbook.org/ns/docbook", type = Example.class, required = false),
        @XmlElementRef(name = "guiicon", namespace = "http://docbook.org/ns/docbook", type = Guiicon.class, required = false),
        @XmlElementRef(name = "jobtitle", namespace = "http://docbook.org/ns/docbook", type = Jobtitle.class, required = false),
        @XmlElementRef(name = "literal", namespace = "http://docbook.org/ns/docbook", type = Literal.class, required = false),
        @XmlElementRef(name = "guimenuitem", namespace = "http://docbook.org/ns/docbook", type = Guimenuitem.class, required = false),
        @XmlElementRef(name = "trademark", namespace = "http://docbook.org/ns/docbook", type = Trademark.class, required = false),
        @XmlElementRef(name = "guilabel", namespace = "http://docbook.org/ns/docbook", type = Guilabel.class, required = false),
        @XmlElementRef(name = "figure", namespace = "http://docbook.org/ns/docbook", type = Figure.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://docbook.org/ns/docbook", type = Acronym.class, required = false),
        @XmlElementRef(name = "mousebutton", namespace = "http://docbook.org/ns/docbook", type = Mousebutton.class, required = false),
        @XmlElementRef(name = "firstterm", namespace = "http://docbook.org/ns/docbook", type = Firstterm.class, required = false),
        @XmlElementRef(name = "varname", namespace = "http://docbook.org/ns/docbook", type = Varname.class, required = false),
        @XmlElementRef(name = "olink", namespace = "http://docbook.org/ns/docbook", type = Olink.class, required = false),
        @XmlElementRef(name = "application", namespace = "http://docbook.org/ns/docbook", type = Application.class, required = false),
        @XmlElementRef(name = "task", namespace = "http://docbook.org/ns/docbook", type = Task.class, required = false),
        @XmlElementRef(name = "bibliolist", namespace = "http://docbook.org/ns/docbook", type = Bibliolist.class, required = false),
        @XmlElementRef(name = "productnumber", namespace = "http://docbook.org/ns/docbook", type = Productnumber.class, required = false),
        @XmlElementRef(name = "modifier", namespace = "http://docbook.org/ns/docbook", type = Modifier.class, required = false),
        @XmlElementRef(name = "caution", namespace = "http://docbook.org/ns/docbook", type = Caution.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://docbook.org/ns/docbook", type = Address.class, required = false),
        @XmlElementRef(name = "screenshot", namespace = "http://docbook.org/ns/docbook", type = Screenshot.class, required = false),
        @XmlElementRef(name = "sidebar", namespace = "http://docbook.org/ns/docbook", type = Sidebar.class, required = false),
        @XmlElementRef(name = "editor", namespace = "http://docbook.org/ns/docbook", type = Editor.class, required = false),
        @XmlElementRef(name = "person", namespace = "http://docbook.org/ns/docbook", type = Person.class, required = false),
        @XmlElementRef(name = "informalequation", namespace = "http://docbook.org/ns/docbook", type = Informalequation.class, required = false),
        @XmlElementRef(name = "guimenu", namespace = "http://docbook.org/ns/docbook", type = Guimenu.class, required = false),
        @XmlElementRef(name = "menuchoice", namespace = "http://docbook.org/ns/docbook", type = Menuchoice.class, required = false),
        @XmlElementRef(name = "destructorsynopsis", namespace = "http://docbook.org/ns/docbook", type = Destructorsynopsis.class, required = false),
        @XmlElementRef(name = "package", namespace = "http://docbook.org/ns/docbook", type = Package.class, required = false),
        @XmlElementRef(name = "interfacename", namespace = "http://docbook.org/ns/docbook", type = Interfacename.class, required = false),
        @XmlElementRef(name = "anchor", namespace = "http://docbook.org/ns/docbook", type = Anchor.class, required = false),
        @XmlElementRef(name = "keycap", namespace = "http://docbook.org/ns/docbook", type = Keycap.class, required = false),
        @XmlElementRef(name = "errortext", namespace = "http://docbook.org/ns/docbook", type = Errortext.class, required = false),
        @XmlElementRef(name = "footnoteref", namespace = "http://docbook.org/ns/docbook", type = Footnoteref.class, required = false),
        @XmlElementRef(name = "org", namespace = "http://docbook.org/ns/docbook", type = Org.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://docbook.org/ns/docbook", type = Code.class, required = false),
        @XmlElementRef(name = "email", namespace = "http://docbook.org/ns/docbook", type = Email.class, required = false),
        @XmlElementRef(name = "constructorsynopsis", namespace = "http://docbook.org/ns/docbook", type = Constructorsynopsis.class, required = false),
        @XmlElementRef(name = "keysym", namespace = "http://docbook.org/ns/docbook", type = Keysym.class, required = false),
        @XmlElementRef(name = "msgset", namespace = "http://docbook.org/ns/docbook", type = Msgset.class, required = false),
        @XmlElementRef(name = "formalpara", namespace = "http://docbook.org/ns/docbook", type = Formalpara.class, required = false),
        @XmlElementRef(name = "calloutlist", namespace = "http://docbook.org/ns/docbook", type = Calloutlist.class, required = false),
        @XmlElementRef(name = "citetitle", namespace = "http://docbook.org/ns/docbook", type = Citetitle.class, required = false),
        @XmlElementRef(name = "indexterm", namespace = "http://docbook.org/ns/docbook", type = Indexterm.class, required = false),
        @XmlElementRef(name = "xref", namespace = "http://docbook.org/ns/docbook", type = Xref.class, required = false),
        @XmlElementRef(name = "guisubmenu", namespace = "http://docbook.org/ns/docbook", type = Guisubmenu.class, required = false),
        @XmlElementRef(name = "methodsynopsis", namespace = "http://docbook.org/ns/docbook", type = Methodsynopsis.class, required = false),
        @XmlElementRef(name = "simplelist", namespace = "http://docbook.org/ns/docbook", type = Simplelist.class, required = false),
        @XmlElementRef(name = "token", namespace = "http://docbook.org/ns/docbook", type = Token.class, required = false),
        @XmlElementRef(name = "qandaset", namespace = "http://docbook.org/ns/docbook", type = Qandaset.class, required = false),
        @XmlElementRef(name = "variablelist", namespace = "http://docbook.org/ns/docbook", type = Variablelist.class, required = false),
        @XmlElementRef(name = "orderedlist", namespace = "http://docbook.org/ns/docbook", type = Orderedlist.class, required = false),
        @XmlElementRef(name = "oointerface", namespace = "http://docbook.org/ns/docbook", type = Oointerface.class, required = false),
        @XmlElementRef(name = "author", namespace = "http://docbook.org/ns/docbook", type = Author.class, required = false),
        @XmlElementRef(name = "quote", namespace = "http://docbook.org/ns/docbook", type = Quote.class, required = false),
        @XmlElementRef(name = "informaltable", namespace = "http://docbook.org/ns/docbook", type = Informaltable.class, required = false),
        @XmlElementRef(name = "informalfigure", namespace = "http://docbook.org/ns/docbook", type = Informalfigure.class, required = false),
        @XmlElementRef(name = "errorcode", namespace = "http://docbook.org/ns/docbook", type = Errorcode.class, required = false),
        @XmlElementRef(name = "epigraph", namespace = "http://docbook.org/ns/docbook", type = Epigraph.class, required = false),
        @XmlElementRef(name = "markup", namespace = "http://docbook.org/ns/docbook", type = Markup.class, required = false),
        @XmlElementRef(name = "inlinemediaobject", namespace = "http://docbook.org/ns/docbook", type = Inlinemediaobject.class, required = false),
        @XmlElementRef(name = "ooclass", namespace = "http://docbook.org/ns/docbook", type = Ooclass.class, required = false),
        @XmlElementRef(name = "replaceable", namespace = "http://docbook.org/ns/docbook", type = Replaceable.class, required = false),
        @XmlElementRef(name = "envar", namespace = "http://docbook.org/ns/docbook", type = Envar.class, required = false),
        @XmlElementRef(name = "computeroutput", namespace = "http://docbook.org/ns/docbook", type = Computeroutput.class, required = false),
        @XmlElementRef(name = "citerefentry", namespace = "http://docbook.org/ns/docbook", type = Citerefentry.class, required = false),
        @XmlElementRef(name = "wordasword", namespace = "http://docbook.org/ns/docbook", type = Wordasword.class, required = false),
        @XmlElementRef(name = "guibutton", namespace = "http://docbook.org/ns/docbook", type = Guibutton.class, required = false),
        @XmlElementRef(name = "footnote", namespace = "http://docbook.org/ns/docbook", type = Footnote.class, required = false),
        @XmlElementRef(name = "blockquote", namespace = "http://docbook.org/ns/docbook", type = Blockquote.class, required = false),
        @XmlElementRef(name = "citation", namespace = "http://docbook.org/ns/docbook", type = Citation.class, required = false),
        @XmlElementRef(name = "keycombo", namespace = "http://docbook.org/ns/docbook", type = Keycombo.class, required = false),
        @XmlElementRef(name = "database", namespace = "http://docbook.org/ns/docbook", type = Database.class, required = false),
        @XmlElementRef(name = "para", namespace = "http://docbook.org/ns/docbook", type = Para.class, required = false),
        @XmlElementRef(name = "userinput", namespace = "http://docbook.org/ns/docbook", type = Userinput.class, required = false),
        @XmlElementRef(name = "literallayout", namespace = "http://docbook.org/ns/docbook", type = Literallayout.class, required = false),
        @XmlElementRef(name = "hardware", namespace = "http://docbook.org/ns/docbook", type = Hardware.class, required = false),
        @XmlElementRef(name = "cmdsynopsis", namespace = "http://docbook.org/ns/docbook", type = Cmdsynopsis.class, required = false),
        @XmlElementRef(name = "itemizedlist", namespace = "http://docbook.org/ns/docbook", type = Itemizedlist.class, required = false),
        @XmlElementRef(name = "constraintdef", namespace = "http://docbook.org/ns/docbook", type = Constraintdef.class, required = false),
        @XmlElementRef(name = "glosslist", namespace = "http://docbook.org/ns/docbook", type = Glosslist.class, required = false),
        @XmlElementRef(name = "emphasis", namespace = "http://docbook.org/ns/docbook", type = Emphasis.class, required = false),
        @XmlElementRef(name = "programlisting", namespace = "http://docbook.org/ns/docbook", type = Programlisting.class, required = false),
        @XmlElementRef(name = "subscript", namespace = "http://docbook.org/ns/docbook", type = Subscript.class, required = false),
        @XmlElementRef(name = "phrase", namespace = "http://docbook.org/ns/docbook", type = Phrase.class, required = false),
        @XmlElementRef(name = "function", namespace = "http://docbook.org/ns/docbook", type = Function.class, required = false),
        @XmlElementRef(name = "termdef", namespace = "http://docbook.org/ns/docbook", type = Termdef.class, required = false),
        @XmlElementRef(name = "funcsynopsis", namespace = "http://docbook.org/ns/docbook", type = Funcsynopsis.class, required = false),
        @XmlElementRef(name = "personname", namespace = "http://docbook.org/ns/docbook", type = Personname.class, required = false),
        @XmlElementRef(name = "fieldsynopsis", namespace = "http://docbook.org/ns/docbook", type = Fieldsynopsis.class, required = false),
        @XmlElementRef(name = "glossterm", namespace = "http://docbook.org/ns/docbook", type = Glossterm.class, required = false),
        @XmlElementRef(name = "filename", namespace = "http://docbook.org/ns/docbook", type = Filename.class, required = false),
        @XmlElementRef(name = "mediaobject", namespace = "http://docbook.org/ns/docbook", type = Mediaobject.class, required = false),
        @XmlElementRef(name = "tag", namespace = "http://docbook.org/ns/docbook", type = Tag.class, required = false),
        @XmlElementRef(name = "keycode", namespace = "http://docbook.org/ns/docbook", type = Keycode.class, required = false),
        @XmlElementRef(name = "inlineequation", namespace = "http://docbook.org/ns/docbook", type = Inlineequation.class, required = false),
        @XmlElementRef(name = "bridgehead", namespace = "http://docbook.org/ns/docbook", type = Bridgehead.class, required = false),
        @XmlElementRef(name = "option", namespace = "http://docbook.org/ns/docbook", type = Option.class, required = false),
        @XmlElementRef(name = "screen", namespace = "http://docbook.org/ns/docbook", type = Screen.class, required = false),
        @XmlElementRef(name = "parameter", namespace = "http://docbook.org/ns/docbook", type = Parameter.class, required = false),
        @XmlElementRef(name = "tip", namespace = "http://docbook.org/ns/docbook", type = Tip.class, required = false),
        @XmlElementRef(name = "nonterminal", namespace = "http://docbook.org/ns/docbook", type = Nonterminal.class, required = false),
        @XmlElementRef(name = "property", namespace = "http://docbook.org/ns/docbook", type = Property.class, required = false),
        @XmlElementRef(name = "warning", namespace = "http://docbook.org/ns/docbook", type = Warning.class, required = false),
        @XmlElementRef(name = "optional", namespace = "http://docbook.org/ns/docbook", type = Optional.class, required = false),
        @XmlElementRef(name = "segmentedlist", namespace = "http://docbook.org/ns/docbook", type = Segmentedlist.class, required = false),
        @XmlElementRef(name = "coref", namespace = "http://docbook.org/ns/docbook", type = Coref.class, required = false),
        @XmlElementRef(name = "screenco", namespace = "http://docbook.org/ns/docbook", type = Screenco.class, required = false),
        @XmlElementRef(name = "superscript", namespace = "http://docbook.org/ns/docbook", type = Superscript.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://docbook.org/ns/docbook", type = Table.class, required = false),
        @XmlElementRef(name = "command", namespace = "http://docbook.org/ns/docbook", type = Command.class, required = false),
        @XmlElementRef(name = "constant", namespace = "http://docbook.org/ns/docbook", type = Constant.class, required = false),
        @XmlElementRef(name = "equation", namespace = "http://docbook.org/ns/docbook", type = Equation.class, required = false),
        @XmlElementRef(name = "productionset", namespace = "http://docbook.org/ns/docbook", type = Productionset.class, required = false),
        @XmlElementRef(name = "symbol", namespace = "http://docbook.org/ns/docbook", type = Symbol.class, required = false),
        @XmlElementRef(name = "classname", namespace = "http://docbook.org/ns/docbook", type = Classname.class, required = false),
        @XmlElementRef(name = "alt", namespace = "http://docbook.org/ns/docbook", type = Alt.class, required = false),
        @XmlElementRef(name = "procedure", namespace = "http://docbook.org/ns/docbook", type = Procedure.class, required = false),
        @XmlElementRef(name = "errorname", namespace = "http://docbook.org/ns/docbook", type = Errorname.class, required = false),
        @XmlElementRef(name = "citebiblioid", namespace = "http://docbook.org/ns/docbook", type = Citebiblioid.class, required = false),
        @XmlElementRef(name = "remark", namespace = "http://docbook.org/ns/docbook", type = Remark.class, required = false),
        @XmlElementRef(name = "abbrev", namespace = "http://docbook.org/ns/docbook", type = Abbrev.class, required = false),
        @XmlElementRef(name = "accel", namespace = "http://docbook.org/ns/docbook", type = Accel.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "style")
    @XmlSchemaType(name = "anySimpleType")
    protected String style;
    @XmlAttribute(name = "title")
    @XmlSchemaType(name = "anySimpleType")
    protected String title;
    @XmlAttribute(name = "lang")
    @XmlSchemaType(name = "anySimpleType")
    protected String lang;
    @XmlAttribute(name = "onclick")
    @XmlSchemaType(name = "anySimpleType")
    protected String onclick;
    @XmlAttribute(name = "ondblclick")
    @XmlSchemaType(name = "anySimpleType")
    protected String ondblclick;
    @XmlAttribute(name = "onmousedown")
    @XmlSchemaType(name = "anySimpleType")
    protected String onmousedown;
    @XmlAttribute(name = "onmouseup")
    @XmlSchemaType(name = "anySimpleType")
    protected String onmouseup;
    @XmlAttribute(name = "onmouseover")
    @XmlSchemaType(name = "anySimpleType")
    protected String onmouseover;
    @XmlAttribute(name = "onmousemove")
    @XmlSchemaType(name = "anySimpleType")
    protected String onmousemove;
    @XmlAttribute(name = "onmouseout")
    @XmlSchemaType(name = "anySimpleType")
    protected String onmouseout;
    @XmlAttribute(name = "onkeypress")
    @XmlSchemaType(name = "anySimpleType")
    protected String onkeypress;
    @XmlAttribute(name = "onkeydown")
    @XmlSchemaType(name = "anySimpleType")
    protected String onkeydown;
    @XmlAttribute(name = "onkeyup")
    @XmlSchemaType(name = "anySimpleType")
    protected String onkeyup;
    @XmlAttribute(name = "abbr")
    @XmlSchemaType(name = "anySimpleType")
    protected String abbr;
    @XmlAttribute(name = "axis")
    @XmlSchemaType(name = "anySimpleType")
    protected String axis;
    @XmlAttribute(name = "headers")
    @XmlSchemaType(name = "anySimpleType")
    protected String headers;
    @XmlAttribute(name = "scope")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scope;
    @XmlAttribute(name = "rowspan")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String rowspan;
    @XmlAttribute(name = "colspan")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String colspan;
    @XmlAttribute(name = "align")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
    @XmlAttribute(name = "char")
    @XmlSchemaType(name = "anySimpleType")
    protected String _char;
    @XmlAttribute(name = "charoff")
    @XmlSchemaType(name = "anySimpleType")
    protected String charoff;
    @XmlAttribute(name = "valign")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valign;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "version")
    @XmlSchemaType(name = "anySimpleType")
    protected String commonVersion;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anySimpleType")
    protected String xmlLang;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anySimpleType")
    protected String base;
    @XmlAttribute(name = "remap")
    @XmlSchemaType(name = "anySimpleType")
    protected String remap;
    @XmlAttribute(name = "xreflabel")
    @XmlSchemaType(name = "anySimpleType")
    protected String xreflabel;
    @XmlAttribute(name = "revisionflag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String revisionflag;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
    @XmlAttribute(name = "arch")
    @XmlSchemaType(name = "anySimpleType")
    protected String arch;
    @XmlAttribute(name = "audience")
    @XmlSchemaType(name = "anySimpleType")
    protected String audience;
    @XmlAttribute(name = "condition")
    @XmlSchemaType(name = "anySimpleType")
    protected String condition;
    @XmlAttribute(name = "conformance")
    @XmlSchemaType(name = "anySimpleType")
    protected String conformance;
    @XmlAttribute(name = "os")
    @XmlSchemaType(name = "anySimpleType")
    protected String os;
    @XmlAttribute(name = "revision")
    @XmlSchemaType(name = "anySimpleType")
    protected String commonRevision;
    @XmlAttribute(name = "security")
    @XmlSchemaType(name = "anySimpleType")
    protected String security;
    @XmlAttribute(name = "userlevel")
    @XmlSchemaType(name = "anySimpleType")
    protected String userlevel;
    @XmlAttribute(name = "vendor")
    @XmlSchemaType(name = "anySimpleType")
    protected String vendor;
    @XmlAttribute(name = "wordsize")
    @XmlSchemaType(name = "anySimpleType")
    protected String wordsize;
    @XmlAttribute(name = "annotations")
    @XmlSchemaType(name = "anySimpleType")
    protected String annotations;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Type }
     * {@link Important }
     * {@link Initializer }
     * {@link Link }
     * {@link Informalexample }
     * {@link Exceptionname }
     * {@link Annotation }
     * {@link Errortype }
     * {@link Ooexception }
     * {@link Returnvalue }
     * {@link Classsynopsis }
     * {@link Productname }
     * {@link Synopsis }
     * {@link Programlistingco }
     * {@link Revhistory }
     * {@link Systemitem }
     * {@link Uri }
     * {@link Note }
     * {@link Simpara }
     * {@link Orgname }
     * {@link Prompt }
     * {@link Biblioref }
     * {@link Date }
     * {@link Foreignphrase }
     * {@link Methodname }
     * {@link Shortcut }
     * {@link Guiicon }
     * {@link Example }
     * {@link Literal }
     * {@link Jobtitle }
     * {@link Guimenuitem }
     * {@link Trademark }
     * {@link Guilabel }
     * {@link Acronym }
     * {@link Figure }
     * {@link Mousebutton }
     * {@link Varname }
     * {@link Firstterm }
     * {@link Olink }
     * {@link Application }
     * {@link Productnumber }
     * {@link Bibliolist }
     * {@link Task }
     * {@link Modifier }
     * {@link Caution }
     * {@link Address }
     * {@link Screenshot }
     * {@link Person }
     * {@link Editor }
     * {@link Sidebar }
     * {@link Informalequation }
     * {@link Guimenu }
     * {@link Menuchoice }
     * {@link Destructorsynopsis }
     * {@link Interfacename }
     * {@link Package }
     * {@link Errortext }
     * {@link Keycap }
     * {@link Anchor }
     * {@link Footnoteref }
     * {@link String }
     * {@link Code }
     * {@link Org }
     * {@link Email }
     * {@link Constructorsynopsis }
     * {@link Keysym }
     * {@link Msgset }
     * {@link Formalpara }
     * {@link Citetitle }
     * {@link Calloutlist }
     * {@link Indexterm }
     * {@link Guisubmenu }
     * {@link Xref }
     * {@link Methodsynopsis }
     * {@link Simplelist }
     * {@link Token }
     * {@link Oointerface }
     * {@link Orderedlist }
     * {@link Variablelist }
     * {@link Qandaset }
     * {@link Quote }
     * {@link Author }
     * {@link Informaltable }
     * {@link Informalfigure }
     * {@link Errorcode }
     * {@link Epigraph }
     * {@link Markup }
     * {@link Inlinemediaobject }
     * {@link Ooclass }
     * {@link Envar }
     * {@link Replaceable }
     * {@link Computeroutput }
     * {@link Guibutton }
     * {@link Wordasword }
     * {@link Citerefentry }
     * {@link Footnote }
     * {@link Keycombo }
     * {@link Citation }
     * {@link Blockquote }
     * {@link Database }
     * {@link Userinput }
     * {@link Para }
     * {@link Hardware }
     * {@link Literallayout }
     * {@link Cmdsynopsis }
     * {@link Itemizedlist }
     * {@link Constraintdef }
     * {@link Glosslist }
     * {@link Emphasis }
     * {@link Subscript }
     * {@link Programlisting }
     * {@link Phrase }
     * {@link Function }
     * {@link Termdef }
     * {@link Funcsynopsis }
     * {@link Personname }
     * {@link Filename }
     * {@link Glossterm }
     * {@link Fieldsynopsis }
     * {@link Mediaobject }
     * {@link Keycode }
     * {@link Tag }
     * {@link Inlineequation }
     * {@link Bridgehead }
     * {@link Option }
     * {@link Parameter }
     * {@link Screen }
     * {@link Tip }
     * {@link Nonterminal }
     * {@link Property }
     * {@link Optional }
     * {@link Warning }
     * {@link Coref }
     * {@link Segmentedlist }
     * {@link Screenco }
     * {@link Superscript }
     * {@link Table }
     * {@link Command }
     * {@link Constant }
     * {@link Equation }
     * {@link Productionset }
     * {@link Symbol }
     * {@link Classname }
     * {@link Alt }
     * {@link Procedure }
     * {@link Remark }
     * {@link Citebiblioid }
     * {@link Errorname }
     * {@link Abbrev }
     * {@link Accel }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the onclick property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnclick() {
        return onclick;
    }

    /**
     * Sets the value of the onclick property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnclick(String value) {
        this.onclick = value;
    }

    /**
     * Gets the value of the ondblclick property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndblclick() {
        return ondblclick;
    }

    /**
     * Sets the value of the ondblclick property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndblclick(String value) {
        this.ondblclick = value;
    }

    /**
     * Gets the value of the onmousedown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmousedown() {
        return onmousedown;
    }

    /**
     * Sets the value of the onmousedown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmousedown(String value) {
        this.onmousedown = value;
    }

    /**
     * Gets the value of the onmouseup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmouseup() {
        return onmouseup;
    }

    /**
     * Sets the value of the onmouseup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmouseup(String value) {
        this.onmouseup = value;
    }

    /**
     * Gets the value of the onmouseover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmouseover() {
        return onmouseover;
    }

    /**
     * Sets the value of the onmouseover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmouseover(String value) {
        this.onmouseover = value;
    }

    /**
     * Gets the value of the onmousemove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmousemove() {
        return onmousemove;
    }

    /**
     * Sets the value of the onmousemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmousemove(String value) {
        this.onmousemove = value;
    }

    /**
     * Gets the value of the onmouseout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmouseout() {
        return onmouseout;
    }

    /**
     * Sets the value of the onmouseout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmouseout(String value) {
        this.onmouseout = value;
    }

    /**
     * Gets the value of the onkeypress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnkeypress() {
        return onkeypress;
    }

    /**
     * Sets the value of the onkeypress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnkeypress(String value) {
        this.onkeypress = value;
    }

    /**
     * Gets the value of the onkeydown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnkeydown() {
        return onkeydown;
    }

    /**
     * Sets the value of the onkeydown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnkeydown(String value) {
        this.onkeydown = value;
    }

    /**
     * Gets the value of the onkeyup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnkeyup() {
        return onkeyup;
    }

    /**
     * Sets the value of the onkeyup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnkeyup(String value) {
        this.onkeyup = value;
    }

    /**
     * Gets the value of the abbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * Sets the value of the abbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbr(String value) {
        this.abbr = value;
    }

    /**
     * Gets the value of the axis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxis() {
        return axis;
    }

    /**
     * Sets the value of the axis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxis(String value) {
        this.axis = value;
    }

    /**
     * Gets the value of the headers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaders() {
        return headers;
    }

    /**
     * Sets the value of the headers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaders(String value) {
        this.headers = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the rowspan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowspan() {
        return rowspan;
    }

    /**
     * Sets the value of the rowspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowspan(String value) {
        this.rowspan = value;
    }

    /**
     * Gets the value of the colspan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColspan() {
        return colspan;
    }

    /**
     * Sets the value of the colspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColspan(String value) {
        this.colspan = value;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * Gets the value of the char property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChar() {
        return _char;
    }

    /**
     * Sets the value of the char property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChar(String value) {
        this._char = value;
    }

    /**
     * Gets the value of the charoff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharoff() {
        return charoff;
    }

    /**
     * Sets the value of the charoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharoff(String value) {
        this.charoff = value;
    }

    /**
     * Gets the value of the valign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValign() {
        return valign;
    }

    /**
     * Sets the value of the valign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValign(String value) {
        this.valign = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the commonVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonVersion() {
        return commonVersion;
    }

    /**
     * Sets the value of the commonVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonVersion(String value) {
        this.commonVersion = value;
    }

    /**
     * Gets the value of the xmlLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlLang() {
        return xmlLang;
    }

    /**
     * Sets the value of the xmlLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlLang(String value) {
        this.xmlLang = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the remap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemap() {
        return remap;
    }

    /**
     * Sets the value of the remap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemap(String value) {
        this.remap = value;
    }

    /**
     * Gets the value of the xreflabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXreflabel() {
        return xreflabel;
    }

    /**
     * Sets the value of the xreflabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXreflabel(String value) {
        this.xreflabel = value;
    }

    /**
     * Gets the value of the revisionflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionflag() {
        return revisionflag;
    }

    /**
     * Sets the value of the revisionflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionflag(String value) {
        this.revisionflag = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

    /**
     * Gets the value of the arch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArch() {
        return arch;
    }

    /**
     * Sets the value of the arch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArch(String value) {
        this.arch = value;
    }

    /**
     * Gets the value of the audience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudience() {
        return audience;
    }

    /**
     * Sets the value of the audience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudience(String value) {
        this.audience = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the conformance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConformance() {
        return conformance;
    }

    /**
     * Sets the value of the conformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConformance(String value) {
        this.conformance = value;
    }

    /**
     * Gets the value of the os property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOs() {
        return os;
    }

    /**
     * Sets the value of the os property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOs(String value) {
        this.os = value;
    }

    /**
     * Gets the value of the commonRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonRevision() {
        return commonRevision;
    }

    /**
     * Sets the value of the commonRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonRevision(String value) {
        this.commonRevision = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

    /**
     * Gets the value of the userlevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserlevel() {
        return userlevel;
    }

    /**
     * Sets the value of the userlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserlevel(String value) {
        this.userlevel = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the wordsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWordsize() {
        return wordsize;
    }

    /**
     * Sets the value of the wordsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWordsize(String value) {
        this.wordsize = value;
    }

    /**
     * Gets the value of the annotations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotations() {
        return annotations;
    }

    /**
     * Sets the value of the annotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotations(String value) {
        this.annotations = value;
    }

}