package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ow1 extends z10 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f14809i = Float.floatToIntBits(Float.NaN);

    public static void l(ByteBuffer byteBuffer, int i4) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i4 * 4.656612875245797E-10d));
        if (iFloatToIntBits == f14809i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.q10
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferF;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i4 = iLimit - iPosition;
        int i10 = this.f18954b.f12560c;
        if (i10 == 2) {
            byteBufferF = f(i4 + i4);
            while (iPosition < iLimit) {
                l(byteBufferF, ((byteBuffer.get(iPosition) & 255) << 16) | ((byteBuffer.get(iPosition + 1) & 255) << 24));
                iPosition += 2;
            }
        } else if (i10 == 1342177280) {
            byteBufferF = f((i4 / 3) * 4);
            while (iPosition < iLimit) {
                l(byteBufferF, ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 3;
            }
        } else if (i10 == 1610612736) {
            byteBufferF = f(i4);
            while (iPosition < iLimit) {
                int i11 = byteBuffer.get(iPosition + 3) & 255;
                int i12 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                l(byteBufferF, i11 | i12 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 4;
            }
        } else if (i10 == 21) {
            byteBufferF = f((i4 / 3) * 4);
            while (iPosition < iLimit) {
                l(byteBufferF, ((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24));
                iPosition += 3;
            }
        } else {
            if (i10 != 22) {
                throw new IllegalStateException();
            }
            byteBufferF = f(i4);
            while (iPosition < iLimit) {
                int i13 = byteBuffer.get(iPosition) & 255;
                int i14 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                l(byteBufferF, i13 | i14 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferF.flip();
    }

    @Override // com.google.android.gms.internal.ads.z10
    public final j00 h(j00 j00Var) throws f10 {
        int i4 = j00Var.f12560c;
        String str = bq0.f9768a;
        if (i4 != 21 && i4 != 1342177280 && i4 != 22 && i4 != 1610612736) {
            if (i4 == 4) {
                return j00.f12557e;
            }
            if (i4 != 2) {
                throw new f10("Unhandled input format:", j00Var);
            }
        }
        return new j00(j00Var.f12558a, j00Var.f12559b, 4);
    }
}
