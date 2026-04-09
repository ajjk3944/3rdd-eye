package com.yandex.mobile.ads.impl;

import c9.C2092m;
import c9.C2095p;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class m02 {
    public static ArrayList a(List list, ir0 ir0Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a(ir0Var));
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.addAll(a(((ag) it.next()).a()));
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private static List a(ir0 ir0Var) {
        List<InterfaceC4200t> listA;
        if (ir0Var != null && (listA = ir0Var.a()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (obj instanceof k02) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List<n02> listC = ((k02) it.next()).c();
                ArrayList arrayList3 = new ArrayList(C2092m.T(listC, 10));
                Iterator<T> it2 = listC.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((n02) it2.next()).c().a());
                }
                C2095p.b0(arrayList3, arrayList2);
            }
            return arrayList2;
        }
        return C2099t.f18581b;
    }
}
