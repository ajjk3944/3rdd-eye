package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.impl.C2152w0;
import com.applovin.impl.b7;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class u1 extends v1 {

    /* renamed from: q0, reason: collision with root package name */
    private final b7 f21532q0;

    /* renamed from: r0, reason: collision with root package name */
    private final Set f21533r0;

    public class a implements C2152w0.b {
        public a() {
        }

        @Override // com.applovin.impl.C2152w0.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(u1.this.f21579h0 - (u1.this.f21562Q.getDuration() - u1.this.f21562Q.getCurrentPosition()));
            int iD = u1.this.D();
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(u1.this.f21533r0).iterator();
            while (it.hasNext()) {
                l7 l7Var = (l7) it.next();
                if (l7Var.a(seconds, iD)) {
                    hashSet.add(l7Var);
                    u1.this.f21533r0.remove(l7Var);
                }
            }
            u1.this.a(hashSet);
            if (iD >= 25 && iD < 50) {
                u1.this.f21532q0.getAdEventTracker().x();
                return;
            }
            if (iD >= 50 && iD < 75) {
                u1.this.f21532q0.getAdEventTracker().y();
            } else if (iD >= 75) {
                u1.this.f21532q0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.C2152w0.b
        public boolean b() {
            return !u1.this.f21582k0;
        }
    }

    public u1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.f21533r0 = hashSet;
        b7 b7Var = (b7) bVar;
        this.f21532q0 = b7Var;
        if (b7Var.z1()) {
            ImageView imageViewA = h7.a(b7Var.t1().e(), activity, kVar);
            this.f21570Y = imageViewA;
            imageViewA.setOnClickListener(new E8.a(this, activity, kVar, 1));
        }
        b7.d dVar = b7.d.VIDEO;
        hashSet.addAll(b7Var.a(dVar, m7.f20163a));
        a(b7.d.IMPRESSION);
        a(dVar, "creativeView");
        b7Var.getAdEventTracker().g();
    }

    private void Y() {
        if (!H() || this.f21533r0.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.k("AppLovinFullscreenActivity", "Firing " + this.f21533r0.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.f21533r0);
    }

    @Override // com.applovin.impl.v1
    public void E() {
        a(b7.d.VIDEO, "skip");
        this.f21532q0.getAdEventTracker().B();
        super.E();
    }

    @Override // com.applovin.impl.v1
    public void F() {
        super.F();
        b7 b7Var = this.f21532q0;
        if (b7Var != null) {
            b7Var.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.v1
    public void P() {
        long jZ;
        int iS;
        long millis = 0;
        if (this.f21532q0.Y() >= 0 || this.f21532q0.Z() >= 0) {
            if (this.f21532q0.Y() >= 0) {
                jZ = this.f21532q0.Y();
            } else {
                b7 b7Var = this.f21532q0;
                o7 o7VarX1 = b7Var.x1();
                if (o7VarX1 == null || o7VarX1.d() <= 0) {
                    long j4 = this.f21579h0;
                    if (j4 > 0) {
                        millis = j4;
                    }
                } else {
                    millis = TimeUnit.SECONDS.toMillis(o7VarX1.d());
                }
                if (b7Var.f1() && (iS = (int) b7Var.s()) > 0) {
                    millis += TimeUnit.SECONDS.toMillis(iS);
                }
                jZ = (long) ((this.f21532q0.Z() / 100.0d) * millis);
            }
            c(jZ);
        }
    }

    @Override // com.applovin.impl.v1
    public void T() {
        super.T();
        b7 b7Var = this.f21532q0;
        if (b7Var != null) {
            b7Var.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.v1
    public void U() {
        Y();
        if (!n7.a(this.f21532q0)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20838c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            a("no_valid_companion_ad");
        } else {
            if (this.f21582k0) {
                return;
            }
            a(b7.d.COMPANION, "creativeView");
            this.f21532q0.getAdEventTracker().w();
            super.U();
        }
    }

    @Override // com.applovin.impl.v1
    public void W() {
        super.W();
        a(b7.d.VIDEO, this.f21578g0 ? "mute" : "unmute");
        this.f21532q0.getAdEventTracker().b(this.f21578g0);
    }

    @Override // com.applovin.impl.v1
    public void d(long j4) {
        super.d(j4);
        this.f21532q0.getAdEventTracker().b(TimeUnit.MILLISECONDS.toSeconds(j4), a7.e(this.f20837b));
    }

    @Override // com.applovin.impl.v1
    public void g(String str) {
        a(b7.d.ERROR, g7.MEDIA_FILE_ERROR);
        this.f21532q0.getAdEventTracker().b(str);
        super.g(str);
    }

    @Override // com.applovin.impl.r1
    public void t() {
        super.t();
        a(this.f21582k0 ? b7.d.COMPANION : b7.d.VIDEO, "pause");
        this.f21532q0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.r1
    public void u() {
        super.u();
        a(this.f21582k0 ? b7.d.COMPANION : b7.d.VIDEO, "resume");
        this.f21532q0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.v1, com.applovin.impl.r1
    public void w() {
        this.f21575d0.c();
        super.w();
    }

    @Override // com.applovin.impl.v1, com.applovin.impl.r1
    public void x() {
        a((ViewGroup) null);
    }

    private boolean X() {
        return this.f21570Y != null && this.f21532q0.z1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, com.applovin.impl.sdk.k kVar, View view) {
        Uri uriC = this.f21532q0.t1().c();
        if (uriC != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20838c.a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + uriC);
            }
            a(b7.d.INDUSTRY_ICON_CLICK);
            x6.a(uriC, activity, kVar);
        }
    }

    @Override // com.applovin.impl.v1, com.applovin.impl.r1
    public void a(String str) {
        if (this.f21532q0 != null) {
            a(b7.d.VIDEO, com.vungle.ads.internal.presenter.g.CLOSE);
            a(b7.d.COMPANION, com.vungle.ads.internal.presenter.g.CLOSE);
        }
        super.a(str);
    }

    @Override // com.applovin.impl.v1, com.applovin.impl.r1
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (X()) {
            a(b7.d.INDUSTRY_ICON_IMPRESSION);
            this.f21570Y.setVisibility(0);
        }
        this.f21575d0.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        C2105a c2105a = this.f21563R;
        if (c2105a != null) {
            arrayList.add(new u3(c2105a, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.f21564S;
        if (gVar != null) {
            arrayList.add(new u3(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        C2116e0 c2116e0 = this.f21565T;
        if (c2116e0 != null) {
            arrayList.add(new u3(c2116e0, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.f21568W;
        if (progressBar != null) {
            arrayList.add(new u3(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.f21569X;
        if (progressBar2 != null) {
            arrayList.add(new u3(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.f21566U;
        if (imageView != null) {
            arrayList.add(new u3(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.l lVar = this.f21567V;
        if (lVar != null) {
            arrayList.add(new u3(lVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        com.applovin.impl.adview.k kVar = this.f20844j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f20844j;
            arrayList.add(new u3(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f21532q0.getAdEventTracker().b(this.f21562Q, arrayList);
    }

    @Override // com.applovin.impl.v1
    public void a(MotionEvent motionEvent, Bundle bundle) {
        a(b7.d.VIDEO_CLICK);
        this.f21532q0.getAdEventTracker().v();
        super.a(motionEvent, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set set) {
        a(set, g7.UNSPECIFIED);
    }

    private void a(b7.d dVar) {
        a(dVar, g7.UNSPECIFIED);
    }

    private void a(b7.d dVar, String str) {
        a(dVar, str, g7.UNSPECIFIED);
    }

    private void a(b7.d dVar, g7 g7Var) {
        a(dVar, "", g7Var);
    }

    private void a(b7.d dVar, String str, g7 g7Var) {
        a(this.f21532q0.a(dVar, str), g7Var);
    }

    private void a(Set set, g7 g7Var) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f21562Q.getCurrentPosition());
        p7 p7VarY1 = this.f21532q0.y1();
        Uri uriD = p7VarY1 != null ? p7VarY1.d() : null;
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        n7.a(set, seconds, uriD, g7Var, this.f20837b);
    }
}
