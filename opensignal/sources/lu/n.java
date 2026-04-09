package lu;

/* loaded from: classes.dex */
public final class n implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final n f15951a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final iu.f f15952b = dr.a.b("kotlinx.serialization.json.JsonElement", iu.b.f12989d, new iu.e[0], new h2.o(29));

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        return xu.d.c(cVar).j();
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f15952b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        l lVar = (l) obj;
        br.l.e(lVar, "value");
        xu.d.a(dVar);
        if (lVar instanceof a0) {
            dVar.l(b0.f15931a, lVar);
        } else if (lVar instanceof w) {
            dVar.l(y.f15964a, lVar);
        } else {
            if (!(lVar instanceof e)) {
                throw new bf.n();
            }
            dVar.l(g.f15941a, lVar);
        }
    }
}
