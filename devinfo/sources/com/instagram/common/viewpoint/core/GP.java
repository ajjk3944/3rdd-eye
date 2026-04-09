package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* loaded from: assets/audience_network/classes2.dex */
public final class GP {
    public final Handler A00;
    public final GQ A01;

    public GP(Handler handler, GQ gq) {
        this.A00 = gq != null ? (Handler) AbstractC02203y.A01(handler) : null;
        this.A01 = gq;
    }

    public final void A00(final int i4, final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GL
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A02(i4, j);
                }
            });
        }
    }

    public final void A01(final int i4, final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GC
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A03(i4, j);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i4, long j) {
        ((GQ) C5C.A0f(this.A01)).ADU(i4, j);
    }

    public final /* synthetic */ void A03(int i4, long j) {
        ((GQ) C5C.A0f(this.A01)).ADl(i4, j);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A04(int i4, C1996qI c1996qI) {
        if (this.A01 != null) {
            this.A00.post(new GO(this, i4, c1996qI));
        }
    }

    public final void A05(final C1996qI c1996qI, final C6L c6l) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GI
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A06(c1996qI, c6l);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C1996qI c1996qI, C6L c6l) {
        ((GQ) C5C.A0f(this.A01)).AGU(c1996qI);
        ((GQ) C5C.A0f(this.A01)).AGV(c1996qI, c6l);
    }

    public final void A07(final C1949pW c1949pW) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GK
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A08(c1949pW);
                }
            });
        }
    }

    public final /* synthetic */ void A08(C1949pW c1949pW) {
        ((GQ) C5C.A0f(this.A01)).AGb(c1949pW);
    }

    public final void A09(final C6I c6i) {
        c6i.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GM
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0B(c6i);
                }
            });
        }
    }

    public final void A0A(final C6I c6i) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GG
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0C(c6i);
                }
            });
        }
    }

    public final /* synthetic */ void A0B(C6I c6i) {
        c6i.A02();
        ((GQ) C5C.A0f(this.A01)).AGO(c6i);
    }

    public final /* synthetic */ void A0C(C6I c6i) {
        ((GQ) C5C.A0f(this.A01)).AGP(c6i);
    }

    public final void A0D(final Object obj) {
        if (this.A00 != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GH
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0E(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Object obj, long j) {
        ((GQ) C5C.A0f(this.A01)).AFf(obj, j);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GJ
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j, final long j8) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GF
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0H(str, j, j8);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j, long j8) {
        ((GQ) C5C.A0f(this.A01)).AGN(str, j, j8);
    }
}
