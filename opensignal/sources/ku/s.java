package ku;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f14615e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final iu.e f14616a;

    /* renamed from: b, reason: collision with root package name */
    public final mu.i f14617b;

    /* renamed from: c, reason: collision with root package name */
    public long f14618c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f14619d;

    public s(iu.e eVar, mu.i iVar) {
        br.l.e(eVar, "descriptor");
        this.f14616a = eVar;
        this.f14617b = iVar;
        int iK = eVar.k();
        if (iK <= 64) {
            this.f14618c = iK != 64 ? (-1) << iK : 0L;
            this.f14619d = f14615e;
            return;
        }
        this.f14618c = 0L;
        int i10 = (iK - 1) >>> 6;
        long[] jArr = new long[i10];
        if ((iK & 63) != 0) {
            jArr[i10 - 1] = (-1) << iK;
        }
        this.f14619d = jArr;
    }
}
