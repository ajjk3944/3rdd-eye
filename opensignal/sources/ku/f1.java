package ku;

/* loaded from: classes.dex */
public final class f1 implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f14549a = new f1();

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f14550b = p0.a(i.f14560a, "kotlin.UByte");

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        return new lq.s(cVar.p(f14550b).z());
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14550b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        dVar.m(f14550b).g(((lq.s) obj).f15583a);
    }
}
