package i9;

import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f25941a = Build.VERSION.SDK_INT;

    public static int a(long j, long j8) {
        return Math.min(Math.max(0, j8 > 0 ? (int) (((j * 1.0d) / j8) * 100.0d) : 0), 100);
    }

    public static String b(long j) {
        StringBuilder sb2 = new StringBuilder();
        long j8 = j / 60000;
        long j9 = ((j % 3600000) % 60000) / 1000;
        if (j8 >= 10) {
            sb2.append(j8);
        } else if (j8 > 0) {
            sb2.append(0);
            sb2.append(j8);
        } else {
            sb2.append("00");
        }
        sb2.append(":");
        if (j9 >= 10) {
            sb2.append(j9);
        } else if (j9 > 0) {
            sb2.append(0);
            sb2.append(j9);
        } else {
            sb2.append("00");
        }
        return sb2.toString();
    }

    public static void c(View view, boolean z3) {
        if (view == null) {
            return;
        }
        if (z3) {
            view.setSystemUiVisibility(0);
            return;
        }
        int i4 = f25941a;
        if (i4 >= 19) {
            view.setSystemUiVisibility(3846);
        } else if (i4 >= 16) {
            view.setSystemUiVisibility(5);
        } else {
            view.setSystemUiVisibility(1);
        }
    }
}
