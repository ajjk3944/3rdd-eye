package lr;

/* loaded from: classes.dex */
public final /* synthetic */ class q0 extends br.j implements ar.n {
    public static final q0 E = new q0(2);

    @Override // br.d
    public final String B() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // br.d, ir.c
    public final String getName() {
        return "loadProperty";
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        dt.t tVar = (dt.t) obj;
        ls.g0 g0Var = (ls.g0) obj2;
        br.l.e(tVar, "p0");
        br.l.e(g0Var, "p1");
        return tVar.f(g0Var);
    }

    @Override // br.d
    public final ir.f z() {
        return br.x.f2918a.b(dt.t.class);
    }
}
