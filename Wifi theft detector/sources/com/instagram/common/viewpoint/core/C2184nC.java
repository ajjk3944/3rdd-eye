package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.nC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2184nC implements F0 {
    public int A00;
    public int A01;
    public int A02;
    public C0865Ey[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;

    public C2184nC(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public C2184nC(boolean z10, int i10, int i11) {
        AbstractC05983y.A07(i10 > 0);
        AbstractC05983y.A07(i11 >= 0);
        this.A05 = z10;
        this.A04 = i10;
        this.A01 = i11;
        this.A03 = new C0865Ey[i11 + 100];
        if (i11 > 0) {
            this.A06 = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.A03[i12] = new C0865Ey(this.A06, i12 * i10);
            }
            return;
        }
        this.A06 = null;
    }

    public final synchronized int A00() {
        return this.A00 * this.A04;
    }

    public final synchronized void A01() {
        if (this.A05) {
            A02(0);
        }
    }

    public final synchronized void A02(int i10) {
        boolean targetBufferSizeReduced = i10 < this.A02;
        this.A02 = i10;
        if (targetBufferSizeReduced) {
            AKT();
        }
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final synchronized C0865Ey A49() {
        C0865Ey c0865Ey;
        this.A00++;
        if (this.A01 > 0) {
            C0865Ey[] c0865EyArr = this.A03;
            int i10 = this.A01 - 1;
            this.A01 = i10;
            c0865Ey = (C0865Ey) AbstractC05983y.A01(c0865EyArr[i10]);
            this.A03[this.A01] = null;
        } else {
            c0865Ey = new C0865Ey(new byte[this.A04], 0);
            if (this.A00 > this.A03.length) {
                this.A03 = (C0865Ey[]) Arrays.copyOf(this.A03, this.A03.length * 2);
            }
        }
        return c0865Ey;
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final int A8I() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final synchronized void AHd(C0865Ey c0865Ey) {
        C0865Ey[] c0865EyArr = this.A03;
        int i10 = this.A01;
        this.A01 = i10 + 1;
        c0865EyArr[i10] = c0865Ey;
        this.A00--;
        notifyAll();
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final synchronized void AHe(InterfaceC0866Ez interfaceC0866Ez) {
        while (interfaceC0866Ez != null) {
            C0865Ey[] c0865EyArr = this.A03;
            int i10 = this.A01;
            this.A01 = i10 + 1;
            c0865EyArr[i10] = interfaceC0866Ez.A6u();
            this.A00--;
            interfaceC0866Ez = interfaceC0866Ez.ACc();
        }
        notifyAll();
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final synchronized void AKT() {
        int iA05 = C5C.A05(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int iMax = Math.max(0, iA05 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (iMax >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                C0865Ey highAllocation = (C0865Ey) AbstractC05983y.A01(this.A03[lowIndex]);
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C0865Ey lowAllocation = (C0865Ey) AbstractC05983y.A01(this.A03[highIndex]);
                    if (lowAllocation.A01 != this.A06) {
                        highIndex--;
                    } else {
                        this.A03[lowIndex] = lowAllocation;
                        int targetAllocationCount4 = highIndex - 1;
                        this.A03[highIndex] = highAllocation;
                        highIndex = targetAllocationCount4;
                        lowIndex++;
                    }
                }
            }
            iMax = Math.max(iMax, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (iMax >= targetAllocationCount5) {
                return;
            }
        }
        C0865Ey[] c0865EyArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(c0865EyArr, iMax, targetAvailableCount, (Object) null);
        this.A01 = iMax;
    }
}
