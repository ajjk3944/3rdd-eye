package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class L2 {

    /* renamed from: a, reason: collision with root package name */
    private static final V2 f35609a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f35610b = 0;

    static {
        int i10 = G2.f35591d;
        f35609a = new X2();
    }

    public static void A(int i10, List list, InterfaceC4627k3 interfaceC4627k3, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4627k3.zzl(i10, list, z10);
    }

    public static void B(int i10, List list, InterfaceC4627k3 interfaceC4627k3, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4627k3.zzn(i10, list, z10);
    }

    public static void C(int i10, List list, InterfaceC4627k3 interfaceC4627k3, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4627k3.zzp(i10, list, z10);
    }

    public static void D(int i10, List list, InterfaceC4627k3 interfaceC4627k3, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4627k3.zzs(i10, list, z10);
    }

    public static void E(int i10, List list, InterfaceC4627k3 interfaceC4627k3, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4627k3.zzu(i10, list, z10);
    }

    public static void F(int i10, List list, InterfaceC4627k3 interfaceC4627k3, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4627k3.b(i10, list, z10);
    }

    public static void a(int i10, List list, InterfaceC4627k3 interfaceC4627k3, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4627k3.l(i10, list, z10);
    }

    public static void b(int i10, List list, InterfaceC4627k3 interfaceC4627k3, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4627k3.r(i10, list, z10);
    }

    public static void c(int i10, List list, InterfaceC4627k3 interfaceC4627k3, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4627k3.c(i10, list, z10);
    }

    public static void d(int i10, List list, InterfaceC4627k3 interfaceC4627k3, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4627k3.n(i10, list, z10);
    }

    public static void e(int i10, List list, InterfaceC4627k3 interfaceC4627k3, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4627k3.s(i10, list, z10);
    }

    static boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int g(List list) {
        int iG;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4527b2) {
            C4527b2 c4527b2 = (C4527b2) list;
            iG = 0;
            while (i10 < size) {
                iG += I1.g(c4527b2.e(i10));
                i10++;
            }
        } else {
            iG = 0;
            while (i10 < size) {
                iG += I1.g(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iG;
    }

    static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (I1.f(i10 << 3) + 4);
    }

    static int i(List list) {
        return list.size() * 4;
    }

    static int j(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (I1.f(i10 << 3) + 8);
    }

    static int k(List list) {
        return list.size() * 8;
    }

    static int l(List list) {
        int iG;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4527b2) {
            C4527b2 c4527b2 = (C4527b2) list;
            iG = 0;
            while (i10 < size) {
                iG += I1.g(c4527b2.e(i10));
                i10++;
            }
        } else {
            iG = 0;
            while (i10 < size) {
                iG += I1.g(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iG;
    }

    static int m(List list) {
        int iG;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4659n2) {
            C4659n2 c4659n2 = (C4659n2) list;
            iG = 0;
            while (i10 < size) {
                iG += I1.g(c4659n2.e(i10));
                i10++;
            }
        } else {
            iG = 0;
            while (i10 < size) {
                iG += I1.g(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iG;
    }

    static int n(int i10, Object obj, J2 j22) {
        return I1.f(i10 << 3) + I1.d((InterfaceC4790z2) obj, j22);
    }

    static int o(List list) {
        int iF;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4527b2) {
            C4527b2 c4527b2 = (C4527b2) list;
            iF = 0;
            while (i10 < size) {
                int iE = c4527b2.e(i10);
                iF += I1.f((iE >> 31) ^ (iE + iE));
                i10++;
            }
        } else {
            iF = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iF += I1.f((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iF;
    }

    static int p(List list) {
        int iG;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4659n2) {
            C4659n2 c4659n2 = (C4659n2) list;
            iG = 0;
            while (i10 < size) {
                long jE = c4659n2.e(i10);
                iG += I1.g((jE >> 63) ^ (jE + jE));
                i10++;
            }
        } else {
            iG = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iG += I1.g((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iG;
    }

    static int q(List list) {
        int iF;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4527b2) {
            C4527b2 c4527b2 = (C4527b2) list;
            iF = 0;
            while (i10 < size) {
                iF += I1.f(c4527b2.e(i10));
                i10++;
            }
        } else {
            iF = 0;
            while (i10 < size) {
                iF += I1.f(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iF;
    }

    static int r(List list) {
        int iG;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4659n2) {
            C4659n2 c4659n2 = (C4659n2) list;
            iG = 0;
            while (i10 < size) {
                iG += I1.g(c4659n2.e(i10));
                i10++;
            }
        } else {
            iG = 0;
            while (i10 < size) {
                iG += I1.g(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iG;
    }

    public static V2 s() {
        return f35609a;
    }

    static Object t(Object obj, int i10, List list, InterfaceC4538c2 interfaceC4538c2, Object obj2, V2 v22) {
        if (interfaceC4538c2 == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = (Integer) list.get(i12);
                int iIntValue = num.intValue();
                if (interfaceC4538c2.zza(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    obj2 = u(obj, i10, iIntValue, obj2, v22);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!interfaceC4538c2.zza(iIntValue2)) {
                    obj2 = u(obj, i10, iIntValue2, obj2, v22);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object u(Object obj, int i10, int i11, Object obj2, V2 v22) {
        if (obj2 == null) {
            obj2 = v22.a(obj);
        }
        v22.c(obj2, i10, i11);
        return obj2;
    }

    static void v(O1 o12, Object obj, Object obj2) {
        S1 s12 = ((Y1) obj2).zzb;
        if (s12.f35633a.isEmpty()) {
            return;
        }
        ((Y1) obj).A().h(s12);
    }

    static void w(V2 v22, Object obj, Object obj2) {
        AbstractC4516a2 abstractC4516a2 = (AbstractC4516a2) obj;
        W2 w2E = abstractC4516a2.zzc;
        W2 w22 = ((AbstractC4516a2) obj2).zzc;
        if (!W2.c().equals(w22)) {
            if (W2.c().equals(w2E)) {
                w2E = W2.e(w2E, w22);
            } else {
                w2E.d(w22);
            }
        }
        abstractC4516a2.zzc = w2E;
    }

    public static void x(int i10, List list, InterfaceC4627k3 interfaceC4627k3, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4627k3.zzc(i10, list, z10);
    }

    public static void y(int i10, List list, InterfaceC4627k3 interfaceC4627k3, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4627k3.zzg(i10, list, z10);
    }

    public static void z(int i10, List list, InterfaceC4627k3 interfaceC4627k3, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4627k3.zzj(i10, list, z10);
    }
}
