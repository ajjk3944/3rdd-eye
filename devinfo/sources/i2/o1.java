package i2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final g1.u f25732a;

    /* renamed from: b, reason: collision with root package name */
    public final d f25733b = d.f25605k;

    /* renamed from: c, reason: collision with root package name */
    public final d f25734c = d.f25606l;

    /* renamed from: d, reason: collision with root package name */
    public final d f25735d = d.f25607m;

    /* renamed from: e, reason: collision with root package name */
    public final d f25736e = d.g;

    /* renamed from: f, reason: collision with root package name */
    public final d f25737f = d.f25603h;
    public final d g = d.f25604i;

    /* renamed from: h, reason: collision with root package name */
    public final d f25738h = d.j;

    public o1(j2.n nVar) {
        this.f25732a = new g1.u(nVar);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection] */
    public final void a() {
        g1.u uVar = this.f25732a;
        bl.z zVar = uVar.f24289d;
        g1.m.e(g1.m.f24258a);
        synchronized (g1.m.f24260c) {
            g1.m.f24264h = zj.n.k0(g1.m.f24264h, zVar);
        }
        uVar.f24292h = new ca.b(11, zVar);
    }

    public final void b() {
        ca.b bVar = this.f25732a.f24292h;
        if (bVar != null) {
            bVar.f();
        }
        g1.u uVar = this.f25732a;
        synchronized (uVar.g) {
            w0.e eVar = uVar.f24291f;
            Object[] objArr = eVar.f36397a;
            int i4 = eVar.f36399c;
            for (int i10 = 0; i10 < i4; i10++) {
                g1.t tVar = (g1.t) objArr[i10];
                tVar.f24279e.a();
                tVar.f24280f.a();
                tVar.f24284l.a();
                tVar.f24285m.clear();
            }
        }
    }
}
