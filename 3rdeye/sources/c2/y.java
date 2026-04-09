package c2;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: WakeLocks.kt */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18443a;

    static {
        String strG = androidx.work.m.g("WakeLocks");
        kotlin.jvm.internal.l.e(strG, "tagWithPrefix(\"WakeLocks\")");
        f18443a = strG;
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (z.f18444a) {
            z.f18445b.put(wakeLock, strConcat);
        }
        kotlin.jvm.internal.l.e(wakeLock, "wakeLock");
        return wakeLock;
    }
}
