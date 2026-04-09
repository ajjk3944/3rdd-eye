package R1;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3386a = Build.VERSION.SDK_INT;

    public static int a(long j6, long j7) {
        return Math.min(Math.max(0, j7 > 0 ? (int) (((j6 * 1.0d) / j7) * 100.0d) : 0), 100);
    }

    public static String b(long j6) {
        StringBuilder sb = new StringBuilder();
        long j7 = j6 / 60000;
        long j8 = ((j6 % 3600000) % 60000) / 1000;
        if (j7 >= 10) {
            sb.append(j7);
        } else if (j7 > 0) {
            sb.append(0);
            sb.append(j7);
        } else {
            sb.append("00");
        }
        sb.append(":");
        if (j8 >= 10) {
            sb.append(j8);
        } else if (j8 > 0) {
            sb.append(0);
            sb.append(j8);
        } else {
            sb.append("00");
        }
        return sb.toString();
    }

    public static void c(View view, boolean z6) {
        if (view == null) {
            return;
        }
        if (z6) {
            view.setSystemUiVisibility(0);
            return;
        }
        int i = f3386a;
        if (i >= 19) {
            view.setSystemUiVisibility(3846);
        } else if (i >= 16) {
            view.setSystemUiVisibility(5);
        } else {
            view.setSystemUiVisibility(1);
        }
    }
}
