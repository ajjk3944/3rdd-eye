package com.ubnt.usurvey.ui.signal.strength;

import Cd.f;
import Ee.C2706g;
import Te.B0;
import Te.C3592l0;
import Te.F0;
import Te.K0;
import Te.S;
import Yg.J;
import Zg.AbstractC3689v;
import Zg.U;
import b8.AbstractC4075b;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.ui.signal.strength.a;
import com.ubnt.usurvey.ui.signal.strength.c;
import de.z;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gc.EnumC5895b;
import gg.AbstractC5912b;
import i8.InterfaceC6084a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.AbstractC6317r;
import je.C6316q;
import ke.AbstractC6456a;
import kg.InterfaceC6465b;
import kg.InterfaceC6466c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import mh.InterfaceC6835l;
import re.InterfaceC7588a;
import s9.d;
import zi.AbstractC8783m;

/* loaded from: classes3.dex */
public final class c implements com.ubnt.usurvey.ui.signal.strength.a {

    /* renamed from: a, reason: collision with root package name */
    private final y8.p f40899a;

    /* renamed from: b, reason: collision with root package name */
    private final y8.d f40900b;

    /* renamed from: c, reason: collision with root package name */
    private final y8.n f40901c;

    /* renamed from: d, reason: collision with root package name */
    private final y8.m f40902d;

    /* renamed from: e, reason: collision with root package name */
    private final y8.v f40903e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6084a f40904f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f40905g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f40906h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f40907i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f40908j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f40909k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f40910l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f40911m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f40912n;

    /* renamed from: o, reason: collision with root package name */
    private final gg.i f40913o;

    /* renamed from: p, reason: collision with root package name */
    private final gg.i f40914p;

    /* renamed from: q, reason: collision with root package name */
    private final gg.i f40915q;

    /* renamed from: r, reason: collision with root package name */
    private final gg.i f40916r;

    /* renamed from: s, reason: collision with root package name */
    private final gg.i f40917s;

    /* renamed from: t, reason: collision with root package name */
    private final List f40918t;

    /* renamed from: u, reason: collision with root package name */
    private final gg.i f40919u;

    /* renamed from: v, reason: collision with root package name */
    private final gg.i f40920v;

    /* renamed from: w, reason: collision with root package name */
    private final gg.i f40921w;

    /* renamed from: x, reason: collision with root package name */
    private final gg.i f40922x;

    /* renamed from: y, reason: collision with root package name */
    private final gg.i f40923y;

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40924a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(InterfaceC7588a.b state) {
            boolean z10;
            AbstractC6492s.i(state, "state");
            if (state instanceof InterfaceC7588a.b.C2111a) {
                z10 = true;
            } else {
                if (!(state instanceof InterfaceC7588a.b.C2112b)) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: com.ubnt.usurvey.ui.signal.strength.c$c, reason: collision with other inner class name */
    static final class C1270c implements kg.h {

        /* renamed from: a, reason: collision with root package name */
        public static final C1270c f40925a = new C1270c();

        /* renamed from: com.ubnt.usurvey.ui.signal.strength.c$c$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40926a;

            static {
                int[] iArr = new int[EnumC5895b.values().length];
                try {
                    iArr[EnumC5895b.SIGNAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5895b.THROUGHPUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5895b.LATENCY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f40926a = iArr;
            }
        }

        C1270c() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6556a a(EnumC5895b tab, Boolean apCompareAvailable, Integer apCompareCount, Boolean isWifiConnected) {
            AbstractC6492s.i(tab, "tab");
            AbstractC6492s.i(apCompareAvailable, "apCompareAvailable");
            AbstractC6492s.i(apCompareCount, "apCompareCount");
            AbstractC6492s.i(isWifiConnected, "isWifiConnected");
            int i10 = a.f40926a[tab.ordinal()];
            K0.a aVar = null;
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (apCompareAvailable.booleanValue() && (isWifiConnected.booleanValue() || apCompareCount.intValue() > 0)) {
                aVar = new K0.a(apCompareCount.intValue() > 0 ? new d.b(R.string.signal_mapper_ap_comparison_selected_ap_num_format, AbstractC3689v.e(apCompareCount)) : new d.b(R.string.signal_mapper_ap_comparison_currently_connected_ap));
            }
            return new C6556a(aVar);
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f40927a = new d();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f40928a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer apply(Set it) {
                AbstractC6492s.i(it, "it");
                return Integer.valueOf(it.size());
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC7588a.b state) {
            AbstractC6492s.i(state, "state");
            if (state instanceof InterfaceC7588a.b.C2111a) {
                return ((InterfaceC7588a.b.C2111a) state).a().b().N0(a.f40928a);
            }
            if (state instanceof InterfaceC7588a.b.C2112b) {
                return gg.i.K0(0);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class e implements kg.i {

        /* renamed from: a, reason: collision with root package name */
        public static final e f40929a = new e();

        e() {
        }

        @Override // kg.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List a(C6556a c6556a, C6556a c6556a2, C6556a c6556a3, C6556a c6556a4, List chartStats) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            AbstractC6492s.i(c6556a3, "<destruct>");
            AbstractC6492s.i(c6556a4, "<destruct>");
            AbstractC6492s.i(chartStats, "chartStats");
            K0.e eVar = (K0.e) c6556a.a();
            K0.a aVar = (K0.a) c6556a2.a();
            K0 k02 = (K0) c6556a3.a();
            K0.k kVar = (K0.k) c6556a4.a();
            List listC = AbstractC3689v.c();
            if (eVar != null) {
                listC.add(new C2706g.a.C0194a("connectionStats", null, null, AbstractC3689v.e(eVar), 6, null));
            }
            List listC2 = AbstractC3689v.c();
            if (aVar != null) {
                listC2.add(aVar);
            }
            if (k02 != null) {
                listC2.add(k02);
            }
            if (kVar != null) {
                listC2.add(kVar);
            }
            listC2.addAll(chartStats);
            J j10 = J.f24997a;
            listC.add(new C2706g.a.C0194a("chart", null, null, AbstractC3689v.a(listC2), 6, null));
            return AbstractC3689v.a(listC);
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f40930a = new f();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f40931a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Te.J it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it);
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            gg.i iVarB;
            gg.i iVarN0;
            AbstractC6492s.i(c6556a, "<destruct>");
            y8.c cVar = (y8.c) c6556a.a();
            return (cVar == null || (iVarB = cVar.b()) == null || (iVarN0 = iVarB.N0(a.f40931a)) == null) ? gg.i.K0(new C6556a(null)) : iVarN0;
        }
    }

    static final class g implements InterfaceC6466c {

        /* renamed from: a, reason: collision with root package name */
        public static final g f40932a = new g();

        g() {
        }

        @Override // kg.InterfaceC6466c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final boolean a(f.a t12, f.a t22) {
            AbstractC6492s.i(t12, "t1");
            AbstractC6492s.i(t22, "t2");
            return AbstractC6492s.d(t12.getClass(), t22.getClass());
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f40933a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(f.a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it instanceof f.a.AbstractC0125a);
        }
    }

    static final class i implements kg.i {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40935a;

            static {
                int[] iArr = new int[EnumC5895b.values().length];
                try {
                    iArr[EnumC5895b.SIGNAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5895b.THROUGHPUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5895b.LATENCY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f40935a = iArr;
            }
        }

        i() {
        }

        @Override // kg.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6556a a(EnumC5895b tab, Boolean wifiConnected, Boolean comparingAps, K0.b chart, Boolean gatewaySpeedtestAvailable) {
            C2706g.b bVarR;
            AbstractC6492s.i(tab, "tab");
            AbstractC6492s.i(wifiConnected, "wifiConnected");
            AbstractC6492s.i(comparingAps, "comparingAps");
            AbstractC6492s.i(chart, "chart");
            AbstractC6492s.i(gatewaySpeedtestAvailable, "gatewaySpeedtestAvailable");
            int i10 = a.f40935a[tab.ordinal()];
            if (i10 == 1) {
                bVarR = chart;
                if (!comparingAps.booleanValue()) {
                    bVarR = chart;
                    if (!wifiConnected.booleanValue()) {
                        bVarR = c.this.r(a.DISCONNECTED);
                    }
                }
            } else if (i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bVarR = chart;
                if (!wifiConnected.booleanValue()) {
                    bVarR = c.this.r(a.DISCONNECTED);
                }
            } else if (wifiConnected.booleanValue()) {
                bVarR = chart;
                if (!gatewaySpeedtestAvailable.booleanValue()) {
                    bVarR = K0.d.f21683a;
                }
            } else {
                bVarR = c.this.r(a.DISCONNECTED);
            }
            return new C6556a(bVarR);
        }
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f40936a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K0.b apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            return new K0.b((S) c6556a.a());
        }
    }

    static final class k implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f40938a;

            a(c cVar) {
                this.f40938a = cVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Boolean it) {
                AbstractC6492s.i(it, "it");
                return it.booleanValue() ? new C6556a(this.f40938a.f40900b) : new C6556a(this.f40938a.f40899a);
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40939a;

            static {
                int[] iArr = new int[EnumC5895b.values().length];
                try {
                    iArr[EnumC5895b.SIGNAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5895b.THROUGHPUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5895b.LATENCY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f40939a = iArr;
            }
        }

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(EnumC5895b tab) {
            AbstractC6492s.i(tab, "tab");
            int i10 = b.f40939a[tab.ordinal()];
            if (i10 == 1) {
                gg.i iVarN0 = c.this.f40913o.N0(new a(c.this));
                AbstractC6492s.h(iVarN0, "map(...)");
                return iVarN0;
            }
            if (i10 == 2) {
                gg.i iVarK0 = gg.i.K0(new C6556a(c.this.f40901c));
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            gg.i iVarK02 = gg.i.K0(new C6556a(c.this.f40902d));
            AbstractC6492s.h(iVarK02, "just(...)");
            return iVarK02;
        }
    }

    static final class l implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f40941a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(dd.i it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it.e());
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f40942a = new b();

            b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(dd.i it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it.d());
            }
        }

        /* renamed from: com.ubnt.usurvey.ui.signal.strength.c$l$c, reason: collision with other inner class name */
        static final class C1271c implements kg.g {

            /* renamed from: a, reason: collision with root package name */
            public static final C1271c f40943a = new C1271c();

            /* renamed from: com.ubnt.usurvey.ui.signal.strength.c$l$c$a */
            public /* synthetic */ class a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f40944a;

                static {
                    int[] iArr = new int[EnumC5895b.values().length];
                    try {
                        iArr[EnumC5895b.SIGNAL.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC5895b.THROUGHPUT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC5895b.LATENCY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f40944a = iArr;
                }
            }

            C1271c() {
            }

            @Override // kg.g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C6556a a(EnumC5895b tab, C6556a c6556a, C6556a c6556a2) {
                AbstractC6492s.i(tab, "tab");
                AbstractC6492s.i(c6556a, "<destruct>");
                AbstractC6492s.i(c6556a2, "<destruct>");
                b8.d dVar = (b8.d) c6556a.a();
                AbstractC4075b abstractC4075b = (AbstractC4075b) c6556a2.a();
                int i10 = a.f40944a[tab.ordinal()];
                if (i10 == 1 || i10 == 2) {
                    return new C6556a(null);
                }
                if (i10 == 3) {
                    return new C6556a(new S(dVar, abstractC4075b));
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean enabled) {
            AbstractC6492s.i(enabled, "enabled");
            if (enabled.booleanValue()) {
                gg.i iVarU = gg.i.u(c.this.f40909k, c.this.f40903e.c().N0(a.f40941a).W(), c.this.f40903e.e().N0(b.f40942a).W(), C1271c.f40943a);
                AbstractC6492s.f(iVarU);
                return iVarU;
            }
            gg.i iVarK0 = gg.i.K0(new C6556a(null));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    static final class m implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final m f40945a = new m();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40946a;

            static {
                int[] iArr = new int[EnumC5895b.values().length];
                try {
                    iArr[EnumC5895b.SIGNAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5895b.THROUGHPUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5895b.LATENCY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f40946a = iArr;
            }
        }

        m() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean a(EnumC5895b tab, Boolean isWifiConnected, Boolean isComparingAccessPoints) {
            AbstractC6492s.i(tab, "tab");
            AbstractC6492s.i(isWifiConnected, "isWifiConnected");
            AbstractC6492s.i(isComparingAccessPoints, "isComparingAccessPoints");
            int i10 = a.f40946a[tab.ordinal()];
            boolean zBooleanValue = true;
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                zBooleanValue = isWifiConnected.booleanValue();
            } else if (!isWifiConnected.booleanValue() && !isComparingAccessPoints.booleanValue()) {
                zBooleanValue = false;
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    static final class n implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f40948a;

            a(c cVar) {
                this.f40948a = cVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                y8.c cVar = (y8.c) c6556a.a();
                if (cVar instanceof y8.p) {
                    return this.f40948a.t(((y8.p) cVar).a());
                }
                if (cVar instanceof y8.d) {
                    return this.f40948a.s(((y8.d) cVar).a());
                }
                if (cVar instanceof y8.g) {
                    return this.f40948a.s(((y8.g) cVar).a());
                }
                if (cVar instanceof y8.n) {
                    return this.f40948a.s(((y8.n) cVar).a());
                }
                if (cVar instanceof y8.l) {
                    return this.f40948a.s(((y8.l) cVar).a());
                }
                if (cVar instanceof y8.j) {
                    return this.f40948a.s(((y8.j) cVar).a());
                }
                if (cVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                gg.i iVarK0 = gg.i.K0(AbstractC3689v.l());
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
        }

        n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean statsBarEnabled) {
            AbstractC6492s.i(statsBarEnabled, "statsBarEnabled");
            return statsBarEnabled.booleanValue() ? c.this.f40914p.I1(new a(c.this)) : gg.i.K0(AbstractC3689v.l());
        }
    }

    static final class o implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final o f40949a = new o();

        o() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC5895b apply(de.y it) {
            AbstractC6492s.i(it, "it");
            return it.c();
        }
    }

    static final class p implements kg.g {
        p() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6556a a(EnumC5895b tab, Boolean isWifiConnected, Boolean isComparingAccessPoints) {
            AbstractC6492s.i(tab, "tab");
            AbstractC6492s.i(isWifiConnected, "isWifiConnected");
            AbstractC6492s.i(isComparingAccessPoints, "isComparingAccessPoints");
            K0.k kVar = new K0.k(c.this.f40918t, tab);
            if (!isWifiConnected.booleanValue() && !isComparingAccessPoints.booleanValue()) {
                kVar = null;
            }
            return new C6556a(kVar);
        }
    }

    static final class q implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final q f40951a = new q();

        q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C6316q c(AbstractC6317r abstractC6317r, S8.c it) {
            AbstractC6492s.i(it, "it");
            C6316q c6316qO = ((AbstractC6317r.b.a.C1873a) abstractC6317r).o(it);
            if (c6316qO == null || !(c6316qO.i() instanceof AbstractC6456a.AbstractC1905a.AbstractC1906a)) {
                return null;
            }
            return c6316qO;
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(final AbstractC6317r state) {
            K0.e eVar;
            AbstractC6492s.i(state, "state");
            if (state instanceof AbstractC6317r.b.a.C1874b) {
                Map mapC = U.c();
                AbstractC6317r.b.a.C1874b c1874b = (AbstractC6317r.b.a.C1874b) state;
                S8.c cVarB = c1874b.b();
                if (cVarB != null) {
                    mapC.put(cVarB, new C3592l0.a(cVarB, c1874b.h(), c1874b.l(), c1874b.f()));
                }
                eVar = new K0.e(new C3592l0(Ci.a.j(U.b(mapC))));
            } else if (state instanceof AbstractC6317r.b.a.C1873a) {
                Map mapC2 = U.c();
                for (C6316q c6316q : AbstractC8783m.O(AbstractC3689v.d0(S8.c.getEntries()), new InterfaceC6835l() { // from class: com.ubnt.usurvey.ui.signal.strength.d
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return c.q.c(state, (S8.c) obj);
                    }
                })) {
                    mapC2.put(c6316q.c(), new C3592l0.a(c6316q.c(), c6316q.h(), c6316q.d(), c6316q.g()));
                }
                eVar = new K0.e(new C3592l0(Ci.a.j(U.b(mapC2))));
            } else {
                eVar = null;
            }
            return new C6556a(eVar);
        }
    }

    static final class r implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final r f40952a = new r();

        r() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Integer it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.intValue() > 0);
        }
    }

    static final class s implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final s f40953a = new s();

        s() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(AbstractC6317r state) {
            boolean z10;
            AbstractC6492s.i(state, "state");
            if (state instanceof AbstractC6317r.b.a) {
                z10 = true;
            } else {
                if (!(state instanceof AbstractC6317r.b.C1875b) && !(state instanceof AbstractC6317r.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class t implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final t f40954a = new t();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40955a;

            static {
                int[] iArr = new int[EnumC5895b.values().length];
                try {
                    iArr[EnumC5895b.LATENCY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5895b.THROUGHPUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5895b.SIGNAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f40955a = iArr;
            }
        }

        t() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(EnumC5895b tab, f.a speedtestState) {
            AbstractC6492s.i(tab, "tab");
            AbstractC6492s.i(speedtestState, "speedtestState");
            boolean z10 = true;
            if (speedtestState instanceof f.a.AbstractC0125a) {
                int i10 = a.f40955a[tab.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z10 = false;
                }
            } else if (!(speedtestState instanceof f.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class u implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final u f40956a = new u();

        u() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List it) {
            AbstractC6492s.i(it, "it");
            List list = it;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC3689v.v();
                }
                arrayList.add(new K0.c((B0) obj, i10));
                i10 = i11;
            }
            return arrayList;
        }
    }

    static final class v implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final v f40957a = new v();

        v() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List it) {
            AbstractC6492s.i(it, "it");
            List list = it;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new K0.l((F0) it2.next()));
            }
            return arrayList;
        }
    }

    static final class w implements kg.n {
        w() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean available) {
            AbstractC6492s.i(available, "available");
            if (AbstractC6492s.d(available, Boolean.TRUE)) {
                return c.this.f40904f.a(InterfaceC6084a.b.z.f48954a);
            }
            if (AbstractC6492s.d(available, Boolean.FALSE)) {
                return c.this.f40904f.a(InterfaceC6084a.b.L.C1826a.f48918a);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class x implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final x f40959a = new x();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f40960a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean apply(Set it) {
                AbstractC6492s.i(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            }
        }

        x() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC7588a.b state) {
            AbstractC6492s.i(state, "state");
            if (state instanceof InterfaceC7588a.b.C2111a) {
                return ((InterfaceC7588a.b.C2111a) state).a().b().N0(a.f40960a).W();
            }
            if (state instanceof InterfaceC7588a.b.C2112b) {
                return gg.i.K0(Boolean.FALSE);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class y implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final y f40961a = new y();

        y() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.AbstractC1261a apply(AbstractC6317r it) {
            AbstractC6492s.i(it, "it");
            return it instanceof AbstractC6317r.b.a ? a.AbstractC1261a.AbstractC1262a.C1263a.f40854a : a.AbstractC1261a.AbstractC1262a.b.f40855a;
        }
    }

    public c(je.u wifiConnectionService, y8.p chartOperatorWifi, y8.d chartOperatorApComparison, y8.n chartOperatorThroughput, y8.m chartOperatorLatency, Cd.f infiniteSpeedtest, y8.v latencyOperator, z screenConfig, InterfaceC7588a wizardApComparison, InterfaceC6084a viewRouter) {
        AbstractC6492s.i(wifiConnectionService, "wifiConnectionService");
        AbstractC6492s.i(chartOperatorWifi, "chartOperatorWifi");
        AbstractC6492s.i(chartOperatorApComparison, "chartOperatorApComparison");
        AbstractC6492s.i(chartOperatorThroughput, "chartOperatorThroughput");
        AbstractC6492s.i(chartOperatorLatency, "chartOperatorLatency");
        AbstractC6492s.i(infiniteSpeedtest, "infiniteSpeedtest");
        AbstractC6492s.i(latencyOperator, "latencyOperator");
        AbstractC6492s.i(screenConfig, "screenConfig");
        AbstractC6492s.i(wizardApComparison, "wizardApComparison");
        AbstractC6492s.i(viewRouter, "viewRouter");
        this.f40899a = chartOperatorWifi;
        this.f40900b = chartOperatorApComparison;
        this.f40901c = chartOperatorThroughput;
        this.f40902d = chartOperatorLatency;
        this.f40903e = latencyOperator;
        this.f40904f = viewRouter;
        gg.i iVarI2 = wifiConnectionService.a().N0(s.f40953a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f40905g = iVarI2;
        gg.i iVarI22 = wizardApComparison.getState().N0(b.f40924a).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f40906h = iVarI22;
        gg.i iVarI23 = wizardApComparison.getState().I1(d.f40927a).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f40907i = iVarI23;
        gg.i iVarI24 = iVarI23.N0(r.f40952a).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f40908j = iVarI24;
        gg.i iVarI25 = screenConfig.b().N0(o.f40949a).W().o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f40909k = iVarI25;
        gg.i iVarI26 = gg.i.v(iVarI25, infiniteSpeedtest.getState(), t.f40954a).W().o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f40910l = iVarI26;
        gg.i iVarW = wifiConnectionService.a().N0(q.f40951a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f40911m = iVarW;
        gg.i iVarW2 = gg.i.t(iVarI25, iVarI22, iVarI23, iVarI2, C1270c.f40925a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f40912n = iVarW2;
        gg.i iVarI27 = wizardApComparison.getState().I1(x.f40959a).W().o1(1).i2();
        AbstractC6492s.h(iVarI27, "refCount(...)");
        this.f40913o = iVarI27;
        gg.i iVarI28 = iVarI25.I1(new k()).W().o1(1).i2();
        AbstractC6492s.h(iVarI28, "refCount(...)");
        this.f40914p = iVarI28;
        gg.i iVarW3 = iVarI26.I1(new l()).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f40915q = iVarW3;
        gg.i iVarW4 = iVarW3.N0(j.f40936a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f40916r = iVarW4;
        gg.i iVarW5 = gg.i.s(iVarI25, iVarI2, iVarI24, iVarW4, infiniteSpeedtest.getState().X(g.f40932a).N0(h.f40933a).W(), new i()).W();
        AbstractC6492s.h(iVarW5, "distinctUntilChanged(...)");
        this.f40917s = iVarW5;
        this.f40918t = AbstractC3689v.o(EnumC5895b.SIGNAL, EnumC5895b.THROUGHPUT, EnumC5895b.LATENCY);
        gg.i iVarW6 = gg.i.u(iVarI25, iVarI2, iVarI24, new p()).W();
        AbstractC6492s.h(iVarW6, "distinctUntilChanged(...)");
        this.f40919u = iVarW6;
        gg.i iVarW7 = gg.i.u(iVarI25, iVarI2, iVarI24, m.f40945a).W().I1(new n()).W();
        AbstractC6492s.h(iVarW7, "distinctUntilChanged(...)");
        this.f40920v = iVarW7;
        gg.i iVarI29 = wifiConnectionService.a().N0(y.f40961a).W().o1(1).i2();
        AbstractC6492s.h(iVarI29, "refCount(...)");
        this.f40921w = iVarI29;
        gg.i iVarI210 = gg.i.s(iVarW, iVarW2, iVarW5, iVarW6, iVarW7, e.f40929a).o1(1).i2();
        AbstractC6492s.h(iVarI210, "refCount(...)");
        this.f40922x = iVarI210;
        gg.i iVarI211 = iVarI28.I1(f.f40930a).z1(new C6556a(null)).o1(1).i2();
        AbstractC6492s.h(iVarI211, "refCount(...)");
        this.f40923y = iVarI211;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final K0.f r(a aVar) {
        return new K0.f(aVar.getId(), aVar.getTitle(), aVar.getSubtitle(), aVar.getButton());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i s(gg.i iVar) {
        gg.i iVarN0 = iVar.N0(u.f40956a);
        AbstractC6492s.h(iVarN0, "map(...)");
        return iVarN0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i t(gg.i iVar) {
        gg.i iVarN0 = iVar.N0(v.f40957a);
        AbstractC6492s.h(iVarN0, "map(...)");
        return iVarN0;
    }

    @Override // com.ubnt.usurvey.ui.signal.strength.a
    public AbstractC5912b a(String id2) {
        AbstractC6492s.i(id2, "id");
        return this.f40904f.a(InterfaceC6084a.b.D.g.f48903a);
    }

    @Override // com.ubnt.usurvey.ui.signal.strength.a
    public gg.i b() {
        return this.f40923y;
    }

    @Override // com.ubnt.usurvey.ui.signal.strength.a
    public gg.i c() {
        return this.f40922x;
    }

    @Override // com.ubnt.usurvey.ui.signal.strength.a
    public AbstractC5912b d() {
        AbstractC5912b abstractC5912bT = this.f40906h.o0().t(new w());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    @Override // com.ubnt.usurvey.ui.signal.strength.a
    public gg.i getState() {
        return this.f40921w;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DISCONNECTED = new a("DISCONNECTED", 0, new d.b(R.string.signal_mapper_disconnected_title), new d.b(R.string.signal_mapper_disconnected_subtitle), new d.b(R.string.signal_mapper_disconnected_button));
        private final s9.d button;
        private final s9.d subtitle;
        private final s9.d title;

        private static final /* synthetic */ a[] $values() {
            return new a[]{DISCONNECTED};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, s9.d dVar, s9.d dVar2, s9.d dVar3) {
            this.title = dVar;
            this.subtitle = dVar2;
            this.button = dVar3;
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

        public final s9.d getButton() {
            return this.button;
        }

        public final String getId() {
            return name();
        }

        public final s9.d getSubtitle() {
            return this.subtitle;
        }

        public final s9.d getTitle() {
            return this.title;
        }

        /* synthetic */ a(String str, int i10, s9.d dVar, s9.d dVar2, s9.d dVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, dVar, dVar2, (i11 & 4) != 0 ? null : dVar3);
        }
    }
}
