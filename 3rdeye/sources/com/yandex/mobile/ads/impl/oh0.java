package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class oh0 {

    /* renamed from: a, reason: collision with root package name */
    private final ys1 f31367a;

    /* renamed from: b, reason: collision with root package name */
    private final s01 f31368b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f31369c;

    public oh0(Context context, zs1 sslSocketFactoryCreator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sslSocketFactoryCreator, "sslSocketFactoryCreator");
        this.f31367a = sslSocketFactoryCreator;
        this.f31368b = ph0.a(context);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f31369c = applicationContext;
    }

    public final qh0 a() {
        SSLSocketFactory sSLSocketFactoryA = this.f31367a.a(this.f31369c);
        Context context = this.f31369c;
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = ew1.a.a().a(context);
        if (du1VarA != null) {
            du1VarA.H();
        }
        return new qh0(this.f31368b.a(sSLSocketFactoryA), sc.a());
    }
}
