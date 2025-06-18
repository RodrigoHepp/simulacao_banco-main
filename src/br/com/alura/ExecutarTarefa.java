package br.com.alura;


public class ExecutarTarefa implements Runnable {

    private static CONTADOR = 0;

    @Override
    public void run() {
        CONTADOR++;
        System.out.println("Tarefa executada numero " + CONTADOR + " Inicializada");
    }
}