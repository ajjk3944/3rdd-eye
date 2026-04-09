package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class fd0 implements h11, i11 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27282a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<String> f27283b;

    /* renamed from: c, reason: collision with root package name */
    private final f8 f27284c;

    /* renamed from: d, reason: collision with root package name */
    private final rt1 f27285d;

    public fd0(Context context, C4072a3 adConfiguration, a8<String> adResponse, f8 adResultReceiver) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adResultReceiver, "adResultReceiver");
        this.f27282a = context;
        this.f27283b = adResponse;
        this.f27284c = adResultReceiver;
        this.f27285d = new rt1(adConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.i11
    public final void a() {
        this.f27285d.b(this.f27282a, this.f27283b);
        this.f27284c.a(13, null);
    }

    @Override // com.yandex.mobile.ads.impl.h11
    public final void b() {
        this.f27284c.a(15, null);
    }

    @Override // com.yandex.mobile.ads.impl.h11
    public final void e() {
        this.f27284c.a(14, null);
    }
}
