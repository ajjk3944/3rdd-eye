package androidx.work.impl.background.systemalarm;

import T1.z;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.m;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16913a = m.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m.e().a(f16913a, "Received intent " + intent);
        try {
            z zVarC = z.c(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            zVarC.getClass();
            synchronized (z.f12229o) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = zVarC.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    zVarC.i = pendingResultGoAsync;
                    if (zVarC.f12237h) {
                        pendingResultGoAsync.finish();
                        zVarC.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e4) {
            m.e().d(f16913a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e4);
        }
    }
}
