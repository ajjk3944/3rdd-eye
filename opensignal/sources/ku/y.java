package ku;

/* loaded from: classes.dex */
public final class y implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final y f14639a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f14640b = new v0("kotlin.Float", iu.c.f12994h);

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        return Float.valueOf(cVar.B());
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14640b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        dVar.j(((Number) obj).floatValue());
    }
}
