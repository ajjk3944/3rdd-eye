package vk;

import bl.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import u0.l2;

/* loaded from: classes3.dex */
public abstract class i extends p {
    public static boolean A0(String str, CharSequence charSequence) {
        return charSequence instanceof String ? p.p0((String) charSequence, str, false) : M0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final int B0(CharSequence charSequence) {
        nk.k.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int C0(CharSequence charSequence, String str, int i4, boolean z3) {
        nk.k.e(charSequence, "<this>");
        nk.k.e(str, "string");
        return (z3 || !(charSequence instanceof String)) ? D0(charSequence, str, i4, charSequence.length(), z3, false) : ((String) charSequence).indexOf(str, i4);
    }

    public static final int D0(CharSequence charSequence, CharSequence charSequence2, int i4, int i10, boolean z3, boolean z10) {
        sk.b bVar;
        CharSequence charSequence3 = charSequence2;
        int i11 = i4;
        int i12 = i10;
        if (z10) {
            int iB0 = B0(charSequence);
            if (i11 > iB0) {
                i11 = iB0;
            }
            if (i12 < 0) {
                i12 = 0;
            }
            bVar = new sk.b(i11, i12, -1);
        } else {
            if (i11 < 0) {
                i11 = 0;
            }
            int length = charSequence.length();
            if (i12 > length) {
                i12 = length;
            }
            bVar = new sk.d(i11, i12, 1);
        }
        boolean z11 = charSequence instanceof String;
        int i13 = bVar.f33819c;
        int i14 = bVar.f33818b;
        int i15 = bVar.f33817a;
        if (z11 && (charSequence3 instanceof String)) {
            if ((i13 > 0 && i15 <= i14) || (i13 < 0 && i14 <= i15)) {
                int i16 = i15;
                while (true) {
                    String str = (String) charSequence3;
                    if (!p.r0(z3, 0, str, i16, (String) charSequence, str.length())) {
                        if (i16 == i14) {
                            break;
                        }
                        i16 += i13;
                    } else {
                        return i16;
                    }
                }
            }
        } else if ((i13 > 0 && i15 <= i14) || (i13 < 0 && i14 <= i15)) {
            int i17 = i15;
            while (!M0(charSequence3, 0, charSequence, i17, charSequence3.length(), z3)) {
                if (i17 != i14) {
                    i17 += i13;
                    charSequence3 = charSequence2;
                }
            }
            return i17;
        }
        return -1;
    }

    public static int E0(CharSequence charSequence, char c9, int i4, int i10) {
        if ((i10 & 2) != 0) {
            i4 = 0;
        }
        nk.k.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? G0(charSequence, new char[]{c9}, i4, false) : ((String) charSequence).indexOf(c9, i4);
    }

    public static /* synthetic */ int F0(CharSequence charSequence, String str, int i4, boolean z3, int i10) {
        if ((i10 & 2) != 0) {
            i4 = 0;
        }
        if ((i10 & 4) != 0) {
            z3 = false;
        }
        return C0(charSequence, str, i4, z3);
    }

    public static final int G0(CharSequence charSequence, char[] cArr, int i4, boolean z3) {
        nk.k.e(charSequence, "<this>");
        if (!z3 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i4);
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int iB0 = B0(charSequence);
        if (i4 > iB0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i4);
            for (char c9 : cArr) {
                if (com.bumptech.glide.d.o(c9, cCharAt, z3)) {
                    return i4;
                }
            }
            if (i4 == iB0) {
                return -1;
            }
            i4++;
        }
    }

    public static boolean H0(CharSequence charSequence) {
        nk.k.e(charSequence, "<this>");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            if (!com.bumptech.glide.d.u(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static char I0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(B0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int J0(int i4, String str, String str2) {
        int iB0 = (i4 & 2) != 0 ? B0(str) : 0;
        nk.k.e(str, "<this>");
        nk.k.e(str2, "string");
        return str.lastIndexOf(str2, iB0);
    }

    public static int K0(String str, char c9, int i4, int i10) {
        if ((i10 & 2) != 0) {
            i4 = B0(str);
        }
        nk.k.e(str, "<this>");
        return str.lastIndexOf(c9, i4);
    }

    public static String L0(int i4, String str) {
        CharSequence charSequenceSubSequence;
        nk.k.e(str, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException(r5.c.h(i4, "Desired length ", " is less than zero."));
        }
        if (i4 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i4);
            int length = i4 - str.length();
            int i10 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean M0(CharSequence charSequence, int i4, CharSequence charSequence2, int i10, int i11, boolean z3) {
        nk.k.e(charSequence, "<this>");
        nk.k.e(charSequence2, "other");
        if (i10 < 0 || i4 < 0 || i4 > charSequence.length() - i11 || i10 > charSequence2.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!com.bumptech.glide.d.o(charSequence.charAt(i4 + i12), charSequence2.charAt(i10 + i12), z3)) {
                return false;
            }
        }
        return true;
    }

    public static String N0(String str, String str2) {
        nk.k.e(str, "<this>");
        nk.k.e(str2, "prefix");
        if (!S0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        nk.k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String O0(String str) {
        if (!A0("Client", str)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - 6);
        nk.k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final List P0(String str, CharSequence charSequence) {
        int iC0 = C0(charSequence, str, 0, false);
        if (iC0 == -1) {
            return cm.g.s(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iC0).toString());
            length = str.length() + iC0;
            iC0 = C0(charSequence, str, length, false);
        } while (iC0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List Q0(CharSequence charSequence, String[] strArr) {
        nk.k.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return P0(str, charSequence);
            }
        }
        uk.k kVar = new uk.k(new uk.e(charSequence, new z(13, zj.m.I(strArr))));
        ArrayList arrayList = new ArrayList(zj.o.T(kVar, 10));
        Iterator it = kVar.iterator();
        while (true) {
            l2 l2Var = (l2) it;
            if (!l2Var.hasNext()) {
                return arrayList;
            }
            sk.d dVar = (sk.d) l2Var.next();
            nk.k.e(dVar, "range");
            arrayList.add(charSequence.subSequence(dVar.f33817a, dVar.f33818b + 1).toString());
        }
    }

    public static List R0(String str, char[] cArr) {
        nk.k.e(str, "<this>");
        if (cArr.length == 1) {
            return P0(String.valueOf(cArr[0]), str);
        }
        uk.k kVar = new uk.k(new uk.e(str, new z(12, cArr)));
        ArrayList arrayList = new ArrayList(zj.o.T(kVar, 10));
        Iterator it = kVar.iterator();
        while (true) {
            l2 l2Var = (l2) it;
            if (!l2Var.hasNext()) {
                return arrayList;
            }
            sk.d dVar = (sk.d) l2Var.next();
            nk.k.e(dVar, "range");
            arrayList.add(str.subSequence(dVar.f33817a, dVar.f33818b + 1).toString());
        }
    }

    public static boolean S0(String str, CharSequence charSequence) {
        nk.k.e(str, "<this>");
        nk.k.e(charSequence, "prefix");
        return charSequence instanceof String ? p.w0(str, (String) charSequence, false) : M0(str, 0, charSequence, 0, charSequence.length(), false);
    }

    public static String T0(String str, String str2) {
        nk.k.e(str2, "delimiter");
        int iF0 = F0(str, str2, 0, false, 6);
        if (iF0 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iF0, str.length());
        nk.k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String U0(int i4, String str) {
        nk.k.e(str, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException(r5.c.h(i4, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i4 > length) {
            i4 = length;
        }
        String strSubstring = str.substring(0, i4);
        nk.k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence V0(String str) {
        nk.k.e(str, "<this>");
        int length = str.length() - 1;
        int i4 = 0;
        boolean z3 = false;
        while (i4 <= length) {
            boolean zU = com.bumptech.glide.d.u(str.charAt(!z3 ? i4 : length));
            if (z3) {
                if (!zU) {
                    break;
                }
                length--;
            } else if (zU) {
                i4++;
            } else {
                z3 = true;
            }
        }
        return str.subSequence(i4, length + 1);
    }

    public static boolean y0(CharSequence charSequence, CharSequence charSequence2, boolean z3) {
        nk.k.e(charSequence, "<this>");
        nk.k.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (F0(charSequence, (String) charSequence2, 0, z3, 2) >= 0) {
                return true;
            }
        } else if (D0(charSequence, charSequence2, 0, charSequence.length(), z3, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean z0(CharSequence charSequence, char c9) {
        nk.k.e(charSequence, "<this>");
        return E0(charSequence, c9, 0, 2) >= 0;
    }
}
