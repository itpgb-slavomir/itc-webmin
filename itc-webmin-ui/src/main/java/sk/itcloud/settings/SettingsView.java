
package sk.itcloud.settings;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.TabSheet;

public class SettingsView extends TabSheet implements View
{

	public static final String VIEW_NAME = "Settings";

	public SettingsView()
	{
		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		addTab(new Settings("/var/www/jahman/.m2/settings.xml"), "User Settings");
		addTab(new Settings("/usr/share/maven/conf/settings.xml"), "Global Settings");

	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}