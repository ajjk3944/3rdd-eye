package Q0;

import T.InterfaceC3551q0;
import T.t1;
import T.z1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* renamed from: Q0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3429f implements z1 {

    /* renamed from: a, reason: collision with root package name */
    private final List f19031a;

    /* renamed from: b, reason: collision with root package name */
    private final S f19032b;

    /* renamed from: c, reason: collision with root package name */
    private final C3430g f19033c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6835l f19034d;

    /* renamed from: e, reason: collision with root package name */
    private final G f19035e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3551q0 f19036f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19037g = true;

    /* renamed from: Q0.f$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f19038a;

        /* renamed from: b, reason: collision with root package name */
        Object f19039b;

        /* renamed from: c, reason: collision with root package name */
        Object f19040c;

        /* renamed from: d, reason: collision with root package name */
        int f19041d;

        /* renamed from: e, reason: collision with root package name */
        int f19042e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19043f;

        /* renamed from: h, reason: collision with root package name */
        int f19045h;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19043f = obj;
            this.f19045h |= PduHandle.NONE;
            return C3429f.this.j(this);
        }
    }

    /* renamed from: Q0.f$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        int f19046a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3433j f19048c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3433j interfaceC3433j, InterfaceC5380e interfaceC5380e) {
            super(1, interfaceC5380e);
            this.f19048c = interfaceC3433j;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
            return C3429f.this.new b(this.f19048c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f19046a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C3429f c3429f = C3429f.this;
                InterfaceC3433j interfaceC3433j = this.f19048c;
                this.f19046a = 1;
                obj = c3429f.p(interfaceC3433j, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return obj;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5380e interfaceC5380e) {
            return ((b) create(interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: Q0.f$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f19049a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19050b;

        /* renamed from: d, reason: collision with root package name */
        int f19052d;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19050b = obj;
            this.f19052d |= PduHandle.NONE;
            return C3429f.this.p(null, this);
        }
    }

    /* renamed from: Q0.f$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f19053a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3433j f19055c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC3433j interfaceC3433j, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f19055c = interfaceC3433j;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return C3429f.this.new d(this.f19055c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f19053a;
            if (i10 == 0) {
                Yg.v.b(obj);
                G g10 = C3429f.this.f19035e;
                InterfaceC3433j interfaceC3433j = this.f19055c;
                this.f19053a = 1;
                obj = g10.b(interfaceC3433j, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return obj;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public C3429f(List list, Object obj, S s10, C3430g c3430g, InterfaceC6835l interfaceC6835l, G g10) {
        this.f19031a = list;
        this.f19032b = s10;
        this.f19033c = c3430g;
        this.f19034d = interfaceC6835l;
        this.f19035e = g10;
        this.f19036f = t1.d(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.f19036f.setValue(obj);
    }

    @Override // T.z1
    public Object getValue() {
        return this.f19036f.getValue();
    }

    public final boolean i() {
        return this.f19037g;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00be A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #0 {all -> 0x00f2, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00be, B:40:0x00f5), top: B:53:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5 A[Catch: all -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f2, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00be, B:40:0x00f5), top: B:53:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0108 -> B:44:0x0109). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x010d -> B:46:0x010f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(dh.InterfaceC5380e r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C3429f.j(dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(Q0.InterfaceC3433j r7, dh.InterfaceC5380e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Q0.C3429f.c
            if (r0 == 0) goto L13
            r0 = r8
            Q0.f$c r0 = (Q0.C3429f.c) r0
            int r1 = r0.f19052d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19052d = r1
            goto L18
        L13:
            Q0.f$c r0 = new Q0.f$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f19050b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f19052d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f19049a
            Q0.j r7 = (Q0.InterfaceC3433j) r7
            Yg.v.b(r8)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            goto L4f
        L2e:
            r8 = move-exception
            goto L51
        L30:
            r7 = move-exception
            goto L7d
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            Yg.v.b(r8)
            Q0.f$d r8 = new Q0.f$d     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r8.<init>(r7, r4)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.f19049a = r7     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.f19052d = r3     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = Ii.W0.d(r2, r8, r0)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            if (r8 != r1) goto L4f
            return r1
        L4f:
            r4 = r8
            goto L87
        L51:
            dh.i r1 = r0.getContext()
            Ii.K$a r2 = Ii.K.f9272M
            dh.i$b r1 = r1.get(r2)
            Ii.K r1 = (Ii.K) r1
            if (r1 == 0) goto L87
            dh.i r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.s(r0, r2)
            goto L87
        L7d:
            dh.i r8 = r0.getContext()
            boolean r8 = Ii.A0.p(r8)
            if (r8 == 0) goto L88
        L87:
            return r4
        L88:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C3429f.p(Q0.j, dh.e):java.lang.Object");
    }
}
