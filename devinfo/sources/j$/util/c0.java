package j$.util;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f26293c = new c0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26294a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26295b;

    public c0() {
        this.f26294a = false;
        this.f26295b = 0;
    }

    public c0(int i4) {
        this.f26294a = true;
        this.f26295b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        boolean z3 = c0Var.f26294a;
        boolean z10 = this.f26294a;
        return (z10 && z3) ? this.f26295b == c0Var.f26295b : z10 == z3;
    }

    public final int hashCode() {
        if (this.f26294a) {
            return this.f26295b;
        }
        return 0;
    }

    public final String toString() {
        if (this.f26294a) {
            return "OptionalInt[" + this.f26295b + "]";
        }
        return "OptionalInt.empty";
    }
}
