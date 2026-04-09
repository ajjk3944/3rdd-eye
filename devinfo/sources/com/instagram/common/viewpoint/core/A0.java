package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;

/* loaded from: assets/audience_network/classes2.dex */
public final class A0 extends AbstractC1881oQ {
    public static final int A00 = Float.floatToIntBits(Float.NaN);

    public static void A00(int i4, ByteBuffer byteBuffer) {
        float pcm32BitFloat = (float) (i4 * 4.656612875245797E-10d);
        int floatBits = Float.floatToIntBits(pcm32BitFloat);
        if (floatBits == A00) {
            floatBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatBits);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1881oQ
    public final C02043i A09(C02043i c02043i) throws C02053j {
        int i4 = c02043i.A02;
        if (C5C.A14(i4)) {
            if (i4 != 4) {
                return new C02043i(c02043i.A03, c02043i.A01, 4);
            }
            return C02043i.A05;
        }
        throw new C02053j(c02043i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02063k
    public final void AHH(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA00;
        int i4 = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int limit = iLimit - i4;
        int position = this.A05.A02;
        switch (position) {
            case 536870912:
                int position2 = limit / 3;
                byteBufferA00 = A00(position2 * 4);
                while (i4 < iLimit) {
                    int position3 = byteBuffer.get(i4);
                    int limit2 = (position3 & 255) << 8;
                    int position4 = i4 + 1;
                    int limit3 = limit2 | ((byteBuffer.get(position4) & 255) << 16);
                    int position5 = i4 + 2;
                    A00(limit3 | ((byteBuffer.get(position5) & 255) << 24), byteBufferA00);
                    i4 += 3;
                }
                break;
            case 805306368:
                byteBufferA00 = A00(limit);
                while (i4 < iLimit) {
                    int position6 = byteBuffer.get(i4);
                    int limit4 = position6 & 255;
                    int position7 = i4 + 1;
                    int limit5 = limit4 | ((byteBuffer.get(position7) & 255) << 8);
                    int position8 = i4 + 2;
                    int limit6 = limit5 | ((byteBuffer.get(position8) & 255) << 16);
                    int position9 = i4 + 3;
                    A00(limit6 | ((byteBuffer.get(position9) & 255) << 24), byteBufferA00);
                    i4 += 4;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        int position10 = byteBuffer.limit();
        byteBuffer.position(position10);
        byteBufferA00.flip();
    }
}
