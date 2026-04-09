package w8;

import Li.N;
import Li.P;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.support.SupportManager;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import ec.AbstractC5452a;
import gg.AbstractC5912b;
import gg.D;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import hc.C5973a;
import hc.InterfaceC5974b;
import i8.C6096c;
import i8.InterfaceC6084a;
import java.io.File;
import java.util.List;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import ld.C6574a;
import ld.InterfaceC6575b;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.d;
import ve.InterfaceC8215a;
import ye.AbstractC8661g;
import ye.C8658d;

/* renamed from: w8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8283c extends Re.a {

    /* renamed from: r, reason: collision with root package name */
    static final /* synthetic */ th.l[] f64541r = {O.h(new F(C8283c.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(C8283c.class, "toastService", "getToastService()Lcom/ui/wifiman/domain/toast/ToastService;", 0)), O.h(new F(C8283c.class, "supportManager", "getSupportManager()Lcom/ui/wifiman/model/support/SupportManager;", 0)), O.h(new F(C8283c.class, "accountManager", "getAccountManager()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;", 0)), O.h(new F(C8283c.class, "clipboardManager", "getClipboardManager()Landroid/content/ClipboardManager;", 0)), O.h(new F(C8283c.class, "appSession", "getAppSession()Lcom/ui/wifiman/model/session/AppSessionManager;", 0)), O.h(new F(C8283c.class, "appSupportFile", "getAppSupportFile()Lcom/ui/wifiman/support/supportfile/AppSupportFile;", 0))};

    /* renamed from: s, reason: collision with root package name */
    public static final int f64542s = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f64543g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f64544h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f64545i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f64546j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f64547k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f64548l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f64549m;

    /* renamed from: n, reason: collision with root package name */
    private final Yg.m f64550n;

    /* renamed from: o, reason: collision with root package name */
    private final N f64551o;

    /* renamed from: p, reason: collision with root package name */
    private final Li.z f64552p;

    /* renamed from: q, reason: collision with root package name */
    private final N f64553q;

    /* renamed from: w8.c$a */
    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f64554a = new a();

        a() {
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(-1645325281);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1645325281, i10, -1, "com.ubnt.usurvey.ui.settings.AppSettingsVM.appVersion.<anonymous> (AppSettingsVM.kt:40)");
            }
            String str = it.getString(R.string.settings_app_version) + ": 2.12.1";
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* renamed from: w8.c$b */
    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f64555a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            return new C6556a(Boolean.valueOf(((com.ui.wifiman.model.ubiquiti.cloud.sso.b) c6556a.a()) != null));
        }
    }

    /* renamed from: w8.c$c, reason: collision with other inner class name */
    static final class C2287c implements kg.n {
        C2287c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            C6556a c6556a = (C6556a) sVar.a();
            List list = (List) sVar.c();
            if (c6556a.b() == null) {
                return !list.isEmpty() ? C8283c.this.P0().a(InterfaceC6084a.b.r.f48944a) : C8283c.this.P0().a(new InterfaceC6084a.b.t(null, 1, null));
            }
            InterfaceC6084a interfaceC6084aP0 = C8283c.this.P0();
            com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar = (com.ui.wifiman.model.ubiquiti.cloud.sso.b) c6556a.b();
            return interfaceC6084aP0.a(new InterfaceC6084a.b.t(bVar != null ? bVar.c() : null));
        }
    }

    /* renamed from: w8.c$d */
    static final class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(String sectionInfo) {
            AbstractC6492s.i(sectionInfo, "sectionInfo");
            return C8283c.this.L0().a(sectionInfo);
        }
    }

    /* renamed from: w8.c$e */
    static final class e implements kg.n {
        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a c6556a) {
            AbstractC5912b abstractC5912bA;
            AbstractC6492s.i(c6556a, "<destruct>");
            File file = (File) c6556a.a();
            return (file == null || (abstractC5912bA = C8283c.this.P0().a(new InterfaceC6084a.b.y(file, null, 2, null))) == null) ? AbstractC5912b.m() : abstractC5912bA;
        }
    }

    /* renamed from: w8.c$f */
    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f64559a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.f(it, null, 2, null);
        }
    }

    /* renamed from: w8.c$g */
    static final class g implements kg.n {

        /* renamed from: w8.c$g$a */
        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C8283c f64561a;

            public a(C8283c c8283c) {
                this.f64561a = c8283c;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f64561a.O0().a(new C5973a(new AbstractC5452a.C1741a(R.string.settings_support_file_error_message, new Object[0]), false, 2, null));
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof SupportManager.Error.SupportFileCreationError)) {
                return AbstractC5912b.D(error);
            }
            Z7.b.f(error, null, 2, null);
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(C8283c.this));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    /* renamed from: w8.c$h */
    static final class h implements kg.n {

        /* renamed from: w8.c$h$a */
        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C8283c f64563a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C6574a f64564b;

            public a(C8283c c8283c, C6574a c6574a) {
                this.f64563a = c8283c;
                this.f64564b = c6574a;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f64563a.M0().setPrimaryClip(ClipData.newPlainText("WiFiman Report Key", this.f64564b.a()));
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        /* renamed from: w8.c$h$b */
        public static final class b implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C8283c f64565a;

            public b(C8283c c8283c) {
                this.f64565a = c8283c;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f64565a.O0().a(new C5973a(new AbstractC5452a.C1741a(R.string.settings_report_key_copy_finished, new Object[0]), false, 2, null));
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6574a session) {
            AbstractC6492s.i(session, "session");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(C8283c.this, session));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            AbstractC5912b abstractC5912bR2 = AbstractC5912b.r(new b(C8283c.this));
            AbstractC6492s.h(abstractC5912bR2, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR.g(abstractC5912bR2);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.c$i */
    public static final class i extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.c$j */
    public static final class j extends org.kodein.type.o<InterfaceC5974b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.c$k */
    public static final class k extends org.kodein.type.o<SupportManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.c$l */
    public static final class l extends org.kodein.type.o<UiSSOAccountManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.c$m */
    public static final class m extends org.kodein.type.o<ClipboardManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.c$n */
    public static final class n extends org.kodein.type.o<InterfaceC6575b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.c$o */
    public static final class o extends org.kodein.type.o<InterfaceC8215a> {
    }

    public C8283c(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f64543g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new i().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6084a.class), null);
        th.l[] lVarArr = f64541r;
        this.f64544h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64545i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC5974b.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new k().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64546j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, SupportManager.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new l().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64547k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, UiSSOAccountManager.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new m().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64548l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, ClipboardManager.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new n().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64549m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, InterfaceC6575b.class), null).a(this, lVarArr[5]);
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new o().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64550n = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE7, InterfaceC8215a.class), null).a(this, lVarArr[6]);
        this.f64551o = P.a(new d.a("2.12.1", a.f64554a));
        this.f64552p = P.a(Boolean.FALSE);
        gg.i iVarN0 = J0().e().N0(b.f64555a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f64553q = AbstractC8661g.h0(this, iVarN0, null, null, 2, null);
    }

    private final UiSSOAccountManager J0() {
        return (UiSSOAccountManager) this.f64547k.getValue();
    }

    private final InterfaceC6575b K0() {
        return (InterfaceC6575b) this.f64549m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC8215a L0() {
        return (InterfaceC8215a) this.f64550n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipboardManager M0() {
        return (ClipboardManager) this.f64548l.getValue();
    }

    private final SupportManager N0() {
        return (SupportManager) this.f64546j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5974b O0() {
        return (InterfaceC5974b) this.f64545i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a P0() {
        return (InterfaceC6084a) this.f64544h.getValue();
    }

    @Override // Re.a
    public void A0() {
        C8658d.f66727a.d(P0().a(InterfaceC6084a.b.C1828b.f48920a), this);
    }

    @Override // Re.a
    public void B0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bO = N0().a().s(new d()).t(new e()).z(f.f64559a).O(new g());
        AbstractC6492s.h(abstractC5912bO, "onErrorResumeNext(...)");
        c8658d.d(abstractC5912bO, this);
    }

    @Override // Re.a
    public void C0() {
        C8658d.f66727a.d(P0().a(InterfaceC6084a.b.F.f48909a), this);
    }

    @Override // Re.a
    public void D0() {
        C8658d.f66727a.d(P0().a(InterfaceC6084a.b.G.f48910a), this);
    }

    @Override // Re.a
    public void E0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = K0().a().o0().t(new h());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // Re.a
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public Li.z p0() {
        return this.f64552p;
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f64543g;
    }

    @Override // Re.a
    public N n0() {
        return this.f64551o;
    }

    @Override // Re.a
    public N o0() {
        return this.f64553q;
    }

    @Override // Re.a
    public void q0() {
        C8658d.f66727a.d(P0().a(InterfaceC6084a.b.r.f48944a), this);
    }

    @Override // Re.a
    public void r0() {
        C8658d.f66727a.d(P0().a(InterfaceC6084a.b.r.f48944a), this);
    }

    @Override // Re.a
    public void s0() {
        C8658d.f66727a.d(P0().a(InterfaceC6084a.b.C1827a.f48919a), this);
    }

    @Override // Re.a
    public void t0() {
        C8658d.f66727a.d(P0().a(C6096c.f48956a), this);
    }

    @Override // Re.a
    public void u0() {
        C8658d.f66727a.d(P0().a(new InterfaceC6084a.b.o("https://community.ui.com/tags/wifiman")), this);
    }

    @Override // Re.a
    public void v0() {
        C8658d.f66727a.d(P0().a(InterfaceC6084a.b.AbstractC6088f.C1832a.f48925a), this);
    }

    @Override // Re.a
    public void w0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = Ag.c.f753a.a(J0().e(), J0().a()).o0().t(new C2287c());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // Re.a
    public void x0() {
        C8658d.f66727a.d(P0().a(InterfaceC6084a.b.u.f48947a), this);
    }

    @Override // Re.a
    public void y0() {
        C8658d.f66727a.d(P0().a(InterfaceC6084a.b.s.f48945a), this);
    }

    @Override // Re.a
    public void z0() {
        C8658d.f66727a.d(P0().a(InterfaceC6084a.b.q.f48943a), this);
    }
}
