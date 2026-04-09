package x1;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public z0.l f24770a;

    /* renamed from: b, reason: collision with root package name */
    public int f24771b;

    /* renamed from: c, reason: collision with root package name */
    public p0.e f24772c;

    /* renamed from: d, reason: collision with root package name */
    public p0.e f24773d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ al.c f24775f;

    public b1(al.c cVar, z0.l lVar, int i10, p0.e eVar, p0.e eVar2, boolean z10) {
        this.f24775f = cVar;
        this.f24770a = lVar;
        this.f24771b = i10;
        this.f24772c = eVar;
        this.f24773d = eVar2;
        this.f24774e = z10;
    }

    public final boolean a(int i10, int i11) {
        p0.e eVar = this.f24772c;
        int i12 = this.f24771b;
        z0.k kVar = (z0.k) eVar.f20230a[i10 + i12];
        z0.k kVar2 = (z0.k) this.f24773d.f20230a[i12 + i11];
        return br.l.a(kVar, kVar2) || kVar.getClass() == kVar2.getClass();
    }
}
