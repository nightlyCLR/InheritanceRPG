package rivera.mcm.edu.ph.inheritancerpg;

public class Hero extends Chara {
    private int heroID;
    private int level;
    private String heroClass;
    private double baseSTR, baseAGI, baseINT;
    private double strGrowth, agiGrowth, intGrowth;


    public Hero(int id,
                int level,
                double basehp,
                double basemp,
                double patk,
                double matk,
                double pdef,
                double mdef,
                String heroClass,
                double baseSTR,
                double baseAGI,
                double baseINT,
                double strGrowth,
                double agiGrowth,
                double intGrowth) {

        super(id, basehp, basemp, patk, matk, pdef, mdef);
        this.heroClass = heroClass;
        this.level = level;
        this.baseSTR = baseSTR;
        this.baseAGI = baseAGI;
        this.baseINT = baseINT;
        this.strGrowth = strGrowth;
        this.agiGrowth = agiGrowth;
        this.intGrowth = intGrowth;
    }

    //imported getters and setters

    public void setId(int id) {
        super.setId(id);
    }
    public void setBasehp(double basehp) {
        super.setBasehp(basehp);
    }
    public void setBasemp(double basemp) {
        super.setBasemp(basemp);
    }
    public void setMatk(double matk) {
        super.setMatk(matk);
    }
    public void setMdef(double mdef) {
        super.setMdef(mdef);
    }
    public void setPatk(double patk) {
        super.setPatk(patk);
    }
    public void setPdef(double pdef) {
        super.setPdef(pdef);
    }
    public double getBasehp() {
        return super.getBasehp();
    }
    public double getBasemp() {
        return super.getBasemp();
    }
    public double getMatk() {
        return super.getMatk();
    }
    public double getMdef() {
        return super.getMdef();
    }
    public double getPatk() {
        return super.getPatk();
    }
    public double getPdef() {
        return super.getPdef();
    }

    //local getters and setters
    public void setBaseAGI(double baseAGI) {
        this.baseAGI = baseAGI;
    }
    public void setBaseINT(double baseINT) {
        this.baseINT = baseINT;
    }
    public void setBaseSTR(double baseSTR) {
        this.baseSTR = baseSTR;
    }
    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setStrGrowth(double strGrowth) {
        this.strGrowth = strGrowth;
    }
    public void setAgiGrowth(double agiGrowth) {
        this.agiGrowth = agiGrowth;
    }
    public void setIntGrowth(double intGrowth) {
        this.intGrowth = intGrowth;
    }

    public double getBaseAGI() {
        return baseAGI;
    }
    public double getBaseINT() {
        return baseINT;
    }
    public double getBaseSTR() {
        return baseSTR;
    }


    public int getLevel() {
        return level;
    }

    public double getStrGrowth() {
        return strGrowth;
    }
    public double getAgiGrowth() {
        return agiGrowth;
    }
    public double getIntGrowth() {
        return intGrowth;
    }

    //methods
    public double basehpwSTR() {
        return super.getBasehp() + (20 * strGrowth);
    }
    public double basempwINT() {
        return super.getBasemp() + (20 * intGrowth);
    }
    public double strWithGrowth() {
        return baseSTR + (strGrowth * level);
    }
    public double agiWithGrowth() {
        return baseAGI + (agiGrowth * level);
    }
    public double intWithGrowth() {
        return baseINT + (intGrowth * level);
    }

    public  Hero(){}
}



