package S9;

import X0.o;
import com.google.android.gms.ads.AdRequest;
import g0.C4356c;
import java.util.Arrays;

/* compiled from: JvmJsonStreams.kt */
/* loaded from: classes3.dex */
public final class D implements L {

    /* renamed from: a, reason: collision with root package name */
    public final o.b f12012a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f12013b = C1577i.f12087c.f(AdRequest.MAX_CONTENT_URL_LENGTH);

    /* renamed from: c, reason: collision with root package name */
    public char[] f12014c = C1579k.f12090c.b(128);

    /* renamed from: d, reason: collision with root package name */
    public int f12015d;

    public D(o.b bVar) {
        this.f12012a = bVar;
    }

    @Override // S9.L
    public final void a(char c10) {
        byte[] bArr = this.f12013b;
        if (c10 < 128) {
            if (bArr.length - this.f12015d < 1) {
                f();
            }
            int i = this.f12015d;
            this.f12015d = i + 1;
            bArr[i] = (byte) c10;
            return;
        }
        if (c10 < 2048) {
            if (bArr.length - this.f12015d < 2) {
                f();
            }
            int i10 = this.f12015d;
            int i11 = i10 + 1;
            this.f12015d = i11;
            bArr[i10] = (byte) ((c10 >> 6) | 192);
            this.f12015d = i10 + 2;
            bArr[i11] = (byte) ((c10 & '?') | 128);
            return;
        }
        if (55296 <= c10 && c10 < 57344) {
            if (bArr.length - this.f12015d < 1) {
                f();
            }
            int i12 = this.f12015d;
            this.f12015d = i12 + 1;
            bArr[i12] = (byte) 63;
            return;
        }
        if (c10 < 0) {
            if (bArr.length - this.f12015d < 3) {
                f();
            }
            int i13 = this.f12015d;
            int i14 = i13 + 1;
            this.f12015d = i14;
            bArr[i13] = (byte) ((c10 >> '\f') | 224);
            int i15 = i13 + 2;
            this.f12015d = i15;
            bArr[i14] = (byte) (((c10 >> 6) & 63) | 128);
            this.f12015d = i13 + 3;
            bArr[i15] = (byte) ((c10 & '?') | 128);
            return;
        }
        if (c10 > 65535) {
            throw new w(C4356c.h(c10, "Unexpected code point: "));
        }
        if (bArr.length - this.f12015d < 4) {
            f();
        }
        int i16 = this.f12015d;
        int i17 = i16 + 1;
        this.f12015d = i17;
        bArr[i16] = (byte) ((c10 >> 18) | 240);
        int i18 = i16 + 2;
        this.f12015d = i18;
        bArr[i17] = (byte) (((c10 >> '\f') & 63) | 128);
        int i19 = i16 + 3;
        this.f12015d = i19;
        bArr[i18] = (byte) (((c10 >> 6) & 63) | 128);
        this.f12015d = i16 + 4;
        bArr[i19] = (byte) ((c10 & '?') | 128);
    }

    @Override // S9.L
    public final void b(String text) {
        byte b10;
        kotlin.jvm.internal.l.f(text, "text");
        e(0, text.length() + 2);
        char[] cArr = this.f12014c;
        cArr[0] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, 1);
        int i = length + 1;
        int length2 = 1;
        while (length2 < i) {
            char c10 = cArr[length2];
            byte[] bArr = S.f12065b;
            if (c10 < bArr.length && bArr[c10] != 0) {
                int length3 = text.length();
                for (int i10 = length2 - 1; i10 < length3; i10++) {
                    e(length2, 2);
                    char cCharAt = text.charAt(i10);
                    byte[] bArr2 = S.f12065b;
                    if (cCharAt >= bArr2.length || (b10 = bArr2[cCharAt]) == 0) {
                        int i11 = length2 + 1;
                        this.f12014c[length2] = cCharAt;
                        length2 = i11;
                    } else {
                        if (b10 == 1) {
                            String str = S.f12064a[cCharAt];
                            kotlin.jvm.internal.l.c(str);
                            e(length2, str.length());
                            str.getChars(0, str.length(), this.f12014c, length2);
                            length2 = str.length() + length2;
                        } else {
                            char[] cArr2 = this.f12014c;
                            cArr2[length2] = '\\';
                            cArr2[length2 + 1] = (char) b10;
                            length2 += 2;
                        }
                    }
                }
                e(length2, 1);
                char[] cArr3 = this.f12014c;
                cArr3[length2] = '\"';
                g(cArr3, length2 + 1);
                f();
                return;
            }
            length2++;
        }
        cArr[i] = '\"';
        g(cArr, length + 2);
        f();
    }

    @Override // S9.L
    public final void c(long j4) {
        d(String.valueOf(j4));
    }

    @Override // S9.L
    public final void d(String text) {
        kotlin.jvm.internal.l.f(text, "text");
        int length = text.length();
        e(0, length);
        text.getChars(0, length, this.f12014c, 0);
        g(this.f12014c, length);
    }

    public final void e(int i, int i10) {
        int i11 = i10 + i;
        char[] cArr = this.f12014c;
        if (cArr.length <= i11) {
            int i12 = i * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i11);
            kotlin.jvm.internal.l.e(cArrCopyOf, "copyOf(this, newSize)");
            this.f12014c = cArrCopyOf;
        }
    }

    public final void f() {
        this.f12012a.write(this.f12013b, 0, this.f12015d);
        this.f12015d = 0;
    }

    public final void g(char[] cArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        if (i > cArr.length) {
            StringBuilder sbJ = C4356c.j(i, "count > string.length: ", " > ");
            sbJ.append(cArr.length);
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        int i10 = 0;
        while (i10 < i) {
            char c10 = cArr[i10];
            byte[] bArr = this.f12013b;
            if (c10 < 128) {
                if (bArr.length - this.f12015d < 1) {
                    f();
                }
                int i11 = this.f12015d;
                int i12 = i11 + 1;
                this.f12015d = i12;
                bArr[i11] = (byte) c10;
                i10++;
                int iMin = Math.min(i, (bArr.length - i12) + i10);
                while (i10 < iMin) {
                    char c11 = cArr[i10];
                    if (c11 < 128) {
                        int i13 = this.f12015d;
                        this.f12015d = i13 + 1;
                        bArr[i13] = (byte) c11;
                        i10++;
                    }
                }
            } else {
                if (c10 < 2048) {
                    if (bArr.length - this.f12015d < 2) {
                        f();
                    }
                    int i14 = this.f12015d;
                    int i15 = i14 + 1;
                    this.f12015d = i15;
                    bArr[i14] = (byte) ((c10 >> 6) | 192);
                    this.f12015d = i14 + 2;
                    bArr[i15] = (byte) ((c10 & '?') | 128);
                } else if (c10 < 55296 || c10 > 57343) {
                    if (bArr.length - this.f12015d < 3) {
                        f();
                    }
                    int i16 = this.f12015d;
                    int i17 = i16 + 1;
                    this.f12015d = i17;
                    bArr[i16] = (byte) ((c10 >> '\f') | 224);
                    int i18 = i16 + 2;
                    this.f12015d = i18;
                    bArr[i17] = (byte) (((c10 >> 6) & 63) | 128);
                    this.f12015d = i16 + 3;
                    bArr[i18] = (byte) ((c10 & '?') | 128);
                } else {
                    int i19 = i10 + 1;
                    char c12 = i19 < i ? cArr[i19] : (char) 0;
                    if (c10 > 56319 || 56320 > c12 || c12 >= 57344) {
                        if (bArr.length - this.f12015d < 1) {
                            f();
                        }
                        int i20 = this.f12015d;
                        this.f12015d = i20 + 1;
                        bArr[i20] = (byte) 63;
                        i10 = i19;
                    } else {
                        int i21 = (((c10 & 1023) << 10) | (c12 & 1023)) + 65536;
                        if (bArr.length - this.f12015d < 4) {
                            f();
                        }
                        int i22 = this.f12015d;
                        int i23 = i22 + 1;
                        this.f12015d = i23;
                        bArr[i22] = (byte) ((i21 >> 18) | 240);
                        int i24 = i22 + 2;
                        this.f12015d = i24;
                        bArr[i23] = (byte) (((i21 >> 12) & 63) | 128);
                        int i25 = i22 + 3;
                        this.f12015d = i25;
                        bArr[i24] = (byte) (((i21 >> 6) & 63) | 128);
                        this.f12015d = i22 + 4;
                        bArr[i25] = (byte) ((i21 & 63) | 128);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }
}
