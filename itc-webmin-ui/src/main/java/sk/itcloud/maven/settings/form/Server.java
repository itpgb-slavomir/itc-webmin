//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.11.08 at 11:05:04 AM CET
//

package sk.itcloud.maven.settings.form;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Element;

import eu.livotov.labs.vaadin.autoforms.ann.FormBean;
import eu.livotov.labs.vaadin.autoforms.ann.FormField;

@FormBean(rows = 3, columns = 3, cancelButtonVisible = false, commitButtonVisible = false, title = "Server")
public class Server
{
	@FormField(title = "Id", location = "0,0", required = true, requiredFieldErrorMessage = "Please enter")
	protected String id;

	@FormField(title = "Username", location = "0,1", required = true, requiredFieldErrorMessage = "Please enter")
	protected String username;

	@FormField(title = "Password", location = "0,2", required = true, requiredFieldErrorMessage = "Please enter")
	protected String password;

	@FormField(title = "Private Key", location = "1,0", required = true, requiredFieldErrorMessage = "Please enter")
	protected String privateKey;

	@FormField(title = "Password", location = "1,1", required = true, requiredFieldErrorMessage = "Please enter")
	protected String passphrase;

	@FormField(title = "File Permissions", location = "2,0", required = true, requiredFieldErrorMessage = "Please enter")
	protected String filePermissions;

	@FormField(title = "Directory Permissions", location = "2,1", required = true, requiredFieldErrorMessage = "Please enter")
	protected String directoryPermissions;

	protected Server.Configuration configuration;

	/**
	 * Gets the value of the username property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * Sets the value of the username property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUsername(String value)
	{
		this.username = value;
	}

	/**
	 * Gets the value of the password property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Sets the value of the password property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPassword(String value)
	{
		this.password = value;
	}

	/**
	 * Gets the value of the privateKey property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrivateKey()
	{
		return privateKey;
	}

	/**
	 * Sets the value of the privateKey property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrivateKey(String value)
	{
		this.privateKey = value;
	}

	/**
	 * Gets the value of the passphrase property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPassphrase()
	{
		return passphrase;
	}

	/**
	 * Sets the value of the passphrase property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPassphrase(String value)
	{
		this.passphrase = value;
	}

	/**
	 * Gets the value of the filePermissions property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFilePermissions()
	{
		return filePermissions;
	}

	/**
	 * Sets the value of the filePermissions property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFilePermissions(String value)
	{
		this.filePermissions = value;
	}

	/**
	 * Gets the value of the directoryPermissions property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDirectoryPermissions()
	{
		return directoryPermissions;
	}

	/**
	 * Sets the value of the directoryPermissions property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDirectoryPermissions(String value)
	{
		this.directoryPermissions = value;
	}

	/**
	 * Gets the value of the configuration property.
	 * 
	 * @return possible object is {@link Server.Configuration }
	 * 
	 */
	public Server.Configuration getConfiguration()
	{
		return configuration;
	}

	/**
	 * Sets the value of the configuration property.
	 * 
	 * @param value
	 *            allowed object is {@link Server.Configuration }
	 * 
	 */
	public void setConfiguration(Server.Configuration value)
	{
		this.configuration = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value)
	{
		this.id = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Configuration
	{
		protected List<Element> any;

		/**
		 * Gets the value of the any property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the any property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getAny().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link Element }
		 * 
		 * 
		 */
		public List<Element> getAny()
		{
			if (any == null)
			{
				any = new ArrayList<Element>();
			}
			return this.any;
		}

	}

}
