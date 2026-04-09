package com.ui.wifiman.model.wifi.scan;

import Yg.y;
import Zg.U;
import com.ui.wifiman.model.vendor.d;
import com.ui.wifiman.model.wifi.scan.WifiSignalFactory;
import com.ui.wifiman.model.wmw.WifimanWizard;
import com.ui.wmw.WMWizard;
import com.ui.wmw.wifi.a;
import fe.u;
import h9.C5969a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import je.AbstractC6317r;
import je.C6296B;
import je.C6316q;
import ke.AbstractC6456a;
import ke.AbstractC6458c;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import le.C6585f;
import le.C6588i;
import le.InterfaceC6586g;
import me.InterfaceC6807F;
import me.InterfaceC6814f;
import oe.InterfaceC7123a;

/* loaded from: classes4.dex */
public final class a implements InterfaceC6586g {

    /* renamed from: l, reason: collision with root package name */
    public static final C1511a f43990l = new C1511a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6807F f43991a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7123a f43992b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f43993c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f43994d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f43995e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f43996f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f43997g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f43998h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f43999i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f44000j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f44001k;

    /* renamed from: com.ui.wifiman.model.wifi.scan.a$a, reason: collision with other inner class name */
    public static final class C1511a {
        public /* synthetic */ C1511a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1511a() {
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f44002a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f44003b;

        public b(String str, Map associatedLinks) {
            AbstractC6492s.i(associatedLinks, "associatedLinks");
            this.f44002a = str;
            this.f44003b = associatedLinks;
        }

        public final Map a() {
            return this.f44003b;
        }

        public final String b() {
            return this.f44002a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f44002a, bVar.f44002a) && AbstractC6492s.d(this.f44003b, bVar.f44003b);
        }

        public int hashCode() {
            String str = this.f44002a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f44003b.hashCode();
        }

        public String toString() {
            return "WifiLinkProperties(ssid=" + this.f44002a + ", associatedLinks=" + this.f44003b + ")";
        }
    }

    static final class c implements kg.n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(y yVar) {
            AbstractC6492s.i(yVar, "<destruct>");
            b bVar = (b) yVar.a();
            List list = (List) yVar.c();
            Object objD = yVar.d();
            AbstractC6492s.h(objD, "component3(...)");
            d.a aVar = (d.a) objD;
            Map mapK = a.this.k(bVar, list);
            ArrayList arrayList = new ArrayList();
            a aVar2 = a.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(aVar2.f43991a.a((me.k) it.next(), aVar, bVar.b(), mapK));
                } catch (WifiSignalFactory.Error e10) {
                    Z7.b.e("Ignoring Wifi Signal", e10, null, 4, null);
                }
            }
            return arrayList;
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f44005a = new d();

        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(List it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Wifi Survey manager signals emission - " + it.size() + " signals", null, 2, null);
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f44006a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(WifimanWizard.a wizardState) {
            AbstractC6492s.i(wizardState, "wizardState");
            if (wizardState instanceof WifimanWizard.a.AbstractC1520a.C1521a) {
                return new C6556a(((WifimanWizard.a.AbstractC1520a.C1521a) wizardState).b());
            }
            if ((wizardState instanceof WifimanWizard.a.AbstractC1520a.d) || (wizardState instanceof WifimanWizard.a.AbstractC1520a.b) || (wizardState instanceof WifimanWizard.a.AbstractC1520a.c) || (wizardState instanceof WifimanWizard.a.c) || (wizardState instanceof WifimanWizard.a.b)) {
                return new C6556a(null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f44007a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List it) {
            Object obj;
            AbstractC6492s.i(it, "it");
            Iterator it2 = it.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                C6588i c6588iE = ((C6585f) next).e();
                if ((c6588iE != null ? c6588iE.m() : null) instanceof AbstractC6456a.AbstractC1905a) {
                    obj = next;
                    break;
                }
            }
            return new C6556a(obj);
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f44008a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List signalSet) {
            AbstractC6492s.i(signalSet, "signalSet");
            HashMap map = new HashMap();
            Iterator it = signalSet.iterator();
            while (it.hasNext()) {
                C6588i c6588i = (C6588i) it.next();
                S8.i iVarA = S8.i.a(c6588i.o());
                Object arrayList = map.get(iVarA);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(iVarA, arrayList);
                }
                ((List) arrayList).add(c6588i);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C6585f((List) ((Map.Entry) it2.next()).getValue()));
            }
            return arrayList2;
        }
    }

    static final class h implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final h f44009a = new h();

        h() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(List it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Wifi Survey manager networs emission - " + it.size() + " networks", null, 2, null);
        }
    }

    static final class i implements kg.n {
        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            List list = (List) c6556a.a();
            if (list == null) {
                return a.this.f43996f;
            }
            gg.i iVarK0 = gg.i.K0(list);
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f44011a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List signal) {
            AbstractC6492s.i(signal, "signal");
            ArrayList arrayList = new ArrayList();
            for (Object obj : signal) {
                if (((C6588i) obj).m() instanceof AbstractC6456a.AbstractC1905a) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6296B f44012a;

        k(C6296B c6296b) {
            this.f44012a = c6296b;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            a.InterfaceC1679a interfaceC1679aD;
            gg.i iVarA;
            AbstractC6492s.i(c6556a, "<destruct>");
            com.ui.wmw.g gVar = (com.ui.wmw.g) c6556a.a();
            return (gVar == null || (interfaceC1679aD = gVar.d()) == null || (iVarA = interfaceC1679aD.a()) == null) ? this.f44012a.f() : iVarA;
        }
    }

    static final class l implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final l f44013a = new l();

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b apply(AbstractC6317r state) {
            Map mapB;
            C5969a c5969aE;
            C5969a c5969aE2;
            C5969a c5969aE3;
            AbstractC6492s.i(state, "state");
            if (!(state instanceof AbstractC6317r.b.a)) {
                if ((state instanceof AbstractC6317r.b.C1875b) || (state instanceof AbstractC6317r.a)) {
                    return new b(null, U.h());
                }
                throw new NoWhenBranchMatchedException();
            }
            AbstractC6317r.b.a aVar = (AbstractC6317r.b.a) state;
            AbstractC6458c abstractC6458cI = aVar.i();
            String strB = abstractC6458cI != null ? abstractC6458cI.b() : null;
            if (aVar instanceof AbstractC6317r.b.a.C1874b) {
                Map mapC = U.c();
                C5969a c5969aC = ((AbstractC6317r.b.a.C1874b) state).c();
                if (c5969aC != null) {
                    mapC.put(c5969aC, AbstractC6456a.AbstractC1905a.AbstractC1906a.C1907a.f51416a);
                }
                mapB = U.b(mapC);
            } else {
                if (!(aVar instanceof AbstractC6317r.b.a.C1873a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Map mapC2 = U.c();
                AbstractC6317r.b.a.C1873a c1873a = (AbstractC6317r.b.a.C1873a) state;
                C5969a c5969aC2 = c1873a.c();
                if (c5969aC2 != null) {
                }
                C6316q c6316qQ = c1873a.q();
                if (c6316qQ != null && (c5969aE3 = c6316qQ.e()) != null) {
                }
                C6316q c6316qR = c1873a.r();
                if (c6316qR != null && (c5969aE2 = c6316qR.e()) != null) {
                }
                C6316q c6316qS = c1873a.s();
                if (c6316qS != null && (c5969aE = c6316qS.e()) != null) {
                    mapC2.put(c5969aE, c1873a.s().i());
                }
                mapB = U.b(mapC2);
            }
            return new b(strB, mapB);
        }
    }

    static final class m implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d.b f44015b;

        /* renamed from: com.ui.wifiman.model.wifi.scan.a$m$a, reason: collision with other inner class name */
        static final class C1512a implements kg.g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f44016a;

            C1512a(a aVar) {
                this.f44016a = aVar;
            }

            @Override // kg.g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C6556a a(b connectionProperties, d.a vendorDirectory, List signals) {
                AbstractC6492s.i(connectionProperties, "connectionProperties");
                AbstractC6492s.i(vendorDirectory, "vendorDirectory");
                AbstractC6492s.i(signals, "signals");
                ArrayList arrayList = new ArrayList();
                a aVar = this.f44016a;
                Iterator it = signals.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(aVar.f43992b.a((com.ui.wmw.wifi.a) it.next(), vendorDirectory, connectionProperties.b(), connectionProperties.a()));
                    } catch (WifiSignalFactory.Error e10) {
                        Z7.b.e("Ignoring Wifi Signal", e10, null, 4, null);
                    }
                }
                return new C6556a(arrayList);
            }
        }

        m(d.b bVar) {
            this.f44015b = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            com.ui.wmw.g gVar = (com.ui.wmw.g) c6556a.a();
            if (gVar != null) {
                gg.i iVarU = gg.i.u(a.this.f43994d, this.f44015b.a().W(), gVar.d().b(), new C1512a(a.this));
                AbstractC6492s.f(iVarU);
                return iVarU;
            }
            gg.i iVarK0 = gg.i.K0(new C6556a(null));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    static final class n implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f44017a;

        /* renamed from: com.ui.wifiman.model.wifi.scan.a$n$a, reason: collision with other inner class name */
        static final class C1513a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ u f44018a;

            C1513a(u uVar) {
                this.f44018a = uVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                if (!(error instanceof WMWizard.Error)) {
                    return gg.i.k0(error);
                }
                Z7.b.e("Wifi Survey manager - Failed to obtain Wizard scan results", error, null, 4, null);
                return gg.i.e2(1000L, TimeUnit.MILLISECONDS, this.f44018a.a());
            }
        }

        n(u uVar) {
            this.f44017a = uVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i errorStream) {
            AbstractC6492s.i(errorStream, "errorStream");
            return errorStream.p0(new C1513a(this.f44017a));
        }
    }

    static final class o implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final o f44019a = new o();

        o() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6556a it) {
            AbstractC6492s.i(it, "it");
            List list = (List) it.b();
            Z7.b.h("Wifi Survey manager signals emission - " + (list != null ? Integer.valueOf(list.size()) : null) + " signals", null, 2, null);
        }
    }

    public a(InterfaceC6814f wifiScanner, C6296B wifiConnectionService, d.b vendorManager, WifimanWizard wifimanWizard, InterfaceC6807F signalFactoryAndroid, InterfaceC7123a signalFactoryWizard, u schedulers) {
        AbstractC6492s.i(wifiScanner, "wifiScanner");
        AbstractC6492s.i(wifiConnectionService, "wifiConnectionService");
        AbstractC6492s.i(vendorManager, "vendorManager");
        AbstractC6492s.i(wifimanWizard, "wifimanWizard");
        AbstractC6492s.i(signalFactoryAndroid, "signalFactoryAndroid");
        AbstractC6492s.i(signalFactoryWizard, "signalFactoryWizard");
        AbstractC6492s.i(schedulers, "schedulers");
        this.f43991a = signalFactoryAndroid;
        this.f43992b = signalFactoryWizard;
        gg.i iVarI2 = wifimanWizard.getState().N0(e.f44006a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f43993c = iVarI2;
        gg.i iVarI22 = wifiConnectionService.a().N0(l.f44013a).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f43994d = iVarI22;
        gg.i iVarI23 = iVarI2.I1(new m(vendorManager)).p1(new n(schedulers)).W().f0(o.f44019a).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f43995e = iVarI23;
        Ag.c cVar = Ag.c.f753a;
        gg.i iVarA = wifiScanner.a();
        gg.i iVarW = vendorManager.a().W();
        AbstractC6492s.h(iVarW, "toFlowable(...)");
        gg.i iVarI24 = cVar.b(iVarI22, iVarA, iVarW).N0(new c()).W().f0(d.f44005a).o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f43996f = iVarI24;
        gg.i iVarI25 = iVarI23.I1(new i()).o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f43997g = iVarI25;
        gg.i iVarI26 = a().N0(g.f44008a).W().f0(h.f44009a).o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f43998h = iVarI26;
        gg.i iVarI27 = a().N0(j.f44011a).W().o1(1).i2();
        AbstractC6492s.h(iVarI27, "refCount(...)");
        this.f43999i = iVarI27;
        gg.i iVarI28 = e().N0(f.f44007a).W().o1(1).i2();
        AbstractC6492s.h(iVarI28, "refCount(...)");
        this.f44000j = iVarI28;
        gg.i iVarI29 = iVarI2.I1(new k(wifiConnectionService)).W().o1(1).i2();
        AbstractC6492s.h(iVarI29, "refCount(...)");
        this.f44001k = iVarI29;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map k(b bVar, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (bVar.a().containsKey(((me.k) next).b())) {
                break;
            }
        }
        me.k kVar = (me.k) next;
        Set setA = kVar != null ? kVar.a() : null;
        if (setA == null) {
            return bVar.a();
        }
        Map mapC = U.c();
        Iterator it2 = setA.iterator();
        while (it2.hasNext()) {
            mapC.put((C5969a) it2.next(), AbstractC6456a.AbstractC1905a.b.f51418a);
        }
        mapC.putAll(bVar.a());
        return U.b(mapC);
    }

    @Override // le.InterfaceC6586g
    public gg.i a() {
        return this.f43997g;
    }

    @Override // le.InterfaceC6586g
    public gg.i b() {
        return this.f43999i;
    }

    @Override // le.InterfaceC6586g
    public gg.i c() {
        return this.f44001k;
    }

    @Override // le.InterfaceC6586g
    public gg.i d() {
        return this.f44000j;
    }

    @Override // le.InterfaceC6586g
    public gg.i e() {
        return this.f43998h;
    }
}
