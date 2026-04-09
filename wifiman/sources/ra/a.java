package Ra;

import Ii.N;
import Ki.r;
import Ki.t;
import Li.AbstractC3222i;
import Li.D;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Li.J;
import Yg.J;
import Yg.v;
import com.ui.sso.account.UIAccountManager;
import com.ui.sso.api.UiAccountApi;
import com.ui.sso.auth.UiAuthSerializer;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
public final class a implements UiAccountApi {

    /* renamed from: a, reason: collision with root package name */
    private final UiAccountApi.c f19611a;

    /* renamed from: b, reason: collision with root package name */
    private final UiAccountApi.d f19612b;

    /* renamed from: c, reason: collision with root package name */
    private final UIAccountManager f19613c;

    /* renamed from: d, reason: collision with root package name */
    private final Ta.d f19614d;

    /* renamed from: e, reason: collision with root package name */
    private final UiAuthSerializer f19615e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3220g f19616f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3220g f19617g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3220g f19618h;

    /* renamed from: Ra.a$a, reason: collision with other inner class name */
    static final class C0690a extends AbstractC6494u implements InterfaceC6824a {
        C0690a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UiAccountApiAccMgrDirect[" + a.this.hashCode() + "] initialized";
        }
    }

    private static abstract class b {

        /* renamed from: Ra.a$b$a, reason: collision with other inner class name */
        public static final class C0691a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0691a f19620a = new C0691a();

            private C0691a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0691a);
            }

            public int hashCode() {
                return -660501640;
            }

            public String toString() {
                return "Accounts";
            }
        }

        /* renamed from: Ra.a$b$b, reason: collision with other inner class name */
        public static final class C0692b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final UUID f19621a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0692b(UUID accId) {
                super(null);
                AbstractC6492s.i(accId, "accId");
                this.f19621a = accId;
            }

            public final UUID a() {
                return this.f19621a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0692b) && AbstractC6492s.d(this.f19621a, ((C0692b) obj).f19621a);
            }

            public int hashCode() {
                return this.f19621a.hashCode();
            }

            public String toString() {
                return "Auth(accId=" + this.f19621a + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f19622a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f19623b;

        c(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            c cVar = new c(interfaceC5380e);
            cVar.f19623b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f19622a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC3221h interfaceC3221h = (InterfaceC3221h) this.f19623b;
                b.C0691a c0691a = b.C0691a.f19620a;
                this.f19622a = 1;
                if (interfaceC3221h.a(c0691a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            return ((c) create(interfaceC3221h, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f19624a;

        d(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new d(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f19624a;
            if (i10 == 0) {
                v.b(obj);
                UIAccountManager uIAccountManager = a.this.f19613c;
                this.f19624a = 1;
                obj = uIAccountManager.f(this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return obj;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b.C0691a c0691a, InterfaceC5380e interfaceC5380e) {
            return ((d) create(c0691a, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f19626a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19627b;

        /* renamed from: d, reason: collision with root package name */
        int f19629d;

        e(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19627b = obj;
            this.f19629d |= PduHandle.NONE;
            return a.this.c(null, this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f19630a;

        /* renamed from: b, reason: collision with root package name */
        Object f19631b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f19632c;

        /* renamed from: e, reason: collision with root package name */
        int f19634e;

        f(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19632c = obj;
            this.f19634e |= PduHandle.NONE;
            return a.this.e(null, null, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f19635a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19636b;

        /* renamed from: d, reason: collision with root package name */
        int f19638d;

        g(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19636b = obj;
            this.f19638d |= PduHandle.NONE;
            return a.this.d(null, null, this);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f19639a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f19640b;

        /* renamed from: Ra.a$h$a, reason: collision with other inner class name */
        static final class C0693a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f19642a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0693a(a aVar) {
                super(0);
                this.f19642a = aVar;
            }

            public final void a() {
                this.f19642a.f19613c.g(null);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        public static final class b implements UIAccountManager.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f19643a;

            b(t tVar) {
                this.f19643a = tVar;
            }

            @Override // com.ui.sso.account.UIAccountManager.a
            public void a() {
                this.f19643a.k(b.C0691a.f19620a);
            }

            @Override // com.ui.sso.account.UIAccountManager.a
            public void b(UUID accountId) {
                AbstractC6492s.i(accountId, "accountId");
                this.f19643a.k(new b.C0692b(accountId));
            }
        }

        h(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            h hVar = a.this.new h(interfaceC5380e);
            hVar.f19640b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f19639a;
            if (i10 == 0) {
                v.b(obj);
                t tVar = (t) this.f19640b;
                a.this.f19613c.g(new b(tVar));
                C0693a c0693a = new C0693a(a.this);
                this.f19639a = 1;
                if (r.a(tVar, c0693a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, InterfaceC5380e interfaceC5380e) {
            return ((h) create(tVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final class i implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f19644a;

        /* renamed from: Ra.a$i$a, reason: collision with other inner class name */
        public static final class C0694a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f19645a;

            /* renamed from: Ra.a$i$a$a, reason: collision with other inner class name */
            public static final class C0695a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f19646a;

                /* renamed from: b, reason: collision with root package name */
                int f19647b;

                public C0695a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f19646a = obj;
                    this.f19647b |= PduHandle.NONE;
                    return C0694a.this.a(null, this);
                }
            }

            public C0694a(InterfaceC3221h interfaceC3221h) {
                this.f19645a = interfaceC3221h;
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
                    boolean r0 = r6 instanceof Ra.a.i.C0694a.C0695a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Ra.a$i$a$a r0 = (Ra.a.i.C0694a.C0695a) r0
                    int r1 = r0.f19647b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19647b = r1
                    goto L18
                L13:
                    Ra.a$i$a$a r0 = new Ra.a$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f19646a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f19647b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L44
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L32:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f19645a
                    boolean r2 = r5 instanceof Ra.a.b.C0691a
                    if (r2 == 0) goto L44
                    r0.f19647b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L44
                    return r1
                L44:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Ra.a.i.C0694a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public i(InterfaceC3220g interfaceC3220g) {
            this.f19644a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f19644a.b(new C0694a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    public static final class j implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f19649a;

        /* renamed from: Ra.a$j$a, reason: collision with other inner class name */
        public static final class C0696a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f19650a;

            /* renamed from: Ra.a$j$a$a, reason: collision with other inner class name */
            public static final class C0697a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f19651a;

                /* renamed from: b, reason: collision with root package name */
                int f19652b;

                public C0697a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f19651a = obj;
                    this.f19652b |= PduHandle.NONE;
                    return C0696a.this.a(null, this);
                }
            }

            public C0696a(InterfaceC3221h interfaceC3221h) {
                this.f19650a = interfaceC3221h;
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
                    boolean r0 = r6 instanceof Ra.a.j.C0696a.C0697a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Ra.a$j$a$a r0 = (Ra.a.j.C0696a.C0697a) r0
                    int r1 = r0.f19652b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19652b = r1
                    goto L18
                L13:
                    Ra.a$j$a$a r0 = new Ra.a$j$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f19651a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f19652b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L44
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L32:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f19650a
                    boolean r2 = r5 instanceof Ra.a.b.C0692b
                    if (r2 == 0) goto L44
                    r0.f19652b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L44
                    return r1
                L44:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Ra.a.j.C0696a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public j(InterfaceC3220g interfaceC3220g) {
            this.f19649a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f19649a.b(new C0696a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    public static final class k implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f19654a;

        /* renamed from: Ra.a$k$a, reason: collision with other inner class name */
        public static final class C0698a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f19655a;

            /* renamed from: Ra.a$k$a$a, reason: collision with other inner class name */
            public static final class C0699a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f19656a;

                /* renamed from: b, reason: collision with root package name */
                int f19657b;

                public C0699a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f19656a = obj;
                    this.f19657b |= PduHandle.NONE;
                    return C0698a.this.a(null, this);
                }
            }

            public C0698a(InterfaceC3221h interfaceC3221h) {
                this.f19655a = interfaceC3221h;
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
                    boolean r0 = r6 instanceof Ra.a.k.C0698a.C0699a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Ra.a$k$a$a r0 = (Ra.a.k.C0698a.C0699a) r0
                    int r1 = r0.f19657b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19657b = r1
                    goto L18
                L13:
                    Ra.a$k$a$a r0 = new Ra.a$k$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f19656a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f19657b
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
                    Li.h r6 = r4.f19655a
                    Ra.a$b$b r5 = (Ra.a.b.C0692b) r5
                    java.util.UUID r5 = r5.a()
                    r0.f19657b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Ra.a.k.C0698a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public k(InterfaceC3220g interfaceC3220g) {
            this.f19654a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f19654a.b(new C0698a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f19659a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19660b;

        /* renamed from: d, reason: collision with root package name */
        int f19662d;

        l(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19660b = obj;
            this.f19662d |= PduHandle.NONE;
            return a.this.b(null, this);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f19663a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19664b;

        /* renamed from: d, reason: collision with root package name */
        int f19666d;

        m(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19664b = obj;
            this.f19666d |= PduHandle.NONE;
            return a.this.g(null, null, this);
        }
    }

    public a(UiAccountApi.c state, UiAccountApi.d supportFile, UIAccountManager accountManager, Ta.d deviceIdentifiersService, UiAuthSerializer authSerializer, Ii.J dispatcherDefault, N externalScope) {
        AbstractC6492s.i(state, "state");
        AbstractC6492s.i(supportFile, "supportFile");
        AbstractC6492s.i(accountManager, "accountManager");
        AbstractC6492s.i(deviceIdentifiersService, "deviceIdentifiersService");
        AbstractC6492s.i(authSerializer, "authSerializer");
        AbstractC6492s.i(dispatcherDefault, "dispatcherDefault");
        AbstractC6492s.i(externalScope, "externalScope");
        this.f19611a = state;
        this.f19612b = supportFile;
        this.f19613c = accountManager;
        this.f19614d = deviceIdentifiersService;
        this.f19615e = authSerializer;
        Ua.a.e(new C0690a());
        InterfaceC3220g interfaceC3220gC = AbstractC3222i.C(AbstractC3222i.e(new h(null)), dispatcherDefault);
        J.a aVar = Li.J.f11860a;
        D dF = Li.v.f(interfaceC3220gC, externalScope, J.a.b(aVar, 0L, 0L, 3, null), 0, 4, null);
        this.f19616f = dF;
        this.f19617g = Wa.c.a(AbstractC3222i.C(AbstractC3222i.n(AbstractC3222i.E(new i(AbstractC3222i.J(dF, new c(null))), new d(null))), dispatcherDefault), externalScope, J.a.b(aVar, 0L, 0L, 3, null), 1);
        this.f19618h = Wa.c.b(AbstractC3222i.C(new k(new j(dF)), dispatcherDefault), externalScope, J.a.b(aVar, 0L, 0L, 3, null), 0, 4, null);
    }

    private final UiAccountApi.Error k(UIAccountManager.Error error, String str) {
        String message = error.getMessage();
        if (message != null) {
            String str2 = str + ": " + message;
            if (str2 != null) {
                str = str2;
            }
        }
        if (error instanceof UIAccountManager.Error.AccessRestricted) {
            return new UiAccountApi.Error.AccountManager.AccessRestricted(str);
        }
        if (error instanceof UIAccountManager.Error.NotFound) {
            return new UiAccountApi.Error.AccountManager.AccountNotFound(str);
        }
        if (error instanceof UIAccountManager.Error.IO) {
            return new UiAccountApi.Error.AccountManager.IO(str);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.ui.sso.api.UiAccountApi
    public InterfaceC3220g a() {
        return this.f19617g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.ui.sso.api.UiAccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(Na.b r8, dh.InterfaceC5380e r9) throws com.ui.sso.api.UiAccountApi.Error {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Ra.a.l
            if (r0 == 0) goto L13
            r0 = r9
            Ra.a$l r0 = (Ra.a.l) r0
            int r1 = r0.f19662d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19662d = r1
            goto L18
        L13:
            Ra.a$l r0 = new Ra.a$l
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19660b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f19662d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2f
            java.lang.Object r8 = r0.f19659a
            Ra.a r8 = (Ra.a) r8
            Yg.v.b(r9)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2d
            goto L5d
        L2d:
            r9 = move-exception
            goto L62
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            Yg.v.b(r9)
            com.ui.sso.account.UIAccountManager r9 = r7.f19613c     // Catch: com.ui.sso.account.UIAccountManager.Error -> L60
            java.util.UUID r2 = r8.c()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L60
            java.lang.String r4 = r8.d()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L60
            java.lang.String r5 = r8.b()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L60
            java.lang.String r8 = r8.a()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L60
            Na.b r6 = new Na.b     // Catch: com.ui.sso.account.UIAccountManager.Error -> L60
            r6.<init>(r2, r5, r4, r8)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L60
            r0.f19659a = r7     // Catch: com.ui.sso.account.UIAccountManager.Error -> L60
            r0.f19662d = r3     // Catch: com.ui.sso.account.UIAccountManager.Error -> L60
            java.lang.Object r8 = r9.b(r6, r0)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L60
            if (r8 != r1) goto L5d
            return r1
        L5d:
            Yg.J r8 = Yg.J.f24997a
            return r8
        L60:
            r9 = move-exception
            r8 = r7
        L62:
            java.lang.String r0 = "Failed create an account"
            com.ui.sso.api.UiAccountApi$Error r8 = r8.k(r9, r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Ra.a.b(Na.b, dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.ui.sso.api.UiAccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.util.UUID r5, dh.InterfaceC5380e r6) throws com.ui.sso.api.UiAccountApi.Error {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Ra.a.e
            if (r0 == 0) goto L13
            r0 = r6
            Ra.a$e r0 = (Ra.a.e) r0
            int r1 = r0.f19629d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19629d = r1
            goto L18
        L13:
            Ra.a$e r0 = new Ra.a$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19627b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f19629d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f19626a
            Ra.a r5 = (Ra.a) r5
            Yg.v.b(r6)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2d
            goto L48
        L2d:
            r6 = move-exception
            goto L4d
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            Yg.v.b(r6)
            com.ui.sso.account.UIAccountManager r6 = r4.f19613c     // Catch: com.ui.sso.account.UIAccountManager.Error -> L4b
            r0.f19626a = r4     // Catch: com.ui.sso.account.UIAccountManager.Error -> L4b
            r0.f19629d = r3     // Catch: com.ui.sso.account.UIAccountManager.Error -> L4b
            java.lang.Object r5 = r6.c(r5, r0)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L4b
            if (r5 != r1) goto L48
            return r1
        L48:
            Yg.J r5 = Yg.J.f24997a
            return r5
        L4b:
            r6 = move-exception
            r5 = r4
        L4d:
            java.lang.String r0 = "Failed delete an account"
            com.ui.sso.api.UiAccountApi$Error r5 = r5.k(r6, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Ra.a.c(java.util.UUID, dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.ui.sso.api.UiAccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.util.UUID r5, com.ui.sso.auth.a.EnumC1372a r6, dh.InterfaceC5380e r7) throws com.ui.sso.api.UiAccountApi.Error {
        /*
            r4 = this;
            boolean r0 = r7 instanceof Ra.a.g
            if (r0 == 0) goto L13
            r0 = r7
            Ra.a$g r0 = (Ra.a.g) r0
            int r1 = r0.f19638d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19638d = r1
            goto L18
        L13:
            Ra.a$g r0 = new Ra.a$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19636b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f19638d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f19635a
            Ra.a r5 = (Ra.a) r5
            Yg.v.b(r7)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2d
            goto L4c
        L2d:
            r6 = move-exception
            goto L51
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            Yg.v.b(r7)
            com.ui.sso.account.UIAccountManager r7 = r4.f19613c     // Catch: com.ui.sso.account.UIAccountManager.Error -> L4f
            java.lang.String r6 = r6.getId()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L4f
            r0.f19635a = r4     // Catch: com.ui.sso.account.UIAccountManager.Error -> L4f
            r0.f19638d = r3     // Catch: com.ui.sso.account.UIAccountManager.Error -> L4f
            java.lang.Object r5 = r7.j(r5, r6, r0)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L4f
            if (r5 != r1) goto L4c
            return r1
        L4c:
            Yg.J r5 = Yg.J.f24997a
            return r5
        L4f:
            r6 = move-exception
            r5 = r4
        L51:
            java.lang.String r7 = "Failed to invalidate Auth token"
            com.ui.sso.api.UiAccountApi$Error r5 = r5.k(r6, r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Ra.a.d(java.util.UUID, com.ui.sso.auth.a$a, dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.ui.sso.api.UiAccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(java.util.UUID r6, com.ui.sso.auth.a.EnumC1372a r7, dh.InterfaceC5380e r8) throws com.ui.sso.api.UiAccountApi.Error {
        /*
            r5 = this;
            boolean r0 = r8 instanceof Ra.a.f
            if (r0 == 0) goto L13
            r0 = r8
            Ra.a$f r0 = (Ra.a.f) r0
            int r1 = r0.f19634e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19634e = r1
            goto L18
        L13:
            Ra.a$f r0 = new Ra.a$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f19632c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f19634e
            java.lang.String r3 = "Failed to get Auth token"
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L37
            java.lang.Object r6 = r0.f19631b
            r7 = r6
            com.ui.sso.auth.a$a r7 = (com.ui.sso.auth.a.EnumC1372a) r7
            java.lang.Object r6 = r0.f19630a
            Ra.a r6 = (Ra.a) r6
            Yg.v.b(r8)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L35 com.ui.sso.auth.UiAuthSerializer.Error -> L67
            goto L57
        L35:
            r7 = move-exception
            goto L6d
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            Yg.v.b(r8)
            com.ui.sso.account.UIAccountManager r8 = r5.f19613c     // Catch: com.ui.sso.account.UIAccountManager.Error -> L64 com.ui.sso.auth.UiAuthSerializer.Error -> L67
            java.lang.String r2 = r7.getId()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L64 com.ui.sso.auth.UiAuthSerializer.Error -> L67
            r0.f19630a = r5     // Catch: com.ui.sso.account.UIAccountManager.Error -> L64 com.ui.sso.auth.UiAuthSerializer.Error -> L67
            r0.f19631b = r7     // Catch: com.ui.sso.account.UIAccountManager.Error -> L64 com.ui.sso.auth.UiAuthSerializer.Error -> L67
            r0.f19634e = r4     // Catch: com.ui.sso.account.UIAccountManager.Error -> L64 com.ui.sso.auth.UiAuthSerializer.Error -> L67
            java.lang.Object r8 = r8.i(r6, r2, r0)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L64 com.ui.sso.auth.UiAuthSerializer.Error -> L67
            if (r8 != r1) goto L56
            return r1
        L56:
            r6 = r5
        L57:
            java.lang.String r8 = (java.lang.String) r8     // Catch: com.ui.sso.account.UIAccountManager.Error -> L35 com.ui.sso.auth.UiAuthSerializer.Error -> L67
            if (r8 == 0) goto L62
            com.ui.sso.auth.UiAuthSerializer r0 = r6.f19615e     // Catch: com.ui.sso.account.UIAccountManager.Error -> L35 com.ui.sso.auth.UiAuthSerializer.Error -> L67
            com.ui.sso.auth.a r6 = r0.b(r8, r7)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L35 com.ui.sso.auth.UiAuthSerializer.Error -> L67
            goto L63
        L62:
            r6 = 0
        L63:
            return r6
        L64:
            r7 = move-exception
            r6 = r5
            goto L6d
        L67:
            com.ui.sso.api.UiAccountApi$Error$AccountManager$IO r6 = new com.ui.sso.api.UiAccountApi$Error$AccountManager$IO
            r6.<init>(r3)
            throw r6
        L6d:
            com.ui.sso.api.UiAccountApi$Error r6 = r6.k(r7, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ra.a.e(java.util.UUID, com.ui.sso.auth.a$a, dh.e):java.lang.Object");
    }

    @Override // com.ui.sso.api.UiAccountApi
    public InterfaceC3220g f() {
        return this.f19618h;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.ui.sso.api.UiAccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(java.util.UUID r6, com.ui.sso.auth.a r7, dh.InterfaceC5380e r8) throws com.ui.sso.api.UiAccountApi.Error {
        /*
            r5 = this;
            boolean r0 = r8 instanceof Ra.a.m
            if (r0 == 0) goto L13
            r0 = r8
            Ra.a$m r0 = (Ra.a.m) r0
            int r1 = r0.f19666d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19666d = r1
            goto L18
        L13:
            Ra.a$m r0 = new Ra.a$m
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f19664b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f19666d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f19663a
            Ra.a r6 = (Ra.a) r6
            Yg.v.b(r8)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L2d
            goto L56
        L2d:
            r7 = move-exception
            goto L5b
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            Yg.v.b(r8)
            com.ui.sso.account.UIAccountManager r8 = r5.f19613c     // Catch: com.ui.sso.account.UIAccountManager.Error -> L59
            com.ui.sso.auth.a$a r2 = r7.b()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L59
            java.lang.String r2 = r2.getId()     // Catch: com.ui.sso.account.UIAccountManager.Error -> L59
            com.ui.sso.auth.UiAuthSerializer r4 = r5.f19615e     // Catch: com.ui.sso.account.UIAccountManager.Error -> L59
            java.lang.String r7 = r4.a(r7)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L59
            r0.f19663a = r5     // Catch: com.ui.sso.account.UIAccountManager.Error -> L59
            r0.f19666d = r3     // Catch: com.ui.sso.account.UIAccountManager.Error -> L59
            java.lang.Object r6 = r8.h(r6, r2, r7, r0)     // Catch: com.ui.sso.account.UIAccountManager.Error -> L59
            if (r6 != r1) goto L56
            return r1
        L56:
            Yg.J r6 = Yg.J.f24997a
            return r6
        L59:
            r7 = move-exception
            r6 = r5
        L5b:
            java.lang.String r8 = "Failed to update Auth token"
            com.ui.sso.api.UiAccountApi$Error r6 = r6.k(r7, r8)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ra.a.g(java.util.UUID, com.ui.sso.auth.a, dh.e):java.lang.Object");
    }

    @Override // com.ui.sso.api.UiAccountApi
    public UiAccountApi.c getState() {
        return this.f19611a;
    }

    @Override // com.ui.sso.api.UiAccountApi
    public Object h(InterfaceC5380e interfaceC5380e) {
        return this.f19614d.a(interfaceC5380e);
    }

    @Override // com.ui.sso.api.UiAccountApi
    public UiAccountApi.d i() {
        return this.f19612b;
    }
}
