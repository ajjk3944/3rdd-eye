package ku;

/* loaded from: classes.dex */
public final class i implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final i f14560a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f14561b = new v0("kotlin.Byte", iu.c.f12991e);

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        return Byte.valueOf(cVar.z());
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14561b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        dVar.g(((Number) obj).byteValue());
    }
}
