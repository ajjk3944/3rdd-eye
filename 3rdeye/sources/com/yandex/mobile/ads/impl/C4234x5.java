package com.yandex.mobile.ads.impl;

import android.net.Uri;

/* renamed from: com.yandex.mobile.ads.impl.x5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4234x5 implements g20 {

    /* renamed from: a, reason: collision with root package name */
    private final zy1 f35184a;

    public C4234x5(zy1 skipAdController) {
        kotlin.jvm.internal.l.f(skipAdController, "skipAdController");
        this.f35184a = skipAdController;
    }

    @Override // com.yandex.mobile.ads.impl.g20
    public final boolean a(Uri uri) {
        kotlin.jvm.internal.l.f(uri, "uri");
        if (!kotlin.jvm.internal.l.b(uri.getHost(), "showNextAd")) {
            return false;
        }
        this.f35184a.a();
        return true;
    }
}
