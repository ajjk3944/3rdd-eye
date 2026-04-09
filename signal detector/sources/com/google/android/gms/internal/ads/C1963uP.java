package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.uP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1963uP extends AbstractC1166fi {
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17118j;

    /* renamed from: k, reason: collision with root package name */
    public int f17119k;

    /* renamed from: l, reason: collision with root package name */
    public long f17120l;

    /* renamed from: m, reason: collision with root package name */
    public int f17121m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f17122n;

    /* renamed from: o, reason: collision with root package name */
    public int f17123o;

    /* renamed from: p, reason: collision with root package name */
    public int f17124p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f17125q;

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final void a(ByteBuffer byteBuffer) {
        int iLimit;
        int i;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f14122g.hasRemaining()) {
            if (this.f17119k != 0) {
                AbstractC0582Jp.h0(this.f17123o < this.f17122n.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > 1024) {
                        int i3 = this.i;
                        iLimit = (iPosition2 / i3) * i3;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i6 = this.f17123o;
                int i7 = this.f17124p;
                int i8 = i6 + i7;
                int length = this.f17122n.length;
                if (i8 < length) {
                    i = length - i8;
                } else {
                    i8 = i7 - (length - i6);
                    i = i6 - i8;
                }
                int iMin = Math.min(iPosition3, i);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f17122n, i8, iMin);
                int i9 = this.f17124p + iMin;
                this.f17124p = i9;
                AbstractC0582Jp.h0(i9 <= this.f17122n.length);
                boolean z6 = iLimit < iLimit2 && iPosition3 < i;
                o(z6);
                if (z6) {
                    this.f17119k = 0;
                    this.f17121m = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f17122n.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit4) << 8) | (byteBuffer.get(iLimit4 - 1) & 255)) > 1024) {
                        int i10 = this.i;
                        iPosition = ((iLimit4 / i10) * i10) + i10;
                        break;
                    }
                    iLimit4 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f17119k = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    i(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi, com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final boolean f() {
        return super.f() && this.f17118j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi
    public final C1703ph k(C1703ph c1703ph) throws C0625Mh {
        if (c1703ph.f16199c == 2) {
            return c1703ph.f16197a == -1 ? C1703ph.f16196e : c1703ph;
        }
        throw new C0625Mh("Unhandled input format:", c1703ph);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi
    public final void l() {
        if (this.f17124p > 0) {
            o(true);
            this.f17121m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi
    public final void m() {
        if (f()) {
            int i = this.f14117b.f16198b;
            int i3 = i + i;
            this.i = i3;
            int i6 = ((((int) ((100000 * r0.f16197a) / 1000000)) / 2) / i3) * i3;
            int i7 = i6 + i6;
            if (this.f17122n.length != i7) {
                this.f17122n = new byte[i7];
                this.f17125q = new byte[i7];
            }
        }
        this.f17119k = 0;
        this.f17120l = 0L;
        this.f17121m = 0;
        this.f17123o = 0;
        this.f17124p = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi
    public final void n() {
        this.f17118j = false;
        byte[] bArr = Vt.f12097b;
        this.f17122n = bArr;
        this.f17125q = bArr;
    }

    public final void o(boolean z6) {
        int i;
        int length;
        int i3 = this.f17124p;
        int length2 = this.f17122n.length;
        if (i3 != length2) {
            if (!z6) {
                return;
            } else {
                z6 = true;
            }
        }
        if (this.f17121m == 0) {
            if (z6) {
                q(i3, 3);
                length = i3;
            } else {
                AbstractC0582Jp.h0(i3 >= (length2 >> 1));
                length = this.f17122n.length >> 1;
                q(length, 0);
            }
            i = length;
        } else {
            int i6 = length2 >> 1;
            int i7 = i3 - i6;
            if (z6) {
                int iP = p(i7) + (this.f17122n.length >> 1);
                q(iP, 2);
                int i8 = i6 + i7;
                i = iP;
                length = i8;
            } else {
                int iP2 = p(i7);
                q(iP2, 1);
                i = iP2;
                length = i7;
            }
        }
        if (length % this.i != 0) {
            throw new IllegalStateException(Cr.E("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
        }
        AbstractC0582Jp.h0(i3 >= i);
        this.f17124p -= length;
        int i9 = this.f17123o + length;
        this.f17123o = i9;
        this.f17123o = i9 % this.f17122n.length;
        this.f17121m = (i / this.i) + this.f17121m;
        this.f17120l += (length - i) / r2;
    }

    public final int p(int i) {
        int length = ((((int) ((2000000 * this.f14117b.f16197a) / 1000000)) - this.f17121m) * this.i) - (this.f17122n.length >> 1);
        AbstractC0582Jp.h0(length >= 0);
        int iMin = (int) Math.min((i * 0.2f) + 0.5f, length);
        int i3 = this.i;
        return (iMin / i3) * i3;
    }

    public final void q(int i, int i3) {
        int i6;
        if (i == 0) {
            return;
        }
        AbstractC0582Jp.m(this.f17124p >= i);
        if (i3 == 2) {
            int i7 = this.f17123o;
            int i8 = this.f17124p;
            int i9 = i7 + i8;
            byte[] bArr = this.f17122n;
            int length = bArr.length;
            if (i9 <= length) {
                System.arraycopy(bArr, i9 - i, this.f17125q, 0, i);
            } else {
                int i10 = i8 - (length - i7);
                if (i10 >= i) {
                    System.arraycopy(bArr, i10 - i, this.f17125q, 0, i);
                } else {
                    int i11 = i - i10;
                    System.arraycopy(bArr, length - i11, this.f17125q, 0, i11);
                    System.arraycopy(this.f17122n, 0, this.f17125q, i11, i10);
                }
            }
        } else {
            int i12 = this.f17123o;
            int i13 = i12 + i;
            byte[] bArr2 = this.f17122n;
            int length2 = bArr2.length;
            if (i13 <= length2) {
                System.arraycopy(bArr2, i12, this.f17125q, 0, i);
            } else {
                int i14 = length2 - i12;
                System.arraycopy(bArr2, i12, this.f17125q, 0, i14);
                System.arraycopy(this.f17122n, 0, this.f17125q, i14, i - i14);
            }
        }
        AbstractC0582Jp.P("sizeToOutput is not aligned to frame size: %s", i, i % this.i == 0);
        AbstractC0582Jp.h0(this.f17123o < this.f17122n.length);
        byte[] bArr3 = this.f17125q;
        AbstractC0582Jp.P("byteOutput size is not aligned to frame size %s", i, i % this.i == 0);
        if (i3 != 3) {
            for (int i15 = 0; i15 < i; i15 += 2) {
                int i16 = i15 + 1;
                int i17 = (bArr3[i16] << 8) | (bArr3[i15] & 255);
                if (i3 == 0) {
                    i6 = ((((i15 * TTAdConstant.STYLE_SIZE_RADIO_1_1) / (i - 1)) * (-90)) / TTAdConstant.STYLE_SIZE_RADIO_1_1) + 100;
                } else {
                    i6 = 10;
                    if (i3 == 2) {
                        i6 = 10 + (((90000 * i15) / (i - 1)) / TTAdConstant.STYLE_SIZE_RADIO_1_1);
                    }
                }
                int i18 = (i17 * i6) / 100;
                if (i18 >= 32767) {
                    bArr3[i15] = -1;
                    bArr3[i16] = 127;
                } else if (i18 <= -32768) {
                    bArr3[i15] = 0;
                    bArr3[i16] = -128;
                } else {
                    bArr3[i15] = (byte) (i18 & 255);
                    bArr3[i16] = (byte) (i18 >> 8);
                }
            }
        }
        i(i).put(bArr3, 0, i).flip();
    }
}
