package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.RelativeLayout;

/* loaded from: classes3.dex */
public final class vc0 implements as {

    /* renamed from: a, reason: collision with root package name */
    private final lp f34444a;

    public vc0(lp closeButtonController) {
        kotlin.jvm.internal.l.f(closeButtonController, "closeButtonController");
        this.f34444a = closeButtonController;
    }

    @Override // com.yandex.mobile.ads.impl.as
    public final RelativeLayout a(jd0 contentView, a8 adResponse) {
        kotlin.jvm.internal.l.f(contentView, "contentView");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        Context context = contentView.getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        kotlin.jvm.internal.l.c(context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(0);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(contentView, new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.addView(this.f34444a.d(), y7.a(context, contentView));
        return relativeLayout;
    }

    @Override // com.yandex.mobile.ads.impl.as
    public final void b() {
        this.f34444a.b();
    }

    @Override // com.yandex.mobile.ads.impl.as
    public final void c() {
        this.f34444a.c();
    }

    @Override // com.yandex.mobile.ads.impl.as
    public final void d() {
        this.f34444a.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.as
    public final void a() {
        this.f34444a.a();
    }

    @Override // com.yandex.mobile.ads.impl.as
    public final void a(boolean z10) {
        this.f34444a.a(z10);
    }

    @Override // com.yandex.mobile.ads.impl.as
    public final void a(RelativeLayout rootLayout) {
        kotlin.jvm.internal.l.f(rootLayout, "rootLayout");
        rootLayout.setBackground(x7.f35212b);
    }
}
