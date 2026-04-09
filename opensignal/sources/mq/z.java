package mq;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f16948a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16949b;

    public z(int i10, Object obj) {
        this.f16948a = i10;
        this.f16949b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f16948a == zVar.f16948a && br.l.a(this.f16949b, zVar.f16949b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f16948a) * 31;
        Object obj = this.f16949b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f16948a + ", value=" + this.f16949b + ')';
    }
}
