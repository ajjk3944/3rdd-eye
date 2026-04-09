package u8;

import E8.InterfaceC2653a;
import Li.N;
import P8.f;
import Yg.m;
import dh.InterfaceC5380e;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import org.snmp4j.mp.PduHandle;
import rj.InterfaceC7810x2;
import th.l;
import v8.InterfaceC8196a;
import xe.AbstractC8513h;
import xe.EnumC8512g;
import ye.AbstractC8661g;

/* loaded from: classes3.dex */
public final class e extends AbstractC8513h {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ l[] f62719o = {O.h(new F(e.class, "popupController", "getPopupController()Lcom/ubnt/usurvey/ui/popup/ApplicationPopupController;", 0)), O.h(new F(e.class, "a2aSpeedtestPopupController", "getA2aSpeedtestPopupController()Lcom/ubnt/usurvey/ui/speedtest/A2ASpeedtestPopupController;", 0)), O.h(new F(e.class, "wifimanWizardPopupController", "getWifimanWizardPopupController()Lcom/ubnt/usurvey/ui/wmw/popup/WmwPopupController;", 0)), O.h(new F(e.class, "directConsoleConnectionPopupController", "getDirectConsoleConnectionPopupController()Lcom/ubnt/usurvey/ui/popup/console/DirectConsoleConnectionPopupController;", 0))};

    /* renamed from: p, reason: collision with root package name */
    public static final int f62720p = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f62721g;

    /* renamed from: h, reason: collision with root package name */
    private final m f62722h;

    /* renamed from: i, reason: collision with root package name */
    private final m f62723i;

    /* renamed from: j, reason: collision with root package name */
    private final m f62724j;

    /* renamed from: k, reason: collision with root package name */
    private final m f62725k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f62726l;

    /* renamed from: m, reason: collision with root package name */
    private final N f62727m;

    /* renamed from: n, reason: collision with root package name */
    private final N f62728n;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62729a;

        static {
            int[] iArr = new int[EnumC8512g.values().length];
            try {
                iArr[EnumC8512g.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8512g.SPEED_TEST_A2A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8512g.WIFIMAN_WIZARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC8512g.DIRECT_CONSOLE_CONNECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f62729a = iArr;
        }
    }

    static final class b implements kg.h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f62730a = new b();

        b() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnumC8512g a(Boolean isForciblyHidden, InterfaceC2653a.AbstractC0176a a2aSpeedtestPopup, f.b wizardPopup, InterfaceC8196a.AbstractC2249a directConnectionPopup) {
            AbstractC6492s.i(isForciblyHidden, "isForciblyHidden");
            AbstractC6492s.i(a2aSpeedtestPopup, "a2aSpeedtestPopup");
            AbstractC6492s.i(wizardPopup, "wizardPopup");
            AbstractC6492s.i(directConnectionPopup, "directConnectionPopup");
            return isForciblyHidden.booleanValue() ? EnumC8512g.NONE : wizardPopup instanceof f.b.C0647b ? EnumC8512g.WIFIMAN_WIZARD : a2aSpeedtestPopup instanceof InterfaceC2653a.AbstractC0176a.c ? EnumC8512g.SPEED_TEST_A2A : (!(directConnectionPopup instanceof InterfaceC8196a.AbstractC2249a.C2250a) || ((InterfaceC8196a.AbstractC2249a.C2250a) directConnectionPopup).a()) ? EnumC8512g.NONE : EnumC8512g.DIRECT_CONSOLE_CONNECT;
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f62731a = new c();

        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(EnumC8512g it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("App Popup state: " + it, null, 2, null);
        }
    }

    static final class d implements n {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f62733a;

            static {
                int[] iArr = new int[EnumC8512g.values().length];
                try {
                    iArr[EnumC8512g.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC8512g.SPEED_TEST_A2A.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC8512g.WIFIMAN_WIZARD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC8512g.DIRECT_CONSOLE_CONNECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f62733a = iArr;
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(EnumC8512g it) {
            AbstractC6492s.i(it, "it");
            int i10 = a.f62733a[it.ordinal()];
            if (i10 == 1) {
                gg.i iVarK0 = gg.i.K0(Boolean.TRUE);
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
            if (i10 == 2) {
                gg.i iVarK02 = gg.i.K0(Boolean.TRUE);
                AbstractC6492s.h(iVarK02, "just(...)");
                return iVarK02;
            }
            if (i10 == 3) {
                return e.this.u0().e();
            }
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            gg.i iVarK03 = gg.i.K0(Boolean.TRUE);
            AbstractC6492s.h(iVarK03, "just(...)");
            return iVarK03;
        }
    }

    /* renamed from: u8.e$e, reason: collision with other inner class name */
    static final class C2194e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f62734a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f62735b;

        /* renamed from: d, reason: collision with root package name */
        int f62737d;

        C2194e(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f62735b = obj;
            this.f62737d |= PduHandle.NONE;
            return e.this.p0(this);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends o<InterfaceC8140a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends o<InterfaceC2653a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends o<P8.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends o<InterfaceC8196a> {
    }

    public e(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f62721g = di2;
        org.kodein.type.i iVarE = s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC8140a.class), null);
        l[] lVarArr = f62719o;
        this.f62722h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f62723i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC2653a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f62724j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, P8.f.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = s.e(new i().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f62725k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, InterfaceC8196a.class), null).a(this, lVarArr[3]);
        gg.i iVarI2 = gg.i.t(t0().a(), r0().getState(), u0().getState(), s0().a(), b.f62730a).W().f0(c.f62731a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f62726l = iVarI2;
        gg.i iVarW = iVarI2.I1(new d()).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f62727m = AbstractC8661g.d0(this, iVarW, Boolean.TRUE, false, null, 6, null);
        this.f62728n = AbstractC8661g.d0(this, iVarI2, EnumC8512g.NONE, false, null, 6, null);
    }

    private final InterfaceC2653a r0() {
        return (InterfaceC2653a) this.f62723i.getValue();
    }

    private final InterfaceC8196a s0() {
        return (InterfaceC8196a) this.f62725k.getValue();
    }

    private final InterfaceC8140a t0() {
        return (InterfaceC8140a) this.f62722h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P8.f u0() {
        return (P8.f) this.f62724j.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f62721g;
    }

    @Override // xe.AbstractC8513h
    public N n0() {
        return this.f62728n;
    }

    @Override // xe.AbstractC8513h
    public N o0() {
        return this.f62727m;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // xe.AbstractC8513h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p0(dh.InterfaceC5380e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof u8.e.C2194e
            if (r0 == 0) goto L13
            r0 = r9
            u8.e$e r0 = (u8.e.C2194e) r0
            int r1 = r0.f62737d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62737d = r1
            goto L18
        L13:
            u8.e$e r0 = new u8.e$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f62735b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f62737d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L44
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L32
            Yg.v.b(r9)
            goto L8d
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            Yg.v.b(r9)
            goto La9
        L3f:
            Yg.v.b(r9)
            goto Lbf
        L44:
            java.lang.Object r2 = r0.f62734a
            u8.e r2 = (u8.e) r2
            Yg.v.b(r9)
            goto L67
        L4c:
            Yg.v.b(r9)
            gg.i r9 = r8.f62726l
            gg.z r9 = r9.o0()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.AbstractC6492s.h(r9, r2)
            r0.f62734a = r8
            r0.f62737d = r6
            java.lang.Object r9 = Qi.b.c(r9, r0)
            if (r9 != r1) goto L66
            return r1
        L66:
            r2 = r8
        L67:
            xe.g r9 = (xe.EnumC8512g) r9
            int[] r7 = u8.e.a.f62729a
            int r9 = r9.ordinal()
            r9 = r7[r9]
            if (r9 == r6) goto Lc2
            r6 = 0
            if (r9 == r5) goto Lac
            if (r9 == r4) goto L96
            if (r9 != r3) goto L90
            v8.a r9 = r2.s0()
            gg.b r9 = r9.dismiss()
            r0.f62734a = r6
            r0.f62737d = r3
            java.lang.Object r9 = Qi.b.b(r9, r0)
            if (r9 != r1) goto L8d
            return r1
        L8d:
            Yg.J r9 = Yg.J.f24997a
            return r9
        L90:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L96:
            P8.f r9 = r2.u0()
            gg.b r9 = r9.f()
            r0.f62734a = r6
            r0.f62737d = r4
            java.lang.Object r9 = Qi.b.b(r9, r0)
            if (r9 != r1) goto La9
            return r1
        La9:
            Yg.J r9 = Yg.J.f24997a
            return r9
        Lac:
            E8.a r9 = r2.r0()
            gg.b r9 = r9.a()
            r0.f62734a = r6
            r0.f62737d = r5
            java.lang.Object r9 = Qi.b.b(r9, r0)
            if (r9 != r1) goto Lbf
            return r1
        Lbf:
            Yg.J r9 = Yg.J.f24997a
            return r9
        Lc2:
            Yg.J r9 = Yg.J.f24997a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.e.p0(dh.e):java.lang.Object");
    }
}
