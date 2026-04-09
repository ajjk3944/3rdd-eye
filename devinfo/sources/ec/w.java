package ec;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final x.e f23104c;

    /* renamed from: d, reason: collision with root package name */
    public final x.e f23105d;

    /* renamed from: e, reason: collision with root package name */
    public long f23106e;

    public w(o1 o1Var) {
        super(o1Var);
        this.f23105d = new x.e(0);
        this.f23104c = new x.e(0);
    }

    public final void C(long j, String str) {
        o1 o1Var = (o1) this.f218b;
        if (str == null || str.length() == 0) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.d("Ad unit id must be a non-empty string");
        } else {
            l1 l1Var = o1Var.g;
            o1.m(l1Var);
            l1Var.K(new a(this, str, j, 0));
        }
    }

    public final void D(long j, String str) {
        o1 o1Var = (o1) this.f218b;
        if (str == null || str.length() == 0) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.d("Ad unit id must be a non-empty string");
        } else {
            l1 l1Var = o1Var.g;
            o1.m(l1Var);
            l1Var.K(new a(this, str, j, 1));
        }
    }

    public final void E(long j) {
        b3 b3Var = ((o1) this.f218b).f22958l;
        o1.l(b3Var);
        y2 y2VarH = b3Var.H(false);
        x.e eVar = this.f23104c;
        Iterator it = ((x.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            G(str, j - ((Long) eVar.get(str)).longValue(), y2VarH);
        }
        if (!eVar.isEmpty()) {
            F(j - this.f23106e, y2VarH);
        }
        H(j);
    }

    public final void F(long j, y2 y2Var) {
        o1 o1Var = (o1) this.f218b;
        if (y2Var == null) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.f23060o.d("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.f23060o.e(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            l4.t0(y2Var, bundle, true);
            q2 q2Var = o1Var.f22959m;
            o1.l(q2Var);
            q2Var.I("am", "_xa", bundle);
        }
    }

    public final void G(String str, long j, y2 y2Var) {
        o1 o1Var = (o1) this.f218b;
        if (y2Var == null) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.f23060o.d("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                s0 s0Var2 = o1Var.f22954f;
                o1.m(s0Var2);
                s0Var2.f23060o.e(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            l4.t0(y2Var, bundle, true);
            q2 q2Var = o1Var.f22959m;
            o1.l(q2Var);
            q2Var.I("am", "_xu", bundle);
        }
    }

    public final void H(long j) {
        x.e eVar = this.f23104c;
        Iterator it = ((x.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j));
        }
        if (eVar.isEmpty()) {
            return;
        }
        this.f23106e = j;
    }
}
