package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.AdOverlayInfo;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.Player;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import c9.C2099t;
import com.yandex.mobile.ads.impl.kb2;
import com.yandex.mobile.ads.impl.yr0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class rm0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4088c5 f32689a;

    /* renamed from: b, reason: collision with root package name */
    private final hl f32690b;

    /* renamed from: c, reason: collision with root package name */
    private final jl f32691c;

    /* renamed from: d, reason: collision with root package name */
    private final yr0 f32692d;

    /* renamed from: e, reason: collision with root package name */
    private final j60 f32693e;

    /* renamed from: f, reason: collision with root package name */
    private final nj1 f32694f;

    /* renamed from: g, reason: collision with root package name */
    private final Player.Listener f32695g;

    /* renamed from: h, reason: collision with root package name */
    private final ab2 f32696h;
    private final c9 i;

    /* renamed from: j, reason: collision with root package name */
    private final C4074a5 f32697j;

    /* renamed from: k, reason: collision with root package name */
    private final v60 f32698k;

    /* renamed from: l, reason: collision with root package name */
    private final oi1 f32699l;

    /* renamed from: m, reason: collision with root package name */
    private xs f32700m;

    /* renamed from: n, reason: collision with root package name */
    private Player f32701n;

    /* renamed from: o, reason: collision with root package name */
    private Object f32702o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f32703p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f32704q;

    public rm0(a9 adStateDataController, C4088c5 adPlaybackStateCreator, hl bindingControllerCreator, jl bindingControllerHolder, yr0 loadingController, mi1 playerStateController, j60 exoPlayerAdPrepareHandler, nj1 positionProviderHolder, q60 playerListener, ab2 videoAdCreativePlaybackProxyListener, c9 adStateHolder, C4074a5 adPlaybackStateController, v60 currentExoPlayerProvider, oi1 playerStateHolder) {
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
        this.f32689a = adPlaybackStateCreator;
        this.f32690b = bindingControllerCreator;
        this.f32691c = bindingControllerHolder;
        this.f32692d = loadingController;
        this.f32693e = exoPlayerAdPrepareHandler;
        this.f32694f = positionProviderHolder;
        this.f32695g = playerListener;
        this.f32696h = videoAdCreativePlaybackProxyListener;
        this.i = adStateHolder;
        this.f32697j = adPlaybackStateController;
        this.f32698k = currentExoPlayerProvider;
        this.f32699l = playerStateHolder;
    }

    public static final void b(rm0 rm0Var, xs xsVar) {
        rm0Var.f32697j.a(rm0Var.f32689a.a(xsVar, rm0Var.f32702o));
    }

    public final void a(int i, int i10) {
        this.f32693e.a(i, i10);
    }

    public final void a(int i, int i10, IOException exception) {
        kotlin.jvm.internal.l.f(exception, "exception");
        this.f32693e.b(i, i10, exception);
    }

    public final void b() {
        Player playerA = this.f32698k.a();
        if (playerA != null) {
            if (this.f32700m != null) {
                long jMsToUs = Util.msToUs(playerA.getCurrentPosition());
                if (!playerA.isPlayingAd()) {
                    jMsToUs = 0;
                }
                AdPlaybackState adPlaybackStateWithAdResumePositionUs = this.f32697j.a().withAdResumePositionUs(jMsToUs);
                kotlin.jvm.internal.l.e(adPlaybackStateWithAdResumePositionUs, "withAdResumePositionUs(...)");
                this.f32697j.a(adPlaybackStateWithAdResumePositionUs);
            }
            playerA.removeListener(this.f32695g);
            this.f32697j.a((AdsLoader.EventListener) null);
            this.f32698k.a((Player) null);
            this.f32703p = true;
        }
    }

    public final void a(ViewGroup viewGroup, List<kb2> list) {
        if (this.f32704q || this.f32700m != null || viewGroup == null) {
            return;
        }
        this.f32704q = true;
        if (list == null) {
            list = C2099t.f18581b;
        }
        this.f32692d.a(viewGroup, list, new a());
    }

    public final void a() {
        this.f32704q = false;
        this.f32703p = false;
        this.f32700m = null;
        this.f32694f.a((ii1) null);
        this.i.a();
        this.i.a((vi1) null);
        this.f32691c.c();
        this.f32697j.b();
        this.f32692d.a();
        this.f32696h.a((yn0) null);
        fl flVarA = this.f32691c.a();
        if (flVarA != null) {
            flVarA.c();
        }
        fl flVarA2 = this.f32691c.a();
        if (flVarA2 != null) {
            flVarA2.d();
        }
    }

    public final class a implements yr0.b {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.yr0.b
        public final void a(ViewGroup viewGroup, List<kb2> friendlyOverlays, xs loadedInstreamAd) {
            kotlin.jvm.internal.l.f(viewGroup, "viewGroup");
            kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
            kotlin.jvm.internal.l.f(loadedInstreamAd, "loadedInstreamAd");
            rm0.this.f32704q = false;
            rm0.this.f32700m = loadedInstreamAd;
            xs xsVar = rm0.this.f32700m;
            if (xsVar != null) {
                rm0.this.getClass();
                xsVar.b();
            }
            fl flVarA = rm0.this.f32690b.a(viewGroup, friendlyOverlays, loadedInstreamAd);
            rm0.this.f32691c.a(flVarA);
            flVarA.a(rm0.this.f32696h);
            flVarA.c();
            flVarA.d();
            if (rm0.this.f32698k.b()) {
                rm0.this.f32703p = true;
                rm0.b(rm0.this, loadedInstreamAd);
            }
        }

        @Override // com.yandex.mobile.ads.impl.yr0.b
        public final void a(String reason) {
            kotlin.jvm.internal.l.f(reason, "reason");
            rm0.this.f32704q = false;
            C4074a5 c4074a5 = rm0.this.f32697j;
            AdPlaybackState NONE = AdPlaybackState.NONE;
            kotlin.jvm.internal.l.e(NONE, "NONE");
            c4074a5.a(NONE);
        }
    }

    public final void a(en2 en2Var) {
        this.f32696h.a(en2Var);
    }

    public final void a(Player player) {
        this.f32701n = player;
    }

    public final void a(AdsLoader.EventListener eventListener, AdViewProvider adViewProvider, Object obj) {
        kb2.a aVar;
        kotlin.jvm.internal.l.f(eventListener, "eventListener");
        Player player = this.f32701n;
        this.f32698k.a(player);
        this.f32702o = obj;
        if (player != null) {
            player.addListener(this.f32695g);
            this.f32697j.a(eventListener);
            this.f32694f.a(new ii1(player, this.f32699l));
            if (this.f32703p) {
                this.f32697j.a(this.f32697j.a());
                fl flVarA = this.f32691c.a();
                if (flVarA != null) {
                    flVarA.a();
                    return;
                }
                return;
            }
            xs xsVar = this.f32700m;
            if (xsVar != null) {
                this.f32697j.a(this.f32689a.a(xsVar, this.f32702o));
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
