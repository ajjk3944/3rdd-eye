package i8;

import Li.InterfaceC3220g;
import N8.a;
import Qe.c;
import Yg.J;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import i8.InterfaceC6084a;
import i8.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import nf.e;
import sf.C7951b;
import xe.AbstractC8464F;
import xe.InterfaceC8511f;

/* loaded from: classes3.dex */
public final class r implements InterfaceC8511f {

    /* renamed from: a, reason: collision with root package name */
    private final s.d f49052a;

    /* renamed from: b, reason: collision with root package name */
    private final com.ubnt.usurvey.ui.teleport.deeplink.a f49053b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f49054c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f49055d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f49056e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3220g f49057f;

    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f49058a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(a.AbstractC0585a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it instanceof a.AbstractC0585a.b);
        }
    }

    static final class b implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r f49060a;

            a(r rVar) {
                this.f49060a = rVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.r apply(J it) {
                AbstractC6492s.i(it, "it");
                return this.f49060a.f49052a.a();
            }
        }

        /* renamed from: i8.r$b$b, reason: collision with other inner class name */
        static final class C1842b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r f49061a;

            /* renamed from: i8.r$b$b$a */
            public static final class a implements gg.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ s f49062a;

                public a(s sVar) {
                    this.f49062a = sVar;
                }

                @Override // gg.q
                public final void a(gg.o oVar) {
                    try {
                        oVar.onSuccess(new InterfaceC8511f.a.b.C2337a(new AbstractC8464F.g(((s.c) this.f49062a).b())));
                    } catch (Throwable th2) {
                        oVar.onError(th2);
                    }
                }
            }

            /* renamed from: i8.r$b$b$b, reason: collision with other inner class name */
            public static final class C1843b implements gg.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ s f49063a;

                public C1843b(s sVar) {
                    this.f49063a = sVar;
                }

                @Override // gg.q
                public final void a(gg.o oVar) {
                    try {
                        oVar.onSuccess(new InterfaceC8511f.a.b.C2337a(new AbstractC8464F.m.c(new C7951b(((s.g) this.f49063a).b()))));
                    } catch (Throwable th2) {
                        oVar.onError(th2);
                    }
                }
            }

            /* renamed from: i8.r$b$b$c */
            public static final class c implements gg.q {
                @Override // gg.q
                public final void a(gg.o oVar) {
                    try {
                        oVar.onSuccess(new InterfaceC8511f.a.b.C2337a(new AbstractC8464F.g(c.a.TELEPORT)));
                    } catch (Throwable th2) {
                        oVar.onError(th2);
                    }
                }
            }

            /* renamed from: i8.r$b$b$d */
            public static final class d implements gg.q {
                @Override // gg.q
                public final void a(gg.o oVar) {
                    try {
                        oVar.onSuccess(new InterfaceC8511f.a.b.C2337a(new AbstractC8464F.l.e(e.c.f54652a)));
                    } catch (Throwable th2) {
                        oVar.onError(th2);
                    }
                }
            }

            C1842b(r rVar) {
                this.f49061a = rVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.r apply(s deepLink) {
                AbstractC6492s.i(deepLink, "deepLink");
                if (deepLink instanceof s.c) {
                    gg.n nVarC = gg.n.c(new a(deepLink));
                    AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
                    return nVarC;
                }
                if (deepLink instanceof s.g) {
                    gg.n nVarC2 = gg.n.c(new C1843b(deepLink));
                    AbstractC6492s.h(nVarC2, "crossinline action: () -…or(error)\n        }\n    }");
                    return nVarC2;
                }
                if (!(deepLink instanceof s.f)) {
                    if (!(deepLink instanceof s.e.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gg.n nVarC3 = gg.n.c(new d());
                    AbstractC6492s.h(nVarC3, "crossinline action: () -…or(error)\n        }\n    }");
                    return nVarC3;
                }
                AbstractC5912b abstractC5912bB = this.f49061a.f49053b.b((s.f) deepLink);
                gg.n nVarC4 = gg.n.c(new c());
                AbstractC6492s.h(nVarC4, "crossinline action: () -…or(error)\n        }\n    }");
                gg.n nVarI = abstractC5912bB.i(nVarC4);
                AbstractC6492s.h(nVarI, "andThen(...)");
                return nVarI;
            }
        }

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean appWizardRequired) {
            AbstractC6492s.i(appWizardRequired, "appWizardRequired");
            if (appWizardRequired.booleanValue()) {
                gg.i iVarJ0 = gg.i.j0();
                AbstractC6492s.f(iVarJ0);
                return iVarJ0;
            }
            gg.i iVarV0 = r.this.f49052a.b().M1(new a(r.this)).v0(new C1842b(r.this));
            AbstractC6492s.f(iVarV0);
            return iVarV0;
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f49064a = new c();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f49065a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC8511f.a.b.C2337a apply(AbstractC8464F it) {
                AbstractC6492s.i(it, "it");
                return new InterfaceC8511f.a.b.C2337a(it);
            }
        }

        public static final class b implements gg.q {
            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    InterfaceC8511f.a.C2336a c2336a = InterfaceC8511f.a.C2336a.f66005a;
                    if (c2336a != null) {
                        oVar.onSuccess(c2336a);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        /* renamed from: i8.r$c$c, reason: collision with other inner class name */
        public static final class C1844c implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6084a.AbstractC1811a f49066a;

            public C1844c(InterfaceC6084a.AbstractC1811a abstractC1811a) {
                this.f49066a = abstractC1811a;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    Object objA = ((InterfaceC6084a.AbstractC1811a.f) this.f49066a).a();
                    AbstractC8464F abstractC8464F = objA instanceof AbstractC8464F ? (AbstractC8464F) objA : null;
                    if (abstractC8464F != null) {
                        oVar.onSuccess(abstractC8464F);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(InterfaceC6084a.AbstractC1811a event) {
            AbstractC6492s.i(event, "event");
            if (event instanceof InterfaceC6084a.AbstractC1811a.e) {
                gg.n nVarC = gg.n.c(new b());
                AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
                return nVarC;
            }
            if (event instanceof InterfaceC6084a.AbstractC1811a.f) {
                gg.n nVarC2 = gg.n.c(new C1844c(event));
                AbstractC6492s.h(nVarC2, "crossinline action: () -…or(error)\n        }\n    }");
                gg.n nVarP = nVarC2.p(a.f49065a);
                AbstractC6492s.h(nVarP, "map(...)");
                return nVarP;
            }
            if ((event instanceof InterfaceC6084a.AbstractC1811a.h) || (event instanceof InterfaceC6084a.AbstractC1811a.c) || (event instanceof InterfaceC6084a.AbstractC1811a.d) || (event instanceof InterfaceC6084a.AbstractC1811a.g)) {
                gg.n nVarH = gg.n.h();
                AbstractC6492s.h(nVarH, "empty(...)");
                return nVarH;
            }
            gg.n nVarH2 = gg.n.h();
            AbstractC6492s.h(nVarH2, "empty(...)");
            return nVarH2;
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f49067a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(a.AbstractC0585a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it instanceof a.AbstractC0585a.b);
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f49068a = new e();

        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Boolean f49069a;

            public a(Boolean bool) {
                this.f49069a = bool;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    InterfaceC8511f.a.b.C2337a c2337a = this.f49069a.booleanValue() ? new InterfaceC8511f.a.b.C2337a(AbstractC8464F.a.f65674a) : null;
                    if (c2337a != null) {
                        oVar.onSuccess(c2337a);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(Boolean openWizard) {
            AbstractC6492s.i(openWizard, "openWizard");
            gg.n nVarC = gg.n.c(new a(openWizard));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    public r(InterfaceC6084a viewRouter, s.d deepLinkProcessor, com.ubnt.usurvey.ui.teleport.deeplink.a deepLinkConsoleConnectProcessor, N8.a wizardManager) {
        AbstractC6492s.i(viewRouter, "viewRouter");
        AbstractC6492s.i(deepLinkProcessor, "deepLinkProcessor");
        AbstractC6492s.i(deepLinkConsoleConnectProcessor, "deepLinkConsoleConnectProcessor");
        AbstractC6492s.i(wizardManager, "wizardManager");
        this.f49052a = deepLinkProcessor;
        this.f49053b = deepLinkConsoleConnectProcessor;
        gg.i iVarV0 = wizardManager.getState().N0(d.f49067a).W().v0(e.f49068a);
        AbstractC6492s.h(iVarV0, "flatMapMaybe(...)");
        this.f49054c = iVarV0;
        gg.i iVarI1 = wizardManager.getState().N0(a.f49058a).W().I1(new b());
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        this.f49055d = iVarI1;
        gg.i iVarD1 = viewRouter.b().W(c.f49064a).d1(EnumC5911a.BUFFER);
        AbstractC6492s.h(iVarD1, "toFlowable(...)");
        this.f49056e = iVarD1;
        gg.i iVarR0 = gg.i.R0(iVarV0, iVarD1, iVarI1);
        AbstractC6492s.h(iVarR0, "merge(...)");
        this.f49057f = Pi.e.a(iVarR0);
    }

    @Override // xe.InterfaceC8511f
    public InterfaceC3220g a() {
        return this.f49057f;
    }
}
