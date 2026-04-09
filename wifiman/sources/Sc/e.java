package Sc;

import Cc.AbstractC2558b;
import Sc.b;
import Sc.e;
import Yg.J;
import Yg.m;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import ch.AbstractC4260a;
import com.ui.wifiman.model.vendor.d;
import ee.AbstractC5456b;
import h9.C5969a;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kg.q;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import kotlin.text.p;
import kotlin.text.t;
import l9.C6556a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import o7.AbstractC7100f;
import org.snmp4j.transport.DefaultTcpTransportMapping;
import r7.C7577a;
import s7.AbstractC7915b;
import t7.C8037a;
import t7.C8040d;
import t7.EnumC8038b;
import ua.InterfaceC8153a;
import ua.b;
import w7.AbstractC8276e;
import w7.EnumC8273b;
import w7.EnumC8274c;
import wa.InterfaceC8290a;
import xa.InterfaceC8439a;
import xa.o;
import y7.AbstractC8624d;
import y7.l;
import y7.n;
import y7.r;
import y7.s;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes4.dex */
public final class e implements Sc.b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f20439e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final o f20440a;

    /* renamed from: b, reason: collision with root package name */
    private final m f20441b;

    /* renamed from: c, reason: collision with root package name */
    private final p f20442c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f20443d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends LinkedHashSet {
        public /* bridge */ int F() {
            return super.size();
        }

        public /* bridge */ boolean S(b.a aVar) {
            return super.remove(aVar);
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof b.a) {
                return o((b.a) obj);
            }
            return false;
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean add(b.a element) {
            boolean zAdd;
            AbstractC6492s.i(element, "element");
            synchronized (this) {
                try {
                    if (contains(element)) {
                        remove(element);
                    }
                    zAdd = super.add(element);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zAdd;
        }

        public /* bridge */ boolean o(b.a aVar) {
            return super.contains(aVar);
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof b.a) {
                return S((b.a) obj);
            }
            return false;
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ int size() {
            return F();
        }
    }

    static final class c implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f20444a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f20445b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N f20446c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ N f20447d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ N f20448e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f20449f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ N f20450g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ N f20451h;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f20452a;

            static {
                int[] iArr = new int[s.values().length];
                try {
                    iArr[s.MASTER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s.MANAGED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[s.REPEATER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f20452a = iArr;
            }
        }

        c(N n10, N n11, N n12, N n13, N n14, e eVar, N n15, N n16) {
            this.f20444a = n10;
            this.f20445b = n11;
            this.f20446c = n12;
            this.f20447d = n13;
            this.f20448e = n14;
            this.f20449f = eVar;
            this.f20450g = n15;
            this.f20451h = n16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(e eVar, r it) {
            AbstractC6492s.i(it, "it");
            return eVar.q(it.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(e eVar, t7.e it) {
            AbstractC6492s.i(it, "it");
            return eVar.q(it.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(e eVar, n it) {
            AbstractC6492s.i(it, "it");
            return eVar.p(it);
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(AbstractC7915b device, InterfaceC8290a browser) {
            s sVar;
            String str;
            String strA;
            Yg.s sVarA;
            InetAddress inetAddressB;
            String strA2;
            AbstractC6492s.i(device, "device");
            AbstractC6492s.i(browser, "browser");
            N n10 = this.f20444a;
            C8040d c8040d = (C8040d) device.d(C8040d.class);
            S8.h hVar = null;
            n10.f51689a = (c8040d == null || (strA2 = c8040d.a("")) == null) ? null : C5969a.f48518b.e(strA2);
            N n11 = this.f20445b;
            HashSet hashSet = new HashSet();
            Iterator it = device.c().iterator();
            while (it.hasNext()) {
                Object objC = ((C7577a) it.next()).c();
                AbstractC8624d abstractC8624d = objC instanceof AbstractC8624d ? (AbstractC8624d) objC : null;
                if (abstractC8624d != null && (inetAddressB = abstractC8624d.b()) != null) {
                    hashSet.add(AbstractC5456b.a(inetAddressB));
                }
            }
            n11.f51689a = hashSet;
            if (this.f20444a.f51689a == null || ((Collection) this.f20445b.f51689a).isEmpty()) {
                return new C6556a(null);
            }
            this.f20446c.f51689a = device.e(t7.e.class);
            this.f20447d.f51689a = device.e(r.class);
            this.f20448e.f51689a = this.f20449f.t((Set) this.f20446c.f51689a, (Set) this.f20447d.f51689a, browser, (t7.f) device.d(t7.f.class));
            N n12 = this.f20450g;
            InterfaceC8439a.d dVar = (InterfaceC8439a.d) this.f20448e.f51689a;
            if (((dVar != null ? dVar.h0() : null) instanceof b.t) || (sVar = (s) device.d(s.class)) == null) {
                sVar = s.UNDEFINED;
            }
            n12.f51689a = sVar;
            this.f20451h.f51689a = device.e(n.class);
            HashSet hashSet2 = (HashSet) this.f20445b.f51689a;
            Object obj = this.f20444a.f51689a;
            AbstractC6492s.f(obj);
            C5969a c5969a = (C5969a) obj;
            InterfaceC8439a.d dVar2 = (InterfaceC8439a.d) this.f20448e.f51689a;
            if (dVar2 == null || (strA = dVar2.getName()) == null) {
                InterfaceC8780j interfaceC8780jD0 = AbstractC3689v.d0((Iterable) this.f20447d.f51689a);
                final e eVar = this.f20449f;
                r rVar = (r) AbstractC8783m.G(AbstractC8783m.C(interfaceC8780jD0, new InterfaceC6835l() { // from class: Sc.f
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(e.c.e(eVar, (r) obj2));
                    }
                }));
                if (rVar != null) {
                    strA = rVar.a();
                } else {
                    InterfaceC8780j interfaceC8780jD02 = AbstractC3689v.d0((Iterable) this.f20446c.f51689a);
                    final e eVar2 = this.f20449f;
                    t7.e eVar3 = (t7.e) AbstractC8783m.G(AbstractC8783m.C(interfaceC8780jD02, new InterfaceC6835l() { // from class: Sc.g
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(e.c.f(eVar2, (t7.e) obj2));
                        }
                    }));
                    if (eVar3 != null) {
                        strA = eVar3.a();
                    } else {
                        str = null;
                    }
                }
                str = strA;
            } else {
                str = strA;
            }
            Object obj2 = this.f20448e.f51689a;
            InterfaceC8439a.d dVar3 = (InterfaceC8439a.d) obj2;
            InterfaceC8439a.d dVar4 = (InterfaceC8439a.d) obj2;
            AbstractC2558b abstractC2558bA = dVar4 != null ? Sc.i.a(dVar4) : null;
            TreeSet treeSetN = this.f20449f.n(device);
            HashSet hashSet3 = new HashSet();
            N n13 = this.f20451h;
            final e eVar4 = this.f20449f;
            Iterator it2 = AbstractC8783m.C(AbstractC3689v.d0((Iterable) n13.f51689a), new InterfaceC6835l() { // from class: Sc.h
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj3) {
                    return Boolean.valueOf(e.c.g(eVar4, (n) obj3));
                }
            }).iterator();
            while (it2.hasNext()) {
                hashSet3.add((n) it2.next());
            }
            Set setE = device.e(C8037a.class);
            ArrayList arrayList = new ArrayList();
            Iterator it3 = setE.iterator();
            while (it3.hasNext()) {
                String strA3 = ((C8037a) it3.next()).a();
                if (t.m0(strA3)) {
                    strA3 = null;
                }
                if (strA3 != null) {
                    arrayList.add(strA3);
                }
            }
            List<String> listG0 = AbstractC3689v.g0(arrayList);
            TreeSet treeSet = new TreeSet();
            for (String str2 : listG0) {
                if (listG0.size() <= 1 || !AbstractC6492s.d(str2, "ubnt")) {
                    treeSet.add(str2);
                }
            }
            Set<l> setE2 = device.e(l.class);
            ArrayList arrayList2 = new ArrayList();
            for (l lVar : setE2) {
                C5969a c5969aD = C5969a.f48518b.d(lVar.a());
                C5969a c5969a2 = c5969aD != null ? new C5969a(c5969aD) : null;
                if (lVar.b() == null || c5969a2 == null) {
                    sVarA = null;
                } else {
                    InetAddress inetAddressB2 = lVar.b();
                    AbstractC6492s.f(inetAddressB2);
                    sVarA = z.a(c5969a2, AbstractC5456b.a(inetAddressB2));
                }
                if (sVarA != null) {
                    arrayList2.add(sVarA);
                }
            }
            Map mapR = U.r(arrayList2);
            t7.g gVar = (t7.g) device.d(t7.g.class);
            Long lValueOf = gVar != null ? Long.valueOf(gVar.a()) : null;
            int i10 = a.f20452a[((s) this.f20450g.f51689a).ordinal()];
            if (i10 == 1) {
                hVar = S8.h.ACCESS_POINT;
            } else if (i10 == 2) {
                hVar = S8.h.STATION;
            } else if (i10 == 3) {
                hVar = S8.h.REPEATER;
            }
            return new C6556a(new b.a(treeSet, hashSet2, new d.c(d.EnumC1510d.UBIQUITI), c5969a, dVar3, abstractC2558bA, treeSetN, hashSet3, mapR, lValueOf, hVar, device.d(EnumC8038b.class) == EnumC8038b.FACTORY_DEFAULT, str, System.currentTimeMillis(), this.f20449f.o(device)));
        }
    }

    static final class d implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final d f20453a = new d();

        d() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(C6556a it) {
            AbstractC6492s.i(it, "it");
            return !(it.b() == null);
        }
    }

    /* renamed from: Sc.e$e, reason: collision with other inner class name */
    static final class C0737e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0737e f20454a = new C0737e();

        C0737e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b.a apply(C6556a it) {
            AbstractC6492s.i(it, "it");
            Object objB = it.b();
            AbstractC6492s.f(objB);
            return (b.a) objB;
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f20455a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(b bVar) {
            AbstractC6492s.f(bVar);
            return AbstractC3689v.i1(bVar);
        }
    }

    static final class g implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final g f20456a = new g();

        g() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.f(new IllegalStateException("Ubnt Discovery failed", it), null, 2, null);
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f20457a = new h();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f20458a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable it) {
                AbstractC6492s.i(it, "it");
                return gg.i.K0(J.f24997a).R(3000L, TimeUnit.MILLISECONDS);
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i errorStream) {
            AbstractC6492s.i(errorStream, "errorStream");
            return errorStream.p0(a.f20458a);
        }
    }

    public static final class i implements Comparator {
        public i() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(Integer.valueOf(e.this.m((InterfaceC8439a.d) obj2)), Integer.valueOf(e.this.m((InterfaceC8439a.d) obj)));
        }
    }

    public static final class j implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f20460a;

        public j(Comparator comparator) {
            this.f20460a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f20460a.compare(obj, obj2);
            return iCompare != 0 ? iCompare : AbstractC4260a.e(((InterfaceC8439a.d) obj).mo3getId2jxHnRY(), ((InterfaceC8439a.d) obj2).mo3getId2jxHnRY());
        }
    }

    public e(o productCatalog) {
        AbstractC6492s.i(productCatalog, "productCatalog");
        this.f20440a = productCatalog;
        this.f20441b = Yg.n.b(new InterfaceC6824a() { // from class: Sc.d
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return e.k();
            }
        });
        this.f20442c = new p("[0-9a-fA-F]{24}");
        gg.i iVarI2 = r().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f20443d = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC7100f k() {
        return AbstractC7100f.f55524a.a().a(new AbstractC8276e.a().c(EnumC8273b.V1).c(EnumC8273b.V2).b(), 100).a(new AbstractC8276e.b().c(EnumC8274c.V1).b(), 99).a(new w7.g(), 98).b();
    }

    private final AbstractC7100f l() {
        return (AbstractC7100f) this.f20441b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int m(InterfaceC8439a.d dVar) {
        return dVar.h0() instanceof b.r.d ? 100 : 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TreeSet n(AbstractC7915b abstractC7915b) {
        TreeSet treeSet = new TreeSet();
        for (y7.m mVar : abstractC7915b.e(y7.m.class)) {
            if (!this.f20442c.m(mVar.a()) && !t.m0(mVar.a())) {
                treeSet.add(mVar.a());
            }
        }
        return treeSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long o(AbstractC7915b abstractC7915b) {
        Integer num;
        Iterator it = abstractC7915b.c().iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((C7577a) it.next()).b());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((C7577a) it.next()).b());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num == null) {
            return 15000L;
        }
        switch (num.intValue()) {
            case 98:
                return System.currentTimeMillis() + 63000;
            case 99:
            case DefaultTcpTransportMapping.DEFAULT_MAX_BUSY_LOOPS /* 100 */:
                return System.currentTimeMillis() + 15000;
            default:
                throw new IllegalStateException("unknown server type");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(n nVar) {
        return (t.C(nVar.d(), "UFP-UAP-B", true) || t.C(nVar.d(), "BLE-B", true)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 0
            switch(r0) {
                case -1031720837: goto L2d;
                case -999699798: goto L24;
                case 63284272: goto L1b;
                case 2005046814: goto L12;
                case 2077508747: goto L9;
                default: goto L8;
            }
        L8:
            goto L35
        L9:
            java.lang.String r0 = "UFP-UAP-B"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L36
            goto L35
        L12:
            java.lang.String r0 = "Ubiquiti"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L36
            goto L35
        L1b:
            java.lang.String r0 = "BLE-B"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L36
            goto L35
        L24:
            java.lang.String r0 = "Unifi-Protect-UAP-Bridge"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L36
            goto L35
        L2d:
            java.lang.String r0 = "BLE-Bridge"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L36
        L35:
            r1 = 1
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Sc.e.q(java.lang.String):boolean");
    }

    private final gg.i r() {
        N n10 = new N();
        N n11 = new N();
        N n12 = new N();
        N n13 = new N();
        gg.i iVarP1 = gg.i.v(l().a(), this.f20440a.b(), new c(n10, new N(), n11, n12, n13, this, new N(), new N())).m0(d.f20453a).N0(C0737e.f20454a).c(1000L, 1000L, TimeUnit.MILLISECONDS, Gg.a.a(), new q() { // from class: Sc.c
            @Override // kg.q
            public final Object get() {
                return e.s();
            }
        }).e1().N0(f.f20455a).d0(g.f20456a).p1(h.f20457a);
        AbstractC6492s.h(iVarP1, "retryWhen(...)");
        return iVarP1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b s() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC8439a.d t(Set set, Set set2, InterfaceC8290a interfaceC8290a, t7.f fVar) {
        InterfaceC8439a.d dVar;
        String strA;
        ArrayList arrayList = new ArrayList();
        Set set3 = set;
        for (t7.e eVar : AbstractC3689v.d0(set3)) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                InterfaceC8439a.d dVar2 = (InterfaceC8439a.d) interfaceC8290a.e(eVar.a(), ((r) it.next()).a());
                if (dVar2 != null) {
                    arrayList.add(dVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            Iterator it2 = set3.iterator();
            while (it2.hasNext()) {
                InterfaceC8439a.d dVar3 = (InterfaceC8439a.d) interfaceC8290a.d(((t7.e) it2.next()).a());
                if (dVar3 != null) {
                    arrayList.add(dVar3);
                }
            }
        }
        if (arrayList.isEmpty()) {
            Iterator it3 = set2.iterator();
            while (it3.hasNext()) {
                InterfaceC8439a.d dVar4 = (InterfaceC8439a.d) interfaceC8290a.d(((r) it3.next()).a());
                if (dVar4 != null) {
                    arrayList.add(dVar4);
                }
            }
        }
        if (arrayList.isEmpty()) {
            String strC = (fVar == null || (strA = fVar.a()) == null) ? null : InterfaceC8153a.d.c(strA);
            if (strC != null && (dVar = (InterfaceC8439a.d) interfaceC8290a.a(strC)) != null) {
                arrayList.add(dVar);
            }
        }
        AbstractC3689v.B(arrayList, new j(new i()));
        return (InterfaceC8439a.d) AbstractC3689v.s0(arrayList);
    }

    @Override // Ec.t
    public gg.i b() {
        return this.f20443d;
    }
}
