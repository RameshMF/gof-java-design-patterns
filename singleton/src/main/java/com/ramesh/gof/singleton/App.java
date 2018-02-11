package com.ramesh.gof.singleton;


public class App {

  /**
   * Program entry point.
   *
   * @param args command line args
   */
  public static void main(String[] args) {

    // eagerly initialized singleton
    IvoryTower ivoryTower1 = IvoryTower.getInstance();
    IvoryTower ivoryTower2 = IvoryTower.getInstance();
    System.out.println("ivoryTower1=" + ivoryTower1);
    System.out.println("ivoryTower2=" + ivoryTower2);

    // lazily initialized singleton
    ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower1 =
        ThreadSafeLazyLoadedIvoryTower.getInstance();
    ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower2 =
        ThreadSafeLazyLoadedIvoryTower.getInstance();
    System.out.println("threadSafeIvoryTower1=" + threadSafeIvoryTower1);
    System.out.println("threadSafeIvoryTower2=" + threadSafeIvoryTower2);

    // enum singleton
    EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
    EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
    System.out.println("enumIvoryTower1=" + enumIvoryTower1);
    System.out.println("enumIvoryTower2=" + enumIvoryTower2);

    // double checked locking
    ThreadSafeDoubleCheckLocking dcl1 = ThreadSafeDoubleCheckLocking.getInstance();
    System.out.println(dcl1);
    ThreadSafeDoubleCheckLocking dcl2 = ThreadSafeDoubleCheckLocking.getInstance();
    System.out.println(dcl2);

    // initialize on demand holder idiom
    InitializingOnDemandHolderIdiom demandHolderIdiom =
        InitializingOnDemandHolderIdiom.getInstance();
    System.out.println(demandHolderIdiom);
    InitializingOnDemandHolderIdiom demandHolderIdiom2 =
        InitializingOnDemandHolderIdiom.getInstance();
    System.out.println(demandHolderIdiom2);
  }
}
