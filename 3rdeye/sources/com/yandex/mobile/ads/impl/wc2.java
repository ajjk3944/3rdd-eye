package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.gg1;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.oc2;
import com.yandex.mobile.ads.impl.yc2;
import com.yandex.mobile.ads.impl.zc2;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class wc2 implements zc2.a, oc2.a {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f34897k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f34898l;

    /* renamed from: a, reason: collision with root package name */
    private final C4198s4 f34899a;

    /* renamed from: b, reason: collision with root package name */
    private final zf2 f34900b;

    /* renamed from: c, reason: collision with root package name */
    private final gg1 f34901c;

    /* renamed from: d, reason: collision with root package name */
    private final zc2 f34902d;

    /* renamed from: e, reason: collision with root package name */
    private final oc2 f34903e;

    /* renamed from: f, reason: collision with root package name */
    private final yc2 f34904f;

    /* renamed from: g, reason: collision with root package name */
    private final se2 f34905g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f34906h;
    private final uc2 i;

    /* renamed from: j, reason: collision with root package name */
    private final vc2 f34907j;

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n(wc2.class, "adParameterManager", "getAdParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$ResponseReportParameterManager;");
        kotlin.jvm.internal.x.f43661a.getClass();
        f34897k = new w9.i[]{nVar, new kotlin.jvm.internal.n(wc2.class, "requestParameterManager", "getRequestParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$RequestReportParameterManager;")};
        f34898l = TimeUnit.SECONDS.toMillis(10L);
    }

    public /* synthetic */ wc2(Context context, C4072a3 c4072a3, a8 a8Var, mb2 mb2Var, C4198s4 c4198s4, dd2 dd2Var, fg2 fg2Var, hf2 hf2Var, ag2 ag2Var) {
        this(context, c4072a3, a8Var, mb2Var, c4198s4, dd2Var, fg2Var, hf2Var, ag2Var, gg1.a.a(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(wc2 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.a(new kc2(kc2.a.i, new q00()));
    }

    public final void d() {
        this.f34902d.b();
        this.f34903e.b();
        this.f34901c.stop();
    }

    public final void e() {
        this.f34906h = false;
        this.f34904f.b(null);
        this.f34902d.b();
        this.f34903e.b();
        this.f34901c.stop();
    }

    public final void f() {
        this.f34902d.a();
    }

    public final void a(kc2 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f34902d.b();
        this.f34903e.b();
        this.f34901c.stop();
        if (this.f34906h) {
            return;
        }
        this.f34906h = true;
        String lowerCase = error.a().name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
        String message = error.b().getMessage();
        if (message == null) {
            message = "";
        }
        this.f34904f.a(lowerCase, message);
    }

    public final void c() {
        this.f34902d.b();
        this.f34903e.b();
        this.f34901c.stop();
    }

    public wc2(Context context, C4072a3 adConfiguration, a8 a8Var, mb2 videoAdInfo, C4198s4 adLoadingPhasesManager, dd2 videoAdStatusController, fg2 videoViewProvider, hf2 renderValidator, ag2 videoTracker, gg1 pausableTimer) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(videoAdStatusController, "videoAdStatusController");
        kotlin.jvm.internal.l.f(videoViewProvider, "videoViewProvider");
        kotlin.jvm.internal.l.f(renderValidator, "renderValidator");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(pausableTimer, "pausableTimer");
        this.f34899a = adLoadingPhasesManager;
        this.f34900b = videoTracker;
        this.f34901c = pausableTimer;
        this.f34902d = new zc2(renderValidator, this);
        this.f34903e = new oc2(videoAdStatusController, this);
        this.f34904f = new yc2(context, adConfiguration, a8Var, adLoadingPhasesManager);
        this.f34905g = new se2(videoAdInfo, videoViewProvider);
        this.i = new uc2(this);
        this.f34907j = new vc2(this);
    }

    @Override // com.yandex.mobile.ads.impl.oc2.a
    public final void b() {
        this.f34904f.b(this.f34905g.a());
        this.f34899a.a(EnumC4191r4.f32472v);
        if (this.f34906h) {
            return;
        }
        this.f34906h = true;
        this.f34904f.a();
    }

    @Override // com.yandex.mobile.ads.impl.zc2.a
    public final void a() {
        this.f34902d.b();
        C4198s4 c4198s4 = this.f34899a;
        EnumC4191r4 enumC4191r4 = EnumC4191r4.f32472v;
        uj.a(c4198s4, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
        this.f34900b.i();
        this.f34903e.a();
        this.f34901c.a(f34898l, new R1(this, 7));
    }

    public final void a(yc2.b bVar) {
        this.i.setValue(this, f34897k[0], bVar);
    }

    public final void a(yc2.a aVar) {
        this.f34907j.setValue(this, f34897k[1], aVar);
    }
}
