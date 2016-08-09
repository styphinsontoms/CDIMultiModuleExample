package com.mycompany.modulea.service;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.mycompany.core.api.AbstractModuleDescription;
import com.mycompany.core.api.ModuleDescription;
import com.mycompany.core.presentation.MessagesProxy;


/**
 * Module specific implementation of the {@link ModuleDescription}.
 */
@ApplicationScoped
@Named
public class ModADescription extends AbstractModuleDescription implements Serializable
{
	//~ Instance fields --------------------------------------------------------

	@Inject
	private MessagesProxy msgs;

	//~ Methods ----------------------------------------------------------------

	@Override
	public String getName()
	{
		return msgs.get("a.modName");
	}

	@Override
	public String getDescription()
	{
		return msgs.get("a.modDesc");
	}

	@Override
	public String getPrefix()
	{
		return "moda";
	}

	@Override
	public String getUrl()
	{
		return "/moda/views/hello.jsf";
	}
}
