package ku;

/* loaded from: classes.dex */
public final class o1 implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f14591a = new o1();

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f14592b = p0.a(b1.f14529a, "kotlin.UShort");

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        return new lq.z(cVar.p(f14592b).A());
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14592b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        dVar.m(f14592b).f(((lq.z) obj).f15590a);
    }
}
