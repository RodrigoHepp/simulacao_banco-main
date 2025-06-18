package br.com.alura;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import br.com.alura.ExecutarTarefa;

public class TesteMultiplasThreads {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        Instant incio = Instant.now();

        try(ExecutorService e = executor){
            for (int i = 0; i < 10000; i++) {
                var tarefa = new ExecutarTarefa();
                e.execute();
            }
        }

        Instant fim = Instant.now();

        Duration dur = Duration.between(incio, fim);

        System.out.println("Tempo gasto pelas tarefas" + dur.toMillis());
    }
}