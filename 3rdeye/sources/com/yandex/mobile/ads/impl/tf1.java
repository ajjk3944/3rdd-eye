package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class tf1 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f33573a;

    /* renamed from: b, reason: collision with root package name */
    private int f33574b;

    /* renamed from: c, reason: collision with root package name */
    private int f33575c;

    /* renamed from: d, reason: collision with root package name */
    private int f33576d;

    public tf1() {
        this.f33573a = s82.f32904f;
    }

    private void a() {
        int i = this.f33574b;
        if (i >= 0) {
            int i10 = this.f33576d;
            if (i < i10) {
                return;
            }
            if (i == i10 && this.f33575c == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final int b() {
        return ((this.f33576d - this.f33574b) * 8) - this.f33575c;
    }

    public final void c() {
        if (this.f33575c == 0) {
            return;
        }
        this.f33575c = 0;
        this.f33574b++;
        a();
    }

    public final int d() {
        if (this.f33575c == 0) {
            return this.f33574b;
        }
        throw new IllegalStateException();
    }

    public final int e() {
        return (this.f33574b * 8) + this.f33575c;
    }

    public final boolean f() {
        boolean z10 = (this.f33573a[this.f33574b] & (128 >> this.f33575c)) != 0;
        h();
        return z10;
    }

    public final long g() {
        int iB = b(4);
        int iB2 = b(32);
        int i = s82.f32899a;
        return ((iB & 4294967295L) << 32) | (iB2 & 4294967295L);
    }

    public final void h() {
        int i = this.f33575c + 1;
        this.f33575c = i;
        if (i == 8) {
            this.f33575c = 0;
            this.f33574b++;
        }
        a();
    }

    public final int b(int i) {
        int i10;
        if (i == 0) {
            return 0;
        }
        this.f33575c += i;
        int i11 = 0;
        while (true) {
            i10 = this.f33575c;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f33575c = i12;
            byte[] bArr = this.f33573a;
            int i13 = this.f33574b;
            this.f33574b = i13 + 1;
            i11 |= (bArr[i13] & 255) << i12;
        }
        byte[] bArr2 = this.f33573a;
        int i14 = this.f33574b;
        int i15 = ((-1) >>> (32 - i)) & (i11 | ((bArr2[i14] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.f33575c = 0;
            this.f33574b = i14 + 1;
        }
        a();
        return i15;
    }

    public final void e(int i) {
        if (this.f33575c != 0) {
            throw new IllegalStateException();
        }
        this.f33574b += i;
        a();
    }

    public tf1(int i, byte[] bArr) {
        this.f33573a = bArr;
        this.f33576d = i;
    }

    public final void a(int i) {
        int i10 = i & 16383;
        int iMin = Math.min(8 - this.f33575c, 14);
        int i11 = this.f33575c;
        int i12 = (8 - i11) - iMin;
        byte[] bArr = this.f33573a;
        int i13 = this.f33574b;
        byte b10 = (byte) (((65280 >> i11) | ((1 << i12) - 1)) & bArr[i13]);
        bArr[i13] = b10;
        int i14 = 14 - iMin;
        bArr[i13] = (byte) (b10 | ((i10 >>> i14) << i12));
        int i15 = i13 + 1;
        while (i14 > 8) {
            this.f33573a[i15] = (byte) (i10 >>> (i14 - 8));
            i14 -= 8;
            i15++;
        }
        int i16 = 8 - i14;
        byte[] bArr2 = this.f33573a;
        byte b11 = (byte) (bArr2[i15] & ((1 << i16) - 1));
        bArr2[i15] = b11;
        bArr2[i15] = (byte) (((i10 & ((1 << i14) - 1)) << i16) | b11);
        d(14);
        a();
    }

    public final void d(int i) {
        int i10 = i / 8;
        int i11 = this.f33574b + i10;
        this.f33574b = i11;
        int i12 = (i - (i10 * 8)) + this.f33575c;
        this.f33575c = i12;
        if (i12 > 7) {
            this.f33574b = i11 + 1;
            this.f33575c = i12 - 8;
        }
        a();
    }

    public final void c(int i) {
        int i10 = i / 8;
        this.f33574b = i10;
        this.f33575c = i - (i10 * 8);
        a();
    }

    public tf1(byte[] bArr) {
        this(bArr.length, bArr);
    }

    public final void b(byte[] bArr, int i) {
        if (this.f33575c == 0) {
            System.arraycopy(this.f33573a, this.f33574b, bArr, 0, i);
            this.f33574b += i;
            a();
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(byte[] bArr, int i) {
        int i10 = i >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = this.f33573a;
            int i12 = this.f33574b;
            int i13 = i12 + 1;
            this.f33574b = i13;
            byte b10 = bArr2[i12];
            int i14 = this.f33575c;
            byte b11 = (byte) (b10 << i14);
            bArr[i11] = b11;
            bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b11);
        }
        int i15 = i & 7;
        if (i15 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i10] & (KotlinVersion.MAX_COMPONENT_VALUE >> i15));
        bArr[i10] = b12;
        int i16 = this.f33575c;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f33573a;
            int i17 = this.f33574b;
            this.f33574b = i17 + 1;
            bArr[i10] = (byte) (b12 | ((bArr3[i17] & 255) << i16));
            this.f33575c = i16 - 8;
        }
        int i18 = this.f33575c + i15;
        this.f33575c = i18;
        byte[] bArr4 = this.f33573a;
        int i19 = this.f33574b;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
        if (i18 == 8) {
            this.f33575c = 0;
            this.f33574b = i19 + 1;
        }
        a();
    }

    public final String a(int i, Charset charset) {
        byte[] bArr = new byte[i];
        b(bArr, i);
        return new String(bArr, charset);
    }

    public final void a(int i, byte[] bArr) {
        this.f33573a = bArr;
        this.f33574b = 0;
        this.f33575c = 0;
        this.f33576d = i;
    }
}
