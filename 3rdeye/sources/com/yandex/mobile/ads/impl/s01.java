package com.yandex.mobile.ads.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class s01 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32830a;

    public s01(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f32830a = applicationContext;
    }

    public final r01 a(SSLSocketFactory sSLSocketFactory) {
        return new r01(this.f32830a, sSLSocketFactory, new nn1(), new oc1(), new nh0(), new vh0());
    }
}
