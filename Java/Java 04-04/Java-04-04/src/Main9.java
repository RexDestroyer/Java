class Main9 {

    String Idiomas;

    Main9 (String falado) {
         Idiomas = falado;
         System.out.println(Idiomas + " É falado no mundo");
    }

    public static void main(String[] args) {
       Main9 obj1 = new Main9("Alemão");
       Main9 obj2 = new Main9("Inglês");
       Main9 obj3 = new Main9("Português");
       System.out.println(obj1.Idiomas);



    }










}
