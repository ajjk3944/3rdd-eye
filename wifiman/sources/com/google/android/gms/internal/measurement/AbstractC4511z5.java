package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.z5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4511z5 {

    /* renamed from: a, reason: collision with root package name */
    private static final L5 f35546a = new O5();

    static int A(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjr.P(i10, 0L);
    }

    static int B(List list) {
        return list.size() << 3;
    }

    public static void C(int i10, List list, InterfaceC4331d6 interfaceC4331d6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.x(i10, list, z10);
    }

    static int D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * zzjr.s0(i10));
    }

    static int E(List list) {
        int iG0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G4) {
            G4 g42 = (G4) list;
            iG0 = 0;
            while (i10 < size) {
                iG0 += zzjr.g0(g42.e(i10));
                i10++;
            }
        } else {
            iG0 = 0;
            while (i10 < size) {
                iG0 += zzjr.g0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iG0;
    }

    public static void F(int i10, List list, InterfaceC4331d6 interfaceC4331d6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.v(i10, list, z10);
    }

    static int G(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return H(list) + (list.size() * zzjr.s0(i10));
    }

    static int H(List list) {
        int iA0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S4) {
            S4 s42 = (S4) list;
            iA0 = 0;
            while (i10 < size) {
                iA0 += zzjr.a0(s42.r(i10));
                i10++;
            }
        } else {
            iA0 = 0;
            while (i10 < size) {
                iA0 += zzjr.a0(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iA0;
    }

    public static void I(int i10, List list, InterfaceC4331d6 interfaceC4331d6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.E(i10, list, z10);
    }

    static int J(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return K(list) + (size * zzjr.s0(i10));
    }

    static int K(List list) {
        int iO0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G4) {
            G4 g42 = (G4) list;
            iO0 = 0;
            while (i10 < size) {
                iO0 += zzjr.o0(g42.e(i10));
                i10++;
            }
        } else {
            iO0 = 0;
            while (i10 < size) {
                iO0 += zzjr.o0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iO0;
    }

    public static void L(int i10, List list, InterfaceC4331d6 interfaceC4331d6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.zzg(i10, list, z10);
    }

    static int M(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * zzjr.s0(i10));
    }

    static int N(List list) {
        int iJ0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S4) {
            S4 s42 = (S4) list;
            iJ0 = 0;
            while (i10 < size) {
                iJ0 += zzjr.j0(s42.r(i10));
                i10++;
            }
        } else {
            iJ0 = 0;
            while (i10 < size) {
                iJ0 += zzjr.j0(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iJ0;
    }

    public static void O(int i10, List list, InterfaceC4331d6 interfaceC4331d6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.g(i10, list, z10);
    }

    static int P(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Q(list) + (size * zzjr.s0(i10));
    }

    static int Q(List list) {
        int iV0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G4) {
            G4 g42 = (G4) list;
            iV0 = 0;
            while (i10 < size) {
                iV0 += zzjr.v0(g42.e(i10));
                i10++;
            }
        } else {
            iV0 = 0;
            while (i10 < size) {
                iV0 += zzjr.v0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iV0;
    }

    public static void R(int i10, List list, InterfaceC4331d6 interfaceC4331d6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.b(i10, list, z10);
    }

    static int S(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * zzjr.s0(i10));
    }

    static int T(List list) {
        int iN0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S4) {
            S4 s42 = (S4) list;
            iN0 = 0;
            while (i10 < size) {
                iN0 += zzjr.n0(s42.r(i10));
                i10++;
            }
        } else {
            iN0 = 0;
            while (i10 < size) {
                iN0 += zzjr.n0(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iN0;
    }

    public static void U(int i10, List list, InterfaceC4331d6 interfaceC4331d6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.zzj(i10, list, z10);
    }

    public static void V(int i10, List list, InterfaceC4331d6 interfaceC4331d6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.o(i10, list, z10);
    }

    public static void W(int i10, List list, InterfaceC4331d6 interfaceC4331d6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.zzl(i10, list, z10);
    }

    public static void X(int i10, List list, InterfaceC4331d6 interfaceC4331d6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.z(i10, list, z10);
    }

    public static void Y(int i10, List list, InterfaceC4331d6 interfaceC4331d6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.zzn(i10, list, z10);
    }

    static int a(int i10, Object obj, InterfaceC4495x5 interfaceC4495x5) {
        return zzjr.R(i10, (InterfaceC4366h5) obj, interfaceC4495x5);
    }

    static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS0 = size * zzjr.s0(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iS0 += zzjr.A((V3) list.get(i11));
        }
        return iS0;
    }

    static int c(int i10, List list, InterfaceC4495x5 interfaceC4495x5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iX += zzjr.x(i10, (InterfaceC4366h5) list.get(i11), interfaceC4495x5);
        }
        return iX;
    }

    static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjr.z(i10, true);
    }

    static int e(List list) {
        return list.size();
    }

    public static L5 f() {
        return f35546a;
    }

    static Object g(Object obj, int i10, int i11, Object obj2, L5 l52) {
        if (obj2 == null) {
            obj2 = l52.i(obj);
        }
        l52.f(obj2, i10, i11);
        return obj2;
    }

    static Object h(Object obj, int i10, List list, H4 h42, Object obj2, L5 l52) {
        if (h42 == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = (Integer) list.get(i12);
                int iIntValue = num.intValue();
                if (h42.zza(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    obj2 = g(obj, i10, iIntValue, obj2, l52);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!h42.zza(iIntValue2)) {
                    obj2 = g(obj, i10, iIntValue2, obj2, l52);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static void i(int i10, List list, InterfaceC4331d6 interfaceC4331d6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.H(i10, list);
    }

    public static void j(int i10, List list, InterfaceC4331d6 interfaceC4331d6, InterfaceC4495x5 interfaceC4495x5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.k(i10, list, interfaceC4495x5);
    }

    public static void k(int i10, List list, InterfaceC4331d6 interfaceC4331d6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.f(i10, list, z10);
    }

    static void l(AbstractC4446r4 abstractC4446r4, Object obj, Object obj2) {
        C4486w4 c4486w4B = abstractC4446r4.b(obj2);
        if (c4486w4B.f35517a.isEmpty()) {
            return;
        }
        abstractC4446r4.e(obj).f(c4486w4B);
    }

    static void m(InterfaceC4303a5 interfaceC4303a5, Object obj, Object obj2, long j10) {
        N5.j(obj, j10, interfaceC4303a5.c(N5.B(obj, j10), N5.B(obj2, j10)));
    }

    static void n(L5 l52, Object obj, Object obj2) {
        l52.j(obj, l52.b(l52.k(obj), l52.k(obj2)));
    }

    public static void o(Class cls) {
        D4.class.isAssignableFrom(cls);
    }

    static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int q(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iS0 = zzjr.s0(i10) * size;
        if (list instanceof O4) {
            O4 o42 = (O4) list;
            while (i11 < size) {
                Object objZza = o42.zza(i11);
                iS0 += objZza instanceof V3 ? zzjr.A((V3) objZza) : zzjr.C((String) objZza);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iS0 += obj instanceof V3 ? zzjr.A((V3) obj) : zzjr.C((String) obj);
                i11++;
            }
        }
        return iS0;
    }

    static int r(int i10, List list, InterfaceC4495x5 interfaceC4495x5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS0 = zzjr.s0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            iS0 += zzjr.g((InterfaceC4366h5) list.get(i11), interfaceC4495x5);
        }
        return iS0;
    }

    static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * zzjr.s0(i10));
    }

    static int t(List list) {
        int iX;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G4) {
            G4 g42 = (G4) list;
            iX = 0;
            while (i10 < size) {
                iX += zzjr.X(g42.e(i10));
                i10++;
            }
        } else {
            iX = 0;
            while (i10 < size) {
                iX += zzjr.X(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iX;
    }

    public static void u(int i10, List list, InterfaceC4331d6 interfaceC4331d6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.A(i10, list);
    }

    public static void v(int i10, List list, InterfaceC4331d6 interfaceC4331d6, InterfaceC4495x5 interfaceC4495x5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.y(i10, list, interfaceC4495x5);
    }

    public static void w(int i10, List list, InterfaceC4331d6 interfaceC4331d6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.l(i10, list, z10);
    }

    static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjr.h0(i10, 0);
    }

    static int y(List list) {
        return list.size() << 2;
    }

    public static void z(int i10, List list, InterfaceC4331d6 interfaceC4331d6, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4331d6.zzc(i10, list, z10);
    }
}
