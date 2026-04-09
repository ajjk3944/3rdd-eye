package y9;

import E.u;
import J8.C0691f;
import c9.C2092m;
import c9.C2097r;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Indent.kt */
/* renamed from: y9.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5828j extends com.google.gson.internal.c {
    public static String K(String str) {
        kotlin.jvm.internal.l.f(str, "<this>");
        return x9.l.I(x9.l.J(new p(str), new C0691f("    ", 4)), "\n", null, 62);
    }

    public static String L(String str) {
        List listG;
        int length;
        kotlin.jvm.internal.l.f(str, "<this>");
        C5821c c5821c = new C5821c(str);
        if (c5821c.hasNext()) {
            Object next = c5821c.next();
            if (c5821c.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c5821c.hasNext()) {
                    arrayList.add(c5821c.next());
                }
                listG = arrayList;
            } else {
                listG = u.G(next);
            }
        } else {
            listG = C2099t.f18581b;
        }
        List list = listG;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!q.i0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C2092m.T(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!com.google.gson.internal.c.t(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList3.add(Integer.valueOf(length));
        }
        Integer num = (Integer) C2097r.x0(arrayList3);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listG.size();
        int iV = C2092m.V(listG);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            int i = length + 1;
            if (length < 0) {
                C2092m.a0();
                throw null;
            }
            String str3 = (String) obj2;
            String strX0 = ((length == 0 || length == iV) && q.i0(str3)) ? null : r.x0(iIntValue, str3);
            if (strX0 != null) {
                arrayList4.add(strX0);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        C2097r.s0(arrayList4, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    public static String M(String str) {
        List listG;
        kotlin.jvm.internal.l.f(str, "<this>");
        if (q.i0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        C5821c c5821c = new C5821c(str);
        if (c5821c.hasNext()) {
            Object next = c5821c.next();
            if (c5821c.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c5821c.hasNext()) {
                    arrayList.add(c5821c.next());
                }
                listG = arrayList;
            } else {
                listG = u.G(next);
            }
        } else {
            listG = C2099t.f18581b;
        }
        int length = str.length();
        listG.size();
        int iV = C2092m.V(listG);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : listG) {
            int i10 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iV) || !q.i0(str2)) {
                int length2 = str2.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i11 = -1;
                        break;
                    }
                    if (!com.google.gson.internal.c.t(str2.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && n.Z(i11, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i11);
                    kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i = i10;
        }
        StringBuilder sb = new StringBuilder(length);
        C2097r.s0(arrayList2, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
