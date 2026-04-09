package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import nk.k;
import t6.v;
import t6.y;
import t6.z;
import u6.r;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1622a = v.g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        v vVarE = v.e();
        String str = f1622a;
        vVarE.a(str, "Requesting diagnostics");
        try {
            k.e(context, "context");
            r.D(context).f((z) new y(0, DiagnosticsWorker.class).a());
        } catch (IllegalStateException e2) {
            v.e().d(str, "WorkManager is not initialized", e2);
        }
    }
}
