package x3;

import x3.x;

/* compiled from: AutoValue_ClientInfo.java */
/* loaded from: classes.dex */
public final class n extends x {

    /* renamed from: a, reason: collision with root package name */
    public final x.a f47725a;

    /* renamed from: b, reason: collision with root package name */
    public final l f47726b;

    public n(x.a aVar, l lVar) {
        this.f47725a = aVar;
        this.f47726b = lVar;
    }

    @Override // x3.x
    public final AbstractC5759a a() {
        return this.f47726b;
    }

    @Override // x3.x
    public final x.a b() {
        return this.f47725a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        x.a aVar = this.f47725a;
        if (aVar == null) {
            if (xVar.b() != null) {
                return false;
            }
        } else if (!aVar.equals(xVar.b())) {
            return false;
        }
        l lVar = this.f47726b;
        return lVar == null ? xVar.a() == null : lVar.equals(xVar.a());
    }

    public final int hashCode() {
        x.a aVar = this.f47725a;
        int iHashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        l lVar = this.f47726b;
        return (lVar != null ? lVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f47725a + ", androidClientInfo=" + this.f47726b + "}";
    }
}
