package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class sy0 extends ry0 {
    public static final int A(CharSequence charSequence, String str, int i, boolean z) {
        i30.m(charSequence, "<this>");
        i30.m(str, "string");
        return (z || !(charSequence instanceof String)) ? B(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int B(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        b30 b30Var;
        if (z2) {
            int iZ = z(charSequence);
            if (i > iZ) {
                i = iZ;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            b30Var = new b30(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            b30Var = new d30(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = b30Var.h;
        int i4 = b30Var.g;
        int i5 = b30Var.f;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                int i6 = i5;
                while (true) {
                    String str = (String) charSequence2;
                    boolean z4 = z;
                    if (!F(0, i6, str.length(), str, (String) charSequence, z4)) {
                        if (i6 == i4) {
                            break;
                        }
                        i6 += i3;
                        z = z4;
                    } else {
                        return i6;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!G(charSequence2, charSequence, i5, charSequence2.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static /* synthetic */ int C(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return A(charSequence, str, i, z);
    }

    public static int D(int i, String str, String str2) {
        int iZ = (i & 2) != 0 ? z(str) : 0;
        i30.m(str, "<this>");
        i30.m(str2, "string");
        return str.lastIndexOf(str2, iZ);
    }

    public static fo E(CharSequence charSequence, String[] strArr) {
        List listAsList = Arrays.asList(strArr);
        i30.l(listAsList, "asList(...)");
        return new fo(charSequence, new fa0(1, listAsList));
    }

    public static final boolean F(int i, int i2, int i3, String str, String str2, boolean z) {
        i30.m(str, "<this>");
        i30.m(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static final boolean G(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        char upperCase;
        char upperCase2;
        i30.m(charSequence, "<this>");
        i30.m(charSequence2, "other");
        if (i >= 0 && charSequence.length() - i2 >= 0 && i <= charSequence2.length() - i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char cCharAt = charSequence.charAt(i3);
                char cCharAt2 = charSequence2.charAt(i + i3);
                if (cCharAt == cCharAt2 || (z && ((upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(cCharAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static String H(String str, String str2, String str3) {
        i30.m(str, "<this>");
        int iA = A(str, str2, 0, false);
        if (iA < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iA);
            sb.append(str3);
            i2 = iA + length;
            if (iA >= str.length()) {
                break;
            }
            iA = A(str, str2, iA + i, false);
        } while (iA > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        i30.l(string, "toString(...)");
        return string;
    }

    public static List I(String str, String[] strArr) {
        i30.m(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                int iA = A(str, str2, 0, false);
                if (iA == -1) {
                    return zt0.o(str.toString());
                }
                ArrayList arrayList = new ArrayList(10);
                int length = 0;
                do {
                    arrayList.add(str.subSequence(length, iA).toString());
                    length = str2.length() + iA;
                    iA = A(str, str2, length, false);
                } while (iA != -1);
                arrayList.add(str.subSequence(length, str.length()).toString());
                return arrayList;
            }
        }
        ku0 ku0Var = new ku0(E(str, strArr));
        ArrayList arrayList2 = new ArrayList(ag.k0(ku0Var));
        Iterator it = ku0Var.iterator();
        while (true) {
            eo eoVar = (eo) it;
            if (!eoVar.hasNext()) {
                return arrayList2;
            }
            d30 d30Var = (d30) eoVar.next();
            i30.m(d30Var, "range");
            arrayList2.add(str.subSequence(d30Var.f, d30Var.g + 1).toString());
        }
    }

    public static CharSequence J(String str) {
        i30.m(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zG = a30.g(str.charAt(!z ? i : length));
            if (z) {
                if (!zG) {
                    break;
                }
                length--;
            } else if (zG) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static boolean y(String str, CharSequence charSequence, boolean z) {
        i30.m(str, "<this>");
        i30.m(charSequence, "other");
        if (charSequence instanceof String) {
            if (C(str, (String) charSequence, 0, z, 2) >= 0) {
                return true;
            }
        } else if (B(str, charSequence, 0, str.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static final int z(CharSequence charSequence) {
        i30.m(charSequence, "<this>");
        return charSequence.length() - 1;
    }
}
