package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.hu1;
import com.yandex.mobile.ads.impl.iu1;
import com.yandex.mobile.ads.impl.kk;

/* loaded from: classes3.dex */
public final class pu1 implements kk.a<du1>, yp1 {

    /* renamed from: a, reason: collision with root package name */
    private final ju1 f31917a;

    /* renamed from: b, reason: collision with root package name */
    private final hu1.a f31918b;

    /* renamed from: c, reason: collision with root package name */
    private final C4198s4 f31919c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f31920d;

    /* renamed from: e, reason: collision with root package name */
    private final er f31921e;

    public pu1(Context context, ju1 sdkConfigurationProvider, iu1.a.b sdkConfigurationLoadListener, C4198s4 adLoadingPhasesManager) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkConfigurationProvider, "sdkConfigurationProvider");
        kotlin.jvm.internal.l.f(sdkConfigurationLoadListener, "sdkConfigurationLoadListener");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f31917a = sdkConfigurationProvider;
        this.f31918b = sdkConfigurationLoadListener;
        this.f31919c = adLoadingPhasesManager;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f31920d = applicationContext;
        this.f31921e = er.f26989c;
    }

    @Override // com.yandex.mobile.ads.impl.rq1.a
    public final void a(fi2 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f31919c.a(EnumC4191r4.f32464n);
        this.f31918b.a(error, this.f31921e);
    }

    @Override // com.yandex.mobile.ads.impl.yp1
    public final void b() {
        this.f31919c.a(EnumC4191r4.f32463m);
        C4198s4 c4198s4 = this.f31919c;
        EnumC4191r4 enumC4191r4 = EnumC4191r4.f32464n;
        uj.a(c4198s4, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
    }

    @Override // com.yandex.mobile.ads.impl.rq1.b
    public final void a(Object obj) {
        du1 sdkConfiguration = (du1) obj;
        kotlin.jvm.internal.l.f(sdkConfiguration, "sdkConfiguration");
        this.f31917a.a(this.f31920d, sdkConfiguration);
        this.f31919c.a(EnumC4191r4.f32464n);
        this.f31918b.a(sdkConfiguration, this.f31921e);
    }
}
