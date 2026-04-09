package i0;

import android.content.pm.PackageManager;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public class b {
    public static boolean a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
        try {
            packageManager.getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static double b(double d2, int i2) {
        if (i2 >= 0) {
            return new BigDecimal(d2).setScale(i2, RoundingMode.HALF_UP).doubleValue();
        }
        throw new IllegalArgumentException();
    }

    public static int c(String str) {
        try {
            return Integer.decode(str).intValue();
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int d(boolean z2) {
        return z2 ? 0 : 8;
    }
}
