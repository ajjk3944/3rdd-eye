package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class wu1 {

    /* renamed from: a, reason: collision with root package name */
    private final ys1 f35066a;

    public wu1(ys1 sslSocketFactoryCreator) {
        kotlin.jvm.internal.l.f(sslSocketFactoryCreator, "sslSocketFactoryCreator");
        this.f35066a = sslSocketFactoryCreator;
    }

    public final xu1 a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        String strA = sc.a().a();
        SSLSocketFactory sSLSocketFactoryA = this.f35066a.a(context);
        du1 du1VarA = ew1.a.a().a(context);
        return new xu1(strA, sSLSocketFactoryA, du1VarA != null && du1VarA.E0());
    }
}
