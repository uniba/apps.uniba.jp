//
// Session.java
// Project WO-Prototype-Maxsys
//
// Created by andore on 04/12/30
//

import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.eocontrol.*;

public class Session extends WOSession {
    public Session() {
        super();
        
        /* ** Put your per-session initialization code here ** */
    }
    
    public String pageTitle()
    {
    return new java.lang.String("Hello");
    }
	
    public String paragraphText()
    {
	return new java.lang.String("Bdflsdflsdlf");
    }
}
