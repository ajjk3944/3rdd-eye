package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nh;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class nq1 extends ck {
    @Override // com.yandex.mobile.ads.impl.nh
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i10 = this.f25678b.f30869c;
        if (i10 == 3) {
            i *= 2;
        } else if (i10 == 4) {
            i /= 2;
        } else if (i10 != 268435456) {
            if (i10 != 536870912) {
                if (i10 != 805306368) {
                    throw new IllegalStateException();
                }
                i /= 2;
            } else {
                i /= 3;
                i *= 2;
            }
        }
        ByteBuffer byteBufferA = a(i);
        int i11 = this.f25678b.f30869c;
        if (i11 == 3) {
            while (iPosition < iLimit) {
                byteBufferA.put((byte) 0);
                byteBufferA.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i11 == 4) {
            while (iPosition < iLimit) {
                float f10 = byteBuffer.getFloat(iPosition);
                int i12 = s82.f32899a;
                short sMax = (short) (Math.max(-1.0f, Math.min(f10, 1.0f)) * 32767.0f);
                byteBufferA.put((byte) (sMax & 255));
                byteBufferA.put((byte) ((sMax >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
                iPosition += 4;
            }
        } else if (i11 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 1));
                byteBufferA.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i11 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 1));
                byteBufferA.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 2));
                byteBufferA.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final nh.a b(nh.a aVar) throws nh.b {
        int i = aVar.f30869c;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new nh.a(aVar.f30867a, aVar.f30868b, 2) : nh.a.f30866e;
        }
        throw new nh.b(aVar);
    }
}
