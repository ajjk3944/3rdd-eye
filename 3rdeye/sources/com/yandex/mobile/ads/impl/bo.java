package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nh;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class bo extends ck {
    private int[] i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f25352j;

    @Override // com.yandex.mobile.ads.impl.nh
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.f25352j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA = a(((iLimit - iPosition) / this.f25678b.f30870d) * this.f25679c.f30870d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferA.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f25678b.f30870d;
        }
        byteBuffer.position(iLimit);
        byteBufferA.flip();
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final nh.a b(nh.a aVar) throws nh.b {
        int[] iArr = this.i;
        if (iArr == null) {
            return nh.a.f30866e;
        }
        if (aVar.f30869c != 2) {
            throw new nh.b(aVar);
        }
        boolean z10 = aVar.f30868b != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i10 = iArr[i];
            if (i10 >= aVar.f30868b) {
                throw new nh.b(aVar);
            }
            z10 |= i10 != i;
            i++;
        }
        return z10 ? new nh.a(aVar.f30867a, iArr.length, 2) : nh.a.f30866e;
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void f() {
        this.f25352j = this.i;
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void h() {
        this.f25352j = null;
        this.i = null;
    }

    public final void a(int[] iArr) {
        this.i = iArr;
    }
}
