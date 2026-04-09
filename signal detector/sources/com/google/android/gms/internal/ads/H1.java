package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class H1 extends F1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f8535b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8536c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8537d;

    public H1(String str, String str2, String str3) {
        super("----");
        this.f8535b = str;
        this.f8536c = str2;
        this.f8537d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && H1.class == obj.getClass()) {
            H1 h12 = (H1) obj;
            if (Objects.equals(this.f8536c, h12.f8536c) && Objects.equals(this.f8535b, h12.f8535b) && Objects.equals(this.f8537d, h12.f8537d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8537d.hashCode() + ((this.f8536c.hashCode() + ((this.f8535b.hashCode() + 527) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.F1
    public final String toString() {
        String str = this.f8061a;
        int length = String.valueOf(str).length() + 9;
        String str2 = this.f8535b;
        int length2 = str2.length() + length + 14;
        String str3 = this.f8536c;
        StringBuilder sb = new StringBuilder(str3.length() + length2);
        A.f.w(sb, str, ": domain=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}
