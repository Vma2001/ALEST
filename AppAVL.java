package T3_classe_AVL_completa;

public class AppAVL {
    public static void main(String[] args) {
        //50, 30, 70, 10, 40, 35
        ArvoreAVL a = new ArvoreAVL();
        a.adicionar(80);
        a.adicionar(90);
        a.adicionar(200);

        a.imprimirArvore();
        a.percorrerEmPreOrdem();
    }
}
