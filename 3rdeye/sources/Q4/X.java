package Q4;

import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
/* loaded from: classes2.dex */
public final class X extends f0.e.d.AbstractC0145e.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f11135a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11136b;

    public X(String str, String str2) {
        this.f11135a = str;
        this.f11136b = str2;
    }

    @Override // Q4.f0.e.d.AbstractC0145e.b
    public final String a() {
        return this.f11135a;
    }

    @Override // Q4.f0.e.d.AbstractC0145e.b
    public final String b() {
        return this.f11136b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.AbstractC0145e.b)) {
            return false;
        }
        f0.e.d.AbstractC0145e.b bVar = (f0.e.d.AbstractC0145e.b) obj;
        return this.f11135a.equals(bVar.a()) && this.f11136b.equals(bVar.b());
    }

    public final int hashCode() {
        return ((this.f11135a.hashCode() ^ 1000003) * 1000003) ^ this.f11136b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f11135a);
        sb.append(", variantId=");
        return B4.f.c(sb, this.f11136b, "}");
    }
}
