package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class nx1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f31050a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f31051b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31052c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f31053d;

    /* renamed from: e, reason: collision with root package name */
    private final uy1 f31054e;

    public nx1(String str, Long l5, boolean z10, boolean z11, uy1 uy1Var) {
        this.f31050a = str;
        this.f31051b = l5;
        this.f31052c = z10;
        this.f31053d = z11;
        this.f31054e = uy1Var;
    }

    public final uy1 a() {
        return this.f31054e;
    }

    public final Long b() {
        return this.f31051b;
    }

    public final boolean c() {
        return this.f31053d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx1)) {
            return false;
        }
        nx1 nx1Var = (nx1) obj;
        return kotlin.jvm.internal.l.b(this.f31050a, nx1Var.f31050a) && kotlin.jvm.internal.l.b(this.f31051b, nx1Var.f31051b) && this.f31052c == nx1Var.f31052c && this.f31053d == nx1Var.f31053d && kotlin.jvm.internal.l.b(this.f31054e, nx1Var.f31054e);
    }

    public final int hashCode() {
        String str = this.f31050a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l5 = this.f31051b;
        int iA = m6.a(this.f31053d, m6.a(this.f31052c, (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31, 31), 31);
        uy1 uy1Var = this.f31054e;
        return iA + (uy1Var != null ? uy1Var.hashCode() : 0);
    }

    public final String toString() {
        return "Settings(templateType=" + this.f31050a + ", multiBannerAutoScrollInterval=" + this.f31051b + ", isHighlightingEnabled=" + this.f31052c + ", isLoopingVideo=" + this.f31053d + ", mediaAssetImageFallbackSize=" + this.f31054e + ")";
    }
}
