package oops2.accessmodifier;


public class SamePackageNonSubClass {
    public static void main(String[] args) {
        //NA - private
        VehicleExample v2 = new VehicleExample();
        v2.gears = 10;
        v2.seats = 10;
        v2.brand = "Honda";
//        v2.model = "activa";
        v2.print();
//        System.out.println(v2.model);
        System.out.println(v2.getModel());


    }
}
