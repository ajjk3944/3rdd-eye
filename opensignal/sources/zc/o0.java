package zc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class o0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final p3 f27049a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27050b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27051c;

    public o0(p3 p3Var) {
        cc.s.h(p3Var);
        this.f27049a = p3Var;
    }

    public final void a() {
        p3 p3Var = this.f27049a;
        p3Var.i0();
        p3Var.J().s1();
        p3Var.J().s1();
        if (this.f27050b) {
            p3Var.x().K.b("Unregistering connectivity change receiver");
            this.f27050b = false;
            this.f27051c = false;
            try {
                p3Var.H.f26884a.unregisterReceiver(this);
            } catch (IllegalArgumentException e4) {
                p3Var.x().B.c(e4, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        p3 p3Var = this.f27049a;
        p3Var.i0();
        String action = intent.getAction();
        p3Var.x().K.c(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            p3Var.x().F.c(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        m0 m0Var = p3Var.f27095d;
        p3.Q(m0Var);
        boolean zM1 = m0Var.M1();
        if (this.f27051c != zM1) {
            this.f27051c = zM1;
            p3Var.J().B1(new pb.l0(this, zM1));
        }
    }
}
