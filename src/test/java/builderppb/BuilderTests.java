package builderppb;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BuilderTests {
    @Test
    void deveRetornarExcecaoSemCpu() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setCpucooler("water cooler")
                    .setPlacamae("b450m stell legends")
                    .setRam("1x8 netac")
                    .setPlacaDeVideo("integrada")
                    .setFonte("650w")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cpu inválido", e.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoSemCpucooler() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setCpu("ryzen 7")
                    .setPlacamae("b450m stell legends")
                    .setRam("1x8 netac")
                    .setPlacaDeVideo("integrada")
                    .setFonte("650w")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cpucooler inválido", e.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoSemPlacamae() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setCpu("ryzen 7")
                    .setCpucooler("water cooler")
                    .setRam("1x8 netac")
                    .setPlacaDeVideo("integrada")
                    .setFonte("650w")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Placamae inválido", e.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoSemRam() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setCpu("ryzen 7")
                    .setCpucooler("water cooler")
                    .setPlacamae("b450m stell legends")
                    .setPlacaDeVideo("integrada")
                    .setFonte("650w")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("sem memoria ram", e.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoSemPlacaDeVideo() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setCpu("ryzen 7")
                    .setCpucooler("water cooler")
                    .setPlacamae("b450m stell legends")
                    .setRam("1x8 netac")
                    .setFonte("650w")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("PlacaDeVideo inválido", e.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoSemFonte() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setCpu("ryzen 7")
                    .setCpucooler("water cooler")
                    .setPlacamae("b450m stell legends")
                    .setRam("1x8 netac")
                    .setPlacaDeVideo("integrada")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fonte inválido", e.getMessage());
        }
    }
    @Test
    void deveRetornarComputadorValido() {
        ComputadorBuilder computadorBuilder = new ComputadorBuilder();
        Computador computador = computadorBuilder
                .setCpu("ryzen 7")
                .setCpucooler("water cooler")
                .setPlacamae("b450m stell legends")
                .setRam("1x8 netac")
                .setPlacaDeVideo("integrada")
                .setFonte("650w")
                .build();
        assertNotNull(computador);
    }

}
