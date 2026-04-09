package ku;

/* loaded from: classes.dex */
public final class b1 implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f14529a = new b1();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f14530b = new v0("kotlin.Short", iu.c.k);

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        return Short.valueOf(cVar.A());
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14530b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        dVar.f(((Number) obj).shortValue());
    }
}
