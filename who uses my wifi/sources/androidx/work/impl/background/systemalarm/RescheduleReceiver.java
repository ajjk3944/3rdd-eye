package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.h80;
import defpackage.ha1;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = h80.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        h80 h80VarD = h80.d();
        String.format("Received intent %s", intent);
        h80VarD.a(new Throwable[0]);
        try {
            ha1 ha1VarJ0 = ha1.j0(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (ha1.A) {
                try {
                    ha1VarJ0.x = pendingResultGoAsync;
                    if (ha1VarJ0.w) {
                        pendingResultGoAsync.finish();
                        ha1VarJ0.x = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            h80.d().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
