package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9v, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9v implements InterfaceC1845np, InterfaceC1846nq {
    public static String[] A06 = {"JXRw8dEnvO1Lr4g7cFUS0dvQrSj2gCrD", "hvHNuBxl", "xmWilmV3z2eIIj1", "UUtHfwhImwRJiupXWlBcpFq10hKf2hZ3", "Gjwbiw3zcCnfnivX0C6Z4KLegMayRhyW", "PFLAFIzQgEofbdrT2htWxpP7W2gVOOgi", "405rypbMY6P", "HWuA8Rz9jBHRgd5bymvhijPSyV36G6mN"};
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC1846nq A03;
    public C1849nt[] A04 = new C1849nt[0];
    public final InterfaceC1845np A05;

    public C9v(InterfaceC1845np interfaceC1845np, boolean z3, long j, long j8) {
        this.A05 = interfaceC1845np;
        this.A02 = z3 ? j : -9223372036854775807L;
        this.A01 = j;
        this.A00 = j8;
    }

    private C03207u A00(long j, C03207u c03207u) {
        long toleranceBeforeUs = C5C.A0T(c03207u.A01, 0L, j - this.A01);
        long jA0T = C5C.A0T(c03207u.A00, 0L, this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j);
        if (toleranceBeforeUs == c03207u.A01) {
            long j8 = c03207u.A00;
            if (A06[6].length() != 11) {
                throw new RuntimeException();
            }
            A06[0] = "SySHx2FlEzism2SEaRZKk1Ki9OIwKCgL";
            if (jA0T == j8) {
                return c03207u;
            }
        }
        return new C03207u(toleranceBeforeUs, jA0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.DW
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ADV(InterfaceC1845np interfaceC1845np) {
        ((InterfaceC1846nq) AbstractC02203y.A01(this.A03)).ADV(this);
    }

    public static boolean A02(long j, InterfaceC1808nE[] interfaceC1808nEArr) {
        if (j != 0) {
            for (InterfaceC1808nE interfaceC1808nE : interfaceC1808nEArr) {
                if (interfaceC1808nE != null) {
                    C1996qI c1996qIA92 = interfaceC1808nE.A92();
                    if (!C3J.A0G(c1996qIA92.A0W, c1996qIA92.A0R)) {
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

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4s(long j) {
        this.A05.A4s(j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final boolean A5C(long j) {
        return this.A05.A5C(j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final void A60(long j, boolean z3) {
        this.A05.A60(j, z3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final long A6r(long j, C03207u c03207u) {
        if (j == this.A01) {
            return this.A01;
        }
        return this.A05.A6r(j, A00(j, c03207u));
    }

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization("Added in D9949576 for unstall buffer")
    public final long A76(long j) {
        return this.A05.A76(j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final long A78() {
        long jA78 = this.A05.A78();
        if (jA78 == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && jA78 >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return jA78;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final C1826nW A9M() {
        return this.A05.A9M();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final void ACS() throws IOException {
        if (0 == 0) {
            this.A05.ACS();
            return;
        }
        throw null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1846nq
    public final void AFS(InterfaceC1845np interfaceC1845np) {
        if (0 != 0) {
            return;
        }
        ((InterfaceC1846nq) AbstractC02203y.A01(this.A03)).AFS(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final void AH5(InterfaceC1846nq interfaceC1846nq, long j) {
        this.A03 = interfaceC1846nq;
        this.A05.AH5(this, j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final long AHQ() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = -9223372036854775807L;
            long jAHQ = AHQ();
            return jAHQ != -9223372036854775807L ? jAHQ : childDiscontinuityUs;
        }
        InterfaceC1845np interfaceC1845np = this.A05;
        if (A06[2].length() == 0) {
            throw new RuntimeException();
        }
        A06[6] = "ABWUoGiNBoa";
        long jAHQ2 = interfaceC1845np.AHQ();
        if (jAHQ2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long discontinuityUs = this.A01;
        boolean z3 = true;
        AbstractC02203y.A08(jAHQ2 >= discontinuityUs);
        if (this.A00 != Long.MIN_VALUE) {
            long discontinuityUs2 = this.A00;
            if (jAHQ2 > discontinuityUs2) {
                z3 = false;
            }
        }
        AbstractC02203y.A08(z3);
        return jAHQ2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final void AHW(long j) {
        this.A05.AHW(j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    public final long AJ8(@MetaExoPlayerCustomization long j, boolean z3) {
        this.A02 = -9223372036854775807L;
        boolean z10 = false;
        for (C1849nt c1849nt : this.A04) {
            if (c1849nt != null) {
                c1849nt.A00();
            }
        }
        long jAJ8 = this.A05.AJ8(j, z3);
        if (jAJ8 == j || (jAJ8 >= this.A01 && (this.A00 == Long.MIN_VALUE || jAJ8 <= this.A00))) {
            z10 = true;
        }
        AbstractC02203y.A08(z10);
        return jAJ8;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1845np
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AJ9(com.instagram.common.viewpoint.core.InterfaceC1808nE[] r18, boolean[] r19, com.instagram.common.viewpoint.core.DT[] r20, boolean[] r21, long r22) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C9v.AJ9(com.facebook.ads.redexgen.X.nE[], boolean[], com.facebook.ads.redexgen.X.DT[], boolean[], long):long");
    }

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AJc(boolean z3) {
        this.A05.AJc(z3);
    }

    @Override // com.instagram.common.viewpoint.core.DX
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AKb(byte b10) {
        this.A05.AKb(b10);
    }
}
