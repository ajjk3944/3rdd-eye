package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class L1 extends F1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f9596b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9597c;

    public L1(String str, String str2, String str3) {
        super(str);
        this.f9596b = str2;
        this.f9597c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && L1.class == obj.getClass()) {
            L1 l12 = (L1) obj;
            if (this.f8061a.equals(l12.f8061a) && Objects.equals(this.f9596b, l12.f9596b) && Objects.equals(this.f9597c, l12.f9597c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f8061a.hashCode() + 527;
        String str = this.f9596b;
        return this.f9597c.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.F1
    public final String toString() {
        String str = this.f8061a;
        int length = String.valueOf(str).length() + 6;
        String str2 = this.f9597c;
        return AbstractC1135f5.n(new StringBuilder(str2.length() + length), str, ": url=", str2);
    }
}
