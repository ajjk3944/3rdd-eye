package com.yandex.mobile.ads.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/* loaded from: classes3.dex */
public final class pb implements ng0 {

    /* renamed from: a, reason: collision with root package name */
    private final af1 f31696a;

    /* renamed from: b, reason: collision with root package name */
    private final List<sb> f31697b;

    /* renamed from: c, reason: collision with root package name */
    private qb f31698c;

    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            pb.this.f31696a.b();
        }
    }

    public pb(af1 optOutRepository) {
        kotlin.jvm.internal.l.f(optOutRepository, "optOutRepository");
        this.f31696a = optOutRepository;
        this.f31697b = a();
    }

    public final void a(String url) {
        kotlin.jvm.internal.l.f(url, "url");
        try {
            URI uri = new URI(url);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (sb sbVar : this.f31697b) {
                if (sbVar.a(scheme, host)) {
                    sbVar.a();
                    return;
                }
            }
        } catch (URISyntaxException unused) {
            fp0.f(new Object[0]);
        }
    }

    public final void a(qb adtuneOptOutWebViewListener) {
        kotlin.jvm.internal.l.f(adtuneOptOutWebViewListener, "adtuneOptOutWebViewListener");
        this.f31698c = adtuneOptOutWebViewListener;
    }

    private final List<sb> a() {
        return E.u.G(new yb("noInterestAd", new a()));
    }

    @Override // com.yandex.mobile.ads.impl.ng0
    public final void a(int i) {
        qb qbVar;
        if (!new wb().a(i) || (qbVar = this.f31698c) == null) {
            return;
        }
        qbVar.a();
    }
}
