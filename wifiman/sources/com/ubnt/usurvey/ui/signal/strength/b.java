package com.ubnt.usurvey.ui.signal.strength;

import Bc.a;
import Ee.C2706g;
import Te.B0;
import Te.K0;
import Te.S;
import Yg.J;
import Zg.AbstractC3689v;
import b8.AbstractC4075b;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.ui.signal.strength.a;
import de.y;
import de.z;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gc.EnumC5895b;
import gg.AbstractC5912b;
import i8.InterfaceC6084a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.InterfaceC6465b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import s9.d;
import y8.u;

/* loaded from: classes3.dex */
public final class b implements com.ubnt.usurvey.ui.signal.strength.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.ui.wifiman.model.android.permissions.d f40857a;

    /* renamed from: b, reason: collision with root package name */
    private final y8.g f40858b;

    /* renamed from: c, reason: collision with root package name */
    private final y8.k f40859c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6084a f40860d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f40861e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f40862f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f40863g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f40864h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f40865i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f40866j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f40867k;

    /* renamed from: l, reason: collision with root package name */
    private final List f40868l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f40869m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f40870n;

    /* renamed from: o, reason: collision with root package name */
    private final gg.i f40871o;

    /* renamed from: p, reason: collision with root package name */
    private final gg.i f40872p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a SIGNAL = new a("SIGNAL", 0);
        public static final a LATENCY = new a("LATENCY", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{SIGNAL, LATENCY};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10) {
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
    }

    /* renamed from: com.ubnt.usurvey.ui.signal.strength.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC1264b {

        /* renamed from: com.ubnt.usurvey.ui.signal.strength.b$b$a */
        public static abstract class a extends AbstractC1264b {

            /* renamed from: com.ubnt.usurvey.ui.signal.strength.b$b$a$a, reason: collision with other inner class name */
            public static final class C1265a extends a {

                /* renamed from: a, reason: collision with root package name */
                public static final C1265a f40873a = new C1265a();

                private C1265a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1265a);
                }

                public int hashCode() {
                    return -1250667228;
                }

                public String toString() {
                    return "Latency";
                }
            }

            /* renamed from: com.ubnt.usurvey.ui.signal.strength.b$b$a$b, reason: collision with other inner class name */
            public static abstract class AbstractC1266b extends a {

                /* renamed from: com.ubnt.usurvey.ui.signal.strength.b$b$a$b$a, reason: collision with other inner class name */
                public static final class C1267a extends AbstractC1266b {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C1267a f40874a = new C1267a();

                    private C1267a() {
                        super(null);
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1267a);
                    }

                    public int hashCode() {
                        return 1616117117;
                    }

                    public String toString() {
                        return "Available";
                    }
                }

                /* renamed from: com.ubnt.usurvey.ui.signal.strength.b$b$a$b$b, reason: collision with other inner class name */
                public static final class C1268b extends AbstractC1266b {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C1268b f40875a = new C1268b();

                    private C1268b() {
                        super(null);
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1268b);
                    }

                    public int hashCode() {
                        return -2019519459;
                    }

                    public String toString() {
                        return "LocationDisabled";
                    }
                }

                /* renamed from: com.ubnt.usurvey.ui.signal.strength.b$b$a$b$c */
                public static final class c extends AbstractC1266b {

                    /* renamed from: a, reason: collision with root package name */
                    public static final c f40876a = new c();

                    private c() {
                        super(null);
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof c);
                    }

                    public int hashCode() {
                        return 654744201;
                    }

                    public String toString() {
                        return "MissingPermission";
                    }
                }

                public /* synthetic */ AbstractC1266b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private AbstractC1266b() {
                    super(null);
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
                super(null);
            }
        }

        /* renamed from: com.ubnt.usurvey.ui.signal.strength.b$b$b, reason: collision with other inner class name */
        public static final class C1269b extends AbstractC1264b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1269b f40877a = new C1269b();

            private C1269b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1269b);
            }

            public int hashCode() {
                return 1801828656;
            }

            public String toString() {
                return "Disconnected";
            }
        }

        public /* synthetic */ AbstractC1264b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1264b() {
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40878a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.SIGNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.LATENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f40878a = iArr;
        }
    }

    static final class e implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final e f40879a = new e();

        e() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List a(C6556a c6556a, C6556a c6556a2, List chartStats) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            AbstractC6492s.i(chartStats, "chartStats");
            K0 k02 = (K0) c6556a.a();
            K0.k kVar = (K0.k) c6556a2.a();
            List listC = AbstractC3689v.c();
            List listC2 = AbstractC3689v.c();
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
        public static final f f40880a = new f();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f40881a = new a();

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
            return (cVar == null || (iVarB = cVar.b()) == null || (iVarN0 = iVarB.N0(a.f40881a)) == null) ? gg.i.K0(new C6556a(null)) : iVarN0;
        }
    }

    static final class g implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f40883a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(K0.b it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it);
            }
        }

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(AbstractC1264b cntType) {
            AbstractC6492s.i(cntType, "cntType");
            if (cntType instanceof AbstractC1264b.a.AbstractC1266b.C1268b) {
                gg.i iVarK0 = gg.i.K0(new C6556a(b.this.k(c.LOCATION_DISABLED)));
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
            if (cntType instanceof AbstractC1264b.a.AbstractC1266b.c) {
                gg.i iVarK02 = gg.i.K0(new C6556a(b.this.k(c.PERMISSIONS)));
                AbstractC6492s.h(iVarK02, "just(...)");
                return iVarK02;
            }
            if ((cntType instanceof AbstractC1264b.a.C1265a) || (cntType instanceof AbstractC1264b.a.AbstractC1266b.C1267a)) {
                gg.i iVarN0 = b.this.f40865i.N0(a.f40883a);
                AbstractC6492s.h(iVarN0, "map(...)");
                return iVarN0;
            }
            if (!(cntType instanceof AbstractC1264b.C1269b)) {
                throw new NoWhenBranchMatchedException();
            }
            gg.i iVarK03 = gg.i.K0(new C6556a(null));
            AbstractC6492s.h(iVarK03, "just(...)");
            return iVarK03;
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f40884a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K0.b apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            return new K0.b((S) c6556a.a());
        }
    }

    static final class i implements kg.n {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40886a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.SIGNAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.LATENCY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f40886a = iArr;
            }
        }

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(a tab) {
            AbstractC6492s.i(tab, "tab");
            int i10 = a.f40886a[tab.ordinal()];
            if (i10 == 1) {
                return new C6556a(b.this.f40858b);
            }
            if (i10 == 2) {
                return new C6556a(b.this.f40859c);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f40887a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(dd.i it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it.e());
        }
    }

    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final k f40888a = new k();

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(dd.i it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it.d());
        }
    }

    static final class l implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final l f40889a = new l();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40890a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.SIGNAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.LATENCY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f40890a = iArr;
            }
        }

        l() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6556a a(a tab, C6556a c6556a, C6556a c6556a2) {
            AbstractC6492s.i(tab, "tab");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            b8.d dVar = (b8.d) c6556a.a();
            AbstractC4075b abstractC4075b = (AbstractC4075b) c6556a2.a();
            int i10 = a.f40890a[tab.ordinal()];
            if (i10 == 1) {
                return new C6556a(null);
            }
            if (i10 == 2) {
                return new C6556a(new S(dVar, abstractC4075b));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f40891a = new m();

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            gg.i iVarA;
            AbstractC6492s.i(c6556a, "<destruct>");
            y8.c cVar = (y8.c) c6556a.a();
            return (cVar == null || (iVarA = cVar.a()) == null) ? gg.i.K0(AbstractC3689v.l()) : iVarA;
        }
    }

    static final class n implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final n f40892a = new n();

        n() {
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

    static final class o implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final o f40893a = new o();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40894a;

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
                f40894a = iArr;
            }
        }

        o() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a apply(y it) {
            AbstractC6492s.i(it, "it");
            int i10 = a.f40894a[it.c().ordinal()];
            if (i10 == 1 || i10 == 2) {
                return a.SIGNAL;
            }
            if (i10 == 3) {
                return a.LATENCY;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class p implements kg.n {
        p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(a tab) {
            AbstractC6492s.i(tab, "tab");
            List list = b.this.f40868l;
            b bVar = b.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(bVar.l((a) it.next()));
            }
            return new C6556a(new K0.k(arrayList, b.this.l(tab)));
        }
    }

    static final class q implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final q f40896a = new q();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40897a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.SIGNAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.LATENCY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f40897a = iArr;
            }
        }

        q() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1264b apply(a.b simState, a tab) {
            AbstractC6492s.i(simState, "simState");
            AbstractC6492s.i(tab, "tab");
            if ((simState instanceof a.b.AbstractC0059b.c) || (simState instanceof a.b.AbstractC0059b.C0061b)) {
                int i10 = a.f40897a[tab.ordinal()];
                if (i10 == 1) {
                    return AbstractC1264b.a.AbstractC1266b.c.f40876a;
                }
                if (i10 == 2) {
                    return AbstractC1264b.a.C1265a.f40873a;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (simState instanceof a.b.AbstractC0059b.C0060a) {
                int i11 = a.f40897a[tab.ordinal()];
                if (i11 == 1) {
                    return AbstractC1264b.a.AbstractC1266b.C1268b.f40875a;
                }
                if (i11 == 2) {
                    return AbstractC1264b.a.C1265a.f40873a;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (simState instanceof a.b.AbstractC0054a.AbstractC0056b) {
                int i12 = a.f40897a[tab.ordinal()];
                if (i12 == 1) {
                    return AbstractC1264b.a.AbstractC1266b.C1267a.f40874a;
                }
                if (i12 == 2) {
                    return AbstractC1264b.a.C1265a.f40873a;
                }
                throw new NoWhenBranchMatchedException();
            }
            if ((simState instanceof a.b.AbstractC0059b.e) || (simState instanceof a.b.AbstractC0059b.d) || (simState instanceof a.b.AbstractC0054a.C0055a) || (simState instanceof a.b.AbstractC0054a.c)) {
                return AbstractC1264b.C1269b.f40877a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class r implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final r f40898a = new r();

        r() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.AbstractC1261a apply(a.b simState) {
            AbstractC6492s.i(simState, "simState");
            if ((simState instanceof a.b.AbstractC0059b.c) || (simState instanceof a.b.AbstractC0059b.C0061b) || (simState instanceof a.b.AbstractC0059b.C0060a)) {
                return a.AbstractC1261a.AbstractC1262a.b.f40855a;
            }
            if (simState instanceof a.b.AbstractC0054a.AbstractC0056b) {
                return a.AbstractC1261a.AbstractC1262a.C1263a.f40854a;
            }
            if ((simState instanceof a.b.AbstractC0059b.e) || (simState instanceof a.b.AbstractC0059b.d) || (simState instanceof a.b.AbstractC0054a.C0055a) || (simState instanceof a.b.AbstractC0054a.c)) {
                return a.AbstractC1261a.b.f40856a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public b(Bc.a cellularService, z screenConfig, com.ui.wifiman.model.android.permissions.d permissionManager, y8.g chartOperatorCellular, y8.k chartOperatorLatency, u latencyOperator, InterfaceC6084a viewRouter) {
        AbstractC6492s.i(cellularService, "cellularService");
        AbstractC6492s.i(screenConfig, "screenConfig");
        AbstractC6492s.i(permissionManager, "permissionManager");
        AbstractC6492s.i(chartOperatorCellular, "chartOperatorCellular");
        AbstractC6492s.i(chartOperatorLatency, "chartOperatorLatency");
        AbstractC6492s.i(latencyOperator, "latencyOperator");
        AbstractC6492s.i(viewRouter, "viewRouter");
        this.f40857a = permissionManager;
        this.f40858b = chartOperatorCellular;
        this.f40859c = chartOperatorLatency;
        this.f40860d = viewRouter;
        gg.i iVarI2 = screenConfig.b().N0(o.f40893a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f40861e = iVarI2;
        gg.i iVarI22 = gg.i.v(cellularService.a(), iVarI2, q.f40896a).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f40862f = iVarI22;
        gg.i iVarI23 = iVarI2.N0(new i()).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f40863g = iVarI23;
        gg.i iVarW = gg.i.u(iVarI2, latencyOperator.c().N0(j.f40887a).W(), latencyOperator.e().N0(k.f40888a).W(), l.f40889a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f40864h = iVarW;
        gg.i iVarW2 = iVarW.N0(h.f40884a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f40865i = iVarW2;
        gg.i iVarW3 = iVarI22.I1(new g()).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f40866j = iVarW3;
        gg.i iVarW4 = iVarI23.I1(m.f40891a).N0(n.f40892a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f40867k = iVarW4;
        this.f40868l = AbstractC3689v.o(a.SIGNAL, a.LATENCY);
        gg.i iVarW5 = iVarI2.N0(new p()).W();
        AbstractC6492s.h(iVarW5, "distinctUntilChanged(...)");
        this.f40869m = iVarW5;
        gg.i iVarI24 = cellularService.a().N0(r.f40898a).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f40870n = iVarI24;
        gg.i iVarI25 = gg.i.u(iVarW3, iVarW5, iVarW4, e.f40879a).o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f40871o = iVarI25;
        gg.i iVarI26 = iVarI23.I1(f.f40880a).z1(new C6556a(null)).o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f40872p = iVarI26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final K0.f k(c cVar) {
        return new K0.f(cVar.getId(), cVar.getTitle(), cVar.getSubtitle(), cVar.getButton());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnumC5895b l(a aVar) {
        int i10 = d.f40878a[aVar.ordinal()];
        if (i10 == 1) {
            return EnumC5895b.SIGNAL;
        }
        if (i10 == 2) {
            return EnumC5895b.LATENCY;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.ubnt.usurvey.ui.signal.strength.a
    public AbstractC5912b a(String id2) {
        AbstractC6492s.i(id2, "id");
        if (AbstractC6492s.d(id2, c.PERMISSIONS.getId())) {
            return this.f40857a.a(com.ui.wifiman.model.android.permissions.a.PHONE_STATE, com.ui.wifiman.model.android.permissions.a.LOCATION_FINE);
        }
        if (AbstractC6492s.d(id2, c.LOCATION_DISABLED.getId())) {
            return this.f40860d.a(InterfaceC6084a.b.D.e.f48900a);
        }
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.h(abstractC5912bM, "complete(...)");
        return abstractC5912bM;
    }

    @Override // com.ubnt.usurvey.ui.signal.strength.a
    public gg.i b() {
        return this.f40872p;
    }

    @Override // com.ubnt.usurvey.ui.signal.strength.a
    public gg.i c() {
        return this.f40871o;
    }

    @Override // com.ubnt.usurvey.ui.signal.strength.a
    public AbstractC5912b d() {
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.h(abstractC5912bM, "complete(...)");
        return abstractC5912bM;
    }

    @Override // com.ubnt.usurvey.ui.signal.strength.a
    public gg.i getState() {
        return this.f40870n;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        private final s9.d button;
        private final s9.d subtitle;
        private final s9.d title;
        public static final c PERMISSIONS = new c("PERMISSIONS", 0, new d.b(R.string.signal_mapper_permission_title), new d.b(R.string.signal_mapper_permission_subtitle), new d.b(R.string.signal_mapper_permission_button));
        public static final c LOCATION_DISABLED = new c("LOCATION_DISABLED", 1, new d.b(R.string.signal_mapper_cellular_location_disabled_title), new d.b(R.string.signal_mapper_cellular_location_disabled_subtitle), new d.b(R.string.signal_mapper_cellular_location_disabled_button));

        private static final /* synthetic */ c[] $values() {
            return new c[]{PERMISSIONS, LOCATION_DISABLED};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
        }

        private c(String str, int i10, s9.d dVar, s9.d dVar2, s9.d dVar3) {
            this.title = dVar;
            this.subtitle = dVar2;
            this.button = dVar3;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
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

        /* synthetic */ c(String str, int i10, s9.d dVar, s9.d dVar2, s9.d dVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, dVar, dVar2, (i11 & 4) != 0 ? null : dVar3);
        }
    }
}
