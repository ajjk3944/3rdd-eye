package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2101x1 implements B3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17532a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17533b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17534c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17535d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17536e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17537f;

    public C2101x1(String str, boolean z6, int i, String str2, int i3, String str3) {
        boolean z7 = true;
        if (i3 != -1 && i3 <= 0) {
            z7 = false;
        }
        AbstractC0582Jp.m(z7);
        this.f17532a = i;
        this.f17533b = str;
        this.f17534c = str2;
        this.f17535d = str3;
        this.f17536e = z6;
        this.f17537f = i3;
    }

    @Override // com.google.android.gms.internal.ads.B3
    public final void a(O2 o22) {
        String str = this.f17534c;
        if (str != null) {
            o22.f10148x = str;
        }
        String str2 = this.f17533b;
        if (str2 != null) {
            o22.f10147w = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2101x1.class == obj.getClass()) {
            C2101x1 c2101x1 = (C2101x1) obj;
            if (this.f17532a == c2101x1.f17532a && Objects.equals(this.f17533b, c2101x1.f17533b) && Objects.equals(this.f17534c, c2101x1.f17534c) && Objects.equals(this.f17535d, c2101x1.f17535d) && this.f17536e == c2101x1.f17536e && this.f17537f == c2101x1.f17537f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f17533b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f17534c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = ((this.f17532a + 527) * 31) + iHashCode;
        String str3 = this.f17535d;
        return (((((((i * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f17536e ? 1 : 0)) * 31) + this.f17537f;
    }

    public final String toString() {
        String str = this.f17534c;
        int length = String.valueOf(str).length();
        String str2 = this.f17533b;
        int length2 = String.valueOf(str2).length();
        int i = this.f17532a;
        int length3 = String.valueOf(i).length();
        int i3 = this.f17537f;
        StringBuilder sb = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i3).length());
        A.f.w(sb, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return A.f.o(sb, "\", bitrate=", i, ", metadataInterval=", i3);
    }
}
