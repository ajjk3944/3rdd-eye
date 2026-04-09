package as;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final v f2253c;

    /* renamed from: a, reason: collision with root package name */
    public final y f2254a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2255b;

    static {
        qs.c cVar = s.f2245a;
        lq.g gVar = lq.g.f15565x;
        br.l.e(gVar, "configuredKotlinVersion");
        t tVar = s.f2248d;
        lq.g gVar2 = tVar.f2251b;
        f0 f0Var = (gVar2 == null || gVar2.f15569r - gVar.f15569r > 0) ? tVar.f2250a : tVar.f2252c;
        br.l.e(f0Var, "globalReportLevel");
        y yVar = new y(f0Var, f0Var == f0.WARN ? null : f0Var);
        u uVar = u.E;
        f2253c = new v(yVar);
    }

    public v(y yVar) {
        u uVar = u.E;
        this.f2254a = yVar;
        this.f2255b = yVar.f2262d || uVar.a(s.f2245a) == f0.IGNORE;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f2254a + ", getReportLevelForAnnotation=" + u.E + ')';
    }
}
