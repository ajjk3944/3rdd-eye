package Q0;

import Q0.A;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Q0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3443u {
    public final List a(List list, A a10, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            InterfaceC3433j interfaceC3433j = (InterfaceC3433j) obj;
            if (AbstractC6492s.d(interfaceC3433j.b(), a10) && v.f(interfaceC3433j.c(), i10)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Object obj2 = list.get(i13);
            if (v.f(((InterfaceC3433j) obj2).c(), i10)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        List list2 = list;
        A.a aVar = A.f18971b;
        A a11 = null;
        if (a10.compareTo(aVar.f()) < 0) {
            int size3 = list2.size();
            A a12 = null;
            int i14 = 0;
            while (true) {
                if (i14 >= size3) {
                    break;
                }
                A aB = ((InterfaceC3433j) list2.get(i14)).b();
                if (aB.compareTo(a10) >= 0) {
                    if (aB.compareTo(a10) <= 0) {
                        a12 = aB;
                        a11 = a12;
                        break;
                    }
                    if (a12 == null || aB.compareTo(a12) < 0) {
                        a12 = aB;
                    }
                } else if (a11 == null || aB.compareTo(a11) > 0) {
                    a11 = aB;
                }
                i14++;
            }
            if (a11 != null) {
                a12 = a11;
            }
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size4 = list2.size();
            while (i11 < size4) {
                Object obj3 = list2.get(i11);
                if (AbstractC6492s.d(((InterfaceC3433j) obj3).b(), a12)) {
                    arrayList3.add(obj3);
                }
                i11++;
            }
            return arrayList3;
        }
        if (a10.compareTo(aVar.g()) > 0) {
            int size5 = list2.size();
            A a13 = null;
            int i15 = 0;
            while (true) {
                if (i15 >= size5) {
                    break;
                }
                A aB2 = ((InterfaceC3433j) list2.get(i15)).b();
                if (aB2.compareTo(a10) >= 0) {
                    if (aB2.compareTo(a10) <= 0) {
                        a13 = aB2;
                        a11 = a13;
                        break;
                    }
                    if (a13 == null || aB2.compareTo(a13) < 0) {
                        a13 = aB2;
                    }
                } else if (a11 == null || aB2.compareTo(a11) > 0) {
                    a11 = aB2;
                }
                i15++;
            }
            if (a13 == null) {
                a13 = a11;
            }
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size6 = list2.size();
            while (i11 < size6) {
                Object obj4 = list2.get(i11);
                if (AbstractC6492s.d(((InterfaceC3433j) obj4).b(), a13)) {
                    arrayList4.add(obj4);
                }
                i11++;
            }
            return arrayList4;
        }
        A aG = aVar.g();
        int size7 = list2.size();
        A a14 = null;
        A a15 = null;
        int i16 = 0;
        while (true) {
            if (i16 >= size7) {
                break;
            }
            A aB3 = ((InterfaceC3433j) list2.get(i16)).b();
            if (aG == null || aB3.compareTo(aG) <= 0) {
                if (aB3.compareTo(a10) >= 0) {
                    if (aB3.compareTo(a10) <= 0) {
                        a14 = aB3;
                        a15 = a14;
                        break;
                    }
                    if (a15 == null || aB3.compareTo(a15) < 0) {
                        a15 = aB3;
                    }
                } else if (a14 == null || aB3.compareTo(a14) > 0) {
                    a14 = aB3;
                }
            }
            i16++;
        }
        if (a15 != null) {
            a14 = a15;
        }
        ArrayList arrayList5 = new ArrayList(list2.size());
        int size8 = list2.size();
        for (int i17 = 0; i17 < size8; i17++) {
            Object obj5 = list2.get(i17);
            if (AbstractC6492s.d(((InterfaceC3433j) obj5).b(), a14)) {
                arrayList5.add(obj5);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        A aG2 = A.f18971b.g();
        int size9 = list2.size();
        A a16 = null;
        int i18 = 0;
        while (true) {
            if (i18 >= size9) {
                break;
            }
            A aB4 = ((InterfaceC3433j) list2.get(i18)).b();
            if (aG2 == null || aB4.compareTo(aG2) >= 0) {
                if (aB4.compareTo(a10) >= 0) {
                    if (aB4.compareTo(a10) <= 0) {
                        a11 = aB4;
                        a16 = a11;
                        break;
                    }
                    if (a16 == null || aB4.compareTo(a16) < 0) {
                        a16 = aB4;
                    }
                } else if (a11 == null || aB4.compareTo(a11) > 0) {
                    a11 = aB4;
                }
            }
            i18++;
        }
        if (a16 != null) {
            a11 = a16;
        }
        ArrayList arrayList6 = new ArrayList(list2.size());
        int size10 = list2.size();
        while (i11 < size10) {
            Object obj6 = list2.get(i11);
            if (AbstractC6492s.d(((InterfaceC3433j) obj6).b(), a11)) {
                arrayList6.add(obj6);
            }
            i11++;
        }
        return arrayList6;
    }
}
