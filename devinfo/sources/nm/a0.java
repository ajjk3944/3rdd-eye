package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a0 extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0.u f29999b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(i0.u uVar, int i4) {
        super(0);
        this.f29998a = i4;
        this.f29999b = uVar;
    }

    @Override // mk.a
    public final Object invoke() {
        long jE;
        switch (this.f29998a) {
            case 0:
                i0.p pVarG = this.f29999b.g();
                int iOrdinal = pVarG.f25476o.ordinal();
                if (iOrdinal == 0) {
                    jE = pVarG.e() & 4294967295L;
                } else {
                    if (iOrdinal != 1) {
                        throw new ac.m();
                    }
                    jE = pVarG.e() >> 32;
                }
                return Float.valueOf(((int) jE) * 0.05f);
            default:
                return this.f29999b.g().f25476o;
        }
    }
}
