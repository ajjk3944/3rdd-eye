package rs;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21748a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21749b;

    public f(int i10, Object obj) {
        this.f21748a = obj;
        this.f21749b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f21748a == fVar.f21748a && this.f21749b == fVar.f21749b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f21748a) * 65535) + this.f21749b;
    }
}
