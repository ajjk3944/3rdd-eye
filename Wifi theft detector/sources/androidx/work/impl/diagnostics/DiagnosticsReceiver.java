package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.k;
import androidx.work.l;
import androidx.work.r;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4448a = k.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        k.c().a(f4448a, "Requesting diagnostics", new Throwable[0]);
        try {
            r.d(context).b(l.d(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            k.c().b(f4448a, "WorkManager is not initialized", e10);
        }
    }
}
