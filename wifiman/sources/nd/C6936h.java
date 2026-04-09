package nd;

import Bc.a;
import Cc.InterfaceC2557a;
import Cd.f;
import V7.a;
import V7.b;
import Zg.AbstractC3689v;
import Zg.U;
import a8.C3771a;
import a8.C3772b;
import android.content.Context;
import b8.AbstractC4075b;
import com.ui.wifiman.model.speedtest.result.b;
import com.ui.wifiman.model.speedtest.result.d;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.z;
import h9.C5969a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import je.AbstractC6317r;
import je.u;
import ke.AbstractC6458c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import l9.C6556a;
import sh.AbstractC7978m;
import wa.InterfaceC8290a;

/* renamed from: nd.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6936h implements InterfaceC6935g, com.ui.wifiman.model.speedtest.result.d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f54591a;

    /* renamed from: b, reason: collision with root package name */
    private final Wb.j f54592b;

    /* renamed from: c, reason: collision with root package name */
    private final Cd.f f54593c;

    /* renamed from: d, reason: collision with root package name */
    private final Cc.n f54594d;

    /* renamed from: e, reason: collision with root package name */
    private final Zc.c f54595e;

    /* renamed from: f, reason: collision with root package name */
    private final ad.i f54596f;

    /* renamed from: g, reason: collision with root package name */
    private final u f54597g;

    /* renamed from: h, reason: collision with root package name */
    private final Bc.a f54598h;

    /* renamed from: i, reason: collision with root package name */
    private final z f54599i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f54600j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f54601k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f54602l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: nd.h$a */
    private static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a G5_NR;
        public static final a G5_NR_ADVANCED;
        private final String dbId;
        private final V7.b type;
        public static final a GSM = new a("GSM", 0, "gsm", b.e.f23116a);
        public static final a G2_EDGE = new a("G2_EDGE", 1, "g2_edge", b.a.C0845b.f23096a);
        public static final a G2_GPRS = new a("G2_GPRS", 2, "g2_gprs", b.a.c.f23097a);
        public static final a G2_CDMA = new a("G2_CDMA", 3, "g2_cdma", b.a.C0844a.f23095a);
        public static final a G2_IDEN = new a("G2_IDEN", 4, "g2_iden", b.a.d.f23098a);
        public static final a G2_RTXX1 = new a("G2_RTXX1", 5, "g2_rttx1", b.a.e.f23099a);
        public static final a G3_UMTS = new a("G3_UMTS", 6, "g3_umts", b.AbstractC0846b.i.f23108a);
        public static final a G3_HSDPA = new a("G3_HSDPA", 7, "g3_hdspa", b.AbstractC0846b.d.f23103a);
        public static final a G3_HSPA = new a("G3_HSPA", 8, "g3_hspa", b.AbstractC0846b.e.f23104a);
        public static final a G3_HSPAP = new a("G3_HSPAP", 9, "g3_hspap", b.AbstractC0846b.f.f23105a);
        public static final a G3_EVDO_0 = new a("G3_EVDO_0", 10, "g3_evdo_0", b.AbstractC0846b.a.f23100a);
        public static final a G3_EVDO_A = new a("G3_EVDO_A", 11, "g3_evdo_a", b.AbstractC0846b.C0847b.f23101a);
        public static final a G3_EVDO_B = new a("G3_EVDO_B", 12, "g3_evdo_b", b.AbstractC0846b.c.f23102a);
        public static final a G3_TD_Scma = new a("G3_TD_Scma", 13, "g3_td_scma", b.AbstractC0846b.h.f23107a);
        public static final a G3_HSUPA = new a("G3_HSUPA", 14, "g3_hsupa", b.AbstractC0846b.g.f23106a);
        public static final a G4_EHRPD = new a("G4_EHRPD", 15, "g4_ehrpd", b.c.a.f23109a);
        public static final a G4_LTE = new a("G4_LTE", 16, "g4_lte", b.c.C0848b.f23110a);
        public static final a G4_LTE_CA = new a("G4_LTE_CA", 17, "g4_lte_ca", b.c.d.f23112a);
        public static final a G4_LTE_ADVANCED = new a("G4_LTE_ADVANCED", 18, "g4_lte_advanced", b.c.C0849c.f23111a);
        public static final a G5_IWLAN = new a("G5_IWLAN", 19, "g5_iwlan", b.d.a.f23113a);

        private static final /* synthetic */ a[] $values() {
            return new a[]{GSM, G2_EDGE, G2_GPRS, G2_CDMA, G2_IDEN, G2_RTXX1, G3_UMTS, G3_HSDPA, G3_HSPA, G3_HSPAP, G3_EVDO_0, G3_EVDO_A, G3_EVDO_B, G3_TD_Scma, G3_HSUPA, G4_EHRPD, G4_LTE, G4_LTE_CA, G4_LTE_ADVANCED, G5_IWLAN, G5_NR, G5_NR_ADVANCED};
        }

        static {
            b.d.C0850b c0850b = b.d.C0850b.f23114a;
            G5_NR = new a("G5_NR", 20, "g5_nr", c0850b);
            G5_NR_ADVANCED = new a("G5_NR_ADVANCED", 21, "g5_nr_advanced", c0850b);
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, String str2, V7.b bVar) {
            this.dbId = str2;
            this.type = bVar;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final String getDbId() {
            return this.dbId;
        }

        public final V7.b getType() {
            return this.type;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: nd.h$b */
    private static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        private final int nameResource;
        public static final b LIVING_ROOM = new b("LIVING_ROOM", 0, jc.d.f50228d);
        public static final b OFFICE = new b("OFFICE", 1, jc.d.f50229e);
        public static final b BEDROOM = new b("BEDROOM", 2, jc.d.f50225a);
        public static final b DINING_ROOM = new b("DINING_ROOM", 3, jc.d.f50226b);
        public static final b KITCHEN = new b("KITCHEN", 4, jc.d.f50227c);

        private static final /* synthetic */ b[] $values() {
            return new b[]{LIVING_ROOM, OFFICE, BEDROOM, DINING_ROOM, KITCHEN};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10, int i11) {
            this.nameResource = i11;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int getNameResource() {
            return this.nameResource;
        }
    }

    /* renamed from: nd.h$c */
    static final class c implements kg.n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(C6934f place) {
            AbstractC6492s.i(place, "place");
            return C6936h.this.t(place).g(C6936h.this.s(place.j())).k(z.z(place));
        }
    }

    /* renamed from: nd.h$d */
    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f54604a;

        /* renamed from: nd.h$d$a */
        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Wb.j f54605a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f54606b;

            public a(Wb.j jVar, String str) {
                this.f54605a = jVar;
                this.f54606b = str;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    if (this.f54605a.a(this.f54606b) < 1) {
                        Z7.b.j("Failed to delete a place " + this.f54606b, new IllegalStateException("failed to delete a place " + this.f54606b), null, 4, null);
                    }
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        d(String str) {
            this.f54604a = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Wb.j dao) {
            AbstractC6492s.i(dao, "dao");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(dao, this.f54604a));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    /* renamed from: nd.h$e */
    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f54607a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Wb.j dao) {
            AbstractC6492s.i(dao, "dao");
            return dao.f();
        }
    }

    /* renamed from: nd.h$f */
    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f54608a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List it) {
            AbstractC6492s.i(it, "it");
            List list = it;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Wb.g) it2.next()).b());
            }
            return arrayList;
        }
    }

    /* renamed from: nd.h$g */
    static final class g implements kg.k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f54609a;

        g(String str) {
            this.f54609a = str;
        }

        @Override // kg.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6934f a(AbstractC6317r wifiConnectionState, f.a speedtestState, dd.i latency, dd.i dnsLatency, C3771a localDeviceDir, a.b sim0, a.b sim1) {
            AbstractC6458c abstractC6458cI;
            AbstractC6492s.i(wifiConnectionState, "wifiConnectionState");
            AbstractC6492s.i(speedtestState, "speedtestState");
            AbstractC6492s.i(latency, "latency");
            AbstractC6492s.i(dnsLatency, "dnsLatency");
            AbstractC6492s.i(localDeviceDir, "localDeviceDir");
            AbstractC6492s.i(sim0, "sim0");
            AbstractC6492s.i(sim1, "sim1");
            boolean z10 = wifiConnectionState instanceof AbstractC6317r.b.a;
            AbstractC6317r.b.a aVar = z10 ? (AbstractC6317r.b.a) wifiConnectionState : null;
            C3772b c3772bA = aVar != null ? aVar.a() : null;
            InterfaceC2557a.b bVar = c3772bA != null ? (InterfaceC2557a.b) localDeviceDir.a(c3772bA) : null;
            AbstractC6317r.b.a aVar2 = z10 ? (AbstractC6317r.b.a) wifiConnectionState : null;
            String strB = (aVar2 == null || (abstractC6458cI = aVar2.i()) == null) ? null : abstractC6458cI.b();
            AbstractC6317r.b.a aVar3 = z10 ? (AbstractC6317r.b.a) wifiConnectionState : null;
            C5969a c5969aC = aVar3 != null ? aVar3.c() : null;
            String name = bVar != null ? bVar.getName() : null;
            String strB2 = bVar != null ? bVar.b() : null;
            AbstractC6317r.b.a aVar4 = z10 ? (AbstractC6317r.b.a) wifiConnectionState : null;
            S8.l lVarH = aVar4 != null ? aVar4.h() : null;
            f.a.AbstractC0125a.b bVar2 = speedtestState instanceof f.a.AbstractC0125a.b ? (f.a.AbstractC0125a.b) speedtestState : null;
            W7.a aVarA = bVar2 != null ? bVar2.a() : null;
            AbstractC4075b abstractC4075bD = latency.d();
            AbstractC4075b abstractC4075bD2 = dnsLatency.d();
            b8.d dVarE = latency.e();
            AbstractC6317r.b.a aVar5 = z10 ? (AbstractC6317r.b.a) wifiConnectionState : null;
            S8.c cVarB = aVar5 != null ? aVar5.b() : null;
            AbstractC6317r.b.a aVar6 = z10 ? (AbstractC6317r.b.a) wifiConnectionState : null;
            S8.a aVarE = aVar6 != null ? aVar6.e() : null;
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i10 = !(sim0 instanceof a.b.AbstractC0054a.AbstractC0056b.C0057a) ? 1 : 0;
            boolean z11 = sim0 instanceof a.b.AbstractC0054a.AbstractC0056b;
            a.b.AbstractC0054a.AbstractC0056b abstractC0056b = z11 ? (a.b.AbstractC0054a.AbstractC0056b) sim0 : null;
            V7.a aVarB = abstractC0056b != null ? abstractC0056b.b() : null;
            a.b.AbstractC0054a.AbstractC0056b abstractC0056b2 = z11 ? (a.b.AbstractC0054a.AbstractC0056b) sim0 : null;
            V7.b bVarC = abstractC0056b2 != null ? abstractC0056b2.c() : null;
            boolean z12 = sim1 instanceof a.b.AbstractC0054a.AbstractC0056b;
            a.b.AbstractC0054a.AbstractC0056b abstractC0056b3 = z12 ? (a.b.AbstractC0054a.AbstractC0056b) sim1 : null;
            V7.a aVarB2 = abstractC0056b3 != null ? abstractC0056b3.b() : null;
            a.b.AbstractC0054a.AbstractC0056b abstractC0056b4 = z12 ? (a.b.AbstractC0054a.AbstractC0056b) sim1 : null;
            return new C6934f("not_persistent", this.f54609a, strB, c5969aC, strB2, name, lVarH, Integer.valueOf(i10), aVarB, bVarC, aVarB2, abstractC0056b4 != null ? abstractC0056b4.c() : null, aVarA, abstractC4075bD, abstractC4075bD2, dVarE, cVarB, aVarE, jCurrentTimeMillis);
        }
    }

    /* renamed from: nd.h$h, reason: collision with other inner class name */
    static final class C1988h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f54610a;

        C1988h(String str) {
            this.f54610a = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Wb.j dao) {
            AbstractC6492s.i(dao, "dao");
            Long lS = t.s(this.f54610a);
            String str = this.f54610a;
            if (lS != null) {
                return dao.d(lS.longValue());
            }
            throw new IllegalStateException(("placeID in incorrect format " + str).toString());
        }
    }

    /* renamed from: nd.h$i */
    static final class i implements kg.n {
        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List it) {
            AbstractC6492s.i(it, "it");
            Wb.f fVar = (Wb.f) AbstractC3689v.s0(it);
            return new C6556a(fVar != null ? C6936h.this.o(fVar) : null);
        }
    }

    /* renamed from: nd.h$j */
    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f54612a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Wb.j dao) {
            AbstractC6492s.i(dao, "dao");
            return dao.g();
        }
    }

    /* renamed from: nd.h$k */
    static final class k implements kg.n {
        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List it) {
            AbstractC6492s.i(it, "it");
            List list = it;
            C6936h c6936h = C6936h.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(c6936h.o((Wb.f) it2.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: nd.h$l */
    public static final class l implements C {
        public l() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                if (C6936h.this.f54592b.h() == 0) {
                    int i10 = 0;
                    for (Object obj : AbstractC3689v.P0(b.getEntries())) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            AbstractC3689v.v();
                        }
                        C6936h.this.f54592b.e(C6936h.this.v((b) obj, i10));
                        i10 = i11;
                    }
                }
                interfaceC5910A.onSuccess(C6936h.this.f54592b);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: nd.h$m */
    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f54615a;

        /* renamed from: nd.h$m$a */
        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f54616a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Wb.j f54617b;

            public a(String str, Wb.j jVar) {
                this.f54616a = str;
                this.f54617b = jVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    Wb.g gVar = new Wb.g(this.f54616a, System.currentTimeMillis());
                    if (this.f54617b.b(gVar) >= 1) {
                        Z7.b.h("Signal mapper place name timestamp updated", null, 2, null);
                    } else {
                        if (this.f54617b.e(gVar) == -1) {
                            throw new IllegalStateException("failed to created a place name");
                        }
                        Z7.b.h("Signal mapper place name created", null, 2, null);
                    }
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        /* renamed from: nd.h$m$b */
        public static final class b implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Wb.j f54618a;

            public b(Wb.j jVar) {
                this.f54618a = jVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    if (this.f54618a.i() > 0) {
                        Z7.b.h("Signal mapper custom name list trimmed", null, 2, null);
                    }
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        m(String str) {
            this.f54615a = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Wb.j dao) {
            AbstractC6492s.i(dao, "dao");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(this.f54615a, dao));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            AbstractC5912b abstractC5912bR2 = AbstractC5912b.r(new b(dao));
            AbstractC6492s.h(abstractC5912bR2, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR.g(abstractC5912bR2);
        }
    }

    /* renamed from: nd.h$n */
    static final class n implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6934f f54620b;

        /* renamed from: nd.h$n$a */
        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Wb.j f54621a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C6936h f54622b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C6934f f54623c;

            public a(Wb.j jVar, C6936h c6936h, C6934f c6934f) {
                this.f54621a = jVar;
                this.f54622b = c6936h;
                this.f54623c = c6934f;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    if (this.f54621a.c(this.f54622b.u(this.f54623c)) == -1) {
                        throw new IllegalStateException("failed to created a place");
                    }
                    Z7.b.h("Signal mapper place " + this.f54623c.j() + " created", null, 2, null);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        n(C6934f c6934f) {
            this.f54620b = c6934f;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Wb.j dao) {
            AbstractC6492s.i(dao, "dao");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(dao, C6936h.this, this.f54620b));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    public C6936h(Context applicationContext, Wb.j _placesDao, Cd.f infiniteLocalSpeedtest, Cc.n deviceManager, Zc.c internetLatencyService, ad.i dnsLatencyService, u wifiConnectionService, Bc.a cellularSignalService) {
        AbstractC6492s.i(applicationContext, "applicationContext");
        AbstractC6492s.i(_placesDao, "_placesDao");
        AbstractC6492s.i(infiniteLocalSpeedtest, "infiniteLocalSpeedtest");
        AbstractC6492s.i(deviceManager, "deviceManager");
        AbstractC6492s.i(internetLatencyService, "internetLatencyService");
        AbstractC6492s.i(dnsLatencyService, "dnsLatencyService");
        AbstractC6492s.i(wifiConnectionService, "wifiConnectionService");
        AbstractC6492s.i(cellularSignalService, "cellularSignalService");
        this.f54591a = applicationContext;
        this.f54592b = _placesDao;
        this.f54593c = infiniteLocalSpeedtest;
        this.f54594d = deviceManager;
        this.f54595e = internetLatencyService;
        this.f54596f = dnsLatencyService;
        this.f54597g = wifiConnectionService;
        this.f54598h = cellularSignalService;
        z zVarI = z.i(new l());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarE = zVarI.e();
        AbstractC6492s.h(zVarE, "cache(...)");
        this.f54599i = zVarE;
        gg.i iVarN0 = zVarE.w(j.f54612a).F1(Gg.a.d()).X0(Gg.a.a()).N0(new k());
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f54600j = iVarN0;
        gg.i iVarN02 = zVarE.w(e.f54607a).F1(Gg.a.d()).X0(Gg.a.a()).N0(f.f54608a);
        AbstractC6492s.h(iVarN02, "map(...)");
        this.f54601k = iVarN02;
        InterfaceC5826a entries = a.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(((a) obj).getDbId(), obj);
        }
        this.f54602l = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6934f o(Wb.f fVar) {
        V7.a aVarQ;
        V7.a aVarQ2;
        a aVar;
        V7.b type;
        a aVar2;
        a aVar3;
        V7.b type2;
        a aVar4;
        String strValueOf = String.valueOf(fVar.f());
        String strJ = fVar.j();
        String strR = fVar.r();
        String strC = fVar.c();
        C5969a c5969aE = strC != null ? C5969a.f48518b.e(strC) : null;
        String strB = fVar.b();
        String strA = fVar.a();
        Integer numP = fVar.p();
        S8.l lVarA = numP != null ? S8.l.f20404f.a(numP.intValue()) : null;
        Integer numQ = fVar.q();
        String strM = fVar.m();
        V7.b type3 = (strM == null || (aVar4 = (a) this.f54602l.get(strM)) == null) ? null : aVar4.getType();
        Integer numL = fVar.l();
        if (numL != null) {
            int iIntValue = numL.intValue();
            String strM2 = fVar.m();
            aVarQ = (strM2 == null || (aVar3 = (a) this.f54602l.get(strM2)) == null || (type2 = aVar3.getType()) == null) ? null : q(iIntValue, type2);
        } else {
            aVarQ = null;
        }
        String strO = fVar.o();
        V7.b type4 = (strO == null || (aVar2 = (a) this.f54602l.get(strO)) == null) ? null : aVar2.getType();
        Integer numN = fVar.n();
        if (numN != null) {
            int iIntValue2 = numN.intValue();
            String strO2 = fVar.o();
            aVarQ2 = (strO2 == null || (aVar = (a) this.f54602l.get(strO2)) == null || (type = aVar.getType()) == null) ? null : q(iIntValue2, type);
        } else {
            aVarQ2 = null;
        }
        Long lS = fVar.s();
        W7.a aVarB = lS != null ? W7.a.f23676b.b(lS.longValue()) : null;
        Integer numI = fVar.i();
        AbstractC4075b abstractC4075bA = numI != null ? AbstractC4075b.f33002a.a(numI.intValue()) : null;
        Integer numE = fVar.e();
        AbstractC4075b abstractC4075bA2 = numE != null ? AbstractC4075b.f33002a.a(numE.intValue()) : null;
        Integer numK = fVar.k();
        return new C6934f(strValueOf, strJ, strR, c5969aE, strA, strB, lVarA, numQ, aVarQ, type3, aVarQ2, type4, aVarB, abstractC4075bA, abstractC4075bA2, numK != null ? b8.d.f33007a.a(numK.intValue()) : null, fVar.t(), fVar.g(), fVar.d());
    }

    private final a p(V7.b bVar) {
        if (bVar instanceof b.e) {
            return a.GSM;
        }
        if (bVar instanceof b.a.C0845b) {
            return a.G2_EDGE;
        }
        if (bVar instanceof b.a.c) {
            return a.G2_GPRS;
        }
        if (bVar instanceof b.a.C0844a) {
            return a.G2_CDMA;
        }
        if (bVar instanceof b.a.d) {
            return a.G2_IDEN;
        }
        if (bVar instanceof b.a.e) {
            return a.G2_RTXX1;
        }
        if (bVar instanceof b.AbstractC0846b.i) {
            return a.G3_UMTS;
        }
        if (bVar instanceof b.AbstractC0846b.d) {
            return a.G3_HSDPA;
        }
        if (bVar instanceof b.AbstractC0846b.e) {
            return a.G3_HSPA;
        }
        if (bVar instanceof b.AbstractC0846b.f) {
            return a.G3_HSPAP;
        }
        if (bVar instanceof b.AbstractC0846b.a) {
            return a.G3_EVDO_0;
        }
        if (bVar instanceof b.AbstractC0846b.C0847b) {
            return a.G3_EVDO_A;
        }
        if (bVar instanceof b.AbstractC0846b.c) {
            return a.G3_EVDO_B;
        }
        if (bVar instanceof b.AbstractC0846b.h) {
            return a.G3_TD_Scma;
        }
        if (bVar instanceof b.AbstractC0846b.g) {
            return a.G3_HSUPA;
        }
        if (bVar instanceof b.c.a) {
            return a.G4_EHRPD;
        }
        if (bVar instanceof b.c.C0848b) {
            return a.G4_LTE;
        }
        if (bVar instanceof b.c.d) {
            return a.G4_LTE_CA;
        }
        if (bVar instanceof b.c.C0849c) {
            return a.G4_LTE_ADVANCED;
        }
        if (bVar instanceof b.d.a) {
            return a.G5_IWLAN;
        }
        if (bVar instanceof b.d.C0850b) {
            return a.G5_NR;
        }
        if (bVar instanceof b.d.c) {
            return a.G5_NR_ADVANCED;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final V7.a q(int i10, V7.b bVar) {
        if ((bVar instanceof b.e) || (bVar instanceof b.a) || (bVar instanceof b.AbstractC0846b)) {
            return a.C0841a.f23089e.a(i10);
        }
        if ((bVar instanceof b.c) || (bVar instanceof b.d)) {
            return a.b.f23092e.a(i10);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final z r(String str) {
        z zVarO0 = gg.i.q(this.f54597g.a(), this.f54593c.getState(), this.f54595e.a(), this.f54596f.a(), this.f54594d.a(), this.f54598h.e(), this.f54598h.d(), new g(str)).o0();
        AbstractC6492s.h(zVarO0, "firstOrError(...)");
        return zVarO0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b s(String str) {
        AbstractC5912b abstractC5912bT = this.f54599i.t(new m(str));
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b t(C6934f c6934f) {
        AbstractC5912b abstractC5912bT = this.f54599i.t(new n(c6934f));
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Wb.f u(C6934f c6934f) {
        a aVarP;
        a aVarP2;
        Long lS = t.s(c6934f.g());
        String strJ = c6934f.j();
        String strR = c6934f.r();
        C5969a c5969aD = c6934f.d();
        String strD = c5969aD != null ? c5969aD.d("") : null;
        String strB = c6934f.b();
        String strA = c6934f.a();
        S8.l lVarL = c6934f.l();
        W7.a aVarS = c6934f.s();
        Long lValueOf = aVarS != null ? Long.valueOf(aVarS.b()) : null;
        AbstractC4075b abstractC4075bI = c6934f.i();
        AbstractC4075b abstractC4075bF = c6934f.f();
        b8.d dVarK = c6934f.k();
        Integer numValueOf = dVarK != null ? Integer.valueOf(dVarK.b()) : null;
        S8.c cVarC = c6934f.c();
        S8.a aVarH = c6934f.h();
        long jE = c6934f.e();
        Integer numQ = c6934f.q();
        V7.a aVarN = c6934f.n();
        Integer numValueOf2 = aVarN != null ? Integer.valueOf(aVarN.b()) : null;
        V7.b bVarM = c6934f.m();
        String dbId = (bVarM == null || (aVarP2 = p(bVarM)) == null) ? null : aVarP2.getDbId();
        V7.a aVarP3 = c6934f.p();
        Integer numValueOf3 = aVarP3 != null ? Integer.valueOf(aVarP3.b()) : null;
        V7.b bVarO = c6934f.o();
        return new Wb.f(lS, strJ, strR, strD, strB, strA, lVarL, lValueOf, abstractC4075bI, abstractC4075bF, numValueOf, cVarC, aVarH, jE, numQ, numValueOf2, dbId, numValueOf3, (bVarO == null || (aVarP = p(bVarO)) == null) ? null : aVarP.getDbId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Wb.g v(b bVar, long j10) {
        String string = this.f54591a.getString(bVar.getNameResource());
        AbstractC6492s.h(string, "getString(...)");
        return new Wb.g(string, j10);
    }

    @Override // nd.InterfaceC6935g
    public AbstractC5912b a(String id2) {
        AbstractC6492s.i(id2, "id");
        AbstractC5912b abstractC5912bW = this.f54599i.t(new d(id2)).W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "subscribeOn(...)");
        return abstractC5912bW;
    }

    @Override // nd.InterfaceC6935g
    public z b(String name) {
        AbstractC6492s.i(name, "name");
        z zVarO = r(name).s(new c()).O(Gg.a.a());
        AbstractC6492s.h(zVarO, "subscribeOn(...)");
        return zVarO;
    }

    @Override // com.ui.wifiman.model.speedtest.result.d
    public Xb.c c(b.c cVar, long j10) {
        return d.a.a(this, cVar, j10);
    }

    @Override // com.ui.wifiman.model.speedtest.result.d
    public b.c d(Xb.c cVar, InterfaceC8290a interfaceC8290a) {
        return d.a.d(this, cVar, interfaceC8290a);
    }

    @Override // nd.InterfaceC6935g
    public gg.i e(String id2) {
        AbstractC6492s.i(id2, "id");
        gg.i iVarW = this.f54599i.w(new C1988h(id2)).F1(Gg.a.d()).X0(Gg.a.a()).N0(new i()).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        return iVarW;
    }

    @Override // nd.InterfaceC6935g
    public gg.i f() {
        return this.f54601k;
    }

    @Override // com.ui.wifiman.model.speedtest.result.d
    public b.AbstractC1432b g(Xb.c cVar, InterfaceC8290a interfaceC8290a) {
        return d.a.c(this, cVar, interfaceC8290a);
    }

    @Override // nd.InterfaceC6935g
    public gg.i h() {
        return this.f54600j;
    }
}
