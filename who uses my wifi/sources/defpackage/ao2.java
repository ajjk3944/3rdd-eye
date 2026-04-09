package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ao2 extends f74 implements dn2, wn2 {
    public final a83 i;
    public final AtomicBoolean j;
    public final h83 k;

    public ao2(Set set, a83 a83Var, h83 h83Var) {
        super(set);
        this.j = new AtomicBoolean();
        this.i = a83Var;
        this.k = h83Var;
    }

    @Override // defpackage.dn2
    public final void D0() {
        int i = this.i.b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            U1();
        }
    }

    public final void U1() {
        dg4 dg4Var;
        if (((Boolean) tw1.e.c.a(mz1.x8)).booleanValue() && this.j.compareAndSet(false, true) && (dg4Var = this.i.e0) != null && dg4Var.f == 3) {
            P1(new of3(17, dg4Var));
        }
    }

    @Override // defpackage.f74, defpackage.wn2
    public final void i() {
        if (this.i.b == 1) {
            U1();
        }
    }
}
