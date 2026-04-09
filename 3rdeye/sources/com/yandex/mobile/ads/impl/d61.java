package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import c9.C2092m;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class d61 {

    /* renamed from: a, reason: collision with root package name */
    private final w31 f25985a;

    /* renamed from: b, reason: collision with root package name */
    private final ej0 f25986b;

    /* renamed from: c, reason: collision with root package name */
    private final tb1 f25987c;

    /* renamed from: d, reason: collision with root package name */
    private final wi0 f25988d;

    /* renamed from: e, reason: collision with root package name */
    private final qj0 f25989e;

    /* renamed from: f, reason: collision with root package name */
    private final d41 f25990f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<nt> f25991g;

    public static final class a implements sj0 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.sj0
        public final void a(String url, Bitmap bitmap) {
            kotlin.jvm.internal.l.f(url, "url");
            kotlin.jvm.internal.l.f(bitmap, "bitmap");
        }

        @Override // com.yandex.mobile.ads.impl.sj0
        public final void a(Map<String, Bitmap> images) {
            kotlin.jvm.internal.l.f(images, "images");
            d61.this.f25986b.a(images);
            d61.this.f25987c.a();
            Iterator it = d61.this.f25991g.iterator();
            while (it.hasNext()) {
                ((nt) it.next()).onFinishLoadingImages();
            }
        }
    }

    public /* synthetic */ d61(Context context, w31 w31Var, ej0 ej0Var, tb1 tb1Var) {
        this(context, w31Var, ej0Var, tb1Var, new wi0(context), new qj0(), new d41(ej0Var), new CopyOnWriteArraySet());
    }

    public final void d() {
        List<w31> listG = E.u.G(this.f25985a);
        qj0 qj0Var = this.f25989e;
        qj0Var.getClass();
        ArrayList arrayList = new ArrayList(C2092m.T(listG, 10));
        for (w31 w31Var : listG) {
            arrayList.add(qj0Var.a(w31Var.b(), w31Var.e()));
        }
        this.f25988d.a(C2097r.L0(C2092m.U(arrayList)), new a());
    }

    public final void a(nt listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f25991g.add(listener);
    }

    public final ar1 b() {
        return this.f25985a.g();
    }

    public final String c() {
        return this.f25985a.d();
    }

    public final void b(nt listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f25991g.remove(listener);
    }

    public final kt a() {
        return this.f25990f.a(this.f25985a);
    }

    public d61(Context context, w31 nativeAd, ej0 imageProvider, tb1 nativeAdViewRenderer, wi0 imageLoadManager, qj0 imageValuesProvider, d41 nativeAdAssetsCreator, Set<nt> imageLoadingListeners) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(nativeAdViewRenderer, "nativeAdViewRenderer");
        kotlin.jvm.internal.l.f(imageLoadManager, "imageLoadManager");
        kotlin.jvm.internal.l.f(imageValuesProvider, "imageValuesProvider");
        kotlin.jvm.internal.l.f(nativeAdAssetsCreator, "nativeAdAssetsCreator");
        kotlin.jvm.internal.l.f(imageLoadingListeners, "imageLoadingListeners");
        this.f25985a = nativeAd;
        this.f25986b = imageProvider;
        this.f25987c = nativeAdViewRenderer;
        this.f25988d = imageLoadManager;
        this.f25989e = imageValuesProvider;
        this.f25990f = nativeAdAssetsCreator;
        this.f25991g = imageLoadingListeners;
    }
}
