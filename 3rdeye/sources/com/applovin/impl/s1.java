package com.applovin.impl;

import N7.C1094a9;
import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.r5;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class s1 extends r1 {

    /* renamed from: N, reason: collision with root package name */
    private final t1 f20923N;

    /* renamed from: O, reason: collision with root package name */
    private C2112c0 f20924O;

    /* renamed from: P, reason: collision with root package name */
    private long f20925P;

    /* renamed from: Q, reason: collision with root package name */
    private final AtomicBoolean f20926Q;

    public s1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f20923N = new t1(this.f20836a, this.f20839d, this.f20837b);
        this.f20926Q = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.f20926Q.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        this.f20851q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f20845k;
        if (gVar != null) {
            arrayList.add(new u3(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f20844j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f20844j;
            arrayList.add(new u3(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f20836a.getAdEventTracker().b(this.i, arrayList);
    }

    @Override // com.applovin.impl.r1
    public void B() {
        this.f20923N.a(this.f20846l);
        this.f20851q = SystemClock.elapsedRealtime();
        this.f20926Q.set(true);
    }

    public void J() {
        long jZ;
        long millis = 0;
        if (this.f20836a.Y() >= 0 || this.f20836a.Z() >= 0) {
            if (this.f20836a.Y() >= 0) {
                jZ = this.f20836a.Y();
            } else {
                if (this.f20836a.f1()) {
                    int iP1 = (int) ((com.applovin.impl.sdk.ad.a) this.f20836a).p1();
                    if (iP1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iP1);
                    } else {
                        int iS = (int) this.f20836a.s();
                        if (iS > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iS);
                        }
                    }
                }
                jZ = (long) ((this.f20836a.Z() / 100.0d) * millis);
            }
            c(jZ);
        }
    }

    @Override // com.applovin.impl.c2.a
    public void a() {
    }

    @Override // com.applovin.impl.c2.a
    public void b() {
    }

    @Override // com.applovin.impl.r1
    public void f() {
        super.f();
        B();
    }

    @Override // com.applovin.impl.r1
    public void g() {
        super.g();
        B();
    }

    @Override // com.applovin.impl.r1
    public void n() {
        super.a(E(), false, F(), -2L);
    }

    @Override // com.applovin.impl.r1
    public void x() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.r1
    public void y() {
        super.y();
        this.f20926Q.set(true);
    }

    private long D() {
        com.applovin.impl.sdk.ad.b bVar = this.f20836a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float fP1 = ((com.applovin.impl.sdk.ad.a) bVar).p1();
        if (fP1 <= 0.0f) {
            fP1 = this.f20836a.s();
        }
        return (long) ((this.f20836a.I() / 100.0d) * a7.c(fP1));
    }

    private int E() {
        C2112c0 c2112c0;
        int iMin = 100;
        if (i()) {
            if (!F() && (c2112c0 = this.f20924O) != null) {
                iMin = (int) Math.min(100.0d, ((this.f20925P - c2112c0.b()) / this.f20925P) * 100.0d);
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f20838c.a("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        return iMin;
    }

    public boolean F() {
        if (!(this.f20833K && this.f20836a.j1()) && i()) {
            return this.f20926Q.get();
        }
        return true;
    }

    @Override // com.applovin.impl.r1
    public void a(ViewGroup viewGroup) {
        this.f20923N.a(this.f20845k, this.f20844j, this.i, viewGroup);
        if (a(false)) {
            return;
        }
        com.applovin.impl.adview.k kVar = this.f20844j;
        if (kVar != null) {
            kVar.b();
        }
        this.i.renderAd(this.f20836a);
        a("javascript:al_onPoststitialShow();", this.f20836a.H());
        if (i()) {
            long jD = D();
            this.f20925P = jD;
            if (jD > 0) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20838c.a("AppLovinFullscreenActivity", C1094a9.f(new StringBuilder("Scheduling timer for ad fully watched in "), this.f20925P, "ms..."));
                }
                this.f20924O = C2112c0.a(this.f20925P, this.f20837b, new C.V(this, 14));
            }
        }
        if (this.f20845k != null) {
            if (this.f20836a.s() >= 0) {
                a(this.f20845k, this.f20836a.s(), new C2.h(this, 17));
            } else {
                this.f20845k.setVisibility(0);
            }
        }
        J();
        this.f20837b.q0().a(new f6(this.f20837b, "updateMainViewOM", new L0(this, 4)), r5.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
        q();
        super.c(a7.e(this.f20837b));
    }

    @Override // com.applovin.impl.r1
    public void b(long j4) {
    }

    @Override // com.applovin.impl.r1
    public void w() {
    }

    @Override // com.applovin.impl.r1
    public void a(String str) {
        if (!((Boolean) this.f20837b.a(l4.f19969l6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f20836a;
            if (bVar != null) {
                bVar.a(str);
            }
            n();
        }
        C2112c0 c2112c0 = this.f20924O;
        if (c2112c0 != null) {
            c2112c0.a();
            this.f20924O = null;
        }
        super.a(str);
    }
}
