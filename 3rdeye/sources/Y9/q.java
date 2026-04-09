package y9;

import E.u;
import androidx.work.s;
import c9.C2088i;
import c9.C2092m;
import g0.C4356c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import y9.C5820b;

/* compiled from: _StringsJvm.kt */
/* loaded from: classes3.dex */
public class q extends n {
    public static boolean b0(CharSequence charSequence, String other, boolean z10) {
        kotlin.jvm.internal.l.f(charSequence, "<this>");
        kotlin.jvm.internal.l.f(other, "other");
        return g0(charSequence, other, 0, z10, 2) >= 0;
    }

    public static boolean c0(CharSequence charSequence, char c10) {
        kotlin.jvm.internal.l.f(charSequence, "<this>");
        return f0(charSequence, c10, 0, 2) >= 0;
    }

    public static int d0(CharSequence charSequence) {
        kotlin.jvm.internal.l.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int e0(CharSequence charSequence, String string, int i, boolean z10) {
        kotlin.jvm.internal.l.f(charSequence, "<this>");
        kotlin.jvm.internal.l.f(string, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        v9.g gVar = new v9.g(i, length, 1);
        boolean z11 = charSequence instanceof String;
        int i10 = gVar.f47098d;
        int i11 = gVar.f47097c;
        int i12 = gVar.f47096b;
        if (!z11 || !s.n(string)) {
            boolean z12 = z10;
            if ((i10 <= 0 || i12 > i11) && (i10 >= 0 || i11 > i12)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z13 = z12;
                z12 = z13;
                if (m0(string, 0, charSequence2, i12, string.length(), z13)) {
                    return i12;
                }
                if (i12 == i11) {
                    return -1;
                }
                i12 += i10;
                charSequence = charSequence2;
            }
        } else {
            if ((i10 <= 0 || i12 > i11) && (i10 >= 0 || i11 > i12)) {
                return -1;
            }
            int i13 = i12;
            while (true) {
                String str = string;
                boolean z14 = z10;
                if (n.V(0, i13, string.length(), str, (String) charSequence, z14)) {
                    return i13;
                }
                if (i13 == i11) {
                    return -1;
                }
                i13 += i10;
                string = str;
                z10 = z14;
            }
        }
    }

    public static int f0(CharSequence charSequence, char c10, int i, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.l.f(charSequence, "<this>");
        return !(charSequence instanceof String) ? h0(charSequence, new char[]{c10}, i, false) : ((String) charSequence).indexOf(c10, i);
    }

    public static /* synthetic */ int g0(CharSequence charSequence, String str, int i, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return e0(charSequence, str, i, z10);
    }

    public static final int h0(CharSequence charSequence, char[] cArr, int i, boolean z10) {
        kotlin.jvm.internal.l.f(charSequence, "<this>");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iD0 = d0(charSequence);
        if (i > iD0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c10 : cArr) {
                if (com.google.gson.internal.c.m(c10, cCharAt, z10)) {
                    return i;
                }
            }
            if (i == iD0) {
                return -1;
            }
            i++;
        }
    }

    public static boolean i0(CharSequence charSequence) {
        kotlin.jvm.internal.l.f(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!com.google.gson.internal.c.t(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int j0(int i, String str, String string) {
        int iD0 = (i & 2) != 0 ? d0(str) : 0;
        kotlin.jvm.internal.l.f(str, "<this>");
        kotlin.jvm.internal.l.f(string, "string");
        return str.lastIndexOf(string, iD0);
    }

    public static int k0(String str, char c10, int i, int i10) {
        if ((i10 & 2) != 0) {
            i = d0(str);
        }
        kotlin.jvm.internal.l.f(str, "<this>");
        return str.lastIndexOf(c10, i);
    }

    public static String l0(int i, String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.l.f(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(C4356c.i(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i10 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean m0(String str, int i, CharSequence other, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.l.f(str, "<this>");
        kotlin.jvm.internal.l.f(other, "other");
        if (i10 >= 0 && i >= 0 && i <= str.length() - i11 && i10 <= other.length() - i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                if (com.google.gson.internal.c.m(str.charAt(i + i12), other.charAt(i10 + i12), z10)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String n0(String str, String str2) {
        kotlin.jvm.internal.l.f(str, "<this>");
        if (!n.a0(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String o0(String str) {
        if (!n.T(str, "Client")) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - 6);
        kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final List p0(CharSequence charSequence, String str) {
        int iE0 = e0(charSequence, str, 0, false);
        if (iE0 == -1) {
            return u.G(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iE0).toString());
            length = str.length() + iE0;
            iE0 = e0(charSequence, str, length, false);
        } while (iE0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List q0(CharSequence charSequence, char[] cArr) {
        kotlin.jvm.internal.l.f(charSequence, "<this>");
        if (cArr.length == 1) {
            return p0(charSequence, String.valueOf(cArr[0]));
        }
        O9.h hVar = new O9.h(new C5820b(charSequence, new A8.h(cArr, 1)), 1);
        ArrayList arrayList = new ArrayList(C2092m.T(hVar, 10));
        Iterator it = hVar.iterator();
        while (true) {
            C5820b.a aVar = (C5820b.a) it;
            if (!aVar.hasNext()) {
                return arrayList;
            }
            v9.g range = (v9.g) aVar.next();
            kotlin.jvm.internal.l.f(range, "range");
            arrayList.add(charSequence.subSequence(range.f47096b, range.f47097c + 1).toString());
        }
    }

    public static List r0(String str, String[] strArr) {
        kotlin.jvm.internal.l.f(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return p0(str, str2);
            }
        }
        final List listA = C2088i.a(strArr);
        O9.h hVar = new O9.h(new C5820b(str, new p9.p() { // from class: y9.o
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[EDGE_INSN: B:72:0x0064->B:21:0x0064 BREAK  A[LOOP:0: B:37:0x00a0->B:48:0x00d4]] */
            @Override // p9.p
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r17, java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 304
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: y9.o.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }), 1);
        ArrayList arrayList = new ArrayList(C2092m.T(hVar, 10));
        Iterator it = hVar.iterator();
        while (true) {
            C5820b.a aVar = (C5820b.a) it;
            if (!aVar.hasNext()) {
                return arrayList;
            }
            v9.g range = (v9.g) aVar.next();
            kotlin.jvm.internal.l.f(range, "range");
            arrayList.add(str.subSequence(range.f47096b, range.f47097c + 1).toString());
        }
    }

    public static boolean s0(String str, char c10) {
        return str.length() > 0 && com.google.gson.internal.c.m(str.charAt(0), c10, false);
    }

    public static String t0(String str, String delimiter, String str2) {
        kotlin.jvm.internal.l.f(delimiter, "delimiter");
        int iG0 = g0(str, delimiter, 0, false, 6);
        if (iG0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(delimiter.length() + iG0, str.length());
        kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String u0(String str, String str2) {
        int iK0 = k0(str, '.', 0, 6);
        if (iK0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iK0 + 1, str.length());
        kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static Boolean v0(String str) {
        kotlin.jvm.internal.l.f(str, "<this>");
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence w0(CharSequence charSequence) {
        kotlin.jvm.internal.l.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z10 = false;
        while (i <= length) {
            boolean zT = com.google.gson.internal.c.t(charSequence.charAt(!z10 ? i : length));
            if (z10) {
                if (!zT) {
                    break;
                }
                length--;
            } else if (zT) {
                i++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
