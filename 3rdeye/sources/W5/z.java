package w5;

import A9.C0575f;
import b9.C1992A;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import y5.C5810e;

/* compiled from: SessionFirelogPublisher.kt */
/* loaded from: classes2.dex */
public final class z implements y {

    /* renamed from: f, reason: collision with root package name */
    public static final double f47479f = Math.random();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f47480g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final B4.e f47481a;

    /* renamed from: b, reason: collision with root package name */
    public final h5.c f47482b;

    /* renamed from: c, reason: collision with root package name */
    public final C5810e f47483c;

    /* renamed from: d, reason: collision with root package name */
    public final A3.c f47484d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4350h f47485e;

    /* compiled from: SessionFirelogPublisher.kt */
    @h9.e(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", l = {63, 64, 70}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public o f47486l;

        /* renamed from: m, reason: collision with root package name */
        public z f47487m;

        /* renamed from: n, reason: collision with root package name */
        public x f47488n;

        /* renamed from: o, reason: collision with root package name */
        public B4.e f47489o;

        /* renamed from: p, reason: collision with root package name */
        public v f47490p;

        /* renamed from: q, reason: collision with root package name */
        public C5810e f47491q;

        /* renamed from: r, reason: collision with root package name */
        public int f47492r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ v f47494t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f47494t = vVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return z.this.new a(this.f47494t, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 285
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: w5.z.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public z(B4.e eVar, h5.c cVar, C5810e c5810e, A3.c cVar2, InterfaceC4350h interfaceC4350h) {
        this.f47481a = eVar;
        this.f47482b = cVar;
        this.f47483c = c5810e;
        this.f47484d = cVar2;
        this.f47485e = interfaceC4350h;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(w5.z r5, h9.c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof w5.C5721A
            if (r0 == 0) goto L16
            r0 = r6
            w5.A r0 = (w5.C5721A) r0
            int r1 = r0.f47347o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f47347o = r1
            goto L1b
        L16:
            w5.A r0 = new w5.A
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f47345m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f47347o
            r3 = 1
            java.lang.String r4 = "SessionFirelogPublisher"
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            w5.z r5 = r0.f47344l
            b9.n.b(r6)
            goto L4b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            b9.n.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r4, r6)
            r0.f47344l = r5
            r0.f47347o = r3
            y5.e r6 = r5.f47483c
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            y5.e r6 = r5.f47483c
            F3.f r0 = r6.f48162a
            java.lang.Boolean r0 = r0.b()
            if (r0 == 0) goto L5a
            boolean r3 = r0.booleanValue()
            goto L66
        L5a:
            y5.a r6 = r6.f48163b
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto L66
            boolean r3 = r6.booleanValue()
        L66:
            if (r3 != 0) goto L70
            java.lang.String r5 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r4, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L70:
            y5.e r5 = r5.f47483c
            double r5 = r5.a()
            double r0 = w5.z.f47479f
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L7f
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L7f:
            java.lang.String r5 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.z.b(w5.z, h9.c):java.lang.Object");
    }

    @Override // w5.y
    public final void a(v vVar) {
        C0575f.e(A9.F.a(this.f47485e), null, null, new a(vVar, null), 3);
    }
}
