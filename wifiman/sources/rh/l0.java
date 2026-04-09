package Rh;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import pi.H0;
import ri.InterfaceC7618i;

/* loaded from: classes4.dex */
public abstract class l0 {
    public static final C3480h a(C3480h c3480h, Collection superQualifiers, boolean z10, boolean z11, boolean z12) {
        EnumC3483k enumC3483kD;
        boolean z13;
        AbstractC6492s.i(c3480h, "<this>");
        AbstractC6492s.i(superQualifiers, "superQualifiers");
        Collection collection = superQualifiers;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            EnumC3483k enumC3483kB = b((C3480h) it.next());
            if (enumC3483kB != null) {
                arrayList.add(enumC3483kB);
            }
        }
        EnumC3483k enumC3483kD2 = d(AbstractC3689v.n1(arrayList), b(c3480h), z10);
        if (enumC3483kD2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                EnumC3483k enumC3483kF = ((C3480h) it2.next()).f();
                if (enumC3483kF != null) {
                    arrayList2.add(enumC3483kF);
                }
            }
            enumC3483kD = d(AbstractC3689v.n1(arrayList2), c3480h.f(), z10);
        } else {
            enumC3483kD = enumC3483kD2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = collection.iterator();
        while (it3.hasNext()) {
            EnumC3481i enumC3481iE = ((C3480h) it3.next()).e();
            if (enumC3481iE != null) {
                arrayList3.add(enumC3481iE);
            }
        }
        EnumC3481i enumC3481i = (EnumC3481i) e(AbstractC3689v.n1(arrayList3), EnumC3481i.MUTABLE, EnumC3481i.READ_ONLY, c3480h.e(), z10);
        EnumC3483k enumC3483k = null;
        if (enumC3483kD != null && !z12 && (!z11 || enumC3483kD != EnumC3483k.NULLABLE)) {
            enumC3483k = enumC3483kD;
        }
        boolean z14 = false;
        if (enumC3483k == EnumC3483k.NOT_NULL) {
            if (!c3480h.d()) {
                if (!collection.isEmpty()) {
                    Iterator it4 = collection.iterator();
                    while (it4.hasNext()) {
                        if (((C3480h) it4.next()).d()) {
                        }
                    }
                }
                z13 = false;
            }
            z13 = true;
            break;
        }
        z13 = false;
        if (enumC3483k != null && enumC3483kD2 != enumC3483kD) {
            z14 = true;
        }
        return new C3480h(enumC3483k, enumC3481i, z13, z14);
    }

    private static final EnumC3483k b(C3480h c3480h) {
        if (c3480h.g()) {
            return null;
        }
        return c3480h.f();
    }

    public static final boolean c(H0 h02, InterfaceC7618i type) {
        AbstractC6492s.i(h02, "<this>");
        AbstractC6492s.i(type, "type");
        Zh.c ENHANCED_NULLABILITY_ANNOTATION = Jh.I.f10123v;
        AbstractC6492s.h(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return h02.t0(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    private static final EnumC3483k d(Set set, EnumC3483k enumC3483k, boolean z10) {
        EnumC3483k enumC3483k2 = EnumC3483k.FORCE_FLEXIBILITY;
        return enumC3483k == enumC3483k2 ? enumC3483k2 : (EnumC3483k) e(set, EnumC3483k.NOT_NULL, EnumC3483k.NULLABLE, enumC3483k, z10);
    }

    private static final Object e(Set set, Object obj, Object obj2, Object obj3, boolean z10) {
        Set setN1;
        if (!z10) {
            if (obj3 != null && (setN1 = AbstractC3689v.n1(Zg.d0.m(set, obj3))) != null) {
                set = setN1;
            }
            return AbstractC3689v.S0(set);
        }
        Object obj4 = set.contains(obj) ? obj : set.contains(obj2) ? obj2 : null;
        if (AbstractC6492s.d(obj4, obj) && AbstractC6492s.d(obj3, obj2)) {
            return null;
        }
        return obj3 == null ? obj4 : obj3;
    }
}
