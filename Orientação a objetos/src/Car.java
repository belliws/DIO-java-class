class Car{

    String color;
    String model;
    int fuelTankCapacity;

    void setColor(String color){
        this.color = color;
    }

    String getColor(){
        return color;
    }

    void setModel(String model){
        this.model = model;
    }

    String getModel(){
        return model;
    }

    void setFuelTankCapacity(int fuelTankCapacity){
        this.fuelTankCapacity = fuelTankCapacity;
    }

    int getFuelTankCapacity(){
        return fuelTankCapacity;
    }

    double tankValueTotal(double gasValue){
        return fuelTankCapacity * gasValue;
    }
    
}
