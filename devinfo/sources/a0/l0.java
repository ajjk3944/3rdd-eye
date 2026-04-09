package a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l0 implements z {

    /* renamed from: a, reason: collision with root package name */
    public final float f77a;

    /* renamed from: b, reason: collision with root package name */
    public final float f78b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f79c;

    public l0(float f10, float f11, Object obj) {
        this.f77a = f10;
        this.f78b = f11;
        this.f79c = obj;
    }

    @Override // a0.l
    public final v0 c(y4.a aVar) {
        Object obj = this.f79c;
        r rVar = obj == null ? null : (r) ((mk.c) aVar.f37323a).invoke(obj);
        int i4 = w0.f142a;
        float f10 = this.f77a;
        float f11 = this.f78b;
        Object cVar = rVar != null ? new jf.c(rVar, f10, f11) : new o7.c(f10, f11);
        p6.i iVar = new p6.i();
        iVar.f31385a = new x0(0, cVar);
        return iVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            if (l0Var.f77a == this.f77a && l0Var.f78b == this.f78b && nk.k.a(l0Var.f79c, this.f79c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f79c;
        return Float.floatToIntBits(this.f78b) + r5.c.d(this.f77a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
