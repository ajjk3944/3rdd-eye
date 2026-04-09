package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import c9.C2078B;
import c9.C2092m;
import c9.C2099t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h71 {

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f28125g = {fa.a(h71.class, "nativeAdView", "getNativeAdView()Landroid/view/View;", 0), fa.a(h71.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0), fa.a(h71.class, "muteButtonView", "getMuteButtonView()Landroid/widget/CheckBox;", 0), fa.a(h71.class, "videoProgressView", "getVideoProgressView()Landroid/widget/ProgressBar;", 0), fa.a(h71.class, "customAssetWithKey", "getCustomAssetWithKey()Ljava/util/List;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final ao1 f28126a;

    /* renamed from: b, reason: collision with root package name */
    private final ao1 f28127b;

    /* renamed from: c, reason: collision with root package name */
    private final ao1 f28128c;

    /* renamed from: d, reason: collision with root package name */
    private final ao1 f28129d;

    /* renamed from: e, reason: collision with root package name */
    private final ao1 f28130e;

    /* renamed from: f, reason: collision with root package name */
    private final LinkedHashMap f28131f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final View f28132a;

        /* renamed from: b, reason: collision with root package name */
        private CheckBox f28133b;

        /* renamed from: c, reason: collision with root package name */
        private ProgressBar f28134c;

        /* renamed from: d, reason: collision with root package name */
        private List<gv> f28135d;

        /* renamed from: e, reason: collision with root package name */
        private final Map<String, View> f28136e;

        /* renamed from: f, reason: collision with root package name */
        private ImageView f28137f;

        public a(View nativeAdView, Map<String, ? extends View> initialAssetViews) {
            kotlin.jvm.internal.l.f(nativeAdView, "nativeAdView");
            kotlin.jvm.internal.l.f(initialAssetViews, "initialAssetViews");
            this.f28132a = nativeAdView;
            this.f28135d = C2099t.f18581b;
            this.f28136e = C2078B.u(initialAssetViews);
        }

        public final Map<String, View> a() {
            return this.f28136e;
        }

        public final List<gv> b() {
            return this.f28135d;
        }

        public final ImageView c() {
            return this.f28137f;
        }

        public final CheckBox d() {
            return this.f28133b;
        }

        public final View e() {
            return this.f28132a;
        }

        public final ProgressBar f() {
            return this.f28134c;
        }

        public final a a(List<gv> customAssets) {
            kotlin.jvm.internal.l.f(customAssets, "customAssets");
            this.f28135d = customAssets;
            return this;
        }

        public final a a(ImageView imageView) {
            this.f28137f = imageView;
            return this;
        }

        public final a a(CheckBox checkBox) {
            this.f28133b = checkBox;
            return this;
        }

        public final a a(ProgressBar progressBar) {
            this.f28134c = progressBar;
            return this;
        }
    }

    private h71(a aVar) {
        this.f28126a = bo1.a(aVar.e());
        this.f28127b = bo1.a(aVar.c());
        this.f28128c = bo1.a(aVar.d());
        this.f28129d = bo1.a(aVar.f());
        List<gv> listB = aVar.b();
        ArrayList arrayList = new ArrayList(C2092m.T(listB, 10));
        int i = 0;
        for (Object obj : listB) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            gv gvVar = (gv) obj;
            gvVar.getClass();
            arrayList.add(new b9.l("custom_asset_" + i + "_null", gvVar));
            i = i10;
        }
        this.f28130e = bo1.a(arrayList);
        this.f28131f = pt0.a(aVar.a());
    }

    public final View a(String assetName) {
        kotlin.jvm.internal.l.f(assetName, "assetName");
        WeakReference weakReference = (WeakReference) this.f28131f.get(assetName);
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final List<b9.l<String, gv>> b() {
        return (List) this.f28130e.getValue(this, f28125g[4]);
    }

    public final ImageView c() {
        return (ImageView) this.f28127b.getValue(this, f28125g[1]);
    }

    public final CheckBox d() {
        return (CheckBox) this.f28128c.getValue(this, f28125g[2]);
    }

    public final View e() {
        return (View) this.f28126a.getValue(this, f28125g[0]);
    }

    public final ProgressBar f() {
        return (ProgressBar) this.f28129d.getValue(this, f28125g[3]);
    }

    public final LinkedHashMap a() {
        return this.f28131f;
    }

    public /* synthetic */ h71(a aVar, int i) {
        this(aVar);
    }
}
