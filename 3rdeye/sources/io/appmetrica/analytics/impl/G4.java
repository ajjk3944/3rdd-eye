package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class G4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f39475a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f39476b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f39477c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f39478d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f39479e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f39480f;

    public G4(E4 e4) {
        this.f39475a = e4.f39328a;
        this.f39476b = e4.f39329b;
        this.f39477c = e4.f39330c;
        this.f39478d = e4.f39331d;
        this.f39479e = e4.f39332e;
        this.f39480f = e4.f39333f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G4.class == obj.getClass()) {
            G4 g42 = (G4) obj;
            if (this.f39475a != g42.f39475a || this.f39476b != g42.f39476b || this.f39477c != g42.f39477c || this.f39478d != g42.f39478d || this.f39479e != g42.f39479e) {
                return false;
            }
            Boolean bool = this.f39480f;
            Boolean bool2 = g42.f39480f;
            if (bool != null) {
                return bool.equals(bool2);
            }
            if (bool2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((((this.f39475a ? 1 : 0) * 31) + (this.f39476b ? 1 : 0)) * 31) + (this.f39477c ? 1 : 0)) * 31) + (this.f39478d ? 1 : 0)) * 31) + (this.f39479e ? 1 : 0)) * 31;
        Boolean bool = this.f39480f;
        return i + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f39475a + ", featuresCollectingEnabled=" + this.f39476b + ", googleAid=" + this.f39477c + ", simInfo=" + this.f39478d + ", huaweiOaid=" + this.f39479e + ", sslPinning=" + this.f39480f + '}';
    }
}
