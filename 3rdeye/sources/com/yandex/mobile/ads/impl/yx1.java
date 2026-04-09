package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nh;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class yx1 extends ck {
    private final long i = 150000;

    /* renamed from: j, reason: collision with root package name */
    private final long f36094j = 20000;

    /* renamed from: k, reason: collision with root package name */
    private final short f36095k = 1024;

    /* renamed from: l, reason: collision with root package name */
    private int f36096l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f36097m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f36098n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f36099o;

    /* renamed from: p, reason: collision with root package name */
    private int f36100p;

    /* renamed from: q, reason: collision with root package name */
    private int f36101q;

    /* renamed from: r, reason: collision with root package name */
    private int f36102r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f36103s;

    /* renamed from: t, reason: collision with root package name */
    private long f36104t;

    public yx1(int i) {
        byte[] bArr = s82.f32904f;
        this.f36098n = bArr;
        this.f36099o = bArr;
    }

    @Override // com.yandex.mobile.ads.impl.nh
    public final void a(ByteBuffer byteBuffer) {
        int iLimit;
        int iLimit2;
        int iPosition;
        while (byteBuffer.hasRemaining() && !e()) {
            int i = this.f36100p;
            if (i == 0) {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f36098n.length));
                int iLimit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit4)) > this.f36095k) {
                            int i10 = this.f36096l;
                            iPosition = ((iLimit4 / i10) * i10) + i10;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f36100p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    a(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f36103s = true;
                    }
                }
                byteBuffer.limit(iLimit3);
            } else if (i == 1) {
                int iLimit5 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position();
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit2 = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iPosition2)) > this.f36095k) {
                            int i11 = this.f36096l;
                            iLimit2 = (iPosition2 / i11) * i11;
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit2 - byteBuffer.position();
                byte[] bArr = this.f36098n;
                int length = bArr.length;
                int i12 = this.f36101q;
                int i13 = length - i12;
                if (iLimit2 >= iLimit5 || iPosition3 >= i13) {
                    int iMin = Math.min(iPosition3, i13);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f36098n, this.f36101q, iMin);
                    int i14 = this.f36101q + iMin;
                    this.f36101q = i14;
                    byte[] bArr2 = this.f36098n;
                    if (i14 == bArr2.length) {
                        if (this.f36103s) {
                            int i15 = this.f36102r;
                            a(i15).put(bArr2, 0, i15).flip();
                            if (i15 > 0) {
                                this.f36103s = true;
                            }
                            this.f36104t += (this.f36101q - (this.f36102r * 2)) / this.f36096l;
                        } else {
                            this.f36104t += (i14 - this.f36102r) / this.f36096l;
                        }
                        byte[] bArr3 = this.f36098n;
                        int i16 = this.f36101q;
                        int iMin2 = Math.min(byteBuffer.remaining(), this.f36102r);
                        int i17 = this.f36102r - iMin2;
                        System.arraycopy(bArr3, i16 - i17, this.f36099o, 0, i17);
                        byteBuffer.position(byteBuffer.limit() - iMin2);
                        byteBuffer.get(this.f36099o, i17, iMin2);
                        this.f36101q = 0;
                        this.f36100p = 2;
                    }
                    byteBuffer.limit(iLimit5);
                } else {
                    a(i12).put(bArr, 0, i12).flip();
                    if (i12 > 0) {
                        this.f36103s = true;
                    }
                    this.f36101q = 0;
                    this.f36100p = 0;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iLimit6 = byteBuffer.limit();
                int iPosition4 = byteBuffer.position();
                while (true) {
                    if (iPosition4 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iPosition4)) > this.f36095k) {
                            int i18 = this.f36096l;
                            iLimit = (iPosition4 / i18) * i18;
                            break;
                        }
                        iPosition4 += 2;
                    }
                }
                byteBuffer.limit(iLimit);
                this.f36104t += byteBuffer.remaining() / this.f36096l;
                byte[] bArr4 = this.f36099o;
                int i19 = this.f36102r;
                int iMin3 = Math.min(byteBuffer.remaining(), this.f36102r);
                int i20 = this.f36102r - iMin3;
                System.arraycopy(bArr4, i19 - i20, this.f36099o, 0, i20);
                byteBuffer.position(byteBuffer.limit() - iMin3);
                byteBuffer.get(this.f36099o, i20, iMin3);
                if (iLimit < iLimit6) {
                    byte[] bArr5 = this.f36099o;
                    int i21 = this.f36102r;
                    a(i21).put(bArr5, 0, i21).flip();
                    if (i21 > 0) {
                        this.f36103s = true;
                    }
                    this.f36100p = 0;
                    byteBuffer.limit(iLimit6);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final nh.a b(nh.a aVar) throws nh.b {
        if (aVar.f30869c == 2) {
            return this.f36097m ? aVar : nh.a.f30866e;
        }
        throw new nh.b(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void f() {
        if (this.f36097m) {
            nh.a aVar = this.f25678b;
            int i = aVar.f30870d;
            this.f36096l = i;
            long j4 = this.i;
            long j10 = aVar.f30867a;
            int i10 = ((int) ((j4 * j10) / 1000000)) * i;
            if (this.f36098n.length != i10) {
                this.f36098n = new byte[i10];
            }
            int i11 = ((int) ((this.f36094j * j10) / 1000000)) * i;
            this.f36102r = i11;
            if (this.f36099o.length != i11) {
                this.f36099o = new byte[i11];
            }
        }
        this.f36100p = 0;
        this.f36104t = 0L;
        this.f36101q = 0;
        this.f36103s = false;
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void g() {
        int i = this.f36101q;
        if (i > 0) {
            a(i).put(this.f36098n, 0, i).flip();
            if (i > 0) {
                this.f36103s = true;
            }
        }
        if (this.f36103s) {
            return;
        }
        this.f36104t += this.f36102r / this.f36096l;
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void h() {
        this.f36097m = false;
        this.f36102r = 0;
        byte[] bArr = s82.f32904f;
        this.f36098n = bArr;
        this.f36099o = bArr;
    }

    public final long i() {
        return this.f36104t;
    }

    @Override // com.yandex.mobile.ads.impl.ck, com.yandex.mobile.ads.impl.nh
    public final boolean isActive() {
        return this.f36097m;
    }

    public final void a(boolean z10) {
        this.f36097m = z10;
    }
}
