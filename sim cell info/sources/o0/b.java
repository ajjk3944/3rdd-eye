package o0;

/* loaded from: classes.dex */
public class b {
    public static int a(int i2) {
        if (i2 == Integer.MAX_VALUE) {
            return 99;
        }
        if (i2 <= -140) {
            return 0;
        }
        if (i2 >= -43) {
            return 97;
        }
        return i2 + 140;
    }

    public static int b(int i2) {
        if (i2 == 99) {
            i2 = Integer.MAX_VALUE;
        }
        if (i2 != Integer.MAX_VALUE) {
            return (i2 * 2) - 113;
        }
        return Integer.MAX_VALUE;
    }
}
