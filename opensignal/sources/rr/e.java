package rr;

import java.util.List;

/* loaded from: classes.dex */
public final class e implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f21682a;

    /* renamed from: d, reason: collision with root package name */
    public final j f21683d;

    /* renamed from: g, reason: collision with root package name */
    public final int f21684g;

    public e(r0 r0Var, j jVar, int i10) {
        this.f21682a = r0Var;
        this.f21683d = jVar;
        this.f21684g = i10;
    }

    @Override // rr.r0
    public final boolean F() {
        return this.f21682a.F();
    }

    @Override // rr.r0
    public final ht.d1 N() {
        return this.f21682a.N();
    }

    @Override // rr.i
    /* renamed from: a */
    public final i u1() {
        return this.f21682a.u1();
    }

    @Override // rr.r0
    public final gt.o g0() {
        return this.f21682a.g0();
    }

    @Override // sr.a
    public final sr.h getAnnotations() {
        return this.f21682a.getAnnotations();
    }

    @Override // rr.r0
    public final int getIndex() {
        return this.f21682a.getIndex() + this.f21684g;
    }

    @Override // rr.l
    public final qs.g getName() {
        return this.f21682a.getName();
    }

    @Override // rr.r0
    public final List getUpperBounds() {
        return this.f21682a.getUpperBounds();
    }

    @Override // rr.m
    public final o0 h() {
        return this.f21682a.h();
    }

    @Override // rr.r0
    public final boolean m0() {
        return true;
    }

    @Override // rr.l
    public final l o() {
        return this.f21683d;
    }

    @Override // rr.i
    public final ht.b0 q() {
        return this.f21682a.q();
    }

    public final String toString() {
        return this.f21682a + "[inner-copy]";
    }

    @Override // rr.i
    public final ht.m0 v() {
        return this.f21682a.v();
    }

    @Override // rr.l
    public final Object w0(n nVar, Object obj) {
        return this.f21682a.w0(nVar, obj);
    }

    @Override // rr.l, rr.i
    /* renamed from: a */
    public final l u1() {
        return this.f21682a.u1();
    }

    @Override // rr.r0, rr.i
    /* renamed from: a */
    public final r0 u1() {
        return this.f21682a.u1();
    }
}
