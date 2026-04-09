package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class i9 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28591a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28592b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28593c;

    public i9(String token, String advertiserInfo, boolean z10) {
        kotlin.jvm.internal.l.f(token, "token");
        kotlin.jvm.internal.l.f(advertiserInfo, "advertiserInfo");
        this.f28591a = z10;
        this.f28592b = token;
        this.f28593c = advertiserInfo;
    }

    public final String a() {
        return this.f28593c;
    }

    public final boolean b() {
        return this.f28591a;
    }

    public final String c() {
        return this.f28592b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9)) {
            return false;
        }
        i9 i9Var = (i9) obj;
        return this.f28591a == i9Var.f28591a && kotlin.jvm.internal.l.b(this.f28592b, i9Var.f28592b) && kotlin.jvm.internal.l.b(this.f28593c, i9Var.f28593c);
    }

    public final int hashCode() {
        return this.f28593c.hashCode() + C4121h3.a(this.f28592b, (this.f28591a ? 1231 : 1237) * 31, 31);
    }

    public final String toString() {
        boolean z10 = this.f28591a;
        String str = this.f28592b;
        String str2 = this.f28593c;
        StringBuilder sb = new StringBuilder("AdTuneInfo(shouldShow=");
        sb.append(z10);
        sb.append(", token=");
        sb.append(str);
        sb.append(", advertiserInfo=");
        return B4.f.c(sb, str2, ")");
    }
}
