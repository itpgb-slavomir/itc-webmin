package sk.itcloud.maven.settings.views;

import java.util.HashMap;
import java.util.Map;

import org.apache.xmlrpc.XmlRpcException;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.Page;
import com.vaadin.server.Resource;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.Command;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Responsive navigation menu presenting a list of available views to the user.
 */
public class SettingsMenu extends CssLayout
{

	private static final String VALO_MENUITEMS = "valo-menuitems";

	private static final String VALO_MENU_TOGGLE = "valo-menu-toggle";

	private static final String VALO_MENU_VISIBLE = "valo-menu-visible";

	private Navigator navigator;

	private Map<String, Button> viewButtons = new HashMap<String, Button>();

	private CssLayout menuItemsLayout;

	private CssLayout menuPart;

	public SettingsMenu(Navigator navigator)
	{
		this.navigator = navigator;

		setPrimaryStyleName(ValoTheme.MENU_ROOT);

		menuPart = new CssLayout();

		// button for toggling the visibility of the menu when on a small screen
		final Button showMenu = new Button("Menu", new ClickListener()
		{

			@Override
			public void buttonClick(final ClickEvent event)
			{

				if (menuPart.getStyleName().contains(VALO_MENU_VISIBLE))
				{
					menuPart.removeStyleName(VALO_MENU_VISIBLE);
				} else
				{
					menuPart.addStyleName(VALO_MENU_VISIBLE);
				}

			}
		});

		showMenu.addStyleName(ValoTheme.BUTTON_PRIMARY);
		showMenu.addStyleName(ValoTheme.BUTTON_SMALL);
		showMenu.addStyleName(VALO_MENU_TOGGLE);
		showMenu.setIcon(FontAwesome.NAVICON);

		menuPart.addComponent(showMenu);

		// container for the navigation buttons, which are added by addView()
		menuItemsLayout = new CssLayout();
		menuItemsLayout.setPrimaryStyleName(VALO_MENUITEMS);
		menuPart.addComponent(menuItemsLayout);

		addComponent(menuPart);
	}

	/**
	 * Register a pre-created view instance in the navigation menu and in the {@link Navigator}.
	 *
	 * @see Navigator#addView(String, View)
	 *
	 * @param view
	 *            view instance to register
	 * @param name
	 *            view name
	 * @param caption
	 *            view caption in the menu
	 * @param icon
	 *            view icon in the menu
	 */
	public void addView(View view, final String name, String caption)
	{
		navigator.addView(name, view);
		createViewButton(name, caption);
	}

	/**
	 * Register a view in the navigation menu and in the {@link Navigator} based on a view class.
	 *
	 * @see Navigator#addView(String, Class)
	 *
	 * @param viewClass
	 *            class of the views to create
	 * @param name
	 *            view name
	 * @param caption
	 *            view caption in the menu
	 * @param icon
	 *            view icon in the menu
	 */
	public void addView(Class<? extends View> viewClass, final String name, String caption)
	{
		navigator.addView(name, viewClass);
		createViewButton(name, caption);
	}

	private void createViewButton(final String name, String caption)
	{

		Button button = new Button(caption, new ClickListener()
		{

			@Override
			public void buttonClick(ClickEvent event)
			{
				navigator.navigateTo(name);

			}
		});
		button.setPrimaryStyleName(ValoTheme.MENU_ITEM);
		menuItemsLayout.addComponent(button);
		viewButtons.put(name, button);
	}

	/**
	 * Highlights a view navigation button as the currently active view in the menu. This method does not perform the actual navigation.
	 *
	 * @param viewName
	 *            the name of the view to show as active
	 */
	public void setActiveView(String viewName)
	{
		for (Button button : viewButtons.values())
		{
			button.removeStyleName("selected");
		}
		Button selected = viewButtons.get(viewName);
		if (selected != null)
		{
			selected.addStyleName("selected");
		}
		menuPart.removeStyleName(VALO_MENU_VISIBLE);
	}
}