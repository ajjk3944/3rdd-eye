package Fd;

import Fd.s;
import Od.a;
import Zc.e;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import com.ui.wifiman.model.ubiquiti.console.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;

/* loaded from: classes4.dex */
public final class t implements s {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ th.l[] f6464j = {O.h(new F(t.class, "ubiquitiCloudStatusService", "getUbiquitiCloudStatusService()Lcom/ui/wifiman/model/ubiquiti/cloud/status/UbiquitiCloudStatus$Service;", 0)), O.h(new F(t.class, "networkConnection", "getNetworkConnection()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;", 0)), O.h(new F(t.class, "teleportConsoles", "getTeleportConsoles()Lcom/ui/wifiman/model/teleport/TeleportConsoleService;", 0)), O.h(new F(t.class, "sessionService", "getSessionService()Lcom/ui/wifiman/model/ubiquiti/UbiquitiSsoAccountSessionService;", 0)), O.h(new F(t.class, "accountManager", "getAccountManager()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final Yg.m f6465a;

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f6466b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f6467c;

    /* renamed from: d, reason: collision with root package name */
    private final Yg.m f6468d;

    /* renamed from: e, reason: collision with root package name */
    private final Yg.m f6469e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f6470f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f6471g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f6472h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f6473i;

    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6474a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Zc.e it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.f() == e.b.CONNECTED);
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6475a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Wc.b bVar) {
            AbstractC6492s.i(bVar, "<destruct>");
            Od.a aVar = (Od.a) bVar.a();
            return Boolean.valueOf((aVar != null ? aVar.b() : null) == null || (aVar.b() instanceof a.b.AbstractC0617a));
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f6476a = new c();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f6477a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(b.a it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it);
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            com.ui.wifiman.model.ubiquiti.console.b bVarD;
            gg.i iVarB;
            gg.i iVarN0;
            AbstractC6492s.i(c6556a, "<destruct>");
            Ld.e eVar = (Ld.e) c6556a.a();
            return (eVar == null || (bVarD = eVar.d()) == null || (iVarB = bVarD.b()) == null || (iVarN0 = iVarB.N0(a.f6477a)) == null) ? gg.i.K0(new C6556a(null)) : iVarN0;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends org.kodein.type.o<a.InterfaceC0616a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<Zc.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends org.kodein.type.o<C> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends org.kodein.type.o<Ld.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends org.kodein.type.o<UiSSOAccountManager> {
    }

    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f6478a = new i();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f6479a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Boolean authenticated) {
                AbstractC6492s.i(authenticated, "authenticated");
                return new C6556a(authenticated);
            }
        }

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            gg.i iVarB;
            gg.i iVarN0;
            gg.i iVarW;
            AbstractC6492s.i(c6556a, "<destruct>");
            com.ui.wifiman.model.ubiquiti.cloud.sso.c cVar = (com.ui.wifiman.model.ubiquiti.cloud.sso.c) c6556a.a();
            return (cVar == null || (iVarB = cVar.b()) == null || (iVarN0 = iVarB.N0(a.f6479a)) == null || (iVarW = iVarN0.W()) == null) ? gg.i.K0(new C6556a(null)) : iVarW;
        }
    }

    static final class j implements kg.i {

        /* renamed from: a, reason: collision with root package name */
        public static final j f6480a = new j();

        j() {
        }

        @Override // kg.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s.a a(Boolean teleportCloudAvailable, Boolean hasNetworkConnection, List consoles, C6556a c6556a, C6556a c6556a2) {
            AbstractC6492s.i(teleportCloudAvailable, "teleportCloudAvailable");
            AbstractC6492s.i(hasNetworkConnection, "hasNetworkConnection");
            AbstractC6492s.i(consoles, "consoles");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            b.a aVar = (b.a) c6556a.a();
            Boolean bool = (Boolean) c6556a2.a();
            if (!consoles.isEmpty()) {
                return new s.a.AbstractC0251a.C0252a(!hasNetworkConnection.booleanValue());
            }
            if (!hasNetworkConnection.booleanValue()) {
                return s.a.c.d.f6463a;
            }
            if (!AbstractC6492s.d(bool, Boolean.TRUE)) {
                return s.a.c.b.f6461a;
            }
            if ((aVar instanceof b.a.c) || (aVar instanceof b.a.C1495a) || (aVar instanceof b.a.C1496b)) {
                return s.a.b.f6459a;
            }
            if ((aVar instanceof b.a.d) || aVar == null) {
                return !teleportCloudAvailable.booleanValue() ? s.a.c.C0253a.f6460a : s.a.c.C0254c.f6462a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public t(DI di2) {
        AbstractC6492s.i(di2, "di");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, a.InterfaceC0616a.class), null);
        th.l[] lVarArr = f6464j;
        this.f6465a = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f6466b = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, Zc.f.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f6467c = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE3, C.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f6468d = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE4, Ld.f.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f6469e = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE5, UiSSOAccountManager.class), null).a(this, lVarArr[4]);
        gg.i iVarW = e().a().N0(b.f6475a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f6470f = iVarW;
        gg.i iVarW2 = b().getState().N0(a.f6474a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f6471g = iVarW2;
        gg.i iVarW3 = c().a().I1(c.f6476a).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f6472h = iVarW3;
        gg.i iVarI2 = gg.i.s(iVarW, iVarW2, d().getAll(), iVarW3, a().c().I1(i.f6478a), j.f6480a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f6473i = iVarI2;
    }

    private final UiSSOAccountManager a() {
        return (UiSSOAccountManager) this.f6469e.getValue();
    }

    private final Zc.f b() {
        return (Zc.f) this.f6466b.getValue();
    }

    private final Ld.f c() {
        return (Ld.f) this.f6468d.getValue();
    }

    private final C d() {
        return (C) this.f6467c.getValue();
    }

    private final a.InterfaceC0616a e() {
        return (a.InterfaceC0616a) this.f6465a.getValue();
    }

    @Override // Fd.s
    public gg.i getState() {
        return this.f6473i;
    }
}
