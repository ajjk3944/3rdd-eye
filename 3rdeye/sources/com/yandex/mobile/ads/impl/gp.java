package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ip1;

/* loaded from: classes3.dex */
public final class gp implements InterfaceC4214v<InterfaceC4200t> {

    /* renamed from: a, reason: collision with root package name */
    private final np1 f27870a;

    /* renamed from: b, reason: collision with root package name */
    private final g51 f27871b;

    public gp(np1 reporter, g51 nativeAdEventController) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(nativeAdEventController, "nativeAdEventController");
        this.f27870a = reporter;
        this.f27871b = nativeAdEventController;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4214v
    public final af0 a(View view, InterfaceC4200t action) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(action, "action");
        this.f27871b.a();
        this.f27870a.a(ip1.b.f28778D);
        return new af0(false);
    }
}
