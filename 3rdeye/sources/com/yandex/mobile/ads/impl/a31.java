package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2077A;
import c9.C2078B;
import com.yandex.mobile.ads.impl.ip1;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class a31 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f24420a;

    /* renamed from: b, reason: collision with root package name */
    private final g01 f24421b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24422c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24423d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24424e;

    public a31(Context context, a8<?> adResponse, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f24420a = adResponse;
        adConfiguration.q().f();
        this.f24421b = gd.a(context, wm2.f35021a, adConfiguration.q().b());
        this.f24422c = true;
        this.f24423d = true;
        this.f24424e = true;
    }

    public final void a() {
        if (this.f24424e) {
            a("first_auto_swipe");
            this.f24424e = false;
        }
    }

    public final void b() {
        if (this.f24422c) {
            a("first_click_on_controls");
            this.f24422c = false;
        }
    }

    public final void c() {
        if (this.f24423d) {
            a("first_user_swipe");
            this.f24423d = false;
        }
    }

    private final void a(String str) {
        ip1.b reportType = ip1.b.f28790P;
        b9.l[] lVarArr = {new b9.l("event_type", str)};
        HashMap map = new HashMap(C2077A.l(1));
        C2078B.r(map, lVarArr);
        C4075b c4075bA = this.f24420a.a();
        kotlin.jvm.internal.l.f(reportType, "reportType");
        this.f24421b.a(new ip1(reportType.a(), C2078B.u(map), c4075bA));
    }
}
