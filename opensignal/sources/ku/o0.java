package ku;

/* loaded from: classes.dex */
public final class o0 implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14590a = kc.f.E(lq.j.PUBLICATION, new androidx.lifecycle.p0(9, this));

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        iu.e descriptor = getDescriptor();
        ju.a aVarB = cVar.b(descriptor);
        int iT = aVarB.t(getDescriptor());
        if (iT != -1) {
            throw new gu.e(h0.b.h(iT, "Unexpected index "));
        }
        aVarB.c(descriptor);
        return lq.b0.f15562a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // gu.a
    public final iu.e getDescriptor() {
        return (iu.e) this.f14590a.getValue();
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        br.l.e(obj, "value");
        dVar.b(getDescriptor()).c(getDescriptor());
    }
}
