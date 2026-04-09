package H8;

import com.ubnt.usurvey.R;
import com.ui.wifiman.model.teleport.TeleportConnection;
import com.ui.wifiman.model.teleport.session.TeleportSession;
import com.ui.wifiman.ui.teleport.L;
import com.ui.wifiman.ui.teleport.M;
import ec.AbstractC5452a;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.z;
import hc.C5973a;
import hc.InterfaceC5974b;
import i8.InterfaceC6084a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;
import org.kodein.di.DI;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class q extends M {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ th.l[] f7804l = {O.h(new F(q.class, "teleportSession", "getTeleportSession()Lcom/ui/wifiman/model/teleport/session/TeleportSession;", 0)), O.h(new F(q.class, "teleportConnection", "getTeleportConnection()Lcom/ui/wifiman/model/teleport/TeleportConnection;", 0)), O.h(new F(q.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(q.class, "toastService", "getToastService()Lcom/ui/wifiman/domain/toast/ToastService;", 0)), O.g(new D(q.class, "stream", "<v#0>", 0))};

    /* renamed from: m, reason: collision with root package name */
    public static final int f7805m = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f7806g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f7807h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f7808i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f7809j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f7810k;

    public static final class a implements C {
        public a() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(q.this.n0());
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class b implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f7813a = new a();

            /* renamed from: H8.q$b$a$a, reason: collision with other inner class name */
            public static final class C0323a implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Throwable f7814a;

                public C0323a(Throwable th2) {
                    this.f7814a = th2;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        Z7.b.j("Failed to connect Teleport in VPN Profile Modal", this.f7814a, null, 4, null);
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                if (!(error instanceof TeleportConnection.Error)) {
                    return AbstractC5912b.D(error);
                }
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C0323a(error));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR;
            }
        }

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(L params) {
            AbstractC6492s.i(params, "params");
            return params.a() ? q.this.x0().connect().X(AbstractC5912b.a0(200L, TimeUnit.MILLISECONDS)).O(a.f7813a) : AbstractC5912b.m();
        }
    }

    static final class c implements kg.n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(TeleportSession.a permissionState) {
            AbstractC6492s.i(permissionState, "permissionState");
            return permissionState.a() ? AbstractC5912b.p(q.this.w0(), q.this.A0().a(InterfaceC6084a.b.n.f48939a)) : AbstractC5912b.m();
        }
    }

    static final class d implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f7817a;

            /* renamed from: H8.q$d$a$a, reason: collision with other inner class name */
            public static final class C0324a implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ q f7818a;

                public C0324a(q qVar) {
                    this.f7818a = qVar;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        this.f7818a.z0().a(new C5973a(new AbstractC5452a.C1741a(R.string.teleport_vpn_profile_error_other_always_on_enabled, new Object[0]), true));
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            a(q qVar) {
                this.f7817a = qVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                if (!AbstractC6492s.d(error, TeleportSession.Error.VPNProfileCreationCancelledBySystem.f43482a)) {
                    return AbstractC5912b.D(error);
                }
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C0324a(this.f7817a));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR;
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(TeleportSession.a permissionState) {
            AbstractC6492s.i(permissionState, "permissionState");
            return !permissionState.a() ? q.this.y0().b().O(new a(q.this)) : AbstractC5912b.m();
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<TeleportSession> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends org.kodein.type.o<TeleportConnection> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends org.kodein.type.o<InterfaceC5974b> {
    }

    public q(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f7806g = di2;
        org.kodein.type.i iVarE = s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, TeleportSession.class), null);
        th.l[] lVarArr = f7804l;
        this.f7807h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7808i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, TeleportConnection.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7809j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC6084a.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7810k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, InterfaceC5974b.class), null).a(this, lVarArr[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a A0() {
        return (InterfaceC6084a) this.f7809j.getValue();
    }

    private final void B0() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(D0(C8658d.c(c8658d, this, null, new InterfaceC6824a() { // from class: H8.p
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return q.C0(this.f7803a);
            }
        }, 1, null)), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i C0(q qVar) {
        gg.i iVarC0 = qVar.y0().d().L1(qVar.new c()).c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i D0(C8658d.a aVar) {
        return aVar.c(null, f7804l[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b w0() {
        z zVarI = z.i(new a());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bT = zVarI.t(new b());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TeleportConnection x0() {
        return (TeleportConnection) this.f7808i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TeleportSession y0() {
        return (TeleportSession) this.f7807h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5974b z0() {
        return (InterfaceC5974b) this.f7810k.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f7806g;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        B0();
    }

    @Override // com.ui.wifiman.ui.teleport.M
    public void o0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = y0().d().o0().t(new d());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }
}
