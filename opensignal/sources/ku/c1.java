package ku;

/* loaded from: classes.dex */
public final class c1 implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c1 f14534a = new c1();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f14535b = new v0("kotlin.String", iu.c.f12996l);

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        return cVar.n();
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14535b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        String str = (String) obj;
        br.l.e(str, "value");
        dVar.r(str);
    }
}
