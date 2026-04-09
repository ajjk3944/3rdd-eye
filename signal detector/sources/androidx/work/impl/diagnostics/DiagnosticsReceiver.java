package androidx.work.impl.diagnostics;

import V0.m;
import V2.e;
import W0.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5692a = m.h("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f5692a;
        m.f().a(str, "Requesting diagnostics", new Throwable[0]);
        try {
            k.G(context).k(new e(DiagnosticsWorker.class).l());
        } catch (IllegalStateException e6) {
            m.f().e(str, "WorkManager is not initialized", e6);
        }
    }
}
