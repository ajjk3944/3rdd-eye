package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n0 implements p1.j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f2468b = new n0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f2469c = new n0(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2470a;

    public /* synthetic */ n0(int i4) {
        this.f2470a = i4;
    }

    @Override // p1.j0
    public final p1.z a(long j, d3.l lVar, d3.c cVar) {
        switch (this.f2470a) {
            case 0:
                float fQ = cVar.Q(c0.f2378a);
                return new p1.e0(new o1.c(0.0f, -fQ, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fQ));
            default:
                float fQ2 = cVar.Q(c0.f2378a);
                return new p1.e0(new o1.c(-fQ2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fQ2, Float.intBitsToFloat((int) (j & 4294967295L))));
        }
    }
}
