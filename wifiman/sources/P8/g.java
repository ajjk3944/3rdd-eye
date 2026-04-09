package P8;

import If.EnumC3021a;
import P8.f;
import Yg.J;
import Yg.s;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import com.ui.wifiman.model.wmw.WifimanWizard;
import com.ui.wifiman.model.wmw.b;
import com.ui.wifiman.model.wmw.d;
import com.ui.wifiman.model.wmw.g;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;

/* loaded from: classes3.dex */
public final class g implements P8.f {

    /* renamed from: a, reason: collision with root package name */
    private final com.ui.wifiman.model.wmw.g f18269a;

    /* renamed from: b, reason: collision with root package name */
    private final Fg.a f18270b;

    /* renamed from: c, reason: collision with root package name */
    private final Fg.a f18271c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f18272d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f18273e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f18274f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f18275g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC5912b f18276h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC5912b f18277i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC5912b f18278j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f18279k;

    static final class a implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18280a = new a();

        a() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(Boolean dismissable) {
            AbstractC6492s.i(dismissable, "dismissable");
            return dismissable.booleanValue();
        }
    }

    static final class b implements kg.n {

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f18282a;

            public a(g gVar) {
                this.f18282a = gVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f18282a.f18270b.h(Boolean.FALSE);
                    this.f18282a.f18271c.h(f.a.STATUS);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean it) {
            AbstractC6492s.i(it, "it");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(g.this));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class c implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f18283a = new c();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18284a;

            static {
                int[] iArr = new int[EnumC3021a.values().length];
                try {
                    iArr[EnumC3021a.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC3021a.REQUIREMENTS_NOT_MET.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC3021a.DISCOVERING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC3021a.FW_UPDATE_PROGRESS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC3021a.COMPLIANCE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC3021a.FW_UPDATE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC3021a.CONNECTING.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC3021a.ADOPTION_READY.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumC3021a.ADOPTION_FAILED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EnumC3021a.CONNECTED.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                f18284a = iArr;
            }
        }

        c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s apply(s sVar, EnumC3021a current) {
            AbstractC6492s.i(sVar, "<destruct>");
            AbstractC6492s.i(current, "current");
            EnumC3021a enumC3021a = (EnumC3021a) sVar.a();
            switch (a.f18284a[current.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return z.a(current, 0L);
                case 6:
                    return enumC3021a == EnumC3021a.FW_UPDATE_PROGRESS ? z.a(current, 3000L) : z.a(current, 0L);
                case 7:
                case 8:
                    return enumC3021a == EnumC3021a.DISCOVERING ? z.a(current, 3000L) : z.a(current, 0L);
                case 9:
                case 10:
                    return enumC3021a == EnumC3021a.CONNECTING ? z.a(current, 2000L) : z.a(current, 0L);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f18285a = new d();

        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EnumC3021a f18286a;

            public a(EnumC3021a enumC3021a) {
                this.f18286a = enumC3021a;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    EnumC3021a enumC3021a = this.f18286a;
                    if (enumC3021a != null) {
                        oVar.onSuccess(enumC3021a);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        public static final class b implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EnumC3021a f18287a;

            public b(EnumC3021a enumC3021a) {
                this.f18287a = enumC3021a;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    EnumC3021a enumC3021a = this.f18287a;
                    if (enumC3021a != null) {
                        oVar.onSuccess(enumC3021a);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            EnumC3021a enumC3021a = (EnumC3021a) sVar.a();
            long jLongValue = ((Number) sVar.c()).longValue();
            if (jLongValue > 0) {
                gg.n nVarC = gg.n.c(new a(enumC3021a));
                AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
                return nVarC.d(jLongValue, TimeUnit.MILLISECONDS);
            }
            gg.n nVarC2 = gg.n.c(new b(enumC3021a));
            AbstractC6492s.h(nVarC2, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC2;
        }
    }

    static final class e implements kg.n {

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f18289a;

            public a(g gVar) {
                this.f18289a = gVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f18289a.f18271c.h(f.a.FW_UPDATE);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(g.a availability) {
            AbstractC6492s.i(availability, "availability");
            if (!(availability instanceof g.a.C1534a) || ((g.a.C1534a) availability).b()) {
                return AbstractC5912b.m();
            }
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(g.this));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class f implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final f f18290a = new f();

        f() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Boolean shown, EnumC3021a content) {
            AbstractC6492s.i(shown, "shown");
            AbstractC6492s.i(content, "content");
            return Boolean.valueOf(!shown.booleanValue() && content == EnumC3021a.ADOPTION_READY);
        }
    }

    /* renamed from: P8.g$g, reason: collision with other inner class name */
    static final class C0648g implements kg.n {

        /* renamed from: P8.g$g$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f18292a;

            a(g gVar) {
                this.f18292a = gVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Integer it) {
                AbstractC6492s.i(it, "it");
                return this.f18292a.c();
            }
        }

        C0648g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean autoOpenEnabled) {
            AbstractC6492s.i(autoOpenEnabled, "autoOpenEnabled");
            return autoOpenEnabled.booleanValue() ? g.this.f18272d.u1(1L).o0().t(new a(g.this)) : AbstractC5912b.m();
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f18293a = new h();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18294a;

            static {
                int[] iArr = new int[EnumC3021a.values().length];
                try {
                    iArr[EnumC3021a.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC3021a.REQUIREMENTS_NOT_MET.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC3021a.DISCOVERING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC3021a.ADOPTION_READY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC3021a.ADOPTION_FAILED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC3021a.CONNECTING.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC3021a.CONNECTED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC3021a.FW_UPDATE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumC3021a.COMPLIANCE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EnumC3021a.FW_UPDATE_PROGRESS.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                f18294a = iArr;
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(EnumC3021a content) {
            boolean z10;
            AbstractC6492s.i(content, "content");
            switch (a.f18294a[content.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z10 = true;
                    break;
                case 10:
                    z10 = false;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class i implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.a f18296b;

        public i(f.a aVar) {
            this.f18296b = aVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                g.this.f18271c.h(this.f18296b);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class j implements kg.n {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18298a;

            static {
                int[] iArr = new int[EnumC3021a.values().length];
                try {
                    iArr[EnumC3021a.COMPLIANCE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC3021a.FW_UPDATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f18298a = iArr;
            }
        }

        public static final class b implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f18299a;

            public b(g gVar) {
                this.f18299a = gVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f18299a.f18271c.h(f.a.STATUS);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        public static final class c implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f18300a;

            public c(g gVar) {
                this.f18300a = gVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f18300a.f18271c.h(f.a.STATUS);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(EnumC3021a contentType) {
            AbstractC6492s.i(contentType, "contentType");
            int i10 = a.f18298a[contentType.ordinal()];
            if (i10 == 1) {
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b(g.this));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR;
            }
            if (i10 != 2) {
                return g.this.close();
            }
            AbstractC5912b abstractC5912bC = g.this.f18269a.c();
            AbstractC5912b abstractC5912bE = g.this.f18269a.e();
            AbstractC5912b abstractC5912bR2 = AbstractC5912b.r(new c(g.this));
            AbstractC6492s.h(abstractC5912bR2, "crossinline action: () -…or(error)\n        }\n    }");
            return AbstractC5912b.p(abstractC5912bC, abstractC5912bE, abstractC5912bR2);
        }
    }

    public static final class k implements InterfaceC5915e {
        public k() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                g.this.f18270b.h(Boolean.TRUE);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class l implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final l f18302a = new l();

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(!it.isEmpty());
        }
    }

    static final class m implements kg.l {

        /* renamed from: a, reason: collision with root package name */
        public static final m f18303a = new m();

        m() {
        }

        @Override // kg.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnumC3021a a(WifimanWizard.a connectionState, b.c adoptionState, C6556a c6556a, Boolean anyDiscoveredDevices, f.a screen, g.c fwUpgradeState, g.a fwUpgradeAvailability, C6556a c6556a2) {
            AbstractC6492s.i(connectionState, "connectionState");
            AbstractC6492s.i(adoptionState, "adoptionState");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(anyDiscoveredDevices, "anyDiscoveredDevices");
            AbstractC6492s.i(screen, "screen");
            AbstractC6492s.i(fwUpgradeState, "fwUpgradeState");
            AbstractC6492s.i(fwUpgradeAvailability, "fwUpgradeAvailability");
            AbstractC6492s.i(c6556a2, "<destruct>");
            b.c.AbstractC1530c abstractC1530c = (b.c.AbstractC1530c) c6556a.a();
            g.c.b.AbstractC1535b abstractC1535b = (g.c.b.AbstractC1535b) c6556a2.a();
            if (fwUpgradeState instanceof g.c.b) {
                return EnumC3021a.FW_UPDATE_PROGRESS;
            }
            if (!(fwUpgradeState instanceof g.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (connectionState instanceof WifimanWizard.a.c) {
                return EnumC3021a.REQUIREMENTS_NOT_MET;
            }
            if ((connectionState instanceof WifimanWizard.a.b) || (connectionState instanceof WifimanWizard.a.AbstractC1520a.c) || (connectionState instanceof WifimanWizard.a.AbstractC1520a.d)) {
                return abstractC1530c instanceof b.c.AbstractC1530c.C1531b ? EnumC3021a.ADOPTION_FAILED : anyDiscoveredDevices.booleanValue() ? EnumC3021a.ADOPTION_READY : EnumC3021a.DISCOVERING;
            }
            if (connectionState instanceof WifimanWizard.a.AbstractC1520a.b) {
                return EnumC3021a.CONNECTING;
            }
            if (!(connectionState instanceof WifimanWizard.a.AbstractC1520a.C1521a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(adoptionState instanceof b.c.C1529b) && !(adoptionState instanceof b.c.a)) {
                return abstractC1535b != null ? EnumC3021a.FW_UPDATE : (screen == f.a.FW_UPDATE && (fwUpgradeAvailability instanceof g.a.C1534a)) ? EnumC3021a.FW_UPDATE : screen == f.a.COMPLIANCE ? EnumC3021a.COMPLIANCE : EnumC3021a.CONNECTED;
            }
            return EnumC3021a.CONNECTING;
        }
    }

    static final class n implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f18305a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f.b.C0647b apply(EnumC3021a content) {
                AbstractC6492s.i(content, "content");
                return new f.b.C0647b(content);
            }
        }

        n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean shown) {
            AbstractC6492s.i(shown, "shown");
            if (shown.booleanValue()) {
                gg.i iVarN0 = g.this.f18274f.N0(a.f18305a);
                AbstractC6492s.f(iVarN0);
                return iVarN0;
            }
            gg.i iVarK0 = gg.i.K0(f.b.a.f18267a);
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    static final class o implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final o f18306a = new o();

        o() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(f.b it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("WMW Popup State: " + it, null, 2, null);
        }
    }

    static final class p implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final p f18307a = new p();

        p() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap apply(ConcurrentHashMap map, Set devices) {
            AbstractC6492s.i(map, "map");
            AbstractC6492s.i(devices, "devices");
            Set set = devices;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(z.a(((d.a) it.next()).b(), J.f24997a));
            }
            U.o(map, arrayList);
            return map;
        }
    }

    static final class q implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final q f18308a = new q();

        q() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer apply(ConcurrentHashMap it) {
            AbstractC6492s.i(it, "it");
            return Integer.valueOf(it.size());
        }
    }

    public g(WifimanWizard wifimanWizard, com.ui.wifiman.model.wmw.d discovery, com.ui.wifiman.model.wmw.g fwUpgrade) {
        AbstractC6492s.i(wifimanWizard, "wifimanWizard");
        AbstractC6492s.i(discovery, "discovery");
        AbstractC6492s.i(fwUpgrade, "fwUpgrade");
        this.f18269a = fwUpgrade;
        Fg.a aVarK2 = Fg.a.k2(Boolean.FALSE);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f18270b = aVarK2;
        Fg.a aVarK22 = Fg.a.k2(f.a.STATUS);
        AbstractC6492s.h(aVarK22, "createDefault(...)");
        this.f18271c = aVarK22;
        gg.i iVarI2 = discovery.a().q1(new ConcurrentHashMap(), p.f18307a).N0(q.f18308a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f18272d = iVarI2;
        gg.i iVarI22 = aVarK2.e1().Y0(Gg.a.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f18273e = iVarI22;
        gg.i iVarW = gg.i.p(wifimanWizard.getState(), wifimanWizard.d(), wifimanWizard.e(), discovery.a().N0(l.f18302a).W(), aVarK22.e1().Y0(Gg.a.a(), false, 1), fwUpgrade.getState(), fwUpgrade.a(), fwUpgrade.f(), m.f18303a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        gg.i iVarI23 = l(iVarW).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f18274f = iVarI23;
        gg.i iVarI24 = iVarI22.I1(new n()).W().f0(o.f18306a).o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f18275g = iVarI24;
        AbstractC5912b abstractC5912bL1 = gg.i.v(iVarI22, iVarI23, f.f18290a).L1(new C0648g());
        AbstractC6492s.h(abstractC5912bL1, "switchMapCompletable(...)");
        this.f18276h = abstractC5912bL1;
        AbstractC5912b abstractC5912bL12 = fwUpgrade.a().L1(new e());
        AbstractC6492s.h(abstractC5912bL12, "switchMapCompletable(...)");
        this.f18277i = abstractC5912bL12;
        AbstractC5912b abstractC5912bE0 = AbstractC5912b.I(abstractC5912bL1, abstractC5912bL12).c0().h1().i2().F1(Gg.a.a()).E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        this.f18278j = abstractC5912bE0;
        gg.i iVarI25 = iVarI23.N0(h.f18293a).W().o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f18279k = iVarI25;
    }

    private final gg.i l(gg.i iVar) {
        gg.i iVarM1 = iVar.q1(new s(null, 0L), c.f18283a).M1(d.f18285a);
        AbstractC6492s.h(iVarM1, "switchMapMaybe(...)");
        return iVarM1;
    }

    @Override // P8.f
    public AbstractC5912b a() {
        AbstractC5912b abstractC5912bT = this.f18274f.o0().t(new j());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    @Override // P8.f
    public AbstractC5912b b(f.a destination) {
        AbstractC6492s.i(destination, "destination");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new i(destination));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    @Override // P8.f
    public AbstractC5912b c() {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new k());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    @Override // P8.f
    public AbstractC5912b close() {
        AbstractC5912b abstractC5912bK = e().o0().r(a.f18280a).k(new b());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        return abstractC5912bK;
    }

    @Override // P8.f
    public AbstractC5912b d() {
        return this.f18278j;
    }

    @Override // P8.f
    public gg.i e() {
        return this.f18279k;
    }

    @Override // P8.f
    public AbstractC5912b f() {
        return close();
    }

    @Override // P8.f
    public gg.i getState() {
        return this.f18275g;
    }
}
