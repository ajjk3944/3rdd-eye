package G8;

import Yg.m;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.o;
import gg.q;
import gg.r;
import i8.InterfaceC6084a;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import org.kodein.di.DI;
import org.kodein.type.i;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import th.l;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class h extends com.ui.wifiman.ui.sso.logout.b {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ l[] f7198j = {O.h(new F(h.class, "accountManager", "getAccountManager()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;", 0)), O.h(new F(h.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0))};

    /* renamed from: k, reason: collision with root package name */
    public static final int f7199k = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f7200g;

    /* renamed from: h, reason: collision with root package name */
    private final m f7201h;

    /* renamed from: i, reason: collision with root package name */
    private final m f7202i;

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7203a = new a();

        /* renamed from: G8.h$a$a, reason: collision with other inner class name */
        public static final class C0291a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.ubiquiti.cloud.sso.b f7204a;

            public C0291a(com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar) {
                this.f7204a = bVar;
            }

            @Override // gg.q
            public final void a(o oVar) {
                try {
                    com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar = this.f7204a;
                    if (bVar != null) {
                        oVar.onSuccess(bVar);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            gg.n nVarC = gg.n.c(new C0291a((com.ui.wifiman.model.ubiquiti.cloud.sso.b) c6556a.a()));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class b implements n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(com.ui.wifiman.model.ubiquiti.cloud.sso.b account) {
            AbstractC6492s.i(account, "account");
            return h.this.p0().d(account);
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7206a = new c();

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Throwable f7207a;

            public a(Throwable th2) {
                this.f7207a = th2;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    Z7.b.e("Failed to logout/delete account", this.f7207a, null, 4, null);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof UiSSOAccountManager.Error)) {
                return AbstractC5912b.D(error);
            }
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(error));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends org.kodein.type.o<UiSSOAccountManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<InterfaceC6084a> {
    }

    public h(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f7200g = di2;
        i iVarE = s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, UiSSOAccountManager.class), null);
        l[] lVarArr = f7198j;
        this.f7201h = interfaceC7810x2A.a(this, lVarArr[0]);
        i iVarE2 = s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7202i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiSSOAccountManager p0() {
        return (UiSSOAccountManager) this.f7201h.getValue();
    }

    private final InterfaceC6084a q0() {
        return (InterfaceC6084a) this.f7202i.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f7200g;
    }

    @Override // com.ui.wifiman.ui.sso.logout.b
    public void n0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(p0().e().o0().u(a.f7203a).k(new b()).O(c.f7206a), q0().a(InterfaceC6084a.b.n.f48939a));
        AbstractC6492s.h(abstractC5912bP, "concatArray(...)");
        c8658d.d(abstractC5912bP, this);
    }
}
