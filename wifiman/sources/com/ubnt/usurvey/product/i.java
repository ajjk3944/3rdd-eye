package com.ubnt.usurvey.product;

import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import ab.C3781d;
import bb.C4079a;
import fh.InterfaceC5826a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import ua.InterfaceC8153a;
import xa.InterfaceC8439a;
import zi.AbstractC8783m;

/* loaded from: classes3.dex */
public final class i implements InterfaceC8439a.c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.s f(l localProduct) {
        AbstractC6492s.i(localProduct, "localProduct");
        return z.a(InterfaceC8153a.C2195a.a(localProduct.m16getId2jxHnRY()), localProduct);
    }

    @Override // xa.InterfaceC8439a.c
    public InterfaceC8439a.b a() {
        j jVar = j.f39678a;
        String strA = jVar.a();
        Ya.a aVarA = strA != null ? Ya.a.f24826a.a(strA) : null;
        Long lB = jVar.b();
        C4079a.C1151a c1151a = new C4079a.C1151a(lB != null ? lB.longValue() : 0L, aVarA);
        String strC = jVar.c();
        if (strC == null) {
            strC = "no_version";
        }
        String strA2 = C4079a.b.a(strC);
        InterfaceC5826a entries = l.getEntries();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            C3781d c3781dA = u.a((l) it.next());
            if (c3781dA != null) {
                arrayList.add(c3781dA);
            }
        }
        return new InterfaceC8439a.b(c1151a, new C4079a(strA2, arrayList, null));
    }

    @Override // xa.InterfaceC8439a.c
    public Map b() {
        return U.u(AbstractC8783m.N(AbstractC3689v.d0(l.getEntries()), new InterfaceC6835l() { // from class: com.ubnt.usurvey.product.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.f((l) obj);
            }
        }));
    }

    @Override // xa.InterfaceC8439a.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(l lVar) {
        return InterfaceC8439a.c.C2314a.a(this, lVar);
    }
}
