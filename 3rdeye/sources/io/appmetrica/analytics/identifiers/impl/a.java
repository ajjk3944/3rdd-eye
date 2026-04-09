package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f39047a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39048b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f39049c;

    public a(String str, String str2, Boolean bool) {
        this.f39047a = str;
        this.f39048b = str2;
        this.f39049c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.l.b(this.f39047a, aVar.f39047a) && kotlin.jvm.internal.l.b(this.f39048b, aVar.f39048b) && kotlin.jvm.internal.l.b(this.f39049c, aVar.f39049c);
    }

    public final int hashCode() {
        int iHashCode = this.f39047a.hashCode() * 31;
        String str = this.f39048b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f39049c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f39047a + ", advId=" + this.f39048b + ", limitedAdTracking=" + this.f39049c + ')';
    }
}
