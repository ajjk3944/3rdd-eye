package Nh;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: Nh.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3375b implements InterfaceC3376c {

    /* renamed from: a, reason: collision with root package name */
    private final Qh.g f16498a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f16499b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6835l f16500c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f16501d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f16502e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f16503f;

    public C3375b(Qh.g jClass, InterfaceC6835l memberFilter) {
        AbstractC6492s.i(jClass, "jClass");
        AbstractC6492s.i(memberFilter, "memberFilter");
        this.f16498a = jClass;
        this.f16499b = memberFilter;
        C3374a c3374a = new C3374a(this);
        this.f16500c = c3374a;
        InterfaceC8780j interfaceC8780jC = AbstractC8783m.C(AbstractC3689v.d0(jClass.M()), c3374a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : interfaceC8780jC) {
            Zh.f name = ((Qh.r) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f16501d = linkedHashMap;
        InterfaceC8780j interfaceC8780jC2 = AbstractC8783m.C(AbstractC3689v.d0(this.f16498a.C()), this.f16499b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : interfaceC8780jC2) {
            linkedHashMap2.put(((Qh.n) obj2).getName(), obj2);
        }
        this.f16502e = linkedHashMap2;
        Collection collectionG = this.f16498a.g();
        InterfaceC6835l interfaceC6835l = this.f16499b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionG) {
            if (((Boolean) interfaceC6835l.invoke(obj3)).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC7978m.d(Zg.U.d(AbstractC3689v.w(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((Qh.w) obj4).getName(), obj4);
        }
        this.f16503f = linkedHashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(C3375b c3375b, Qh.r m10) {
        AbstractC6492s.i(m10, "m");
        return ((Boolean) c3375b.f16499b.invoke(m10)).booleanValue() && !Qh.p.c(m10);
    }

    @Override // Nh.InterfaceC3376c
    public Set a() {
        InterfaceC8780j interfaceC8780jC = AbstractC8783m.C(AbstractC3689v.d0(this.f16498a.M()), this.f16500c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = interfaceC8780jC.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((Qh.r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // Nh.InterfaceC3376c
    public Collection b(Zh.f name) {
        AbstractC6492s.i(name, "name");
        List listL = (List) this.f16501d.get(name);
        if (listL == null) {
            listL = AbstractC3689v.l();
        }
        return listL;
    }

    @Override // Nh.InterfaceC3376c
    public Qh.n c(Zh.f name) {
        AbstractC6492s.i(name, "name");
        return (Qh.n) this.f16502e.get(name);
    }

    @Override // Nh.InterfaceC3376c
    public Set d() {
        return this.f16503f.keySet();
    }

    @Override // Nh.InterfaceC3376c
    public Set e() {
        InterfaceC8780j interfaceC8780jC = AbstractC8783m.C(AbstractC3689v.d0(this.f16498a.C()), this.f16499b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = interfaceC8780jC.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((Qh.n) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // Nh.InterfaceC3376c
    public Qh.w f(Zh.f name) {
        AbstractC6492s.i(name, "name");
        return (Qh.w) this.f16503f.get(name);
    }
}
