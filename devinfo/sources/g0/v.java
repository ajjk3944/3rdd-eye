package g0;

import i2.p1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v extends i1.m implements p1 {

    /* renamed from: o, reason: collision with root package name */
    public float f24185o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f24186p;

    @Override // i2.p1
    public final Object Z(Object obj) {
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        if (e0Var == null) {
            e0Var = new e0();
            e0Var.f24111a = 0.0f;
            e0Var.f24112b = true;
        }
        e0Var.f24111a = this.f24185o;
        e0Var.f24112b = this.f24186p;
        return e0Var;
    }
}
