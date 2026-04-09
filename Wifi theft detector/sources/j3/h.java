package j3;

import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f21751a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21752b;

    public h(String adUnitId, String placementId) {
        p.e(adUnitId, "adUnitId");
        p.e(placementId, "placementId");
        this.f21751a = adUnitId;
        this.f21752b = placementId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p.a(this.f21751a, hVar.f21751a) && p.a(this.f21752b, hVar.f21752b);
    }

    public int hashCode() {
        return (this.f21751a.hashCode() * 31) + this.f21752b.hashCode();
    }

    public String toString() {
        return "MintegralSlotIdentifier(adUnitId=" + this.f21751a + ", placementId=" + this.f21752b + ")";
    }
}
