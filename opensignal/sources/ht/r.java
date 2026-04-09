package ht;

import java.util.List;

/* loaded from: classes.dex */
public abstract class r extends c1 implements lt.d {

    /* renamed from: d, reason: collision with root package name */
    public final b0 f10938d;

    /* renamed from: g, reason: collision with root package name */
    public final b0 f10939g;

    public r(b0 b0Var, b0 b0Var2) {
        br.l.e(b0Var, "lowerBound");
        br.l.e(b0Var2, "upperBound");
        this.f10938d = b0Var;
        this.f10939g = b0Var2;
    }

    @Override // ht.x
    public final List L() {
        return u0().L();
    }

    @Override // ht.x
    public at.n W() {
        return u0().W();
    }

    @Override // ht.x
    public final i0 X() {
        return u0().X();
    }

    @Override // ht.x
    public final m0 Z() {
        return u0().Z();
    }

    @Override // ht.x
    public final boolean c0() {
        return u0().c0();
    }

    public String toString() {
        return ss.j.f22245e.Y(this);
    }

    public abstract b0 u0();

    public abstract String v0(ss.j jVar, ss.j jVar2);
}
