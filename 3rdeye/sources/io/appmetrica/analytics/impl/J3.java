package io.appmetrica.analytics.impl;

import c9.C2097r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class J3 implements Vn {
    @Override // io.appmetrica.analytics.impl.Vn, p9.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<N3> invoke(List<N3> list, N3 n32) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                EnumC4685i8 enumC4685i8 = ((N3) it.next()).f39889b;
                EnumC4685i8 enumC4685i82 = n32.f39889b;
                if (enumC4685i8 == enumC4685i82) {
                    if (enumC4685i82 != EnumC4685i8.f41060c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((N3) obj).f39889b != EnumC4685i8.f41060c) {
                            arrayList.add(obj);
                        }
                    }
                    return C2097r.z0(arrayList, n32);
                }
            }
        }
        return C2097r.z0(list, n32);
    }
}
