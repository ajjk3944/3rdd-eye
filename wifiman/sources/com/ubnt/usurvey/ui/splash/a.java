package com.ubnt.usurvey.ui.splash;

import N8.a;
import Yg.m;
import com.ubnt.usurvey.ui.splash.SplashActivity;
import gg.AbstractC5912b;
import gg.f;
import i8.InterfaceC6084a;
import kg.InterfaceC6464a;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import ld.InterfaceC6575b;
import org.kodein.di.DI;
import org.kodein.type.i;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import th.l;

/* loaded from: classes3.dex */
public final class a implements SplashActivity.b {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ l[] f40967f = {O.h(new F(a.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(a.class, "appSessionManager", "getAppSessionManager()Lcom/ui/wifiman/model/session/AppSessionManager;", 0)), O.h(new F(a.class, "wizardManager", "getWizardManager()Lcom/ubnt/usurvey/ui/wizard/AppWizardManager;", 0))};

    /* renamed from: g, reason: collision with root package name */
    public static final int f40968g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final m f40969a;

    /* renamed from: b, reason: collision with root package name */
    private final m f40970b;

    /* renamed from: c, reason: collision with root package name */
    private final m f40971c;

    /* renamed from: d, reason: collision with root package name */
    private final Fg.a f40972d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5912b f40973e;

    /* renamed from: com.ubnt.usurvey.ui.splash.a$a, reason: collision with other inner class name */
    static final class C1272a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C1272a f40974a = new C1272a();

        C1272a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(a.AbstractC0585a wizardState) {
            AbstractC6492s.i(wizardState, "wizardState");
            return Boolean.valueOf(wizardState instanceof a.AbstractC0585a.b);
        }
    }

    static final class b implements n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f apply(Boolean wizardRequired) {
            AbstractC6492s.i(wizardRequired, "wizardRequired");
            return !wizardRequired.booleanValue() ? a.this.f().a(new InterfaceC6084a.b.C6085c(null, 1, null)) : AbstractC5912b.m();
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends o<InterfaceC6575b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends o<N8.a> {
    }

    public a(DI di2) {
        AbstractC6492s.i(di2, "di");
        i iVarE = s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, InterfaceC6084a.class), null);
        l[] lVarArr = f40967f;
        this.f40969a = interfaceC7810x2A.a(this, lVarArr[0]);
        i iVarE2 = s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f40970b = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, InterfaceC6575b.class), null).a(this, lVarArr[1]);
        i iVarE3 = s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f40971c = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE3, N8.a.class), null).a(this, lVarArr[2]);
        Fg.a aVarK2 = Fg.a.k2(Boolean.FALSE);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f40972d = aVarK2;
        AbstractC5912b abstractC5912bL = AbstractC5912b.p(e().b(), g().getState().o0().A(C1272a.f40974a).t(new b())).x(new InterfaceC6464a() { // from class: F8.c
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ubnt.usurvey.ui.splash.a.h(this.f6034a);
            }
        }).l();
        AbstractC6492s.h(abstractC5912bL, "cache(...)");
        this.f40973e = abstractC5912bL;
    }

    private final InterfaceC6575b e() {
        return (InterfaceC6575b) this.f40970b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a f() {
        return (InterfaceC6084a) this.f40969a.getValue();
    }

    private final N8.a g() {
        return (N8.a) this.f40971c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(a aVar) {
        Z7.b.h("Session setup complete. Setting finished flag to allow spash screen to quit", null, 2, null);
        aVar.f40972d.h(Boolean.TRUE);
    }

    @Override // com.ubnt.usurvey.ui.splash.SplashActivity.b
    public AbstractC5912b a() {
        return this.f40973e;
    }

    @Override // com.ubnt.usurvey.ui.splash.SplashActivity.b
    public boolean b() {
        Object objL2 = this.f40972d.l2();
        AbstractC6492s.f(objL2);
        return ((Boolean) objL2).booleanValue();
    }
}
