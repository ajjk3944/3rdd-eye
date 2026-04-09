package kotlin.text;

import Zg.AbstractC3672d;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.C6513g;
import org.conscrypt.PSKKeyManager;
import sh.AbstractC7978m;

/* renamed from: kotlin.text.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6512f {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f52233a;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f52234b;

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f52235c;

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f52236d;

    static {
        int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f52233a = iArr;
        int[] iArr2 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        f52234b = iArr2;
        int[] iArr3 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f52235c = iArr3;
        long[] jArr = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f52236d = jArr;
    }

    private static final int a(long j10) {
        if (0 <= j10 && j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) Yg.E.h(Yg.E.b(j10))));
    }

    private static final void b(String str, int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if (i13 < 1) {
            o(str, i10, i11, "at least", 1);
        } else if (i13 > i12) {
            d(str, i10, (i13 + i10) - i12);
        }
    }

    private static final void c(String str, int i10, int i11, String str2, String str3, boolean z10, int i12) {
        if ((i11 - i10) - str2.length() <= str3.length()) {
            p(str, i10, i11, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i13 = 0; i13 < length; i13++) {
                if (!AbstractC6509c.f(str2.charAt(i13), str.charAt(i10 + i13), z10)) {
                    q(str, i10, i11, str2, "prefix");
                }
            }
            i10 += str2.length();
        }
        int length2 = i11 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i14 = 0; i14 < length3; i14++) {
                if (!AbstractC6509c.f(str3.charAt(i14), str.charAt(length2 + i14), z10)) {
                    q(str, length2, i11, str3, "suffix");
                }
            }
        }
        b(str, i10, length2, i12);
    }

    private static final void d(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i10 + ", but was '" + str.charAt(i10) + "'.\nThe result won't fit the type being parsed.");
            }
            i10++;
        }
    }

    private static final int e(byte[] bArr, int i10, String str, String str2, int[] iArr, char[] cArr, int i11) {
        return r(str2, cArr, f(bArr, i10, iArr, cArr, r(str, cArr, i11)));
    }

    private static final int f(byte[] bArr, int i10, int[] iArr, char[] cArr, int i11) {
        int i12 = iArr[bArr[i10] & 255];
        cArr[i11] = (char) (i12 >> 8);
        cArr[i11 + 1] = (char) (i12 & 255);
        return i11 + 2;
    }

    private static final int g(int i10, int i11, int i12, int i13) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j10 = i11;
        return a((i10 * (((i12 + 2) + i13) + j10)) - j10);
    }

    public static final int h(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i17 = (i10 - 1) / i11;
        int i18 = (i11 - 1) / i12;
        int i19 = i10 % i11;
        if (i19 != 0) {
            i11 = i19;
        }
        return a(i17 + (((i18 * i17) + ((i11 - 1) / i12)) * i13) + (((r0 - i17) - r2) * i14) + (i10 * (i15 + 2 + i16)));
    }

    public static final int[] i() {
        return f52233a;
    }

    public static final long j(String str, int i10, int i11, C6513g format) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(format, "format");
        return l(str, i10, i11, format, 16);
    }

    public static /* synthetic */ long k(String str, int i10, int i11, C6513g c6513g, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            c6513g = C6513g.f52237d.a();
        }
        return j(str, i10, i11, c6513g);
    }

    private static final long l(String str, int i10, int i11, C6513g c6513g, int i12) {
        AbstractC3672d.f25361a.a(i10, i11, str.length());
        C6513g.c cVarC = c6513g.c();
        if (cVarC.f()) {
            b(str, i10, i11, i12);
            return m(str, i10, i11);
        }
        String strD = cVarC.d();
        String strE = cVarC.e();
        c(str, i10, i11, strD, strE, cVarC.c(), i12);
        return m(str, i10 + strD.length(), i11 - strE.length());
    }

    private static final long m(String str, int i10, int i11) {
        long j10 = 0;
        while (i10 < i11) {
            long j11 = j10 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') == 0) {
                long j12 = f52236d[cCharAt];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                    i10++;
                }
            }
            n(str, i10);
            throw new KotlinNothingValueException();
        }
        return j10;
    }

    private static final Void n(String str, int i10) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i10 + ", but was " + str.charAt(i10));
    }

    private static final void o(String str, int i10, int i11, String str2, int i12) {
        AbstractC6492s.g(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        AbstractC6492s.h(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i12 + " hexadecimal digits at index " + i10 + ", but was \"" + strSubstring + "\" of length " + (i11 - i10));
    }

    private static final void p(String str, int i10, int i11, String str2, String str3) {
        AbstractC6492s.g(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        AbstractC6492s.h(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    private static final void q(String str, int i10, int i11, String str2, String str3) {
        int iG = AbstractC7978m.g(str2.length() + i10, i11);
        AbstractC6492s.g(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, iG);
        AbstractC6492s.h(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i10 + ", but was " + strSubstring);
    }

    private static final int r(String str, char[] cArr, int i10) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                AbstractC6492s.g(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i10);
            } else {
                cArr[i10] = str.charAt(0);
            }
        }
        return i10 + str.length();
    }

    public static final String s(byte[] bArr, int i10, int i11, C6513g format) {
        AbstractC6492s.i(bArr, "<this>");
        AbstractC6492s.i(format, "format");
        AbstractC3672d.f25361a.a(i10, i11, bArr.length);
        if (i10 == i11) {
            return "";
        }
        int[] iArr = format.d() ? f52234b : f52233a;
        C6513g.a aVarB = format.b();
        return aVarB.i() ? v(bArr, i10, i11, aVarB, iArr) : y(bArr, i10, i11, aVarB, iArr);
    }

    public static final String t(byte[] bArr, C6513g format) {
        AbstractC6492s.i(bArr, "<this>");
        AbstractC6492s.i(format, "format");
        return s(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String u(byte[] bArr, C6513g c6513g, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c6513g = C6513g.f52237d.a();
        }
        return t(bArr, c6513g);
    }

    private static final String v(byte[] bArr, int i10, int i11, C6513g.a aVar, int[] iArr) {
        return aVar.j() ? x(bArr, i10, i11, aVar, iArr) : w(bArr, i10, i11, aVar, iArr);
    }

    private static final String w(byte[] bArr, int i10, int i11, C6513g.a aVar, int[] iArr) {
        String strC = aVar.c();
        String strE = aVar.e();
        String strD = aVar.d();
        char[] cArr = new char[g(i11 - i10, strD.length(), strC.length(), strE.length())];
        int iE = e(bArr, i10, strC, strE, iArr, cArr, 0);
        while (true) {
            i10++;
            if (i10 >= i11) {
                return t.v(cArr);
            }
            iE = e(bArr, i10, strC, strE, iArr, cArr, r(strD, cArr, iE));
        }
    }

    private static final String x(byte[] bArr, int i10, int i11, C6513g.a aVar, int[] iArr) {
        int length = aVar.d().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 - i10;
        int iF = 0;
        if (length == 0) {
            char[] cArr = new char[a(i12 * 2)];
            while (i10 < i11) {
                iF = f(bArr, i10, iArr, cArr, iF);
                i10++;
            }
            return t.v(cArr);
        }
        char[] cArr2 = new char[a((i12 * 3) - 1)];
        char cCharAt = aVar.d().charAt(0);
        int iF2 = f(bArr, i10, iArr, cArr2, 0);
        for (int i13 = i10 + 1; i13 < i11; i13++) {
            cArr2[iF2] = cCharAt;
            iF2 = f(bArr, i13, iArr, cArr2, iF2 + 1);
        }
        return t.v(cArr2);
    }

    private static final String y(byte[] bArr, int i10, int i11, C6513g.a aVar, int[] iArr) {
        int i12;
        int i13;
        int iG = aVar.g();
        int iF = aVar.f();
        String strC = aVar.c();
        String strE = aVar.e();
        String strD = aVar.d();
        String strH = aVar.h();
        int iH = h(i11 - i10, iG, iF, strH.length(), strD.length(), strC.length(), strE.length());
        char[] cArr = new char[iH];
        int iR = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = i10; i16 < i11; i16++) {
            if (i14 == iG) {
                cArr[iR] = '\n';
                iR++;
                i12 = 0;
                i13 = 0;
            } else if (i15 == iF) {
                iR = r(strH, cArr, iR);
                i12 = i14;
                i13 = 0;
            } else {
                i12 = i14;
                i13 = i15;
            }
            if (i13 != 0) {
                iR = r(strD, cArr, iR);
            }
            iR = e(bArr, i16, strC, strE, iArr, cArr, iR);
            i15 = i13 + 1;
            i14 = i12 + 1;
        }
        if (iR == iH) {
            return t.v(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }
}
