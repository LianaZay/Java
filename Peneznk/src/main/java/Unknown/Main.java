package Unknown;

public class Main {
    public static void main(String[] args) {
        transakce t = new transakce(542.0, "gmnv", "zsd");
        System.out.println(t);

        pnznk p = new pnznk();
        p.prid_trans(213.846, "asasd", "dsga");
        p.prid_trans(3243.3543, "fkfh", "asgsgsgdas");
        p.vypis();

    }
}