package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import c9.C2078B;
import c9.C2099t;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b71 implements sg {

    /* renamed from: a, reason: collision with root package name */
    private final CheckBox f25094a;

    /* renamed from: b, reason: collision with root package name */
    private final ProgressBar f25095b;

    /* renamed from: c, reason: collision with root package name */
    private final View f25096c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, View> f25097d;

    /* renamed from: e, reason: collision with root package name */
    private final v71 f25098e;

    /* renamed from: f, reason: collision with root package name */
    private List<gv> f25099f;

    /* renamed from: g, reason: collision with root package name */
    private final ImageView f25100g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final View f25101a;

        /* renamed from: b, reason: collision with root package name */
        private final v71 f25102b;

        /* renamed from: c, reason: collision with root package name */
        private CheckBox f25103c;

        /* renamed from: d, reason: collision with root package name */
        private ProgressBar f25104d;

        /* renamed from: e, reason: collision with root package name */
        private final Map<String, View> f25105e;

        /* renamed from: f, reason: collision with root package name */
        private ImageView f25106f;

        /* renamed from: g, reason: collision with root package name */
        private List<gv> f25107g;

        public a(View nativeAdView, v71 nativeBindType, Map<String, ? extends View> initialAssetViews) {
            kotlin.jvm.internal.l.f(nativeAdView, "nativeAdView");
            kotlin.jvm.internal.l.f(nativeBindType, "nativeBindType");
            kotlin.jvm.internal.l.f(initialAssetViews, "initialAssetViews");
            this.f25101a = nativeAdView;
            this.f25102b = nativeBindType;
            this.f25105e = C2078B.u(initialAssetViews);
            this.f25107g = C2099t.f18581b;
        }

        public final Map<String, View> a() {
            return this.f25105e;
        }

        public final List<gv> b() {
            return this.f25107g;
        }

        public final ImageView c() {
            return this.f25106f;
        }

        public final CheckBox d() {
            return this.f25103c;
        }

        public final View e() {
            return this.f25101a;
        }

        public final v71 f() {
            return this.f25102b;
        }

        public final ProgressBar g() {
            return this.f25104d;
        }

        public final a h(TextView textView) {
            this.f25105e.put(AppIntroBaseFragmentKt.ARG_TITLE, textView);
            return this;
        }

        public final a i(TextView textView) {
            this.f25105e.put("warning", textView);
            return this;
        }

        public final a a(TextView textView) {
            this.f25105e.put("age", textView);
            return this;
        }

        public final a b(TextView textView) {
            this.f25105e.put("body", textView);
            return this;
        }

        public final a c(TextView textView) {
            this.f25105e.put("call_to_action", textView);
            return this;
        }

        public final a d(TextView textView) {
            this.f25105e.put("domain", textView);
            return this;
        }

        public final a e(TextView textView) {
            this.f25105e.put("price", textView);
            return this;
        }

        public final a f(TextView textView) {
            this.f25105e.put("review_count", textView);
            return this;
        }

        public final a g(TextView textView) {
            this.f25105e.put("sponsored", textView);
            return this;
        }

        public final void a(View view, String assetName) {
            kotlin.jvm.internal.l.f(assetName, "assetName");
            this.f25105e.put(assetName, view);
        }

        public final a b(ImageView imageView) {
            this.f25105e.put("feedback", imageView);
            return this;
        }

        public final a c(ImageView imageView) {
            this.f25105e.put("icon", imageView);
            return this;
        }

        public final a d(ImageView imageView) {
            this.f25106f = imageView;
            return this;
        }

        public final a a(ImageView imageView) {
            this.f25105e.put("favicon", imageView);
            return this;
        }

        public final a a(CustomizableMediaView customizableMediaView) {
            this.f25105e.put("media", customizableMediaView);
            return this;
        }

        public final a a(CheckBox checkBox) {
            this.f25103c = checkBox;
            return this;
        }

        public final a a(View view) {
            this.f25105e.put("rating", view);
            return this;
        }

        public final a a(ProgressBar progressBar) {
            this.f25104d = progressBar;
            return this;
        }
    }

    public b71(a builder) {
        kotlin.jvm.internal.l.f(builder, "builder");
        this.f25094a = builder.d();
        this.f25095b = builder.g();
        this.f25096c = builder.e();
        this.f25097d = builder.a();
        this.f25098e = builder.f();
        this.f25099f = builder.b();
        this.f25100g = builder.c();
    }

    public final List<gv> a() {
        return this.f25099f;
    }

    public final ImageView b() {
        return this.f25100g;
    }

    public final CheckBox c() {
        return this.f25094a;
    }

    public final View d() {
        return this.f25096c;
    }

    public final v71 e() {
        return this.f25098e;
    }

    public final ProgressBar f() {
        return this.f25095b;
    }

    @Override // com.yandex.mobile.ads.impl.sg
    public final View getAssetView(String str) {
        return getAssetViews().get("close_button");
    }

    @Override // com.yandex.mobile.ads.impl.sg
    public final Map<String, View> getAssetViews() {
        return this.f25097d;
    }
}
