package vk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class j extends com.bumptech.glide.e {
    public static String k0(String str) {
        nk.k.e(str, "<this>");
        return uk.i.H(new uk.e(new uk.j(2, str), new b7.c("    ", 16)), "\n");
    }

    public static String l0(String str) {
        List listS;
        Comparable comparable;
        String strSubstring;
        nk.k.e(str, "<this>");
        b bVar = new b(str);
        if (bVar.hasNext()) {
            Object next = bVar.next();
            if (bVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (bVar.hasNext()) {
                    arrayList.add(bVar.next());
                }
                listS = arrayList;
            } else {
                listS = cm.g.s(next);
            }
        } else {
            listS = s.f38317a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listS) {
            if (!i.H0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(zj.o.T(arrayList2, 10));
        int size = arrayList2.size();
        int i4 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!com.bumptech.glide.d.u(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList3.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList3.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listS.size();
        int iR = cm.g.r(listS);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : listS) {
            int i11 = i4 + 1;
            if (i4 < 0) {
                cm.g.N();
                throw null;
            }
            String str3 = (String) obj3;
            if ((i4 == 0 || i4 == iR) && i.H0(str3)) {
                strSubstring = null;
            } else {
                nk.k.e(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(r5.c.h(iIntValue, "Requested character count ", " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                nk.k.d(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList4.add(strSubstring);
            }
            i4 = i11;
        }
        StringBuilder sb2 = new StringBuilder(length3);
        zj.n.e0(arrayList4, sb2, "\n", "", "", "...", null);
        return sb2.toString();
    }

    public static String m0(String str) {
        List listS;
        nk.k.e(str, "<this>");
        if (i.H0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        b bVar = new b(str);
        if (bVar.hasNext()) {
            Object next = bVar.next();
            if (bVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (bVar.hasNext()) {
                    arrayList.add(bVar.next());
                }
                listS = arrayList;
            } else {
                listS = cm.g.s(next);
            }
        } else {
            listS = s.f38317a;
        }
        int length = str.length();
        listS.size();
        int iR = cm.g.r(listS);
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        for (Object obj : listS) {
            int i10 = i4 + 1;
            String strSubstring = null;
            if (i4 < 0) {
                cm.g.N();
                throw null;
            }
            String str2 = (String) obj;
            if ((i4 != 0 && i4 != iR) || !i.H0(str2)) {
                int length2 = str2.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i11 = -1;
                        break;
                    }
                    if (!com.bumptech.glide.d.u(str2.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && p.v0(str2, i11, "|", false)) {
                    strSubstring = str2.substring("|".length() + i11);
                    nk.k.d(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i4 = i10;
        }
        StringBuilder sb2 = new StringBuilder(length);
        zj.n.e0(arrayList2, sb2, "\n", "", "", "...", null);
        return sb2.toString();
    }
}
