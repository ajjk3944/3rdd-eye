package ii;

import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2515z;
import Bh.Y;
import Bh.f0;
import Zg.AbstractC3689v;
import ii.InterfaceC6167n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mh.InterfaceC6835l;
import pi.S;
import xi.AbstractC8534a;
import xi.C8544k;

/* renamed from: ii.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6159f extends AbstractC6165l {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ th.l[] f49211d = {O.h(new F(O.b(AbstractC6159f.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2495e f49212b;

    /* renamed from: c, reason: collision with root package name */
    private final oi.i f49213c;

    /* renamed from: ii.f$a */
    public static final class a extends bi.m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f49214a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6159f f49215b;

        a(ArrayList arrayList, AbstractC6159f abstractC6159f) {
            this.f49214a = arrayList;
            this.f49215b = abstractC6159f;
        }

        @Override // bi.n
        public void a(InterfaceC2492b fakeOverride) {
            AbstractC6492s.i(fakeOverride, "fakeOverride");
            bi.o.K(fakeOverride, null);
            this.f49214a.add(fakeOverride);
        }

        @Override // bi.m
        protected void e(InterfaceC2492b fromSuper, InterfaceC2492b fromCurrent) {
            AbstractC6492s.i(fromSuper, "fromSuper");
            AbstractC6492s.i(fromCurrent, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f49215b.m() + ": " + fromSuper + " vs " + fromCurrent).toString());
        }
    }

    public AbstractC6159f(oi.n storageManager, InterfaceC2495e containingClass) {
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(containingClass, "containingClass");
        this.f49212b = containingClass;
        this.f49213c = storageManager.f(new C6158e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(AbstractC6159f abstractC6159f) {
        List listJ = abstractC6159f.j();
        return AbstractC3689v.M0(listJ, abstractC6159f.k(listJ));
    }

    private final List k(List list) {
        Collection collectionL;
        ArrayList arrayList = new ArrayList(3);
        Collection collectionA = this.f49212b.k().a();
        AbstractC6492s.h(collectionA, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            AbstractC3689v.C(arrayList2, InterfaceC6167n.a.a(((S) it.next()).r(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof InterfaceC2492b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            Zh.f name = ((InterfaceC2492b) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            AbstractC6492s.h(key, "component1(...)");
            Zh.f fVar = (Zh.f) key;
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((InterfaceC2492b) obj3) instanceof InterfaceC2515z);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                bi.o oVar = bi.o.f33360f;
                List list4 = list3;
                if (zBooleanValue) {
                    collectionL = new ArrayList();
                    for (Object obj4 : list) {
                        if (AbstractC6492s.d(((InterfaceC2515z) obj4).getName(), fVar)) {
                            collectionL.add(obj4);
                        }
                    }
                } else {
                    collectionL = AbstractC3689v.l();
                }
                oVar.v(fVar, list4, collectionL, this.f49212b, new a(arrayList, this));
            }
        }
        return AbstractC8534a.c(arrayList);
    }

    private final List l() {
        return (List) oi.m.a(this.f49213c, this, f49211d[0]);
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Collection b(Zh.f name, Ih.b location) {
        List listL;
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        List listL2 = l();
        if (listL2.isEmpty()) {
            listL = AbstractC3689v.l();
        } else {
            C8544k c8544k = new C8544k();
            for (Object obj : listL2) {
                if ((obj instanceof f0) && AbstractC6492s.d(((f0) obj).getName(), name)) {
                    c8544k.add(obj);
                }
            }
            listL = c8544k;
        }
        return listL;
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Collection d(Zh.f name, Ih.b location) {
        List listL;
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        List listL2 = l();
        if (listL2.isEmpty()) {
            listL = AbstractC3689v.l();
        } else {
            C8544k c8544k = new C8544k();
            for (Object obj : listL2) {
                if ((obj instanceof Y) && AbstractC6492s.d(((Y) obj).getName(), name)) {
                    c8544k.add(obj);
                }
            }
            listL = c8544k;
        }
        return listL;
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6167n
    public Collection e(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        return !kindFilter.a(C6157d.f49195p.m()) ? AbstractC3689v.l() : l();
    }

    protected abstract List j();

    protected final InterfaceC2495e m() {
        return this.f49212b;
    }
}
