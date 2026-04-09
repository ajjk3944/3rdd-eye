package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.d6;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class x1 extends w1 {
    private final y1 M;
    private g0 N;
    private long O;
    private final AtomicBoolean P;

    public x1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.M = new y1(this.f8308a, this.f8311d, this.f8309b);
        this.P = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8310c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.P.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.f8324q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f8318k;
        if (gVar != null) {
            arrayList.add(new h4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f8317j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f8317j;
            arrayList.add(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f8308a.getAdEventTracker().b(b(), arrayList);
    }

    @Override // com.applovin.impl.w1
    public void A() {
        this.M.a(this.f8319l);
        this.f8324q = SystemClock.elapsedRealtime();
        this.P.set(true);
    }

    public void I() {
        long jP;
        long millis = 0;
        if (this.f8308a.O() >= 0 || this.f8308a.P() >= 0) {
            if (this.f8308a.O() >= 0) {
                jP = this.f8308a.O();
            } else {
                if (this.f8308a.W0()) {
                    int iH1 = (int) ((com.applovin.impl.sdk.ad.a) this.f8308a).h1();
                    if (iH1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iH1);
                    } else {
                        int iR = (int) this.f8308a.r();
                        if (iR > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iR);
                        }
                    }
                }
                jP = (long) (millis * (this.f8308a.P() / 100.0d));
            }
            c(jP);
        }
    }

    @Override // com.applovin.impl.w1
    public void a(ViewGroup viewGroup) {
        this.M.a(this.f8318k, this.f8317j, b(), viewGroup);
        if (((Boolean) this.f8309b.a(x4.X5)).booleanValue() || !a(false)) {
            com.applovin.impl.adview.k kVar = this.f8317j;
            if (kVar != null) {
                kVar.b();
            }
            b().renderAd(this.f8308a);
            a("javascript:al_onPoststitialShow();", this.f8308a.x());
            if (h()) {
                long jC = C();
                this.O = jC;
                if (jC > 0) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8310c.a("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.O + "ms...");
                    }
                    this.N = g0.a(this.O, this.f8309b, new Runnable() { // from class: com.applovin.impl.mg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f6995a.F();
                        }
                    });
                }
            }
            if (this.f8318k != null) {
                if (this.f8308a.r() >= 0) {
                    a(this.f8318k, this.f8308a.r(), new Runnable() { // from class: com.applovin.impl.ng
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7068a.G();
                        }
                    });
                } else {
                    this.f8318k.setVisibility(0);
                }
            }
            I();
            this.f8309b.q0().a(new r6(this.f8309b, "updateMainViewOM", new Runnable() { // from class: com.applovin.impl.og
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7203a.H();
                }
            }), d6.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
            p();
            super.c(n7.e(this.f8309b));
        }
    }

    @Override // com.applovin.impl.w1
    public void b(long j10) {
    }

    @Override // com.applovin.impl.w1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.w1
    public void f() {
        super.f();
        A();
    }

    @Override // com.applovin.impl.w1
    public void m() {
        super.a(D(), false, E(), -2L);
    }

    @Override // com.applovin.impl.w1
    public void v() {
    }

    @Override // com.applovin.impl.w1
    public void w() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.w1
    public void x() {
        super.x();
        this.P.set(true);
    }

    private long C() {
        com.applovin.impl.sdk.ad.b bVar = this.f8308a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float fH1 = ((com.applovin.impl.sdk.ad.a) bVar).h1();
        if (fH1 <= 0.0f) {
            fH1 = this.f8308a.r();
        }
        return (long) (n7.c(fH1) * (this.f8308a.y() / 100.0d));
    }

    private int D() {
        g0 g0Var;
        int iMin = 100;
        if (h()) {
            if (((Boolean) this.f8309b.a(x4.f8479h1)).booleanValue() && !this.f8308a.hasShown()) {
                return 0;
            }
            if (!E() && (g0Var = this.N) != null) {
                iMin = (int) Math.min(100.0d, ((this.O - g0Var.b()) / this.O) * 100.0d);
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f8310c.a("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        return iMin;
    }

    public boolean E() {
        if (!(this.J && this.f8308a.a1()) && h()) {
            return this.P.get();
        }
        return true;
    }

    @Override // com.applovin.impl.w1
    public void a(String str) {
        if (!((Boolean) this.f8309b.a(x4.P6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f8308a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        g0 g0Var = this.N;
        if (g0Var != null) {
            g0Var.a();
            this.N = null;
        }
        super.a(str);
    }
}
