package i2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public i1.m f25808a;

    /* renamed from: b, reason: collision with root package name */
    public int f25809b;

    /* renamed from: c, reason: collision with root package name */
    public w0.e f25810c;

    /* renamed from: d, reason: collision with root package name */
    public w0.e f25811d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.consent_sdk.a0 f25813f;

    public x0(com.google.android.gms.internal.consent_sdk.a0 a0Var, i1.m mVar, int i4, w0.e eVar, w0.e eVar2, boolean z3) {
        this.f25813f = a0Var;
        this.f25808a = mVar;
        this.f25809b = i4;
        this.f25810c = eVar;
        this.f25811d = eVar2;
        this.f25812e = z3;
    }

    public final boolean a(int i4, int i10) {
        w0.e eVar = this.f25810c;
        int i11 = this.f25809b;
        i1.l lVar = (i1.l) eVar.f36397a[i4 + i11];
        i1.l lVar2 = (i1.l) this.f25811d.f36397a[i11 + i10];
        return nk.k.a(lVar, lVar2) || lVar.getClass() == lVar2.getClass();
    }
}
