package classPractice;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private Integer emergencyRoom;
    private String name;
    private String subdividion;



    public String getDistrict() {
        String [] splitted = address.split("\\s");
        district = splitted[0] + " " + splitted[1];
         return district;
    }


    public Hospital (String id,String address,String category,
                     Integer emergencyRoom,String name,String subdividion) {
        this.id = id;
        this.address = address;
        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.name =  name;
        this.subdividion = subdividion;
    }


}
