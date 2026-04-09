package w8;

import Li.N;
import Yg.J;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.support.SupportManager;
import ec.AbstractC5452a;
import gg.AbstractC5912b;
import gg.D;
import i8.InterfaceC6084a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import ld.C6574a;
import ld.InterfaceC6575b;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import ye.AbstractC8661g;
import ye.C8658d;

/* renamed from: w8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8281a extends com.ui.wifiman.ui.settings.feedback.a {

    /* renamed from: g, reason: collision with root package name */
    private final DI f64505g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f64506h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f64507i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f64508j;

    /* renamed from: k, reason: collision with root package name */
    private final Fg.a f64509k;

    /* renamed from: l, reason: collision with root package name */
    private final N f64510l;

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ th.l[] f64503n = {O.h(new F(C8281a.class, "supportManager", "getSupportManager()Lcom/ui/wifiman/model/support/SupportManager;", 0)), O.h(new F(C8281a.class, "sessionManager", "getSessionManager()Lcom/ui/wifiman/model/session/AppSessionManager;", 0)), O.h(new F(C8281a.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0))};

    /* renamed from: m, reason: collision with root package name */
    public static final C2283a f64502m = new C2283a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f64504o = 8;

    /* renamed from: w8.a$a, reason: collision with other inner class name */
    public static final class C2283a {
        public /* synthetic */ C2283a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2283a() {
        }
    }

    /* renamed from: w8.a$b */
    public static final class b implements gg.q {
        public b() {
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                String strY0 = C8281a.this.y0();
                if (strY0 != null) {
                    oVar.onSuccess(strY0);
                } else {
                    oVar.a();
                }
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: w8.a$c */
    static final class c implements kg.n {

        /* renamed from: w8.a$c$a, reason: collision with other inner class name */
        static final class C2284a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final C2284a f64513a = new C2284a();

            C2284a() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable it) {
                AbstractC6492s.i(it, "it");
                Z7.b.f(it, null, 2, null);
            }
        }

        /* renamed from: w8.a$c$b */
        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f64514a = new b();

            b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(String it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it);
            }
        }

        /* renamed from: w8.a$c$c, reason: collision with other inner class name */
        static final class C2285c implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f64515a;

            C2285c(String str) {
                this.f64515a = str;
            }

            @Override // kg.InterfaceC6465b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC6084a.b.D.d apply(C6556a c6556a, C6574a session) {
                AbstractC6492s.i(c6556a, "<destruct>");
                AbstractC6492s.i(session, "session");
                String str = (String) c6556a.a();
                AbstractC5452a.b bVar = new AbstractC5452a.b("wifimanmobilefeedback@ui.com");
                AbstractC5452a.C1741a c1741a = new AbstractC5452a.C1741a(R.string.feedback_email_subject, session.a());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f64515a);
                if (str != null) {
                    sb2.append(str);
                }
                J j10 = J.f24997a;
                return new InterfaceC6084a.b.D.d(bVar, c1741a, new AbstractC5452a.b(sb2), null, 8, null);
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(String comment) {
            AbstractC6492s.i(comment, "comment");
            return gg.z.e0(C8281a.this.w0().c().m(C2284a.f64513a).A(b.f64514a).H(new C6556a(null)), C8281a.this.v0().a().o0(), new C2285c(comment));
        }
    }

    /* renamed from: w8.a$d */
    static final class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(InterfaceC6084a.b.D.d emailComposerRequest) {
            AbstractC6492s.i(emailComposerRequest, "emailComposerRequest");
            return C8281a.this.x0().a(InterfaceC6084a.b.n.f48939a, emailComposerRequest);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.a$e */
    public static final class e extends org.kodein.type.o<SupportManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.a$f */
    public static final class f extends org.kodein.type.o<InterfaceC6575b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: w8.a$g */
    public static final class g extends org.kodein.type.o<InterfaceC6084a> {
    }

    public C8281a(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f64505g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, SupportManager.class), null);
        th.l[] lVarArr = f64503n;
        this.f64506h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64507i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6575b.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64508j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC6084a.class), null).a(this, lVarArr[2]);
        Boolean bool = Boolean.FALSE;
        Fg.a aVarK2 = Fg.a.k2(bool);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f64509k = aVarK2;
        gg.i iVarY0 = aVarK2.e1().Y0(Gg.a.a(), false, 1);
        AbstractC6492s.h(iVarY0, "observeOn(...)");
        this.f64510l = AbstractC8661g.d0(this, iVarY0, bool, false, null, 6, null);
    }

    private final void A0(String str) {
        j0().i("comment", str);
        this.f64509k.h(Boolean.valueOf(z0()));
    }

    private final gg.n u0() {
        gg.n nVarC = gg.n.c(new b());
        AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
        gg.n nVarL = nVarC.l(new c());
        AbstractC6492s.h(nVarL, "flatMapSingle(...)");
        return nVarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6575b v0() {
        return (InterfaceC6575b) this.f64507i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportManager w0() {
        return (SupportManager) this.f64506h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a x0() {
        return (InterfaceC6084a) this.f64508j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String y0() {
        return (String) j0().d("comment");
    }

    private final boolean z0() {
        String strY0 = y0();
        return !(strY0 == null || kotlin.text.t.m0(strY0));
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f64505g;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        super.l0();
        this.f64509k.h(Boolean.valueOf(z0()));
    }

    @Override // com.ui.wifiman.ui.settings.feedback.a
    public N n0() {
        return this.f64510l;
    }

    @Override // com.ui.wifiman.ui.settings.feedback.a
    public void o0(String comment) {
        AbstractC6492s.i(comment, "comment");
        A0(comment);
    }

    @Override // com.ui.wifiman.ui.settings.feedback.a
    public void p0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = u0().k(new d());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }
}
