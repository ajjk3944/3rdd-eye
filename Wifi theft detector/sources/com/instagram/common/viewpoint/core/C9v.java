package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9v, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9v implements InterfaceC2223np, InterfaceC2224nq {
    public static String[] A06 = {"JXRw8dEnvO1Lr4g7cFUS0dvQrSj2gCrD", "hvHNuBxl", "xmWilmV3z2eIIj1", "UUtHfwhImwRJiupXWlBcpFq10hKf2hZ3", "Gjwbiw3zcCnfnivX0C6Z4KLegMayRhyW", "PFLAFIzQgEofbdrT2htWxpP7W2gVOOgi", "405rypbMY6P", "HWuA8Rz9jBHRgd5bymvhijPSyV36G6mN"};
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC2224nq A03;
    public C2227nt[] A04 = new C2227nt[0];
    public final InterfaceC2223np A05;

    public C9v(InterfaceC2223np interfaceC2223np, boolean z10, long j10, long j11) {
        this.A05 = interfaceC2223np;
        this.A02 = z10 ? j10 : C.TIME_UNSET;
        this.A01 = j10;
        this.A00 = j11;
    }

    private C06987u A00(long j10, C06987u c06987u) {
        long toleranceBeforeUs = C5C.A0T(c06987u.A01, 0L, j10 - this.A01);
        long jA0T = C5C.A0T(c06987u.A00, 0L, this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j10);
        if (toleranceBeforeUs == c06987u.A01) {
            long j11 = c06987u.A00;
            if (A06[6].length() != 11) {
                throw new RuntimeException();
            }
            A06[0] = "SySHx2FlEzism2SEaRZKk1Ki9OIwKCgL";
            if (jA0T == j11) {
                return c06987u;
            }
        }
        return new C06987u(toleranceBeforeUs, jA0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.DW
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ADV(InterfaceC2223np interfaceC2223np) {
        ((InterfaceC2224nq) AbstractC05983y.A01(this.A03)).ADV(this);
    }

    public static boolean A02(long j10, InterfaceC2186nE[] interfaceC2186nEArr) {
        if (j10 != 0) {
            for (InterfaceC2186nE interfaceC2186nE : interfaceC2186nEArr) {
                if (interfaceC2186nE != null) {
                    C2374qI c2374qIA92 = interfaceC2186nE.A92();
                    if (!C3J.A0G(c2374qIA92.A0W, c2374qIA92.A0R)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != C.TIME_UNSET;
    }

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4s(long j10) {
        this.A05.A4s(j10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2223np
    public final boolean A5C(long j10) {
        return this.A05.A5C(j10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2223np
    public final void A60(long j10, boolean z10) {
        this.A05.A60(j10, z10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2223np
    public final long A6r(long j10, C06987u c06987u) {
        if (j10 == this.A01) {
            return this.A01;
        }
        return this.A05.A6r(j10, A00(j10, c06987u));
    }

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization("Added in D9949576 for unstall buffer")
    public final long A76(long j10) {
        return this.A05.A76(j10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2223np
    public final long A78() {
        long jA78 = this.A05.A78();
        if (jA78 == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && jA78 >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return jA78;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2223np
    public final long A8b() {
        long jA8b = this.A05.A8b();
        if (jA8b != Long.MIN_VALUE) {
            long nextLoadPositionUs = this.A00;
            if (A06[0].charAt(29) != 'C') {
                throw new RuntimeException();
            }
            A06[0] = "QBPPyRyowan8CCGBQiXIHMf03VOUOCSC";
            if (nextLoadPositionUs == Long.MIN_VALUE || jA8b < this.A00) {
                return jA8b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2223np
    public final C2204nW A9M() {
        return this.A05.A9M();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2223np
    public final void ACS() throws IOException {
        if (0 == 0) {
            this.A05.ACS();
            return;
        }
        throw null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2224nq
    public final void AFS(InterfaceC2223np interfaceC2223np) {
        if (0 != 0) {
            return;
        }
        ((InterfaceC2224nq) AbstractC05983y.A01(this.A03)).AFS(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2223np
    public final void AH5(InterfaceC2224nq interfaceC2224nq, long j10) {
        this.A03 = interfaceC2224nq;
        this.A05.AH5(this, j10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2223np
    public final long AHQ() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = C.TIME_UNSET;
            long jAHQ = AHQ();
            return jAHQ != C.TIME_UNSET ? jAHQ : childDiscontinuityUs;
        }
        InterfaceC2223np interfaceC2223np = this.A05;
        if (A06[2].length() == 0) {
            throw new RuntimeException();
        }
        A06[6] = "ABWUoGiNBoa";
        long jAHQ2 = interfaceC2223np.AHQ();
        if (jAHQ2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long discontinuityUs = this.A01;
        boolean z10 = true;
        AbstractC05983y.A08(jAHQ2 >= discontinuityUs);
        if (this.A00 != Long.MIN_VALUE) {
            long discontinuityUs2 = this.A00;
            if (jAHQ2 > discontinuityUs2) {
                z10 = false;
            }
        }
        AbstractC05983y.A08(z10);
        return jAHQ2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2223np
    public final void AHW(long j10) {
        this.A05.AHW(j10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2223np
    public final long AJ8(@MetaExoPlayerCustomization long j10, boolean z10) {
        this.A02 = C.TIME_UNSET;
        boolean z11 = false;
        for (C2227nt c2227nt : this.A04) {
            if (c2227nt != null) {
                c2227nt.A00();
            }
        }
        long jAJ8 = this.A05.AJ8(j10, z10);
        if (jAJ8 == j10 || (jAJ8 >= this.A01 && (this.A00 == Long.MIN_VALUE || jAJ8 <= this.A00))) {
            z11 = true;
        }
        AbstractC05983y.A08(z11);
        return jAJ8;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2223np
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AJ9(com.instagram.common.viewpoint.core.InterfaceC2186nE[] r18, boolean[] r19, com.instagram.common.viewpoint.core.DT[] r20, boolean[] r21, long r22) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C9v.AJ9(com.facebook.ads.redexgen.X.nE[], boolean[], com.facebook.ads.redexgen.X.DT[], boolean[], long):long");
    }

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AJc(boolean z10) {
        this.A05.AJc(z10);
    }

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AKb(byte b10) {
        this.A05.AKb(b10);
    }
}
