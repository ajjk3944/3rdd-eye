package c9;

import N7.G8;
import b9.C1992A;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: _ArraysJvm.kt */
/* renamed from: c9.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2088i {
    public static List a(Object[] objArr) {
        kotlin.jvm.internal.l.f(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        kotlin.jvm.internal.l.e(listAsList, "asList(...)");
        return listAsList;
    }

    public static final void b(Object[] objArr, StringBuilder sb, ArrayList arrayList) {
        if (arrayList.contains(objArr)) {
            sb.append("[...]");
            return;
        }
        arrayList.add(objArr);
        sb.append('[');
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object obj = objArr[i];
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof Object[]) {
                b((Object[]) obj, sb, arrayList);
                C1992A c1992a = C1992A.f18074a;
            } else if (obj instanceof byte[]) {
                String string = Arrays.toString((byte[]) obj);
                kotlin.jvm.internal.l.e(string, "toString(...)");
                sb.append(string);
            } else if (obj instanceof short[]) {
                String string2 = Arrays.toString((short[]) obj);
                kotlin.jvm.internal.l.e(string2, "toString(...)");
                sb.append(string2);
            } else if (obj instanceof int[]) {
                String string3 = Arrays.toString((int[]) obj);
                kotlin.jvm.internal.l.e(string3, "toString(...)");
                sb.append(string3);
            } else if (obj instanceof long[]) {
                String string4 = Arrays.toString((long[]) obj);
                kotlin.jvm.internal.l.e(string4, "toString(...)");
                sb.append(string4);
            } else if (obj instanceof float[]) {
                String string5 = Arrays.toString((float[]) obj);
                kotlin.jvm.internal.l.e(string5, "toString(...)");
                sb.append(string5);
            } else if (obj instanceof double[]) {
                String string6 = Arrays.toString((double[]) obj);
                kotlin.jvm.internal.l.e(string6, "toString(...)");
                sb.append(string6);
            } else if (obj instanceof char[]) {
                String string7 = Arrays.toString((char[]) obj);
                kotlin.jvm.internal.l.e(string7, "toString(...)");
                sb.append(string7);
            } else if (obj instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) obj);
                kotlin.jvm.internal.l.e(string8, "toString(...)");
                sb.append(string8);
            } else if (obj instanceof b9.s) {
                String strU0 = C2097r.u0(new b9.s(((b9.s) obj).f18097b), ", ", "[", "]", null, 56);
                sb.append(strU0 != null ? strU0 : "null");
            } else if (obj instanceof b9.z) {
                String strU02 = C2097r.u0(new b9.z(((b9.z) obj).f18110b), ", ", "[", "]", null, 56);
                sb.append(strU02 != null ? strU02 : "null");
            } else if (obj instanceof b9.u) {
                String strU03 = C2097r.u0(new b9.u(((b9.u) obj).f18101b), ", ", "[", "]", null, 56);
                sb.append(strU03 != null ? strU03 : "null");
            } else if (obj instanceof b9.w) {
                String strU04 = C2097r.u0(new b9.w(((b9.w) obj).f18105b), ", ", "[", "]", null, 56);
                sb.append(strU04 != null ? strU04 : "null");
            } else {
                sb.append(obj.toString());
            }
        }
        sb.append(']');
        arrayList.remove(C2092m.V(arrayList));
    }

    public static void c(int i, int i10, int i11, int[] iArr, int[] destination) {
        kotlin.jvm.internal.l.f(iArr, "<this>");
        kotlin.jvm.internal.l.f(destination, "destination");
        System.arraycopy(iArr, i10, destination, i, i11 - i10);
    }

    public static void d(byte[] bArr, int i, byte[] destination, int i10, int i11) {
        kotlin.jvm.internal.l.f(bArr, "<this>");
        kotlin.jvm.internal.l.f(destination, "destination");
        System.arraycopy(bArr, i10, destination, i, i11 - i10);
    }

    public static void e(Object[] objArr, int i, Object[] destination, int i10, int i11) {
        kotlin.jvm.internal.l.f(objArr, "<this>");
        kotlin.jvm.internal.l.f(destination, "destination");
        System.arraycopy(objArr, i10, destination, i, i11 - i10);
    }

    public static /* synthetic */ void f(Object[] objArr, int i, Object[] objArr2, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        e(objArr, 0, objArr2, i, i10);
    }

    public static Object[] g(Object[] objArr, int i, int i10) {
        kotlin.jvm.internal.l.f(objArr, "<this>");
        h(i10, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i10);
        kotlin.jvm.internal.l.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static final void h(int i, int i10) {
        if (i > i10) {
            throw new IndexOutOfBoundsException(G8.r("toIndex (", i, ") is greater than size (", i10, ")."));
        }
    }

    public static void i(Object[] objArr, F9.y yVar, int i, int i10) {
        kotlin.jvm.internal.l.f(objArr, "<this>");
        Arrays.fill(objArr, i, i10, yVar);
    }

    public static Map k(Map map, p9.l defaultValue) {
        kotlin.jvm.internal.l.f(map, "<this>");
        kotlin.jvm.internal.l.f(defaultValue, "defaultValue");
        return map instanceof InterfaceC2104y ? k(((InterfaceC2104y) map).i(), defaultValue) : new z(map, defaultValue);
    }
}
