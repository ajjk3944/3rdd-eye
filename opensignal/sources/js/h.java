package js;

import ht.b0;
import ht.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import ls.q0;

/* loaded from: classes.dex */
public final class h implements dt.n {

    /* renamed from: b, reason: collision with root package name */
    public static final h f13807b = new h();

    /* renamed from: c, reason: collision with root package name */
    public static final h f13808c = new h();

    /* renamed from: d, reason: collision with root package name */
    public static final h f13809d = new h();

    public static String[] b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static m c(String str) {
        ys.c cVar;
        br.l.e(str, "representation");
        char cCharAt = str.charAt(0);
        ys.c[] cVarArrValues = ys.c.values();
        int length = cVarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i10];
            if (cVar.getDesc().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (cVar != null) {
            return new l(cVar);
        }
        if (cCharAt == 'V') {
            return new l(null);
        }
        if (cCharAt == '[') {
            String strSubstring = str.substring(1);
            br.l.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            return new j(c(strSubstring));
        }
        if (cCharAt == 'L') {
            tt.l.w0(str, ';');
        }
        String strSubstring2 = str.substring(1, str.length() - 1);
        br.l.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return new k(strSubstring2);
    }

    public static k d(String str) {
        br.l.e(str, "internalName");
        return new k(str);
    }

    public static LinkedHashSet e(String str, String... strArr) {
        br.l.e(str, "internalName");
        br.l.e(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet f(String str, String... strArr) {
        br.l.e(strArr, "signatures");
        return e("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet g(String str, String... strArr) {
        return e("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String h(m mVar) {
        String desc;
        br.l.e(mVar, "type");
        if (mVar instanceof j) {
            return "[" + h(((j) mVar).f13813i);
        }
        if (mVar instanceof l) {
            ys.c cVar = ((l) mVar).f13815i;
            return (cVar == null || (desc = cVar.getDesc()) == null) ? "V" : desc;
        }
        if (mVar instanceof k) {
            return h0.b.r(new StringBuilder("L"), ((k) mVar).f13814i, ';');
        }
        throw new bf.n();
    }

    @Override // dt.n
    public x a(q0 q0Var, String str, b0 b0Var, b0 b0Var2) {
        br.l.e(q0Var, "proto");
        br.l.e(str, "flexibleId");
        br.l.e(b0Var, "lowerBound");
        br.l.e(b0Var2, "upperBound");
        return !str.equals("kotlin.jvm.PlatformType") ? kt.k.c(kt.j.ERROR_FLEXIBLE_TYPE, str, b0Var.toString(), b0Var2.toString()) : q0Var.l(os.k.f19784g) ? new fs.h(b0Var, b0Var2) : ht.e.j(b0Var, b0Var2);
    }
}
