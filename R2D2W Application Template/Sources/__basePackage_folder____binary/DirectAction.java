// Generated by the WOLips Template engine Plug-in at Jan 10, 2010 12:00:00 PM
package ${basePackage};

import com.webobjects.appserver.WORequest;

import er.directtoweb.ERD2WDirectAction;

public class DirectAction extends ERD2WDirectAction {
	public DirectAction(WORequest request) {
		super(request);
	}

    /**
     * Checks if a page configuration is allowed to render.
     * @param pageConfiguration
     */
    protected boolean allowPageConfiguration(String pageConfiguration) {
        return true;
    }
}
