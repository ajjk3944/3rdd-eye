package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i4 extends g4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f12138b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12139c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12140d;

    public i4(String str, String str2, String str3) {
        super("----");
        this.f12138b = str;
        this.f12139c = str2;
        this.f12140d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i4.class == obj.getClass()) {
            i4 i4Var = (i4) obj;
            if (Objects.equals(this.f12139c, i4Var.f12139c) && Objects.equals(this.f12138b, i4Var.f12138b) && Objects.equals(this.f12140d, i4Var.f12140d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12140d.hashCode() + ((this.f12139c.hashCode() + ((this.f12138b.hashCode() + 527) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.g4
    public final String toString() {
        String str = this.f11366a;
        int length = String.valueOf(str).length() + 9;
        String str2 = this.f12138b;
        int length2 = str2.length() + length + 14;
        String str3 = this.f12139c;
        StringBuilder sb2 = new StringBuilder(str3.length() + length2);
        je.u.B(sb2, str, ": domain=", str2, ", description=");
        sb2.append(str3);
        return sb2.toString();
    }
}
