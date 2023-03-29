package builderppb;

import java.util.ArrayList;

public class Computador {
    private String cpu;
    private String cpucooler;
    private String placamae;
    private ArrayList<String> ram = new ArrayList<>(4);
    private String placaDeVideo;
    private String fonte;
    private String gabinete;
    private ArrayList<String> hd = new ArrayList<>(6);
    private ArrayList<String> ssd = new ArrayList<>(4);
    private ArrayList<String> fan = new ArrayList<>(20);
    private ArrayList<String> placaExpancao = new ArrayList<>(7);
    public Computador() {
        this.cpu = "";
        this.cpucooler = "";
        this.placamae = "";
        this.ram.clear();
        this.placaDeVideo = "";
        this.fonte = "";
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCpucooler() {
        return cpucooler;
    }

    public void setCpucooler(String cpucooler) {
        this.cpucooler = cpucooler;
    }

    public String getPlacamae() {
        return placamae;
    }

    public void setPlacamae(String placamae) {
        this.placamae = placamae;
    }

    public ArrayList<String> getRam() {
        return ram;
    }

    public void setRam(String ram) {
        if(this.ram.size() < 4)
            this.ram.add(ram);
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    public ArrayList<String> getHd() {
        return hd;
    }

    public void setHd(String hd) {
        if(this.hd.size() < 6)
            this.hd.add(hd);
    }

    public ArrayList<String> getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        if(this.ssd.size() < 4)
            this.ssd.add(ssd);
    }

    public ArrayList<String> getFan() {
        return fan;
    }

    public void setFan(String fan) {
        if(this.fan.size() < 20)
            this.fan.add(fan);
    }

    public ArrayList<String> getPlacaExpancao() {
        return placaExpancao;
    }

    public void setPlacaExpancao(String placaExpancao) {
        if(this.placaExpancao.size() < 7)
            this.placaExpancao.add(placaExpancao);
    }
}
