package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class AE implements InterfaceC2283oo, InterfaceC06937p {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public C06967s A05;
    public C8O A06;
    public DT A07;
    public boolean A08;
    public boolean A09;
    public C2374qI[] A0A;
    public final int A0C;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D18870411: Adding start stall debug reason")
    public EnumC1940ir A0B = EnumC1940ir.A09;
    public final C06776z A0D = new C06776z();
    public long A03 = Long.MIN_VALUE;

    public abstract void A1Z();

    public abstract void A1a(long j10, boolean z10) throws AD;

    public abstract void A1c(C2374qI[] c2374qIArr, long j10, long j11) throws AD;

    public AE(int i10) {
        this.A0C = i10;
    }

    private final int A1O() {
        return this.A00;
    }

    private void A1P(long j10, boolean z10) throws AD {
        this.A08 = false;
        this.A02 = j10;
        this.A03 = j10;
        A1a(j10, z10);
    }

    public final int A1Q(long j10) {
        return ((DT) AbstractC05983y.A01(this.A07)).AK2(j10 - this.A04);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Keep track of the non-adjusted timestamp")
    public final int A1R(C06776z c06776z, C2295p0 c2295p0, int i10) {
        int iAHP = ((DT) AbstractC05983y.A01(this.A07)).AHP(c06776z, c2295p0, i10);
        if (iAHP == -4) {
            if (c2295p0.A05()) {
                this.A03 = Long.MIN_VALUE;
                return this.A08 ? -4 : -3;
            }
            c2295p0.A00 = c2295p0.A01;
            c2295p0.A01 += this.A04;
            this.A03 = Math.max(this.A03, c2295p0.A01);
        } else if (iAHP == -5) {
            C2374qI c2374qI = (C2374qI) AbstractC05983y.A01(c06776z.A00);
            if (c2374qI.A0M != Long.MAX_VALUE) {
                c06776z.A00 = c2374qI.A07().A0s(c2374qI.A0M + this.A04).A14();
            }
        }
        return iAHP;
    }

    public final AD A1S(Throwable th, C2374qI c2374qI, int i10) {
        return A1T(th, c2374qI, false, i10);
    }

    public final AD A1T(Throwable th, C2374qI c2374qI, boolean z10, int i10) {
        int iA03 = 4;
        if (c2374qI != null && !this.A09) {
            this.A09 = true;
            try {
                int formatSupport = AKM(c2374qI);
                iA03 = AbstractC06867i.A03(formatSupport);
            } catch (AD unused) {
            } catch (Throwable th2) {
                this.A09 = false;
                throw th2;
            }
            this.A09 = false;
        }
        return AD.A04(th, getName(), A1O(), c2374qI, iA03, z10, i10);
    }

    public final C06776z A1U() {
        this.A0D.A00();
        return this.A0D;
    }

    public final C06967s A1V() {
        return (C06967s) AbstractC05983y.A01(this.A05);
    }

    public final C8O A1W() {
        return (C8O) AbstractC05983y.A01(this.A06);
    }

    public void A1X() throws AD {
    }

    public void A1Y() {
    }

    public void A1b(boolean z10, boolean z11) throws AD {
    }

    public final boolean A1d() {
        return A9p() ? this.A08 : ((DT) AbstractC05983y.A01(this.A07)).AAe();
    }

    public final C2374qI[] A1e() {
        return (C2374qI[]) AbstractC05983y.A01(this.A0A);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    public final void A5x() {
        AbstractC05983y.A08(this.A01 == 1);
        this.A0D.A00();
        this.A01 = 0;
        this.A07 = null;
        this.A0A = null;
        this.A08 = false;
        A1Z();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    public final void A6L(C06967s c06967s, C2374qI[] c2374qIArr, DT dt, long j10, boolean z10, boolean z11, long j11, long j12) throws AD {
        AbstractC05983y.A08(this.A01 == 0);
        this.A05 = c06967s;
        this.A01 = 1;
        A1b(z10, z11);
        AIa(c2374qIArr, dt, j11, j12);
        A1P(j10, z10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    public final InterfaceC06937p A7D() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    public AnonymousClass78 A8T() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    public final EnumC1940ir A99() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    public final int A9A() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    public final DT A9D() {
        return this.A07;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo, com.instagram.common.viewpoint.core.InterfaceC06937p
    public final int A9N() {
        return this.A0C;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06807c
    public void A9i(int i10, Object obj) throws AD {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    public final boolean A9p() {
        return this.A03 == Long.MIN_VALUE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    public final void AA9(int i10, C8O c8o) {
        this.A00 = i10;
        this.A06 = c8o;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    public final boolean AAN() {
        return this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    public final void ACU() throws IOException {
        ((DT) AbstractC05983y.A01(this.A07)).ACR();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    public final void AIa(C2374qI[] c2374qIArr, DT dt, long j10, long j11) throws AD {
        AbstractC05983y.A08(!this.A08);
        this.A07 = dt;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j10;
        }
        this.A0A = c2374qIArr;
        this.A04 = j11;
        A1c(c2374qIArr, j10, j11);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    public final void AIm(long j10) throws AD {
        A1P(j10, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    public final void AJN() {
        this.A08 = true;
    }

    public int AKO() throws AD {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    public final void start() throws AD {
        AbstractC05983y.A08(this.A01 == 1);
        this.A01 = 2;
        A1X();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2283oo
    public final void stop() {
        AbstractC05983y.A08(this.A01 == 2);
        this.A01 = 1;
        A1Y();
    }
}
