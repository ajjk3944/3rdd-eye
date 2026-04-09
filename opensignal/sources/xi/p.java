package xi;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f25358a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25359b;

    public p(long j, long j7) {
        this.f25358a = j;
        this.f25359b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f25358a == pVar.f25358a && this.f25359b == pVar.f25359b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25359b) + (Long.hashCode(this.f25358a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultData(id=");
        sb2.append(this.f25358a);
        sb2.append(", insertedAt=");
        return w.g.h(sb2, this.f25359b, ')');
    }
}
