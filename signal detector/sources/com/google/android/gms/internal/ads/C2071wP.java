package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.wP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2071wP extends AbstractC1166fi {
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f17432j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17433k;

    /* renamed from: l, reason: collision with root package name */
    public int f17434l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f17435m;

    /* renamed from: n, reason: collision with root package name */
    public int f17436n;

    /* renamed from: o, reason: collision with root package name */
    public long f17437o;

    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f17434l);
        this.f17437o += iMin / this.f14117b.f16200d;
        this.f17434l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f17434l <= 0) {
            int i3 = i - iMin;
            int length = (this.f17436n + i3) - this.f17435m.length;
            ByteBuffer byteBufferI = i(length);
            int i6 = this.f17436n;
            String str = Vt.f12096a;
            int iMax = Math.max(0, Math.min(length, i6));
            byteBufferI.put(this.f17435m, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i3));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferI.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i7 = i3 - iMax2;
            int i8 = this.f17436n - iMax;
            this.f17436n = i8;
            byte[] bArr = this.f17435m;
            System.arraycopy(bArr, iMax, bArr, 0, i8);
            byteBuffer.get(this.f17435m, this.f17436n, i7);
            this.f17436n += i7;
            byteBufferI.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi, com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final ByteBuffer d() {
        int i;
        if (super.e() && (i = this.f17436n) > 0) {
            i(i).put(this.f17435m, 0, this.f17436n).flip();
            this.f17436n = 0;
        }
        return super.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi, com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final boolean e() {
        return super.e() && this.f17436n == 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi, com.google.android.gms.internal.ads.InterfaceC0812Xh
    public final long g(long j6) {
        return Math.max(0L, j6 - Vt.t(this.f14117b.f16197a, this.f17432j + this.i));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi
    public final C1703ph k(C1703ph c1703ph) throws C0625Mh {
        if (!Vt.a(c1703ph.f16199c)) {
            throw new C0625Mh("Unhandled input format:", c1703ph);
        }
        this.f17433k = true;
        return (this.i == 0 && this.f17432j == 0) ? C1703ph.f16196e : c1703ph;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi
    public final void l() {
        if (this.f17433k) {
            if (this.f17436n > 0) {
                this.f17437o += r0 / this.f14117b.f16200d;
            }
            this.f17436n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi
    public final void m() {
        if (this.f17433k) {
            this.f17433k = false;
            int i = this.f17432j;
            int i3 = this.f14117b.f16200d;
            this.f17435m = new byte[i * i3];
            this.f17434l = this.i * i3;
        }
        this.f17436n = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi
    public final void n() {
        this.f17435m = Vt.f12097b;
    }
}
