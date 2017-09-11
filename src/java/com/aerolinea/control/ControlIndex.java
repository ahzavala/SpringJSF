
package com.aerolinea.control;

import com.aerolinea.service.ServiceHolaSpring;
//CDI
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
//----------------------------------------------

//CDI
@Named
@RequestScoped
public class ControlIndex  {

    @Inject
    private ServiceHolaSpring serviceHolaSpring;
    
    public ControlIndex() {
    }
    public String Saludar(){
        return serviceHolaSpring.test();
    }
    
}
