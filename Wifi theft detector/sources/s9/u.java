package s9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes4.dex */
public abstract class u extends r {

    public static final class a implements kotlin.sequences.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f24376a;

        public a(CharSequence charSequence) {
            this.f24376a = charSequence;
        }

        @Override // kotlin.sequences.g
        public Iterator iterator() {
            return new f(this.f24376a);
        }
    }

    public static final List A0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        kotlin.jvm.internal.p.e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return B0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableI = SequencesKt___SequencesKt.i(q0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(z8.s.s(iterableI, 10));
        Iterator it = iterableI.iterator();
        while (it.hasNext()) {
            arrayList.add(I0(charSequence, (q9.c) it.next()));
        }
        return arrayList;
    }

    public static final List B0(CharSequence charSequence, String str, boolean z10, int i10) {
        y0(i10);
        int length = 0;
        int iX = X(charSequence, str, 0, z10);
        if (iX == -1 || i10 == 1) {
            return z8.q.e(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? q9.e.d(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iX).toString());
            length = str.length() + iX;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iX = X(charSequence, str, length, z10);
        } while (iX != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List C0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return z0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List D0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return A0(charSequence, strArr, z10, i10);
    }

    public static final boolean E0(CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        return charSequence.length() > 0 && b.d(charSequence.charAt(0), c10, z10);
    }

    public static final boolean F0(CharSequence charSequence, CharSequence prefix, boolean z10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        kotlin.jvm.internal.p.e(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? r.J((String) charSequence, (String) prefix, false, 2, null) : t0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean G0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return E0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean H0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return F0(charSequence, charSequence2, z10);
    }

    public static final String I0(CharSequence charSequence, q9.c range) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        kotlin.jvm.internal.p.e(range, "range");
        return charSequence.subSequence(range.j().intValue(), range.i().intValue() + 1).toString();
    }

    public static final String J0(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(missingDelimiterValue, "missingDelimiterValue");
        int iA0 = a0(str, c10, 0, false, 6, null);
        if (iA0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iA0 + 1, str.length());
        kotlin.jvm.internal.p.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String K0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(delimiter, "delimiter");
        kotlin.jvm.internal.p.e(missingDelimiterValue, "missingDelimiterValue");
        int iB0 = b0(str, delimiter, 0, false, 6, null);
        if (iB0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iB0 + delimiter.length(), str.length());
        kotlin.jvm.internal.p.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String L0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return J0(str, c10, str2);
    }

    public static final boolean M(CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        return a0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static /* synthetic */ String M0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return K0(str, str2, str3);
    }

    public static boolean N(CharSequence charSequence, CharSequence other, boolean z10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        kotlin.jvm.internal.p.e(other, "other");
        return other instanceof String ? b0(charSequence, (String) other, 0, z10, 2, null) >= 0 : Z(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    public static final String N0(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(missingDelimiterValue, "missingDelimiterValue");
        int iG0 = g0(str, c10, 0, false, 6, null);
        if (iG0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iG0 + 1, str.length());
        kotlin.jvm.internal.p.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return M(charSequence, c10, z10);
    }

    public static final String O0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(delimiter, "delimiter");
        kotlin.jvm.internal.p.e(missingDelimiterValue, "missingDelimiterValue");
        int iH0 = h0(str, delimiter, 0, false, 6, null);
        if (iH0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iH0 + delimiter.length(), str.length());
        kotlin.jvm.internal.p.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean P(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return N(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String P0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return N0(str, c10, str2);
    }

    public static final boolean Q(CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        return charSequence.length() > 0 && b.d(charSequence.charAt(V(charSequence)), c10, z10);
    }

    public static /* synthetic */ String Q0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return O0(str, str2, str3);
    }

    public static final boolean R(CharSequence charSequence, CharSequence suffix, boolean z10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        kotlin.jvm.internal.p.e(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? r.w((String) charSequence, (String) suffix, false, 2, null) : t0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    public static final String R0(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(missingDelimiterValue, "missingDelimiterValue");
        int iA0 = a0(str, c10, 0, false, 6, null);
        if (iA0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iA0);
        kotlin.jvm.internal.p.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean S(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Q(charSequence, c10, z10);
    }

    public static final String S0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(delimiter, "delimiter");
        kotlin.jvm.internal.p.e(missingDelimiterValue, "missingDelimiterValue");
        int iB0 = b0(str, delimiter, 0, false, 6, null);
        if (iB0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iB0);
        kotlin.jvm.internal.p.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean T(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return R(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String T0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return R0(str, c10, str2);
    }

    public static final Pair U(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) z8.z.V(collection);
            int iB0 = !z11 ? b0(charSequence, str, i10, false, 4, null) : h0(charSequence, str, i10, false, 4, null);
            if (iB0 < 0) {
                return null;
            }
            return y8.i.a(Integer.valueOf(iB0), str);
        }
        CharSequence charSequence3 = charSequence;
        q9.a cVar = !z11 ? new q9.c(q9.e.b(i10, 0), charSequence3.length()) : q9.e.h(q9.e.d(i10, V(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iC = cVar.c();
            int iD = cVar.d();
            int iE = cVar.e();
            if ((iE > 0 && iC <= iD) || (iE < 0 && iD <= iC)) {
                int i11 = iC;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z12 = z10;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z12 = z10;
                        if (r.z(str2, 0, (String) charSequence3, i11, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i11 == iD) {
                            break;
                        }
                        i11 += iE;
                        z10 = z12;
                    } else {
                        return y8.i.a(Integer.valueOf(i11), str3);
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int iC2 = cVar.c();
            int iD2 = cVar.d();
            int iE2 = cVar.e();
            if ((iE2 > 0 && iC2 <= iD2) || (iE2 < 0 && iD2 <= iC2)) {
                int i12 = iC2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z14 = z13;
                        charSequence2 = charSequence3;
                        z13 = z14;
                        if (t0(str4, 0, charSequence2, i12, str4.length(), z14)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i12 == iD2) {
                            break;
                        }
                        i12 += iE2;
                        charSequence3 = charSequence2;
                    } else {
                        return y8.i.a(Integer.valueOf(i12), str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String U0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return S0(str, str2, str3);
    }

    public static int V(CharSequence charSequence) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final String V0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(delimiter, "delimiter");
        kotlin.jvm.internal.p.e(missingDelimiterValue, "missingDelimiterValue");
        int iH0 = h0(str, delimiter, 0, false, 6, null);
        if (iH0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iH0);
        kotlin.jvm.internal.p.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int W(CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? c0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static /* synthetic */ String W0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return V0(str, str2, str3);
    }

    public static final int X(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        kotlin.jvm.internal.p.e(string, "string");
        return (z10 || !(charSequence instanceof String)) ? Z(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    public static CharSequence X0(CharSequence charSequence) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zC = kotlin.text.a.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final int Y(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        q9.a cVar = !z11 ? new q9.c(q9.e.b(i10, 0), q9.e.d(i11, charSequence.length())) : q9.e.h(q9.e.d(i10, V(charSequence)), q9.e.b(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iC = cVar.c();
            int iD = cVar.d();
            int iE = cVar.e();
            if ((iE <= 0 || iC > iD) && (iE >= 0 || iD > iC)) {
                return -1;
            }
            int i12 = iC;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (r.z(str, 0, (String) charSequence, i12, str.length(), z12)) {
                    return i12;
                }
                if (i12 == iD) {
                    return -1;
                }
                i12 += iE;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int iC2 = cVar.c();
            int iD2 = cVar.d();
            int iE2 = cVar.e();
            if ((iE2 <= 0 || iC2 > iD2) && (iE2 >= 0 || iD2 > iC2)) {
                return -1;
            }
            int i13 = iC2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (t0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                    return i13;
                }
                if (i13 == iD2) {
                    return -1;
                }
                i13 += iE2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static String Y0(String str, char... chars) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(chars, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zT = z8.o.t(chars, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zT) {
                    break;
                }
                length--;
            } else if (zT) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static /* synthetic */ int Z(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return Y(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ int a0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return W(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int b0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return X(charSequence, str, i10, z10);
    }

    public static final int c0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        kotlin.jvm.internal.p.e(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(z8.o.O(chars), i10);
        }
        int iB = q9.e.b(i10, 0);
        int iV = V(charSequence);
        if (iB > iV) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iB);
            for (char c10 : chars) {
                if (b.d(c10, cCharAt, z10)) {
                    return iB;
                }
            }
            if (iB == iV) {
                return -1;
            }
            iB++;
        }
    }

    public static boolean d0(CharSequence charSequence) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!kotlin.text.a.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final int e0(CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? i0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int f0(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        kotlin.jvm.internal.p.e(string, "string");
        return (z10 || !(charSequence instanceof String)) ? Y(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ int g0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = V(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return e0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int h0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = V(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return f0(charSequence, str, i10, z10);
    }

    public static final int i0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        kotlin.jvm.internal.p.e(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(z8.o.O(chars), i10);
        }
        for (int iD = q9.e.d(i10, V(charSequence)); -1 < iD; iD--) {
            char cCharAt = charSequence.charAt(iD);
            for (char c10 : chars) {
                if (b.d(c10, cCharAt, z10)) {
                    return iD;
                }
            }
        }
        return -1;
    }

    public static kotlin.sequences.g j0(CharSequence charSequence) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final List k0(CharSequence charSequence) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        return SequencesKt___SequencesKt.u(j0(charSequence));
    }

    public static final CharSequence l0(CharSequence charSequence, int i10, char c10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static String m0(String str, int i10, char c10) {
        kotlin.jvm.internal.p.e(str, "<this>");
        return l0(str, i10, c10).toString();
    }

    public static final kotlin.sequences.g n0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        y0(i11);
        return new d(charSequence, i10, i11, new l9.p() { // from class: s9.s
            @Override // l9.p
            public final Object invoke(Object obj, Object obj2) {
                return u.r0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    public static final kotlin.sequences.g o0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        y0(i11);
        final List listC = z8.m.c(strArr);
        return new d(charSequence, i10, i11, new l9.p() { // from class: s9.t
            @Override // l9.p
            public final Object invoke(Object obj, Object obj2) {
                return u.s0(listC, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    public static /* synthetic */ kotlin.sequences.g p0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return n0(charSequence, cArr, i10, z10, i11);
    }

    public static /* synthetic */ kotlin.sequences.g q0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return o0(charSequence, strArr, i10, z10, i11);
    }

    public static final Pair r0(char[] cArr, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        kotlin.jvm.internal.p.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iC0 = c0(DelimitedRangesSequence, cArr, i10, z10);
        if (iC0 < 0) {
            return null;
        }
        return y8.i.a(Integer.valueOf(iC0), 1);
    }

    public static final Pair s0(List list, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        kotlin.jvm.internal.p.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair pairU = U(DelimitedRangesSequence, list, i10, z10, false);
        if (pairU != null) {
            return y8.i.a(pairU.h(), Integer.valueOf(((String) pairU.i()).length()));
        }
        return null;
    }

    public static final boolean t0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        kotlin.jvm.internal.p.e(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!b.d(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String u0(String str, CharSequence prefix) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(prefix, "prefix");
        if (!H0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.p.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String v0(String str, CharSequence suffix) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(suffix, "suffix");
        if (!T(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        kotlin.jvm.internal.p.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String w0(String str, CharSequence delimiter) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(delimiter, "delimiter");
        return x0(str, delimiter, delimiter);
    }

    public static final String x0(String str, CharSequence prefix, CharSequence suffix) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(prefix, "prefix");
        kotlin.jvm.internal.p.e(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !H0(str, prefix, false, 2, null) || !T(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        kotlin.jvm.internal.p.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void y0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List z0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        kotlin.jvm.internal.p.e(charSequence, "<this>");
        kotlin.jvm.internal.p.e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return B0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableI = SequencesKt___SequencesKt.i(p0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(z8.s.s(iterableI, 10));
        Iterator it = iterableI.iterator();
        while (it.hasNext()) {
            arrayList.add(I0(charSequence, (q9.c) it.next()));
        }
        return arrayList;
    }
}
