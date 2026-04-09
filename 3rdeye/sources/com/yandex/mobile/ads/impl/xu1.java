package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ov;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class xu1 implements ov.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f35428a;

    /* renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f35429b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35430c;

    public xu1(String userAgent, SSLSocketFactory sSLSocketFactory, boolean z10) {
        kotlin.jvm.internal.l.f(userAgent, "userAgent");
        this.f35428a = userAgent;
        this.f35429b = sSLSocketFactory;
        this.f35430c = z10;
    }

    @Override // com.yandex.mobile.ads.impl.ov.a
    public final ov a() {
        if (!this.f35430c) {
            return new uu1(this.f35428a, new fh0(), this.f35429b);
        }
        int i = wd1.f34912c;
        return new zd1(wd1.a(8000, 8000, this.f35429b), this.f35428a, new fh0());
    }
}
