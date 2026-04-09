package B4;

/* loaded from: classes3.dex */
public abstract class q {
    public static int a() {
        Integer numA = v4.s.a();
        if (numA != null) {
            return numA.intValue();
        }
        return -1;
    }

    public static boolean b() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}
