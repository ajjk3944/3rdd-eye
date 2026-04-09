package e5;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f7826a;

    /* renamed from: b, reason: collision with root package name */
    public final Exception f7827b;

    public h0(a aVar, Exception exc) {
        this.f7826a = aVar;
        this.f7827b = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f7826a.equals(h0Var.f7826a)) {
            return this.f7827b.equals(h0Var.f7827b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7827b.hashCode() + (this.f7826a.hashCode() * 31);
    }
}
