package kotlin.text;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class x extends u {
    private static final InterfaceC6835l d(final String str) {
        return str.length() == 0 ? new InterfaceC6835l() { // from class: kotlin.text.v
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return x.e((String) obj);
            }
        } : new InterfaceC6835l() { // from class: kotlin.text.w
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return x.f(str, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(String line) {
        AbstractC6492s.i(line, "line");
        return line;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(String str, String line) {
        AbstractC6492s.i(line, "line");
        return str + line;
    }

    private static final int g(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!AbstractC6507a.c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String h(String str, String newIndent) {
        String str2;
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(newIndent, "newIndent");
        List listT0 = I.t0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listT0) {
            if (!t.m0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(g((String) it.next())));
        }
        Integer num = (Integer) AbstractC3689v.H0(arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listT0.size());
        InterfaceC6835l interfaceC6835lD = d(newIndent);
        int iN = AbstractC3689v.n(listT0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listT0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == iN) && t.m0(str3)) {
                str3 = null;
            } else {
                String strT1 = t.t1(str3, iIntValue);
                if (strT1 != null && (str2 = (String) interfaceC6835lD.invoke(strT1)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        return ((StringBuilder) Zg.H.w0(arrayList3, new StringBuilder(length), (112 & 2) != 0 ? ", " : "\n", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null)).toString();
    }

    public static final String i(String str, String newIndent, String marginPrefix) {
        int i10;
        String str2;
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(newIndent, "newIndent");
        AbstractC6492s.i(marginPrefix, "marginPrefix");
        if (t.m0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listT0 = I.t0(str);
        int length = str.length() + (newIndent.length() * listT0.size());
        InterfaceC6835l interfaceC6835lD = d(newIndent);
        int iN = AbstractC3689v.n(listT0);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : listT0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC3689v.v();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i11 == 0 || i11 == iN) && t.m0(str3)) {
                str3 = null;
            } else {
                int length2 = str3.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i10 = -1;
                        break;
                    }
                    if (!AbstractC6507a.c(str3.charAt(i13))) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = i10;
                    if (t.O(str3, marginPrefix, i10, false, 4, null)) {
                        int length3 = i14 + marginPrefix.length();
                        AbstractC6492s.g(str3, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str3.substring(length3);
                        AbstractC6492s.h(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str2 = (String) interfaceC6835lD.invoke(strSubstring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i11 = i12;
        }
        return ((StringBuilder) Zg.H.w0(arrayList, new StringBuilder(length), (112 & 2) != 0 ? ", " : "\n", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null)).toString();
    }

    public static String j(String str) {
        AbstractC6492s.i(str, "<this>");
        return h(str, "");
    }

    public static String k(String str, String marginPrefix) {
        AbstractC6492s.i(str, "<this>");
        AbstractC6492s.i(marginPrefix, "marginPrefix");
        return i(str, "", marginPrefix);
    }

    public static /* synthetic */ String l(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return t.k(str, str2);
    }
}
