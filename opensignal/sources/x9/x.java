package x9;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final q f25211a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25212b;

    public x(q qVar, int i10) {
        this.f25211a = qVar;
        this.f25212b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f25212b != xVar.f25212b) {
            return false;
        }
        return this.f25211a.equals(xVar.f25211a);
    }

    public final int hashCode() {
        return (this.f25211a.hashCode() * 31) + this.f25212b;
    }
}
