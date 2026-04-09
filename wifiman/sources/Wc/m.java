package wc;

import Zg.AbstractC3689v;
import Zg.d0;
import com.ubnt.usurvey.a;
import com.ui.wifiman.model.bluetooth.classic.BluetoothScanner;
import com.ui.wifiman.model.bluetooth.le.BleScanner;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wc.InterfaceC8324d;
import wc.h;

/* loaded from: classes4.dex */
public final class m implements wc.h {

    /* renamed from: n, reason: collision with root package name */
    public static final a f64840n = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final BluetoothScanner f64841a;

    /* renamed from: b, reason: collision with root package name */
    private final BleScanner f64842b;

    /* renamed from: c, reason: collision with root package name */
    private final wc.g f64843c;

    /* renamed from: d, reason: collision with root package name */
    private final Fg.a f64844d;

    /* renamed from: e, reason: collision with root package name */
    private final Fg.a f64845e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f64846f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f64847g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f64848h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f64849i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f64850j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f64851k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f64852l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC5912b f64853m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f64854a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(com.ubnt.usurvey.a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.f());
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f64855a = new c();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f64856a;

            static {
                int[] iArr = new int[wc.f.values().length];
                try {
                    iArr[wc.f.BLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[wc.f.BLE_AND_CLASSIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f64856a = iArr;
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(wc.f mode) {
            AbstractC6492s.i(mode, "mode");
            int i10 = a.f64856a[mode.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class d implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f64857a = new d();

        d() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Boolean enabled, Boolean enabledBasedOnScanMode) {
            AbstractC6492s.i(enabled, "enabled");
            AbstractC6492s.i(enabledBasedOnScanMode, "enabledBasedOnScanMode");
            return Boolean.valueOf(enabled.booleanValue() && enabledBasedOnScanMode.booleanValue());
        }
    }

    static final class e implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f64859a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                if (!(error instanceof BleScanner.Error)) {
                    return gg.i.k0(error);
                }
                Z7.b.j("BLE discovery failed with expected error", error, null, 4, null);
                return gg.i.K0(AbstractC3689v.l());
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean enabled) {
            AbstractC6492s.i(enabled, "enabled");
            if (enabled.booleanValue()) {
                Z7.b.h("BLE Discovery subscribed and enabled", null, 2, null);
                return m.this.f64842b.a().f1(a.f64859a);
            }
            Z7.b.h("BLE Discovery subscribed but disabled", null, 2, null);
            return gg.i.K0(AbstractC3689v.l());
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f64860a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(com.ubnt.usurvey.a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.e());
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f64861a = new g();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f64862a;

            static {
                int[] iArr = new int[wc.f.values().length];
                try {
                    iArr[wc.f.BLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[wc.f.BLE_AND_CLASSIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f64862a = iArr;
            }
        }

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(wc.f mode) {
            AbstractC6492s.i(mode, "mode");
            int i10 = a.f64862a[mode.ordinal()];
            boolean z10 = true;
            if (i10 == 1) {
                z10 = false;
            } else if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class h implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final h f64863a = new h();

        h() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Boolean enabled, Boolean enabledBasedOnScanMode) {
            AbstractC6492s.i(enabled, "enabled");
            AbstractC6492s.i(enabledBasedOnScanMode, "enabledBasedOnScanMode");
            return Boolean.valueOf(enabled.booleanValue() && enabledBasedOnScanMode.booleanValue());
        }
    }

    static final class i implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f64865a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                if (!(error instanceof BluetoothScanner.Error)) {
                    return gg.i.k0(error);
                }
                Z7.b.j("Bluetooth scanner failed with expected error", error, null, 4, null);
                return gg.i.K0(AbstractC3689v.l());
            }
        }

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean enabled) {
            AbstractC6492s.i(enabled, "enabled");
            if (enabled.booleanValue()) {
                Z7.b.h("Bluetooth Classic Discovery subscribed and enabled", null, 2, null);
                return m.this.f64841a.a().f1(a.f64865a);
            }
            Z7.b.h("Bluetooth Classic Discovery subscribed but disabled", null, 2, null);
            return gg.i.K0(AbstractC3689v.l());
        }
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f64866a = new j();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f64867a;

            static {
                int[] iArr = new int[BleScanner.a.EnumC1387a.values().length];
                try {
                    iArr[BleScanner.a.EnumC1387a.BOOTING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BleScanner.a.EnumC1387a.NORMAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BleScanner.a.EnumC1387a.FACTORY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f64867a = iArr;
            }
        }

        j() {
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Set apply(Yg.s r26) {
            /*
                Method dump skipped, instructions count: 500
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: wc.m.j.apply(Yg.s):java.util.Set");
        }
    }

    static final class k implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final k f64868a = new k();

        k() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Bluetooth Discovery subscribed", null, 2, null);
        }
    }

    static final class l implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final l f64869a = new l();

        l() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Set it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Bluetooth discovery " + it.size() + " results emission", null, 2, null);
        }
    }

    /* renamed from: wc.m$m, reason: collision with other inner class name */
    static final class C2296m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8324d f64870a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f64871b;

        /* renamed from: wc.m$m$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f64872a;

            /* renamed from: wc.m$m$a$a, reason: collision with other inner class name */
            public static final class C2297a implements InterfaceC5915e {
                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        Z7.b.j("Bluetooth received unavailable.", null, null, 6, null);
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            a(m mVar) {
                this.f64872a = mVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(InterfaceC8324d.b receiverStatus) {
                AbstractC6492s.i(receiverStatus, "receiverStatus");
                if (receiverStatus instanceof InterfaceC8324d.b.C2294b) {
                    AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C2297a());
                    AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                    gg.i iVarH = abstractC5912bR.h(gg.i.K0(d0.e()));
                    AbstractC6492s.h(iVarH, "andThen(...)");
                    return iVarH;
                }
                if ((receiverStatus instanceof InterfaceC8324d.b.a) && ((InterfaceC8324d.b.a) receiverStatus).a() == InterfaceC8324d.a.STATE_ON) {
                    return this.f64872a.f64850j;
                }
                gg.i iVarK0 = gg.i.K0(d0.e());
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
        }

        C2296m(InterfaceC8324d interfaceC8324d, m mVar) {
            this.f64870a = interfaceC8324d;
            this.f64871b = mVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean paused) {
            AbstractC6492s.i(paused, "paused");
            return !paused.booleanValue() ? this.f64870a.a().I1(new a(this.f64871b)) : gg.i.j0();
        }
    }

    static final class n implements InterfaceC6469f {
        n() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            m.this.f64845e.h(Boolean.TRUE);
        }
    }

    static final class o implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final o f64874a = new o();

        o() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h.a a(Boolean scanning, Boolean paused, InterfaceC8324d.b receiverStatus) {
            AbstractC6492s.i(scanning, "scanning");
            AbstractC6492s.i(paused, "paused");
            AbstractC6492s.i(receiverStatus, "receiverStatus");
            return receiverStatus instanceof InterfaceC8324d.b.C2294b ? h.a.UNAVAILABLE : (paused.booleanValue() || !scanning.booleanValue()) ? (paused.booleanValue() && scanning.booleanValue()) ? h.a.PAUSED : h.a.IDLE : h.a.SCANNING;
        }
    }

    public m(InterfaceC8324d bluetoothReceiver, BluetoothScanner classicScanner, BleScanner bleScanner, a.b configurationManager) {
        AbstractC6492s.i(bluetoothReceiver, "bluetoothReceiver");
        AbstractC6492s.i(classicScanner, "classicScanner");
        AbstractC6492s.i(bleScanner, "bleScanner");
        AbstractC6492s.i(configurationManager, "configurationManager");
        this.f64841a = classicScanner;
        this.f64842b = bleScanner;
        wc.g gVar = new wc.g();
        this.f64843c = gVar;
        Boolean bool = Boolean.FALSE;
        Fg.a aVarK2 = Fg.a.k2(bool);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f64844d = aVarK2;
        Fg.a aVarK22 = Fg.a.k2(bool);
        AbstractC6492s.h(aVarK22, "createDefault(...)");
        this.f64845e = aVarK22;
        gg.i iVarI2 = aVarK2.W().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f64846f = iVarI2;
        gg.i iVarI22 = aVarK22.W().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f64847g = iVarI22;
        gg.i iVarI1 = gg.i.v(configurationManager.b().N0(f.f64860a), gVar.g().N0(g.f64861a), h.f64863a).W().I1(new i());
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        this.f64848h = iVarI1;
        gg.i iVarI12 = gg.i.v(configurationManager.b().N0(b.f64854a), gVar.g().N0(c.f64855a), d.f64857a).W().I1(new e());
        AbstractC6492s.h(iVarI12, "switchMap(...)");
        this.f64849i = iVarI12;
        gg.i iVarI23 = Ag.c.f753a.a(iVarI1, iVarI12).U1(1000L, TimeUnit.MILLISECONDS).e1().Y0(Gg.a.a(), false, 1).N0(j.f64866a).W().g0(k.f64868a).f0(l.f64869a).Z(new InterfaceC6464a() { // from class: wc.i
            @Override // kg.InterfaceC6464a
            public final void run() {
                m.j();
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f64850j = iVarI23;
        gg.i iVarI24 = iVarI2.I1(new C2296m(bluetoothReceiver, this)).g0(new n()).Z(new InterfaceC6464a() { // from class: wc.j
            @Override // kg.InterfaceC6464a
            public final void run() {
                m.m(this.f64837a);
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f64851k = iVarI24;
        gg.i iVarU = gg.i.u(iVarI22, iVarI2, bluetoothReceiver.a(), o.f64874a);
        AbstractC6492s.h(iVarU, "combineLatest(...)");
        this.f64852l = iVarU;
        AbstractC5912b abstractC5912bF0 = AbstractC5912b.r(new InterfaceC5915e() { // from class: wc.k
            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                m.k(this.f64838a, interfaceC5913c);
            }
        }).w(new InterfaceC6464a() { // from class: wc.l
            @Override // kg.InterfaceC6464a
            public final void run() {
                m.l(this.f64839a);
            }
        }).f0().r0().l1().f0();
        AbstractC6492s.h(abstractC5912bF0, "ignoreElements(...)");
        this.f64853m = abstractC5912bF0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j() {
        Z7.b.h("Bluetooth Discovery disposed", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(m mVar, InterfaceC5913c it) {
        AbstractC6492s.i(it, "it");
        mVar.f64844d.h(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(m mVar) {
        mVar.f64844d.h(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(m mVar) {
        mVar.f64845e.h(Boolean.FALSE);
    }

    @Override // wc.h
    public gg.i a(wc.f mode) {
        AbstractC6492s.i(mode, "mode");
        gg.i iVarU0 = this.f64851k.U0(this.f64843c.m(mode));
        AbstractC6492s.h(iVarU0, "mergeWith(...)");
        return iVarU0;
    }
}
