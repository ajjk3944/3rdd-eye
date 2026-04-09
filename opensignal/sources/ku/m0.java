package ku;

/* loaded from: classes.dex */
public final class m0 implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f14580a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f14581b = l0.f14575a;

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        throw new gu.e("'kotlin.Nothing' does not have instances");
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14581b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        br.l.e((Void) obj, "value");
        throw new gu.e("'kotlin.Nothing' cannot be serialized");
    }
}
