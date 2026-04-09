package com.yandex.mobile.ads.impl;

import c9.C2092m;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/* loaded from: classes3.dex */
public final class vb implements ng0 {

    /* renamed from: a, reason: collision with root package name */
    private final nb f34429a;

    /* renamed from: b, reason: collision with root package name */
    private final List<sb> f34430b;

    /* renamed from: c, reason: collision with root package name */
    private xb f34431c;

    /* renamed from: d, reason: collision with root package name */
    private String f34432d;

    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            vb.a(vb.this);
        }
    }

    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            vb.this.f34429a.a(vb.this.f34432d);
        }
    }

    public final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            xb xbVar = vb.this.f34431c;
            if (xbVar != null) {
                xbVar.a();
            }
        }
    }

    public vb(nb optOutRenderer) {
        kotlin.jvm.internal.l.f(optOutRenderer, "optOutRenderer");
        this.f34429a = optOutRenderer;
        this.f34430b = a();
    }

    public static final void a(vb vbVar) {
        xb xbVar = vbVar.f34431c;
        if (xbVar != null) {
            xbVar.b();
        }
    }

    public final void b(String str) {
        this.f34432d = str;
    }

    public final void a(String url) {
        kotlin.jvm.internal.l.f(url, "url");
        try {
            URI uri = new URI(url);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (sb sbVar : this.f34430b) {
                if (sbVar.a(scheme, host)) {
                    sbVar.a();
                    return;
                }
            }
            xb xbVar = this.f34431c;
            if (xbVar != null) {
                xbVar.a(url);
            }
        } catch (URISyntaxException unused) {
            fp0.f(new Object[0]);
            xb xbVar2 = this.f34431c;
            if (xbVar2 != null) {
                xbVar2.b();
            }
        }
    }

    public final void a(xb adtuneWebViewListener) {
        kotlin.jvm.internal.l.f(adtuneWebViewListener, "adtuneWebViewListener");
        this.f34431c = adtuneWebViewListener;
    }

    @Override // com.yandex.mobile.ads.impl.ng0
    public final void a(int i) {
        xb xbVar;
        if (!new wb().a(i) || (xbVar = this.f34431c) == null) {
            return;
        }
        xbVar.b();
    }

    private final List<sb> a() {
        return C2092m.W(new yb("adtuneRendered", new c()), new yb("adtuneClosed", new a()), new yb("openOptOut", new b()));
    }
}
