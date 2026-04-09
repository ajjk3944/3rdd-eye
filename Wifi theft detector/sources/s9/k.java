package s9;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class k extends h {
    public static final l9.l d(final String str) {
        return str.length() == 0 ? new l9.l() { // from class: s9.i
            @Override // l9.l
            public final Object invoke(Object obj) {
                return k.e((String) obj);
            }
        } : new l9.l() { // from class: s9.j
            @Override // l9.l
            public final Object invoke(Object obj) {
                return k.f(str, (String) obj);
            }
        };
    }

    public static final String e(String line) {
        kotlin.jvm.internal.p.e(line, "line");
        return line;
    }

    public static final String f(String str, String line) {
        kotlin.jvm.internal.p.e(line, "line");
        return str + line;
    }

    public static final int g(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!kotlin.text.a.c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String h(String str, String newIndent) {
        String str2;
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(newIndent, "newIndent");
        List listK0 = u.k0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK0) {
            if (!u.d0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(z8.s.s(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList2.add(Integer.valueOf(g((String) obj2)));
        }
        Integer num = (Integer) z8.z.R(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listK0.size());
        l9.l lVarD = d(newIndent);
        int iK = z8.r.k(listK0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listK0) {
            int i12 = i10 + 1;
            if (i10 < 0) {
                z8.r.r();
            }
            String str3 = (String) obj3;
            if ((i10 == 0 || i10 == iK) && u.d0(str3)) {
                str3 = null;
            } else {
                String strZ0 = w.Z0(str3, iIntValue);
                if (strZ0 != null && (str2 = (String) lVarD.invoke(strZ0)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i12;
        }
        return ((StringBuilder) z8.z.L(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String i(String str, String newIndent, String marginPrefix) {
        String str2;
        String str3;
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(newIndent, "newIndent");
        kotlin.jvm.internal.p.e(marginPrefix, "marginPrefix");
        if (u.d0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listK0 = u.k0(str);
        int length = str.length() + (newIndent.length() * listK0.size());
        l9.l lVarD = d(newIndent);
        int iK = z8.r.k(listK0);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listK0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                z8.r.r();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == iK) && u.d0(str4)) {
                str2 = marginPrefix;
                str4 = null;
            } else {
                int length2 = str4.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!kotlin.text.a.c(str4.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i13 = i12;
                    str2 = marginPrefix;
                    if (r.I(str4, str2, i13, false, 4, null)) {
                        int length3 = str2.length() + i13;
                        kotlin.jvm.internal.p.c(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        kotlin.jvm.internal.p.d(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str3 = (String) lVarD.invoke(strSubstring)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i10 = i11;
            marginPrefix = str2;
        }
        return ((StringBuilder) z8.z.L(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static String j(String str) {
        kotlin.jvm.internal.p.e(str, "<this>");
        return h(str, "");
    }

    public static final String k(String str, String marginPrefix) {
        kotlin.jvm.internal.p.e(str, "<this>");
        kotlin.jvm.internal.p.e(marginPrefix, "marginPrefix");
        return i(str, "", marginPrefix);
    }

    public static /* synthetic */ String l(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return k(str, str2);
    }
}
