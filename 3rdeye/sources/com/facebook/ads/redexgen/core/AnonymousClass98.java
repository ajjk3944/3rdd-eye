package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.98, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass98 extends AbstractC3803mS implements InterfaceC2459Cg {
    public long A00;
    public C5H A01;
    public InterfaceC3625jM<InterfaceExecutorC2530Ez> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C2Q A07;
    public final C3940oi A08;
    public final InterfaceC22834w A09;
    public final C9U A0A;
    public final InterfaceC2453Ca A0B;
    public final InterfaceC2508Ed A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jM != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public AnonymousClass98(C3940oi c3940oi, InterfaceC22834w interfaceC22834w, InterfaceC2453Ca interfaceC2453Ca, C9U c9u, InterfaceC2508Ed interfaceC2508Ed, int i, InterfaceC3625jM<InterfaceExecutorC2530Ez> interfaceC3625jM) {
        this.A07 = (C2Q) C3M.A01(c3940oi.A03);
        this.A08 = c3940oi;
        this.A09 = interfaceC22834w;
        this.A0B = interfaceC2453Ca;
        this.A0A = c9u == null ? C9U.A00 : c9u;
        this.A0C = interfaceC2508Ed;
        this.A06 = i;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC3625jM;
    }

    private void A00() {
        final Timeline anonymousClass97 = new AnonymousClass97(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9C(anonymousClass97) { // from class: com.facebook.ads.redexgen.X.12
                @Override // com.facebook.ads.redexgen.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C3920oN A0I(int i, C3920oN c3920oN, boolean z10) {
                    super.A0I(i, c3920oN, z10);
                    c3920oN.A05 = true;
                    return c3920oN;
                }

                @Override // com.facebook.ads.redexgen.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C3918oL A0L(int i, C3918oL c3918oL, long j4) {
                    super.A0L(i, c3918oL, j4);
                    c3918oL.A0F = true;
                    return c3918oL;
                }
            };
            anonymousClass97 = timeline;
        }
        A05(anonymousClass97);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3803mS
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3803mS
    public final void A0A(C5H c5h) {
        this.A01 = c5h;
        this.A0A.AGK();
        this.A0A.AIu((Looper) C3M.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.CL
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC3797mM A5O(C3796mL c3796mL, EO eo, long j4) {
        InterfaceExecutorC2530Ez interfaceExecutorC2530Ez;
        InterfaceC3884nl interfaceC3884nlA5A = this.A09.A5A();
        if (this.A01 != null) {
            interfaceC3884nlA5A.A3v(this.A01);
        }
        Uri uri = this.A07.A00;
        InterfaceC2454Cb interfaceC2454CbA5P = this.A0B.A5P(C23517m.A03);
        C9U c9u = this.A0A;
        C9P c9pA01 = A01(c3796mL);
        InterfaceC2508Ed interfaceC2508Ed = this.A0C;
        CW cwA02 = A02(c3796mL);
        String str = this.A07.A04;
        int i = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC2530Ez = this.A02.get();
        } else {
            interfaceExecutorC2530Ez = null;
        }
        return new C9A(uri, interfaceC3884nlA5A, interfaceC2454CbA5P, c9u, c9pA01, interfaceC2508Ed, cwA02, this, eo, str, i, interfaceExecutorC2530Ez);
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void ABu() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2459Cg
    public final void AFH(long j4, boolean z10, boolean z11) {
        if (j4 == -9223372036854775807L) {
            j4 = this.A00;
        }
        if (!this.A04 && this.A00 == j4 && this.A05 == z10 && this.A03 == z11) {
            return;
        }
        this.A00 = j4;
        this.A05 = z10;
        this.A03 = z11;
        this.A04 = false;
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void AH0(InterfaceC3797mM interfaceC3797mM) {
        ((C9A) interfaceC3797mM).A0a();
    }
}
