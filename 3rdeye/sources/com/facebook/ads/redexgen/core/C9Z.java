package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9Z, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C9Z implements InterfaceC3859nM, C7D {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public C7G A05;
    public C23517m A06;
    public InterfaceC2470Cr A07;
    public boolean A08;
    public boolean A09;
    public C3949or[] A0A;
    public final int A0C;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D18870411: Adding start stall debug reason")
    public EnumC3525hX A0B = EnumC3525hX.A09;
    public final C6N A0D = new C6N();
    public long A03 = Long.MIN_VALUE;

    public abstract void A1Z();

    public abstract void A1a(long j4, boolean z10) throws C9Y;

    public abstract void A1c(C3949or[] c3949orArr, long j4, long j10) throws C9Y;

    public C9Z(int i) {
        this.A0C = i;
    }

    private final int A1O() {
        return this.A00;
    }

    private void A1P(long j4, boolean z10) throws C9Y {
        this.A08 = false;
        this.A02 = j4;
        this.A03 = j4;
        A1a(j4, z10);
    }

    public final int A1Q(long j4) {
        return ((InterfaceC2470Cr) C3M.A01(this.A07)).AJI(j4 - this.A04);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Keep track of the non-adjusted timestamp")
    public final int A1R(C6N c6n, C3871nY c3871nY, int i) {
        int iAGf = ((InterfaceC2470Cr) C3M.A01(this.A07)).AGf(c6n, c3871nY, i);
        if (iAGf == -4) {
            if (c3871nY.A05()) {
                this.A03 = Long.MIN_VALUE;
                return this.A08 ? -4 : -3;
            }
            c3871nY.A00 = c3871nY.A01;
            c3871nY.A01 += this.A04;
            this.A03 = Math.max(this.A03, c3871nY.A01);
        } else if (iAGf == -5) {
            C3949or c3949or = (C3949or) C3M.A01(c6n.A00);
            if (c3949or.A0M != Long.MAX_VALUE) {
                c6n.A00 = c3949or.A07().A0s(c3949or.A0M + this.A04).A14();
            }
        }
        return iAGf;
    }

    public final C9Y A1S(Throwable th, C3949or c3949or, int i) {
        return A1T(th, c3949or, false, i);
    }

    public final C9Y A1T(Throwable th, C3949or c3949or, boolean z10, int i) {
        int iA03 = 4;
        if (c3949or != null && !this.A09) {
            this.A09 = true;
            try {
                int formatSupport = AJb(c3949or);
                iA03 = AnonymousClass76.A03(formatSupport);
            } catch (C9Y unused) {
            } catch (Throwable th2) {
                this.A09 = false;
                throw th2;
            }
            this.A09 = false;
        }
        return C9Y.A04(th, getName(), A1O(), c3949or, iA03, z10, i);
    }

    public final C6N A1U() {
        this.A0D.A00();
        return this.A0D;
    }

    public final C7G A1V() {
        return (C7G) C3M.A01(this.A05);
    }

    public final C23517m A1W() {
        return (C23517m) C3M.A01(this.A06);
    }

    public void A1X() throws C9Y {
    }

    public void A1Y() {
    }

    public void A1b(boolean z10, boolean z11) throws C9Y {
    }

    public final boolean A1d() {
        return A9h() ? this.A08 : ((InterfaceC2470Cr) C3M.A01(this.A07)).AAV();
    }

    public final C3949or[] A1e() {
        return (C3949or[]) C3M.A01(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    public final void A5p() {
        C3M.A08(this.A01 == 1);
        this.A0D.A00();
        this.A01 = 0;
        this.A07 = null;
        this.A0A = null;
        this.A08 = false;
        A1Z();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    public final void A6D(C7G c7g, C3949or[] c3949orArr, InterfaceC2470Cr interfaceC2470Cr, long j4, boolean z10, boolean z11, long j10, long j11) throws C9Y {
        C3M.A08(this.A01 == 0);
        this.A05 = c7g;
        this.A01 = 1;
        A1b(z10, z11);
        AHq(c3949orArr, interfaceC2470Cr, j10, j11);
        A1P(j4, z10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    public final C7D A75() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    public C6W A8L() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    public final EnumC3525hX A91() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    public final int A92() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    public final InterfaceC2470Cr A95() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM, com.facebook.ads.redexgen.core.C7D
    public final int A9F() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass70
    public void A9a(int i, Object obj) throws C9Y {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    public final boolean A9h() {
        return this.A03 == Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    public final void AA1(int i, C23517m c23517m) {
        this.A00 = i;
        this.A06 = c23517m;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    public final boolean AAE() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    public final void ABv() throws IOException {
        ((InterfaceC2470Cr) C3M.A01(this.A07)).ABs();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    public final void AHq(C3949or[] c3949orArr, InterfaceC2470Cr interfaceC2470Cr, long j4, long j10) throws C9Y {
        C3M.A08(!this.A08);
        this.A07 = interfaceC2470Cr;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j4;
        }
        this.A0A = c3949orArr;
        this.A04 = j10;
        A1c(c3949orArr, j4, j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    public final void AI2(long j4) throws C9Y {
        A1P(j4, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    public final void AId() {
        this.A08 = true;
    }

    public int AJd() throws C9Y {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    public final void start() throws C9Y {
        C3M.A08(this.A01 == 1);
        this.A01 = 2;
        A1X();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3859nM
    public final void stop() {
        C3M.A08(this.A01 == 2);
        this.A01 = 1;
        A1Y();
    }
}
