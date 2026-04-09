package io.appmetrica.analytics.impl;

import c9.C2092m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class Nn {
    public static final Kn a(Throwable th, U u8, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        An anA = th != null ? Bn.a(th, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(C2092m.T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Al((StackTraceElement) it.next()));
            }
        }
        return new Kn(anA, u8, arrayList, null, null, null, str, bool);
    }
}
