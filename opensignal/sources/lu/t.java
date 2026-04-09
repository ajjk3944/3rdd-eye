package lu;

/* loaded from: classes.dex */
public final class t implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f15957a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final iu.f f15958b = dr.a.c("kotlinx.serialization.json.JsonNull", iu.i.f13010d, new iu.e[0]);

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        xu.d.c(cVar);
        if (cVar.u()) {
            throw new mu.h("Expected 'null' literal");
        }
        return s.INSTANCE;
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f15958b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        br.l.e((s) obj, "value");
        xu.d.a(dVar);
        dVar.d();
    }
}
