package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.yC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2166yC {

    /* renamed from: d, reason: collision with root package name */
    public static final C2058wC f17691d = new C2058wC("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* renamed from: e, reason: collision with root package name */
    public static final C2058wC f17692e = new C2058wC("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* renamed from: f, reason: collision with root package name */
    public static final C2004vC f17693f;

    /* renamed from: a, reason: collision with root package name */
    public final C1950uC f17694a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f17695b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C2166yC f17696c;

    static {
        new C2166yC("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C2166yC("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f17693f = new C2004vC(new C1950uC("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public C2166yC(C1950uC c1950uC, Character ch) {
        this.f17694a = c1950uC;
        boolean z6 = true;
        if (ch != null) {
            byte[] bArr = c1950uC.f17074g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z6 = false;
            }
        }
        AbstractC0582Jp.b0(z6, "Padding character %s was already in alphabet", ch);
        this.f17695b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i3 = 0;
        AbstractC0582Jp.m0(0, i, bArr.length);
        while (i3 < i) {
            int i6 = this.f17694a.f17073f;
            d(sb, bArr, i3, Math.min(i6, i - i3));
            i3 += i6;
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) throws C2112xC {
        int i;
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        C1950uC c1950uC = this.f17694a;
        boolean z6 = c1950uC.f17075h[length % c1950uC.f17072e];
        int i3 = c1950uC.f17071d;
        if (!z6) {
            int length2 = charSequenceE.length();
            throw new C2112xC(A.f.i(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < charSequenceE.length()) {
            long jA = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                i = c1950uC.f17072e;
                if (i8 >= i) {
                    break;
                }
                jA <<= i3;
                if (i6 + i8 < charSequenceE.length()) {
                    jA |= c1950uC.a(charSequenceE.charAt(i9 + i6));
                    i9++;
                }
                i8++;
            }
            int i10 = c1950uC.f17073f;
            int i11 = i9 * i3;
            int i12 = (i10 - 1) * 8;
            while (i12 >= (i10 * 8) - i11) {
                bArr[i7] = (byte) ((jA >>> i12) & 255);
                i12 -= 8;
                i7++;
            }
            i6 += i;
        }
        return i7;
    }

    public C2166yC c(C1950uC c1950uC, Character ch) {
        return new C2166yC(c1950uC, ch);
    }

    public final void d(StringBuilder sb, byte[] bArr, int i, int i3) {
        AbstractC0582Jp.m0(i, i + i3, bArr.length);
        C1950uC c1950uC = this.f17694a;
        int i6 = c1950uC.f17073f;
        int i7 = 0;
        AbstractC0582Jp.m(i3 <= i6);
        long j6 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            j6 = (j6 | (bArr[i + i8] & 255)) << 8;
        }
        int i9 = (i3 + 1) * 8;
        int i10 = c1950uC.f17071d;
        while (i7 < i3 * 8) {
            sb.append(c1950uC.f17069b[c1950uC.f17070c & ((int) (j6 >>> ((i9 - i10) - i7)))]);
            i7 += i10;
        }
        if (this.f17695b != null) {
            while (i7 < i6 * 8) {
                sb.append('=');
                i7 += i10;
            }
        }
    }

    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f17695b == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2166yC) {
            C2166yC c2166yC = (C2166yC) obj;
            if (this.f17694a.equals(c2166yC.f17694a) && Objects.equals(this.f17695b, c2166yC.f17695b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final C2166yC f() {
        C1950uC c1950uC;
        boolean z6;
        C2166yC c2166yCC = this.f17696c;
        if (c2166yCC == null) {
            C1950uC c1950uC2 = this.f17694a;
            int i = 0;
            while (true) {
                char[] cArr = c1950uC2.f17069b;
                int length = cArr.length;
                if (i >= length) {
                    c1950uC = c1950uC2;
                    break;
                }
                if (AbstractC0582Jp.R(cArr[i])) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            z6 = false;
                            break;
                        }
                        char c6 = cArr[i3];
                        if (c6 >= 'a' && c6 <= 'z') {
                            z6 = true;
                            break;
                        }
                        i3++;
                    }
                    AbstractC0582Jp.i0("Cannot call lowerCase() on a mixed-case alphabet", !z6);
                    char[] cArr2 = new char[cArr.length];
                    for (int i6 = 0; i6 < cArr.length; i6++) {
                        char c7 = cArr[i6];
                        if (AbstractC0582Jp.R(c7)) {
                            c7 ^= 32;
                        }
                        cArr2[i6] = (char) c7;
                    }
                    c1950uC = new C1950uC(c1950uC2.f17068a.concat(".lowerCase()"), cArr2);
                    if (c1950uC2.i && !c1950uC.i) {
                        byte[] bArr = c1950uC.f17074g;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i7 = 65; i7 <= 90; i7++) {
                            int i8 = i7 | 32;
                            byte b5 = bArr[i7];
                            byte b6 = bArr[i8];
                            if (b5 == -1) {
                                bArrCopyOf[i7] = b6;
                            } else {
                                char c8 = (char) i7;
                                char c9 = (char) i8;
                                if (b6 != -1) {
                                    throw new IllegalStateException(Cr.E("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c8), Character.valueOf(c9)));
                                }
                                bArrCopyOf[i8] = b5;
                            }
                        }
                        c1950uC = new C1950uC(c1950uC.f17068a.concat(".ignoreCase()"), c1950uC.f17069b, bArrCopyOf, true);
                    }
                } else {
                    i++;
                }
            }
            c2166yCC = c1950uC == c1950uC2 ? this : c(c1950uC, this.f17695b);
            this.f17696c = c2166yCC;
        }
        return c2166yCC;
    }

    public final String g(int i, byte[] bArr) {
        AbstractC0582Jp.m0(0, i, bArr.length);
        C1950uC c1950uC = this.f17694a;
        int i3 = c1950uC.f17073f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(c1950uC.f17072e * AbstractC1984ut.q(i, i3));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }

    public final byte[] h(String str) {
        try {
            int length = (int) (((this.f17694a.f17071d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int iB = b(bArr, e(str));
            if (iB == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (C2112xC e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public final int hashCode() {
        return this.f17694a.hashCode() ^ Objects.hashCode(this.f17695b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C1950uC c1950uC = this.f17694a;
        sb.append(c1950uC);
        if (8 % c1950uC.f17071d != 0) {
            Character ch = this.f17695b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public C2166yC(String str, String str2) {
        this(new C1950uC(str, str2.toCharArray()), (Character) '=');
    }
}
