package f5;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b0 extends p {

    /* renamed from: i, reason: collision with root package name */
    public static final int f8450i = Float.floatToIntBits(Float.NaN);

    @Override // y4.c
    public final void d(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferK;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f8573b.f25842c;
        int i12 = f8450i;
        if (i11 == 536870912) {
            byteBufferK = k((i10 / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (iFloatToIntBits == i12) {
                    iFloatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBufferK.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferK = k(i10);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24)) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == i12) {
                    iFloatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBufferK.putInt(iFloatToIntBits2);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // f5.p
    public final y4.a g(y4.a aVar) throws y4.b {
        int i10 = aVar.f25842c;
        if (i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 4 ? new y4.a(aVar.f25840a, aVar.f25841b, 4) : y4.a.f25839e;
        }
        throw new y4.b(aVar);
    }
}
