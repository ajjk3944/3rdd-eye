package v1;

import u0.d1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 extends b0 {

    /* renamed from: b, reason: collision with root package name */
    public final c f35643b;

    /* renamed from: c, reason: collision with root package name */
    public String f35644c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f35645d;

    /* renamed from: e, reason: collision with root package name */
    public final a f35646e;

    /* renamed from: f, reason: collision with root package name */
    public nk.l f35647f;
    public final d1 g;

    /* renamed from: h, reason: collision with root package name */
    public p1.m f35648h;

    /* renamed from: i, reason: collision with root package name */
    public final d1 f35649i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public float f35650k;

    /* renamed from: l, reason: collision with root package name */
    public float f35651l;

    /* renamed from: m, reason: collision with root package name */
    public final c0 f35652m;

    public d0(c cVar) {
        this.f35643b = cVar;
        cVar.f35623i = new c0(this, 0);
        this.f35644c = "";
        this.f35645d = true;
        this.f35646e = new a();
        this.f35647f = f.f35666c;
        this.g = u0.q.r(null);
        this.f35649i = u0.q.r(new o1.e(0L));
        this.j = 9205357640488583168L;
        this.f35650k = 1.0f;
        this.f35651l = 1.0f;
        this.f35652m = new c0(this, 1);
    }

    @Override // v1.b0
    public final void a(r1.d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(r1.d r31, float r32, p1.m r33) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.d0.e(r1.d, float, p1.m):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f35644c);
        sb2.append("\n\tviewportWidth: ");
        d1 d1Var = this.f35649i;
        sb2.append(Float.intBitsToFloat((int) (((o1.e) d1Var.getValue()).f30377a >> 32)));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(Float.intBitsToFloat((int) (((o1.e) d1Var.getValue()).f30377a & 4294967295L)));
        sb2.append("\n");
        String string = sb2.toString();
        nk.k.d(string, "toString(...)");
        return string;
    }
}
