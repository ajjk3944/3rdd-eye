package t9;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f22671a;

    /* renamed from: b, reason: collision with root package name */
    public final m9.i f22672b;

    /* renamed from: c, reason: collision with root package name */
    public final m9.h f22673c;

    public b(long j, m9.i iVar, m9.h hVar) {
        this.f22671a = j;
        this.f22672b = iVar;
        this.f22673c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f22671a == bVar.f22671a && this.f22672b.equals(bVar.f22672b) && this.f22673c.equals(bVar.f22673c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f22671a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f22672b.hashCode()) * 1000003) ^ this.f22673c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f22671a + ", transportContext=" + this.f22672b + ", event=" + this.f22673c + "}";
    }
}
