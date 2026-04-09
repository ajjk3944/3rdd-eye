package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final float f2522a;

    /* renamed from: b, reason: collision with root package name */
    public final p1.l0 f2523b;

    public x(float f10, p1.l0 l0Var) {
        this.f2522a = f10;
        this.f2523b = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return d3.f.b(this.f2522a, xVar.f2522a) && this.f2523b.equals(xVar.f2523b);
    }

    public final int hashCode() {
        return this.f2523b.hashCode() + (Float.floatToIntBits(this.f2522a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) d3.f.c(this.f2522a)) + ", brush=" + this.f2523b + ')';
    }
}
