package com.yandex.mobile.ads.impl;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class s20 {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f32842a;

    public s20(Uri url) {
        kotlin.jvm.internal.l.f(url, "url");
        this.f32842a = url;
    }

    public final Uri a() {
        return this.f32842a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s20) && kotlin.jvm.internal.l.b(this.f32842a, ((s20) obj).f32842a);
    }

    public final int hashCode() {
        return this.f32842a.hashCode();
    }

    public final String toString() {
        return "DivKitClickExtensionData(url=" + this.f32842a + ")";
    }
}
