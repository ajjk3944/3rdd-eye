package ku;

/* loaded from: classes.dex */
public final class m implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final m f14578a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f14579b = new v0("kotlin.Char", iu.c.f12992f);

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        return Character.valueOf(cVar.e());
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14579b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        dVar.k(((Character) obj).charValue());
    }
}
