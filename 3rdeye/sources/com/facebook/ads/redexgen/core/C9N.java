package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.9N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9N extends AbstractC3835my {
    public int[] A00;
    public int[] A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC3835my
    public final AnonymousClass36 A09(AnonymousClass36 anonymousClass36) throws AnonymousClass37 {
        int[] iArr = this.A01;
        if (iArr == null) {
            return AnonymousClass36.A05;
        }
        if (anonymousClass36.A02 == 2) {
            int i = anonymousClass36.A01 != iArr.length ? 1 : 0;
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 < anonymousClass36.A01) {
                    i |= i11 != i10 ? 1 : 0;
                    i10++;
                } else {
                    throw new AnonymousClass37(anonymousClass36);
                }
            }
            if (i != 0) {
                return new AnonymousClass36(anonymousClass36.A03, iArr.length, 2);
            }
            return AnonymousClass36.A05;
        }
        throw new AnonymousClass37(anonymousClass36);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3835my
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass38
    public final void AGX(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C3M.A01(this.A00);
        int iPosition = byteBuffer.position();
        int outputSize = byteBuffer.limit();
        int position = outputSize - iPosition;
        ByteBuffer byteBufferA00 = A00(this.A06.A00 * (position / this.A05.A00));
        while (iPosition < outputSize) {
            for (int i : iArr) {
                byteBufferA00.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.A05.A00;
        }
        byteBuffer.position(outputSize);
        byteBufferA00.flip();
    }
}
