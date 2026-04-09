package lf;

/* loaded from: classes.dex */
public final class l implements xf.d {

    /* renamed from: a, reason: collision with root package name */
    public static final l f15325a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final xf.c f15326b = xf.c.a("baseAddress");

    /* renamed from: c, reason: collision with root package name */
    public static final xf.c f15327c = xf.c.a("size");

    /* renamed from: d, reason: collision with root package name */
    public static final xf.c f15328d = xf.c.a("name");

    /* renamed from: e, reason: collision with root package name */
    public static final xf.c f15329e = xf.c.a("uuid");

    @Override // xf.a
    public final void a(Object obj, Object obj2) {
        xf.e eVar = (xf.e) obj2;
        s0 s0Var = (s0) ((w1) obj);
        eVar.c(f15326b, s0Var.f15425a);
        eVar.c(f15327c, s0Var.f15426b);
        eVar.e(f15328d, s0Var.f15427c);
        String str = s0Var.f15428d;
        eVar.e(f15329e, str != null ? str.getBytes(n2.f15373a) : null);
    }
}
