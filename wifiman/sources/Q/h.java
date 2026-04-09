package Q;

import dh.InterfaceC5380e;
import l0.C6531g;
import mh.InterfaceC6824a;
import org.snmp4j.mp.PduHandle;
import r.InterfaceC7533i;
import r.InterfaceC7550z;
import x0.InterfaceC8412a;

/* loaded from: classes.dex */
final class h implements z {

    /* renamed from: a, reason: collision with root package name */
    private final A f18807a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7533i f18808b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7550z f18809c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6824a f18810d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18811e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC8412a f18812f = new a();

    public static final class a implements InterfaceC8412a {

        /* renamed from: Q.h$a$a, reason: collision with other inner class name */
        static final class C0665a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f18814a;

            /* renamed from: b, reason: collision with root package name */
            long f18815b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f18816c;

            /* renamed from: e, reason: collision with root package name */
            int f18818e;

            C0665a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f18816c = obj;
                this.f18818e |= PduHandle.NONE;
                return a.this.g1(0L, 0L, this);
            }
        }

        a() {
        }

        @Override // x0.InterfaceC8412a
        public long L1(long j10, long j11, int i10) {
            if (!((Boolean) h.this.e().invoke()).booleanValue()) {
                return C6531g.f52335b.c();
            }
            A state = h.this.getState();
            state.f(state.c() + C6531g.n(j10));
            if ((h.this.getState().d() == 0.0f || h.this.getState().d() == h.this.getState().e()) && C6531g.n(j10) == 0.0f && C6531g.n(j11) > 0.0f) {
                h.this.getState().f(0.0f);
            }
            h.this.getState().g(h.this.getState().d() + C6531g.n(j10));
            return C6531g.f52335b.c();
        }

        @Override // x0.InterfaceC8412a
        public long V0(long j10, int i10) {
            if (!((Boolean) h.this.e().invoke()).booleanValue()) {
                return C6531g.f52335b.c();
            }
            float fD = h.this.getState().d();
            h.this.getState().g(h.this.getState().d() + C6531g.n(j10));
            return fD == h.this.getState().d() ? C6531g.f52335b.c() : C6531g.g(j10, 0.0f, 0.0f, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // x0.InterfaceC8412a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object g1(long r10, long r12, dh.InterfaceC5380e r14) {
            /*
                r9 = this;
                boolean r0 = r14 instanceof Q.h.a.C0665a
                if (r0 == 0) goto L13
                r0 = r14
                Q.h$a$a r0 = (Q.h.a.C0665a) r0
                int r1 = r0.f18818e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18818e = r1
                goto L18
            L13:
                Q.h$a$a r0 = new Q.h$a$a
                r0.<init>(r14)
            L18:
                java.lang.Object r14 = r0.f18816c
                java.lang.Object r7 = eh.AbstractC5467b.g()
                int r1 = r0.f18818e
                r8 = 2
                r2 = 1
                if (r1 == 0) goto L40
                if (r1 == r2) goto L36
                if (r1 != r8) goto L2e
                long r10 = r0.f18815b
                Yg.v.b(r14)
                goto L80
            L2e:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L36:
                long r12 = r0.f18815b
                java.lang.Object r10 = r0.f18814a
                Q.h$a r10 = (Q.h.a) r10
                Yg.v.b(r14)
                goto L55
            L40:
                Yg.v.b(r14)
                r0.f18814a = r9
                r0.f18815b = r12
                r0.f18818e = r2
                r1 = r9
                r2 = r10
                r4 = r12
                r6 = r0
                java.lang.Object r14 = super.g1(r2, r4, r6)
                if (r14 != r7) goto L54
                return r7
            L54:
                r10 = r9
            L55:
                Y0.y r14 = (Y0.y) r14
                long r1 = r14.o()
                Q.h r11 = Q.h.this
                Q.A r11 = r11.getState()
                float r12 = Y0.y.i(r12)
                Q.h r13 = Q.h.this
                r.z r13 = r13.b()
                Q.h r10 = Q.h.this
                r.i r10 = r10.c()
                r14 = 0
                r0.f18814a = r14
                r0.f18815b = r1
                r0.f18818e = r8
                java.lang.Object r14 = Q.AbstractC3423a.a(r11, r12, r13, r10, r0)
                if (r14 != r7) goto L7f
                return r7
            L7f:
                r10 = r1
            L80:
                Y0.y r14 = (Y0.y) r14
                long r12 = r14.o()
                long r10 = Y0.y.l(r10, r12)
                Y0.y r10 = Y0.y.b(r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: Q.h.a.g1(long, long, dh.e):java.lang.Object");
        }
    }

    public h(A a10, InterfaceC7533i interfaceC7533i, InterfaceC7550z interfaceC7550z, InterfaceC6824a interfaceC6824a) {
        this.f18807a = a10;
        this.f18808b = interfaceC7533i;
        this.f18809c = interfaceC7550z;
        this.f18810d = interfaceC6824a;
    }

    @Override // Q.z
    public InterfaceC8412a a() {
        return this.f18812f;
    }

    @Override // Q.z
    public InterfaceC7550z b() {
        return this.f18809c;
    }

    @Override // Q.z
    public InterfaceC7533i c() {
        return this.f18808b;
    }

    @Override // Q.z
    public boolean d() {
        return this.f18811e;
    }

    public final InterfaceC6824a e() {
        return this.f18810d;
    }

    @Override // Q.z
    public A getState() {
        return this.f18807a;
    }
}
