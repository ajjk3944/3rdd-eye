package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.vP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2017vP extends AbstractC1166fi {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void o(ByteBuffer byteBuffer, int i3) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i3 * 4.656612875245797E-10d));
        if (iFloatToIntBits == i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferI;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit - iPosition;
        int i6 = this.f14117b.f16199c;
        if (i6 == 2) {
            byteBufferI = i(i3 + i3);
            while (iPosition < iLimit) {
                o(byteBufferI, ((byteBuffer.get(iPosition) & 255) << 16) | ((byteBuffer.get(iPosition + 1) & 255) << 24));
                iPosition += 2;
            }
        } else if (i6 == 1342177280) {
            byteBufferI = i((i3 / 3) * 4);
            while (iPosition < iLimit) {
                o(byteBufferI, ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 3;
            }
        } else if (i6 == 1610612736) {
            byteBufferI = i(i3);
            while (iPosition < iLimit) {
                int i7 = byteBuffer.get(iPosition + 3) & 255;
                int i8 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                o(byteBufferI, i7 | i8 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 4;
            }
        } else if (i6 == 21) {
            byteBufferI = i((i3 / 3) * 4);
            while (iPosition < iLimit) {
                o(byteBufferI, ((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24));
                iPosition += 3;
            }
        } else {
            if (i6 != 22) {
                throw new IllegalStateException();
            }
            byteBufferI = i(i3);
            while (iPosition < iLimit) {
                int i9 = byteBuffer.get(iPosition) & 255;
                int i10 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                o(byteBufferI, i9 | i10 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferI.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi
    public final C1703ph k(C1703ph c1703ph) throws C0625Mh {
        int i3 = c1703ph.f16199c;
        String str = Vt.f12096a;
        if (i3 != 21 && i3 != 1342177280 && i3 != 22 && i3 != 1610612736) {
            if (i3 == 4) {
                return C1703ph.f16196e;
            }
            if (i3 != 2) {
                throw new C0625Mh("Unhandled input format:", c1703ph);
            }
        }
        return new C1703ph(c1703ph.f16197a, c1703ph.f16198b, 4);
    }
}
