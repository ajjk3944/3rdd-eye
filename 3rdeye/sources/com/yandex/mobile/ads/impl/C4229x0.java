package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.res.Configuration;
import android.widget.RelativeLayout;

/* renamed from: com.yandex.mobile.ads.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4229x0 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f35137a;

    /* renamed from: b, reason: collision with root package name */
    private final RelativeLayout f35138b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4126i1 f35139c;

    /* renamed from: d, reason: collision with root package name */
    private final C4070a1 f35140d;

    /* renamed from: e, reason: collision with root package name */
    private final hh2 f35141e;

    public C4229x0(Activity activity, RelativeLayout rootLayout, InterfaceC4126i1 adActivityPresentController, C4070a1 adActivityEventController, hh2 tagCreator) {
        kotlin.jvm.internal.l.f(activity, "activity");
        kotlin.jvm.internal.l.f(rootLayout, "rootLayout");
        kotlin.jvm.internal.l.f(adActivityPresentController, "adActivityPresentController");
        kotlin.jvm.internal.l.f(adActivityEventController, "adActivityEventController");
        kotlin.jvm.internal.l.f(tagCreator, "tagCreator");
        this.f35137a = activity;
        this.f35138b = rootLayout;
        this.f35139c = adActivityPresentController;
        this.f35140d = adActivityEventController;
        this.f35141e = tagCreator;
    }

    public final void a(Configuration config) {
        kotlin.jvm.internal.l.f(config, "config");
        this.f35140d.a(config);
    }

    public final void b() {
        this.f35139c.g();
        this.f35139c.c();
        RelativeLayout relativeLayout = this.f35138b;
        this.f35141e.getClass();
        relativeLayout.setTag(hh2.a("root_layout"));
        this.f35137a.setContentView(this.f35138b);
    }

    public final boolean c() {
        return this.f35139c.e();
    }

    public final void d() {
        this.f35139c.b();
        this.f35140d.a();
    }

    public final void e() {
        this.f35139c.a();
        this.f35140d.b();
    }

    public final void a() {
        this.f35139c.onAdClosed();
        this.f35139c.d();
        this.f35138b.removeAllViews();
    }
}
