package W7;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f23678a;

    /* renamed from: b, reason: collision with root package name */
    private final a f23679b;

    public b(a aVar, a aVar2) {
        this.f23678a = aVar;
        this.f23679b = aVar2;
    }

    public final b a(a aVar, a aVar2) {
        return new b(aVar, aVar2);
    }

    public final a b() {
        return this.f23678a;
    }

    public final a c() {
        return this.f23679b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC6492s.d(this.f23678a, bVar.f23678a) && AbstractC6492s.d(this.f23679b, bVar.f23679b);
    }

    public int hashCode() {
        a aVar = this.f23678a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        a aVar2 = this.f23679b;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public String toString() {
        return "LinkSpeed(download=" + this.f23678a + ", upload=" + this.f23679b + ")";
    }
}
