package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class C1 extends F1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f7490b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7491c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7492d;

    public C1(String str, String str2, String str3) {
        super("COMM");
        this.f7490b = str;
        this.f7491c = str2;
        this.f7492d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1.class == obj.getClass()) {
            C1 c12 = (C1) obj;
            if (Objects.equals(this.f7491c, c12.f7491c) && Objects.equals(this.f7490b, c12.f7490b) && Objects.equals(this.f7492d, c12.f7492d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f7491c.hashCode() + ((this.f7490b.hashCode() + 527) * 31);
        String str = this.f7492d;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.F1
    public final String toString() {
        String str = this.f8061a;
        int length = String.valueOf(str).length();
        String str2 = this.f7492d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f7490b;
        int length3 = str3.length() + length + 11 + 14;
        String str4 = this.f7491c;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 7 + length2);
        A.f.w(sb, str, ": language=", str3, ", description=");
        return AbstractC1135f5.n(sb, str4, ", text=", str2);
    }
}
