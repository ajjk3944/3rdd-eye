package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pt1 {
    public static final String[] e = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public long a;
    public long b;
    public long c;
    public boolean d;

    public static pt1 a(Context context, Executor executor) {
        String[] strArr = e;
        pt1 pt1Var = new pt1();
        pt1Var.a = 0L;
        pt1Var.b = 0L;
        pt1Var.c = -1L;
        pt1Var.d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new ot1(0, pt1Var));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return pt1Var;
    }
}
