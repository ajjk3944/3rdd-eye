package com.yandex.mobile.ads.impl;

import N7.G8;
import R9.AbstractC1564a;
import c9.C2092m;
import c9.C2095p;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import t9.c;

/* loaded from: classes3.dex */
public final class xk0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1564a f35342a;

    /* renamed from: b, reason: collision with root package name */
    private final nj f35343b;

    public xk0(AbstractC1564a jsonSerializer, nj dataEncoder) {
        kotlin.jvm.internal.l.f(jsonSerializer, "jsonSerializer");
        kotlin.jvm.internal.l.f(dataEncoder, "dataEncoder");
        this.f35342a = jsonSerializer;
        this.f35343b = dataEncoder;
    }

    public final String a(nx reportData) {
        ArrayList arrayListY0;
        kotlin.jvm.internal.l.f(reportData, "reportData");
        AbstractC1564a abstractC1564a = this.f35342a;
        AbstractC1564a.f11780d.getClass();
        String strB = abstractC1564a.b(nx.Companion.serializer(), reportData);
        this.f35343b.getClass();
        String strA = nj.a(strB);
        if (strA == null) {
            strA = "";
        }
        Iterable cVar = new v9.c('A', 'Z');
        v9.c cVar2 = new v9.c('a', 'z');
        if (cVar instanceof Collection) {
            arrayListY0 = C2097r.y0(cVar2, (Collection) cVar);
        } else {
            ArrayList arrayList = new ArrayList();
            C2095p.b0(cVar, arrayList);
            C2095p.b0(cVar2, arrayList);
            arrayListY0 = arrayList;
        }
        v9.g gVar = new v9.g(1, 3, 1);
        ArrayList arrayList2 = new ArrayList(C2092m.T(gVar, 10));
        v9.f it = gVar.iterator();
        while (it.f47101d) {
            it.a();
            c.a random = t9.c.f46467b;
            kotlin.jvm.internal.l.f(random, "random");
            if (arrayListY0.isEmpty()) {
                throw new NoSuchElementException("Collection is empty.");
            }
            int size = arrayListY0.size();
            random.getClass();
            Character ch = (Character) arrayListY0.get(t9.c.f46468c.d().nextInt(size));
            ch.getClass();
            arrayList2.add(ch);
        }
        return G8.s(C2097r.u0(arrayList2, "", null, null, null, 62), strA);
    }
}
