package org.example.creational.factoryMethod;

public abstract class VehicleFactory {

    // methode bastract dans classe abstract force a utiliser
    // la methode pour les enfants

    public abstract Vehicle createVehicle();

}
