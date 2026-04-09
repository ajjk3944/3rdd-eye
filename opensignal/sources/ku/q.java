package ku;

/* loaded from: classes.dex */
public final class q implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final q f14598a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f14599b = new v0("kotlin.Double", iu.c.f12993g);

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        return Double.valueOf(cVar.C());
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14599b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        dVar.e(((Number) obj).doubleValue());
    }
}
