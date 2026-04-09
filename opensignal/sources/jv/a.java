package jv;

import br.l;
import io.sentry.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import mv.d;
import p.l2;
import uv.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final tv.b f13863a;

    /* renamed from: b, reason: collision with root package name */
    public final l2 f13864b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f13865c;

    public a() {
        tv.b bVar = new tv.b();
        bVar.f23029g = this;
        bVar.f23027a = new HashMap();
        bVar.f23028d = new HashMap();
        this.f13863a = bVar;
        new ConcurrentHashMap();
        pv.a aVar = pv.a.NONE;
        l.e(aVar, "level");
        l2 l2Var = new l2(4, false);
        l2Var.f20100d = aVar;
        this.f13864b = l2Var;
        this.f13865c = new HashSet();
    }

    public static void b(a aVar, List list) {
        Object next;
        aVar.getClass();
        aVar.f13865c.addAll(list);
        tv.b bVar = aVar.f13863a;
        bVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qv.a aVar2 = (qv.a) it.next();
            if (aVar2.f21093b) {
                l2 l2Var = ((a) bVar.f23029g).f13864b;
                String str = "module '" + aVar2 + "' already loaded!";
                l2Var.getClass();
                l.e(str, "msg");
                l2Var.B(pv.a.ERROR, str);
            } else {
                HashMap map = (HashMap) bVar.f23027a;
                Iterator it2 = aVar2.f21094c.iterator();
                while (it2.hasNext()) {
                    sv.a aVar3 = (sv.a) it2.next();
                    c cVar = new c(aVar3, false);
                    String str2 = aVar3.f22363a;
                    if (map.get(str2) == null) {
                        map.put(str2, cVar);
                    }
                }
                Iterator it3 = aVar2.f21095d.iterator();
                while (it3.hasNext()) {
                    mv.b bVar2 = (mv.b) it3.next();
                    l.e(bVar2, "bean");
                    d dVar = bVar2.f17065g;
                    c cVar2 = (c) map.get(bVar2.f17059a.f22363a);
                    if (cVar2 == null) {
                        throw new IllegalStateException(l.k(bVar2, "Undeclared scope definition for definition: ").toString());
                    }
                    HashSet hashSet = cVar2.f23728c;
                    if (hashSet.contains(bVar2)) {
                        if (!dVar.f17068b) {
                            Iterator it4 = hashSet.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    next = it4.next();
                                    if (l.a((mv.b) next, bVar2)) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            throw new ba.l("Definition '" + bVar2 + "' try to override existing definition. Please use override option or check for definition '" + ((mv.b) next) + '\'');
                        }
                        hashSet.remove(bVar2);
                    }
                    hashSet.add(bVar2);
                    Collection collectionValues = ((HashMap) bVar.f23028d).values();
                    l.d(collectionValues, "_scopes.values");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : collectionValues) {
                        if (((uv.b) obj).f23720a.equals(cVar2)) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        uv.b bVar3 = (uv.b) it5.next();
                        bVar3.getClass();
                        qm.c cVar3 = bVar3.f23723d;
                        cVar3.getClass();
                        cVar3.M(bVar2, dVar.f17068b);
                    }
                }
                aVar2.f21093b = true;
            }
        }
    }

    public final void a() {
        uv.b bVarB = this.f13863a.b();
        if (bVarB.f23720a.f23727b) {
            qm.c cVar = bVarB.f23723d;
            Collection collectionValues = ((HashMap) cVar.f20920r).values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (obj instanceof ov.c) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((ov.c) next).f20011b.f17065g.f17067a) {
                    arrayList2.add(next);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((ov.c) it2.next()).b(new t((a) cVar.f20918d, (uv.b) cVar.f20919g, (ar.a) null));
            }
        }
    }
}
