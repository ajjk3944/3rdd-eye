package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import c9.C2092m;
import com.yandex.mobile.ads.impl.a92;
import java.util.List;

/* loaded from: classes3.dex */
public final class pk0 {

    /* renamed from: b, reason: collision with root package name */
    private static final List<a92.a> f31800b = C2092m.W(a92.a.f24561c, a92.a.f24562d, a92.a.f24567j);

    /* renamed from: a, reason: collision with root package name */
    private final qk0 f31801a;

    public /* synthetic */ pk0() {
        this(new qk0());
    }

    public final void a(FrameLayout adView) {
        kotlin.jvm.internal.l.f(adView, "adView");
        this.f31801a.a(adView);
    }

    public pk0(qk0 renderer) {
        kotlin.jvm.internal.l.f(renderer, "renderer");
        this.f31801a = renderer;
    }

    public final void a(a92 validationResult, FrameLayout adView) {
        kotlin.jvm.internal.l.f(validationResult, "validationResult");
        kotlin.jvm.internal.l.f(adView, "adView");
        this.f31801a.a(adView, validationResult, !f31800b.contains(validationResult.b()));
    }
}
