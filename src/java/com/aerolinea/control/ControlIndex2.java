
package com.aerolinea.control;

import com.aerolinea.service.ServiceHolaSpring;

//JSF Managed bean
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
//----------------------------------------------

//JSF Managed bean
@ManagedBean
@RequestScoped
public class ControlIndex2  {

    @ManagedProperty("#{ServiceHolaSpring}")
    private ServiceHolaSpring hola;
    
    public ControlIndex2() {
    }
    public String Saludar(){
        return hola.test();
    }

    public ServiceHolaSpring getHola() {
        return hola;
    }

    public void setHola(ServiceHolaSpring hola) {
        this.hola = hola;
    }
    
}
