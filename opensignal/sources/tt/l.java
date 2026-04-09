package tt;

import au.v;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class l extends s {
    public static int A0(CharSequence charSequence, char c4, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        br.l.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? C0(charSequence, new char[]{c4}, i10, false) : ((String) charSequence).indexOf(c4, i10);
    }

    public static /* synthetic */ int B0(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return y0(charSequence, str, i10, z10);
    }

    public static final int C0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        br.l.e(charSequence, "<this>");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(mq.l.w0(cArr), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iX0 = x0(charSequence);
        if (i10 > iX0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i10);
            for (char c4 : cArr) {
                if (b4.z(c4, cCharAt, z10)) {
                    return i10;
                }
            }
            if (i10 == iX0) {
                return -1;
            }
            i10++;
        }
    }

    public static boolean D0(CharSequence charSequence) {
        br.l.e(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!b4.L(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static char E0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(x0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int F0(CharSequence charSequence, char c4, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = x0(charSequence);
        }
        br.l.e(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c4, i10);
        }
        char[] cArr = {c4};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(mq.l.w0(cArr), i10);
        }
        int iX0 = x0(charSequence);
        if (i10 > iX0) {
            i10 = iX0;
        }
        while (-1 < i10) {
            if (b4.z(cArr[0], charSequence.charAt(i10), false)) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    public static int G0(String str, int i10, String str2) {
        int iX0 = (i10 & 2) != 0 ? x0(str) : 0;
        br.l.e(str, "<this>");
        br.l.e(str2, "string");
        return str.lastIndexOf(str2, iX0);
    }

    public static String H0(int i10, String str) {
        CharSequence charSequenceSubSequence;
        br.l.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(h0.b.m("Desired length ", i10, " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            int length = i10 - str.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean I0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        br.l.e(charSequence, "<this>");
        br.l.e(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!b4.z(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String J0(String str, String str2) {
        br.l.e(str, "<this>");
        if (!P0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        br.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String K0(String str, String str2) {
        if (!v0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        br.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void L0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(h0.b.h(i10, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List M0(int i10, CharSequence charSequence, String str) {
        L0(i10);
        int iY0 = y0(charSequence, str, 0, false);
        if (iY0 == -1 || i10 == 1) {
            return e5.H(charSequence.toString());
        }
        boolean z10 = i10 > 0;
        int i11 = 10;
        if (z10 && i10 <= 10) {
            i11 = i10;
        }
        ArrayList arrayList = new ArrayList(i11);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iY0).toString());
            length = str.length() + iY0;
            if (z10 && arrayList.size() == i10 - 1) {
                break;
            }
            iY0 = y0(charSequence, str, length, false);
        } while (iY0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List N0(CharSequence charSequence, String[] strArr, int i10) {
        int i11 = (i10 & 4) != 0 ? 0 : 2;
        br.l.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return M0(i11, charSequence, str);
            }
        }
        L0(i11);
        c<hr.d> cVar = new c(charSequence, i11, new v(5, mq.l.X(strArr)));
        ArrayList arrayList = new ArrayList(mq.p.a0(new iu.g(3, cVar), 10));
        for (hr.d dVar : cVar) {
            br.l.e(dVar, "range");
            arrayList.add(charSequence.subSequence(dVar.f10863a, dVar.f10864d + 1).toString());
        }
        return arrayList;
    }

    public static List O0(String str, char[] cArr) {
        br.l.e(str, "<this>");
        if (cArr.length == 1) {
            return M0(0, str, String.valueOf(cArr[0]));
        }
        L0(0);
        c<hr.d> cVar = new c(str, 0, new v(4, cArr));
        ArrayList arrayList = new ArrayList(mq.p.a0(new iu.g(3, cVar), 10));
        for (hr.d dVar : cVar) {
            br.l.e(dVar, "range");
            arrayList.add(str.subSequence(dVar.f10863a, dVar.f10864d + 1).toString());
        }
        return arrayList;
    }

    public static boolean P0(CharSequence charSequence, String str) {
        br.l.e(charSequence, "<this>");
        return charSequence instanceof String ? s.n0((String) charSequence, str, false) : I0(charSequence, 0, str, 0, str.length(), false);
    }

    public static boolean Q0(String str, char c4) {
        return str.length() > 0 && b4.z(str.charAt(0), c4, false);
    }

    public static String R0(char c4, String str, String str2) {
        int iA0 = A0(str, c4, 0, 6);
        if (iA0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iA0 + 1, str.length());
        br.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String S0(String str, String str2, String str3) {
        br.l.e(str2, "delimiter");
        int iB0 = B0(str, str2, 0, false, 6);
        if (iB0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iB0, str.length());
        br.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String T0(char c4, String str, String str2) {
        br.l.e(str, "<this>");
        br.l.e(str2, "missingDelimiterValue");
        int iF0 = F0(str, c4, 0, 6);
        if (iF0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iF0 + 1, str.length());
        br.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String U0(String str, char c4) {
        br.l.e(str, "<this>");
        br.l.e(str, "missingDelimiterValue");
        int iA0 = A0(str, c4, 0, 6);
        if (iA0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iA0);
        br.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String V0(String str, String str2) {
        br.l.e(str, "<this>");
        br.l.e(str, "missingDelimiterValue");
        int iB0 = B0(str, str2, 0, false, 6);
        if (iB0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iB0);
        br.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String W0(String str, String str2) {
        br.l.e(str, "<this>");
        int iG0 = G0(str, 6, ".");
        if (iG0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iG0);
        br.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String X0(String str, char c4) {
        br.l.e(str, "<this>");
        br.l.e(str, "missingDelimiterValue");
        int iF0 = F0(str, c4, 0, 6);
        if (iF0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iF0);
        br.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Y0(int i10, String str) {
        br.l.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(h0.b.m("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(0, i10);
        br.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Z0(String str) {
        int length = str.length();
        String strSubstring = str.substring(length - (2 > length ? length : 2));
        br.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence a1(String str) {
        br.l.e(str, "<this>");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zL = b4.L(str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zL) {
                    break;
                }
                length--;
            } else if (zL) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1);
    }

    public static boolean q0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        br.l.e(charSequence, "<this>");
        br.l.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (B0(charSequence, (String) charSequence2, 0, z10, 2) >= 0) {
                return true;
            }
        } else if (z0(charSequence, charSequence2, 0, charSequence.length(), z10, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean r0(CharSequence charSequence, char c4) {
        br.l.e(charSequence, "<this>");
        return A0(charSequence, c4, 0, 2) >= 0;
    }

    public static String t0(int i10, String str) {
        br.l.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(h0.b.m("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(i10);
        br.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String u0(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException(h0.b.m("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = str.length() - i10;
        if (length < 0) {
            length = 0;
        }
        return Y0(length, str);
    }

    public static boolean v0(CharSequence charSequence, String str) {
        br.l.e(charSequence, "<this>");
        return charSequence instanceof String ? s.f0((String) charSequence, str, false) : I0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean w0(String str, char c4) {
        br.l.e(str, "<this>");
        return str.length() > 0 && b4.z(str.charAt(x0(str)), c4, false);
    }

    public static int x0(CharSequence charSequence) {
        br.l.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int y0(CharSequence charSequence, String str, int i10, boolean z10) {
        br.l.e(charSequence, "<this>");
        br.l.e(str, "string");
        return (z10 || !(charSequence instanceof String)) ? z0(charSequence, str, i10, charSequence.length(), z10, false) : ((String) charSequence).indexOf(str, i10);
    }

    public static final int z0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        hr.b bVar;
        if (z11) {
            int iX0 = x0(charSequence);
            if (i10 > iX0) {
                i10 = iX0;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            bVar = new hr.b(i10, i11, -1);
        } else {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            bVar = new hr.d(i10, i11, 1);
        }
        boolean z12 = charSequence instanceof String;
        int i12 = bVar.f10865g;
        int i13 = bVar.f10864d;
        int i14 = bVar.f10863a;
        if (!z12 || !(charSequence2 instanceof String)) {
            boolean z13 = z10;
            if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z14 = z13;
                    z13 = z14;
                    if (!I0(charSequence4, 0, charSequence3, i14, charSequence2.length(), z14)) {
                        if (i14 == i13) {
                            break;
                        }
                        i14 += i12;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i14;
                    }
                }
            }
        } else if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
            int i15 = i14;
            while (true) {
                String str = (String) charSequence2;
                boolean z15 = z10;
                if (!s.i0(0, i15, str.length(), str, (String) charSequence, z15)) {
                    if (i15 == i13) {
                        break;
                    }
                    i15 += i12;
                    z10 = z15;
                } else {
                    return i15;
                }
            }
        }
        return -1;
    }
}
