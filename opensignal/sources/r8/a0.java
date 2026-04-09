package r8;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final h f21304a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f21305b;

    public a0(h hVar) {
        this.f21304a = hVar;
        this.f21305b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        h hVar = this.f21304a;
        if (hVar != null && hVar.equals(a0Var.f21304a)) {
            return true;
        }
        Throwable th2 = this.f21305b;
        if (th2 == null || a0Var.f21305b == null) {
            return false;
        }
        return th2.toString().equals(th2.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21304a, this.f21305b});
    }

    public a0(Throwable th2) {
        this.f21305b = th2;
        this.f21304a = null;
    }
}
