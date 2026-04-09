package ou;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f19866a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final b f19867b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final b f19868c = new b();

    public static final l a(b bVar, String str) {
        l lVar = new l(str);
        l.f19926d.put(str, lVar);
        return lVar;
    }

    public static String b(String str, int i10, String str2, int i11, int i12) {
        int i13 = (i12 & 1) != 0 ? 0 : i10;
        int length = (i12 & 2) != 0 ? str.length() : i11;
        boolean z10 = (i12 & 8) == 0;
        boolean z11 = (i12 & 16) == 0;
        boolean z12 = (i12 & 32) == 0;
        boolean z13 = (i12 & 64) == 0;
        br.l.e(str, "<this>");
        int iCharCount = i13;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i14 = 128;
            int i15 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || tt.l.r0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z10 || (z11 && !d(str, iCharCount, length)))) || (iCodePointAt == 43 && z12)))) {
                cv.g gVar = new cv.g();
                gVar.v0(str, i13, iCharCount);
                cv.g gVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z10 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z12) {
                            gVar.u0(z10 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i15 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i14 && !z13) || tt.l.r0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z10 || (z11 && !d(str, iCharCount, length)))))) {
                            if (gVar2 == null) {
                                gVar2 = new cv.g();
                            }
                            gVar2.w0(iCodePointAt2);
                            while (!gVar2.i()) {
                                byte b2 = gVar2.readByte();
                                gVar.p0(37);
                                char[] cArr = t.j;
                                gVar.p0(cArr[((b2 & 255) >> 4) & 15]);
                                gVar.p0(cArr[b2 & 15]);
                            }
                        } else {
                            gVar.w0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i14 = 128;
                    i15 = 32;
                }
                return gVar.Y();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i13, length);
        br.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static boolean d(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && pu.b.q(str.charAt(i10 + 1)) != -1 && pu.b.q(str.charAt(i12)) != -1;
    }

    public static String e(String str, int i10, int i11, int i12) {
        int i13;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        boolean z10 = (i12 & 4) == 0;
        br.l.e(str, "<this>");
        int iCharCount = i10;
        while (iCharCount < i11) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                cv.g gVar = new cv.g();
                gVar.v0(str, i10, iCharCount);
                while (iCharCount < i11) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i13 = iCharCount + 2) < i11) {
                        int iQ = pu.b.q(str.charAt(iCharCount + 1));
                        int iQ2 = pu.b.q(str.charAt(i13));
                        if (iQ == -1 || iQ2 == -1) {
                            gVar.w0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            gVar.p0((iQ << 4) + iQ2);
                            iCharCount = Character.charCount(iCodePointAt) + i13;
                        }
                    } else if (iCodePointAt == 43 && z10) {
                        gVar.p0(32);
                        iCharCount++;
                    } else {
                        gVar.w0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return gVar.Y();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i10, i11);
        br.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iA0 = tt.l.A0(str, '&', i10, 4);
            if (iA0 == -1) {
                iA0 = str.length();
            }
            int iA02 = tt.l.A0(str, '=', i10, 4);
            if (iA02 == -1 || iA02 > iA0) {
                String strSubstring = str.substring(i10, iA0);
                br.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i10, iA02);
                br.l.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iA02 + 1, iA0);
                br.l.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i10 = iA0 + 1;
        }
        return arrayList;
    }

    public static void g(StringBuilder sb2, List list) {
        br.l.e(list, "<this>");
        hr.b bVarR = vc.e.R(vc.e.T(0, list.size()), 2);
        int i10 = bVarR.f10863a;
        int i11 = bVarR.f10864d;
        int i12 = bVarR.f10865g;
        if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i10);
            String str2 = (String) list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
            if (i10 == i11) {
                return;
            } else {
                i10 += i12;
            }
        }
    }

    public synchronized l c(String str) {
        l lVar;
        String strConcat;
        try {
            br.l.e(str, "javaName");
            LinkedHashMap linkedHashMap = l.f19926d;
            lVar = (l) linkedHashMap.get(str);
            if (lVar == null) {
                if (tt.s.n0(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    br.l.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (tt.s.n0(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    br.l.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                lVar = (l) linkedHashMap.get(strConcat);
                if (lVar == null) {
                    lVar = new l(str);
                }
                linkedHashMap.put(str, lVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return lVar;
    }
}
