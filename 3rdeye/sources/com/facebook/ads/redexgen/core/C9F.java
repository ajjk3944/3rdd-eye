package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9F implements InterfaceC3797mM, InterfaceC3798mN {
    public static String[] A06 = {"JXRw8dEnvO1Lr4g7cFUS0dvQrSj2gCrD", "hvHNuBxl", "xmWilmV3z2eIIj1", "UUtHfwhImwRJiupXWlBcpFq10hKf2hZ3", "Gjwbiw3zcCnfnivX0C6Z4KLegMayRhyW", "PFLAFIzQgEofbdrT2htWxpP7W2gVOOgi", "405rypbMY6P", "HWuA8Rz9jBHRgd5bymvhijPSyV36G6mN"};
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC3798mN A03;
    public C3801mQ[] A04 = new C3801mQ[0];
    public final InterfaceC3797mM A05;

    public C9F(InterfaceC3797mM interfaceC3797mM, boolean z10, long j4, long j10) {
        this.A05 = interfaceC3797mM;
        this.A02 = z10 ? j4 : -9223372036854775807L;
        this.A01 = j4;
        this.A00 = j10;
    }

    private C7I A00(long j4, C7I c7i) {
        long toleranceBeforeUs = AbstractC22614a.A0T(c7i.A01, 0L, j4 - this.A01);
        long jA0T = AbstractC22614a.A0T(c7i.A00, 0L, this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j4);
        if (toleranceBeforeUs == c7i.A01) {
            long j10 = c7i.A00;
            if (A06[6].length() != 11) {
                throw new RuntimeException();
            }
            A06[0] = "SySHx2FlEzism2SEaRZKk1Ki9OIwKCgL";
            if (jA0T == j10) {
                return c7i;
            }
        }
        return new C7I(toleranceBeforeUs, jA0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2473Cu
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ACs(InterfaceC3797mM interfaceC3797mM) {
        ((InterfaceC3798mN) C3M.A01(this.A03)).ACs(this);
    }

    public static boolean A02(long j4, InterfaceC3759lj[] interfaceC3759ljArr) {
        if (j4 != 0) {
            for (InterfaceC3759lj interfaceC3759lj : interfaceC3759ljArr) {
                if (interfaceC3759lj != null) {
                    C3949or c3949orA8u = interfaceC3759lj.A8u();
                    if (!AbstractC22162h.A0G(c3949orA8u.A0W, c3949orA8u.A0R)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2474Cv
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4k(long j4) {
        this.A05.A4k(j4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3797mM
    public final boolean A54(long j4) {
        return this.A05.A54(j4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3797mM
    public final void A5s(long j4, boolean z10) {
        this.A05.A5s(j4, z10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3797mM
    public final long A6j(long j4, C7I c7i) {
        if (j4 == this.A01) {
            return this.A01;
        }
        return this.A05.A6j(j4, A00(j4, c7i));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2474Cv
    @MetaExoPlayerCustomization("Added in D9949576 for unstall buffer")
    public final long A6y(long j4) {
        return this.A05.A6y(j4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3797mM
    public final long A70() {
        long jA70 = this.A05.A70();
        if (jA70 == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && jA70 >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return jA70;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3797mM
    public final long A8T() {
        long jA8T = this.A05.A8T();
        if (jA8T != Long.MIN_VALUE) {
            long nextLoadPositionUs = this.A00;
            if (A06[0].charAt(29) != 'C') {
                throw new RuntimeException();
            }
            A06[0] = "QBPPyRyowan8CCGBQiXIHMf03VOUOCSC";
            if (nextLoadPositionUs == Long.MIN_VALUE || jA8T < this.A00) {
                return jA8T;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3797mM
    public final C3786mA A9E() {
        return this.A05.A9E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3797mM
    public final void ABt() throws IOException {
        if (0 == 0) {
            this.A05.ABt();
            return;
        }
        throw null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3798mN
    public final void AEk(InterfaceC3797mM interfaceC3797mM) {
        if (0 != 0) {
            return;
        }
        ((InterfaceC3798mN) C3M.A01(this.A03)).AEk(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3797mM
    public final void AGL(InterfaceC3798mN interfaceC3798mN, long j4) {
        this.A03 = interfaceC3798mN;
        this.A05.AGL(this, j4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3797mM
    public final long AGg() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = -9223372036854775807L;
            long jAGg = AGg();
            return jAGg != -9223372036854775807L ? jAGg : childDiscontinuityUs;
        }
        InterfaceC3797mM interfaceC3797mM = this.A05;
        if (A06[2].length() == 0) {
            throw new RuntimeException();
        }
        A06[6] = "ABWUoGiNBoa";
        long jAGg2 = interfaceC3797mM.AGg();
        if (jAGg2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long discontinuityUs = this.A01;
        boolean z10 = true;
        C3M.A08(jAGg2 >= discontinuityUs);
        if (this.A00 != Long.MIN_VALUE) {
            long discontinuityUs2 = this.A00;
            if (jAGg2 > discontinuityUs2) {
                z10 = false;
            }
        }
        C3M.A08(z10);
        return jAGg2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3797mM
    public final void AGm(long j4) {
        this.A05.AGm(j4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3797mM
    public final long AIO(@MetaExoPlayerCustomization long j4, boolean z10) {
        this.A02 = -9223372036854775807L;
        boolean z11 = false;
        for (C3801mQ c3801mQ : this.A04) {
            if (c3801mQ != null) {
                c3801mQ.A00();
            }
        }
        long jAIO = this.A05.AIO(j4, z10);
        if (jAIO == j4 || (jAIO >= this.A01 && (this.A00 == Long.MIN_VALUE || jAIO <= this.A00))) {
            z11 = true;
        }
        C3M.A08(z11);
        return jAIO;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC3797mM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AIP(com.facebook.ads.redexgen.core.InterfaceC3759lj[] r18, boolean[] r19, com.facebook.ads.redexgen.core.InterfaceC2470Cr[] r20, boolean[] r21, long r22) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C9F.AIP(com.facebook.ads.redexgen.X.lj[], boolean[], com.facebook.ads.redexgen.X.Cr[], boolean[], long):long");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2474Cv
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AIs(boolean z10) {
        this.A05.AIs(z10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2474Cv
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AJq(byte b10) {
        this.A05.AJq(b10);
    }
}
