package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gf4 extends bg2 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void o(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (iFloatToIntBits == i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // defpackage.qf2
    public final void f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferI;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.b.c;
        if (i3 == 21) {
            byteBufferI = i((i2 / 3) * 4);
            while (iPosition < iLimit) {
                o(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferI);
                iPosition += 3;
            }
        } else if (i3 == 22) {
            byteBufferI = i(i2);
            while (iPosition < iLimit) {
                int i4 = byteBuffer.get(iPosition) & 255;
                int i5 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                o(i4 | i5 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferI);
                iPosition += 4;
            }
        } else if (i3 == 1342177280) {
            byteBufferI = i((i2 / 3) * 4);
            while (iPosition < iLimit) {
                o(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferI);
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferI = i(i2);
            while (iPosition < iLimit) {
                int i6 = byteBuffer.get(iPosition + 3) & 255;
                int i7 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                o(i6 | i7 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferI);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferI.flip();
    }

    @Override // defpackage.bg2
    public final ce2 k(ce2 ce2Var) throws af2 {
        int i2 = ce2Var.c;
        String str = v23.a;
        if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736) {
            return new ce2(ce2Var.a, ce2Var.b, 4);
        }
        if (i2 == 4) {
            return ce2.e;
        }
        throw new af2("Unhandled input format:", ce2Var);
    }
}
