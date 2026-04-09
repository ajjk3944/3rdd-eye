package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2092m;
import com.yandex.mobile.ads.impl.ew1;
import java.util.List;

/* loaded from: classes3.dex */
public final class rg {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32614a;

    /* renamed from: b, reason: collision with root package name */
    private final vu1 f32615b;

    /* renamed from: c, reason: collision with root package name */
    private final mb2<tn0> f32616c;

    /* renamed from: d, reason: collision with root package name */
    private final zs f32617d;

    /* renamed from: e, reason: collision with root package name */
    private final zf2 f32618e;

    /* renamed from: f, reason: collision with root package name */
    private final yn0 f32619f;

    /* renamed from: g, reason: collision with root package name */
    private final ej0 f32620g;

    /* renamed from: h, reason: collision with root package name */
    private final um0 f32621h;
    private final ro i;

    /* renamed from: j, reason: collision with root package name */
    private final ao0 f32622j;

    /* renamed from: k, reason: collision with root package name */
    private final fg f32623k;

    public /* synthetic */ rg(Context context, vu1 vu1Var, mb2 mb2Var, zs zsVar, zf2 zf2Var, ab2 ab2Var, sk1 sk1Var, um0 um0Var) {
        this(context, vu1Var, mb2Var, zsVar, zf2Var, ab2Var, sk1Var, um0Var, new ro(), new ao0(), new fg());
    }

    public final List<sm0> a() {
        fg fgVar = this.f32623k;
        Context context = this.f32614a;
        vu1 sdkEnvironmentModule = this.f32615b;
        mb2<tn0> videoAdInfo = this.f32616c;
        zs adBreak = this.f32617d;
        zf2 videoTracker = this.f32618e;
        fgVar.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        eg egVar = new eg(videoAdInfo, new ln0(context, sdkEnvironmentModule, adBreak, videoAdInfo).a(), videoTracker);
        ag<?> agVarA = this.f32621h.a("call_to_action");
        ud2 videoClicks = this.f32622j.a(this.f32616c.b(), agVarA != null ? agVarA.b() : null);
        ro roVar = this.i;
        mb2<tn0> videoAdInfo2 = this.f32616c;
        Context context2 = this.f32614a;
        vu1 sdkEnvironmentModule2 = this.f32615b;
        zs adBreak2 = this.f32617d;
        zf2 videoTracker2 = this.f32618e;
        yn0 playbackListener = this.f32619f;
        roVar.getClass();
        kotlin.jvm.internal.l.f(videoAdInfo2, "videoAdInfo");
        kotlin.jvm.internal.l.f(context2, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule2, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adBreak2, "adBreak");
        kotlin.jvm.internal.l.f(videoTracker2, "videoTracker");
        kotlin.jvm.internal.l.f(playbackListener, "playbackListener");
        kotlin.jvm.internal.l.f(videoClicks, "videoClicks");
        nn nnVar = new nn(agVarA, new qo(context2, sdkEnvironmentModule2, adBreak2, videoAdInfo2, videoTracker2, playbackListener, videoClicks, new mm0(context2, sdkEnvironmentModule2, adBreak2, videoAdInfo2, videoTracker2, playbackListener, videoClicks), new g10()));
        on onVar = new on();
        mb2<tn0> mb2Var = this.f32616c;
        zb zbVarA = new ac(mb2Var, new bc(mb2Var.g())).a();
        ag<?> agVarA2 = this.f32621h.a("favicon");
        ag<?> agVar = (agVarA2 == null || !(agVarA2.d() instanceof jj0)) ? null : agVarA2;
        vi0 vi0Var = new vi0(this.f32614a, new fn0(false), this.f32620g);
        q80 q80Var = new q80(vi0Var, agVar, egVar);
        p30 p30Var = new p30(this.f32621h.a("domain"), egVar);
        o12 o12Var = new o12(this.f32621h.a("sponsored"), this.f32616c.a(), egVar, new p12());
        b6 b6Var = new b6(this.f32616c.d().b().a(), this.f32616c.d().b().b());
        p62 p62Var = new p62(vi0Var, this.f32621h.a("trademark"), egVar);
        ol0 ol0Var = new ol0();
        ze1 ze1VarA = new ln0(this.f32614a, this.f32615b, this.f32617d, this.f32616c).a();
        ag<?> agVarA3 = this.f32621h.a("feedback");
        rb rbVar = new rb(ol0Var, ze1VarA, new C4111g0());
        h10 h10Var = new h10();
        j20 j20Var = new j20(h10Var);
        pa0 pa0Var = new pa0(agVarA3, egVar, this.f32618e, rbVar, new m20(h10Var, j20Var, new l20(j20Var, new i30())));
        xi2 xi2Var = new xi2(this.f32621h.a("warning"), egVar);
        Context context3 = this.f32614a;
        ej0 ej0Var = this.f32620g;
        Context applicationContext = context3.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        return C2092m.W(nnVar, zbVarA, q80Var, p30Var, o12Var, b6Var, p62Var, onVar, pa0Var, xi2Var, new xm1(context3, ej0Var, videoClicks, agVar, applicationContext, new ym1(context3, ej0Var), ew1.a.a()));
    }

    public rg(Context context, vu1 sdkEnvironmentModule, mb2 videoAdInfo, zs adBreak, zf2 videoTracker, ab2 playbackListener, sk1 imageProvider, um0 assetsWrapper, ro clickControlConfiguratorProvider, ao0 instreamVideoClicksProvider, fg assetClickConfiguratorProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(playbackListener, "playbackListener");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(assetsWrapper, "assetsWrapper");
        kotlin.jvm.internal.l.f(clickControlConfiguratorProvider, "clickControlConfiguratorProvider");
        kotlin.jvm.internal.l.f(instreamVideoClicksProvider, "instreamVideoClicksProvider");
        kotlin.jvm.internal.l.f(assetClickConfiguratorProvider, "assetClickConfiguratorProvider");
        this.f32614a = context;
        this.f32615b = sdkEnvironmentModule;
        this.f32616c = videoAdInfo;
        this.f32617d = adBreak;
        this.f32618e = videoTracker;
        this.f32619f = playbackListener;
        this.f32620g = imageProvider;
        this.f32621h = assetsWrapper;
        this.i = clickControlConfiguratorProvider;
        this.f32622j = instreamVideoClicksProvider;
        this.f32623k = assetClickConfiguratorProvider;
    }
}
