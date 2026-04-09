package f7;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f23716a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f23717b;

    public c0(j jVar) {
        this.f23716a = jVar;
        this.f23717b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        j jVar = this.f23716a;
        if (jVar != null && jVar.equals(c0Var.f23716a)) {
            return true;
        }
        Throwable th2 = this.f23717b;
        if (th2 == null || c0Var.f23717b == null) {
            return false;
        }
        return th2.toString().equals(th2.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23716a, this.f23717b});
    }

    public c0(Throwable th2) {
        this.f23717b = th2;
        this.f23716a = null;
    }
}
