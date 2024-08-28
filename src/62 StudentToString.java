  class StudentToString{
    String name;

    int age;

    String rollNumber;

    String house;

    public StudentToString(String name,int age,String rollNumber,String house){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;

    }

     public String toString(){
        return "Student Details:{name:"+
                name +",age:"+age +
                ",roll Number:" + rollNumber
                +",house:"+house+" }";

     }

     public static void main(String[] args) {
         StudentToString stu = new StudentToString("Prashant" ,
                 18 ,

                 "31" ,


                 "KalaBhawan");
         System.out.println(stu);
     }


}
