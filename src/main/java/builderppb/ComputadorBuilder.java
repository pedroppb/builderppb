package builderppb;
public class ComputadorBuilder {
    private Computador computador;

    public ComputadorBuilder() {
        computador = new Computador();
    }
    public Computador build() {
        if (computador.getCpu().equals("")) {
            throw new IllegalArgumentException("Cpu inválido");
        }
        if (computador.getCpucooler().equals("")) {
            throw new IllegalArgumentException("Cpucooler inválido");
        }
        if (computador.getPlacamae().equals("")) {
            throw new IllegalArgumentException("Placamae inválido");
        }
        if (computador.getRam().isEmpty()) {
            throw new IllegalArgumentException("sem memoria ram");
        }
        if (computador.getPlacaDeVideo().equals("")) {
            throw new IllegalArgumentException("PlacaDeVideo inválido");
        }
        if (computador.getFonte().equals("")) {
            throw new IllegalArgumentException("Fonte inválido");
        }
        return computador;
    }
    public ComputadorBuilder setCpu(String cpu) {
        computador.setCpu(cpu);
        return this;
    }

    public ComputadorBuilder setCpucooler(String cpucooler) {
        computador.setCpucooler(cpucooler);
        return this;
    }

    public ComputadorBuilder setPlacamae(String placamae) {
        computador.setPlacamae(placamae);
        return this;
    }

    public ComputadorBuilder setRam(String ram) {
        computador.setRam(ram);
        return this;
    }

    public ComputadorBuilder setPlacaDeVideo(String placaDeVideo) {
        computador.setPlacaDeVideo(placaDeVideo);
        return this;
    }

    public ComputadorBuilder setFonte(String fonte) {
        computador.setFonte(fonte);
        return this;
    }

    public ComputadorBuilder setGabinete(String gabinete) {
        computador.setGabinete(gabinete);
        return this;
    }

    public ComputadorBuilder setHd(String hd) {
        computador.setHd(hd);
        return this;
    }

    public ComputadorBuilder setSsd(String ssd) {
        computador.setSsd(ssd);
        return this;
    }

    public ComputadorBuilder setFan(String fan) {
        computador.setFan(fan);
        return this;
    }

    public ComputadorBuilder setPlacaExpancao(String placaExpancao) {
        computador.setPlacaExpancao(placaExpancao);
        return this;
    }
}
