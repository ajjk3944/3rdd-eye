package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class AE implements InterfaceC1905oo, InterfaceC03157p {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public C03187s A05;
    public C8O A06;
    public DT A07;
    public boolean A08;
    public boolean A09;
    public C1996qI[] A0A;
    public final int A0C;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D18870411: Adding start stall debug reason")
    public EnumC1562ir A0B = EnumC1562ir.A09;
    public final C02996z A0D = new C02996z();
    public long A03 = Long.MIN_VALUE;

    public abstract void A1Z();

    public abstract void A1a(long j, boolean z3) throws AD;

    public abstract void A1c(C1996qI[] c1996qIArr, long j, long j8) throws AD;

    public AE(int i4) {
        this.A0C = i4;
    }

    private final int A1O() {
        return this.A00;
    }

    private void A1P(long j, boolean z3) throws AD {
        this.A08 = false;
        this.A02 = j;
        this.A03 = j;
        A1a(j, z3);
    }

    public final int A1Q(long j) {
        return ((DT) AbstractC02203y.A01(this.A07)).AK2(j - this.A04);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Keep track of the non-adjusted timestamp")
    public final int A1R(C02996z c02996z, C1917p0 c1917p0, int i4) {
        int iAHP = ((DT) AbstractC02203y.A01(this.A07)).AHP(c02996z, c1917p0, i4);
        if (iAHP == -4) {
            if (c1917p0.A05()) {
                this.A03 = Long.MIN_VALUE;
                return this.A08 ? -4 : -3;
            }
            c1917p0.A00 = c1917p0.A01;
            c1917p0.A01 += this.A04;
            this.A03 = Math.max(this.A03, c1917p0.A01);
        } else if (iAHP == -5) {
            C1996qI c1996qI = (C1996qI) AbstractC02203y.A01(c02996z.A00);
            if (c1996qI.A0M != Long.MAX_VALUE) {
                c02996z.A00 = c1996qI.A07().A0s(c1996qI.A0M + this.A04).A14();
            }
        }
        return iAHP;
    }

    public final AD A1S(Throwable th2, C1996qI c1996qI, int i4) {
        return A1T(th2, c1996qI, false, i4);
    }

    public final AD A1T(Throwable th2, C1996qI c1996qI, boolean z3, int i4) {
        int iA03 = 4;
        if (c1996qI != null && !this.A09) {
            this.A09 = true;
            try {
                int formatSupport = AKM(c1996qI);
                iA03 = AbstractC03087i.A03(formatSupport);
            } catch (AD unused) {
            } catch (Throwable th3) {
                this.A09 = false;
                throw th3;
            }
            this.A09 = false;
        }
        return AD.A04(th2, getName(), A1O(), c1996qI, iA03, z3, i4);
    }

    public final C02996z A1U() {
        this.A0D.A00();
        return this.A0D;
    }

    public final C03187s A1V() {
        return (C03187s) AbstractC02203y.A01(this.A05);
    }

    public final C8O A1W() {
        return (C8O) AbstractC02203y.A01(this.A06);
    }

    public void A1X() throws AD {
    }

    public void A1Y() {
    }

    public void A1b(boolean z3, boolean z10) throws AD {
    }

    public final boolean A1d() {
        return A9p() ? this.A08 : ((DT) AbstractC02203y.A01(this.A07)).AAe();
    }

    public final C1996qI[] A1e() {
        return (C1996qI[]) AbstractC02203y.A01(this.A0A);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final void A5x() {
        AbstractC02203y.A08(this.A01 == 1);
        this.A0D.A00();
        this.A01 = 0;
        this.A07 = null;
        this.A0A = null;
        this.A08 = false;
        A1Z();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final void A6L(C03187s c03187s, C1996qI[] c1996qIArr, DT dt, long j, boolean z3, boolean z10, long j8, long j9) throws AD {
        AbstractC02203y.A08(this.A01 == 0);
        this.A05 = c03187s;
        this.A01 = 1;
        A1b(z3, z10);
        AIa(c1996qIArr, dt, j8, j9);
        A1P(j, z3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final InterfaceC03157p A7D() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public AnonymousClass78 A8T() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    public final EnumC1562ir A99() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final int A9A() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final DT A9D() {
        return this.A07;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo, com.instagram.common.viewpoint.core.InterfaceC03157p
    public final int A9N() {
        return this.A0C;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03027c
    public void A9i(int i4, Object obj) throws AD {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final boolean A9p() {
        return this.A03 == Long.MIN_VALUE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final void AA9(int i4, C8O c8o) {
        this.A00 = i4;
        this.A06 = c8o;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final boolean AAN() {
        return this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final void ACU() throws IOException {
        ((DT) AbstractC02203y.A01(this.A07)).ACR();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final void AIa(C1996qI[] c1996qIArr, DT dt, long j, long j8) throws AD {
        AbstractC02203y.A08(!this.A08);
        this.A07 = dt;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j;
        }
        this.A0A = c1996qIArr;
        this.A04 = j8;
        A1c(c1996qIArr, j, j8);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final void AIm(long j) throws AD {
        A1P(j, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final void AJN() {
        this.A08 = true;
    }

    public int AKO() throws AD {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final void start() throws AD {
        AbstractC02203y.A08(this.A01 == 1);
        this.A01 = 2;
        A1X();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final void stop() {
        AbstractC02203y.A08(this.A01 == 2);
        this.A01 = 1;
        A1Y();
    }
}
