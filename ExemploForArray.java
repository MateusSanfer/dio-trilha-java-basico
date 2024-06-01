public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Felipe ","Jonas", "Holaue", "MArcos"};

//        for (int x =0 ; x < alunos.length; x++){
//            System.out.println("O Aluno no no índice x = "+ x + " é " + alunos[x]);
//        }

        // For each = muito utilizado para for com array
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
