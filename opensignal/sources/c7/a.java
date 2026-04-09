package c7;

import android.os.Parcel;
import bf.n;
import br.o;
import br.y;
import com.google.android.gms.internal.measurement.w;
import com.google.android.gms.internal.measurement.z4;
import h2.j0;
import hk.h;
import io.sentry.android.core.e0;
import ir.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static void A(StringBuilder sb2, String str, char c4, long j) {
        sb2.append(str);
        sb2.append(c4);
        sb2.append(j);
    }

    public static void B(HashMap map, String str, Integer num, int i10, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i10));
    }

    public static int C(int i10, int i11, int i12) {
        return (Integer.hashCode(i10) + i11) * i12;
    }

    public static float a(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static int b(int i10, int i11, int i12) {
        return z4.B0(i10) + i11 + i12;
    }

    public static int c(int i10, int i11, int i12, int i13) {
        return z4.B0(i10) + i11 + i12 + i13;
    }

    public static int d(int i10, String str) {
        return String.valueOf(str).length() + i10;
    }

    public static int e(j0 j0Var, int i10, int i11) {
        return (j0Var.hashCode() + i10) * i11;
    }

    public static int f(Class cls, Parcel parcel, ArrayList arrayList, int i10, int i11) {
        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
        return i10 + i11;
    }

    public static int g(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static n h(String str) {
        u1.a.c(str);
        return new n();
    }

    public static j i(Class cls, String str, String str2, int i10, y yVar) {
        return yVar.d(new o(cls, str, str2, i10));
    }

    public static Object j(w wVar, int i10, ArrayList arrayList, int i11) {
        a.a.I(wVar.name(), i10, arrayList);
        return arrayList.get(i11);
    }

    public static String k(int i10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String l(int i10, String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i10);
        return sb2.toString();
    }

    public static String m(long j, String str) {
        return str + j;
    }

    public static String n(long j, String str, StringBuilder sb2) {
        sb2.append(j);
        sb2.append(str);
        return sb2.toString();
    }

    public static String o(h hVar, StringBuilder sb2, String str) {
        sb2.append(hVar.c());
        sb2.append(str);
        return sb2.toString();
    }

    public static String p(String str, String str2) {
        return str + str2;
    }

    public static String q(StringBuilder sb2, int i10, char c4) {
        sb2.append(i10);
        sb2.append(c4);
        return sb2.toString();
    }

    public static String r(StringBuilder sb2, boolean z10, char c4) {
        sb2.append(z10);
        sb2.append(c4);
        return sb2.toString();
    }

    public static StringBuilder s(int i10, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder t(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder u(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static Iterator v(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static void w(int i10, HashMap map, String str, int i11, String str2) {
        map.put(str, Integer.valueOf(i10));
        map.put(str2, Integer.valueOf(i11));
    }

    public static void x(Parcel parcel, int i10, Boolean bool) {
        parcel.writeInt(i10);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void y(String str, int i10, int i11, String str2) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        sb2.append(i11);
        e0.p(str2, sb2.toString());
    }

    public static void z(String str, int i10, String str2) {
        a5.a.B(str2, str + i10);
    }
}
