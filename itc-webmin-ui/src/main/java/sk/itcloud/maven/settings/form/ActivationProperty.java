//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.11.08 at 11:05:04 AM CET
//

package sk.itcloud.maven.settings.form;

import eu.livotov.labs.vaadin.autoforms.ann.FormBean;
import eu.livotov.labs.vaadin.autoforms.ann.FormField;

@FormBean(rows = 2, columns = 1, cancelButtonVisible = false, commitButtonVisible = false, title = "Activation Property")
public class ActivationProperty
{

	@FormField(title = "Name", location = "0,0", required = true, requiredFieldErrorMessage = "Please enter")
	protected String name;

	@FormField(title = "Value", location = "0,1", required = true, requiredFieldErrorMessage = "Please enter")
	protected String value;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value)
	{
		this.name = value;
	}

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value)
	{
		this.value = value;
	}

}
