package ku;

/* loaded from: classes.dex */
public final class f implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f14545a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f14546b = new v0("kotlin.Boolean", iu.c.f12990d);

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        return Boolean.valueOf(cVar.d());
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14546b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        dVar.h(((Boolean) obj).booleanValue());
    }
}
