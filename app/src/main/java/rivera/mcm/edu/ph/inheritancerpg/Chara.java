package rivera.mcm.edu.ph.inheritancerpg;

public class Chara {
    private int id;
    private double basehp, basemp, patk, matk,pdef,mdef;

    public Chara(int id,
                 double basehp,
                 double basemp,
                 double patk,
                 double matk,
                 double pdef,
                 double mdef){
        this.id=id;
        this.basehp=basehp;
        this.basemp=basemp;
        this.patk=patk;
        this.matk=matk;
        this.mdef = mdef;
        this.pdef=pdef;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setBasehp(double basehp){
        this.basemp=basehp;
    }
    public void setBasemp(double basemp){
        this.basemp=basemp;
    }
    public void setPatk(double patk){
        this.patk=patk;
    }
    public void setMatk(double matk){
        this.matk=matk;
    }
    public void setMdef(double mdef){
        this.mdef=mdef;
    }
    public void setPdef(double pdef){
        this.pdef=pdef;
    }



    public double getBasehp() {
        return basehp;
    }
    public double getBasemp() {
        return basemp;
    }
    public double getPatk() {
        return patk;
    }
    public double getMatk() {
        return matk;
    }
    public double getPdef() {
        return pdef;
    }
    public double getMdef() {
        return mdef;
    }

    Chara(){}
}
