package m9;

/* loaded from: classes.dex */
public final class c implements xf.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f16338a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final xf.c f16339b;

    /* renamed from: c, reason: collision with root package name */
    public static final xf.c f16340c;

    static {
        ag.b bVarC = ag.b.c();
        bVarC.f345d = 1;
        f16339b = new xf.c("eventsDroppedCount", h0.b.w(h0.b.v(ag.f.class, bVarC.b())));
        ag.b bVarC2 = ag.b.c();
        bVarC2.f345d = 3;
        f16340c = new xf.c("reason", h0.b.w(h0.b.v(ag.f.class, bVarC2.b())));
    }

    @Override // xf.a
    public final void a(Object obj, Object obj2) {
        p9.d dVar = (p9.d) obj;
        xf.e eVar = (xf.e) obj2;
        eVar.c(f16339b, dVar.f20343a);
        eVar.e(f16340c, dVar.f20344b);
    }
}
