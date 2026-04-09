package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.h80;
import defpackage.ha1;
import defpackage.xb4;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = h80.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        h80.d().a(new Throwable[0]);
        try {
            ha1.j0(context).n(new xb4(DiagnosticsWorker.class).f());
        } catch (IllegalStateException e) {
            h80.d().b(a, "WorkManager is not initialized", e);
        }
    }
}
