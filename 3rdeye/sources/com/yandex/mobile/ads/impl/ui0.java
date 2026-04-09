package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class ui0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f34068a;

    /* renamed from: b, reason: collision with root package name */
    private final Bitmap f34069b;

    public ui0(String url, Bitmap bitmap) {
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(bitmap, "bitmap");
        this.f34068a = url;
        this.f34069b = bitmap;
    }

    public final Bitmap a() {
        return this.f34069b;
    }

    public final String b() {
        return this.f34068a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui0)) {
            return false;
        }
        ui0 ui0Var = (ui0) obj;
        return kotlin.jvm.internal.l.b(this.f34068a, ui0Var.f34068a) && kotlin.jvm.internal.l.b(this.f34069b, ui0Var.f34069b);
    }

    public final int hashCode() {
        return this.f34069b.hashCode() + (this.f34068a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageData(url=" + this.f34068a + ", bitmap=" + this.f34069b + ")";
    }
}
