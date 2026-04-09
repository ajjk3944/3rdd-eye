package H8;

import Fd.C;
import Id.a;
import Li.N;
import Od.a;
import Yg.s;
import Yg.z;
import Zc.e;
import com.ui.wifiman.model.ubiquiti.console.e;
import com.ui.wifiman.ui.teleport.consoles.v;
import com.ui.wifiman.ui.teleport.consoles.w;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import i8.InterfaceC6084a;
import java.util.Iterator;
import java.util.List;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.AbstractC6561f;
import l9.C6556a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.d;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class i extends w {

    /* renamed from: s, reason: collision with root package name */
    static final /* synthetic */ th.l[] f7697s = {O.h(new F(i.class, "teleportConsoleService", "getTeleportConsoleService()Lcom/ui/wifiman/model/teleport/TeleportConsoleService;", 0)), O.h(new F(i.class, "teleportManager", "getTeleportManager()Lcom/ui/wifiman/model/teleport/TeleportManager;", 0)), O.h(new F(i.class, "cloudStatusService", "getCloudStatusService()Lcom/ui/wifiman/model/ubiquiti/cloud/status/UbiquitiCloudStatus$Service;", 0)), O.h(new F(i.class, "networkConnection", "getNetworkConnection()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;", 0)), O.h(new F(i.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.g(new D(i.class, "consoleBecameAvailable", "<v#0>", 0))};

    /* renamed from: t, reason: collision with root package name */
    public static final int f7698t = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f7699g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f7700h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f7701i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f7702j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f7703k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f7704l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f7705m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f7706n;

    /* renamed from: o, reason: collision with root package name */
    private final gg.i f7707o;

    /* renamed from: p, reason: collision with root package name */
    private final gg.i f7708p;

    /* renamed from: q, reason: collision with root package name */
    private final N f7709q;

    /* renamed from: r, reason: collision with root package name */
    private final N f7710r;

    static final class a implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7711a = new a();

        a() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(v vVar, List teleports) {
            Object next;
            AbstractC6492s.i(vVar, "<destruct>");
            AbstractC6492s.i(teleports, "teleports");
            String strD = e.b.d(vVar.a());
            Iterator it = teleports.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (e.b.h(((com.ui.wifiman.model.teleport.h) next).j(), strD)) {
                    break;
                }
            }
            return new C6556a(next);
        }
    }

    static final class b implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7712a = new b();

        b() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s a(com.ui.wifiman.model.teleport.h console, Wc.b bVar, Boolean isNetworkConnected) {
            AbstractC6492s.i(console, "console");
            AbstractC6492s.i(bVar, "<destruct>");
            AbstractC6492s.i(isNetworkConnected, "isNetworkConnected");
            return z.a(console, Id.b.a(console, isNetworkConnected.booleanValue(), (Od.a) bVar.a()));
        }
    }

    static final class c implements kg.n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Object objA = sVar.a();
            AbstractC6492s.h(objA, "component1(...)");
            return AbstractC5912b.p(i.this.A0().b(((com.ui.wifiman.model.teleport.h) objA).j()), i.this.B0().a(InterfaceC6084a.b.n.f48939a));
        }
    }

    static final class d implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final d f7714a = new d();

        d() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Id.a aVar = (Id.a) sVar.c();
            if (aVar instanceof a.C0370a) {
                return true;
            }
            if ((aVar instanceof a.c) || (aVar instanceof a.b)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f7715a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Zc.e it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.f() == e.b.CONNECTED);
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f7716a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s9.d apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Id.a aVar = (Id.a) sVar.c();
            if ((aVar instanceof a.C0370a) || (aVar instanceof a.b)) {
                return new d.c("");
            }
            if (aVar instanceof a.c) {
                return o.a((a.c) aVar);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class g implements gg.k {
        public g() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(i.this.o0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends org.kodein.type.o<C> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: H8.i$i, reason: collision with other inner class name */
    public static final class C0313i extends org.kodein.type.o<Fd.D> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends org.kodein.type.o<a.InterfaceC0616a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends org.kodein.type.o<Zc.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class l extends org.kodein.type.o<InterfaceC6084a> {
    }

    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f7718a = new m();

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s9.d apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Id.a aVar = (Id.a) sVar.c();
            if ((aVar instanceof a.C0370a) || (aVar instanceof a.b)) {
                return new d.c("");
            }
            if (aVar instanceof a.c) {
                return o.b((a.c) aVar);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public i(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f7699g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, C.class), null);
        th.l[] lVarArr = f7697s;
        this.f7700h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new C0313i().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7701i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, Fd.D.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7702j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, a.InterfaceC0616a.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new k().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7703k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, Zc.f.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new l().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7704l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, InterfaceC6084a.class), null).a(this, lVarArr[4]);
        gg.i iVarI2 = gg.i.N(new g(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f7705m = iVarI2;
        gg.i iVarW = gg.i.v(iVarI2, z0().getAll(), a.f7711a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        gg.i iVarI22 = AbstractC6561f.e(n9.c.c(iVarW, new InterfaceC6835l() { // from class: H8.f
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.v0(this.f7694a, (C6556a) obj);
            }
        })).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f7706n = iVarI22;
        gg.i iVarW2 = y0().getState().N0(e.f7715a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f7707o = iVarW2;
        gg.i iVarW3 = gg.i.u(iVarI22, x0().a(), iVarW2, b.f7712a).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        gg.i iVarI23 = n9.c.c(iVarW3, new InterfaceC6835l() { // from class: H8.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.w0(this.f7695a, (s) obj);
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f7708p = iVarI23;
        gg.i iVarW4 = iVarI23.N0(m.f7718a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f7709q = AbstractC8661g.d0(this, iVarW4, new d.c(""), false, null, 6, null);
        gg.i iVarW5 = iVarI23.N0(f.f7716a).W();
        AbstractC6492s.h(iVarW5, "distinctUntilChanged(...)");
        this.f7710r = AbstractC8661g.d0(this, iVarW5, new d.c(""), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Fd.D A0() {
        return (Fd.D) this.f7701i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a B0() {
        return (InterfaceC6084a) this.f7704l.getValue();
    }

    private final void C0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = E0(C8658d.c(c8658d, this, null, new InterfaceC6824a() { // from class: H8.h
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return i.D0(this.f7696a);
            }
        }, 1, null)).o0().t(new c());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i D0(i iVar) {
        gg.i iVarM0 = iVar.f7708p.m0(d.f7714a);
        AbstractC6492s.h(iVarM0, "filter(...)");
        return iVarM0;
    }

    private static final gg.i E0(C8658d.a aVar) {
        return aVar.c(null, f7697s[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5912b v0(i iVar, C6556a c6556a) {
        AbstractC6492s.i(c6556a, "<destruct>");
        if (((com.ui.wifiman.model.teleport.h) c6556a.a()) == null) {
            return iVar.B0().a(InterfaceC6084a.b.n.f48939a);
        }
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.f(abstractC5912bM);
        return abstractC5912bM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5912b w0(i iVar, s sVar) {
        AbstractC6492s.i(sVar, "<destruct>");
        Object objA = sVar.a();
        AbstractC6492s.h(objA, "component1(...)");
        com.ui.wifiman.model.teleport.h hVar = (com.ui.wifiman.model.teleport.h) objA;
        Id.a aVar = (Id.a) sVar.c();
        if (aVar instanceof a.C0370a) {
            AbstractC5912b abstractC5912bP = AbstractC5912b.p(iVar.A0().b(hVar.j()), iVar.B0().a(InterfaceC6084a.b.n.f48939a));
            AbstractC6492s.h(abstractC5912bP, "concatArray(...)");
            return abstractC5912bP;
        }
        if (!(aVar instanceof a.c) && !(aVar instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.h(abstractC5912bM, "complete(...)");
        return abstractC5912bM;
    }

    private final a.InterfaceC0616a x0() {
        return (a.InterfaceC0616a) this.f7702j.getValue();
    }

    private final Zc.f y0() {
        return (Zc.f) this.f7703k.getValue();
    }

    private final C z0() {
        return (C) this.f7700h.getValue();
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f7699g;
    }

    @Override // com.ui.wifiman.ui.teleport.consoles.w
    public N getTitle() {
        return this.f7709q;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        super.l0();
        C0();
    }

    @Override // com.ui.wifiman.ui.teleport.consoles.w
    public N n0() {
        return this.f7710r;
    }
}
