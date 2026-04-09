package w8;

import Li.N;
import Li.P;
import Sd.d;
import Zg.d0;
import android.os.Build;
import gg.AbstractC5912b;
import i8.C6095b;
import i8.InterfaceC6084a;
import j8.InterfaceC6259a;
import java.util.Set;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import md.C6796a;
import md.InterfaceC6797b;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import v8.InterfaceC8196a;
import ye.AbstractC8661g;
import ye.C8658d;

/* renamed from: w8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8282b extends com.ui.wifiman.ui.settings.preferences.a {

    /* renamed from: w, reason: collision with root package name */
    static final /* synthetic */ th.l[] f64517w = {O.h(new F(C8282b.class, "settingsManager", "getSettingsManager()Lcom/ui/wifiman/model/settings/AppSettingsManager;", 0)), O.h(new F(C8282b.class, "themeManager", "getThemeManager()Lcom/ubnt/usurvey/ui/arch/theme/ThemeService;", 0)), O.h(new F(C8282b.class, "localConsoleService", "getLocalConsoleService()Lcom/ui/wifiman/model/ubiquiti/console/local/UnifiLocalConsoleService;", 0)), O.h(new F(C8282b.class, "localConsoleCertificateManager", "getLocalConsoleCertificateManager()Lcom/ui/wifiman/model/ubiquiti/console/local/UnifiLocalConsoleCertificateManager;", 0)), O.h(new F(C8282b.class, "directConnectionPopupController", "getDirectConnectionPopupController()Lcom/ubnt/usurvey/ui/popup/console/DirectConsoleConnectionPopupController;", 0)), O.h(new F(C8282b.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(C8282b.class, "quickSettingsManager", "getQuickSettingsManager()Lcom/ui/wifiman/quicksettings/TeleportTileServiceManager;", 0))};

    /* renamed from: x, reason: collision with root package name */
    public static final int f64518x = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f64519g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f64520h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f64521i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f64522j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f64523k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f64524l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f64525m;

    /* renamed from: n, reason: collision with root package name */
    private final Yg.m f64526n;

    /* renamed from: o, reason: collision with root package name */
    private final N f64527o;

    /* renamed from: p, reason: collision with root package name */
    private final N f64528p;

    /* renamed from: q, reason: collision with root package name */
    private final Li.z f64529q;

    /* renamed from: r, reason: collision with root package name */
    private final N f64530r;

    /* renamed from: s, reason: collision with root package name */
    private final N f64531s;

    /* renamed from: t, reason: collision with root package name */
    private final N f64532t;

    /* renamed from: u, reason: collision with root package name */
    private final N f64533u;

    /* renamed from: v, reason: collision with root package name */
    private final N f64534v;

    /* renamed from: w8.b$a */
    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f64535a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(d.a it) {
            boolean z10;
            AbstractC6492s.i(it, "it");
            if (it instanceof d.a.AbstractC0739a) {
                z10 = true;
            } else {
                if (!(it instanceof d.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: w8.b$b, reason: collision with other inner class name */
    static final class C2286b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2286b f64536a = new C2286b();

        C2286b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(d.a it) {
            boolean z10;
            AbstractC6492s.i(it, "it");
            if (it instanceof d.a.AbstractC0739a.b) {
                z10 = true;
            } else {
                if (!(it instanceof d.a.AbstractC0739a.C0740a) && !(it instanceof d.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: w8.b$c */
    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f64537a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6796a settings) {
            AbstractC6492s.i(settings, "settings");
            return Boolean.valueOf(settings.e() == T7.b.DARK);
        }
    }

    /* renamed from: w8.b$d */
    static final class d implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f64538a = new d();

        d() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6796a settings, Set supportedDayNightModes) {
            AbstractC6492s.i(settings, "settings");
            AbstractC6492s.i(supportedDayNightModes, "supportedDayNightModes");
            T7.b bVar = T7.b.SYSTEM;
            return Boolean.valueOf(supportedDayNightModes.contains(bVar) && settings.e() == bVar);
        }
    }

    /* renamed from: w8.b$e */
    static final class e implements kg.n {
        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(d.a directConnectionStatus) {
            AbstractC6492s.i(directConnectionStatus, "directConnectionStatus");
            if (directConnectionStatus instanceof d.a.AbstractC0739a.b) {
                return C8282b.this.G0().a(((d.a.AbstractC0739a.b) directConnectionStatus).a(), d0.e());
            }
            if (directConnectionStatus instanceof d.a.AbstractC0739a.C0740a) {
                return C8282b.this.F0().b();
            }
            if (directConnectionStatus instanceof d.a.b) {
                return C8282b.this.L0().a(C6095b.f48955a);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.b$f */
    public static final class f extends org.kodein.type.o<InterfaceC6797b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.b$g */
    public static final class g extends org.kodein.type.o<InterfaceC6259a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.b$h */
    public static final class h extends org.kodein.type.o<Sd.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.b$i */
    public static final class i extends org.kodein.type.o<Sd.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.b$j */
    public static final class j extends org.kodein.type.o<InterfaceC8196a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.b$k */
    public static final class k extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.b$l */
    public static final class l extends org.kodein.type.o<com.ui.wifiman.quicksettings.a> {
    }

    /* renamed from: w8.b$m */
    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f64540a = new m();

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T7.c apply(C6796a settings) {
            AbstractC6492s.i(settings, "settings");
            return settings.g();
        }
    }

    public C8282b(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f64519g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6797b.class), null);
        th.l[] lVarArr = f64517w;
        this.f64520h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64521i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6259a.class), null).a(this, lVarArr[1]);
        DI di3 = getDi();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64522j = org.kodein.di.d.a(di3, new org.kodein.type.d(iVarE3, Sd.d.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new i().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64523k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, Sd.a.class), null).a(this, lVarArr[3]);
        DI di4 = getDi();
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64524l = org.kodein.di.d.a(di4, new org.kodein.type.d(iVarE5, InterfaceC8196a.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new k().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64525m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, InterfaceC6084a.class), null).a(this, lVarArr[5]);
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new l().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64526n = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE7, com.ui.wifiman.quicksettings.a.class), null).a(this, lVarArr[6]);
        gg.i iVarW = gg.i.v(J0().b(), K0().a(), d.f64538a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f64527o = AbstractC8661g.d0(this, iVarW, Boolean.TRUE, false, null, 6, null);
        gg.i iVarW2 = J0().b().N0(c.f64537a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        Boolean bool = Boolean.FALSE;
        this.f64528p = AbstractC8661g.d0(this, iVarW2, bool, false, null, 6, null);
        int i10 = Build.VERSION.SDK_INT;
        this.f64529q = P.a(Boolean.valueOf(i10 >= 33));
        gg.i iVarW3 = J0().b().N0(m.f64540a).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f64530r = AbstractC8661g.d0(this, iVarW3, T7.c.METRIC, false, null, 6, null);
        gg.i iVarW4 = H0().a().N0(a.f64535a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f64531s = AbstractC8661g.d0(this, iVarW4, bool, false, null, 6, null);
        gg.i iVarW5 = H0().a().N0(C2286b.f64536a).W();
        AbstractC6492s.h(iVarW5, "distinctUntilChanged(...)");
        this.f64532t = AbstractC8661g.d0(this, iVarW5, bool, false, null, 6, null);
        gg.i iVarK0 = gg.i.K0(Boolean.valueOf(i10 >= 33));
        AbstractC6492s.h(iVarK0, "just(...)");
        this.f64533u = AbstractC8661g.d0(this, iVarK0, bool, false, null, 6, null);
        this.f64534v = AbstractC8661g.d0(this, I0().b(), bool, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC8196a F0() {
        return (InterfaceC8196a) this.f64524l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sd.a G0() {
        return (Sd.a) this.f64523k.getValue();
    }

    private final Sd.d H0() {
        return (Sd.d) this.f64522j.getValue();
    }

    private final com.ui.wifiman.quicksettings.a I0() {
        return (com.ui.wifiman.quicksettings.a) this.f64526n.getValue();
    }

    private final InterfaceC6797b J0() {
        return (InterfaceC6797b) this.f64520h.getValue();
    }

    private final InterfaceC6259a K0() {
        return (InterfaceC6259a) this.f64521i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a L0() {
        return (InterfaceC6084a) this.f64525m.getValue();
    }

    @Override // com.ui.wifiman.ui.settings.preferences.a
    public void A0(boolean z10) {
        C8658d.f66727a.d(K0().d(z10 ? T7.b.SYSTEM : T7.b.LIGHT), this);
    }

    @Override // com.ui.wifiman.ui.settings.preferences.a
    public void B0() {
        C8658d.f66727a.d(L0().a(i8.f.f48959a), this);
    }

    @Override // com.ui.wifiman.ui.settings.preferences.a
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public Li.z s0() {
        return this.f64529q;
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f64519g;
    }

    @Override // com.ui.wifiman.ui.settings.preferences.a
    public N n0() {
        return this.f64531s;
    }

    @Override // com.ui.wifiman.ui.settings.preferences.a
    public N o0() {
        return this.f64532t;
    }

    @Override // com.ui.wifiman.ui.settings.preferences.a
    public N p0() {
        return this.f64533u;
    }

    @Override // com.ui.wifiman.ui.settings.preferences.a
    public N q0() {
        return this.f64534v;
    }

    @Override // com.ui.wifiman.ui.settings.preferences.a
    public N r0() {
        return this.f64530r;
    }

    @Override // com.ui.wifiman.ui.settings.preferences.a
    public N t0() {
        return this.f64528p;
    }

    @Override // com.ui.wifiman.ui.settings.preferences.a
    public N u0() {
        return this.f64527o;
    }

    @Override // com.ui.wifiman.ui.settings.preferences.a
    public void v0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = H0().a().o0().t(new e());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // com.ui.wifiman.ui.settings.preferences.a
    public void w0() {
        C8658d.f66727a.d(L0().a(C6095b.f48955a), this);
    }

    @Override // com.ui.wifiman.ui.settings.preferences.a
    public void x0() {
        C8658d.f66727a.d(L0().a(InterfaceC6084a.b.D.C1820a.f48893a), this);
    }

    @Override // com.ui.wifiman.ui.settings.preferences.a
    public void y0(boolean z10) {
        AbstractC5912b abstractC5912bA;
        C8658d c8658d = C8658d.f66727a;
        if (z10) {
            abstractC5912bA = L0().a(i8.e.f48958a);
        } else {
            if (z10) {
                throw new NoWhenBranchMatchedException();
            }
            abstractC5912bA = L0().a(i8.d.f48957a);
        }
        c8658d.d(abstractC5912bA, this);
    }

    @Override // com.ui.wifiman.ui.settings.preferences.a
    public void z0(boolean z10) {
        C8658d.f66727a.d(K0().d(z10 ? T7.b.DARK : T7.b.LIGHT), this);
    }
}
