package n0;

/* loaded from: classes.dex */
public final class h0 implements j2 {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f17176a;

    public h0(x0 x0Var) {
        this.f17176a = x0Var;
    }

    @Override // n0.j2
    public final Object a(f1 f1Var) {
        return ((b2) this.f17176a).getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && br.l.a(this.f17176a, ((h0) obj).f17176a);
    }

    public final int hashCode() {
        return this.f17176a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f17176a + ')';
    }
}
