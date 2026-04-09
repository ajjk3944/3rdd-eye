package c7;

import android.content.Context;
import android.os.PowerManager;
import t6.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class n {
    static {
        nk.k.d(v.g("WakeLocks"), "tagWithPrefix(...)");
    }

    public static final PowerManager.WakeLock a(Context context) {
        nk.k.e(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("power");
        nk.k.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (o.f2796a) {
        }
        nk.k.b(wakeLockNewWakeLock);
        return wakeLockNewWakeLock;
    }
}
