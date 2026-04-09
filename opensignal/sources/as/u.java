package as;

/* loaded from: classes.dex */
public final /* synthetic */ class u extends br.j implements ar.k {
    public static final u E = new u(1);

    @Override // br.d
    public final String B() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // ar.k
    public final Object a(Object obj) {
        qs.c cVar = (qs.c) obj;
        br.l.e(cVar, "p0");
        qs.c cVar2 = s.f2245a;
        d0.f2209c.getClass();
        io.sentry.internal.debugmeta.c cVar3 = c0.f2206b;
        lq.g gVar = new lq.g(1, 7, 20);
        br.l.e(cVar3, "configuredReportLevels");
        f0 f0Var = (f0) ((gt.j) cVar3.f12354g).a(cVar);
        if (f0Var != null) {
            return f0Var;
        }
        io.sentry.internal.debugmeta.c cVar4 = s.f2247c;
        cVar4.getClass();
        t tVar = (t) ((gt.j) cVar4.f12354g).a(cVar);
        if (tVar == null) {
            return f0.IGNORE;
        }
        lq.g gVar2 = tVar.f2251b;
        return (gVar2 == null || gVar2.f15569r - gVar.f15569r > 0) ? tVar.f2250a : tVar.f2252c;
    }

    @Override // br.d, ir.c
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // br.d
    public final ir.f z() {
        return br.x.f2918a.c(s.class, "compiler.common.jvm");
    }
}
