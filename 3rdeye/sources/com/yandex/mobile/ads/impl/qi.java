package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class qi extends u52 {

    /* renamed from: k, reason: collision with root package name */
    private final ap0 f32223k;

    /* renamed from: l, reason: collision with root package name */
    private final hj f32224l;

    /* renamed from: m, reason: collision with root package name */
    private final ws0 f32225m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f32226n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(Context context, a8<String> adResponse, C4072a3 adConfiguration, ap0 adView, hj bannerShowEventListener, ws0 mainThreadHandler) {
        super(context, new ga(adView), adResponse, adConfiguration);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adView, "adView");
        kotlin.jvm.internal.l.f(bannerShowEventListener, "bannerShowEventListener");
        kotlin.jvm.internal.l.f(mainThreadHandler, "mainThreadHandler");
        this.f32223k = adView;
        this.f32224l = bannerShowEventListener;
        this.f32225m = mainThreadHandler;
    }

    @Override // com.yandex.mobile.ads.impl.u52
    public final boolean a(int i) {
        return jh2.a(this.f32223k.findViewById(2), i);
    }

    @Override // com.yandex.mobile.ads.impl.sj
    public final void c() {
        this.f32225m.a();
        super.c();
    }

    @Override // com.yandex.mobile.ads.impl.u52
    public final boolean k() {
        return jh2.c(this.f32223k.findViewById(2));
    }

    @Override // com.yandex.mobile.ads.impl.u52
    public final boolean l() {
        View viewFindViewById = this.f32223k.findViewById(2);
        return viewFindViewById != null && jh2.b(viewFindViewById) >= 1;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4132j0
    public final void onLeftApplication() {
        this.f32224l.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4132j0
    public final void onReturnedToApplication() {
        this.f32224l.onReturnedToApplication();
    }

    @Override // com.yandex.mobile.ads.impl.dk0.a
    public final void a(C4108f4 c4108f4) {
        if (this.f32226n) {
            return;
        }
        this.f32226n = true;
        this.f32224l.a(c4108f4);
    }
}
