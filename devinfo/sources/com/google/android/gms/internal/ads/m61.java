package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class m61 {

    /* renamed from: d, reason: collision with root package name */
    public static final k61 f13777d = new k61("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* renamed from: e, reason: collision with root package name */
    public static final k61 f13778e = new k61("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* renamed from: f, reason: collision with root package name */
    public static final j61 f13779f;

    /* renamed from: a, reason: collision with root package name */
    public final i61 f13780a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f13781b;

    /* renamed from: c, reason: collision with root package name */
    public volatile m61 f13782c;

    static {
        new m61("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new m61("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f13779f = new j61(new i61("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public m61(i61 i61Var, Character ch2) {
        this.f13780a = i61Var;
        boolean z3 = true;
        if (ch2 != null) {
            byte[] bArr = i61Var.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z3 = false;
            }
        }
        mq0.Z(z3, "Padding character %s was already in alphabet", ch2);
        this.f13781b = ch2;
    }

    public void a(StringBuilder sb2, byte[] bArr, int i4) {
        int i10 = 0;
        mq0.h0(0, i4, bArr.length);
        while (i10 < i4) {
            int i11 = this.f13780a.f12155f;
            d(sb2, bArr, i10, Math.min(i11, i4 - i10));
            i10 += i11;
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) throws l61 {
        int i4;
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        i61 i61Var = this.f13780a;
        boolean z3 = i61Var.f12156h[length % i61Var.f12154e];
        int i10 = i61Var.f12153d;
        if (!z3) {
            int length2 = charSequenceE.length();
            throw new l61(d.h.q(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequenceE.length()) {
            long jA = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i4 = i61Var.f12154e;
                if (i13 >= i4) {
                    break;
                }
                jA <<= i10;
                if (i11 + i13 < charSequenceE.length()) {
                    jA |= i61Var.a(charSequenceE.charAt(i14 + i11));
                    i14++;
                }
                i13++;
            }
            int i15 = i61Var.f12155f;
            int i16 = i14 * i10;
            int i17 = (i15 - 1) * 8;
            while (i17 >= (i15 * 8) - i16) {
                bArr[i12] = (byte) ((jA >>> i17) & 255);
                i17 -= 8;
                i12++;
            }
            i11 += i4;
        }
        return i12;
    }

    public m61 c(i61 i61Var, Character ch2) {
        return new m61(i61Var, ch2);
    }

    public final void d(StringBuilder sb2, byte[] bArr, int i4, int i10) {
        mq0.h0(i4, i4 + i10, bArr.length);
        i61 i61Var = this.f13780a;
        int i11 = i61Var.f12155f;
        int i12 = 0;
        mq0.m(i10 <= i11);
        long j = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            j = (j | (bArr[i4 + i13] & 255)) << 8;
        }
        int i14 = (i10 + 1) * 8;
        int i15 = i61Var.f12153d;
        while (i12 < i10 * 8) {
            sb2.append(i61Var.f12151b[i61Var.f12152c & ((int) (j >>> ((i14 - i15) - i12)))]);
            i12 += i15;
        }
        if (this.f13781b != null) {
            while (i12 < i11 * 8) {
                sb2.append('=');
                i12 += i15;
            }
        }
    }

    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f13781b == null) {
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
        if (obj instanceof m61) {
            m61 m61Var = (m61) obj;
            if (this.f13780a.equals(m61Var.f13780a) && Objects.equals(this.f13781b, m61Var.f13781b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final m61 f() {
        i61 i61Var;
        boolean z3;
        m61 m61VarC = this.f13782c;
        if (m61VarC == null) {
            i61 i61Var2 = this.f13780a;
            int i4 = 0;
            while (true) {
                char[] cArr = i61Var2.f12151b;
                int length = cArr.length;
                if (i4 >= length) {
                    i61Var = i61Var2;
                    break;
                }
                if (mq0.Q(cArr[i4])) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            z3 = false;
                            break;
                        }
                        char c9 = cArr[i10];
                        if (c9 >= 'a' && c9 <= 'z') {
                            z3 = true;
                            break;
                        }
                        i10++;
                    }
                    mq0.d0("Cannot call lowerCase() on a mixed-case alphabet", !z3);
                    char[] cArr2 = new char[cArr.length];
                    for (int i11 = 0; i11 < cArr.length; i11++) {
                        char c10 = cArr[i11];
                        if (mq0.Q(c10)) {
                            c10 ^= 32;
                        }
                        cArr2[i11] = (char) c10;
                    }
                    i61Var = new i61(i61Var2.f12150a.concat(".lowerCase()"), cArr2);
                    if (i61Var2.f12157i && !i61Var.f12157i) {
                        byte[] bArr = i61Var.g;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i12 = 65; i12 <= 90; i12++) {
                            int i13 = i12 | 32;
                            byte b10 = bArr[i12];
                            byte b11 = bArr[i13];
                            if (b10 == -1) {
                                bArrCopyOf[i12] = b11;
                            } else {
                                char c11 = (char) i12;
                                char c12 = (char) i13;
                                if (b11 != -1) {
                                    throw new IllegalStateException(al0.H("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                                }
                                bArrCopyOf[i13] = b10;
                            }
                        }
                        i61Var = new i61(i61Var.f12150a.concat(".ignoreCase()"), i61Var.f12151b, bArrCopyOf, true);
                    }
                } else {
                    i4++;
                }
            }
            m61VarC = i61Var == i61Var2 ? this : c(i61Var, this.f13781b);
            this.f13782c = m61VarC;
        }
        return m61VarC;
    }

    public final String g(int i4, byte[] bArr) {
        mq0.h0(0, i4, bArr.length);
        i61 i61Var = this.f13780a;
        int i10 = i61Var.f12155f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(i61Var.f12154e * yo0.q(i4, i10));
        try {
            a(sb2, bArr, i4);
            return sb2.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] h(String str) {
        try {
            int length = (int) (((this.f13780a.f12153d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int iB = b(bArr, e(str));
            if (iB == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (l61 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final int hashCode() {
        return this.f13780a.hashCode() ^ Objects.hashCode(this.f13781b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        i61 i61Var = this.f13780a;
        sb2.append(i61Var);
        if (8 % i61Var.f12153d != 0) {
            Character ch2 = this.f13781b;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public m61(String str, String str2) {
        this(new i61(str, str2.toCharArray()), (Character) '=');
    }
}
