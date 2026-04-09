package F3;

/* compiled from: AutoValue_PersistedEvent.java */
/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final long f1603a;

    /* renamed from: b, reason: collision with root package name */
    public final y3.r f1604b;

    /* renamed from: c, reason: collision with root package name */
    public final y3.m f1605c;

    public b(long j4, y3.r rVar, y3.m mVar) {
        this.f1603a = j4;
        if (rVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f1604b = rVar;
        if (mVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f1605c = mVar;
    }

    @Override // F3.g
    public final y3.m a() {
        return this.f1605c;
    }

    @Override // F3.g
    public final long b() {
        return this.f1603a;
    }

    @Override // F3.g
    public final y3.r c() {
        return this.f1604b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1603a == gVar.b() && this.f1604b.equals(gVar.c()) && this.f1605c.equals(gVar.a());
    }

    public final int hashCode() {
        long j4 = this.f1603a;
        return ((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f1604b.hashCode()) * 1000003) ^ this.f1605c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f1603a + ", transportContext=" + this.f1604b + ", event=" + this.f1605c + "}";
    }
}
