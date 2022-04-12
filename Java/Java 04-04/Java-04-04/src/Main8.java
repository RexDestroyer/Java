 class Main8 {
    private String nome;
    int x, y, z;
    //constutor
    Main8() {
        System.out.println("The Best Game:");
        nome = "Albion Online é um MMORPG Sandbox em que você escreve sua própria história em vez de um caminho pré determinado.";
        x = 5;
        y = 6;
        z = x+y;
    }
     public static void main(String[] args) {
         Main8 obj = new Main8();
         System.out.println("\nO que é Albion Online? " + obj.nome + "\n");
         System.out.println(obj.z + "\n");
        }




}
