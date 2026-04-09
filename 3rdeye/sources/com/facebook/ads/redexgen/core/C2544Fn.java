package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.Fn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2544Fn {
    public final Handler A00;
    public final InterfaceC2545Fo A01;

    public C2544Fn(Handler handler, InterfaceC2545Fo interfaceC2545Fo) {
        this.A00 = interfaceC2545Fo != null ? (Handler) C3M.A01(handler) : null;
        this.A01 = interfaceC2545Fo;
    }

    public final void A00(final int i, final long j4) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fj
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A02(i, j4);
                }
            });
        }
    }

    public final void A01(final int i, final long j4) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fa
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A03(i, j4);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i, long j4) {
        ((InterfaceC2545Fo) AbstractC22614a.A0f(this.A01)).ACr(i, j4);
    }

    public final /* synthetic */ void A03(int i, long j4) {
        ((InterfaceC2545Fo) AbstractC22614a.A0f(this.A01)).AD7(i, j4);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A04(int i, C3949or c3949or) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC2543Fm(this, i, c3949or));
        }
    }

    public final void A05(final C3949or c3949or, final C22965j c22965j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fg
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A06(c3949or, c22965j);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C3949or c3949or, C22965j c22965j) {
        ((InterfaceC2545Fo) AbstractC22614a.A0f(this.A01)).AFk(c3949or);
        ((InterfaceC2545Fo) AbstractC22614a.A0f(this.A01)).AFl(c3949or, c22965j);
    }

    public final void A07(final C3902o4 c3902o4) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fi
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A08(c3902o4);
                }
            });
        }
    }

    public final /* synthetic */ void A08(C3902o4 c3902o4) {
        ((InterfaceC2545Fo) AbstractC22614a.A0f(this.A01)).AFr(c3902o4);
    }

    public final void A09(final C22935g c22935g) {
        c22935g.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fk
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0B(c22935g);
                }
            });
        }
    }

    public final void A0A(final C22935g c22935g) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fe
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0C(c22935g);
                }
            });
        }
    }

    public final /* synthetic */ void A0B(C22935g c22935g) {
        c22935g.A02();
        ((InterfaceC2545Fo) AbstractC22614a.A0f(this.A01)).AFe(c22935g);
    }

    public final /* synthetic */ void A0C(C22935g c22935g) {
        ((InterfaceC2545Fo) AbstractC22614a.A0f(this.A01)).AFf(c22935g);
    }

    public final void A0D(final Object obj) {
        if (this.A00 != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Ff
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0E(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Object obj, long j4) {
        ((InterfaceC2545Fo) AbstractC22614a.A0f(this.A01)).AEx(obj, j4);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fh
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j4, final long j10) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fd
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0H(str, j4, j10);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j4, long j10) {
        ((InterfaceC2545Fo) AbstractC22614a.A0f(this.A01)).AFd(str, j4, j10);
    }
}
