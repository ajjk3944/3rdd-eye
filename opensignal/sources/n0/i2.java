package n0;

/* loaded from: classes.dex */
public final class i2 implements j2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17189a;

    public i2(Object obj) {
        this.f17189a = obj;
    }

    @Override // n0.j2
    public final Object a(f1 f1Var) {
        return this.f17189a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2) && br.l.a(this.f17189a, ((i2) obj).f17189a);
    }

    public final int hashCode() {
        Object obj = this.f17189a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f17189a + ')';
    }
}
