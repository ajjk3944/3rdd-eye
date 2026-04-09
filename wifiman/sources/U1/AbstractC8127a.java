package u1;

import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8127a {

    /* renamed from: u1.a$a, reason: collision with other inner class name */
    private static class C2192a {
        static long a(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    public static long a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C2192a.a(packageInfo) : packageInfo.versionCode;
    }
}
