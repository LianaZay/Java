package Unknown;

import javax.sql.rowset.spi.TransactionalWriter;
import java.util.ArrayList;

public class pnznk {
    private double zusttk;
    private ArrayList<transakce>hist;

    public pnznk() {
        this.hist = new ArrayList<>();
        this.zusttk = 0;
    }
    public void prid_trans(double cena, String kategorie, String popis){
        transakce t = new transakce(cena, popis, kategorie);
        hist.add(t);
    }
    public void vypis(){
        for(int i = 0; i < hist.size(); i++){
            System.out.println(hist.get(i).getClass()+""+hist.get(i).getKategorie()+""+hist.get(i).getPopis());
        }

    }
}

