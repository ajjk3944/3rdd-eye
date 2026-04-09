package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ow, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1913ow implements AnonymousClass78 {
    public static byte[] A07;
    public static String[] A08 = {"yII62Bxz4ePSH41vB2jdKSugEbZVWw1P", "xxJts2URfaqafakNk2KbG7F81xmmDazV", "4dv2SznKWSxWwafbIX2ls1ujl8jSHd2n", "ZTUBGrXVNXomnx09AH", "GEOoy7FoThRACcjBmfZ1TUIlEpKlWtQ8", "rZtP7yRh3duuKSKGXoPyzbqapeA3agH5", "0fM4GZ86zQsT7VByU2LW0lXLtFUbu0NT", "1qHBrVxL1wzL98lt8KL7QvczAsaDn4yk"};
    public AnonymousClass78 A00;
    public InterfaceC1905oo A01;
    public boolean A04;
    public final C6P A05;
    public final C1901ok A06;
    public boolean A03 = true;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "This reverts a bug introduced in D48802706. The upgraded exoaccounts for this but not the old exo. Hence, this is needed here temporarily")
    public boolean A02 = MetaExoPlayerUpgradeConfig.A03(EnumC1596jX.A1h);

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{86, 110, 119, 111, 114, 107, 119, 126, 59, 105, 126, 117, 127, 126, 105, 126, 105, 59, 118, 126, 127, 114, 122, 59, 120, 119, 116, 120, 112, 104, 59, 126, 117, 122, 121, 119, 126, 127, 53};
    }

    static {
        A01();
    }

    public C1913ow(C6P c6p, AnonymousClass45 anonymousClass45) {
        this.A05 = c6p;
        this.A06 = new C1901ok(anonymousClass45);
    }

    private void A02(boolean z3) {
        if (A03(z3)) {
            this.A03 = true;
            if (this.A04) {
                this.A06.A00();
                return;
            }
            return;
        }
        AnonymousClass78 anonymousClass78 = (AnonymousClass78) AbstractC02203y.A01(this.A00);
        long jA8p = anonymousClass78.A8p();
        if (this.A03) {
            AnonymousClass78 rendererClock = this.A06;
            long rendererClockPositionUs = rendererClock.A8p();
            if (jA8p < rendererClockPositionUs) {
                this.A06.A01();
                return;
            }
            this.A03 = false;
            if (this.A04) {
                C1901ok c1901ok = this.A06;
                String[] strArr = A08;
                if (strArr[0].charAt(6) != strArr[7].charAt(6)) {
                    throw new RuntimeException();
                }
                A08[3] = "DdBgGw0WSHdH6u";
                c1901ok.A00();
            }
        }
        this.A06.A02(jA8p);
        C1975px c1975pxA8m = anonymousClass78.A8m();
        AnonymousClass78 rendererClock2 = this.A06;
        if (!c1975pxA8m.equals(rendererClock2.A8m())) {
            AnonymousClass78 rendererClock3 = this.A06;
            rendererClock3.AJd(c1975pxA8m);
            this.A05.AFI(c1975pxA8m);
        }
    }

    private boolean A03(boolean z3) {
        if (this.A01 != null) {
            InterfaceC1905oo interfaceC1905oo = this.A01;
            String[] strArr = A08;
            if (strArr[0].charAt(6) != strArr[7].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "259perxNRfR5uYao2q6cSAfIVJfeeK6N";
            strArr2[7] = "EI3wTVxb9Zi5034aB38J7XgUXur7uJJK";
            if (!interfaceC1905oo.AAP()) {
                if (!this.A01.AAe()) {
                    if (!z3) {
                        boolean zA9p = this.A01.A9p();
                        String[] strArr3 = A08;
                        if (strArr3[4].charAt(0) != strArr3[5].charAt(0)) {
                            A08[3] = "UNE8e4mByuhRiLOUb8sZtJ";
                            if (zA9p) {
                            }
                        } else if (zA9p) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final long A04(boolean z3) {
        A02(z3);
        return A8p();
    }

    public final void A05() {
        this.A04 = true;
        this.A06.A00();
    }

    public final void A06() {
        this.A04 = false;
        this.A06.A01();
    }

    public final void A07(long j) {
        this.A06.A02(j);
    }

    public final void A08(InterfaceC1905oo interfaceC1905oo) {
        if (interfaceC1905oo == this.A01) {
            this.A00 = null;
            this.A01 = null;
            this.A03 = true;
        }
    }

    public final void A09(InterfaceC1905oo interfaceC1905oo) throws AD {
        AnonymousClass78 anonymousClass78A8T = interfaceC1905oo.A8T();
        if (anonymousClass78A8T != null) {
            AnonymousClass78 rendererMediaClock = this.A00;
            if (anonymousClass78A8T != rendererMediaClock) {
                AnonymousClass78 anonymousClass78 = this.A00;
                String[] strArr = A08;
                if (strArr[0].charAt(6) != strArr[7].charAt(6)) {
                    throw new RuntimeException();
                }
                A08[3] = "dGOISEf";
                if (anonymousClass78 == null) {
                    this.A00 = anonymousClass78A8T;
                    this.A01 = interfaceC1905oo;
                    AnonymousClass78 anonymousClass782 = this.A00;
                    AnonymousClass78 rendererMediaClock2 = this.A06;
                    anonymousClass782.AJd(rendererMediaClock2.A8m());
                    return;
                }
                throw AD.A02(new IllegalStateException(A00(0, 39, 8)));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass78
    public final C1975px A8m() {
        if (this.A00 != null) {
            return this.A00.A8m();
        }
        return this.A06.A8m();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass78
    public final long A8p() {
        if (this.A03) {
            return this.A06.A8p();
        }
        return ((AnonymousClass78) AbstractC02203y.A01(this.A00)).A8p();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass78
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "This reverts a bug introduced in D48802706. The upgraded exoaccounts for this but not the old exo. Hence, this is needed here temporarily")
    public final void AJd(C1975px c1975px) {
        if (this.A00 != null) {
            this.A00.AJd(c1975px);
            c1975px = this.A00.A8m();
        }
        this.A06.AJd(c1975px);
        if (this.A02) {
            this.A05.AFI(c1975px);
        }
    }
}
