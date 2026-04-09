package ku;

/* loaded from: classes.dex */
public final class l1 implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l1 f14576a = new l1();

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f14577b = p0.a(k0.f14571a, "kotlin.ULong");

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        return new lq.w(cVar.p(f14577b).r());
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14577b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        dVar.m(f14577b).q(((lq.w) obj).f15587a);
    }
}
