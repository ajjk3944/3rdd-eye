package ku;

/* loaded from: classes.dex */
public final class i1 implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final i1 f14564a = new i1();

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f14565b = p0.a(e0.f14542a, "kotlin.UInt");

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        return new lq.u(cVar.p(f14565b).k());
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14565b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        dVar.m(f14565b).p(((lq.u) obj).f15585a);
    }
}
