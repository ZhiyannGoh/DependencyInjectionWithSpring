package services;

import components.SampleComponent;

public class ServiceConstructorDI {

    private SampleComponent sampleComponent;

    public ServiceConstructorDI(SampleComponent sampleComponent) {
        this.sampleComponent = sampleComponent;
        System.out.println("Constructor Dependency Injection is initialized with param");
        boolean isCreated = sampleComponent == null;
        System.out.println("Constructor Dependency Injection is sampleComponent null -> " + isCreated);
    }


}
