package Praktikum.Modul2;

public class TestPeternak {
  public static void main(String[] args) {
    String[] szHewan = { "Bebek", "Domba", "Unta" };
    int[] intJumlah = { 25, 10, 7 };
    int[] intHasil = { 2, 4, 5 };
    int[] intTotalHarian = { 50, 40, 35 };
    double[] dHasilBooster = new double[intHasil.length];
    double[] dHasilBoosterHarian = new double[intHasil.length];

    Peternak ternak = new Peternak(szHewan, intHasil, intJumlah, intTotalHarian, dHasilBooster, dHasilBoosterHarian);

    Peternak.getInfo();
  } 
}

class Peternak {
  private static String[] szHewan;
  private static int[] intJumlah;
  private static int[] intHasil;
  private static int[] intTotalHarian;
  private static double[] dHasilBooster;
  private static double[] dHasilBoosterHarian;

  Peternak() {
  }

  Peternak(String[] szHewan, int[] intHasil, int[] intJumlah, int[] intTotalHarian, double[] dHasilBooster,
      double[] dHasilBoosterHarian) {
    Peternak.szHewan = szHewan;
    Peternak.intHasil = intHasil;
    Peternak.intJumlah = intJumlah;
    Peternak.intTotalHarian = intTotalHarian;
    Peternak.dHasilBooster = dHasilBooster;
    Peternak.dHasilBoosterHarian = dHasilBoosterHarian;
    this.setHasilBooster();
    this.setHasilBoosterHarian();
  }

  private double[] setHasilBooster() {
    dHasilBooster[0] = intHasil[0] * (2.5);
    dHasilBooster[1] = intHasil[1] * (1.5);
    dHasilBooster[2] = intHasil[2] * (2);
    return dHasilBooster;
  }

  private double[] setHasilBoosterHarian() {
    dHasilBoosterHarian[0] = intTotalHarian[0] * (2.5);
    dHasilBoosterHarian[1] = intTotalHarian[1] * (1.5);
    dHasilBoosterHarian[2] = intTotalHarian[2] * (2);
    return dHasilBoosterHarian;
  }

  public static double[] getHasilBooster() {
    return dHasilBooster;
  }

  public static double[] getHasilBoosterHarian() {
    return dHasilBoosterHarian;
  }

  public static String[] getHewan() {
    return szHewan;
  }

  public static int[] getHasil() {
    return intHasil;
  }

  public static int[] getJumlah() {
    return intJumlah;
  }

  public static int[] getTotalHarian() {
    return intTotalHarian;
  }

  public static void getInfo() {
    for (int i = 0; i < szHewan.length; i++) {

      if (szHewan[i] == ("Bebek")) {
        String info = String.format(
            "Jenis\t\t\t: %s\nJumlah\t\t\t: %d ekor\nTelur/Ekor\t\t: %d butir\nTelur/Ekor\t\t: %.0f butir (Setelah Booster)\nTotal Telur/Hari\t: %d butir\nTotal Telur/Hari\t: %.0f butir (Setelah Booster)",
            Peternak.getHewan()[i], Peternak.getJumlah()[i], Peternak.getHasil()[i], Peternak.getHasilBooster()[i],
            Peternak.getTotalHarian()[i], Peternak.getHasilBoosterHarian()[i]);
        System.out.println(info);

      } else if (szHewan[i] == ("Domba")) {
        String info = String.format(
            "Jenis\t\t\t: %s\nJumlah\t\t\t: %d ekor\nBulu/Ekor\t\t: %d kg\nBulu/Ekor\t\t: %.0f kg (Setelah Booster)\nTotal Bulu/Hari\t\t: %d kg\nTotal Bulu/Hari\t\t: %.0f kg (Setelah Booster)",
            Peternak.getHewan()[i], Peternak.getJumlah()[i], Peternak.getHasil()[i], Peternak.getHasilBooster()[i],
            Peternak.getTotalHarian()[i], Peternak.getHasilBoosterHarian()[i]);
        System.out.println(info);
      } else if (szHewan[i] == ("Unta")) {
        String info = String.format(
            "Jenis\t\t\t: %s\nJumlah\t\t\t: %d ekor\nSusu/Ekor\t\t: %d kg\nSusu/Ekor\t\t: %.0f kg (Setelah Booster)\nTotal Susu/Hari\t\t: %d kg\nTotal Susu/Hari\t\t: %.0f kg (Setelah Booster)",
            Peternak.getHewan()[i], Peternak.getJumlah()[i], Peternak.getHasil()[i], Peternak.getHasilBooster()[i],
            Peternak.getTotalHarian()[i], Peternak.getHasilBoosterHarian()[i]);
        System.out.println(info);
      } else
        System.out.println("Maaf data anda belum dimasukkan");

      System.out.println("=".repeat(60));
    }
  }
}
