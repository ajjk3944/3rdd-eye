package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class jo3 {
    public static final ho3 d = new ho3("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public static final ho3 e = new ho3("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    public static final go3 f;
    public final fo3 a;
    public final Character b;
    public volatile jo3 c;

    static {
        new jo3("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new jo3("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f = new go3(new fo3("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public jo3(fo3 fo3Var, Character ch) {
        this.a = fo3Var;
        boolean z = true;
        if (ch != null) {
            byte[] bArr = fo3Var.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z = false;
            }
        }
        zt0.X(z, "Padding character %s was already in alphabet", ch);
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zt0.g0(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.a.f;
            d(sb, bArr, i2, Math.min(i3, i - i2));
            i2 += i3;
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) throws io3 {
        int i;
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        fo3 fo3Var = this.a;
        boolean z = fo3Var.h[length % fo3Var.e];
        int i2 = fo3Var.d;
        if (!z) {
            int length2 = charSequenceE.length();
            throw new io3(ex0.j(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < charSequenceE.length()) {
            long jA = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = fo3Var.e;
                if (i5 >= i) {
                    break;
                }
                jA <<= i2;
                if (i3 + i5 < charSequenceE.length()) {
                    jA |= fo3Var.a(charSequenceE.charAt(i6 + i3));
                    i6++;
                }
                i5++;
            }
            int i7 = fo3Var.f;
            int i8 = i6 * i2;
            int i9 = (i7 - 1) * 8;
            while (i9 >= (i7 * 8) - i8) {
                bArr[i4] = (byte) ((jA >>> i9) & 255);
                i9 -= 8;
                i4++;
            }
            i3 += i;
        }
        return i4;
    }

    public jo3 c(fo3 fo3Var, Character ch) {
        return new jo3(fo3Var, ch);
    }

    public final void d(StringBuilder sb, byte[] bArr, int i, int i2) {
        zt0.g0(i, i + i2, bArr.length);
        fo3 fo3Var = this.a;
        int i3 = fo3Var.f;
        int i4 = 0;
        zt0.D(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = fo3Var.d;
        while (i4 < i2 * 8) {
            sb.append(fo3Var.b[fo3Var.c & ((int) (j >>> ((i6 - i7) - i4)))]);
            i4 += i7;
        }
        if (this.b != null) {
            while (i4 < i3 * 8) {
                sb.append('=');
                i4 += i7;
            }
        }
    }

    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        if (this.b == null) {
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
        if (obj instanceof jo3) {
            jo3 jo3Var = (jo3) obj;
            if (this.a.equals(jo3Var.a) && Objects.equals(this.b, jo3Var.b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    public final jo3 f() {
        fo3 fo3Var;
        boolean z;
        jo3 jo3VarC = this.c;
        if (jo3VarC == null) {
            fo3 fo3Var2 = this.a;
            int i = 0;
            while (true) {
                char[] cArr = fo3Var2.b;
                int length = cArr.length;
                if (i >= length) {
                    fo3Var = fo3Var2;
                    break;
                }
                if (um.K(cArr[i])) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = false;
                            break;
                        }
                        char c = cArr[i2];
                        if (c >= 'a' && c <= 'z') {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    zt0.c0("Cannot call lowerCase() on a mixed-case alphabet", !z);
                    char[] cArr2 = new char[cArr.length];
                    for (int i3 = 0; i3 < cArr.length; i3++) {
                        char c2 = cArr[i3];
                        if (um.K(c2)) {
                            c2 ^= 32;
                        }
                        cArr2[i3] = (char) c2;
                    }
                    fo3Var = new fo3(fo3Var2.a.concat(".lowerCase()"), cArr2);
                    if (fo3Var2.i && !fo3Var.i) {
                        byte[] bArr = fo3Var.g;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i4 = 65; i4 <= 90; i4++) {
                            int i5 = i4 | 32;
                            byte b = bArr[i4];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                bArrCopyOf[i4] = b2;
                            } else {
                                char c3 = (char) i4;
                                char c4 = (char) i5;
                                if (b2 != -1) {
                                    throw new IllegalStateException(qb1.J("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c3), Character.valueOf(c4)));
                                }
                                bArrCopyOf[i5] = b;
                            }
                        }
                        fo3Var = new fo3(fo3Var.a.concat(".ignoreCase()"), fo3Var.b, bArrCopyOf, true);
                    }
                } else {
                    i++;
                }
            }
            jo3VarC = fo3Var == fo3Var2 ? this : c(fo3Var, this.b);
            this.c = jo3VarC;
        }
        return jo3VarC;
    }

    public final String g(int i, byte[] bArr) {
        zt0.g0(0, i, bArr.length);
        fo3 fo3Var = this.a;
        int i2 = fo3Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(fo3Var.e * a30.r(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] h(String str) {
        try {
            int length = (int) (((this.a.d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int iB = b(bArr, e(str));
            if (iB == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (io3 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Objects.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        fo3 fo3Var = this.a;
        sb.append(fo3Var);
        if (8 % fo3Var.d != 0) {
            Character ch = this.b;
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

    public jo3(String str, String str2) {
        this(new fo3(str, str2.toCharArray()), (Character) '=');
    }
}
