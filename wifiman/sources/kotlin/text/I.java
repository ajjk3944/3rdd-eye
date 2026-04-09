package kotlin.text;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import sh.AbstractC7978m;
import sh.C7972g;
import sh.C7974i;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class I extends E {

    public static final class a implements InterfaceC8780j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f52213a;

        public a(CharSequence charSequence) {
            this.f52213a = charSequence;
        }

        @Override // zi.InterfaceC8780j
        public Iterator iterator() {
            return new C6515i(this.f52213a);
        }
    }

    private static final InterfaceC8780j A0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        L0(i11);
        final List listE = AbstractC3682n.e(strArr);
        return new C6511e(charSequence, i10, i11, new InterfaceC6839p() { // from class: kotlin.text.G
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return I.E0(listE, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    static /* synthetic */ InterfaceC8780j B0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return z0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ InterfaceC8780j C0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return A0(charSequence, strArr, i10, z10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.s D0(char[] cArr, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        AbstractC6492s.i(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iL0 = l0(DelimitedRangesSequence, cArr, i10, z10);
        if (iL0 < 0) {
            return null;
        }
        return Yg.z.a(Integer.valueOf(iL0), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.s E0(List list, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        AbstractC6492s.i(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Yg.s sVarC0 = c0(DelimitedRangesSequence, list, i10, z10, false);
        if (sVarC0 != null) {
            return Yg.z.a(sVarC0.h(), Integer.valueOf(((String) sVarC0.j()).length()));
        }
        return null;
    }

    public static final boolean F0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        AbstractC6492s.i(charSequence, "<this>");
        AbstractC6492s.i(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!AbstractC6509c.f(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String G0(String str, CharSequence prefix) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(prefix, "prefix");
        if (!X0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        AbstractC6492s.h(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String H0(String str, CharSequence suffix) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(suffix, "suffix");
        if (!t.b0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        AbstractC6492s.h(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String I0(String str, CharSequence delimiter) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(delimiter, "delimiter");
        return J0(str, delimiter, delimiter);
    }

    public static final String J0(String str, CharSequence prefix, CharSequence suffix) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !X0(str, prefix, false, 2, null) || !t.b0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        AbstractC6492s.h(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence K0(CharSequence charSequence, int i10, int i11, CharSequence replacement) {
        AbstractC6492s.i(charSequence, "<this>");
        AbstractC6492s.i(replacement, "replacement");
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            AbstractC6492s.h(sb2, "append(...)");
            sb2.append(replacement);
            sb2.append(charSequence, i11, charSequence.length());
            AbstractC6492s.h(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    public static final void L0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List M0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        AbstractC6492s.i(charSequence, "<this>");
        AbstractC6492s.i(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return O0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableW = AbstractC8783m.w(B0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(iterableW, 10));
        Iterator it = iterableW.iterator();
        while (it.hasNext()) {
            arrayList.add(Y0(charSequence, (C7974i) it.next()));
        }
        return arrayList;
    }

    public static final List N0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        AbstractC6492s.i(charSequence, "<this>");
        AbstractC6492s.i(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return O0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableW = AbstractC8783m.w(C0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(iterableW, 10));
        Iterator it = iterableW.iterator();
        while (it.hasNext()) {
            arrayList.add(Y0(charSequence, (C7974i) it.next()));
        }
        return arrayList;
    }

    private static final List O0(CharSequence charSequence, String str, boolean z10, int i10) {
        L0(i10);
        int length = 0;
        int iG0 = g0(charSequence, str, 0, z10);
        if (iG0 == -1 || i10 == 1) {
            return AbstractC3689v.e(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? AbstractC7978m.g(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iG0).toString());
            length = str.length() + iG0;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iG0 = g0(charSequence, str, length, z10);
        } while (iG0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List P0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return M0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List Q0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return N0(charSequence, strArr, z10, i10);
    }

    public static final InterfaceC8780j R0(final CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        AbstractC6492s.i(charSequence, "<this>");
        AbstractC6492s.i(delimiters, "delimiters");
        return AbstractC8783m.N(C0(charSequence, delimiters, 0, z10, i10, 2, null), new InterfaceC6835l() { // from class: kotlin.text.H
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.T0(charSequence, (C7974i) obj);
            }
        });
    }

    public static /* synthetic */ InterfaceC8780j S0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return R0(charSequence, strArr, z10, i10);
    }

    public static final boolean T(CharSequence charSequence, char c10, boolean z10) {
        AbstractC6492s.i(charSequence, "<this>");
        return t.j0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String T0(CharSequence charSequence, C7974i it) {
        AbstractC6492s.i(it, "it");
        return Y0(charSequence, it);
    }

    public static boolean U(CharSequence charSequence, CharSequence other, boolean z10) {
        AbstractC6492s.i(charSequence, "<this>");
        AbstractC6492s.i(other, "other");
        if (other instanceof String) {
            if (t.k0(charSequence, (String) other, 0, z10, 2, null) < 0) {
                return false;
            }
        } else if (i0(charSequence, other, 0, charSequence.length(), z10, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static final boolean U0(CharSequence charSequence, char c10, boolean z10) {
        AbstractC6492s.i(charSequence, "<this>");
        return charSequence.length() > 0 && AbstractC6509c.f(charSequence.charAt(0), c10, z10);
    }

    public static /* synthetic */ boolean V(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return T(charSequence, c10, z10);
    }

    public static final boolean V0(CharSequence charSequence, CharSequence prefix, boolean z10) {
        AbstractC6492s.i(charSequence, "<this>");
        AbstractC6492s.i(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? t.P((String) charSequence, (String) prefix, false, 2, null) : F0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean W(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t.U(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ boolean W0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return U0(charSequence, c10, z10);
    }

    public static final boolean X(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return AbstractC6492s.d(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean X0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return V0(charSequence, charSequence2, z10);
    }

    public static final boolean Y(CharSequence charSequence, char c10, boolean z10) {
        AbstractC6492s.i(charSequence, "<this>");
        return charSequence.length() > 0 && AbstractC6509c.f(charSequence.charAt(t.e0(charSequence)), c10, z10);
    }

    public static final String Y0(CharSequence charSequence, C7974i range) {
        AbstractC6492s.i(charSequence, "<this>");
        AbstractC6492s.i(range, "range");
        return charSequence.subSequence(range.e().intValue(), range.g().intValue() + 1).toString();
    }

    public static final boolean Z(CharSequence charSequence, CharSequence suffix, boolean z10) {
        AbstractC6492s.i(charSequence, "<this>");
        AbstractC6492s.i(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? t.B((String) charSequence, (String) suffix, false, 2, null) : F0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    public static String Z0(String str, C7974i range) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(range, "range");
        String strSubstring = str.substring(range.e().intValue(), range.g().intValue() + 1);
        AbstractC6492s.h(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean a0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Y(charSequence, c10, z10);
    }

    public static String a1(String str, char c10, String missingDelimiterValue) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(missingDelimiterValue, "missingDelimiterValue");
        int iJ0 = t.j0(str, c10, 0, false, 6, null);
        if (iJ0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iJ0 + 1, str.length());
        AbstractC6492s.h(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean b0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Z(charSequence, charSequence2, z10);
    }

    public static String b1(String str, String delimiter, String missingDelimiterValue) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(delimiter, "delimiter");
        AbstractC6492s.i(missingDelimiterValue, "missingDelimiterValue");
        int iK0 = t.k0(str, delimiter, 0, false, 6, null);
        if (iK0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iK0 + delimiter.length(), str.length());
        AbstractC6492s.h(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final Yg.s c0(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        Object next;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) AbstractC3689v.Q0(collection);
            int iK0 = !z11 ? t.k0(charSequence, str, i10, false, 4, null) : t.q0(charSequence, str, i10, false, 4, null);
            if (iK0 < 0) {
                return null;
            }
            return Yg.z.a(Integer.valueOf(iK0), str);
        }
        C7972g c7974i = !z11 ? new C7974i(AbstractC7978m.d(i10, 0), charSequence.length()) : AbstractC7978m.p(AbstractC7978m.g(i10, t.e0(charSequence)), 0);
        if (charSequence instanceof String) {
            int i11 = c7974i.i();
            int iJ = c7974i.j();
            int iK = c7974i.k();
            if ((iK > 0 && i11 <= iJ) || (iK < 0 && iJ <= i11)) {
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        if (t.F(str2, 0, (String) charSequence, i11, str2.length(), z10)) {
                            break;
                        }
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i11 == iJ) {
                            break;
                        }
                        i11 += iK;
                    } else {
                        return Yg.z.a(Integer.valueOf(i11), str3);
                    }
                }
            }
        } else {
            int i12 = c7974i.i();
            int iJ2 = c7974i.j();
            int iK2 = c7974i.k();
            if ((iK2 > 0 && i12 <= iJ2) || (iK2 < 0 && iJ2 <= i12)) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        if (F0(str4, 0, charSequence, i12, str4.length(), z10)) {
                            break;
                        }
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i12 == iJ2) {
                            break;
                        }
                        i12 += iK2;
                    } else {
                        return Yg.z.a(Integer.valueOf(i12), str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String c1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return t.a1(str, c10, str2);
    }

    public static C7974i d0(CharSequence charSequence) {
        AbstractC6492s.i(charSequence, "<this>");
        return new C7974i(0, charSequence.length() - 1);
    }

    public static /* synthetic */ String d1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return t.b1(str, str2, str3);
    }

    public static int e0(CharSequence charSequence) {
        AbstractC6492s.i(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static String e1(String str, char c10, String missingDelimiterValue) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(missingDelimiterValue, "missingDelimiterValue");
        int iP0 = t.p0(str, c10, 0, false, 6, null);
        if (iP0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iP0 + 1, str.length());
        AbstractC6492s.h(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int f0(CharSequence charSequence, char c10, int i10, boolean z10) {
        AbstractC6492s.i(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? l0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static final String f1(String str, String delimiter, String missingDelimiterValue) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(delimiter, "delimiter");
        AbstractC6492s.i(missingDelimiterValue, "missingDelimiterValue");
        int iQ0 = t.q0(str, delimiter, 0, false, 6, null);
        if (iQ0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iQ0 + delimiter.length(), str.length());
        AbstractC6492s.h(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int g0(CharSequence charSequence, String string, int i10, boolean z10) {
        AbstractC6492s.i(charSequence, "<this>");
        AbstractC6492s.i(string, "string");
        return (z10 || !(charSequence instanceof String)) ? i0(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    public static /* synthetic */ String g1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return t.e1(str, c10, str2);
    }

    private static final int h0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        C7972g c7974i = !z11 ? new C7974i(AbstractC7978m.d(i10, 0), AbstractC7978m.g(i11, charSequence.length())) : AbstractC7978m.p(AbstractC7978m.g(i10, t.e0(charSequence)), AbstractC7978m.d(i11, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i12 = c7974i.i();
            int iJ = c7974i.j();
            int iK = c7974i.k();
            if ((iK <= 0 || i12 > iJ) && (iK >= 0 || iJ > i12)) {
                return -1;
            }
            while (!F0(charSequence2, 0, charSequence, i12, charSequence2.length(), z10)) {
                if (i12 == iJ) {
                    return -1;
                }
                i12 += iK;
            }
            return i12;
        }
        int i13 = c7974i.i();
        int iJ2 = c7974i.j();
        int iK2 = c7974i.k();
        if ((iK2 <= 0 || i13 > iJ2) && (iK2 >= 0 || iJ2 > i13)) {
            return -1;
        }
        while (true) {
            String str = (String) charSequence2;
            if (t.F(str, 0, (String) charSequence, i13, str.length(), z10)) {
                return i13;
            }
            if (i13 == iJ2) {
                return -1;
            }
            i13 += iK2;
        }
    }

    public static /* synthetic */ String h1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return f1(str, str2, str3);
    }

    static /* synthetic */ int i0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return h0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static final String i1(String str, char c10, String missingDelimiterValue) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(missingDelimiterValue, "missingDelimiterValue");
        int iJ0 = t.j0(str, c10, 0, false, 6, null);
        if (iJ0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iJ0);
        AbstractC6492s.h(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int j0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return f0(charSequence, c10, i10, z10);
    }

    public static final String j1(String str, String delimiter, String missingDelimiterValue) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(delimiter, "delimiter");
        AbstractC6492s.i(missingDelimiterValue, "missingDelimiterValue");
        int iK0 = t.k0(str, delimiter, 0, false, 6, null);
        if (iK0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iK0);
        AbstractC6492s.h(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int k0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return g0(charSequence, str, i10, z10);
    }

    public static /* synthetic */ String k1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return i1(str, c10, str2);
    }

    public static final int l0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        AbstractC6492s.i(charSequence, "<this>");
        AbstractC6492s.i(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC3682n.P0(chars), i10);
        }
        int iD = AbstractC7978m.d(i10, 0);
        int iE0 = t.e0(charSequence);
        if (iD > iE0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iD);
            for (char c10 : chars) {
                if (AbstractC6509c.f(c10, cCharAt, z10)) {
                    return iD;
                }
            }
            if (iD == iE0) {
                return -1;
            }
            iD++;
        }
    }

    public static /* synthetic */ String l1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return j1(str, str2, str3);
    }

    public static boolean m0(CharSequence charSequence) {
        AbstractC6492s.i(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!AbstractC6507a.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final String m1(String str, char c10, String missingDelimiterValue) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(missingDelimiterValue, "missingDelimiterValue");
        int iP0 = t.p0(str, c10, 0, false, 6, null);
        if (iP0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iP0);
        AbstractC6492s.h(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int n0(CharSequence charSequence, char c10, int i10, boolean z10) {
        AbstractC6492s.i(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? r0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static String n1(String str, String delimiter, String missingDelimiterValue) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(delimiter, "delimiter");
        AbstractC6492s.i(missingDelimiterValue, "missingDelimiterValue");
        int iQ0 = t.q0(str, delimiter, 0, false, 6, null);
        if (iQ0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iQ0);
        AbstractC6492s.h(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int o0(CharSequence charSequence, String string, int i10, boolean z10) {
        AbstractC6492s.i(charSequence, "<this>");
        AbstractC6492s.i(string, "string");
        return (z10 || !(charSequence instanceof String)) ? h0(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ String o1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m1(str, c10, str2);
    }

    public static /* synthetic */ int p0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = t.e0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return n0(charSequence, c10, i10, z10);
    }

    public static Boolean p1(String str) {
        AbstractC6492s.i(str, "<this>");
        if (AbstractC6492s.d(str, "true")) {
            return Boolean.TRUE;
        }
        if (AbstractC6492s.d(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int q0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = t.e0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return o0(charSequence, str, i10, z10);
    }

    public static CharSequence q1(CharSequence charSequence) {
        AbstractC6492s.i(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zC = AbstractC6507a.c(charSequence.charAt(!z10 ? i10 : length));
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

    public static final int r0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        AbstractC6492s.i(charSequence, "<this>");
        AbstractC6492s.i(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC3682n.P0(chars), i10);
        }
        for (int iG = AbstractC7978m.g(i10, t.e0(charSequence)); -1 < iG; iG--) {
            char cCharAt = charSequence.charAt(iG);
            for (char c10 : chars) {
                if (AbstractC6509c.f(c10, cCharAt, z10)) {
                    return iG;
                }
            }
        }
        return -1;
    }

    public static final InterfaceC8780j s0(CharSequence charSequence) {
        AbstractC6492s.i(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final List t0(CharSequence charSequence) {
        AbstractC6492s.i(charSequence, "<this>");
        return AbstractC8783m.Z(s0(charSequence));
    }

    public static final CharSequence u0(CharSequence charSequence, int i10, char c10) {
        AbstractC6492s.i(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(charSequence);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return sb2;
    }

    public static final String v0(String str, int i10, char c10) {
        AbstractC6492s.i(str, "<this>");
        return u0(str, i10, c10).toString();
    }

    public static /* synthetic */ String w0(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return v0(str, i10, c10);
    }

    public static final CharSequence x0(CharSequence charSequence, int i10, char c10) {
        AbstractC6492s.i(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static String y0(String str, int i10, char c10) {
        AbstractC6492s.i(str, "<this>");
        return x0(str, i10, c10).toString();
    }

    private static final InterfaceC8780j z0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        L0(i11);
        return new C6511e(charSequence, i10, i11, new InterfaceC6839p() { // from class: kotlin.text.F
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return I.D0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }
}
