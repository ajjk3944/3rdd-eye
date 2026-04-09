package com.yandex.mobile.ads.impl;

import android.graphics.Typeface;

/* loaded from: classes3.dex */
public final class yb0 {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f35692a;

    /* renamed from: b, reason: collision with root package name */
    private final Typeface f35693b;

    /* renamed from: c, reason: collision with root package name */
    private final Typeface f35694c;

    /* renamed from: d, reason: collision with root package name */
    private final Typeface f35695d;

    public yb0(Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        this.f35692a = typeface;
        this.f35693b = typeface2;
        this.f35694c = typeface3;
        this.f35695d = typeface4;
    }

    public final Typeface a() {
        return this.f35695d;
    }

    public final Typeface b() {
        return this.f35692a;
    }

    public final Typeface c() {
        return this.f35694c;
    }

    public final Typeface d() {
        return this.f35693b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb0)) {
            return false;
        }
        yb0 yb0Var = (yb0) obj;
        return kotlin.jvm.internal.l.b(this.f35692a, yb0Var.f35692a) && kotlin.jvm.internal.l.b(this.f35693b, yb0Var.f35693b) && kotlin.jvm.internal.l.b(this.f35694c, yb0Var.f35694c) && kotlin.jvm.internal.l.b(this.f35695d, yb0Var.f35695d);
    }

    public final int hashCode() {
        Typeface typeface = this.f35692a;
        int iHashCode = (typeface == null ? 0 : typeface.hashCode()) * 31;
        Typeface typeface2 = this.f35693b;
        int iHashCode2 = (iHashCode + (typeface2 == null ? 0 : typeface2.hashCode())) * 31;
        Typeface typeface3 = this.f35694c;
        int iHashCode3 = (iHashCode2 + (typeface3 == null ? 0 : typeface3.hashCode())) * 31;
        Typeface typeface4 = this.f35695d;
        return iHashCode3 + (typeface4 != null ? typeface4.hashCode() : 0);
    }

    public final String toString() {
        return "FontTypefaceData(light=" + this.f35692a + ", regular=" + this.f35693b + ", medium=" + this.f35694c + ", bold=" + this.f35695d + ")";
    }
}
