package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import c9.C2099t;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.ui.AdOverlayInfo;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.util.Util;
import com.yandex.mobile.ads.impl.kb2;
import com.yandex.mobile.ads.impl.xr0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class qm0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4095d5 f32267a;

    /* renamed from: b, reason: collision with root package name */
    private final il f32268b;

    /* renamed from: c, reason: collision with root package name */
    private final kl f32269c;

    /* renamed from: d, reason: collision with root package name */
    private final xr0 f32270d;

    /* renamed from: e, reason: collision with root package name */
    private final k60 f32271e;

    /* renamed from: f, reason: collision with root package name */
    private final oj1 f32272f;

    /* renamed from: g, reason: collision with root package name */
    private final Player.Listener f32273g;

    /* renamed from: h, reason: collision with root package name */
    private final ab2 f32274h;
    private final d9 i;

    /* renamed from: j, reason: collision with root package name */
    private final C4081b5 f32275j;

    /* renamed from: k, reason: collision with root package name */
    private final w60 f32276k;

    /* renamed from: l, reason: collision with root package name */
    private final pi1 f32277l;

    /* renamed from: m, reason: collision with root package name */
    private xs f32278m;

    /* renamed from: n, reason: collision with root package name */
    private Player f32279n;

    /* renamed from: o, reason: collision with root package name */
    private Object f32280o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f32281p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f32282q;

    public qm0(b9 adStateDataController, C4095d5 adPlaybackStateCreator, il bindingControllerCreator, kl bindingControllerHolder, xr0 loadingController, ni1 playerStateController, k60 exoPlayerAdPrepareHandler, oj1 positionProviderHolder, r60 playerListener, ab2 videoAdCreativePlaybackProxyListener, d9 adStateHolder, C4081b5 adPlaybackStateController, w60 currentExoPlayerProvider, pi1 playerStateHolder) {
        kotlin.jvm.internal.l.f(adStateDataController, "adStateDataController");
        kotlin.jvm.internal.l.f(adPlaybackStateCreator, "adPlaybackStateCreator");
        kotlin.jvm.internal.l.f(bindingControllerCreator, "bindingControllerCreator");
        kotlin.jvm.internal.l.f(bindingControllerHolder, "bindingControllerHolder");
        kotlin.jvm.internal.l.f(loadingController, "loadingController");
        kotlin.jvm.internal.l.f(playerStateController, "playerStateController");
        kotlin.jvm.internal.l.f(exoPlayerAdPrepareHandler, "exoPlayerAdPrepareHandler");
        kotlin.jvm.internal.l.f(positionProviderHolder, "positionProviderHolder");
        kotlin.jvm.internal.l.f(playerListener, "playerListener");
        kotlin.jvm.internal.l.f(videoAdCreativePlaybackProxyListener, "videoAdCreativePlaybackProxyListener");
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(currentExoPlayerProvider, "currentExoPlayerProvider");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        this.f32267a = adPlaybackStateCreator;
        this.f32268b = bindingControllerCreator;
        this.f32269c = bindingControllerHolder;
        this.f32270d = loadingController;
        this.f32271e = exoPlayerAdPrepareHandler;
        this.f32272f = positionProviderHolder;
        this.f32273g = playerListener;
        this.f32274h = videoAdCreativePlaybackProxyListener;
        this.i = adStateHolder;
        this.f32275j = adPlaybackStateController;
        this.f32276k = currentExoPlayerProvider;
        this.f32277l = playerStateHolder;
    }

    public static final void b(qm0 qm0Var, xs xsVar) {
        qm0Var.f32275j.a(qm0Var.f32267a.a(xsVar, qm0Var.f32280o));
    }

    public final void a(int i, int i10) {
        this.f32271e.a(i, i10);
    }

    public final void a(int i, int i10, IOException exception) {
        kotlin.jvm.internal.l.f(exception, "exception");
        this.f32271e.b(i, i10, exception);
    }

    public final void b() {
        Player playerA = this.f32276k.a();
        if (playerA != null) {
            if (this.f32278m != null) {
                long jMsToUs = Util.msToUs(playerA.getCurrentPosition());
                if (!playerA.isPlayingAd()) {
                    jMsToUs = 0;
                }
                AdPlaybackState adPlaybackStateWithAdResumePositionUs = this.f32275j.a().withAdResumePositionUs(jMsToUs);
                kotlin.jvm.internal.l.e(adPlaybackStateWithAdResumePositionUs, "withAdResumePositionUs(...)");
                this.f32275j.a(adPlaybackStateWithAdResumePositionUs);
            }
            playerA.removeListener(this.f32273g);
            this.f32275j.a((AdsLoader.EventListener) null);
            this.f32276k.a((Player) null);
            this.f32281p = true;
        }
    }

    public final void a(ViewGroup viewGroup, List<kb2> list) {
        if (this.f32282q || this.f32278m != null || viewGroup == null) {
            return;
        }
        this.f32282q = true;
        if (list == null) {
            list = C2099t.f18581b;
        }
        this.f32270d.a(viewGroup, list, new a());
    }

    public final void a() {
        this.f32282q = false;
        this.f32281p = false;
        this.f32278m = null;
        this.f32272f.a((ji1) null);
        this.i.a();
        this.i.a((wi1) null);
        this.f32269c.c();
        this.f32275j.b();
        this.f32270d.a();
        this.f32274h.a((yn0) null);
        gl glVarA = this.f32269c.a();
        if (glVarA != null) {
            glVarA.c();
        }
        gl glVarA2 = this.f32269c.a();
        if (glVarA2 != null) {
            glVarA2.d();
        }
    }

    public final class a implements xr0.b {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.xr0.b
        public final void a(ViewGroup viewGroup, List<kb2> friendlyOverlays, xs loadedInstreamAd) {
            kotlin.jvm.internal.l.f(viewGroup, "viewGroup");
            kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
            kotlin.jvm.internal.l.f(loadedInstreamAd, "loadedInstreamAd");
            qm0.this.f32282q = false;
            qm0.this.f32278m = loadedInstreamAd;
            xs xsVar = qm0.this.f32278m;
            if (xsVar != null) {
                qm0.this.getClass();
                xsVar.b();
            }
            gl glVarA = qm0.this.f32268b.a(viewGroup, friendlyOverlays, loadedInstreamAd);
            qm0.this.f32269c.a(glVarA);
            glVarA.a(qm0.this.f32274h);
            glVarA.c();
            glVarA.d();
            if (qm0.this.f32276k.b()) {
                qm0.this.f32281p = true;
                qm0.b(qm0.this, loadedInstreamAd);
            }
        }

        @Override // com.yandex.mobile.ads.impl.xr0.b
        public final void a(String reason) {
            kotlin.jvm.internal.l.f(reason, "reason");
            qm0.this.f32282q = false;
            C4081b5 c4081b5 = qm0.this.f32275j;
            AdPlaybackState NONE = AdPlaybackState.NONE;
            kotlin.jvm.internal.l.e(NONE, "NONE");
            c4081b5.a(NONE);
        }
    }

    public final void a(en2 en2Var) {
        this.f32274h.a(en2Var);
    }

    public final void a(Player player) {
        this.f32279n = player;
    }

    public final void a(AdsLoader.EventListener eventListener, AdViewProvider adViewProvider, Object obj) {
        kb2.a aVar;
        kotlin.jvm.internal.l.f(eventListener, "eventListener");
        Player player = this.f32279n;
        this.f32276k.a(player);
        this.f32280o = obj;
        if (player != null) {
            player.addListener(this.f32273g);
            this.f32275j.a(eventListener);
            this.f32272f.a(new ji1(player, this.f32277l));
            if (this.f32281p) {
                this.f32275j.a(this.f32275j.a());
                gl glVarA = this.f32269c.a();
                if (glVarA != null) {
                    glVarA.a();
                    return;
                }
                return;
            }
            xs xsVar = this.f32278m;
            if (xsVar != null) {
                this.f32275j.a(this.f32267a.a(xsVar, this.f32280o));
                return;
            }
            if (adViewProvider != null) {
                ViewGroup adViewGroup = adViewProvider.getAdViewGroup();
                ArrayList arrayList = new ArrayList();
                for (AdOverlayInfo adOverlayInfo : adViewProvider.getAdOverlayInfos()) {
                    kotlin.jvm.internal.l.c(adOverlayInfo);
                    View view = adOverlayInfo.view;
                    kotlin.jvm.internal.l.e(view, "view");
                    int i = adOverlayInfo.purpose;
                    if (i == 1) {
                        aVar = kb2.a.f29589b;
                    } else if (i == 2) {
                        aVar = kb2.a.f29590c;
                    } else if (i != 4) {
                        aVar = kb2.a.f29592e;
                    } else {
                        aVar = kb2.a.f29591d;
                    }
                    arrayList.add(new kb2(view, aVar, adOverlayInfo.reasonDetail));
                }
                a(adViewGroup, arrayList);
            }
        }
    }
}
