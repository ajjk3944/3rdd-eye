package m9;

/* loaded from: classes.dex */
public final class d implements xf.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f16341a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final xf.c f16342b;

    /* renamed from: c, reason: collision with root package name */
    public static final xf.c f16343c;

    static {
        ag.b bVarC = ag.b.c();
        bVarC.f345d = 1;
        f16342b = new xf.c("logSource", h0.b.w(h0.b.v(ag.f.class, bVarC.b())));
        ag.b bVarC2 = ag.b.c();
        bVarC2.f345d = 2;
        f16343c = new xf.c("logEventDropped", h0.b.w(h0.b.v(ag.f.class, bVarC2.b())));
    }

    @Override // xf.a
    public final void a(Object obj, Object obj2) {
        p9.e eVar = (p9.e) obj;
        xf.e eVar2 = (xf.e) obj2;
        eVar2.e(f16342b, eVar.f20346a);
        eVar2.e(f16343c, eVar.f20347b);
    }
}
