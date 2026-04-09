package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import c9.C2100u;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yc2 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f35713a;

    /* renamed from: b, reason: collision with root package name */
    private final g01 f35714b;

    /* renamed from: c, reason: collision with root package name */
    private final xc2 f35715c;

    /* renamed from: d, reason: collision with root package name */
    private a f35716d;

    /* renamed from: e, reason: collision with root package name */
    private b f35717e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, ? extends Object> f35718f;

    public interface a {
        Map<String, Object> a();
    }

    public interface b {
        jp1 a();
    }

    public yc2(Context context, C4072a3 adConfiguration, a8<?> a8Var, C4198s4 adLoadingPhasesManager) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f35713a = a8Var;
        adConfiguration.q().f();
        this.f35714b = gd.a(context, wm2.f35021a, adConfiguration.q().b());
        this.f35715c = new xc2(adLoadingPhasesManager);
    }

    public final void a(String failureReason, String errorMessage) {
        kotlin.jvm.internal.l.f(failureReason, "failureReason");
        kotlin.jvm.internal.l.f(errorMessage, "errorMessage");
        a(C2078B.p(new b9.l("status", com.vungle.ads.internal.presenter.g.ERROR), new b9.l("failure_reason", failureReason), new b9.l("error_message", errorMessage)));
    }

    public final void b(Map<String, ? extends Object> map) {
        this.f35718f = map;
    }

    private final void a(Map<String, Object> map) {
        Map<String, Object> map2 = this.f35718f;
        Map<String, Object> map3 = C2100u.f18582b;
        if (map2 == null) {
            map2 = map3;
        }
        map.putAll(map2);
        a aVar = this.f35716d;
        Map<String, Object> mapA = aVar != null ? aVar.a() : null;
        if (mapA == null) {
            mapA = map3;
        }
        map.putAll(mapA);
        b bVar = this.f35717e;
        Map<String, Object> mapB = bVar != null ? bVar.a().b() : null;
        if (mapB != null) {
            map3 = mapB;
        }
        map.putAll(map3);
        ip1.b reportType = ip1.b.f28789O;
        a8<?> a8Var = this.f35713a;
        C4075b c4075bA = a8Var != null ? a8Var.a() : null;
        kotlin.jvm.internal.l.f(reportType, "reportType");
        this.f35714b.a(new ip1(reportType.a(), C2078B.u(map), c4075bA));
    }

    public final void a() {
        a(C2078B.p(new b9.l("status", "success"), new b9.l("durations", this.f35715c.a())));
    }

    public final void a(b bVar) {
        this.f35717e = bVar;
    }

    public final void a(a aVar) {
        this.f35716d = aVar;
    }
}
