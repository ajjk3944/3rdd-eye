package un;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f23596a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23597b;

    public b(long j, long j7) {
        this.f23596a = j;
        this.f23597b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f23596a == bVar.f23596a && this.f23597b == bVar.f23597b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23597b) + (Long.hashCode(this.f23596a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MatrixAnswer(rowId=");
        sb2.append(this.f23596a);
        sb2.append(", columnId=");
        return w.g.h(sb2, this.f23597b, ')');
    }
}
