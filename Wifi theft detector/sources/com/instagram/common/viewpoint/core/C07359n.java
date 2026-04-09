package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.9n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07359n extends AbstractC2229nv implements DI {
    public long A00;
    public InterfaceC06455t A01;
    public InterfaceC2055ku<InterfaceExecutorC0868Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass32 A07;
    public final C2363q7 A08;
    public final C5Y A09;
    public final A6 A0A;
    public final DC A0B;
    public final FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C07359n(C2363q7 c2363q7, C5Y c5y, DC dc, A6 a62, FF ff, int i10, InterfaceC2055ku<InterfaceExecutorC0868Fb> interfaceC2055ku) {
        this.A07 = (AnonymousClass32) AbstractC05983y.A01(c2363q7.A03);
        this.A08 = c2363q7;
        this.A09 = c5y;
        this.A0B = dc;
        this.A0A = a62 == null ? A6.A00 : a62;
        this.A0C = ff;
        this.A06 = i10;
        this.A04 = true;
        this.A00 = C.TIME_UNSET;
        this.A02 = interfaceC2055ku;
    }

    private void A00() {
        final Timeline c07349m = new C07349m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9t(c07349m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.instagram.common.viewpoint.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2341pl A0I(int i10, C2341pl c2341pl, boolean z10) {
                    super.A0I(i10, c2341pl, z10);
                    c2341pl.A05 = true;
                    return c2341pl;
                }

                @Override // com.instagram.common.viewpoint.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2339pj A0L(int i10, C2339pj c2339pj, long j10) {
                    super.A0L(i10, c2339pj, j10);
                    c2339pj.A0F = true;
                    return c2339pj;
                }
            };
            c07349m = timeline;
        }
        A05(c07349m);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2229nv
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2229nv
    public final void A0A(InterfaceC06455t interfaceC06455t) {
        this.A01 = interfaceC06455t;
        this.A0A.AH4();
        this.A0A.AJe((Looper) AbstractC05983y.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0812Cx
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC2223np A5W(C2222no c2222no, F0 f02, long j10) {
        InterfaceExecutorC0868Fb interfaceExecutorC0868Fb;
        InterfaceC2310pF interfaceC2310pFA5I = this.A09.A5I();
        if (this.A01 != null) {
            interfaceC2310pFA5I.A43(this.A01);
        }
        Uri uri = this.A07.A00;
        DD ddA5X = this.A0B.A5X(C8O.A03);
        A6 a62 = this.A0A;
        A1 a1A01 = A01(c2222no);
        FF ff = this.A0C;
        D8 d8A02 = A02(c2222no);
        String str = this.A07.A04;
        int i10 = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC0868Fb = this.A02.get();
        } else {
            interfaceExecutorC0868Fb = null;
        }
        return new C07379p(uri, interfaceC2310pFA5I, ddA5X, a62, a1A01, ff, d8A02, this, f02, str, i10, interfaceExecutorC0868Fb);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0812Cx
    public final void ACT() {
    }

    @Override // com.instagram.common.viewpoint.core.DI
    public final void AG0(long j10, boolean z10, boolean z11) {
        if (j10 == C.TIME_UNSET) {
            j10 = this.A00;
        }
        if (!this.A04 && this.A00 == j10 && this.A05 == z10 && this.A03 == z11) {
            return;
        }
        this.A00 = j10;
        this.A05 = z10;
        this.A03 = z11;
        this.A04 = false;
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0812Cx
    public final void AHk(InterfaceC2223np interfaceC2223np) {
        ((C07379p) interfaceC2223np).A0a();
    }
}
