package ku;

/* loaded from: classes.dex */
public final class p1 implements gu.a {

    /* renamed from: b, reason: collision with root package name */
    public static final p1 f14596b = new p1();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f14597a = new o0();

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        this.f14597a.deserialize(cVar);
        return lq.b0.f15562a;
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return this.f14597a.getDescriptor();
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        lq.b0 b0Var = (lq.b0) obj;
        br.l.e(b0Var, "value");
        this.f14597a.serialize(dVar, b0Var);
    }
}
