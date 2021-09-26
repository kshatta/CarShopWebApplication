package com.sample;
import com.sample.model.CarMake;

import java.util.ArrayList;
import java.util.List;


public class CarService {

    public List getAvailableBrands(CarMake make){

        List brands = new ArrayList();

        if(type.equals(CarMake.Honda)){
            brands.add(“CRV”);
            brands.add((“Accord”));

        }else if(type.equals(CarMake.VolksWagen)){
            brands.add(“Jetta”);
            brands.add(“Passat”);

        }else if(type.equals(CarMake.BMW)){
            brands.add(“X5”);

        }else {
            brands.add("No Brand Available");
        }
    return brands;
    }
}
