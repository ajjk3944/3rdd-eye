package androidx.work.impl.background.systemalarm;

import V0.m;
import W0.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5685a = m.h("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m.f().a(f5685a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            k kVarG = k.G(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (k.f3987H) {
                try {
                    kVarG.f3990E = pendingResultGoAsync;
                    if (kVarG.f3989D) {
                        pendingResultGoAsync.finish();
                        kVarG.f3990E = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e6) {
            m.f().e(f5685a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e6);
        }
    }
}
