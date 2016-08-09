package com.mycompany.core.messages;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.mycompany.core.api.ResourceBundleMessages;

/**
 * Module specific extension of the {@link com.mycompany.core.api.ResourceBundleMessages}.
 */
@ApplicationScoped
@Named
public class JsfToolkitMessages extends ResourceBundleMessages
{
	//~ Methods ----------------------------------------------------------------

	@Override
	protected String getBundleName()
	{
		return "jsftoolkit";
	}
}
