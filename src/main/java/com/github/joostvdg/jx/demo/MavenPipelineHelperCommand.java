package com.github.joostvdg.jx.demo;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import com.github.joostvdg.jx.lib.Lib;

@Command(name = "maven-pipeline-helper", description = "...",
        mixinStandardHelpOptions = true)
public class MavenPipelineHelperCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(MavenPipelineHelperCommand.class, args);
    }

    public void run() {
        // business logic here
        Lib lib = new Lib();
        if (verbose) {
            System.out.println(lib.getGreeting());
        }
    }
}
