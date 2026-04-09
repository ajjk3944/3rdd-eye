package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;

/* loaded from: assets/audience_network/classes2.dex */
public final class A0 extends AbstractC2259oQ {
    public static final int A00 = Float.floatToIntBits(Float.NaN);

    public static void A00(int i10, ByteBuffer byteBuffer) {
        float pcm32BitFloat = (float) (i10 * 4.656612875245797E-10d);
        int floatBits = Float.floatToIntBits(pcm32BitFloat);
        if (floatBits == A00) {
            floatBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatBits);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2259oQ
    public final C05823i A09(C05823i c05823i) throws C05833j {
        int i10 = c05823i.A02;
        if (C5C.A14(i10)) {
            if (i10 != 4) {
                return new C05823i(c05823i.A03, c05823i.A01, 4);
            }
            return C05823i.A05;
        }
        throw new C05833j(c05823i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC05843k
    public final void AHH(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA00;
        int i10 = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int limit = iLimit - i10;
        int position = this.A05.A02;
        switch (position) {
            case 536870912:
                int position2 = limit / 3;
                byteBufferA00 = A00(position2 * 4);
                while (i10 < iLimit) {
                    int position3 = byteBuffer.get(i10);
                    int limit2 = (position3 & 255) << 8;
                    int position4 = i10 + 1;
                    int limit3 = limit2 | ((byteBuffer.get(position4) & 255) << 16);
                    int position5 = i10 + 2;
                    A00(limit3 | ((byteBuffer.get(position5) & 255) << 24), byteBufferA00);
                    i10 += 3;
                }
                break;
            case 805306368:
                byteBufferA00 = A00(limit);
                while (i10 < iLimit) {
                    int position6 = byteBuffer.get(i10);
                    int limit4 = position6 & 255;
                    int position7 = i10 + 1;
                    int limit5 = limit4 | ((byteBuffer.get(position7) & 255) << 8);
                    int position8 = i10 + 2;
                    int limit6 = limit5 | ((byteBuffer.get(position8) & 255) << 16);
                    int position9 = i10 + 3;
                    A00(limit6 | ((byteBuffer.get(position9) & 255) << 24), byteBufferA00);
                    i10 += 4;
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
