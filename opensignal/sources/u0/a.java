package u0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f23136a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f23136a == ((a) obj).f23136a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23136a);
    }

    public final String toString() {
        return c7.a.q(new StringBuilder("DeltaCounter(count="), this.f23136a, ')');
    }
}
