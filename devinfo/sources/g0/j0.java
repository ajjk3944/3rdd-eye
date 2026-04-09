package g0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r f24137a = new r(q.f24173b);

    /* renamed from: b, reason: collision with root package name */
    public static final r f24138b;

    /* renamed from: c, reason: collision with root package name */
    public static final o0 f24139c;

    /* renamed from: d, reason: collision with root package name */
    public static final o0 f24140d;

    /* renamed from: e, reason: collision with root package name */
    public static final o0 f24141e;

    /* renamed from: f, reason: collision with root package name */
    public static final o0 f24142f;

    static {
        q qVar = q.f24174c;
        f24138b = new r(qVar);
        i1.d dVar = i1.b.f25539k;
        bl.z zVar = new bl.z(3, dVar);
        q qVar2 = q.f24172a;
        f24139c = new o0(qVar2, zVar, dVar);
        i1.d dVar2 = i1.b.j;
        f24140d = new o0(qVar2, new bl.z(3, dVar2), dVar2);
        i1.e eVar = i1.b.f25535e;
        f24141e = new o0(qVar, new bl.z(4, eVar), eVar);
        i1.e eVar2 = i1.b.f25531a;
        f24142f = new o0(qVar, new bl.z(4, eVar2), eVar2);
    }

    public static final i1.n a(float f10, float f11) {
        return new m0(f10, f11);
    }

    public static final i1.n b(i1.n nVar, float f10) {
        return nVar.b(new i0(0.0f, f10, 0.0f, f10, 5));
    }

    public static final i1.n c(i1.n nVar, float f10, float f11) {
        return nVar.b(new i0(f10, f11, f10, f11, false));
    }

    public static final i1.n d(i1.n nVar, float f10) {
        return nVar.b(new i0(f10, f10, f10, f10, true));
    }

    public static final i1.n e(float f10) {
        return new i0(f10, 0.0f, f10, 0.0f, 10);
    }

    public static i1.n f(float f10) {
        return new i0(Float.NaN, 0.0f, f10, 0.0f, 10);
    }

    public static i1.n g(i1.n nVar) {
        o0 o0Var;
        i1.d dVar = i1.b.f25539k;
        if (nk.k.a(dVar, dVar)) {
            o0Var = f24139c;
        } else if (nk.k.a(dVar, i1.b.j)) {
            o0Var = f24140d;
        } else {
            o0Var = new o0(q.f24172a, new bl.z(3, dVar), dVar);
        }
        return nVar.b(o0Var);
    }

    public static i1.n h(i1.n nVar) {
        o0 o0Var;
        i1.e eVar = i1.b.f25535e;
        if (eVar.equals(eVar)) {
            o0Var = f24141e;
        } else if (eVar.equals(i1.b.f25531a)) {
            o0Var = f24142f;
        } else {
            o0Var = new o0(q.f24174c, new bl.z(4, eVar), eVar);
        }
        return nVar.b(o0Var);
    }
}
