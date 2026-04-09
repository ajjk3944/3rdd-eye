package E8;

import Ad.a;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Li.N;
import T.o1;
import Yg.J;
import Zg.AbstractC3689v;
import com.ubnt.usurvey.R;
import dh.InterfaceC5380e;
import ec.AbstractC5452a;
import eh.AbstractC5467b;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import hc.C5973a;
import hc.InterfaceC5974b;
import hg.InterfaceC6043c;
import i8.InterfaceC6084a;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;
import org.kodein.di.DI;
import org.snmp4j.mp.PduHandle;
import rj.InterfaceC7810x2;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class q extends com.ui.wifiman.ui.speedtest.feedback.e {

    /* renamed from: g, reason: collision with root package name */
    private final DI f4267g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f4268h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f4269i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f4270j;

    /* renamed from: k, reason: collision with root package name */
    private final Fg.a f4271k;

    /* renamed from: l, reason: collision with root package name */
    private final N f4272l;

    /* renamed from: m, reason: collision with root package name */
    private final N f4273m;

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ th.l[] f4265o = {O.h(new kotlin.jvm.internal.F(q.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new kotlin.jvm.internal.F(q.class, "toastService", "getToastService()Lcom/ui/wifiman/domain/toast/ToastService;", 0)), O.h(new kotlin.jvm.internal.F(q.class, "feedbackService", "getFeedbackService()Lcom/ui/wifiman/model/speedtest/feedback/SpeedtestFeedbackService;", 0))};

    /* renamed from: n, reason: collision with root package name */
    public static final a f4264n = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f4266p = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4274a;

        static {
            int[] iArr = new int[com.ui.wifiman.ui.speedtest.feedback.d.values().length];
            try {
                iArr[com.ui.wifiman.ui.speedtest.feedback.d.CONNECTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.ui.wifiman.ui.speedtest.feedback.d.LATENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ui.wifiman.ui.speedtest.feedback.d.THROUGHPUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.ui.wifiman.ui.speedtest.feedback.d.NOT_AS_EXPECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4274a = iArr;
        }
    }

    static final class c implements InterfaceC6469f {
        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            q.this.f4271k.h(Boolean.TRUE);
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.l implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        int f4276a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f4277b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4278c;

        public d(InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f4276a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC3221h interfaceC3221h = (InterfaceC3221h) this.f4277b;
                N nE = ((androidx.lifecycle.E) this.f4278c).e("reason", null);
                this.f4276a = 1;
                if (AbstractC3222i.t(interfaceC3221h, nE, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object s(InterfaceC3221h interfaceC3221h, Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = new d(interfaceC5380e);
            dVar.f4277b = interfaceC3221h;
            dVar.f4278c = obj;
            return dVar.invokeSuspend(J.f24997a);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends org.kodein.type.o<InterfaceC5974b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends org.kodein.type.o<Ad.a> {
    }

    public static final class h implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f4279a;

        public static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f4280a;

            /* renamed from: E8.q$h$a$a, reason: collision with other inner class name */
            public static final class C0184a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f4281a;

                /* renamed from: b, reason: collision with root package name */
                int f4282b;

                public C0184a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4281a = obj;
                    this.f4282b |= PduHandle.NONE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC3221h interfaceC3221h) {
                this.f4280a = interfaceC3221h;
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
                    boolean r0 = r6 instanceof E8.q.h.a.C0184a
                    if (r0 == 0) goto L13
                    r0 = r6
                    E8.q$h$a$a r0 = (E8.q.h.a.C0184a) r0
                    int r1 = r0.f4282b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f4282b = r1
                    goto L18
                L13:
                    E8.q$h$a$a r0 = new E8.q$h$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f4281a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f4282b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L32:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f4280a
                    com.ui.wifiman.ui.speedtest.feedback.d r5 = (com.ui.wifiman.ui.speedtest.feedback.d) r5
                    if (r5 == 0) goto L3d
                    r5 = r3
                    goto L3e
                L3d:
                    r5 = 0
                L3e:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f4282b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: E8.q.h.a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public h(InterfaceC3220g interfaceC3220g) {
            this.f4279a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f4279a.b(new a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    static final class i implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final i f4284a = new i();

        i() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Boolean submitInProcess, Boolean reasonSelected) {
            AbstractC6492s.i(submitInProcess, "submitInProcess");
            AbstractC6492s.i(reasonSelected, "reasonSelected");
            return Boolean.valueOf(!submitInProcess.booleanValue() && reasonSelected.booleanValue());
        }
    }

    public static final class j implements gg.q {
        public j() {
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                com.ui.wifiman.ui.speedtest.feedback.d dVarH0 = q.this.H0();
                a.b bVar = null;
                str = null;
                String str = null;
                if (dVarH0 != null) {
                    long jA = q.this.n0().a();
                    a.EnumC0020a enumC0020aC0 = q.this.C0(dVarH0);
                    String strG0 = q.this.G0();
                    if (strG0 != null && !kotlin.text.t.m0(strG0)) {
                        str = strG0;
                    }
                    bVar = new a.b(jA, new a.b.C0021a(enumC0020aC0, str));
                }
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

    static final class k implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f4287a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                Z7.b.e("Submitting feedback failed", error, null, 4, null);
                return AbstractC5912b.m();
            }
        }

        public static final class b implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f4288a;

            public b(q qVar) {
                this.f4288a = qVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f4288a.E0().a(new C5973a(new AbstractC5452a.C1741a(R.string.speedtest_feedback_submit_success_message, new Object[0]), false, 2, null));
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(a.b feedback) {
            AbstractC6492s.i(feedback, "feedback");
            AbstractC5912b abstractC5912bA = q.this.D0().a(feedback);
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b(q.this));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return AbstractC5912b.I(abstractC5912bA, abstractC5912bR).Y(5000L, TimeUnit.MILLISECONDS).O(a.f4287a);
        }
    }

    public q(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f4267g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6084a.class), null);
        th.l[] lVarArr = f4265o;
        this.f4268h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4269i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC5974b.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4270j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, Ad.a.class), null).a(this, lVarArr[2]);
        Boolean bool = Boolean.FALSE;
        Fg.a aVarK2 = Fg.a.k2(bool);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f4271k = aVarK2;
        this.f4272l = AbstractC8661g.c0(this, AbstractC3222i.O(o1.o(new InterfaceC6824a() { // from class: E8.p
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return q.J0(this.f4263a);
            }
        }), new d(null)), null, false, null, 6, null);
        gg.i iVarV = gg.i.v(aVarK2.e1().Y0(Gg.a.a(), false, 1), Qi.i.b(new h(o0()), androidx.lifecycle.O.a(this).getCoroutineContext()), i.f4284a);
        AbstractC6492s.h(iVarV, "combineLatest(...)");
        this.f4273m = AbstractC8661g.d0(this, iVarV, bool, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.EnumC0020a C0(com.ui.wifiman.ui.speedtest.feedback.d dVar) {
        int i10 = b.f4274a[dVar.ordinal()];
        if (i10 == 1) {
            return a.EnumC0020a.DROPPED_CONNECTIVITY;
        }
        if (i10 == 2) {
            return a.EnumC0020a.POOR_LATENCY;
        }
        if (i10 == 3) {
            return a.EnumC0020a.POOR_THROUGHPUT;
        }
        if (i10 == 4) {
            return a.EnumC0020a.NOT_AS_EXPECTED;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ad.a D0() {
        return (Ad.a) this.f4270j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5974b E0() {
        return (InterfaceC5974b) this.f4269i.getValue();
    }

    private final InterfaceC6084a F0() {
        return (InterfaceC6084a) this.f4268h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String G0() {
        return (String) j0().d("comment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ui.wifiman.ui.speedtest.feedback.d H0() {
        return (com.ui.wifiman.ui.speedtest.feedback.d) j0().d("reason");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(q qVar) {
        qVar.f4271k.h(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.E J0(q qVar) {
        return qVar.j0();
    }

    private final void K0(String str) {
        j0().i("comment", str);
    }

    private final void L0(com.ui.wifiman.ui.speedtest.feedback.d dVar) {
        j0().i("reason", dVar);
    }

    private final AbstractC5912b M0() {
        gg.n nVarC = gg.n.c(new j());
        AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bK = nVarC.k(new k());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        return abstractC5912bK;
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f4267g;
    }

    @Override // com.ui.wifiman.ui.speedtest.feedback.e
    public N o0() {
        return this.f4272l;
    }

    @Override // com.ui.wifiman.ui.speedtest.feedback.e
    public N p0() {
        return this.f4273m;
    }

    @Override // com.ui.wifiman.ui.speedtest.feedback.e
    public void q0(String comment) {
        AbstractC6492s.i(comment, "comment");
        K0(comment);
    }

    @Override // com.ui.wifiman.ui.speedtest.feedback.e
    public void r0(com.ui.wifiman.ui.speedtest.feedback.d reason) {
        AbstractC6492s.i(reason, "reason");
        if (H0() != reason) {
            L0(reason);
        } else {
            L0(null);
        }
    }

    @Override // com.ui.wifiman.ui.speedtest.feedback.e
    public void s0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bW = AbstractC5912b.o(AbstractC3689v.o(M0(), F0().a(InterfaceC6084a.b.n.f48939a))).B(new c()).w(new InterfaceC6464a() { // from class: E8.o
            @Override // kg.InterfaceC6464a
            public final void run() {
                q.I0(this.f4262a);
            }
        });
        AbstractC6492s.h(abstractC5912bW, "doFinally(...)");
        c8658d.d(abstractC5912bW, this);
    }
}
