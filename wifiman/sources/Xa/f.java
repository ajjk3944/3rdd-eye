package xa;

import Fa.b;
import Yg.s;
import Yg.z;
import Zg.AbstractC3689v;
import ab.C3781d;
import bb.C4079a;
import ch.AbstractC4260a;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import ua.InterfaceC8153a;
import va.C8204b;
import wa.InterfaceC8290a;
import xa.InterfaceC8439a;
import zi.InterfaceC8780j;

/* loaded from: classes3.dex */
public final class f implements InterfaceC8290a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f65493h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f65494a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f65495b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f65496c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f65497d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f65498e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f65499f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Set f65500g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final a f65501c = new a(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f65502a;

        /* renamed from: b, reason: collision with root package name */
        private final String f65503b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(String str, String str2) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (str == null && str2 == null) {
                    return null;
                }
                return new b(str, str2, defaultConstructorMarker);
            }

            private a() {
            }
        }

        public /* synthetic */ b(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f65502a, bVar.f65502a) && AbstractC6492s.d(this.f65503b, bVar.f65503b);
        }

        public int hashCode() {
            String str = this.f65502a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f65503b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "UbntDiscoveryLookupKey(model=" + this.f65502a + ", name=" + this.f65503b + ")";
        }

        private b(String str, String str2) {
            this.f65502a = str;
            this.f65503b = str2;
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e((Comparable) ((s) obj2).h(), (Comparable) ((s) obj).h());
        }
    }

    public static final class d implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f65504a;

        public d(Comparator comparator) {
            this.f65504a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f65504a.compare(obj, obj2);
            return iCompare != 0 ? iCompare : AbstractC4260a.e(((InterfaceC8153a.C2195a) ((s) obj2).j()).l(), ((InterfaceC8153a.C2195a) ((s) obj).j()).l());
        }
    }

    public f(InterfaceC8439a.b bVar, InterfaceC8439a.b bVar2, InterfaceC8439a.c cVar) {
        b.a aVarE;
        String strB;
        Map mapD;
        Map mapD2;
        C4079a c4079aB;
        List listA;
        InterfaceC8780j<C3781d> interfaceC8780jD0;
        Ba.a.b(new InterfaceC6824a() { // from class: xa.b
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return f.k();
            }
        });
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (bVar == null || (bVar2 != null && bVar.a().a() < bVar2.a().a())) {
            bVar = (bVar2 == null || (bVar != null && bVar2.a().a() < bVar.a().a())) ? null : bVar2;
        }
        Map mapB = cVar != null ? cVar.b() : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bVar != null && (c4079aB = bVar.b()) != null && (listA = c4079aB.a()) != null && (interfaceC8780jD0 = AbstractC3689v.d0(listA)) != null) {
            for (C3781d c3781d : interfaceC8780jD0) {
                Object obj = mapB != null ? mapB.get(InterfaceC8153a.C2195a.a(c3781d.mo3getId2jxHnRY())) : null;
                linkedHashSet.add(new n(c3781d, mapB != null ? mapB.get(InterfaceC8153a.C2195a.a(c3781d.mo3getId2jxHnRY())) : null, (obj == null || cVar == null) ? null : cVar.c(obj)));
            }
        }
        this.f65500g = linkedHashSet;
        Ba.a.b(new InterfaceC6824a() { // from class: xa.c
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return f.m(this.f65491a);
            }
        });
        Ba.a.b(new InterfaceC6824a() { // from class: xa.d
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return f.n();
            }
        });
        for (n nVar : b()) {
            this.f65494a.put(InterfaceC8153a.C2195a.a(nVar.mo3getId2jxHnRY()), nVar);
            Iterator it = nVar.g().iterator();
            while (it.hasNext()) {
                this.f65495b.put(InterfaceC8153a.d.a(((InterfaceC8153a.d) it.next()).j()), nVar);
            }
            Iterator it2 = nVar.a().iterator();
            while (it2.hasNext()) {
                this.f65496c.put((UUID) it2.next(), nVar);
            }
            Map mapD3 = nVar.D();
            if (mapD3 != null) {
                Iterator it3 = mapD3.entrySet().iterator();
                while (it3.hasNext()) {
                    this.f65496c.put(((C8204b) ((Map.Entry) it3.next()).getKey()).l(), nVar);
                }
            }
            Ea.c cVarP0 = nVar.p0();
            if (cVarP0 != null && (mapD2 = cVarP0.D()) != null) {
                Iterator it4 = mapD2.entrySet().iterator();
                while (it4.hasNext()) {
                    this.f65496c.put(((C8204b) ((Map.Entry) it4.next()).getKey()).l(), nVar);
                }
            }
            Fa.b bVarJ0 = nVar.j0();
            if (bVarJ0 != null && (mapD = bVarJ0.D()) != null) {
                Iterator it5 = mapD.entrySet().iterator();
                while (it5.hasNext()) {
                    this.f65496c.put(((C8204b) ((Map.Entry) it5.next()).getKey()).l(), nVar);
                }
            }
            for (C3781d.b.a aVar : nVar.c().d().c()) {
                b.a aVar2 = b.f65501c;
                String strC = aVar.c();
                b bVarA = aVar2.a(strC == null ? aVar.a() : strC, aVar.d());
                if (bVarA != null) {
                    this.f65499f.put(bVarA, nVar);
                }
            }
            Fa.b bVarJ02 = nVar.j0();
            if (bVarJ02 != null && (aVarE = bVarJ02.e()) != null && (strB = aVarE.b()) != null) {
                this.f65498e.put(InterfaceC8153a.c.a(InterfaceC8153a.c.c(strB)), nVar);
            }
        }
        for (n nVar2 : b()) {
            Iterator it6 = nVar2.c().d().a().iterator();
            while (it6.hasNext()) {
                this.f65497d.put((String) it6.next(), nVar2);
            }
        }
        HashSet hashSet = new HashSet();
        for (n nVar3 : b()) {
            int i10 = 0;
            for (Object obj2 : nVar3.c().d().c()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC3689v.v();
                }
                hashSet.add(z.a(Integer.valueOf(i10), InterfaceC8153a.C2195a.a(nVar3.mo3getId2jxHnRY())));
                i10 = i11;
            }
        }
        for (s sVar : AbstractC3689v.Z(hashSet, new d(new c()))) {
            int iIntValue = ((Number) sVar.a()).intValue();
            n nVar4 = (n) this.f65494a.get(InterfaceC8153a.C2195a.a(((InterfaceC8153a.C2195a) sVar.c()).l()));
            if (nVar4 != null) {
                C3781d.b.a aVar3 = (C3781d.b.a) nVar4.c().d().c().get(iIntValue);
                String strA = aVar3.a();
                if (strA != null) {
                    this.f65497d.put(strA, nVar4);
                }
                String strC2 = aVar3.c();
                if (strC2 != null) {
                    this.f65497d.put(strC2, nVar4);
                }
                String strD = aVar3.d();
                if (strD != null) {
                    this.f65497d.put(strD, nVar4);
                }
            }
        }
        for (n nVar5 : b()) {
            this.f65497d.put(nVar5.d(), nVar5);
        }
        for (n nVar6 : b()) {
            this.f65497d.put(nVar6.getName(), nVar6);
        }
        Ba.a.b(new InterfaceC6824a() { // from class: xa.e
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return f.l(jCurrentTimeMillis);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k() {
        return "UIDB Catalog Browser - initialization started ...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(long j10) {
        return "UIDB Catalog Browser - initialization finished in " + (System.currentTimeMillis() - j10) + " ms";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(f fVar) {
        return "UIDB Catalog Browser - latest products set LOADED. Contains " + fVar.b().size() + " products";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n() {
        return "UIDB Catalog Browser - preparing lookup maps ...";
    }

    @Override // wa.InterfaceC8290a
    public Set b() {
        return this.f65500g;
    }

    @Override // wa.InterfaceC8290a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public n d(String string) {
        AbstractC6492s.i(string, "string");
        return (n) this.f65497d.get(string);
    }

    @Override // wa.InterfaceC8290a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public n e(String str, String str2) {
        b bVarA = b.f65501c.a(str, str2);
        if (bVarA != null) {
            return (n) this.f65499f.get(bVarA);
        }
        return null;
    }

    @Override // wa.InterfaceC8290a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public n f(UUID uuid) {
        AbstractC6492s.i(uuid, "uuid");
        return (n) this.f65496c.get(uuid);
    }

    @Override // wa.InterfaceC8290a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public n c(String productID) {
        AbstractC6492s.i(productID, "productID");
        return (n) this.f65494a.get(InterfaceC8153a.C2195a.a(productID));
    }

    @Override // wa.InterfaceC8290a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public n a(String systemID) {
        AbstractC6492s.i(systemID, "systemID");
        return (n) this.f65495b.get(InterfaceC8153a.d.a(systemID));
    }
}
