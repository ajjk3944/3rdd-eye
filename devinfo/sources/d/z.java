package d;

import b5.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f21644a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21645b;

    public z(i0 i0Var, androidx.lifecycle.a0 a0Var) {
        nk.k.e(i0Var, "callback");
        this.f21644a = i0Var;
        this.f21645b = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return nk.k.a(this.f21644a, zVar.f21644a) && this.f21645b.equals(zVar.f21645b);
    }

    public final int hashCode() {
        return this.f21645b.hashCode() + (this.f21644a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f21644a + ", owner=" + this.f21645b + ')';
    }
}
