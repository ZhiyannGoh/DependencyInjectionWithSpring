package services;

import components.SampleComponent;

public class ServiceFieldDI {

    private SampleComponent sampleComponent;

    public ServiceFieldDI(){
        System.out.println("Field Dependency Injection is initialized without param");
        boolean isCreated = sampleComponent == null;
        System.out.println("Field Dependency Injection is sampleComponent null -> " + isCreated);
    }

}
