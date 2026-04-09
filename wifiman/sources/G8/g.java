package G8;

import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Li.N;
import Yg.J;
import Yg.m;
import Yg.v;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import i8.InterfaceC6084a;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import mh.InterfaceC6824a;
import mh.r;
import of.C7125a;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import org.snmp4j.mp.PduHandle;
import rj.InterfaceC7810x2;
import s9.c;
import th.l;
import ye.AbstractC8661g;
import ye.C8656b;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class g extends C7125a.c {

    /* renamed from: r, reason: collision with root package name */
    static final /* synthetic */ l[] f7157r = {O.h(new F(g.class, "accountManager", "getAccountManager()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;", 0)), O.h(new F(g.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(g.class, "primaryAccount", "getPrimaryAccount()Lkotlinx/coroutines/flow/Flow;", 0)), O.h(new F(g.class, "isPrimarySessionAuthenticated", "isPrimarySessionAuthenticated()Lkotlinx/coroutines/flow/Flow;", 0)), O.h(new F(g.class, "isAccountManagerAvailable", "isAccountManagerAvailable()Lkotlinx/coroutines/flow/Flow;", 0))};

    /* renamed from: s, reason: collision with root package name */
    public static final int f7158s = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f7159g;

    /* renamed from: h, reason: collision with root package name */
    private final m f7160h;

    /* renamed from: i, reason: collision with root package name */
    private final c.a f7161i;

    /* renamed from: j, reason: collision with root package name */
    private final m f7162j;

    /* renamed from: k, reason: collision with root package name */
    private final C8656b.a f7163k;

    /* renamed from: l, reason: collision with root package name */
    private final C8656b.a f7164l;

    /* renamed from: m, reason: collision with root package name */
    private final C8656b.a f7165m;

    /* renamed from: n, reason: collision with root package name */
    private final N f7166n;

    /* renamed from: o, reason: collision with root package name */
    private final N f7167o;

    /* renamed from: p, reason: collision with root package name */
    private final N f7168p;

    /* renamed from: q, reason: collision with root package name */
    private final N f7169q;

    static final class a extends kotlin.coroutines.jvm.internal.l implements r {

        /* renamed from: a, reason: collision with root package name */
        int f7170a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7171b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f7172c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f7173d;

        a(InterfaceC5380e interfaceC5380e) {
            super(4, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f7170a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return !((Boolean) this.f7173d).booleanValue() ? C7125a.EnumC2013a.ERROR : ((com.ui.wifiman.model.ubiquiti.cloud.sso.b) this.f7171b) == null ? C7125a.EnumC2013a.NO_ACCOUNT : !((Boolean) this.f7172c).booleanValue() ? C7125a.EnumC2013a.UNAUTHENTICATED : C7125a.EnumC2013a.LOGGED_IN;
        }

        @Override // mh.r
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object y(com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar, Boolean bool, Boolean bool2, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(interfaceC5380e);
            aVar.f7171b = bVar;
            aVar.f7172c = bool;
            aVar.f7173d = bool2;
            return aVar.invokeSuspend(J.f24997a);
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7174a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(UiSSOAccountManager.a state) {
            boolean z10;
            AbstractC6492s.i(state, "state");
            if (state instanceof UiSSOAccountManager.a.C1480a) {
                z10 = true;
            } else {
                if (!(state instanceof UiSSOAccountManager.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7175a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            gg.i iVarB;
            AbstractC6492s.i(c6556a, "<destruct>");
            com.ui.wifiman.model.ubiquiti.cloud.sso.c cVar = (com.ui.wifiman.model.ubiquiti.cloud.sso.c) c6556a.a();
            return (cVar == null || (iVarB = cVar.b()) == null) ? gg.i.K0(Boolean.FALSE) : iVarB;
        }
    }

    public static final class d implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f7176a;

        public static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f7177a;

            /* renamed from: G8.g$d$a$a, reason: collision with other inner class name */
            public static final class C0286a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f7178a;

                /* renamed from: b, reason: collision with root package name */
                int f7179b;

                public C0286a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7178a = obj;
                    this.f7179b |= PduHandle.NONE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC3221h interfaceC3221h) {
                this.f7177a = interfaceC3221h;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof G8.g.d.a.C0286a
                    if (r0 == 0) goto L13
                    r0 = r6
                    G8.g$d$a$a r0 = (G8.g.d.a.C0286a) r0
                    int r1 = r0.f7179b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f7179b = r1
                    goto L18
                L13:
                    G8.g$d$a$a r0 = new G8.g$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f7178a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f7179b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L46
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L32:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f7177a
                    l9.a r5 = (l9.C6556a) r5
                    java.lang.Object r5 = r5.b()
                    r0.f7179b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: G8.g.d.a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public d(InterfaceC3220g interfaceC3220g) {
            this.f7176a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f7176a.b(new a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends o<UiSSOAccountManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends o<InterfaceC6084a> {
    }

    /* renamed from: G8.g$g, reason: collision with other inner class name */
    public static final class C0287g implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f7181a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f7182b;

        /* renamed from: G8.g$g$a */
        public static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f7183a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f7184b;

            /* renamed from: G8.g$g$a$a, reason: collision with other inner class name */
            public static final class C0288a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f7185a;

                /* renamed from: b, reason: collision with root package name */
                int f7186b;

                public C0288a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7185a = obj;
                    this.f7186b |= PduHandle.NONE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC3221h interfaceC3221h, g gVar) {
                this.f7183a = interfaceC3221h;
                this.f7184b = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r12, dh.InterfaceC5380e r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof G8.g.C0287g.a.C0288a
                    if (r0 == 0) goto L13
                    r0 = r13
                    G8.g$g$a$a r0 = (G8.g.C0287g.a.C0288a) r0
                    int r1 = r0.f7186b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f7186b = r1
                    goto L18
                L13:
                    G8.g$g$a$a r0 = new G8.g$g$a$a
                    r0.<init>(r13)
                L18:
                    java.lang.Object r13 = r0.f7185a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f7186b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r13)
                    goto L65
                L29:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L32:
                    Yg.v.b(r13)
                    Li.h r13 = r11.f7183a
                    com.ui.wifiman.model.ubiquiti.cloud.sso.b r12 = (com.ui.wifiman.model.ubiquiti.cloud.sso.b) r12
                    if (r12 == 0) goto L56
                    java.lang.String r12 = r12.b()
                    if (r12 == 0) goto L56
                    L8.j r2 = L8.j.f11266a
                    java.net.URI r5 = r2.a(r12)
                    if (r5 == 0) goto L56
                    s9.c$b r12 = new s9.c$b
                    r9 = 14
                    r10 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r4 = r12
                    r4.<init>(r5, r6, r7, r8, r9, r10)
                    goto L5c
                L56:
                    G8.g r12 = r11.f7184b
                    s9.c$a r12 = G8.g.v0(r12)
                L5c:
                    r0.f7186b = r3
                    java.lang.Object r12 = r13.a(r12, r0)
                    if (r12 != r1) goto L65
                    return r1
                L65:
                    Yg.J r12 = Yg.J.f24997a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: G8.g.C0287g.a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public C0287g(InterfaceC3220g interfaceC3220g, g gVar) {
            this.f7181a = interfaceC3220g;
            this.f7182b = gVar;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f7181a.b(new a(interfaceC3221h, this.f7182b), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    public static final class h implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f7188a;

        public static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f7189a;

            /* renamed from: G8.g$h$a$a, reason: collision with other inner class name */
            public static final class C0289a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f7190a;

                /* renamed from: b, reason: collision with root package name */
                int f7191b;

                public C0289a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7190a = obj;
                    this.f7191b |= PduHandle.NONE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC3221h interfaceC3221h) {
                this.f7189a = interfaceC3221h;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof G8.g.h.a.C0289a
                    if (r0 == 0) goto L13
                    r0 = r6
                    G8.g$h$a$a r0 = (G8.g.h.a.C0289a) r0
                    int r1 = r0.f7191b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f7191b = r1
                    goto L18
                L13:
                    G8.g$h$a$a r0 = new G8.g$h$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f7190a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f7191b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L51
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L32:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f7189a
                    com.ui.wifiman.model.ubiquiti.cloud.sso.b r5 = (com.ui.wifiman.model.ubiquiti.cloud.sso.b) r5
                    if (r5 == 0) goto L47
                    java.lang.String r5 = r5.g()
                    if (r5 == 0) goto L47
                    s9.d$c r2 = new s9.d$c
                    r2.<init>(r5)
                    goto L48
                L47:
                    r2 = 0
                L48:
                    r0.f7191b = r3
                    java.lang.Object r5 = r6.a(r2, r0)
                    if (r5 != r1) goto L51
                    return r1
                L51:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: G8.g.h.a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public h(InterfaceC3220g interfaceC3220g) {
            this.f7188a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f7188a.b(new a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    public static final class i implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f7193a;

        public static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f7194a;

            /* renamed from: G8.g$i$a$a, reason: collision with other inner class name */
            public static final class C0290a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f7195a;

                /* renamed from: b, reason: collision with root package name */
                int f7196b;

                public C0290a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7195a = obj;
                    this.f7196b |= PduHandle.NONE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC3221h interfaceC3221h) {
                this.f7194a = interfaceC3221h;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof G8.g.i.a.C0290a
                    if (r0 == 0) goto L13
                    r0 = r6
                    G8.g$i$a$a r0 = (G8.g.i.a.C0290a) r0
                    int r1 = r0.f7196b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f7196b = r1
                    goto L18
                L13:
                    G8.g$i$a$a r0 = new G8.g$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f7195a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f7196b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L51
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L32:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f7194a
                    com.ui.wifiman.model.ubiquiti.cloud.sso.b r5 = (com.ui.wifiman.model.ubiquiti.cloud.sso.b) r5
                    if (r5 == 0) goto L47
                    java.lang.String r5 = r5.c()
                    if (r5 == 0) goto L47
                    s9.d$c r2 = new s9.d$c
                    r2.<init>(r5)
                    goto L48
                L47:
                    r2 = 0
                L48:
                    r0.f7196b = r3
                    java.lang.Object r5 = r6.a(r2, r0)
                    if (r5 != r1) goto L51
                    return r1
                L51:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: G8.g.i.a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public i(InterfaceC3220g interfaceC3220g) {
            this.f7193a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f7193a.b(new a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    public g(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f7159g = di2;
        org.kodein.type.i iVarE = s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, UiSSOAccountManager.class), null);
        l[] lVarArr = f7157r;
        this.f7160h = interfaceC7810x2A.a(this, lVarArr[0]);
        c.a aVar = new c.a(2131166199, null, 2, null);
        this.f7161i = aVar;
        org.kodein.type.i iVarE2 = s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7162j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        C8656b c8656b = C8656b.f66710a;
        this.f7163k = C8656b.c(c8656b, this, null, new InterfaceC6824a() { // from class: G8.d
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return g.D0(this.f7154a);
            }
        }, 1, null);
        this.f7164l = C8656b.c(c8656b, this, null, new InterfaceC6824a() { // from class: G8.e
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return g.C0(this.f7155a);
            }
        }, 1, null);
        this.f7165m = C8656b.c(c8656b, this, null, new InterfaceC6824a() { // from class: G8.f
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return g.A0(this.f7156a);
            }
        }, 1, null);
        this.f7166n = AbstractC8661g.c0(this, new C0287g(x0(), this), aVar, false, null, 6, null);
        this.f7167o = AbstractC8661g.c0(this, AbstractC3222i.k(x0(), B0(), z0(), new a(null)), C7125a.EnumC2013a.IN_PROGRESS, false, null, 6, null);
        this.f7168p = AbstractC8661g.c0(this, new h(x0()), null, false, null, 6, null);
        this.f7169q = AbstractC8661g.c0(this, new i(x0()), null, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3220g A0(g gVar) {
        gg.i iVarW = gVar.w0().getState().N0(b.f7174a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        return Pi.e.a(iVarW);
    }

    private final InterfaceC3220g B0() {
        return this.f7164l.c(this, f7157r[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3220g C0(g gVar) {
        gg.i iVarW = gVar.w0().c().I1(c.f7175a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        return Pi.e.a(iVarW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3220g D0(g gVar) {
        return new d(Pi.e.a(gVar.w0().e()));
    }

    private final UiSSOAccountManager w0() {
        return (UiSSOAccountManager) this.f7160h.getValue();
    }

    private final InterfaceC3220g x0() {
        return this.f7163k.c(this, f7157r[2]);
    }

    private final InterfaceC6084a y0() {
        return (InterfaceC6084a) this.f7162j.getValue();
    }

    private final InterfaceC3220g z0() {
        return this.f7165m.c(this, f7157r[4]);
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f7159g;
    }

    @Override // of.C7125a.c
    public N n0() {
        return this.f7167o;
    }

    @Override // of.C7125a.c
    public N o0() {
        return this.f7166n;
    }

    @Override // of.C7125a.c
    public N p0() {
        return this.f7169q;
    }

    @Override // of.C7125a.c
    public N q0() {
        return this.f7168p;
    }

    @Override // of.C7125a.c
    public void r0() {
        C8658d.f66727a.d(y0().a(InterfaceC6084a.b.w.f48950a), this);
    }
}
