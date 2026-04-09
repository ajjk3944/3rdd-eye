package G8;

import Li.N;
import Yg.m;
import com.ui.sso.auth.d;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import com.ui.wifiman.model.ubiquiti.cloud.sso.b;
import gg.i;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import mh.InterfaceC6824a;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import qf.AbstractC7474a;
import th.l;
import ye.AbstractC8661g;

/* loaded from: classes3.dex */
public final class c extends AbstractC7474a {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ l[] f7145j = {O.h(new F(c.class, "ssoAccountManager", "getSsoAccountManager()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;", 0))};

    /* renamed from: k, reason: collision with root package name */
    public static final int f7146k = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f7147g;

    /* renamed from: h, reason: collision with root package name */
    private final m f7148h;

    /* renamed from: i, reason: collision with root package name */
    private final N f7149i;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends o<UiSSOAccountManager> {
    }

    static final class b implements n {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ l[] f7150b = {O.g(new D(c.class, "session", "<v#0>", 0))};

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f7152a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C6556a c6556a) {
                String strA;
                d.b bVarC;
                AbstractC6492s.i(c6556a, "<destruct>");
                com.ui.sso.auth.a aVar = (com.ui.sso.auth.a) c6556a.a();
                String strA2 = null;
                if (aVar instanceof com.ui.sso.auth.c) {
                    strA = ((com.ui.sso.auth.c) aVar).a();
                } else if (aVar instanceof com.ui.sso.auth.d) {
                    strA = ((com.ui.sso.auth.d) aVar).a();
                } else {
                    Z7.b.e("No Authentication available", null, null, 6, null);
                    strA = null;
                }
                if (strA == null) {
                    strA = "";
                }
                com.ui.sso.auth.d dVar = aVar instanceof com.ui.sso.auth.d ? (com.ui.sso.auth.d) aVar : null;
                if (dVar != null && (bVarC = dVar.c()) != null) {
                    strA2 = bVarC.a();
                }
                return new C6556a(new AbstractC7474a.C2066a("https://account.ui.com/?appview=true", strA, strA2));
            }
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/x4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: G8.c$b$b, reason: collision with other inner class name */
        public static final class C0284b extends o<b.a> {
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/y4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: G8.c$b$c, reason: collision with other inner class name */
        public static final class C0285c extends o<Nd.a> {
        }

        public static final class d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f7153a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Object obj) {
                super(0);
                this.f7153a = obj;
            }

            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return this.f7153a;
            }
        }

        b() {
        }

        private static final Nd.a b(m mVar) {
            return (Nd.a) mVar.getValue();
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar = (com.ui.wifiman.model.ubiquiti.cloud.sso.b) c6556a.a();
            if (bVar == null) {
                return i.K0(new C6556a(null));
            }
            c cVar = c.this;
            b.a aVarA = b.a.a(bVar.e());
            org.kodein.type.i iVarE = s.e(new C0284b().getSuperType());
            AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            org.kodein.type.d dVar = new org.kodein.type.d(iVarE, b.a.class);
            org.kodein.type.i iVarE2 = s.e(new C0285c().getSuperType());
            AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            return b(org.kodein.di.d.b(cVar, dVar, new org.kodein.type.d(iVarE2, Nd.a.class), null, new d(aVarA)).a(null, f7150b[0])).a().N0(a.f7152a);
        }
    }

    public c(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f7147g = di2;
        org.kodein.type.i iVarE = s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7148h = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, UiSSOAccountManager.class), null).a(this, f7145j[0]);
        i iVarW = o0().e().I1(new b()).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f7149i = AbstractC8661g.h0(this, iVarW, null, null, 2, null);
    }

    private final UiSSOAccountManager o0() {
        return (UiSSOAccountManager) this.f7148h.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f7147g;
    }

    @Override // qf.AbstractC7474a
    public N n0() {
        return this.f7149i;
    }
}
