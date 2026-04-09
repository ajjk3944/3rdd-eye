package ie;

import S8.e;
import Yg.J;
import Yg.s;
import Zg.AbstractC3689v;
import Zg.U;
import a8.C3771a;
import com.ubnt.usurvey.wifi.WifiChannelUtils;
import dc.C5341a;
import fh.InterfaceC5826a;
import gg.i;
import ie.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ke.AbstractC6456a;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le.C6588i;
import le.InterfaceC6586g;
import mh.InterfaceC6835l;
import oh.AbstractC7137b;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class g implements ie.f {

    /* renamed from: i, reason: collision with root package name */
    public static final a f49151i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C5341a f49152a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f49153b;

    /* renamed from: c, reason: collision with root package name */
    private final double f49154c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f49155d;

    /* renamed from: e, reason: collision with root package name */
    private final i f49156e;

    /* renamed from: f, reason: collision with root package name */
    private final i f49157f;

    /* renamed from: g, reason: collision with root package name */
    private final i f49158g;

    /* renamed from: h, reason: collision with root package name */
    private final i f49159h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map f49160a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC6147d f49161b;

        public b(Map affiliatedChannelEnv, InterfaceC6147d env) {
            AbstractC6492s.i(affiliatedChannelEnv, "affiliatedChannelEnv");
            AbstractC6492s.i(env, "env");
            this.f49160a = affiliatedChannelEnv;
            this.f49161b = env;
        }

        public final Map a() {
            return this.f49160a;
        }

        public final InterfaceC6147d b() {
            return this.f49161b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f49160a, bVar.f49160a) && AbstractC6492s.d(this.f49161b, bVar.f49161b);
        }

        public int hashCode() {
            return (this.f49160a.hashCode() * 31) + this.f49161b.hashCode();
        }

        public String toString() {
            return "EnvData(affiliatedChannelEnv=" + this.f49160a + ", env=" + this.f49161b + ")";
        }
    }

    private static final class c extends RuntimeException {

        /* renamed from: a, reason: collision with root package name */
        private final String f49162a;

        public c(String message) {
            AbstractC6492s.i(message, "message");
            this.f49162a = message;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f49162a;
        }
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f49163a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map apply(b it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f49164a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(Set it) {
            AbstractC6492s.i(it, "it");
            ArrayList arrayList = new ArrayList();
            Iterator it2 = it.iterator();
            while (it2.hasNext()) {
                AbstractC3689v.C(arrayList, ((S8.c) it2.next()).getChannels());
            }
            return arrayList;
        }
    }

    static final class f implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f49165a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6147d apply(b it) {
            AbstractC6492s.i(it, "it");
            return it.b();
        }
    }

    /* renamed from: ie.g$g, reason: collision with other inner class name */
    static final class C1849g implements n {
        C1849g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(List list, C6588i it) {
            AbstractC6492s.i(it, "it");
            list.add(it);
            return J.f24997a;
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b apply(s sVar) {
            ArrayList arrayList;
            AbstractC6492s.i(sVar, "<destruct>");
            List<S8.e> list = (List) sVar.a();
            Object objC = sVar.c();
            AbstractC6492s.h(objC, "component2(...)");
            List<C6588i> list2 = (List) objC;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            InterfaceC5826a entries = S8.c.getEntries();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(entries, 10)), 16));
            for (Object obj : entries) {
                linkedHashMap3.put(obj, new C3771a());
            }
            for (C6588i c6588i : list2) {
                Object obj2 = linkedHashMap3.get(c6588i.f().a());
                AbstractC6492s.f(obj2);
                ((C3771a) obj2).d(c6588i.i(), c6588i);
                if (c6588i.m() instanceof AbstractC6456a.AbstractC1905a) {
                    linkedHashMap2.put(c6588i.f().a(), c6588i);
                }
            }
            Map mapC = U.c();
            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                S8.c cVar = (S8.c) entry.getKey();
                C3771a c3771a = (C3771a) entry.getValue();
                final List listC = AbstractC3689v.c();
                c3771a.c(new InterfaceC6835l() { // from class: ie.h
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj3) {
                        return g.C1849g.c(listC, (C6588i) obj3);
                    }
                });
                J j10 = J.f24997a;
                mapC.put(cVar, AbstractC3689v.a(listC));
            }
            Map mapB = U.b(mapC);
            ArrayList arrayList2 = new ArrayList(mapB.size());
            Iterator it = mapB.entrySet().iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((List) ((Map.Entry) it.next()).getValue()).size()));
            }
            Z7.b.h("WifiEnvironment - counted with only with " + AbstractC3689v.Z0(arrayList2) + " signals (every AP is counted just once per band). Initial signal count: " + list2.size(), null, 2, null);
            g gVar = g.this;
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (S8.e eVar : list) {
                List list3 = (List) mapB.get(eVar.a());
                if (list3 == null) {
                    throw new IllegalStateException("WifiEnvironment was not provided with record for band " + eVar.a());
                }
                linkedHashMap.put(eVar, gVar.h(eVar, list3));
            }
            Z7.b.h("WifiEnvironment - computation took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms. (" + list2.size() + " signals)", null, 2, null);
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            g gVar2 = g.this;
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                S8.c cVar2 = (S8.c) entry2.getKey();
                C6588i c6588i2 = (C6588i) entry2.getValue();
                List list4 = (List) mapB.get(c6588i2.f().a());
                if (list4 != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list4) {
                        if (!AbstractC6492s.d(((C6588i) obj3).i(), c6588i2.i())) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    arrayList = null;
                }
                S8.e eVarF = c6588i2.f();
                if (arrayList == null) {
                    throw new IllegalStateException("WifiEnvironment was not provided with record for band " + c6588i2.f().a());
                }
                linkedHashMap4.put(cVar2, gVar2.h(eVarF, arrayList));
            }
            return new b(linkedHashMap4, new ie.e(linkedHashMap));
        }
    }

    public g(InterfaceC6586g wifiScannerService, C5341a buildConfig) {
        AbstractC6492s.i(wifiScannerService, "wifiScannerService");
        AbstractC6492s.i(buildConfig, "buildConfig");
        this.f49152a = buildConfig;
        this.f49153b = new HashMap();
        this.f49154c = g(-45.0d);
        this.f49155d = new HashMap();
        i iVarN0 = wifiScannerService.c().N0(e.f49164a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f49156e = iVarN0;
        Ag.c cVar = Ag.c.f753a;
        i iVarX1 = wifiScannerService.a().X1(2000L, TimeUnit.MILLISECONDS, true);
        AbstractC6492s.h(iVarX1, "throttleLatest(...)");
        i iVarI2 = cVar.a(iVarN0, iVarX1).e1().Y0(Gg.a.d(), false, 1).N0(new C1849g()).Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f49157f = iVarI2;
        i iVarI22 = iVarI2.N0(f.f49165a).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f49158g = iVarI22;
        i iVarI23 = iVarI2.N0(d.f49163a).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f49159h = iVarI23;
    }

    private final double d(int i10, double d10, double d11) {
        return i10 * AbstractC7137b.c((d10 / d11) + 1.0d);
    }

    private final double e(S8.e eVar) {
        return g(f(eVar) + 5.0d);
    }

    private final double f(S8.e eVar) {
        return (Math.log10(eVar.b().getWidth()) * 10) - 114;
    }

    private final double g(double d10) {
        return Math.pow(10.0d, d10 / 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6146c h(S8.e eVar, List list) {
        return new C6146c(eVar, j(eVar), d(eVar.b().getWidth(), this.f49154c, k(eVar, list)));
    }

    private final double i(S8.e eVar) {
        HashMap map = this.f49153b;
        Object objValueOf = map.get(eVar);
        if (objValueOf == null) {
            objValueOf = Double.valueOf(e(eVar));
            map.put(eVar, objValueOf);
        }
        return ((Number) objValueOf).doubleValue();
    }

    private final double j(S8.e eVar) {
        HashMap map = this.f49155d;
        Object objValueOf = map.get(eVar);
        if (objValueOf == null) {
            objValueOf = Double.valueOf(d(eVar.b().getWidth(), this.f49154c, k(eVar, AbstractC3689v.l())));
            map.put(eVar, objValueOf);
        }
        return ((Number) objValueOf).doubleValue();
    }

    private final double k(S8.e eVar, List list) {
        double dL;
        if (eVar.d() == 48 && eVar.b() == S8.d.MHZ_20) {
            System.out.println((Object) ("Channel 48 noise estimate calculation, rogues " + list.size() + ":"));
        }
        double dI = i(eVar);
        for (C6588i c6588i : AbstractC3689v.d0(list)) {
            if (c6588i.q() != null) {
                if (c6588i.f().b() == S8.d.MHZ_80_80 && (c6588i.f().e() instanceof e.b.a)) {
                    e.b bVarE = c6588i.f().e();
                    AbstractC6492s.g(bVarE, "null cannot be cast to non-null type com.ubnt.usurvey.wifi.WifiChannel.FrequencyRange.Combined");
                    e.b.a aVar = (e.b.a) bVarE;
                    WifiChannelUtils wifiChannelUtils = WifiChannelUtils.f41035a;
                    Integer numC = wifiChannelUtils.c(aVar.d());
                    if (numC != null) {
                        int iIntValue = numC.intValue();
                        int iB = c6588i.q().b();
                        S8.c cVarA = c6588i.f().a();
                        int iD = aVar.d();
                        S8.d dVar = S8.d.MHZ_80;
                        dI += l(eVar, iB, new S8.e(cVarA, iIntValue, new e.b.C0729b(dVar, iD), dVar));
                    }
                    Integer numC2 = wifiChannelUtils.c(aVar.e());
                    if (numC2 != null) {
                        int iIntValue2 = numC2.intValue();
                        int iB2 = c6588i.q().b();
                        S8.c cVarA2 = c6588i.f().a();
                        int iE = aVar.e();
                        S8.d dVar2 = S8.d.MHZ_80;
                        dL = l(eVar, iB2, new S8.e(cVarA2, iIntValue2, new e.b.C0729b(dVar2, iE), dVar2));
                        dI += dL;
                    }
                } else {
                    dL = l(eVar, c6588i.q().b(), c6588i.f());
                    if (eVar.d() == 48 && eVar.b() == S8.d.MHZ_20) {
                        System.out.println((Object) ("rogue " + c6588i.f().d() + " - noise: " + dL));
                    }
                    J j10 = J.f24997a;
                    dI += dL;
                }
            }
        }
        if (eVar.d() == 48 && eVar.b() == S8.d.MHZ_20) {
            System.out.println((Object) ("noise: " + dI));
        }
        return dI;
    }

    private final double l(S8.e eVar, int i10, S8.e eVar2) {
        double dDoubleValue;
        if (!eVar2.f(eVar)) {
            return 0.0d;
        }
        double dMax = Math.max(Math.min(i10, -45), -85);
        Double dB = S8.e.f20364f.b(eVar, eVar2);
        if (dB == null) {
            if (this.f49152a.e()) {
                Z7.b.e("no isolation record found for " + eVar2 + ". Falling back to -37.0", null, null, 6, null);
            } else {
                Z7.b.f(new c("no isolation record found for " + eVar2 + ". Falling back to -37.0"), null, 2, null);
            }
            dDoubleValue = -37.0d;
        } else {
            dDoubleValue = dB.doubleValue();
        }
        return g((dMax + dDoubleValue) - 20);
    }

    @Override // ie.f
    public i a() {
        return this.f49158g;
    }

    @Override // ie.f
    public i b() {
        return this.f49159h;
    }
}
