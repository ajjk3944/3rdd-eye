package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.nn0;
import java.util.List;

/* loaded from: classes3.dex */
public final class o72 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f31285a;

    /* renamed from: b, reason: collision with root package name */
    private final nl0 f31286b;

    /* renamed from: c, reason: collision with root package name */
    private final nn0 f31287c;

    public /* synthetic */ o72(vu1 vu1Var, nl0 nl0Var) {
        this(vu1Var, nl0Var, nn0.a.a());
    }

    public final n72 a(Context context, zs coreInstreamAdBreak, mb2 videoAdInfo, pn0 instreamVastAdPlayer, zf2 videoTracker, sk1 imageProvider, ab2 playbackListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(coreInstreamAdBreak, "coreInstreamAdBreak");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(instreamVastAdPlayer, "instreamVastAdPlayer");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(playbackListener, "playbackListener");
        if (!this.f31287c.e()) {
            vu1 vu1Var = this.f31285a;
            ou ouVar = new ou();
            ao0 ao0Var = new ao0(ouVar);
            ud2 ud2VarA = ao0Var.a(videoAdInfo.b(), null);
            return new mo(context, vu1Var, coreInstreamAdBreak, instreamVastAdPlayer, videoAdInfo, videoTracker, playbackListener, ouVar, ao0Var, ud2VarA, new mm0(context, vu1Var, coreInstreamAdBreak, videoAdInfo, videoTracker, playbackListener, ud2VarA), new C4192r5(instreamVastAdPlayer));
        }
        vu1 vu1Var2 = this.f31285a;
        nl0 nl0Var = this.f31286b;
        hs hsVar = new hs(context, instreamVastAdPlayer, coreInstreamAdBreak, videoAdInfo, videoTracker, playbackListener);
        vm0 vm0Var = new vm0();
        um0 um0VarA = vm0.a(context, videoAdInfo);
        rg rgVar = new rg(context, vu1Var2, videoAdInfo, coreInstreamAdBreak, videoTracker, playbackListener, imageProvider, um0VarA);
        List<sm0> listA = rgVar.a();
        zg zgVar = new zg(listA);
        nm0 nm0Var = new nm0();
        dn0 dn0Var = new dn0();
        cn0 cn0VarA = dn0.a(ew1.a.a().a(context));
        return new gs(context, vu1Var2, nl0Var, instreamVastAdPlayer, coreInstreamAdBreak, videoAdInfo, videoTracker, imageProvider, playbackListener, hsVar, vm0Var, um0VarA, rgVar, listA, zgVar, nm0Var, dn0Var, cn0VarA, new km0(nl0Var, cn0VarA));
    }

    public o72(vu1 sdkEnvironmentModule, nl0 customUiElementsHolder, nn0 instreamSettings) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(customUiElementsHolder, "customUiElementsHolder");
        kotlin.jvm.internal.l.f(instreamSettings, "instreamSettings");
        this.f31285a = sdkEnvironmentModule;
        this.f31286b = customUiElementsHolder;
        this.f31287c = instreamSettings;
    }
}
