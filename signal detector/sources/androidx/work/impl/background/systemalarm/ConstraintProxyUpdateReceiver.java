package androidx.work.impl.background.systemalarm;

import A.f;
import A2.C;
import V0.m;
import W0.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5684a = m.h("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            k.G(context).f3993l.o(new C(intent, context, goAsync(), 9));
        } else {
            m.f().a(f5684a, f.l("Ignoring unknown action ", action), new Throwable[0]);
        }
    }
}
