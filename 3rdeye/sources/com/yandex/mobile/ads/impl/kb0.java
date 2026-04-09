package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.RelativeLayout;

/* loaded from: classes3.dex */
public final class kb0 implements as {

    /* renamed from: a, reason: collision with root package name */
    private final lp f29583a;

    public kb0(lp closeButtonController) {
        kotlin.jvm.internal.l.f(closeButtonController, "closeButtonController");
        this.f29583a = closeButtonController;
    }

    @Override // com.yandex.mobile.ads.impl.as
    public final RelativeLayout a(jd0 contentView, a8 adResponse) {
        kotlin.jvm.internal.l.f(contentView, "contentView");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        Context context = contentView.getContext();
        kotlin.jvm.internal.l.c(context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParamsA = y7.a(context, (a8<?>) adResponse);
        int iA = jh2.a(context, 64.0f);
        layoutParamsA.width = Math.min(layoutParamsA.width + iA, context.getResources().getDisplayMetrics().widthPixels);
        layoutParamsA.height = Math.min(layoutParamsA.height + iA, jh2.c(context));
        relativeLayout.setLayoutParams(layoutParamsA);
        relativeLayout.addView(contentView, y7.a(context, (a8<?>) adResponse));
        relativeLayout.addView(this.f29583a.d(), y7.a(context, contentView));
        return relativeLayout;
    }

    @Override // com.yandex.mobile.ads.impl.as
    public final void b() {
        this.f29583a.b();
    }

    @Override // com.yandex.mobile.ads.impl.as
    public final void c() {
        this.f29583a.c();
    }

    @Override // com.yandex.mobile.ads.impl.as
    public final void d() {
        this.f29583a.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.as
    public final void a() {
        this.f29583a.a();
    }

    @Override // com.yandex.mobile.ads.impl.as
    public final void a(boolean z10) {
        this.f29583a.a(z10);
    }

    @Override // com.yandex.mobile.ads.impl.as
    public final void a(RelativeLayout rootLayout) {
        kotlin.jvm.internal.l.f(rootLayout, "rootLayout");
        rootLayout.setBackground(x7.f35211a);
    }
}
