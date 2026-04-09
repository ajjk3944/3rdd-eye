package tt;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.e5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq.w;

/* loaded from: classes.dex */
public abstract class m extends e5 {
    public static String a0(String str) throws IOException {
        List listH;
        int length;
        Comparable comparable;
        br.l.e(str, "<this>");
        h hVar = new h(str);
        if (hVar.hasNext()) {
            Object next = hVar.next();
            if (hVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (hVar.hasNext()) {
                    arrayList.add(hVar.next());
                }
                listH = arrayList;
            } else {
                listH = e5.H(next);
            }
        } else {
            listH = w.f16945a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listH) {
            if (!l.D0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(mq.p.a0(arrayList2, 10));
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
                if (!b4.L(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList3.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
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
        listH.size();
        int iZ = e5.z(listH);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : listH) {
            int i10 = length + 1;
            if (length < 0) {
                e5.Q();
                throw null;
            }
            String str3 = (String) obj2;
            String strT0 = ((length == 0 || length == iZ) && l.D0(str3)) ? null : l.t0(iIntValue, str3);
            if (strT0 != null) {
                arrayList4.add(strT0);
            }
            length = i10;
        }
        StringBuilder sb2 = new StringBuilder(length3);
        mq.o.w0(arrayList4, sb2, "\n", null, null, null, 124);
        return sb2.toString();
    }

    public static String b0(String str) throws IOException {
        List listH;
        br.l.e(str, "<this>");
        if (l.D0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        h hVar = new h(str);
        if (hVar.hasNext()) {
            Object next = hVar.next();
            if (hVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (hVar.hasNext()) {
                    arrayList.add(hVar.next());
                }
                listH = arrayList;
            } else {
                listH = e5.H(next);
            }
        } else {
            listH = w.f16945a;
        }
        int length = str.length();
        listH.size();
        int iZ = e5.z(listH);
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        for (Object obj : listH) {
            int i11 = i10 + 1;
            String strSubstring = null;
            if (i10 < 0) {
                e5.Q();
                throw null;
            }
            String str2 = (String) obj;
            if ((i10 != 0 && i10 != iZ) || !l.D0(str2)) {
                int length2 = str2.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!b4.L(str2.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1 && s.m0(str2, i12, "|", false)) {
                    strSubstring = str2.substring("|".length() + i12);
                    br.l.d(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i10 = i11;
        }
        StringBuilder sb2 = new StringBuilder(length);
        mq.o.w0(arrayList2, sb2, "\n", null, null, null, 124);
        return sb2.toString();
    }
}
