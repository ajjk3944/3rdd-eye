package ht;

import java.util.List;

/* loaded from: classes.dex */
public abstract class o extends b0 {
    public abstract b0 C0();

    @Override // ht.c1
    /* renamed from: E0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b0 q0(jt.f fVar) {
        br.l.e(fVar, "kotlinTypeRefiner");
        b0 b0VarC0 = C0();
        br.l.e(b0VarC0, "type");
        return M0(b0VarC0);
    }

    @Override // ht.x
    public final List L() {
        return C0().L();
    }

    public abstract o M0(b0 b0Var);

    @Override // ht.x
    public final at.n W() {
        return C0().W();
    }

    @Override // ht.x
    public i0 X() {
        return C0().X();
    }

    @Override // ht.x
    public final m0 Z() {
        return C0().Z();
    }

    @Override // ht.x
    public boolean c0() {
        return C0().c0();
    }
}
