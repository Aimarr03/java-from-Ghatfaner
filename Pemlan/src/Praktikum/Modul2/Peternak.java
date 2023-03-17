package Praktikum.Modul2;

public class Peternak {
  private static String[] szHewan;
  private int[] intJumlah;
  private static int[] intHasil;
  private int[] intTotalHarian;
  private double[] dHasilBooster;
  private double[] dHasilBoosterHarian;

  public Peternak() {
  }

  private Peternak(String[] szHewan, int[] intHasil, int[] intJumlah, int[] intTotalHarian, double[] dHasilBooster,
      double[] dHasilBoosterHarian) {
    this.szHewan = szHewan;
    this.intHasil = intHasil;
    this.intJumlah = intJumlah;
    this.intTotalHarian = intTotalHarian;
    this.dHasilBooster = dHasilBooster;
    this.dHasilBoosterHarian = dHasilBoosterHarian;
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

  private double[] getHasilBooster() {
    return dHasilBooster;
  }

  private double[] getHasilBoosterHarian() {
    return dHasilBoosterHarian;
  }

  private static String[] getHewan() {
    return szHewan;
  }

  private static int[] getHasil() {
    return intHasil;
  }

  private int[] getJumlah() {
    return intJumlah;
  }

  private int[] getTotalHarian() {
    return intTotalHarian;
  }

  private void getInfo() {
    for (int i = 0; i < szHewan.length; i++) {
      System.out.println("=".repeat(40));

      String info = String.format(
          "\nJenis\t\t\t: %s\nJumlah\t\t\t: %d ekor\nTelur/Ekor\t\t: %d butir\nTelur/Ekor\t\t: %.0f butir (Setelah Booster)\nTotal Telur/Hari\t: %d butir\nTotal Telur/Hari\t: %.0f butir (Setelah Booster)", getHewan()[i], getJumlah()[i], getHasil()[i], getHasilBooster()[i], getTotalHarian()[i], getHasilBoosterHarian()[i]);
      
      System.out.println("=".repeat(40));
    }
  }
}