package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class J2 {

    /* renamed from: a, reason: collision with root package name */
    public final I2 f39667a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f39668b;

    public J2(I2 i22, Boolean bool) {
        this.f39667a = i22;
        this.f39668b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J2.class == obj.getClass()) {
            J2 j22 = (J2) obj;
            if (this.f39667a != j22.f39667a) {
                return false;
            }
            Boolean bool = this.f39668b;
            if (bool != null) {
                return bool.equals(j22.f39668b);
            }
            if (j22.f39668b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        I2 i22 = this.f39667a;
        int iHashCode = (i22 != null ? i22.hashCode() : 0) * 31;
        Boolean bool = this.f39668b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.f39667a + ", mBackgroundRestricted=" + this.f39668b + '}';
    }
}
