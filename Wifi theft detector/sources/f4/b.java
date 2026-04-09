package f4;

/* loaded from: classes2.dex */
public final class b extends k {

    /* renamed from: a, reason: collision with root package name */
    public final long f21065a;

    /* renamed from: b, reason: collision with root package name */
    public final x3.o f21066b;

    /* renamed from: c, reason: collision with root package name */
    public final x3.i f21067c;

    public b(long j10, x3.o oVar, x3.i iVar) {
        this.f21065a = j10;
        if (oVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f21066b = oVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f21067c = iVar;
    }

    @Override // f4.k
    public x3.i b() {
        return this.f21067c;
    }

    @Override // f4.k
    public long c() {
        return this.f21065a;
    }

    @Override // f4.k
    public x3.o d() {
        return this.f21066b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f21065a == kVar.c() && this.f21066b.equals(kVar.d()) && this.f21067c.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f21065a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f21066b.hashCode()) * 1000003) ^ this.f21067c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f21065a + ", transportContext=" + this.f21066b + ", event=" + this.f21067c + "}";
    }
}
