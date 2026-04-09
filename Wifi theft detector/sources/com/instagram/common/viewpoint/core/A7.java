package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;

/* loaded from: assets/audience_network/classes2.dex */
public final class A7 extends AbstractC2259oQ {
    public int[] A00;
    public int[] A01;

    @Override // com.instagram.common.viewpoint.core.AbstractC2259oQ
    public final C05823i A09(C05823i c05823i) throws C05833j {
        int[] iArr = this.A01;
        if (iArr == null) {
            return C05823i.A05;
        }
        if (c05823i.A02 == 2) {
            int i10 = c05823i.A01 != iArr.length ? 1 : 0;
            int i11 = 0;
            while (i11 < iArr.length) {
                int i12 = iArr[i11];
                if (i12 < c05823i.A01) {
                    i10 |= i12 != i11 ? 1 : 0;
                    i11++;
                } else {
                    throw new C05833j(c05823i);
                }
            }
            if (i10 != 0) {
                return new C05823i(c05823i.A03, iArr.length, 2);
            }
            return C05823i.A05;
        }
        throw new C05833j(c05823i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2259oQ
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC05843k
    public final void AHH(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC05983y.A01(this.A00);
        int iPosition = byteBuffer.position();
        int outputSize = byteBuffer.limit();
        int position = outputSize - iPosition;
        ByteBuffer byteBufferA00 = A00(this.A06.A00 * (position / this.A05.A00));
        while (iPosition < outputSize) {
            for (int i10 : iArr) {
                byteBufferA00.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.A05.A00;
        }
        byteBuffer.position(outputSize);
        byteBufferA00.flip();
    }
}
