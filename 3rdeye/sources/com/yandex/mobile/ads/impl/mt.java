package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class mt {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5480a<Bitmap> f30505a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30506b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30507c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30508d;

    public mt(InterfaceC5480a<Bitmap> getBitmap, String str, int i, int i10) {
        kotlin.jvm.internal.l.f(getBitmap, "getBitmap");
        this.f30505a = getBitmap;
        this.f30506b = str;
        this.f30507c = i;
        this.f30508d = i10;
    }

    public final Bitmap a() {
        return this.f30505a.invoke();
    }

    public final int b() {
        return this.f30508d;
    }

    public final String c() {
        return this.f30506b;
    }

    public final int d() {
        return this.f30507c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt)) {
            return false;
        }
        mt mtVar = (mt) obj;
        return kotlin.jvm.internal.l.b(this.f30505a, mtVar.f30505a) && kotlin.jvm.internal.l.b(this.f30506b, mtVar.f30506b) && this.f30507c == mtVar.f30507c && this.f30508d == mtVar.f30508d;
    }

    public final int hashCode() {
        int iHashCode = this.f30505a.hashCode() * 31;
        String str = this.f30506b;
        return this.f30508d + sx1.a(this.f30507c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "CoreNativeAdImage(getBitmap=" + this.f30505a + ", sizeType=" + this.f30506b + ", width=" + this.f30507c + ", height=" + this.f30508d + ")";
    }
}
