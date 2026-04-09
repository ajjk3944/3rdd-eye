package g0;

import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class o0 extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final q f24163a;

    /* renamed from: b, reason: collision with root package name */
    public final mk.e f24164b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24165c;

    public o0(q qVar, mk.e eVar, Object obj) {
        this.f24163a = qVar;
        this.f24164b = eVar;
        this.f24165c = obj;
    }

    @Override // i2.v0
    public final i1.m d() {
        q0 q0Var = new q0();
        q0Var.f24176o = this.f24163a;
        q0Var.f24177p = this.f24164b;
        return q0Var;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        q0 q0Var = (q0) mVar;
        q0Var.f24176o = this.f24163a;
        q0Var.f24177p = this.f24164b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0.class != obj.getClass()) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f24163a == o0Var.f24163a && this.f24165c.equals(o0Var.f24165c);
    }

    public final int hashCode() {
        return this.f24165c.hashCode() + (((this.f24163a.hashCode() * 31) + 1237) * 31);
    }
}
