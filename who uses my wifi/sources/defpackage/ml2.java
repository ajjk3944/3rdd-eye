package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ml2 implements ye4 {
    public final gn2 f;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);

    public ml2(gn2 gn2Var) {
        this.f = gn2Var;
    }

    @Override // defpackage.ye4
    public final void G1(int i) {
        this.g.set(true);
        AtomicBoolean atomicBoolean = this.h;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f.P1(sd2.l);
    }

    @Override // defpackage.ye4
    public final void M1() {
        AtomicBoolean atomicBoolean = this.h;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f.P1(sd2.l);
    }

    @Override // defpackage.ye4
    public final void f() {
        this.f.P1(qd2.j);
    }

    @Override // defpackage.ye4
    public final void B1() {
    }

    @Override // defpackage.ye4
    public final void E1() {
    }

    @Override // defpackage.ye4
    public final void R2() {
    }

    @Override // defpackage.ye4
    public final void U() {
    }

    @Override // defpackage.ye4
    public final void Y() {
    }

    @Override // defpackage.ye4
    public final void f3() {
    }

    @Override // defpackage.ye4
    public final void h3() {
    }

    @Override // defpackage.ye4
    public final void m2() {
    }
}
