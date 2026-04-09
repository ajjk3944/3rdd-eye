package Cc;

import Cc.InterfaceC2557a;
import Cc.p;
import Yg.J;
import Zg.AbstractC3689v;
import a8.C3771a;
import a8.C3772b;
import ch.AbstractC4260a;
import com.ui.wifiman.model.bluetooth.le.a;
import gg.AbstractC5912b;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import h9.C5969a;
import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv6.C6205b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import le.C6588i;
import le.InterfaceC6586g;
import mc.InterfaceC6794a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import wc.C8321a;
import xa.InterfaceC8439a;

/* loaded from: classes4.dex */
public final class p implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Ob.a f2521a;

    /* renamed from: b, reason: collision with root package name */
    private final C3771a f2522b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f2523c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f2524d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f2525e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f2526f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f2527g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f2528h;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map f2529a;

        /* renamed from: b, reason: collision with root package name */
        private final List f2530b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f2531c;

        public a(Map networkDevices, List accessPoints, Set bluetoothDevices) {
            AbstractC6492s.i(networkDevices, "networkDevices");
            AbstractC6492s.i(accessPoints, "accessPoints");
            AbstractC6492s.i(bluetoothDevices, "bluetoothDevices");
            this.f2529a = networkDevices;
            this.f2530b = accessPoints;
            this.f2531c = bluetoothDevices;
        }

        public final Map a() {
            return this.f2529a;
        }

        public final List b() {
            return this.f2530b;
        }

        public final Set c() {
            return this.f2531c;
        }

        public final Map d() {
            return this.f2529a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f2529a, aVar.f2529a) && AbstractC6492s.d(this.f2530b, aVar.f2530b) && AbstractC6492s.d(this.f2531c, aVar.f2531c);
        }

        public int hashCode() {
            return (((this.f2529a.hashCode() * 31) + this.f2530b.hashCode()) * 31) + this.f2531c.hashCode();
        }

        public String toString() {
            return "CombinedResults(networkDevices=" + this.f2529a + ", accessPoints=" + this.f2530b + ", bluetoothDevices=" + this.f2531c + ")";
        }
    }

    static final class c implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final c f2538a = new c();

        c() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a a(Map networkDevices, List accessPoints, Set bluetoothDevices) {
            AbstractC6492s.i(networkDevices, "networkDevices");
            AbstractC6492s.i(accessPoints, "accessPoints");
            AbstractC6492s.i(bluetoothDevices, "bluetoothDevices");
            return new a(networkDevices, accessPoints, bluetoothDevices);
        }
    }

    static final class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List it) {
            AbstractC6492s.i(it, "it");
            List list = it;
            p pVar = p.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(pVar.o((Ob.c) it2.next()));
            }
            return arrayList;
        }
    }

    static final class e implements kg.g {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C3772b A(C6588i it) {
            AbstractC6492s.i(it, "it");
            return it.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J B(b device, C6588i res) {
            AbstractC6492s.i(device, "device");
            AbstractC6492s.i(res, "res");
            device.m().add(res);
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C3772b p(C8321a it) {
            AbstractC6492s.i(it, "it");
            return it.f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J q(b device, C8321a res) {
            AbstractC6492s.i(device, "device");
            AbstractC6492s.i(res, "res");
            device.r(res);
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C3772b r(Cc.l it) {
            AbstractC6492s.i(it, "it");
            return it.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J s(b device, Cc.l res) {
            AbstractC6492s.i(device, "device");
            AbstractC6492s.i(res, "res");
            device.s(res);
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C3772b t(a.C1388a it) {
            AbstractC6492s.i(it, "it");
            return it.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J u(b device, a.C1388a res) {
            AbstractC6492s.i(device, "device");
            AbstractC6492s.i(res, "res");
            device.a(res);
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C3772b v(Dc.j it) {
            AbstractC6492s.i(it, "it");
            return it.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J w(b device, Dc.j res) {
            AbstractC6492s.i(device, "device");
            AbstractC6492s.i(res, "res");
            device.t(res);
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J x(p pVar, C3771a c3771a, Dc.j result) {
            AbstractC6492s.i(result, "result");
            pVar.l(c3771a, result, new InterfaceC6835l() { // from class: Cc.s
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return p.e.y((Dc.j) obj);
                }
            }, new InterfaceC6839p() { // from class: Cc.t
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return p.e.z((p.b) obj, (Dc.j) obj2);
                }
            });
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C3772b y(Dc.j it) {
            AbstractC6492s.i(it, "it");
            return it.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J z(b device, Dc.j res) {
            AbstractC6492s.i(device, "device");
            AbstractC6492s.i(res, "res");
            if (device.j() == null) {
                device.t(res);
            }
            return J.f24997a;
        }

        @Override // kg.g
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final C3771a a(a aVar, List configurations, Set bleCharacteristics) {
            AbstractC6492s.i(aVar, "<destruct>");
            AbstractC6492s.i(configurations, "configurations");
            AbstractC6492s.i(bleCharacteristics, "bleCharacteristics");
            Map mapA = aVar.a();
            List listB = aVar.b();
            Set setC = aVar.c();
            final C3771a c3771a = new C3771a();
            C3771a c3771a2 = p.this.f2522b;
            final p pVar = p.this;
            synchronized (c3771a2) {
                try {
                    Iterator it = mapA.entrySet().iterator();
                    while (it.hasNext()) {
                        Dc.j jVar = (Dc.j) ((Map.Entry) it.next()).getValue();
                        C3772b c3772bU = jVar.u();
                        if (c3772bU != null) {
                            pVar.f2522b.d(c3772bU, jVar);
                            pVar.l(c3771a, jVar, new InterfaceC6835l() { // from class: Cc.q
                                @Override // mh.InterfaceC6835l
                                public final Object invoke(Object obj) {
                                    return p.e.v((Dc.j) obj);
                                }
                            }, new InterfaceC6839p() { // from class: Cc.v
                                @Override // mh.InterfaceC6839p
                                public final Object invoke(Object obj, Object obj2) {
                                    return p.e.w((p.b) obj, (Dc.j) obj2);
                                }
                            });
                        }
                    }
                    pVar.f2522b.c(new InterfaceC6835l() { // from class: Cc.w
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return p.e.x(pVar, c3771a, (Dc.j) obj);
                        }
                    });
                    J j10 = J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            p pVar2 = p.this;
            Iterator it2 = listB.iterator();
            while (it2.hasNext()) {
                pVar2.l(c3771a, (C6588i) it2.next(), new InterfaceC6835l() { // from class: Cc.x
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return p.e.A((C6588i) obj);
                    }
                }, new InterfaceC6839p() { // from class: Cc.y
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return p.e.B((p.b) obj, (C6588i) obj2);
                    }
                });
            }
            p pVar3 = p.this;
            Iterator it3 = setC.iterator();
            while (it3.hasNext()) {
                pVar3.l(c3771a, (C8321a) it3.next(), new InterfaceC6835l() { // from class: Cc.z
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return p.e.p((C8321a) obj);
                    }
                }, new InterfaceC6839p() { // from class: Cc.A
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return p.e.q((p.b) obj, (C8321a) obj2);
                    }
                });
            }
            p pVar4 = p.this;
            Iterator it4 = configurations.iterator();
            while (it4.hasNext()) {
                pVar4.l(c3771a, (Cc.l) it4.next(), new InterfaceC6835l() { // from class: Cc.B
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return p.e.r((l) obj);
                    }
                }, new InterfaceC6839p() { // from class: Cc.C
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return p.e.s((p.b) obj, (l) obj2);
                    }
                });
            }
            p pVar5 = p.this;
            Iterator it5 = bleCharacteristics.iterator();
            while (it5.hasNext()) {
                pVar5.l(c3771a, (a.C1388a) it5.next(), new InterfaceC6835l() { // from class: Cc.r
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return p.e.t((a.C1388a) obj);
                    }
                }, new InterfaceC6839p() { // from class: Cc.u
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return p.e.u((p.b) obj, (a.C1388a) obj2);
                    }
                });
            }
            return c3771a;
        }
    }

    static final class f implements kg.n {

        static final class a implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Cc.j f2542a;

            a(Cc.j jVar) {
                this.f2542a = jVar;
            }

            @Override // kg.InterfaceC6465b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Cc.j apply(C6556a c6556a, C6556a c6556a2) {
                AbstractC6492s.i(c6556a, "<destruct>");
                AbstractC6492s.i(c6556a2, "<destruct>");
                InterfaceC2557a interfaceC2557aA = (InterfaceC2557a.b) c6556a.a();
                Dc.j jVar = (Dc.j) c6556a2.a();
                Cc.j jVar2 = this.f2542a;
                if (interfaceC2557aA == null) {
                    interfaceC2557aA = jVar != null ? Dc.n.a(jVar) : null;
                }
                return Cc.j.r(jVar2, null, null, null, null, interfaceC2557aA, 15, null);
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Cc.j myselfTemplate) {
            AbstractC6492s.i(myselfTemplate, "myselfTemplate");
            return gg.i.v(p.this.f2526f, p.this.f2525e, new a(myselfTemplate));
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f2543a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(a it) {
            Dc.j jVar;
            AbstractC6492s.i(it, "it");
            Iterator it2 = it.d().entrySet().iterator();
            do {
                jVar = null;
                if (!it2.hasNext()) {
                    break;
                }
                Dc.j jVar2 = (Dc.j) ((Map.Entry) it2.next()).getValue();
                if (jVar2.F() != null) {
                    jVar = jVar2;
                }
            } while (jVar == null);
            return new C6556a(jVar);
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f2544a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            Dc.j jVar = (Dc.j) c6556a.a();
            return new C6556a(jVar != null ? jVar.u() : null);
        }
    }

    static final class i implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3772b f2546a;

            a(C3772b c3772b) {
                this.f2546a = c3772b;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C3771a devicesMap) {
                AbstractC6492s.i(devicesMap, "devicesMap");
                return new C6556a(devicesMap.a(this.f2546a));
            }
        }

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            C3772b c3772b = (C3772b) c6556a.a();
            if (c3772b != null) {
                gg.i iVarN0 = p.this.a().N0(new a(c3772b));
                AbstractC6492s.f(iVarN0);
                return iVarN0;
            }
            gg.i iVarK0 = gg.i.K0(new C6556a(null));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    public static final class j implements gg.C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6794a f2547a;

        public j(InterfaceC6794a interfaceC6794a) {
            this.f2547a = interfaceC6794a;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(new Cc.j(this.f2547a.getName(), this.f2547a.b(), this.f2547a.c(), this.f2547a.d(), null));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5969a f2548a;

        k(C5969a c5969a) {
            this.f2548a = c5969a;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List it) {
            Object next;
            AbstractC6492s.i(it, "it");
            C3772b c3772bB = C3772b.f25747c.b(this.f2548a);
            Iterator it2 = it.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (AbstractC6492s.d(((Cc.l) next).d(), c3772bB)) {
                    break;
                }
            }
            return new C6556a(next);
        }
    }

    static final class l implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f2550b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5969a f2551c;

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f2552a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f2553b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Cc.l f2554c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C5969a f2555d;

            public a(p pVar, InterfaceC6835l interfaceC6835l, Cc.l lVar, C5969a c5969a) {
                this.f2552a = pVar;
                this.f2553b = interfaceC6835l;
                this.f2554c = lVar;
                this.f2555d = c5969a;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    if (this.f2552a.f2521a.b(this.f2552a.n((Cc.l) this.f2553b.invoke(this.f2554c))) < 1) {
                        Z7.b.e("Failed to update device info", new IllegalStateException("Failed to update device info " + this.f2555d.d(":")), null, 4, null);
                    }
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        public static final class b implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f2556a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f2557b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C5969a f2558c;

            public b(p pVar, InterfaceC6835l interfaceC6835l, C5969a c5969a) {
                this.f2556a = pVar;
                this.f2557b = interfaceC6835l;
                this.f2558c = c5969a;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f2556a.f2521a.a(this.f2556a.n((Cc.l) this.f2557b.invoke(new Cc.l(this.f2558c.d(":"), C3772b.f25747c.b(this.f2558c), this.f2558c, null, 0L, 24, null))));
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        l(InterfaceC6835l interfaceC6835l, C5969a c5969a) {
            this.f2550b = interfaceC6835l;
            this.f2551c = c5969a;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a c6556a) {
            AbstractC5912b abstractC5912bR;
            AbstractC6492s.i(c6556a, "<destruct>");
            Cc.l lVar = (Cc.l) c6556a.a();
            if (lVar != null) {
                abstractC5912bR = AbstractC5912b.r(new a(p.this, this.f2550b, lVar, this.f2551c));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            } else {
                abstractC5912bR = AbstractC5912b.r(new b(p.this, this.f2550b, this.f2551c));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            }
            return abstractC5912bR.W(Gg.a.d()).L(Gg.a.a());
        }
    }

    public p(Ob.a deviceConfigDao, Dc.e networkDiscovery, InterfaceC6586g wifiScan, wc.h bluetoothScan, com.ui.wifiman.model.bluetooth.le.a bleCommonCharacteristics, InterfaceC6794a androidDeviceInfo) {
        AbstractC6492s.i(deviceConfigDao, "deviceConfigDao");
        AbstractC6492s.i(networkDiscovery, "networkDiscovery");
        AbstractC6492s.i(wifiScan, "wifiScan");
        AbstractC6492s.i(bluetoothScan, "bluetoothScan");
        AbstractC6492s.i(bleCommonCharacteristics, "bleCommonCharacteristics");
        AbstractC6492s.i(androidDeviceInfo, "androidDeviceInfo");
        this.f2521a = deviceConfigDao;
        this.f2522b = new C3771a();
        gg.i iVarI2 = deviceConfigDao.c().N0(new d()).F1(Gg.a.d()).X0(Gg.a.a()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f2523c = iVarI2;
        gg.i iVarY0 = gg.i.u(networkDiscovery.b(), wifiScan.a(), bluetoothScan.a(wc.f.BLE), c.f2538a).S1(1000L, TimeUnit.MILLISECONDS).e1().Y0(Gg.a.a(), false, 1);
        AbstractC6492s.h(iVarY0, "observeOn(...)");
        this.f2524d = iVarY0;
        gg.i iVarI22 = iVarY0.N0(g.f2543a).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f2525e = iVarI22;
        gg.i iVarI1 = iVarI22.N0(h.f2544a).W().I1(new i());
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        this.f2526f = iVarI1;
        gg.z zVarI = gg.z.i(new j(androidDeviceInfo));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarI23 = zVarI.w(new f()).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f2527g = iVarI23;
        gg.i iVarU = gg.i.u(iVarY0, iVarI2, bleCommonCharacteristics.b(), new e());
        AbstractC6492s.h(iVarU, "combineLatest(...)");
        gg.i iVarN = iVarU.n(C3771a.class);
        AbstractC6492s.h(iVarN, "cast(R::class.java)");
        gg.i iVarI24 = iVarN.o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f2528h = iVarI24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(C3771a c3771a, Object obj, InterfaceC6835l interfaceC6835l, InterfaceC6839p interfaceC6839p) {
        final C3772b c3772b = (C3772b) interfaceC6835l.invoke(obj);
        if (c3772b != null) {
            interfaceC6839p.invoke(c3771a.b(c3772b, new InterfaceC6824a() { // from class: Cc.o
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return p.m(c3772b);
                }
            }), obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b m(C3772b c3772b) {
        return new b(c3772b, null, null, null, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ob.c n(Cc.l lVar) {
        String str;
        String strE = lVar.e();
        String strD = lVar.f().d("");
        String strC = lVar.c();
        if (strC != null) {
            if (kotlin.text.t.m0(strC)) {
                strC = null;
            }
            str = strC;
        } else {
            str = null;
        }
        return new Ob.c(strE, strD, false, str, lVar.g(), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Cc.l o(Ob.c cVar) {
        C5969a c5969aE = C5969a.f48518b.e(cVar.d());
        AbstractC6492s.f(c5969aE);
        return new Cc.l(cVar.c(), C3772b.f25747c.b(c5969aE), c5969aE, cVar.a(), cVar.e());
    }

    @Override // Cc.n
    public gg.i a() {
        return this.f2528h;
    }

    @Override // Cc.n
    public gg.i b() {
        return this.f2527g;
    }

    @Override // Cc.n
    public AbstractC5912b c(C5969a mac, InterfaceC6835l updater) {
        AbstractC6492s.i(mac, "mac");
        AbstractC6492s.i(updater, "updater");
        AbstractC5912b abstractC5912bT = this.f2523c.o0().A(new k(mac)).t(new l(updater, mac));
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements InterfaceC2557a.b {

        /* renamed from: a, reason: collision with root package name */
        private final C3772b f2532a;

        /* renamed from: b, reason: collision with root package name */
        private TreeSet f2533b;

        /* renamed from: c, reason: collision with root package name */
        private Dc.j f2534c;

        /* renamed from: d, reason: collision with root package name */
        private C8321a f2535d;

        /* renamed from: e, reason: collision with root package name */
        private a.C1388a f2536e;

        /* renamed from: f, reason: collision with root package name */
        private Cc.l f2537f;

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(((C6588i) obj).e(), ((C6588i) obj2).e());
            }
        }

        public b(C3772b id2, TreeSet wifiSignals, Dc.j jVar, C8321a c8321a, a.C1388a c1388a, Cc.l lVar) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(wifiSignals, "wifiSignals");
            this.f2532a = id2;
            this.f2533b = wifiSignals;
            this.f2534c = jVar;
            this.f2535d = c8321a;
            this.f2536e = c1388a;
            this.f2537f = lVar;
        }

        public void a(a.C1388a c1388a) {
            this.f2536e = c1388a;
        }

        @Override // Cc.InterfaceC2557a
        public String b() {
            return InterfaceC2557a.b.C0117a.i(this);
        }

        @Override // Cc.InterfaceC2557a
        public com.ui.wifiman.model.vendor.d c() {
            return InterfaceC2557a.b.C0117a.m(this);
        }

        @Override // Cc.InterfaceC2557a, Cc.k
        public AbstractC2558b d() {
            return InterfaceC2557a.b.C0117a.a(this);
        }

        @Override // Cc.InterfaceC2557a
        public Long e() {
            return InterfaceC2557a.b.C0117a.l(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f2532a, bVar.f2532a) && AbstractC6492s.d(this.f2533b, bVar.f2533b) && AbstractC6492s.d(this.f2534c, bVar.f2534c) && AbstractC6492s.d(this.f2535d, bVar.f2535d) && AbstractC6492s.d(this.f2536e, bVar.f2536e) && AbstractC6492s.d(this.f2537f, bVar.f2537f);
        }

        @Override // Cc.InterfaceC2557a
        public InterfaceC8439a.d f() {
            return InterfaceC2557a.b.C0117a.k(this);
        }

        @Override // Cc.InterfaceC2557a
        public a.C1388a g() {
            return this.f2536e;
        }

        @Override // Cc.InterfaceC2557a
        public Cc.l getConfig() {
            return this.f2537f;
        }

        @Override // Cc.InterfaceC2557a.b, Cc.k
        public C3772b getId() {
            return this.f2532a;
        }

        @Override // Cc.InterfaceC2557a
        public String getName() {
            return InterfaceC2557a.b.C0117a.j(this);
        }

        @Override // Cc.InterfaceC2557a
        public String h() {
            return InterfaceC2557a.b.C0117a.b(this);
        }

        public int hashCode() {
            int iHashCode = ((this.f2532a.hashCode() * 31) + this.f2533b.hashCode()) * 31;
            Dc.j jVar = this.f2534c;
            int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
            C8321a c8321a = this.f2535d;
            int iHashCode3 = (iHashCode2 + (c8321a == null ? 0 : c8321a.hashCode())) * 31;
            a.C1388a c1388a = this.f2536e;
            int iHashCode4 = (iHashCode3 + (c1388a == null ? 0 : c1388a.hashCode())) * 31;
            Cc.l lVar = this.f2537f;
            return iHashCode4 + (lVar != null ? lVar.hashCode() : 0);
        }

        @Override // Cc.InterfaceC2557a
        public C6205b i() {
            return InterfaceC2557a.b.C0117a.f(this);
        }

        @Override // Cc.InterfaceC2557a
        public Dc.j j() {
            return this.f2534c;
        }

        @Override // Cc.InterfaceC2557a
        public Set k() {
            return InterfaceC2557a.b.C0117a.h(this);
        }

        @Override // Cc.InterfaceC2557a
        public C5969a l() {
            return InterfaceC2557a.b.C0117a.g(this);
        }

        @Override // Cc.InterfaceC2557a
        public TreeSet m() {
            return this.f2533b;
        }

        @Override // Cc.InterfaceC2557a
        public C6180b n() {
            return InterfaceC2557a.b.C0117a.e(this);
        }

        @Override // Cc.InterfaceC2557a
        public String o() {
            return InterfaceC2557a.b.C0117a.c(this);
        }

        @Override // Cc.InterfaceC2557a
        public C8321a p() {
            return this.f2535d;
        }

        @Override // Cc.InterfaceC2557a
        public Set q() {
            return InterfaceC2557a.b.C0117a.d(this);
        }

        public void r(C8321a c8321a) {
            this.f2535d = c8321a;
        }

        public void s(Cc.l lVar) {
            this.f2537f = lVar;
        }

        public void t(Dc.j jVar) {
            this.f2534c = jVar;
        }

        public String toString() {
            return "DefaultIdentifiedDevice(id=" + this.f2532a + ", wifiSignals=" + this.f2533b + ", networkDiscovery=" + this.f2534c + ", bluetooth=" + this.f2535d + ", bleCharacteristicsDevice=" + this.f2536e + ", config=" + this.f2537f + ")";
        }

        public /* synthetic */ b(C3772b c3772b, TreeSet treeSet, Dc.j jVar, C8321a c8321a, a.C1388a c1388a, Cc.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(c3772b, (i10 & 2) != 0 ? new TreeSet(new a()) : treeSet, (i10 & 4) != 0 ? null : jVar, (i10 & 8) != 0 ? null : c8321a, (i10 & 16) != 0 ? null : c1388a, (i10 & 32) != 0 ? null : lVar);
        }
    }
}
