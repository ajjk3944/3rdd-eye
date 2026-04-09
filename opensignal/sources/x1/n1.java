package x1;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final x0.r f24895a;

    /* renamed from: b, reason: collision with root package name */
    public final d f24896b = d.H;

    /* renamed from: c, reason: collision with root package name */
    public final d f24897c = d.I;

    /* renamed from: d, reason: collision with root package name */
    public final d f24898d = d.J;

    /* renamed from: e, reason: collision with root package name */
    public final d f24899e = d.D;

    /* renamed from: f, reason: collision with root package name */
    public final d f24900f = d.E;

    /* renamed from: g, reason: collision with root package name */
    public final d f24901g = d.F;

    /* renamed from: h, reason: collision with root package name */
    public final d f24902h = d.G;

    public n1(y1.p pVar) {
        this.f24895a = new x0.r(pVar);
    }

    public final void a(m1 m1Var, ar.k kVar, ar.a aVar) {
        Object obj;
        x0.q qVar;
        x0.r rVar = this.f24895a;
        synchronized (rVar.f24744g) {
            p0.e eVar = rVar.f24743f;
            Object[] objArr = eVar.f20230a;
            int i10 = eVar.f20232g;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    obj = null;
                    break;
                }
                obj = objArr[i11];
                if (((x0.q) obj).f24728a == kVar) {
                    break;
                } else {
                    i11++;
                }
            }
            qVar = (x0.q) obj;
            if (qVar == null) {
                br.l.c(kVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                br.b0.c(1, kVar);
                qVar = new x0.q(kVar);
                eVar.b(qVar);
            }
        }
        x0.q qVar2 = rVar.f24746i;
        long j = rVar.j;
        if (j != -1 && j != v0.i.b()) {
            StringBuilder sbK = w.g.k(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbK.append(v0.i.b());
            sbK.append(", name=");
            sbK.append(Thread.currentThread().getName());
            sbK.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            n0.g1.a(sbK.toString());
        }
        try {
            rVar.f24746i = qVar;
            rVar.j = v0.i.b();
            qVar.a(m1Var, rVar.f24742e, aVar);
        } finally {
            rVar.f24746i = qVar2;
            rVar.j = j;
        }
    }
}
