package sk.itcloud.maven.settings.views;

import java.util.List;
import org.apache.maven.settings.Repository;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class RepositoriesView extends GridMasterVertical implements View
{

	public static final String VIEW_NAME = "Repositories";

	public RepositoriesView(List<Repository> repositories)
	{
		super();
		table.setContainerDataSource(new BeanItemContainer<Repository>(Repository.class, repositories));
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}