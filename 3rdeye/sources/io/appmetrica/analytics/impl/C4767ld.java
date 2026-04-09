package io.appmetrica.analytics.impl;

import c9.C2092m;
import c9.C2095p;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.ld, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4767ld {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f41187a = new LinkedHashSet();

    public final synchronized Set a() {
        ArrayList arrayList;
        try {
            LinkedHashSet linkedHashSet = this.f41187a;
            ArrayList arrayList2 = new ArrayList(C2092m.T(linkedHashSet, 10));
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList2.add(((InterfaceC4741kd) it.next()).a());
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList.add(next);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return C2097r.L0(arrayList);
    }

    public final synchronized void a(InterfaceC4741kd... interfaceC4741kdArr) {
        C2095p.c0(this.f41187a, interfaceC4741kdArr);
    }
}
