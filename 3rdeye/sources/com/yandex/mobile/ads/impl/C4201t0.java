package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.C4203t2;

/* renamed from: com.yandex.mobile.ads.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4201t0 implements InterfaceC4126i1, C4203t2.c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33344a;

    /* renamed from: b, reason: collision with root package name */
    private final RelativeLayout f33345b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4105f1 f33346c;

    /* renamed from: d, reason: collision with root package name */
    private final Window f33347d;

    /* renamed from: e, reason: collision with root package name */
    private final String f33348e;

    /* renamed from: f, reason: collision with root package name */
    private C4203t2 f33349f;

    /* renamed from: g, reason: collision with root package name */
    private final LinearLayout f33350g;

    /* renamed from: h, reason: collision with root package name */
    private final TextView f33351h;
    private final ProgressBar i;

    /* renamed from: j, reason: collision with root package name */
    private final l82 f33352j;

    public C4201t0(Context context, RelativeLayout rootLayout, C4188r1 adActivityListener, Window window, String browserUrl, C4203t2 adBrowserView, LinearLayout controlPanel, TextView browserTitle, ProgressBar browserProgressBar, l82 urlViewerLauncher) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(rootLayout, "rootLayout");
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        kotlin.jvm.internal.l.f(window, "window");
        kotlin.jvm.internal.l.f(browserUrl, "browserUrl");
        kotlin.jvm.internal.l.f(adBrowserView, "adBrowserView");
        kotlin.jvm.internal.l.f(controlPanel, "controlPanel");
        kotlin.jvm.internal.l.f(browserTitle, "browserTitle");
        kotlin.jvm.internal.l.f(browserProgressBar, "browserProgressBar");
        kotlin.jvm.internal.l.f(urlViewerLauncher, "urlViewerLauncher");
        this.f33344a = context;
        this.f33345b = rootLayout;
        this.f33346c = adActivityListener;
        this.f33347d = window;
        this.f33348e = browserUrl;
        this.f33349f = adBrowserView;
        this.f33350g = controlPanel;
        this.f33351h = browserTitle;
        this.i = browserProgressBar;
        this.f33352j = urlViewerLauncher;
    }

    private final void a(ImageView imageView, ImageView imageView2) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.L3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4201t0.a(this.f24181b, view);
            }
        });
        imageView2.setOnClickListener(new J3(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4201t0 this$0, View view) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.f33346c.a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final boolean e() {
        boolean z10;
        if (this.f33349f.canGoBack()) {
            C4203t2 c4203t2 = this.f33349f;
            if (c4203t2.canGoBack()) {
                c4203t2.goBack();
            }
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void g() {
        this.f33347d.requestFeature(1);
        if (ba.a(16)) {
            this.f33347d.getDecorView().setSystemUiVisibility(256);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void onAdClosed() {
        this.f33346c.a(8, null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void c() {
        this.f33345b.setBackgroundDrawable(s7.f32884a);
        LinearLayout linearLayout = this.f33350g;
        ImageView imageViewB = t7.b(this.f33344a);
        ImageView imageViewA = t7.a(this.f33344a);
        a(imageViewB, imageViewA);
        linearLayout.addView(this.f33351h, new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(imageViewB, new LinearLayout.LayoutParams(-2, -1));
        linearLayout.addView(imageViewA, new LinearLayout.LayoutParams(-2, -1));
        RelativeLayout relativeLayout = this.f33345b;
        LinearLayout linearLayout2 = this.f33350g;
        Context context = this.f33344a;
        kotlin.jvm.internal.l.f(context, "context");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, jh2.a(context, u7.f33961d.a(context)));
        layoutParams.addRule(10);
        relativeLayout.addView(linearLayout2, layoutParams);
        Context context2 = this.f33344a;
        LinearLayout anchorView = this.f33350g;
        kotlin.jvm.internal.l.f(context2, "context");
        kotlin.jvm.internal.l.f(anchorView, "anchorView");
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, jh2.a(context2, 2.0f));
        layoutParams2.addRule(3, anchorView.getId());
        this.f33345b.addView(this.i, layoutParams2);
        a(8);
        RelativeLayout relativeLayout2 = this.f33345b;
        C4203t2 c4203t2 = this.f33349f;
        LinearLayout anchorView2 = this.f33350g;
        kotlin.jvm.internal.l.f(anchorView2, "anchorView");
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(3, anchorView2.getId());
        relativeLayout2.addView(c4203t2, layoutParams3);
        this.f33349f.loadUrl(this.f33348e);
        this.f33346c.a(6, null);
        fp0.d(new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void d() {
        this.f33349f.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4201t0 this$0, View view) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        String url = this$0.f33349f.getUrl();
        if (url != null) {
            this$0.f33352j.a(this$0.f33344a, url);
        }
    }

    @Override // com.yandex.mobile.ads.impl.C4203t2.c
    public final void b(WebView view) {
        kotlin.jvm.internal.l.f(view, "view");
        a(8);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void b() {
        this.f33349f.e();
    }

    @Override // com.yandex.mobile.ads.impl.C4203t2.c
    public final void a(WebView view) {
        kotlin.jvm.internal.l.f(view, "view");
        a(0);
    }

    @Override // com.yandex.mobile.ads.impl.C4203t2.c
    public final void a(WebView view, int i) {
        kotlin.jvm.internal.l.f(view, "view");
        int i10 = i * 100;
        this.i.setProgress(i10);
        if (10000 > i10) {
            a(0);
        } else {
            this.f33351h.setText(view.getTitle());
            a(8);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void a() {
        this.f33349f.f();
    }

    private final void a(int i) {
        if (i == 0 && this.i.getVisibility() != 0) {
            this.i.bringToFront();
            this.f33345b.requestLayout();
            this.f33345b.invalidate();
        }
        this.i.setVisibility(i);
    }
}
