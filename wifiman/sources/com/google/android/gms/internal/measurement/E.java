package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private Map f34988a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private U f34989b = new U();

    public E() {
        b(new C4497y());
        b(new D());
        b(new F());
        b(new J());
        b(new L());
        b(new S());
        b(new X());
    }

    private final void b(A a10) {
        Iterator it = a10.f34919a.iterator();
        while (it.hasNext()) {
            this.f34988a.put(((Z) it.next()).toString(), a10);
        }
    }

    public final InterfaceC4449s a(Z2 z22, InterfaceC4449s interfaceC4449s) {
        AbstractC4354g2.b(z22);
        if (!(interfaceC4449s instanceof C4473v)) {
            return interfaceC4449s;
        }
        C4473v c4473v = (C4473v) interfaceC4449s;
        ArrayList arrayListB = c4473v.b();
        String strA = c4473v.a();
        return (this.f34988a.containsKey(strA) ? (A) this.f34988a.get(strA) : this.f34989b).b(strA, z22, arrayListB);
    }
}
