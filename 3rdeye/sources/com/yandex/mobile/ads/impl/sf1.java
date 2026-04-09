package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.yandex.mobile.ads.impl.ah1;
import com.yandex.mobile.ads.impl.lh2;

/* loaded from: classes3.dex */
public abstract class sf1 extends pk implements mg0, ah1.b, lh2.a {

    /* renamed from: j, reason: collision with root package name */
    private static boolean f32960j;

    /* renamed from: b, reason: collision with root package name */
    private final Context f32961b;

    /* renamed from: c, reason: collision with root package name */
    private final lh2 f32962c;

    /* renamed from: d, reason: collision with root package name */
    private final ah1 f32963d;

    /* renamed from: e, reason: collision with root package name */
    private final sy1 f32964e;

    /* renamed from: f, reason: collision with root package name */
    private og0 f32965f;

    /* renamed from: g, reason: collision with root package name */
    private ng0 f32966g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f32967h;
    private boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ sf1(Context context) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, applicationContext, new lh2(), ah1.f24667h.a(applicationContext));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        setBackgroundColor(0);
        setVisibility(4);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setScrollBarStyle(0);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(false);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setTextZoom(100);
        getSettings().setMinimumFontSize(1);
        getSettings().setMinimumLogicalFontSize(1);
        WebSettings settings = getSettings();
        kotlin.jvm.internal.l.e(settings, "getSettings(...)");
        if (ba.a(21)) {
            settings.setMixedContentMode(2);
        }
        WebSettings settings2 = getSettings();
        kotlin.jvm.internal.l.e(settings2, "getSettings(...)");
        settings2.setMediaPlaybackRequiresUserGesture(false);
        setWebViewClient(new lg0(this, xs1.b()));
        setWebChromeClient(new gg0());
    }

    @Override // com.yandex.mobile.ads.impl.lh2.a
    public final boolean b() {
        return this.i;
    }

    @Override // com.yandex.mobile.ads.impl.pk
    public String c() {
        return androidx.work.s.d("<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n", ej2.a());
    }

    @Override // com.yandex.mobile.ads.impl.pk
    public void d() {
        setHtmlWebViewListener(null);
        super.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        og0 og0VarJ;
        if (motionEvent != null && motionEvent.getAction() == 0 && (og0VarJ = j()) != null) {
            og0VarJ.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract void h();

    public final Context i() {
        return this.f32961b;
    }

    public og0 j() {
        return this.f32965f;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = true;
        this.f32963d.a(this);
        this.f32962c.getClass();
        a(lh2.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.i = false;
        this.f32962c.getClass();
        a(lh2.a(this));
        this.f32963d.b(this);
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        kotlin.jvm.internal.l.f(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        this.f32962c.getClass();
        a(lh2.a(this));
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.f32962c.getClass();
        a(lh2.a(this));
    }

    public final void setHtmlWebViewErrorListener(ng0 ng0Var) {
        this.f32966g = ng0Var;
    }

    public void setHtmlWebViewListener(og0 og0Var) {
        this.f32965f = og0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf1(Context context, Context appContext, lh2 viewableChecker, ah1 phoneStateTracker) {
        super(appContext);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(appContext, "appContext");
        kotlin.jvm.internal.l.f(viewableChecker, "viewableChecker");
        kotlin.jvm.internal.l.f(phoneStateTracker, "phoneStateTracker");
        this.f32961b = appContext;
        this.f32962c = viewableChecker;
        this.f32963d = phoneStateTracker;
        this.f32964e = new sy1();
        a(context);
        if (f32960j) {
            return;
        }
        f32960j = true;
    }

    private final void a(boolean z10) {
        if (this.f32967h != z10) {
            this.f32967h = z10;
            og0 og0VarJ = j();
            if (og0VarJ != null) {
                og0VarJ.a(this.f32967h);
            }
        }
    }

    public void a(Context context, String url) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(url, "url");
        og0 og0VarJ = j();
        if (og0VarJ != null) {
            og0VarJ.a(url);
        }
    }

    public void a() {
        this.f32964e.a(new P0(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(sf1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // com.yandex.mobile.ads.impl.ah1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.yandex.mobile.ads.impl.xg1 r2) {
        /*
            r1 = this;
            java.lang.String r0 = "phoneState"
            kotlin.jvm.internal.l.f(r2, r0)
            com.yandex.mobile.ads.impl.xg1 r0 = com.yandex.mobile.ads.impl.xg1.f35302c
            if (r2 != r0) goto La
            goto L1f
        La:
            com.yandex.mobile.ads.impl.lh2 r2 = r1.f32962c
            r2.getClass()
            boolean r2 = com.yandex.mobile.ads.impl.lh2.a(r1)
            if (r2 == 0) goto L1f
            com.yandex.mobile.ads.impl.ah1 r2 = r1.f32963d
            boolean r2 = r2.b()
            if (r2 == 0) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            r1.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.sf1.a(com.yandex.mobile.ads.impl.xg1):void");
    }

    public void a(int i) {
        ng0 ng0Var = this.f32966g;
        if (ng0Var != null) {
            ng0Var.a(i);
        }
    }
}
