package G8;

import Ii.AbstractC3063k;
import Ii.C3048c0;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Li.N;
import Li.P;
import Li.y;
import Li.z;
import Pe.b;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import Yg.m;
import Yg.v;
import Zg.AbstractC3689v;
import androidx.lifecycle.AbstractC4013k;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import com.ui.wifiman.model.ubiquiti.cloud.sso.b;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import i8.InterfaceC6084a;
import java.net.URI;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import org.snmp4j.mp.PduHandle;
import pf.AbstractC7319b;
import q9.C7441g;
import q9.EnumC7442h;
import rj.InterfaceC7810x2;
import s9.b;
import s9.c;
import s9.d;
import th.l;
import ye.AbstractC8661g;
import ye.C8656b;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class b extends AbstractC7319b {

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ l[] f7104q = {O.h(new F(b.class, "accountManager", "getAccountManager()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;", 0)), O.h(new F(b.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(b.class, "ssoAccounts", "getSsoAccounts()Lkotlinx/coroutines/flow/Flow;", 0))};

    /* renamed from: g, reason: collision with root package name */
    private final DI f7105g;

    /* renamed from: h, reason: collision with root package name */
    private final m f7106h;

    /* renamed from: i, reason: collision with root package name */
    private final m f7107i;

    /* renamed from: j, reason: collision with root package name */
    private final y f7108j;

    /* renamed from: k, reason: collision with root package name */
    private final C8656b.a f7109k;

    /* renamed from: l, reason: collision with root package name */
    private final z f7110l;

    /* renamed from: m, reason: collision with root package name */
    private final z f7111m;

    /* renamed from: n, reason: collision with root package name */
    private final N f7112n;

    /* renamed from: o, reason: collision with root package name */
    private final N f7113o;

    /* renamed from: p, reason: collision with root package name */
    private final z f7114p;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7115a;

        static {
            int[] iArr = new int[EnumC7442h.values().length];
            try {
                iArr[EnumC7442h.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7442h.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7115a = iArr;
        }
    }

    /* renamed from: G8.b$b, reason: collision with other inner class name */
    static final class C0279b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        int f7116a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7117b;

        /* renamed from: d, reason: collision with root package name */
        int f7119d;

        C0279b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7117b = obj;
            this.f7119d |= PduHandle.NONE;
            return b.this.u0(0, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ l[] f7120e = {O.g(new D(b.class, "session", "<v#0>", 0))};

        /* renamed from: a, reason: collision with root package name */
        Object f7121a;

        /* renamed from: b, reason: collision with root package name */
        int f7122b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C7441g f7124d;

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/x4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends o<b.a> {
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/y4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: G8.b$c$b, reason: collision with other inner class name */
        public static final class C0280b extends o<com.ui.wifiman.model.ubiquiti.cloud.sso.c> {
        }

        /* renamed from: G8.b$c$c, reason: collision with other inner class name */
        public static final class C0281c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f7125a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0281c(Object obj) {
                super(0);
                this.f7125a = obj;
            }

            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return this.f7125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C7441g c7441g, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f7124d = c7441g;
        }

        private static final com.ui.wifiman.model.ubiquiti.cloud.sso.c o(m mVar) {
            return (com.ui.wifiman.model.ubiquiti.cloud.sso.c) mVar.getValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new c(this.f7124d, interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x013d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 321
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: G8.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f7126a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC7319b.a.C2037a f7128c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC7319b.a.C2037a c2037a, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f7128c = c2037a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new d(this.f7128c, interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r7.f7126a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L13
                Yg.v.b(r8)
                goto L93
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                Yg.v.b(r8)
                goto L32
            L20:
                Yg.v.b(r8)
                G8.b r8 = G8.b.this
                Li.g r8 = G8.b.r0(r8)
                r7.f7126a = r3
                java.lang.Object r8 = Li.AbstractC3222i.z(r8, r7)
                if (r8 != r0) goto L32
                return r0
            L32:
                java.util.List r8 = (java.util.List) r8
                r1 = 0
                if (r8 == 0) goto L73
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                pf.b$a$a r3 = r7.f7128c
                java.util.Iterator r8 = r8.iterator()
            L3f:
                boolean r4 = r8.hasNext()
                if (r4 == 0) goto L5b
                java.lang.Object r4 = r8.next()
                r5 = r4
                com.ui.wifiman.model.ubiquiti.cloud.sso.b r5 = (com.ui.wifiman.model.ubiquiti.cloud.sso.b) r5
                java.util.UUID r5 = r5.e()
                int r5 = com.ui.wifiman.model.ubiquiti.cloud.sso.b.a.e(r5)
                int r6 = r3.a()
                if (r5 != r6) goto L3f
                goto L5c
            L5b:
                r4 = r1
            L5c:
                com.ui.wifiman.model.ubiquiti.cloud.sso.b r4 = (com.ui.wifiman.model.ubiquiti.cloud.sso.b) r4
                if (r4 == 0) goto L73
                G8.b r8 = G8.b.this
                com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager r8 = G8.b.q0(r8)
                gg.b r8 = r8.d(r4)
                r7.f7126a = r2
                java.lang.Object r8 = Qi.b.b(r8, r7)
                if (r8 != r0) goto L93
                return r0
            L73:
                pf.b$a$a r8 = r7.f7128c
                int r8 = r8.a()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Account "
                r0.append(r2)
                r0.append(r8)
                java.lang.String r8 = " not found. Can't delete."
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                r0 = 6
                Z7.b.j(r8, r1, r1, r0, r1)
            L93:
                Yg.J r8 = Yg.J.f24997a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: G8.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f7129a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7441g f7131c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C7441g c7441g, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f7131c = c7441g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new e(this.f7131c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f7129a;
            if (i10 == 0) {
                v.b(obj);
                b bVar = b.this;
                int iD = this.f7131c.d();
                this.f7129a = 1;
                obj = bVar.u0(iD, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar2 = (com.ui.wifiman.model.ubiquiti.cloud.sso.b) obj;
            if (bVar2 != null) {
                b.this.b().j(new AbstractC7319b.a.C2037a(bVar2.k(), b.a.e(bVar2.e())));
            } else {
                Z7.b.j("Account " + this.f7131c.d() + " not found. Can't delete.", null, null, 6, null);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends o<UiSSOAccountManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends o<InterfaceC6084a> {
    }

    public static final class h implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f7132a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f7133b;

        public static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f7134a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f7135b;

            /* renamed from: G8.b$h$a$a, reason: collision with other inner class name */
            public static final class C0282a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f7136a;

                /* renamed from: b, reason: collision with root package name */
                int f7137b;

                public C0282a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7136a = obj;
                    this.f7137b |= PduHandle.NONE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC3221h interfaceC3221h, b bVar) {
                this.f7134a = interfaceC3221h;
                this.f7135b = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r7, dh.InterfaceC5380e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof G8.b.h.a.C0282a
                    if (r0 == 0) goto L13
                    r0 = r8
                    G8.b$h$a$a r0 = (G8.b.h.a.C0282a) r0
                    int r1 = r0.f7137b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f7137b = r1
                    goto L18
                L13:
                    G8.b$h$a$a r0 = new G8.b$h$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f7136a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f7137b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r8)
                    goto L6c
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L32:
                    Yg.v.b(r8)
                    Li.h r8 = r6.f7134a
                    java.util.List r7 = (java.util.List) r7
                    kotlin.jvm.internal.AbstractC6492s.f(r7)
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = Zg.AbstractC3689v.w(r7, r4)
                    r2.<init>(r4)
                    java.util.Iterator r7 = r7.iterator()
                L4d:
                    boolean r4 = r7.hasNext()
                    if (r4 == 0) goto L63
                    java.lang.Object r4 = r7.next()
                    com.ui.wifiman.model.ubiquiti.cloud.sso.b r4 = (com.ui.wifiman.model.ubiquiti.cloud.sso.b) r4
                    G8.b r5 = r6.f7135b
                    q9.g r4 = G8.b.t0(r5, r4)
                    r2.add(r4)
                    goto L4d
                L63:
                    r0.f7137b = r3
                    java.lang.Object r7 = r8.a(r2, r0)
                    if (r7 != r1) goto L6c
                    return r1
                L6c:
                    Yg.J r7 = Yg.J.f24997a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: G8.b.h.a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public h(InterfaceC3220g interfaceC3220g, b bVar) {
            this.f7132a = interfaceC3220g;
            this.f7133b = bVar;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f7132a.b(new a(interfaceC3221h, this.f7133b), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    public static final class i implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f7139a;

        public static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f7140a;

            /* renamed from: G8.b$i$a$a, reason: collision with other inner class name */
            public static final class C0283a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f7141a;

                /* renamed from: b, reason: collision with root package name */
                int f7142b;

                public C0283a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7141a = obj;
                    this.f7142b |= PduHandle.NONE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC3221h interfaceC3221h) {
                this.f7140a = interfaceC3221h;
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
                    boolean r0 = r6 instanceof G8.b.i.a.C0283a
                    if (r0 == 0) goto L13
                    r0 = r6
                    G8.b$i$a$a r0 = (G8.b.i.a.C0283a) r0
                    int r1 = r0.f7142b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f7142b = r1
                    goto L18
                L13:
                    G8.b$i$a$a r0 = new G8.b$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f7141a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f7142b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L66
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L32:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f7140a
                    q9.h r5 = (q9.EnumC7442h) r5
                    int[] r2 = G8.b.a.f7115a
                    int r5 = r5.ordinal()
                    r5 = r2[r5]
                    if (r5 == r3) goto L55
                    r2 = 2
                    if (r5 != r2) goto L4f
                    s9.d$b r5 = new s9.d$b
                    r2 = 2131820580(0x7f110024, float:1.9273879E38)
                    r5.<init>(r2)
                    goto L5d
                L4f:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                L55:
                    s9.d$b r5 = new s9.d$b
                    r2 = 2131820581(0x7f110025, float:1.927388E38)
                    r5.<init>(r2)
                L5d:
                    r0.f7142b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L66
                    return r1
                L66:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: G8.b.i.a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public i(InterfaceC3220g interfaceC3220g) {
            this.f7139a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f7139a.b(new a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    static final class j implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final j f7144a = new j();

        j() {
        }

        public final long a(InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(1131342185);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1131342185, i10, -1, "com.ubnt.usurvey.ui.sso.SSOAccountPickerVM.toViewModel.<anonymous> (SSOAccountPickerVM.kt:62)");
            }
            long jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return jF;
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C6733v0.g(a((InterfaceC3540l) obj, ((Number) obj2).intValue()));
        }
    }

    public b(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f7105g = di2;
        org.kodein.type.i iVarE = s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, UiSSOAccountManager.class), null);
        l[] lVarArr = f7104q;
        this.f7106h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7107i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        this.f7108j = Li.F.b(0, 1, Ki.a.DROP_OLDEST, 1, null);
        this.f7109k = C8656b.f66710a.b(this, AbstractC4013k.b.STARTED, new InterfaceC6824a() { // from class: G8.a
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return b.C0(this.f7103a);
            }
        });
        this.f7110l = P.a(new d.b(R.string.settings_account_picker_title));
        this.f7111m = P.a(EnumC7442h.DEFAULT);
        this.f7112n = AbstractC8661g.c0(this, new h(z0(), this), AbstractC3689v.l(), false, null, 6, null);
        this.f7113o = AbstractC8661g.c0(this, new i(C()), new d.c(""), false, null, 6, null);
        this.f7114p = P.a(new d.b(R.string.settings_account_picker_add_account));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a B0() {
        return (InterfaceC6084a) this.f7107i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3220g C0(b bVar) {
        return Pi.e.a(bVar.v0().a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7441g D0(com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar) {
        URI uriA;
        int iE = b.a.e(bVar.e());
        String strB = bVar.b();
        s9.c cVarA = (strB == null || (uriA = L8.j.f11266a.a(strB)) == null) ? b.a.f18640a.a() : new c.b(uriA, null, null, null, 14, null);
        c.a aVarA = b.a.f18640a.a();
        String strG = bVar.g();
        return new C7441g(iE, cVarA, aVarA, strG != null ? new d.c(strG) : null, new d.c(bVar.c()), bVar.m() ? N9.b.f16117a.p().f(new b.C2145b("blue", j.f7144a)) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u0(int r5, dh.InterfaceC5380e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof G8.b.C0279b
            if (r0 == 0) goto L13
            r0 = r6
            G8.b$b r0 = (G8.b.C0279b) r0
            int r1 = r0.f7119d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7119d = r1
            goto L18
        L13:
            G8.b$b r0 = new G8.b$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7117b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f7119d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2b
            int r5 = r0.f7116a
            Yg.v.b(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            Yg.v.b(r6)
            Li.g r6 = r4.z0()
            r0.f7116a = r5
            r0.f7119d = r3
            java.lang.Object r6 = Li.AbstractC3222i.z(r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            java.util.List r6 = (java.util.List) r6
            r0 = 0
            if (r6 == 0) goto L6b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L51:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r6.next()
            r2 = r1
            com.ui.wifiman.model.ubiquiti.cloud.sso.b r2 = (com.ui.wifiman.model.ubiquiti.cloud.sso.b) r2
            java.util.UUID r2 = r2.e()
            int r2 = com.ui.wifiman.model.ubiquiti.cloud.sso.b.a.e(r2)
            if (r2 != r5) goto L51
            r0 = r1
        L69:
            com.ui.wifiman.model.ubiquiti.cloud.sso.b r0 = (com.ui.wifiman.model.ubiquiti.cloud.sso.b) r0
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G8.b.u0(int, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiSSOAccountManager v0() {
        return (UiSSOAccountManager) this.f7106h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3220g z0() {
        return this.f7109k.c(this, f7104q[2]);
    }

    @Override // q9.InterfaceC7443i
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public z getTitle() {
        return this.f7110l;
    }

    @Override // q9.InterfaceC7443i
    public N a() {
        return this.f7112n;
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f7105g;
    }

    @Override // q9.InterfaceC7443i
    public Object f(C7441g c7441g, InterfaceC5380e interfaceC5380e) {
        AbstractC3063k.d(androidx.lifecycle.O.a(this), C3048c0.a(), null, new e(c7441g, null), 2, null);
        return J.f24997a;
    }

    @Override // pf.AbstractC7319b
    public void n0(AbstractC7319b.a.C2037a event) {
        AbstractC6492s.i(event, "event");
        AbstractC3063k.d(androidx.lifecycle.O.a(this), C3048c0.a(), null, new d(event, null), 2, null);
    }

    @Override // q9.InterfaceC7443i
    public Object o(InterfaceC5380e interfaceC5380e) {
        C8658d.f66727a.d(B0().a(new InterfaceC6084a.b.t(null, 1, null)), this);
        return J.f24997a;
    }

    @Override // q9.InterfaceC7443i
    public Object s(C7441g c7441g, InterfaceC5380e interfaceC5380e) {
        AbstractC3063k.d(androidx.lifecycle.O.a(this), C3048c0.a(), null, new c(c7441g, null), 2, null);
        return J.f24997a;
    }

    @Override // q9.InterfaceC7443i
    public Object u(InterfaceC5380e interfaceC5380e) {
        EnumC7442h enumC7442h;
        z zVarC = C();
        int i10 = a.f7115a[((EnumC7442h) C().getValue()).ordinal()];
        if (i10 == 1) {
            enumC7442h = EnumC7442h.EDIT;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC7442h = EnumC7442h.DEFAULT;
        }
        zVarC.setValue(enumC7442h);
        return J.f24997a;
    }

    @Override // q9.InterfaceC7443i
    public N w() {
        return this.f7113o;
    }

    @Override // q9.InterfaceC7443i
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public z x() {
        return this.f7114p;
    }

    @Override // pf.AbstractC7319b
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public y b() {
        return this.f7108j;
    }

    @Override // q9.InterfaceC7443i
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public z C() {
        return this.f7111m;
    }
}
