package sk.itcloud.maven.model.form;

import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
import eu.livotov.labs.vaadin.autoforms.ann.FormBean;
import eu.livotov.labs.vaadin.autoforms.ann.FormField;
import eu.livotov.labs.vaadin.autoforms.api.FormFieldType;

@FormBean(rows = 4, columns = 2, cancelButtonVisible = false, commitButtonVisible = false, title = "Artifact")
public class Model implements Serializable
{

	protected String modelVersion = "4.0";

	protected Parent parent;

	@FormField(title = "Group Id", location = "0,0", required = true, requiredFieldErrorMessage = "Please enter connection")
	protected String groupId;

	@FormField(title = "Artifact Id", location = "0,1", required = true, requiredFieldErrorMessage = "Please enter connection")
	protected String artifactId;

	@FormField(title = "Version", location = "0,2", required = true, requiredFieldErrorMessage = "Please enter connection")
	protected String version;

	@FormField(title = "Packaging", location = "0,3", required = true, requiredFieldErrorMessage = "Please enter connection")
	protected String packaging = "jar";

	@FormField(title = "Name", location = "1,0", required = true, requiredFieldErrorMessage = "Please enter connection")
	protected String name;

	@FormField(title = "Description", location = "1,1", required = true, requiredFieldErrorMessage = "Please enter connection", type = FormFieldType.Text)
	protected String description;

	@FormField(title = "Url", location = "1,2", required = true, requiredFieldErrorMessage = "Please enter connection")
	protected String url;

	@FormField(title = "Inception Year", location = "1,3", required = true, requiredFieldErrorMessage = "Please enter connection", type = FormFieldType.Integer)
	protected String inceptionYear;

	protected Organization organization;
	protected Model.Licenses licenses;
	protected Model.Developers developers;
	protected Model.Contributors contributors;
	protected Model.MailingLists mailingLists;
	protected Prerequisites prerequisites;
	protected Model.Modules modules;
	protected Scm scm;
	protected IssueManagement issueManagement;
	protected CiManagement ciManagement;
	protected DistributionManagement distributionManagement;
	protected Model.Properties properties;
	protected DependencyManagement dependencyManagement;
	protected Model.Dependencies dependencies;
	protected Model.Repositories repositories;
	protected Model.PluginRepositories pluginRepositories;
	protected Build build;
	protected Model.Reports reports;
	protected Reporting reporting;
	protected Model.Profiles profiles;

	/**
	 * Gets the value of the modelVersion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModelVersion()
	{
		return modelVersion;
	}

	/**
	 * Sets the value of the modelVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModelVersion(String value)
	{
		this.modelVersion = value;
	}

	/**
	 * Gets the value of the parent property.
	 * 
	 * @return possible object is {@link Parent }
	 * 
	 */
	public Parent getParent()
	{
		return parent;
	}

	/**
	 * Sets the value of the parent property.
	 * 
	 * @param value
	 *            allowed object is {@link Parent }
	 * 
	 */
	public void setParent(Parent value)
	{
		this.parent = value;
	}

	/**
	 * Gets the value of the groupId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGroupId()
	{
		return groupId;
	}

	/**
	 * Sets the value of the groupId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGroupId(String value)
	{
		this.groupId = value;
	}

	/**
	 * Gets the value of the artifactId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArtifactId()
	{
		return artifactId;
	}

	/**
	 * Sets the value of the artifactId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArtifactId(String value)
	{
		this.artifactId = value;
	}

	/**
	 * Gets the value of the version property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersion()
	{
		return version;
	}

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersion(String value)
	{
		this.version = value;
	}

	/**
	 * Gets the value of the packaging property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPackaging()
	{
		return packaging;
	}

	/**
	 * Sets the value of the packaging property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPackaging(String value)
	{
		this.packaging = value;
	}

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
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value)
	{
		this.description = value;
	}

	/**
	 * Gets the value of the url property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUrl()
	{
		return url;
	}

	/**
	 * Sets the value of the url property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUrl(String value)
	{
		this.url = value;
	}

	/**
	 * Gets the value of the inceptionYear property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInceptionYear()
	{
		return inceptionYear;
	}

	/**
	 * Sets the value of the inceptionYear property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInceptionYear(String value)
	{
		this.inceptionYear = value;
	}

	/**
	 * Gets the value of the organization property.
	 * 
	 * @return possible object is {@link Organization }
	 * 
	 */
	public Organization getOrganization()
	{
		return organization;
	}

	/**
	 * Sets the value of the organization property.
	 * 
	 * @param value
	 *            allowed object is {@link Organization }
	 * 
	 */
	public void setOrganization(Organization value)
	{
		this.organization = value;
	}

	/**
	 * Gets the value of the licenses property.
	 * 
	 * @return possible object is {@link Model.Licenses }
	 * 
	 */
	public Model.Licenses getLicenses()
	{
		return licenses;
	}

	/**
	 * Sets the value of the licenses property.
	 * 
	 * @param value
	 *            allowed object is {@link Model.Licenses }
	 * 
	 */
	public void setLicenses(Model.Licenses value)
	{
		this.licenses = value;
	}

	/**
	 * Gets the value of the developers property.
	 * 
	 * @return possible object is {@link Model.Developers }
	 * 
	 */
	public Model.Developers getDevelopers()
	{
		return developers;
	}

	/**
	 * Sets the value of the developers property.
	 * 
	 * @param value
	 *            allowed object is {@link Model.Developers }
	 * 
	 */
	public void setDevelopers(Model.Developers value)
	{
		this.developers = value;
	}

	/**
	 * Gets the value of the contributors property.
	 * 
	 * @return possible object is {@link Model.Contributors }
	 * 
	 */
	public Model.Contributors getContributors()
	{
		return contributors;
	}

	/**
	 * Sets the value of the contributors property.
	 * 
	 * @param value
	 *            allowed object is {@link Model.Contributors }
	 * 
	 */
	public void setContributors(Model.Contributors value)
	{
		this.contributors = value;
	}

	/**
	 * Gets the value of the mailingLists property.
	 * 
	 * @return possible object is {@link Model.MailingLists }
	 * 
	 */
	public Model.MailingLists getMailingLists()
	{
		return mailingLists;
	}

	/**
	 * Sets the value of the mailingLists property.
	 * 
	 * @param value
	 *            allowed object is {@link Model.MailingLists }
	 * 
	 */
	public void setMailingLists(Model.MailingLists value)
	{
		this.mailingLists = value;
	}

	/**
	 * Gets the value of the prerequisites property.
	 * 
	 * @return possible object is {@link Prerequisites }
	 * 
	 */
	public Prerequisites getPrerequisites()
	{
		return prerequisites;
	}

	/**
	 * Sets the value of the prerequisites property.
	 * 
	 * @param value
	 *            allowed object is {@link Prerequisites }
	 * 
	 */
	public void setPrerequisites(Prerequisites value)
	{
		this.prerequisites = value;
	}

	/**
	 * Gets the value of the modules property.
	 * 
	 * @return possible object is {@link Model.Modules }
	 * 
	 */
	public Model.Modules getModules()
	{
		return modules;
	}

	/**
	 * Sets the value of the modules property.
	 * 
	 * @param value
	 *            allowed object is {@link Model.Modules }
	 * 
	 */
	public void setModules(Model.Modules value)
	{
		this.modules = value;
	}

	/**
	 * Gets the value of the scm property.
	 * 
	 * @return possible object is {@link Scm }
	 * 
	 */
	public Scm getScm()
	{
		return scm;
	}

	/**
	 * Sets the value of the scm property.
	 * 
	 * @param value
	 *            allowed object is {@link Scm }
	 * 
	 */
	public void setScm(Scm value)
	{
		this.scm = value;
	}

	/**
	 * Gets the value of the issueManagement property.
	 * 
	 * @return possible object is {@link IssueManagement }
	 * 
	 */
	public IssueManagement getIssueManagement()
	{
		return issueManagement;
	}

	/**
	 * Sets the value of the issueManagement property.
	 * 
	 * @param value
	 *            allowed object is {@link IssueManagement }
	 * 
	 */
	public void setIssueManagement(IssueManagement value)
	{
		this.issueManagement = value;
	}

	/**
	 * Gets the value of the ciManagement property.
	 * 
	 * @return possible object is {@link CiManagement }
	 * 
	 */
	public CiManagement getCiManagement()
	{
		return ciManagement;
	}

	/**
	 * Sets the value of the ciManagement property.
	 * 
	 * @param value
	 *            allowed object is {@link CiManagement }
	 * 
	 */
	public void setCiManagement(CiManagement value)
	{
		this.ciManagement = value;
	}

	/**
	 * Gets the value of the distributionManagement property.
	 * 
	 * @return possible object is {@link DistributionManagement }
	 * 
	 */
	public DistributionManagement getDistributionManagement()
	{
		return distributionManagement;
	}

	/**
	 * Sets the value of the distributionManagement property.
	 * 
	 * @param value
	 *            allowed object is {@link DistributionManagement }
	 * 
	 */
	public void setDistributionManagement(DistributionManagement value)
	{
		this.distributionManagement = value;
	}

	/**
	 * Gets the value of the properties property.
	 * 
	 * @return possible object is {@link Model.Properties }
	 * 
	 */
	public Model.Properties getProperties()
	{
		return properties;
	}

	/**
	 * Sets the value of the properties property.
	 * 
	 * @param value
	 *            allowed object is {@link Model.Properties }
	 * 
	 */
	public void setProperties(Model.Properties value)
	{
		this.properties = value;
	}

	/**
	 * Gets the value of the dependencyManagement property.
	 * 
	 * @return possible object is {@link DependencyManagement }
	 * 
	 */
	public DependencyManagement getDependencyManagement()
	{
		return dependencyManagement;
	}

	/**
	 * Sets the value of the dependencyManagement property.
	 * 
	 * @param value
	 *            allowed object is {@link DependencyManagement }
	 * 
	 */
	public void setDependencyManagement(DependencyManagement value)
	{
		this.dependencyManagement = value;
	}

	/**
	 * Gets the value of the dependencies property.
	 * 
	 * @return possible object is {@link Model.Dependencies }
	 * 
	 */
	public Model.Dependencies getDependencies()
	{
		return dependencies;
	}

	/**
	 * Sets the value of the dependencies property.
	 * 
	 * @param value
	 *            allowed object is {@link Model.Dependencies }
	 * 
	 */
	public void setDependencies(Model.Dependencies value)
	{
		this.dependencies = value;
	}

	/**
	 * Gets the value of the repositories property.
	 * 
	 * @return possible object is {@link Model.Repositories }
	 * 
	 */
	public Model.Repositories getRepositories()
	{
		return repositories;
	}

	/**
	 * Sets the value of the repositories property.
	 * 
	 * @param value
	 *            allowed object is {@link Model.Repositories }
	 * 
	 */
	public void setRepositories(Model.Repositories value)
	{
		this.repositories = value;
	}

	/**
	 * Gets the value of the pluginRepositories property.
	 * 
	 * @return possible object is {@link Model.PluginRepositories }
	 * 
	 */
	public Model.PluginRepositories getPluginRepositories()
	{
		return pluginRepositories;
	}

	/**
	 * Sets the value of the pluginRepositories property.
	 * 
	 * @param value
	 *            allowed object is {@link Model.PluginRepositories }
	 * 
	 */
	public void setPluginRepositories(Model.PluginRepositories value)
	{
		this.pluginRepositories = value;
	}

	/**
	 * Gets the value of the build property.
	 * 
	 * @return possible object is {@link Build }
	 * 
	 */
	public Build getBuild()
	{
		return build;
	}

	/**
	 * Sets the value of the build property.
	 * 
	 * @param value
	 *            allowed object is {@link Build }
	 * 
	 */
	public void setBuild(Build value)
	{
		this.build = value;
	}

	/**
	 * Gets the value of the reports property.
	 * 
	 * @return possible object is {@link Model.Reports }
	 * 
	 */
	public Model.Reports getReports()
	{
		return reports;
	}

	/**
	 * Sets the value of the reports property.
	 * 
	 * @param value
	 *            allowed object is {@link Model.Reports }
	 * 
	 */
	public void setReports(Model.Reports value)
	{
		this.reports = value;
	}

	/**
	 * Gets the value of the reporting property.
	 * 
	 * @return possible object is {@link Reporting }
	 * 
	 */
	public Reporting getReporting()
	{
		return reporting;
	}

	/**
	 * Sets the value of the reporting property.
	 * 
	 * @param value
	 *            allowed object is {@link Reporting }
	 * 
	 */
	public void setReporting(Reporting value)
	{
		this.reporting = value;
	}

	/**
	 * Gets the value of the profiles property.
	 * 
	 * @return possible object is {@link Model.Profiles }
	 * 
	 */
	public Model.Profiles getProfiles()
	{
		return profiles;
	}

	/**
	 * Sets the value of the profiles property.
	 * 
	 * @param value
	 *            allowed object is {@link Model.Profiles }
	 * 
	 */
	public void setProfiles(Model.Profiles value)
	{
		this.profiles = value;
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
	 *         &lt;element name="contributor" type="{http://maven.apache.org/POM/4.0.0}Contributor" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Contributors
	{

		protected List<Contributor> contributor;

		/**
		 * Gets the value of the contributor property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the contributor property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getContributor().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link Contributor }
		 * 
		 * 
		 */
		public List<Contributor> getContributor()
		{
			if (contributor == null)
			{
				contributor = new ArrayList<Contributor>();
			}
			return this.contributor;
		}

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
	 *         &lt;element name="dependency" type="{http://maven.apache.org/POM/4.0.0}Dependency" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Dependencies
	{

		protected List<Dependency> dependency;

		/**
		 * Gets the value of the dependency property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the dependency property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getDependency().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link Dependency }
		 * 
		 * 
		 */
		public List<Dependency> getDependency()
		{
			if (dependency == null)
			{
				dependency = new ArrayList<Dependency>();
			}
			return this.dependency;
		}

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
	 *         &lt;element name="developer" type="{http://maven.apache.org/POM/4.0.0}Developer" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Developers
	{

		protected List<Developer> developer;

		/**
		 * Gets the value of the developer property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the developer property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getDeveloper().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link Developer }
		 * 
		 * 
		 */
		public List<Developer> getDeveloper()
		{
			if (developer == null)
			{
				developer = new ArrayList<Developer>();
			}
			return this.developer;
		}

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
	 *         &lt;element name="license" type="{http://maven.apache.org/POM/4.0.0}License" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Licenses
	{

		protected List<License> license;

		/**
		 * Gets the value of the license property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the license property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getLicense().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link License }
		 * 
		 * 
		 */
		public List<License> getLicense()
		{
			if (license == null)
			{
				license = new ArrayList<License>();
			}
			return this.license;
		}

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
	 *         &lt;element name="mailingList" type="{http://maven.apache.org/POM/4.0.0}MailingList" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class MailingLists
	{

		protected List<MailingList> mailingList;

		/**
		 * Gets the value of the mailingList property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the mailingList property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getMailingList().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link MailingList }
		 * 
		 * 
		 */
		public List<MailingList> getMailingList()
		{
			if (mailingList == null)
			{
				mailingList = new ArrayList<MailingList>();
			}
			return this.mailingList;
		}

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
	 *         &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Modules
	{

		protected List<String> module;

		/**
		 * Gets the value of the module property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the module property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getModule().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link String }
		 * 
		 * 
		 */
		public List<String> getModule()
		{
			if (module == null)
			{
				module = new ArrayList<String>();
			}
			return this.module;
		}

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
	 *         &lt;element name="pluginRepository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class PluginRepositories
	{

		protected List<Repository> pluginRepository;

		/**
		 * Gets the value of the pluginRepository property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the pluginRepository property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getPluginRepository().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link Repository }
		 * 
		 * 
		 */
		public List<Repository> getPluginRepository()
		{
			if (pluginRepository == null)
			{
				pluginRepository = new ArrayList<Repository>();
			}
			return this.pluginRepository;
		}

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
	 *         &lt;element name="profile" type="{http://maven.apache.org/POM/4.0.0}Profile" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Profiles
	{

		protected List<Profile> profile;

		/**
		 * Gets the value of the profile property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the profile property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getProfile().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link Profile }
		 * 
		 * 
		 */
		public List<Profile> getProfile()
		{
			if (profile == null)
			{
				profile = new ArrayList<Profile>();
			}
			return this.profile;
		}

	}

	public static class Properties
	{

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
	public static class Reports
	{
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
	 *         &lt;element name="repository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Repositories
	{

		protected List<Repository> repository;

		/**
		 * Gets the value of the repository property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the repository property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getRepository().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link Repository }
		 * 
		 * 
		 */
		public List<Repository> getRepository()
		{
			if (repository == null)
			{
				repository = new ArrayList<Repository>();
			}
			return this.repository;
		}

	}

}