package k8;

import H6.C0675l;
import android.net.Uri;
import b9.InterfaceC2000g;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;
import m0.C5309b;
import n0.C5346a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z9.C5870a;
import z9.C5871b;
import z9.EnumC5872c;

/* compiled from: Billing.kt */
/* loaded from: classes3.dex */
public class F {
    public static void A(D7.f fVar, JSONObject jSONObject, String str, Object obj, p9.l lVar) throws JSONException {
        if (obj != null) {
            try {
                jSONObject.put(str, lVar.invoke(obj));
            } catch (JSONException e4) {
                fVar.a().d(e4);
            }
        }
    }

    public static void B(D7.f fVar, JSONObject jSONObject, String str, List list, InterfaceC2000g interfaceC2000g) throws JSONException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < size; i++) {
            jSONArray.put(((D7.h) interfaceC2000g.getValue()).b(fVar, list.get(i)));
        }
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e4) {
            fVar.a().d(e4);
        }
    }

    public static void C(D7.f fVar, JSONObject jSONObject, List list, p9.l lVar) throws JSONException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < size; i++) {
            jSONArray.put(lVar.invoke(list.get(i)));
        }
        try {
            jSONObject.put("transition_triggers", jSONArray);
        } catch (JSONException e4) {
            fVar.a().d(e4);
        }
    }

    public static final long a(String str) throws NumberFormatException {
        EnumC5872c enumC5872c;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i = C5870a.f48496e;
        char cCharAt2 = str.charAt(0);
        int i10 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z10 = (i10 > 0) && y9.q.s0(str, '-');
        if (length <= i10) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i10) != 'P') {
            throw new IllegalArgumentException();
        }
        int i11 = i10 + 1;
        if (i11 == length) {
            throw new IllegalArgumentException();
        }
        EnumC5872c enumC5872c2 = null;
        long jE = 0;
        boolean z11 = false;
        while (i11 < length) {
            if (str.charAt(i11) != 'T') {
                int i12 = i11;
                while (i12 < str.length() && (('0' <= (cCharAt = str.charAt(i12)) && cCharAt < ':') || y9.q.c0("+-.", cCharAt))) {
                    i12++;
                }
                String strSubstring = str.substring(i11, i12);
                kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i11;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i13 = length2 + 1;
                if (z11) {
                    if (cCharAt3 == 'H') {
                        enumC5872c = EnumC5872c.HOURS;
                    } else if (cCharAt3 == 'M') {
                        enumC5872c = EnumC5872c.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        enumC5872c = EnumC5872c.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    enumC5872c = EnumC5872c.DAYS;
                }
                if (enumC5872c2 != null && enumC5872c2.compareTo(enumC5872c) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iF0 = y9.q.f0(strSubstring, '.', 0, 6);
                if (enumC5872c != EnumC5872c.SECONDS || iF0 <= 0) {
                    jE = C5870a.e(jE, x(k(strSubstring), enumC5872c));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iF0);
                    kotlin.jvm.internal.l.e(strSubstring2, "substring(...)");
                    long jE2 = C5870a.e(jE, x(k(strSubstring2), enumC5872c));
                    String strSubstring3 = strSubstring.substring(iF0);
                    kotlin.jvm.internal.l.e(strSubstring3, "substring(...)");
                    double d10 = Double.parseDouble(strSubstring3);
                    double dH = com.google.gson.internal.c.h(d10, enumC5872c, EnumC5872c.NANOSECONDS);
                    if (Double.isNaN(dH)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long jZ = com.google.gson.internal.c.z(dH);
                    jE = C5870a.e(jE2, (-4611686018426999999L > jZ || jZ >= 4611686018427000000L) ? f(com.google.gson.internal.c.z(com.google.gson.internal.c.h(d10, enumC5872c, EnumC5872c.MILLISECONDS))) : g(jZ));
                }
                enumC5872c2 = enumC5872c;
                i11 = i13;
            } else {
                if (z11 || (i11 = i11 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z11 = true;
            }
        }
        if (!z10) {
            return jE;
        }
        long j4 = ((-(jE >> 1)) << 1) + (((int) jE) & 1);
        int i14 = C5871b.f48498a;
        return j4;
    }

    public static final void b(C5309b c5309b, int i) {
        kotlin.jvm.internal.l.f(c5309b, "<this>");
        c5309b.f44008b = new int[i];
        c5309b.f44009c = new Object[i];
    }

    public static final boolean c(Uri uri, j6.y yVar) {
        String authority;
        return (uri == null || (authority = uri.getAuthority()) == null || !com.vungle.ads.internal.presenter.h.DOWNLOAD.equals(authority) || uri.getQueryParameter(ImagesContract.URL) == null || !(yVar instanceof C0675l)) ? false : true;
    }

    public static final void d(E1.c cVar, Throwable th) {
        if (cVar != null) {
            if (th == null) {
                cVar.close();
                return;
            }
            try {
                cVar.close();
            } catch (Throwable th2) {
                b9.x.a(th, th2);
            }
        }
    }

    public static final long e(long j4) {
        long j10 = (j4 << 1) + 1;
        int i = C5870a.f48496e;
        int i10 = C5871b.f48498a;
        return j10;
    }

    public static final long f(long j4) {
        return (-4611686018426L > j4 || j4 >= 4611686018427L) ? e(v9.h.M(j4, -4611686018427387903L, 4611686018427387903L)) : g(j4 * 1000000);
    }

    public static final long g(long j4) {
        long j10 = j4 << 1;
        int i = C5870a.f48496e;
        int i10 = C5871b.f48498a;
        return j10;
    }

    public static final int h(C5309b c5309b, Object obj, int i) {
        kotlin.jvm.internal.l.f(c5309b, "<this>");
        int i10 = c5309b.f44010d;
        if (i10 == 0) {
            return -1;
        }
        try {
            int iA = C5346a.a(c5309b.f44010d, i, c5309b.f44008b);
            if (iA < 0 || kotlin.jvm.internal.l.b(obj, c5309b.f44009c[iA])) {
                return iA;
            }
            int i11 = iA + 1;
            while (i11 < i10 && c5309b.f44008b[i11] == i) {
                if (kotlin.jvm.internal.l.b(obj, c5309b.f44009c[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = iA - 1; i12 >= 0 && c5309b.f44008b[i12] == i; i12--) {
                if (kotlin.jvm.internal.l.b(obj, c5309b.f44009c[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final boolean i(BillingResult billingResult) {
        kotlin.jvm.internal.l.f(billingResult, "<this>");
        return billingResult.getResponseCode() == 0;
    }

    public static Object j(String str, JSONObject jSONObject) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt == JSONObject.NULL) {
            return null;
        }
        return objOpt;
    }

    public static final long k(String str) {
        int length = str.length();
        int i = (length <= 0 || !y9.q.c0("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            Iterable gVar = new v9.g(i, y9.q.d0(str), 1);
            if (!(gVar instanceof Collection) || !((Collection) gVar).isEmpty()) {
                v9.f it = gVar.iterator();
                while (it.f47101d) {
                    char cCharAt = str.charAt(it.a());
                    if ('0' > cCharAt || cCharAt >= ':') {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return y9.n.a0(str, "+", false) ? Long.parseLong(y9.r.x0(1, str)) : Long.parseLong(str);
    }

    public static Object l(D7.f fVar, JSONObject jSONObject, String str, InterfaceC2000g interfaceC2000g) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            throw z7.e.g(str, jSONObject);
        }
        try {
            Object objA = ((D7.b) interfaceC2000g.getValue()).a(fVar, jSONObjectOptJSONObject);
            if (objA != null) {
                return objA;
            }
            throw z7.e.e(jSONObject, str, null);
        } catch (Exception e4) {
            throw z7.e.b(jSONObject, str, e4);
        }
    }

    public static Object m(JSONObject jSONObject, String str, p9.l lVar) {
        Object objJ = j(str, jSONObject);
        if (objJ == null) {
            throw z7.e.g(str, jSONObject);
        }
        try {
            Object objInvoke = lVar.invoke(objJ);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw z7.e.e(jSONObject, str, objJ);
        } catch (ClassCastException unused) {
            throw z7.e.l(jSONObject, str, objJ);
        } catch (Exception e4) {
            throw z7.e.f(jSONObject, str, objJ, e4);
        }
    }

    public static Object n(JSONObject jSONObject, String str, p9.l lVar, l7.l lVar2) {
        Object objJ = j(str, jSONObject);
        if (objJ == null) {
            throw z7.e.g(str, jSONObject);
        }
        try {
            Object objInvoke = lVar.invoke(objJ);
            if (objInvoke == null) {
                throw z7.e.e(jSONObject, str, objJ);
            }
            try {
                if (lVar2.e(objInvoke)) {
                    return objInvoke;
                }
                throw z7.e.e(jSONObject, str, objInvoke);
            } catch (ClassCastException unused) {
                throw z7.e.l(jSONObject, str, objInvoke);
            }
        } catch (ClassCastException unused2) {
            throw z7.e.l(jSONObject, str, objJ);
        } catch (Exception e4) {
            throw z7.e.f(jSONObject, str, objJ, e4);
        }
    }

    public static List o(D7.f fVar, JSONObject jSONObject, String str, InterfaceC2000g interfaceC2000g, l7.g gVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            throw z7.e.g(str, jSONObject);
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List list = Collections.EMPTY_LIST;
            try {
                if (!gVar.a(list)) {
                    fVar.a().d(z7.e.e(jSONObject, str, list));
                }
                return list;
            } catch (ClassCastException unused) {
                fVar.a().d(z7.e.l(jSONObject, str, list));
                return list;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject == JSONObject.NULL) {
                jSONObjectOptJSONObject = null;
            }
            if (jSONObjectOptJSONObject != null) {
                try {
                    Object objA = ((D7.b) interfaceC2000g.getValue()).a(fVar, jSONObjectOptJSONObject);
                    if (objA != null) {
                        arrayList.add(objA);
                    }
                } catch (Exception e4) {
                    fVar.a().d(z7.e.a(jSONArrayOptJSONArray, str, i, e4));
                }
            }
        }
        try {
            if (gVar.a(arrayList)) {
                return arrayList;
            }
            throw z7.e.e(jSONObject, str, arrayList);
        } catch (ClassCastException unused2) {
            throw z7.e.l(jSONObject, str, arrayList);
        }
    }

    public static List p(D7.f fVar, JSONObject jSONObject, String str, b9.p pVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            throw z7.e.g(str, jSONObject);
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject == JSONObject.NULL) {
                jSONObjectOptJSONObject = null;
            }
            if (jSONObjectOptJSONObject != null) {
                try {
                    Object objA = ((D7.b) pVar.getValue()).a(fVar, jSONObjectOptJSONObject);
                    if (objA != null) {
                        arrayList.add(objA);
                    }
                } catch (Exception e4) {
                    fVar.a().d(z7.e.a(jSONArrayOptJSONArray, str, i, e4));
                }
            }
        }
        return arrayList;
    }

    public static Object q(D7.f fVar, JSONObject jSONObject, String str, InterfaceC2000g interfaceC2000g) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        try {
            return ((D7.b) interfaceC2000g.getValue()).a(fVar, jSONObjectOptJSONObject);
        } catch (Exception e4) {
            fVar.a().d(z7.e.b(jSONObject, str, e4));
            return null;
        }
    }

    public static Object r(D7.f fVar, JSONObject jSONObject, String str, p9.l lVar, l7.l lVar2) {
        Object objJ = j(str, jSONObject);
        if (objJ == null) {
            return null;
        }
        try {
            Object objInvoke = lVar.invoke(objJ);
            if (objInvoke == null) {
                fVar.a().d(z7.e.e(jSONObject, str, objJ));
                return null;
            }
            try {
                if (lVar2.e(objInvoke)) {
                    return objInvoke;
                }
                fVar.a().d(z7.e.e(jSONObject, str, objJ));
                return null;
            } catch (ClassCastException unused) {
                fVar.a().d(z7.e.l(jSONObject, str, objJ));
                return null;
            }
        } catch (ClassCastException unused2) {
            fVar.a().d(z7.e.l(jSONObject, str, objJ));
            return null;
        } catch (Exception e4) {
            fVar.a().d(z7.e.f(jSONObject, str, objJ, e4));
            return null;
        }
    }

    public static List s(D7.f fVar, JSONObject jSONObject, String str, InterfaceC2000g interfaceC2000g) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject == JSONObject.NULL) {
                jSONObjectOptJSONObject = null;
            }
            if (jSONObjectOptJSONObject != null) {
                try {
                    Object objA = ((D7.b) interfaceC2000g.getValue()).a(fVar, jSONObjectOptJSONObject);
                    if (objA != null) {
                        arrayList.add(objA);
                    }
                } catch (Exception e4) {
                    fVar.a().d(z7.e.a(jSONArrayOptJSONArray, str, i, e4));
                }
            }
        }
        return arrayList;
    }

    public static List t(D7.f fVar, JSONObject jSONObject, String str, b9.p pVar, l7.g gVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            if (length == 0) {
                List list = Collections.EMPTY_LIST;
                try {
                    if (gVar.a(list)) {
                        return list;
                    }
                    fVar.a().d(z7.e.e(jSONObject, str, list));
                    return null;
                } catch (ClassCastException unused) {
                    fVar.a().d(z7.e.l(jSONObject, str, list));
                    return null;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject == JSONObject.NULL) {
                    jSONObjectOptJSONObject = null;
                }
                if (jSONObjectOptJSONObject != null) {
                    try {
                        Object objA = ((D7.b) pVar.getValue()).a(fVar, jSONObjectOptJSONObject);
                        if (objA != null) {
                            arrayList.add(objA);
                        }
                    } catch (Exception e4) {
                        fVar.a().d(z7.e.a(jSONArrayOptJSONArray, str, i, e4));
                    }
                }
            }
            try {
                if (gVar.a(arrayList)) {
                    return arrayList;
                }
                fVar.a().d(z7.e.e(jSONObject, str, arrayList));
            } catch (ClassCastException unused2) {
                fVar.a().d(z7.e.l(jSONObject, str, arrayList));
                return null;
            }
        }
        return null;
    }

    public static List u(D7.f fVar, JSONObject jSONObject, String str, p9.l lVar, l7.g gVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            if (length == 0) {
                List list = Collections.EMPTY_LIST;
                try {
                    if (gVar.a(list)) {
                        return list;
                    }
                    fVar.a().d(z7.e.e(jSONObject, str, list));
                    return null;
                } catch (ClassCastException unused) {
                    fVar.a().d(z7.e.l(jSONObject, str, list));
                    return null;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                Object objOpt = jSONArrayOptJSONArray.opt(i);
                if (objOpt == JSONObject.NULL) {
                    objOpt = null;
                }
                if (objOpt != null) {
                    try {
                        Object objInvoke = lVar.invoke(objOpt);
                        if (objInvoke != null) {
                            arrayList.add(objInvoke);
                        }
                    } catch (ClassCastException unused2) {
                        fVar.a().d(z7.e.k(jSONArrayOptJSONArray, str, i, objOpt));
                    } catch (Exception e4) {
                        fVar.a().d(z7.e.d(jSONArrayOptJSONArray, str, i, objOpt, e4));
                    }
                }
            }
            try {
                if (gVar.a(arrayList)) {
                    return arrayList;
                }
                fVar.a().d(z7.e.e(jSONObject, str, arrayList));
            } catch (ClassCastException unused3) {
                fVar.a().d(z7.e.l(jSONObject, str, arrayList));
                return null;
            }
        }
        return null;
    }

    public static String v(D7.f fVar, JSONObject jSONObject) {
        Object objJ = j("type", jSONObject);
        if (objJ == null) {
            return null;
        }
        try {
            return (String) objJ;
        } catch (ClassCastException unused) {
            fVar.a().d(z7.e.l(jSONObject, "type", objJ));
            return null;
        } catch (Exception e4) {
            fVar.a().d(z7.e.f(jSONObject, "type", objJ, e4));
            return null;
        }
    }

    public static final long w(int i, EnumC5872c unit) {
        kotlin.jvm.internal.l.f(unit, "unit");
        return unit.compareTo(EnumC5872c.SECONDS) <= 0 ? g(com.google.gson.internal.c.i(i, unit, EnumC5872c.NANOSECONDS)) : x(i, unit);
    }

    public static final long x(long j4, EnumC5872c unit) {
        kotlin.jvm.internal.l.f(unit, "unit");
        EnumC5872c enumC5872c = EnumC5872c.NANOSECONDS;
        long jI = com.google.gson.internal.c.i(4611686018426999999L, enumC5872c, unit);
        if ((-jI) <= j4 && j4 <= jI) {
            return g(com.google.gson.internal.c.i(j4, unit, enumC5872c));
        }
        EnumC5872c targetUnit = EnumC5872c.MILLISECONDS;
        kotlin.jvm.internal.l.f(targetUnit, "targetUnit");
        return e(v9.h.M(targetUnit.getTimeUnit$kotlin_stdlib().convert(j4, unit.getTimeUnit$kotlin_stdlib()), -4611686018427387903L, 4611686018427387903L));
    }

    public static void y(D7.f fVar, JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException e4) {
                fVar.a().d(e4);
            }
        }
    }

    public static void z(D7.f fVar, JSONObject jSONObject, String str, Object obj, InterfaceC2000g interfaceC2000g) throws JSONException {
        if (obj != null) {
            try {
                jSONObject.put(str, ((D7.h) interfaceC2000g.getValue()).b(fVar, obj));
            } catch (JSONException e4) {
                fVar.a().d(e4);
            }
        }
    }
}
