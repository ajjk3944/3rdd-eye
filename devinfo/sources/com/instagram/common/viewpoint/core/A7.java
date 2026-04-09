package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;

/* loaded from: assets/audience_network/classes2.dex */
public final class A7 extends AbstractC1881oQ {
    public int[] A00;
    public int[] A01;

    @Override // com.instagram.common.viewpoint.core.AbstractC1881oQ
    public final C02043i A09(C02043i c02043i) throws C02053j {
        int[] iArr = this.A01;
        if (iArr == null) {
            return C02043i.A05;
        }
        if (c02043i.A02 == 2) {
            int i4 = c02043i.A01 != iArr.length ? 1 : 0;
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 < c02043i.A01) {
                    i4 |= i11 != i10 ? 1 : 0;
                    i10++;
                } else {
                    throw new C02053j(c02043i);
                }
            }
            if (i4 != 0) {
                return new C02043i(c02043i.A03, iArr.length, 2);
            }
            return C02043i.A05;
        }
        throw new C02053j(c02043i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1881oQ
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public final void AHH(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC02203y.A01(this.A00);
        int iPosition = byteBuffer.position();
        int outputSize = byteBuffer.limit();
        int position = outputSize - iPosition;
        ByteBuffer byteBufferA00 = A00(this.A06.A00 * (position / this.A05.A00));
        while (iPosition < outputSize) {
            for (int i4 : iArr) {
                byteBufferA00.putShort(byteBuffer.getShort((i4 * 2) + iPosition));
            }
            iPosition += this.A05.A00;
        }
        byteBuffer.position(outputSize);
        byteBufferA00.flip();
    }
}
