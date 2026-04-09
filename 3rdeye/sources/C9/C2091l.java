package c9;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: _Arrays.kt */
/* renamed from: c9.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2091l extends C2088i {
    public static ArrayList l(Object[] objArr) {
        kotlin.jvm.internal.l.f(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> T m(T[] tArr) {
        kotlin.jvm.internal.l.f(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T n(T[] tArr, int i) {
        kotlin.jvm.internal.l.f(tArr, "<this>");
        if (i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    public static <T> int o(T[] tArr, T t10) {
        kotlin.jvm.internal.l.f(tArr, "<this>");
        int i = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (t10.equals(tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String p(String str, Object[] objArr) {
        kotlin.jvm.internal.l.f(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            com.google.gson.internal.c.d(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Float q(Float[] fArr) {
        kotlin.jvm.internal.l.f(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, fArr[i].floatValue());
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    public static Float r(Float[] fArr) {
        kotlin.jvm.internal.l.f(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, fArr[i].floatValue());
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    public static final void s(Object[] objArr, AbstractSet abstractSet) {
        kotlin.jvm.internal.l.f(objArr, "<this>");
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static <T> List<T> t(T[] tArr) {
        kotlin.jvm.internal.l.f(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C2086g(tArr, false)) : E.u.G(tArr[0]) : C2099t.f18581b;
    }
}
