package lu;

/* loaded from: classes.dex */
public final class b0 implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f15931a = new b0();

    /* renamed from: b, reason: collision with root package name */
    public static final iu.f f15932b = dr.a.c("kotlinx.serialization.json.JsonPrimitive", iu.c.f12996l, new iu.e[0]);

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        l lVarJ = xu.d.c(cVar).j();
        if (lVarJ instanceof a0) {
            return (a0) lVarJ;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw mu.l.d(-1, lVarJ.toString(), h0.b.k(br.x.f2918a, lVarJ.getClass(), sb2));
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f15932b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        a0 a0Var = (a0) obj;
        br.l.e(a0Var, "value");
        xu.d.a(dVar);
        if (a0Var instanceof s) {
            dVar.l(t.f15957a, s.INSTANCE);
        } else {
            dVar.l(q.f15955a, (p) a0Var);
        }
    }
}
