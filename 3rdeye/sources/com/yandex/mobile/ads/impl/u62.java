package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nh;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class u62 extends ck {
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f33953j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33954k;

    /* renamed from: l, reason: collision with root package name */
    private int f33955l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f33956m = s82.f32904f;

    /* renamed from: n, reason: collision with root package name */
    private int f33957n;

    /* renamed from: o, reason: collision with root package name */
    private long f33958o;

    @Override // com.yandex.mobile.ads.impl.ck, com.yandex.mobile.ads.impl.nh
    public final boolean a() {
        return super.a() && this.f33957n == 0;
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final nh.a b(nh.a aVar) throws nh.b {
        if (aVar.f30869c != 2) {
            throw new nh.b(aVar);
        }
        this.f33954k = true;
        return (this.i == 0 && this.f33953j == 0) ? nh.a.f30866e : aVar;
    }

    @Override // com.yandex.mobile.ads.impl.ck, com.yandex.mobile.ads.impl.nh
    public final ByteBuffer c() {
        int i;
        if (super.a() && (i = this.f33957n) > 0) {
            a(i).put(this.f33956m, 0, this.f33957n).flip();
            this.f33957n = 0;
        }
        return super.c();
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void f() {
        if (this.f33954k) {
            this.f33954k = false;
            int i = this.f33953j;
            int i10 = this.f25678b.f30870d;
            this.f33956m = new byte[i * i10];
            this.f33955l = this.i * i10;
        }
        this.f33957n = 0;
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void g() {
        if (this.f33954k) {
            if (this.f33957n > 0) {
                this.f33958o += r0 / this.f25678b.f30870d;
            }
            this.f33957n = 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void h() {
        this.f33956m = s82.f32904f;
    }

    public final long i() {
        return this.f33958o;
    }

    public final void j() {
        this.f33958o = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f33955l);
        this.f33958o += iMin / this.f25678b.f30870d;
        this.f33955l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f33955l > 0) {
            return;
        }
        int i10 = i - iMin;
        int length = (this.f33957n + i10) - this.f33956m.length;
        ByteBuffer byteBufferA = a(length);
        int i11 = this.f33957n;
        int i12 = s82.f32899a;
        int iMax = Math.max(0, Math.min(length, i11));
        byteBufferA.put(this.f33956m, 0, iMax);
        int iMax2 = Math.max(0, Math.min(length - iMax, i10));
        byteBuffer.limit(byteBuffer.position() + iMax2);
        byteBufferA.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i13 = i10 - iMax2;
        int i14 = this.f33957n - iMax;
        this.f33957n = i14;
        byte[] bArr = this.f33956m;
        System.arraycopy(bArr, iMax, bArr, 0, i14);
        byteBuffer.get(this.f33956m, this.f33957n, i13);
        this.f33957n += i13;
        byteBufferA.flip();
    }

    public final void a(int i, int i10) {
        this.i = i;
        this.f33953j = i10;
    }
}
