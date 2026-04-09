package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.C4236y0;

/* loaded from: classes3.dex */
public final class av1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f24927a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<String> f24928b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24929c;

    /* renamed from: d, reason: collision with root package name */
    private final f8 f24930d;

    /* renamed from: e, reason: collision with root package name */
    private final bd0 f24931e;

    /* renamed from: f, reason: collision with root package name */
    private final fd0 f24932f;

    /* renamed from: g, reason: collision with root package name */
    private final rc0 f24933g;

    /* renamed from: h, reason: collision with root package name */
    private final kg0 f24934h;
    private final md0 i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f24935j;

    /* renamed from: k, reason: collision with root package name */
    private final jd0 f24936k;

    /* renamed from: l, reason: collision with root package name */
    private final ad0 f24937l;

    /* renamed from: m, reason: collision with root package name */
    private final as f24938m;

    /* renamed from: n, reason: collision with root package name */
    private final uc0 f24939n;

    /* renamed from: o, reason: collision with root package name */
    private final View f24940o;

    /* renamed from: p, reason: collision with root package name */
    private final zv f24941p;

    public av1(Context context, vu1 sdkEnvironmentModule, C4072a3 adConfiguration, a8<String> adResponse, String htmlResponse, f8 adResultReceiver, bd0 fullScreenHtmlWebViewListener, fd0 fullScreenMobileAdsSchemeListener, rc0 fullScreenCloseButtonListener, kg0 htmlWebViewAdapterFactoryProvider, md0 fullscreenAdActivityLauncher) throws gj2 {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(htmlResponse, "htmlResponse");
        kotlin.jvm.internal.l.f(adResultReceiver, "adResultReceiver");
        kotlin.jvm.internal.l.f(fullScreenHtmlWebViewListener, "fullScreenHtmlWebViewListener");
        kotlin.jvm.internal.l.f(fullScreenMobileAdsSchemeListener, "fullScreenMobileAdsSchemeListener");
        kotlin.jvm.internal.l.f(fullScreenCloseButtonListener, "fullScreenCloseButtonListener");
        kotlin.jvm.internal.l.f(htmlWebViewAdapterFactoryProvider, "htmlWebViewAdapterFactoryProvider");
        kotlin.jvm.internal.l.f(fullscreenAdActivityLauncher, "fullscreenAdActivityLauncher");
        this.f24927a = adConfiguration;
        this.f24928b = adResponse;
        this.f24929c = htmlResponse;
        this.f24930d = adResultReceiver;
        this.f24931e = fullScreenHtmlWebViewListener;
        this.f24932f = fullScreenMobileAdsSchemeListener;
        this.f24933g = fullScreenCloseButtonListener;
        this.f24934h = htmlWebViewAdapterFactoryProvider;
        this.i = fullscreenAdActivityLauncher;
        this.f24935j = context.getApplicationContext();
        jd0 jd0VarB = b();
        this.f24936k = jd0VarB;
        this.f24941p = new aw(context, adConfiguration, new yq1().b(adResponse, adConfiguration)).a();
        this.f24937l = c();
        as asVarA = a();
        this.f24938m = asVarA;
        uc0 uc0Var = new uc0(asVarA);
        this.f24939n = uc0Var;
        fullScreenCloseButtonListener.a(uc0Var);
        fullScreenHtmlWebViewListener.a(uc0Var);
        this.f24940o = asVarA.a(jd0VarB, adResponse);
    }

    private final as a() {
        boolean zA = b21.a(this.f24929c);
        Context context = this.f24935j;
        kotlin.jvm.internal.l.e(context, "context");
        z7 z7Var = new z7(context, null, 6, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        int iA = jh2.a(context, 25.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        layoutParams.gravity = 17;
        int iA2 = jh2.a(context, 19.5f);
        layoutParams.setMargins(iA2, iA2, iA2, iA2);
        frameLayout.addView(z7Var, layoutParams);
        z7Var.setTag(hh2.a("close_button"));
        z7Var.setBorderWidth(1.0f);
        frameLayout.setOnClickListener(new kp(this.f24933g, this.f24937l, this.f24941p));
        return new bs(new mp()).a(frameLayout, this.f24928b, this.f24941p, zA, this.f24928b.S());
    }

    private final jd0 b() throws gj2 {
        kd0 kd0Var = new kd0();
        Context context = this.f24935j;
        kotlin.jvm.internal.l.e(context, "context");
        return kd0Var.a(context, this.f24928b, this.f24927a);
    }

    private final ad0 c() {
        boolean zA = b21.a(this.f24929c);
        this.f24934h.getClass();
        jg0 g21Var = zA ? new g21() : new gk();
        jd0 jd0Var = this.f24936k;
        bd0 bd0Var = this.f24931e;
        fd0 fd0Var = this.f24932f;
        return g21Var.a(jd0Var, bd0Var, fd0Var, this.f24933g, fd0Var);
    }

    public final void d() {
        this.f24933g.a((tr) null);
        this.f24931e.a((zr) null);
        this.f24937l.invalidate();
        this.f24938m.d();
    }

    public final String e() {
        return this.f24928b.e();
    }

    public final tc0 f() {
        return this.f24939n.a();
    }

    public final void g() {
        this.f24938m.b();
        this.f24936k.e();
    }

    public final void h() {
        this.f24937l.a(this.f24929c);
    }

    public final void i() {
        this.f24936k.f();
        this.f24938m.a();
    }

    public final void a(tr trVar) {
        this.f24933g.a(trVar);
    }

    public final void a(zr zrVar) {
        this.f24931e.a(zrVar);
    }

    public final void a(RelativeLayout rootLayout) {
        kotlin.jvm.internal.l.f(rootLayout, "rootLayout");
        this.f24938m.a(rootLayout);
        rootLayout.addView(this.f24940o);
        this.f24938m.c();
    }

    public final Object a(Context context, f8 f8Var) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f24930d.a(f8Var);
        return this.i.a(context, new C4236y0(new C4236y0.a(this.f24928b, this.f24927a, this.f24930d).a(this)));
    }
}
