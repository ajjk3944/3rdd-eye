package g0;

import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f24183a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24184b;

    public u(float f10, boolean z3) {
        this.f24183a = f10;
        this.f24184b = z3;
    }

    @Override // i2.v0
    public final i1.m d() {
        v vVar = new v();
        vVar.f24185o = this.f24183a;
        vVar.f24186p = this.f24184b;
        return vVar;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        v vVar = (v) mVar;
        vVar.f24185o = this.f24183a;
        vVar.f24186p = this.f24184b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        u uVar = obj instanceof u ? (u) obj : null;
        return uVar != null && this.f24183a == uVar.f24183a && this.f24184b == uVar.f24184b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f24183a) * 31) + (this.f24184b ? 1231 : 1237);
    }
}
