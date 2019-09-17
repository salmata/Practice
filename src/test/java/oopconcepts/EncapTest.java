package oopconcepts;

public class EncapTest {
    private String name;
    private String  idNo;
    private int age;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getIdNo(){
        return idNo;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setName( String newName){
        name = newName;
    }
    public void setidNo(String newidNo){
        idNo = newidNo;
    }
}

    class RunEncap{
    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName(" Rayan");
        encap.setAge(20);
        encap.setidNo("235982");
        System.out.println("name:" + encap.getName()+" ; " + "Age:"+ encap.getAge());

    }
}

