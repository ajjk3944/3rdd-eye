package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import t6.v;
import u6.r;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1616a = v.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        v.e().a(f1616a, "Received intent " + intent);
        try {
            r rVarD = r.D(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (r.f35174p) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = rVarD.f35181l;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    rVarD.f35181l = pendingResultGoAsync;
                    if (rVarD.f35180k) {
                        pendingResultGoAsync.finish();
                        rVarD.f35181l = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e2) {
            v.e().d(f1616a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
        }
    }
}
