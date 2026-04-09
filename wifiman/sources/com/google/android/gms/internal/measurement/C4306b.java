package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4306b {

    /* renamed from: a, reason: collision with root package name */
    private final TreeMap f35181a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    private final TreeMap f35182b = new TreeMap();

    private static int a(Z2 z22, C4457t c4457t, InterfaceC4449s interfaceC4449s) {
        InterfaceC4449s interfaceC4449sA = c4457t.a(z22, Collections.singletonList(interfaceC4449s));
        if (interfaceC4449sA instanceof C4386k) {
            return AbstractC4354g2.i(interfaceC4449sA.zze().doubleValue());
        }
        return -1;
    }

    public final void b(Z2 z22, C4324d c4324d) {
        M5 m52 = new M5(c4324d);
        for (Integer num : this.f35181a.keySet()) {
            C4333e c4333e = (C4333e) c4324d.d().clone();
            int iA = a(z22, (C4457t) this.f35181a.get(num), m52);
            if (iA == 2 || iA == -1) {
                c4324d.e(c4333e);
            }
        }
        Iterator it = this.f35182b.keySet().iterator();
        while (it.hasNext()) {
            a(z22, (C4457t) this.f35182b.get((Integer) it.next()), m52);
        }
    }

    public final void c(String str, int i10, C4457t c4457t, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f35182b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: " + str2);
            }
            treeMap = this.f35181a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), c4457t);
    }
}
