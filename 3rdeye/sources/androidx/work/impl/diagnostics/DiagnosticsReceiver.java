package androidx.work.impl.diagnostics;

import T1.z;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.m;
import androidx.work.p;
import java.util.Collections;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16922a = m.g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        m mVarE = m.e();
        String str = f16922a;
        mVarE.a(str, "Requesting diagnostics");
        try {
            z zVarC = z.c(context);
            p pVarA = new p.a(DiagnosticsWorker.class).a();
            zVarC.getClass();
            zVarC.a(Collections.singletonList(pVarA));
        } catch (IllegalStateException e4) {
            m.e().d(str, "WorkManager is not initialized", e4);
        }
    }
}
