class TesteIgualdade3 {
    public static void main(String[] args) {
        String frase1;
        String frase2;
        frase1 = new String ("Testando igualdade!");
        frase2 = new String ("Testando igualdade!");
        System.out.println("Frase 1:" + frase1);
        System.out.println("Frase 2:" + frase2);
        System.out.println("Frase 1 e Frase 2 possuem o mesmo conteudo?" +(frase1.equals(frase2)));
        
    }
}