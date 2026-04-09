package ec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final g4 f23197a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23198b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23199c;

    public y0(g4 g4Var) {
        pb.y.h(g4Var);
        this.f23197a = g4Var;
    }

    public final void a() {
        g4 g4Var = this.f23197a;
        g4Var.l0();
        g4Var.b().B();
        g4Var.b().B();
        if (this.f23198b) {
            g4Var.a().f23060o.d("Unregistering connectivity change receiver");
            this.f23198b = false;
            this.f23199c = false;
            try {
                g4Var.f22740l.f22949a.unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                g4Var.a().g.e(e2, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        g4 g4Var = this.f23197a;
        g4Var.l0();
        String action = intent.getAction();
        g4Var.a().f23060o.e(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            g4Var.a().j.e(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        w0 w0Var = g4Var.f22732b;
        g4.U(w0Var);
        boolean zV = w0Var.V();
        if (this.f23199c != zV) {
            this.f23199c = zV;
            g4Var.b().K(new b5.o(this, zV));
        }
    }
}
