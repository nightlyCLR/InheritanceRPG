package rivera.mcm.edu.ph.inheritancerpg;

public class Monsters extends Chara {
    private String desc;

    public Monsters(int id,
                    double basehp,
                    double basemp,
                    double patk,
                    double matk,
                    double pdef,
                    double mdef,
                    String desc) {
        super(id, basehp, basemp, patk, matk, pdef, mdef);
        this.desc = desc;
    }


    //Imported
    public void setId(int id) {
        super.setId(id);
    }
    public void setBasehp(double basehp) {
        super.setBasehp(basehp);
    }
    public void setBasemp(double basemp) {
        super.setBasemp(basemp);
    }
    public void setPatk(double patk) {
        super.setPatk(patk);
    }
    public void setMatk(double matk) {
        super.setMatk(matk);
    }
    public void setPdef(double pdef) {
        super.setPdef(pdef);
    }
    public void setMdef(double mdef) {
        super.setMdef(mdef);
    }

    public double getBasehp() {
        return super.getBasehp();
    }
    public double getBasemp() {
        return super.getBasemp();
    }
    public double getPatk() {
        return super.getPatk();
    }
    public double getMatk() {
        return super.getMatk();
    }
    public double getMdef() {
        return super.getMdef();
    }
    public double getPdef() {
        return super.getPdef();
    }

    //Local
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }
}
