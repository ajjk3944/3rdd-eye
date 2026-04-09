package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bd0 implements og0 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<String> f25228a;

    /* renamed from: b, reason: collision with root package name */
    private final du1 f25229b;

    /* renamed from: c, reason: collision with root package name */
    private final fg0 f25230c;

    /* renamed from: d, reason: collision with root package name */
    private final C4182q1 f25231d;

    /* renamed from: e, reason: collision with root package name */
    private zr f25232e;

    /* renamed from: f, reason: collision with root package name */
    private g62 f25233f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25234g;

    public /* synthetic */ bd0(Context context, vu1 vu1Var, C4072a3 c4072a3, a8 a8Var, f8 f8Var) {
        this(context, vu1Var, c4072a3, a8Var, f8Var, ew1.a.a().a(context));
    }

    @Override // com.yandex.mobile.ads.impl.og0
    public final void a(boolean z10) {
    }

    @Override // com.yandex.mobile.ads.impl.og0
    public final void a(C4128i3 adFetchRequestError) {
        kotlin.jvm.internal.l.f(adFetchRequestError, "adFetchRequestError");
        zr zrVar = this.f25232e;
        if (zrVar != null) {
            zrVar.a(adFetchRequestError);
        }
    }

    public bd0(Context context, vu1 sdkEnvironmentModule, C4072a3 adConfiguration, a8<String> adResponse, f8 adResultReceiver, du1 du1Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adResultReceiver, "adResultReceiver");
        this.f25228a = adResponse;
        this.f25229b = du1Var;
        this.f25230c = new fg0(context, adConfiguration);
        this.f25231d = new C4182q1(context, adResponse, adResultReceiver, sdkEnvironmentModule, adConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.og0
    public final void a(sf1 webView, Map trackingParameters) {
        kotlin.jvm.internal.l.f(webView, "webView");
        kotlin.jvm.internal.l.f(trackingParameters, "trackingParameters");
        g62 g62Var = this.f25233f;
        if (g62Var != null) {
            g62Var.a(trackingParameters);
        }
        zr zrVar = this.f25232e;
        if (zrVar != null) {
            zrVar.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.og0
    public final void a(String url) {
        kotlin.jvm.internal.l.f(url, "url");
        du1 du1Var = this.f25229b;
        if (du1Var == null || !du1Var.Y() || this.f25234g) {
            this.f25230c.a(url, this.f25228a, this.f25231d);
            this.f25234g = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.og0
    public final void a() {
        this.f25234g = true;
    }

    public final void a(zr zrVar) {
        this.f25232e = zrVar;
    }

    public final void a(uc0 uc0Var) {
        this.f25233f = uc0Var;
    }
}
