package nm;

import d0.a1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f30124b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(e0 e0Var, int i4) {
        super(0);
        this.f30123a = i4;
        this.f30124b = e0Var;
    }

    @Override // mk.a
    public final Object invoke() {
        float fQ;
        long jE;
        float f10;
        long j;
        switch (this.f30123a) {
            case 0:
                return Boolean.valueOf(this.f30124b.f30022k.getValue() != null);
            case 1:
                return this.f30124b.f30014a.o();
            case 2:
                e0 e0Var = this.f30124b;
                c0 c0VarD = e0Var.d();
                if (c0VarD != null) {
                    km.i iVarO = e0Var.f30014a.o();
                    i0.p pVar = (i0.p) iVarO.f28426b;
                    int iOrdinal = iVarO.l().ordinal();
                    if (iOrdinal == 0) {
                        jE = pVar.e() & 4294967295L;
                    } else {
                        if (iOrdinal != 1) {
                            throw new ac.m();
                        }
                        jE = pVar.e() >> 32;
                    }
                    long jB = c0VarD.b();
                    fQ = (((int) jE) - wd.b.q(com.bumptech.glide.d.a((int) (jB >> 32), (int) (4294967295L & jB)), e0Var.f())) - 1.0f;
                } else {
                    fQ = 0.0f;
                }
                return Float.valueOf(fQ);
            case 3:
                e0 e0Var2 = this.f30124b;
                c0 c0VarD2 = e0Var2.d();
                if (c0VarD2 != null) {
                    long jB2 = c0VarD2.b();
                    float fQ2 = wd.b.q(com.bumptech.glide.d.a((int) (jB2 >> 32), (int) (jB2 & 4294967295L)), e0Var2.f());
                    long jC = c0VarD2.c();
                    a1 a1VarF = e0Var2.f();
                    nk.k.e(a1VarF, "orientation");
                    int iOrdinal2 = a1VarF.ordinal();
                    if (iOrdinal2 == 0) {
                        j = jC & 4294967295L;
                    } else {
                        if (iOrdinal2 != 1) {
                            throw new ac.m();
                        }
                        j = jC >> 32;
                    }
                    f10 = (fQ2 + ((int) j)) - 1.0f;
                } else {
                    f10 = 0.0f;
                }
                return Float.valueOf(f10);
            default:
                return this.f30124b.f();
        }
    }
}
