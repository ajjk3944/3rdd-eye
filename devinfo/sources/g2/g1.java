package g2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g1 extends nk.l implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n[] f24347b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(n[] nVarArr, int i4) {
        super(2);
        this.f24346a = i4;
        this.f24347b = nVarArr;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24346a) {
            case 0:
                return Float.valueOf(n0.b((r0) obj, true, this.f24347b, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(n0.b((r0) obj, false, this.f24347b, ((Number) obj2).floatValue()));
        }
    }
}
