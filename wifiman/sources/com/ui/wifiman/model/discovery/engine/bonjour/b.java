package com.ui.wifiman.model.discovery.engine.bonjour;

import Yg.J;
import Zg.AbstractC3689v;
import ch.AbstractC4260a;
import com.ui.wifiman.model.discovery.engine.bonjour.RxBonjour;
import com.ui.wifiman.model.discovery.engine.bonjour.a;
import com.ui.wifiman.model.discovery.engine.bonjour.c;
import com.ui.wifiman.model.vendor.d;
import ee.AbstractC5456b;
import gd.C5896a;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import l9.AbstractC6561f;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class b implements com.ui.wifiman.model.discovery.engine.bonjour.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f42614f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final RxBonjour f42615a;

    /* renamed from: b, reason: collision with root package name */
    private final c.g f42616b;

    /* renamed from: c, reason: collision with root package name */
    private final d.b f42617c;

    /* renamed from: d, reason: collision with root package name */
    private final C5896a.b f42618d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f42619e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.ui.wifiman.model.discovery.engine.bonjour.b$b, reason: collision with other inner class name */
    static final class C1396b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ gg.i f42620a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f42621b;

        /* renamed from: com.ui.wifiman.model.discovery.engine.bonjour.b$b$a */
        static final class a implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f42622a;

            a(b bVar) {
                this.f42622a = bVar;
            }

            @Override // kg.InterfaceC6465b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HashMap apply(HashMap serviceMap, a.b service) {
                HashMap map;
                AbstractC6492s.i(serviceMap, "serviceMap");
                AbstractC6492s.i(service, "service");
                synchronized (this.f42622a) {
                    try {
                        inet.ipaddr.g gVarB = service.b();
                        Object map2 = serviceMap.get(gVarB);
                        if (map2 == null) {
                            map2 = new HashMap();
                            serviceMap.put(gVarB, map2);
                        }
                        map = (HashMap) map2;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                synchronized (map) {
                    map.put(Integer.valueOf(service.d()), service);
                    J j10 = J.f24997a;
                }
                return serviceMap;
            }
        }

        /* renamed from: com.ui.wifiman.model.discovery.engine.bonjour.b$b$b, reason: collision with other inner class name */
        static final class C1397b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f42623a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d.a f42624b;

            /* renamed from: com.ui.wifiman.model.discovery.engine.bonjour.b$b$b$a */
            public static final class a implements Comparator {
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return AbstractC4260a.e(Integer.valueOf(((a.b) obj).d()), Integer.valueOf(((a.b) obj2).d()));
                }
            }

            C1397b(b bVar, d.a aVar) {
                this.f42623a = bVar;
                this.f42624b = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List apply(HashMap servicesMap) {
                ArrayList arrayList;
                List listX0;
                AbstractC6492s.i(servicesMap, "servicesMap");
                long jCurrentTimeMillis = System.currentTimeMillis();
                b bVar = this.f42623a;
                d.a aVar = this.f42624b;
                synchronized (bVar) {
                    try {
                        arrayList = new ArrayList(servicesMap.size());
                        for (Map.Entry entry : servicesMap.entrySet()) {
                            inet.ipaddr.g gVar = (inet.ipaddr.g) entry.getKey();
                            HashMap map = (HashMap) entry.getValue();
                            synchronized (map) {
                                try {
                                    ArrayList arrayList2 = new ArrayList(map.size());
                                    Iterator it = map.entrySet().iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add((a.b) ((Map.Entry) it.next()).getValue());
                                    }
                                    listX0 = AbstractC3689v.X0(arrayList2, new a());
                                } finally {
                                }
                            }
                            AbstractC6492s.f(aVar);
                            arrayList.add(bVar.i(jCurrentTimeMillis, gVar, listX0, aVar));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return arrayList;
            }
        }

        C1396b(gg.i iVar, b bVar) {
            this.f42620a = iVar;
            this.f42621b = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(d.a vendorDirectory) {
            AbstractC6492s.i(vendorDirectory, "vendorDirectory");
            return this.f42620a.q1(new HashMap(), new a(this.f42621b)).U1(1000L, TimeUnit.MILLISECONDS).e1().X0(Gg.a.a()).N0(new C1397b(this.f42621b, vendorDirectory));
        }
    }

    static final class c implements InterfaceC6465b {
        c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(RxBonjour.b event, C5896a.InterfaceC1778a serviceLookupDir) {
            inet.ipaddr.g gVarA;
            AbstractC6492s.i(event, "event");
            AbstractC6492s.i(serviceLookupDir, "serviceLookupDir");
            a.b bVar = null;
            if (event instanceof RxBonjour.b.a) {
                RxBonjour.b.a aVar = (RxBonjour.b.a) event;
                Inet4Address inet4Address = (Inet4Address) AbstractC3689v.r0(aVar.a().a());
                if (inet4Address != null && (gVarA = AbstractC5456b.a(inet4Address)) != null) {
                    b bVar2 = b.this;
                    String strB = aVar.a().b();
                    String strE = aVar.a().e();
                    int iC = aVar.a().c();
                    TreeMap treeMap = new TreeMap();
                    treeMap.putAll(aVar.a().d());
                    String strG0 = t.G0(aVar.a().e(), "_");
                    int length = strG0.length();
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            if (strG0.charAt(i10) == '.') {
                                strG0 = strG0.substring(0, i10);
                                AbstractC6492s.h(strG0, "substring(...)");
                                break;
                            }
                            i10++;
                        } else {
                            break;
                        }
                    }
                    bVar = new a.b(strB, strE, strG0, gVarA, iC, bVar2.f42616b.a(aVar.a().e(), aVar.a().d()), serviceLookupDir.a(aVar.a().c()), treeMap);
                }
            } else {
                if (!(event instanceof RxBonjour.b.C1394b)) {
                    throw new NoWhenBranchMatchedException();
                }
                RxBonjour.b.C1394b c1394b = (RxBonjour.b.C1394b) event;
                Z7.b.g("Service " + c1394b.a().b() + "." + c1394b.a().e() + " LOST", "BonjourDiscoveryEngine");
            }
            return new C6556a(bVar);
        }
    }

    static final class d implements kg.n {

        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f42627a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f42628b;

            a(String str, b bVar) {
                this.f42627a = str;
                this.f42628b = bVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Dj.c it) {
                AbstractC6492s.i(it, "it");
                Z7.b.g("Bonjour discovery type " + this.f42627a + " " + this.f42628b.hashCode() + " subscribed", "BonjourDiscoveryEngine");
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(String serviceType) {
            AbstractC6492s.i(serviceType, "serviceType");
            return b.this.h(serviceType).g0(new a(serviceType, b.this));
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f42629a = new e();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f42630a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                return error instanceof RxBonjour.Error ? gg.i.d2(5000L, TimeUnit.MILLISECONDS) : gg.i.k0(error);
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.p0(a.f42630a);
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f42631a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(List it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("discovery found - " + it.size() + " items", "BonjourDiscoveryEngine");
        }
    }

    static final class g implements InterfaceC6469f {
        g() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("discovery  " + b.this.hashCode() + " subscribed", "BonjourDiscoveryEngine");
        }
    }

    public b(RxBonjour bonjour, c.g serviceCatalog, d.b vendorManager, C5896a.b servicesLookupManager) {
        AbstractC6492s.i(bonjour, "bonjour");
        AbstractC6492s.i(serviceCatalog, "serviceCatalog");
        AbstractC6492s.i(vendorManager, "vendorManager");
        AbstractC6492s.i(servicesLookupManager, "servicesLookupManager");
        this.f42615a = bonjour;
        this.f42616b = serviceCatalog;
        this.f42617c = vendorManager;
        this.f42618d = servicesLookupManager;
        gg.i iVarP1 = bonjour.a().U().p0(new d()).p1(e.f42629a);
        AbstractC6492s.h(iVarP1, "retryWhen(...)");
        gg.i iVarI2 = g(iVarP1).f0(f.f42631a).g0(new g()).Z(new InterfaceC6464a() { // from class: Hc.b
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.discovery.engine.bonjour.b.j(this.f7822a);
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f42619e = iVarI2;
    }

    private final gg.i g(gg.i iVar) {
        gg.i iVarW = this.f42617c.a().w(new C1396b(iVar, this));
        AbstractC6492s.h(iVarW, "flatMapPublisher(...)");
        return iVarW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i h(String str) {
        gg.i iVarV = gg.i.v(this.f42615a.b(str), this.f42618d.a().W(), new c());
        AbstractC6492s.h(iVarV, "combineLatest(...)");
        return AbstractC6561f.e(iVarV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ui.wifiman.model.discovery.engine.bonjour.a.C1395a i(long r15, inet.ipaddr.g r17, java.util.List r18, com.ui.wifiman.model.vendor.d.a r19) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.model.discovery.engine.bonjour.b.i(long, inet.ipaddr.g, java.util.List, com.ui.wifiman.model.vendor.d$a):com.ui.wifiman.model.discovery.engine.bonjour.a$a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(b bVar) {
        Z7.b.g("discovery " + bVar.hashCode() + " finished", "BonjourDiscoveryEngine");
    }

    @Override // Ec.t
    public gg.i b() {
        return this.f42619e;
    }
}
