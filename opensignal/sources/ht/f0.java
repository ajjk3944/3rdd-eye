package ht;

/* loaded from: classes.dex */
public final class f0 extends p0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f10899a;

    public f0(or.h hVar) {
        br.l.e(hVar, "kotlinBuiltIns");
        b0 b0VarO = hVar.o();
        br.l.d(b0VarO, "kotlinBuiltIns.nullableAnyType");
        this.f10899a = b0VarO;
    }

    @Override // ht.p0
    public final d1 a() {
        return d1.OUT_VARIANCE;
    }

    @Override // ht.p0
    public final x b() {
        return this.f10899a;
    }

    @Override // ht.p0
    public final boolean c() {
        return true;
    }

    @Override // ht.p0
    public final p0 d(jt.f fVar) {
        br.l.e(fVar, "kotlinTypeRefiner");
        return this;
    }
}
