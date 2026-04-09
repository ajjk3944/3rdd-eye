package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.nC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1806nC implements F0 {
    public int A00;
    public int A01;
    public int A02;
    public C0487Ey[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;

    public C1806nC(boolean z3, int i4) {
        this(z3, i4, 0);
    }

    public C1806nC(boolean z3, int i4, int i10) {
        AbstractC02203y.A07(i4 > 0);
        AbstractC02203y.A07(i10 >= 0);
        this.A05 = z3;
        this.A04 = i4;
        this.A01 = i10;
        this.A03 = new C0487Ey[i10 + 100];
        if (i10 > 0) {
            this.A06 = new byte[i10 * i4];
            for (int i11 = 0; i11 < i10; i11++) {
                this.A03[i11] = new C0487Ey(this.A06, i11 * i4);
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

    public final synchronized void A02(int i4) {
        boolean targetBufferSizeReduced = i4 < this.A02;
        this.A02 = i4;
        if (targetBufferSizeReduced) {
            AKT();
        }
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final synchronized C0487Ey A49() {
        C0487Ey c0487Ey;
        this.A00++;
        if (this.A01 > 0) {
            C0487Ey[] c0487EyArr = this.A03;
            int i4 = this.A01 - 1;
            this.A01 = i4;
            c0487Ey = (C0487Ey) AbstractC02203y.A01(c0487EyArr[i4]);
            this.A03[this.A01] = null;
        } else {
            c0487Ey = new C0487Ey(new byte[this.A04], 0);
            if (this.A00 > this.A03.length) {
                this.A03 = (C0487Ey[]) Arrays.copyOf(this.A03, this.A03.length * 2);
            }
        }
        return c0487Ey;
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final int A8I() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final synchronized void AHd(C0487Ey c0487Ey) {
        C0487Ey[] c0487EyArr = this.A03;
        int i4 = this.A01;
        this.A01 = i4 + 1;
        c0487EyArr[i4] = c0487Ey;
        this.A00--;
        notifyAll();
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final synchronized void AHe(InterfaceC0488Ez interfaceC0488Ez) {
        while (interfaceC0488Ez != null) {
            C0487Ey[] c0487EyArr = this.A03;
            int i4 = this.A01;
            this.A01 = i4 + 1;
            c0487EyArr[i4] = interfaceC0488Ez.A6u();
            this.A00--;
            interfaceC0488Ez = interfaceC0488Ez.ACc();
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
                C0487Ey highAllocation = (C0487Ey) AbstractC02203y.A01(this.A03[lowIndex]);
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C0487Ey lowAllocation = (C0487Ey) AbstractC02203y.A01(this.A03[highIndex]);
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
        C0487Ey[] c0487EyArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(c0487EyArr, iMax, targetAvailableCount, (Object) null);
        this.A01 = iMax;
    }
}
