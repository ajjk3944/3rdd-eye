package vs;

/* loaded from: classes.dex */
public final class s extends t {

    /* renamed from: a, reason: collision with root package name */
    public final f f23966a;

    public s(f fVar) {
        this.f23966a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && br.l.a(this.f23966a, ((s) obj).f23966a);
    }

    public final int hashCode() {
        return this.f23966a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.f23966a + ')';
    }
}
