package ku;

/* loaded from: classes.dex */
public final class k0 implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f14571a = new k0();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f14572b = new v0("kotlin.Long", iu.c.j);

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        return Long.valueOf(cVar.r());
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14572b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        dVar.q(((Number) obj).longValue());
    }
}
