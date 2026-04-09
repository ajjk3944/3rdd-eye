package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes.dex */
public final class TK extends VK {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11367d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11368e;

    /* renamed from: f, reason: collision with root package name */
    public int f11369f;

    public TK(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(A.f.g(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f11367d = bArr;
        this.f11369f = 0;
        this.f11368e = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void M(int i, int i3) throws EK {
        b0((i << 3) | i3);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void N(int i, int i3) throws EK {
        b0(i << 3);
        a0(i3);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void O(int i, int i3) throws EK {
        b0(i << 3);
        b0(i3);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void P(int i, int i3) throws EK {
        b0((i << 3) | 5);
        c0(i3);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void Q(int i, long j6) throws EK {
        b0(i << 3);
        d0(j6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final int R() {
        return this.f11368e - this.f11369f;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void S(int i, long j6) throws EK {
        b0((i << 3) | 1);
        e0(j6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void T(int i, boolean z6) throws EK {
        b0(i << 3);
        Z(z6 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void U(int i, String str) throws EK {
        b0((i << 3) | 2);
        f0(str);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void V(int i, QK qk) throws EK {
        b0((i << 3) | 2);
        W(qk);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void W(QK qk) throws EK {
        b0(qk.f());
        qk.j(this);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void X(int i, byte[] bArr) throws EK {
        b0(i);
        g0(0, i, bArr);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void Y(FK fk) throws EK {
        b0(((AbstractC1096eL) fk).d(null));
        ((AbstractC1096eL) fk).v(this);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void Z(byte b5) throws EK {
        int i;
        int i3 = this.f11369f;
        try {
            i = i3 + 1;
        } catch (IndexOutOfBoundsException e6) {
            e = e6;
        }
        try {
            this.f11367d[i3] = b5;
            this.f11369f = i;
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
            i3 = i;
            throw new EK(i3, this.f11368e, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void a0(int i) throws EK {
        if (i >= 0) {
            b0(i);
        } else {
            d0(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void b0(int i) throws EK {
        int i3;
        int i6 = this.f11369f;
        while (true) {
            int i7 = i & (-128);
            byte[] bArr = this.f11367d;
            if (i7 == 0) {
                i3 = i6 + 1;
                bArr[i6] = (byte) i;
                this.f11369f = i3;
                return;
            } else {
                i3 = i6 + 1;
                try {
                    bArr[i6] = (byte) (i | 128);
                    i >>>= 7;
                    i6 = i3;
                } catch (IndexOutOfBoundsException e6) {
                    throw new EK(i3, this.f11368e, 1, e6);
                }
            }
            throw new EK(i3, this.f11368e, 1, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void c0(int i) throws EK {
        int i3 = this.f11369f;
        try {
            byte[] bArr = this.f11367d;
            bArr[i3] = (byte) i;
            bArr[i3 + 1] = (byte) (i >> 8);
            bArr[i3 + 2] = (byte) (i >> 16);
            bArr[i3 + 3] = (byte) (i >> 24);
            this.f11369f = i3 + 4;
        } catch (IndexOutOfBoundsException e6) {
            throw new EK(i3, this.f11368e, 4, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void d0(long j6) throws EK {
        int i;
        int i3 = this.f11369f;
        int i6 = this.f11368e;
        byte[] bArr = this.f11367d;
        if (!VK.f11982c || i6 - i3 < 10) {
            long j7 = j6;
            while ((j7 & (-128)) != 0) {
                int i7 = i3 + 1;
                try {
                    bArr[i3] = (byte) (((int) j7) | 128);
                    j7 >>>= 7;
                    i3 = i7;
                } catch (IndexOutOfBoundsException e6) {
                    e = e6;
                    i = i7;
                    throw new EK(i, i6, 1, e);
                }
            }
            i = i3 + 1;
            try {
                bArr[i3] = (byte) j7;
            } catch (IndexOutOfBoundsException e7) {
                e = e7;
                throw new EK(i, i6, 1, e);
            }
        } else {
            long j8 = j6;
            while ((j8 & (-128)) != 0) {
                WL.m(bArr, i3, (byte) (((int) j8) | 128));
                j8 >>>= 7;
                i3++;
            }
            i = i3 + 1;
            WL.m(bArr, i3, (byte) j8);
        }
        this.f11369f = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void e0(long j6) throws EK {
        int i = this.f11369f;
        try {
            byte[] bArr = this.f11367d;
            bArr[i] = (byte) j6;
            bArr[i + 1] = (byte) (j6 >> 8);
            bArr[i + 2] = (byte) (j6 >> 16);
            bArr[i + 3] = (byte) (j6 >> 24);
            bArr[i + 4] = (byte) (j6 >> 32);
            bArr[i + 5] = (byte) (j6 >> 40);
            bArr[i + 6] = (byte) (j6 >> 48);
            bArr[i + 7] = (byte) (j6 >> 56);
            this.f11369f = i + 8;
        } catch (IndexOutOfBoundsException e6) {
            throw new EK(i, this.f11368e, 8, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final void f0(String str) throws EK {
        int i = this.f11369f;
        try {
            int iJ = VK.J(str.length() * 3);
            int iJ2 = VK.J(str.length());
            int i3 = this.f11368e;
            byte[] bArr = this.f11367d;
            if (iJ2 != iJ) {
                b0(YL.b(str));
                int i6 = this.f11369f;
                this.f11369f = YL.c(str, bArr, i6, i3 - i6);
            } else {
                int i7 = i + iJ2;
                this.f11369f = i7;
                int iC = YL.c(str, bArr, i7, i3 - i7);
                this.f11369f = i;
                b0((iC - i) - iJ2);
                this.f11369f = iC;
            }
        } catch (IndexOutOfBoundsException e6) {
            throw new EK(e6);
        }
    }

    public final void g0(int i, int i3, byte[] bArr) throws EK {
        try {
            System.arraycopy(bArr, i, this.f11367d, this.f11369f, i3);
            this.f11369f += i3;
        } catch (IndexOutOfBoundsException e6) {
            throw new EK(this.f11369f, this.f11368e, i3, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1984ut
    public final void j(int i, int i3, byte[] bArr) throws EK {
        g0(i, i3, bArr);
    }
}
