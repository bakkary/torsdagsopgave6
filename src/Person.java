public class Person {
  public String navn;


    private Person(String navn){ //tjek om kan laves private
       this.navn = navn;

    }


    public String getNavn() {

        return navn;
    }

    public void setNavn(String navn) {

        this.navn = navn;
    }





  public boolean addCourse(String course){


        return true;
    }
}


