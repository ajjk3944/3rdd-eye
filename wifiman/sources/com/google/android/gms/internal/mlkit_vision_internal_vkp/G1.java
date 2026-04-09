package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
final class G1 extends I1 {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f35587d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35588e;

    /* renamed from: f, reason: collision with root package name */
    private int f35589f;

    G1(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f35587d = bArr;
        this.f35589f = 0;
        this.f35588e = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void A(int i10, String str) throws zzbdn {
        E((i10 << 3) | 2);
        B(str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void B(String str) throws zzbdn {
        int i10 = this.f35589f;
        try {
            int iF = I1.f(str.length() * 3);
            int iF2 = I1.f(str.length());
            if (iF2 != iF) {
                E(AbstractC4594h3.c(str));
                byte[] bArr = this.f35587d;
                int i11 = this.f35589f;
                this.f35589f = AbstractC4594h3.b(str, bArr, i11, this.f35588e - i11);
                return;
            }
            int i12 = i10 + iF2;
            this.f35589f = i12;
            int iB = AbstractC4594h3.b(str, this.f35587d, i12, this.f35588e - i12);
            this.f35589f = i10;
            E((iB - i10) - iF2);
            this.f35589f = iB;
        } catch (C4583g3 e10) {
            this.f35589f = i10;
            i(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzbdn(e11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void C(int i10, int i11) throws zzbdn {
        E((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void D(int i10, int i11) throws zzbdn {
        E(i10 << 3);
        E(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void E(int i10) throws zzbdn {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f35587d;
                int i11 = this.f35589f;
                this.f35589f = i11 + 1;
                bArr[i11] = (byte) ((i10 | 128) & 255);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzbdn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35589f), Integer.valueOf(this.f35588e), 1), e10);
            }
        }
        byte[] bArr2 = this.f35587d;
        int i12 = this.f35589f;
        this.f35589f = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void F(int i10, long j10) throws zzbdn {
        E(i10 << 3);
        G(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void G(long j10) throws zzbdn {
        if (!I1.f35600c || this.f35588e - this.f35589f < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f35587d;
                    int i10 = this.f35589f;
                    this.f35589f = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzbdn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35589f), Integer.valueOf(this.f35588e), 1), e10);
                }
            }
            byte[] bArr2 = this.f35587d;
            int i11 = this.f35589f;
            this.f35589f = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                byte[] bArr3 = this.f35587d;
                int i13 = this.f35589f;
                this.f35589f = i13 + 1;
                AbstractC4539c3.s(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.f35587d;
            int i14 = this.f35589f;
            this.f35589f = i14 + 1;
            AbstractC4539c3.s(bArr4, i14, (byte) ((i12 | 128) & 255));
            j10 >>>= 7;
        }
    }

    public final void H(byte[] bArr, int i10, int i11) throws zzbdn {
        try {
            System.arraycopy(bArr, i10, this.f35587d, this.f35589f, i11);
            this.f35589f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzbdn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35589f), Integer.valueOf(this.f35588e), Integer.valueOf(i11)), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1, com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4712s1
    public final void a(byte[] bArr, int i10, int i11) throws zzbdn {
        H(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void k(byte b10) throws zzbdn {
        try {
            byte[] bArr = this.f35587d;
            int i10 = this.f35589f;
            this.f35589f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzbdn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35589f), Integer.valueOf(this.f35588e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void l(int i10, boolean z10) throws zzbdn {
        E(i10 << 3);
        k(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void m(byte[] bArr, int i10, int i11) throws zzbdn {
        E(i11);
        H(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final int n() {
        return this.f35588e - this.f35589f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void o(int i10, B1 b12) throws zzbdn {
        E((i10 << 3) | 2);
        p(b12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void p(B1 b12) throws zzbdn {
        E(b12.m());
        b12.v(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void q(int i10, int i11) throws zzbdn {
        E((i10 << 3) | 5);
        r(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void r(int i10) throws zzbdn {
        try {
            byte[] bArr = this.f35587d;
            int i11 = this.f35589f;
            int i12 = i11 + 1;
            this.f35589f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f35589f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f35589f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f35589f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzbdn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35589f), Integer.valueOf(this.f35588e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void s(int i10, long j10) throws zzbdn {
        E((i10 << 3) | 1);
        t(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void t(long j10) throws zzbdn {
        try {
            byte[] bArr = this.f35587d;
            int i10 = this.f35589f;
            int i11 = i10 + 1;
            this.f35589f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.f35589f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f35589f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f35589f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f35589f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f35589f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f35589f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f35589f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzbdn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f35589f), Integer.valueOf(this.f35588e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void u(int i10, int i11) throws zzbdn {
        E(i10 << 3);
        v(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void v(int i10) throws zzbdn {
        if (i10 >= 0) {
            E(i10);
        } else {
            G(i10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    final void w(int i10, InterfaceC4790z2 interfaceC4790z2, J2 j22) throws zzbdn {
        E((i10 << 3) | 2);
        E(((AbstractC4614j1) interfaceC4790z2).a(j22));
        j22.a(interfaceC4790z2, this.f35601a);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void x(InterfaceC4790z2 interfaceC4790z2) throws zzbdn {
        E(interfaceC4790z2.b());
        interfaceC4790z2.d(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void y(int i10, InterfaceC4790z2 interfaceC4790z2) throws zzbdn {
        E(11);
        D(2, i10);
        E(26);
        x(interfaceC4790z2);
        E(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.I1
    public final void z(int i10, B1 b12) throws zzbdn {
        E(11);
        D(2, i10);
        o(3, b12);
        E(12);
    }
}
