package gm;

import hm.e;
import java.io.EOFException;
import nk.k;
import sl.f;
import vk.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f24775a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(int i4, int i10, int i11, String str, String str2) {
        int i12 = (i11 & 1) != 0 ? 0 : i4;
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        int i13 = i10;
        boolean z3 = (i11 & 8) == 0;
        boolean z10 = (i11 & 16) == 0;
        boolean z11 = (i11 & 32) == 0;
        boolean z12 = (i11 & 64) == 0;
        k.e(str, "<this>");
        return b(str, i12, i13, str2, z3, z10, z11, z12, 128);
    }

    public static String b(String str, int i4, int i10, String str2, boolean z3, boolean z10, boolean z11, boolean z12, int i11) throws EOFException {
        int i12 = (i11 & 1) != 0 ? 0 : i4;
        int length = (i11 & 2) != 0 ? str.length() : i10;
        boolean z13 = (i11 & 8) != 0 ? false : z3;
        boolean z14 = (i11 & 16) != 0 ? false : z10;
        boolean z15 = (i11 & 64) == 0 ? z12 : false;
        k.e(str, "<this>");
        int iCharCount = i12;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i13 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z15) || i.z0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z13 || (z14 && !c(str, iCharCount, length)))) || (iCodePointAt == 43 && z11)))) {
                e eVar = new e();
                eVar.O(i12, iCharCount, str);
                e eVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z13 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            eVar.T("+");
                        } else if (iCodePointAt2 == 43 && z11) {
                            eVar.T(z13 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i13 && !z15) || i.z0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z13 || (z14 && !c(str, iCharCount, length)))))) {
                            if (eVar2 == null) {
                                eVar2 = new e();
                            }
                            eVar2.U(iCodePointAt2);
                            while (!eVar2.exhausted()) {
                                byte b10 = eVar2.readByte();
                                eVar.E(37);
                                char[] cArr = f24775a;
                                eVar.E(cArr[((b10 & 255) >> 4) & 15]);
                                eVar.E(cArr[b10 & 15]);
                            }
                        } else {
                            eVar.U(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i13 = 128;
                }
                return eVar.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i12, length);
        k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean c(String str, int i4, int i10) {
        k.e(str, "<this>");
        int i11 = i4 + 2;
        return i11 < i10 && str.charAt(i4) == '%' && f.k(str.charAt(i4 + 1)) != -1 && f.k(str.charAt(i11)) != -1;
    }

    public static String d(int i4, int i10, int i11, String str) {
        int i12;
        if ((i11 & 1) != 0) {
            i4 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        boolean z3 = (i11 & 4) == 0;
        k.e(str, "<this>");
        int iCharCount = i4;
        while (iCharCount < i10) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z3)) {
                e eVar = new e();
                eVar.O(i4, iCharCount, str);
                while (iCharCount < i10) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i12 = iCharCount + 2) < i10) {
                        int iK = f.k(str.charAt(iCharCount + 1));
                        int iK2 = f.k(str.charAt(i12));
                        if (iK == -1 || iK2 == -1) {
                            eVar.U(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            eVar.E((iK << 4) + iK2);
                            iCharCount = Character.charCount(iCodePointAt) + i12;
                        }
                    } else if (iCodePointAt == 43 && z3) {
                        eVar.E(32);
                        iCharCount++;
                    } else {
                        eVar.U(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return eVar.readUtf8();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i4, i10);
        k.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
