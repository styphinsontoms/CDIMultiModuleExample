package com.mycompany.core.api;

import java.util.Locale;
import java.util.Map;

import com.mycompany.core.util.MessageUtils;

/**
 * Implementation of {@link MessagesProvider} for resource bundle.
 */
public abstract class ResourceBundleMessages implements MessagesProvider
{
	//~ Methods ----------------------------------------------------------------

	protected abstract String getBundleName();

	@Override
	public Map<String, String> getMessages(Locale locale)
	{
		return MessageUtils.getMessages(locale, getBundleName());
	}
}
