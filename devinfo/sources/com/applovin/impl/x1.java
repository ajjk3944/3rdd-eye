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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class x1 extends w1 {
    private final y1 M;
    private g0 N;
    private long O;
    private final AtomicBoolean P;

    public x1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.M = new y1(this.f5892a, this.f5895d, this.f5893b);
        this.P = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.P.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.f5906q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f5900k;
        if (gVar != null) {
            arrayList.add(new h4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.j;
            arrayList.add(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f5892a.getAdEventTracker().b(b(), arrayList);
    }

    @Override // com.applovin.impl.w1
    public void A() {
        this.M.a(this.f5901l);
        this.f5906q = SystemClock.elapsedRealtime();
        this.P.set(true);
    }

    public void I() {
        long jP;
        long millis = 0;
        if (this.f5892a.O() >= 0 || this.f5892a.P() >= 0) {
            if (this.f5892a.O() >= 0) {
                jP = this.f5892a.O();
            } else {
                if (this.f5892a.W0()) {
                    int iH1 = (int) ((com.applovin.impl.sdk.ad.a) this.f5892a).h1();
                    if (iH1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iH1);
                    } else {
                        int iR = (int) this.f5892a.r();
                        if (iR > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iR);
                        }
                    }
                }
                jP = (long) ((this.f5892a.P() / 100.0d) * millis);
            }
            c(jP);
        }
    }

    @Override // com.applovin.impl.w1
    public void a(ViewGroup viewGroup) {
        this.M.a(this.f5900k, this.j, b(), viewGroup);
        if (((Boolean) this.f5893b.a(x4.X5)).booleanValue() || !a(false)) {
            com.applovin.impl.adview.k kVar = this.j;
            if (kVar != null) {
                kVar.b();
            }
            b().renderAd(this.f5892a);
            a("javascript:al_onPoststitialShow();", this.f5892a.x());
            if (h()) {
                long jC = C();
                this.O = jC;
                if (jC > 0) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f5894c.a("AppLovinFullscreenActivity", je.u.s(this.O, "ms...", new StringBuilder("Scheduling timer for ad fully watched in ")));
                    }
                    final int i4 = 0;
                    this.N = g0.a(this.O, this.f5893b, new Runnable(this) { // from class: com.applovin.impl.qa

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ x1 f5178b;

                        {
                            this.f5178b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    this.f5178b.F();
                                    break;
                                case 1:
                                    this.f5178b.G();
                                    break;
                                default:
                                    this.f5178b.H();
                                    break;
                            }
                        }
                    });
                }
            }
            if (this.f5900k != null) {
                if (this.f5892a.r() >= 0) {
                    final int i10 = 1;
                    a(this.f5900k, this.f5892a.r(), new Runnable(this) { // from class: com.applovin.impl.qa

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ x1 f5178b;

                        {
                            this.f5178b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    this.f5178b.F();
                                    break;
                                case 1:
                                    this.f5178b.G();
                                    break;
                                default:
                                    this.f5178b.H();
                                    break;
                            }
                        }
                    });
                } else {
                    this.f5900k.setVisibility(0);
                }
            }
            I();
            final int i11 = 2;
            this.f5893b.q0().a(new r6(this.f5893b, "updateMainViewOM", new Runnable(this) { // from class: com.applovin.impl.qa

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x1 f5178b;

                {
                    this.f5178b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.f5178b.F();
                            break;
                        case 1:
                            this.f5178b.G();
                            break;
                        default:
                            this.f5178b.H();
                            break;
                    }
                }
            }), d6.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
            p();
            super.c(n7.e(this.f5893b));
        }
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
    public void w() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.w1
    public void x() {
        super.x();
        this.P.set(true);
    }

    private long C() {
        com.applovin.impl.sdk.ad.b bVar = this.f5892a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float fH1 = ((com.applovin.impl.sdk.ad.a) bVar).h1();
        if (fH1 <= 0.0f) {
            fH1 = this.f5892a.r();
        }
        return (long) ((this.f5892a.y() / 100.0d) * n7.c(fH1));
    }

    private int D() {
        g0 g0Var;
        int iMin = 100;
        if (h()) {
            if (((Boolean) this.f5893b.a(x4.f6046h1)).booleanValue() && !this.f5892a.hasShown()) {
                return 0;
            }
            if (!E() && (g0Var = this.N) != null) {
                iMin = (int) Math.min(100.0d, ((this.O - g0Var.b()) / this.O) * 100.0d);
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f5894c.a("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        return iMin;
    }

    public boolean E() {
        if (!(this.J && this.f5892a.a1()) && h()) {
            return this.P.get();
        }
        return true;
    }

    @Override // com.applovin.impl.w1
    public void v() {
    }

    @Override // com.applovin.impl.w1
    public void a(String str) {
        if (!((Boolean) this.f5893b.a(x4.P6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f5892a;
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

    @Override // com.applovin.impl.w1
    public void b(long j) {
    }
}
