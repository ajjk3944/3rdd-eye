package x3;

import x3.y;

/* compiled from: AutoValue_ComplianceData.java */
/* loaded from: classes.dex */
public final class o extends y {

    /* renamed from: a, reason: collision with root package name */
    public final r f47727a;

    /* renamed from: b, reason: collision with root package name */
    public final y.a f47728b;

    public o(r rVar, y.a aVar) {
        this.f47727a = rVar;
        this.f47728b = aVar;
    }

    @Override // x3.y
    public final B a() {
        return this.f47727a;
    }

    @Override // x3.y
    public final y.a b() {
        return this.f47728b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        r rVar = this.f47727a;
        if (rVar == null) {
            if (yVar.a() != null) {
                return false;
            }
        } else if (!rVar.equals(yVar.a())) {
            return false;
        }
        y.a aVar = this.f47728b;
        return aVar == null ? yVar.b() == null : aVar.equals(yVar.b());
    }

    public final int hashCode() {
        r rVar = this.f47727a;
        int iHashCode = ((rVar == null ? 0 : rVar.hashCode()) ^ 1000003) * 1000003;
        y.a aVar = this.f47728b;
        return (aVar != null ? aVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f47727a + ", productIdOrigin=" + this.f47728b + "}";
    }
}
