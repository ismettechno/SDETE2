package Utility;

public class MyFunc {

    public static void Bekle(int sn)
    {
        try {
            Thread.sleep(sn*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int RandomSayiVer(int limit){
        return (int)(Math.random()*(limit+1));
    }

    public static int RandomSayiVer(int alt, int ust){
        return (int)(Math.random()*(ust-alt+1)+alt);
    }

}
