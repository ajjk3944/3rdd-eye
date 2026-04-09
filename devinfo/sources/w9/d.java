package w9;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final f f36545d;

    /* renamed from: b, reason: collision with root package name */
    public float f36546b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f36547c = 0.0f;

    static {
        f fVarA = f.a(32, new d());
        f36545d = fVarA;
        fVarA.f36554f = 0.5f;
    }

    public static d b(float f10, float f11) {
        d dVar = (d) f36545d.b();
        dVar.f36546b = f10;
        dVar.f36547c = f11;
        return dVar;
    }

    public static void c(d dVar) {
        f36545d.c(dVar);
    }

    @Override // w9.e
    public final e a() {
        return new d();
    }
}
