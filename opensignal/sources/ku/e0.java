package ku;

/* loaded from: classes.dex */
public final class e0 implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f14542a = new e0();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f14543b = new v0("kotlin.Int", iu.c.f12995i);

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        return Integer.valueOf(cVar.k());
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14543b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        dVar.p(((Number) obj).intValue());
    }
}
