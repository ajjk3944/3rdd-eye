package x3;

import x3.F;

/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* loaded from: classes.dex */
public final class v extends F {

    /* renamed from: a, reason: collision with root package name */
    public final F.b f47757a;

    /* renamed from: b, reason: collision with root package name */
    public final F.a f47758b;

    public v(F.b bVar, F.a aVar) {
        this.f47757a = bVar;
        this.f47758b = aVar;
    }

    @Override // x3.F
    public final F.a a() {
        return this.f47758b;
    }

    @Override // x3.F
    public final F.b b() {
        return this.f47757a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        F.b bVar = this.f47757a;
        if (bVar == null) {
            if (f10.b() != null) {
                return false;
            }
        } else if (!bVar.equals(f10.b())) {
            return false;
        }
        F.a aVar = this.f47758b;
        return aVar == null ? f10.a() == null : aVar.equals(f10.a());
    }

    public final int hashCode() {
        F.b bVar = this.f47757a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        F.a aVar = this.f47758b;
        return (aVar != null ? aVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f47757a + ", mobileSubtype=" + this.f47758b + "}";
    }
}
