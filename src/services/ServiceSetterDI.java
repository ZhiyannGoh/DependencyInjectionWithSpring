package services;

import components.SampleComponent;

public class ServiceSetterDI {

    private SampleComponent sampleComponent;

    public ServiceSetterDI() {
        System.out.println("Setter Dependency Injection is initialized without param");
    }
    
    public void setSampleComponent(SampleComponent sampleComponent) {
        this.sampleComponent = sampleComponent;
        System.out.println("Setter Dependency Injection is initialized with param");
        boolean isCreated = sampleComponent == null;
        System.out.println("Setter Dependency Injection is sampleComponent null -> " + isCreated);
    }
}
