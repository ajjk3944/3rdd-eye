package Li;

import dh.InterfaceC5380e;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* renamed from: Li.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC3230q {

    /* renamed from: Li.q$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11928a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11929b;

        /* renamed from: c, reason: collision with root package name */
        int f11930c;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11929b = obj;
            this.f11930c |= PduHandle.NONE;
            return AbstractC3230q.c(null, null, null, this);
        }
    }

    /* renamed from: Li.q$b */
    public static final class b implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f11931a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ mh.q f11932b;

        /* renamed from: Li.q$b$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f11933a;

            /* renamed from: b, reason: collision with root package name */
            int f11934b;

            /* renamed from: d, reason: collision with root package name */
            Object f11936d;

            /* renamed from: e, reason: collision with root package name */
            Object f11937e;

            public a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f11933a = obj;
                this.f11934b |= PduHandle.NONE;
                return b.this.b(null, this);
            }
        }

        public b(InterfaceC3220g interfaceC3220g, mh.q qVar) {
            this.f11931a = interfaceC3220g;
            this.f11932b = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Li.InterfaceC3220g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object b(Li.InterfaceC3221h r9, dh.InterfaceC5380e r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r10 instanceof Li.AbstractC3230q.b.a
                if (r0 == 0) goto L13
                r0 = r10
                Li.q$b$a r0 = (Li.AbstractC3230q.b.a) r0
                int r1 = r0.f11934b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f11934b = r1
                goto L18
            L13:
                Li.q$b$a r0 = new Li.q$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f11933a
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f11934b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f11936d
                Mi.t r9 = (Mi.t) r9
                Yg.v.b(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f11936d
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                Yg.v.b(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.f11937e
                Li.h r9 = (Li.InterfaceC3221h) r9
                java.lang.Object r2 = r0.f11936d
                Li.q$b r2 = (Li.AbstractC3230q.b) r2
                Yg.v.b(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                Yg.v.b(r10)
                Li.g r10 = r8.f11931a     // Catch: java.lang.Throwable -> L96
                r0.f11936d = r8     // Catch: java.lang.Throwable -> L96
                r0.f11937e = r9     // Catch: java.lang.Throwable -> L96
                r0.f11934b = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.b(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                Mi.t r10 = new Mi.t
                dh.i r4 = r0.getContext()
                r10.<init>(r9, r4)
                mh.q r9 = r2.f11932b     // Catch: java.lang.Throwable -> L8e
                r0.f11936d = r10     // Catch: java.lang.Throwable -> L8e
                r0.f11937e = r6     // Catch: java.lang.Throwable -> L8e
                r0.f11934b = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                kotlin.jvm.internal.AbstractC6491q.a(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.s(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                kotlin.jvm.internal.AbstractC6491q.a(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.releaseIntercepted()
                Yg.J r9 = Yg.J.f24997a
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.releaseIntercepted()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                Li.S r10 = new Li.S
                r10.<init>(r9)
                mh.q r2 = r2.f11932b
                r0.f11936d = r9
                r0.f11937e = r6
                r0.f11934b = r4
                java.lang.Object r10 = Li.AbstractC3230q.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Li.AbstractC3230q.b.b(Li.h, dh.e):java.lang.Object");
        }
    }

    /* renamed from: Li.q$c */
    public static final class c implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f11938a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f11939b;

        /* renamed from: Li.q$c$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f11940a;

            /* renamed from: b, reason: collision with root package name */
            int f11941b;

            /* renamed from: d, reason: collision with root package name */
            Object f11943d;

            /* renamed from: e, reason: collision with root package name */
            Object f11944e;

            /* renamed from: f, reason: collision with root package name */
            Object f11945f;

            public a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f11940a = obj;
                this.f11941b |= PduHandle.NONE;
                return c.this.b(null, this);
            }
        }

        public c(InterfaceC6839p interfaceC6839p, InterfaceC3220g interfaceC3220g) {
            this.f11938a = interfaceC6839p;
            this.f11939b = interfaceC3220g;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Li.InterfaceC3220g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object b(Li.InterfaceC3221h r7, dh.InterfaceC5380e r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof Li.AbstractC3230q.c.a
                if (r0 == 0) goto L13
                r0 = r8
                Li.q$c$a r0 = (Li.AbstractC3230q.c.a) r0
                int r1 = r0.f11941b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f11941b = r1
                goto L18
            L13:
                Li.q$c$a r0 = new Li.q$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f11940a
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f11941b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                Yg.v.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f11945f
                Mi.t r7 = (Mi.t) r7
                java.lang.Object r2 = r0.f11944e
                Li.h r2 = (Li.InterfaceC3221h) r2
                java.lang.Object r4 = r0.f11943d
                Li.q$c r4 = (Li.AbstractC3230q.c) r4
                Yg.v.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                Yg.v.b(r8)
                Mi.t r8 = new Mi.t
                dh.i r2 = r0.getContext()
                r8.<init>(r7, r2)
                mh.p r2 = r6.f11938a     // Catch: java.lang.Throwable -> L86
                r0.f11943d = r6     // Catch: java.lang.Throwable -> L86
                r0.f11944e = r7     // Catch: java.lang.Throwable -> L86
                r0.f11945f = r8     // Catch: java.lang.Throwable -> L86
                r0.f11941b = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.AbstractC6491q.a(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.AbstractC6491q.a(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                Li.g r7 = r4.f11939b
                r8 = 0
                r0.f11943d = r8
                r0.f11944e = r8
                r0.f11945f = r8
                r0.f11941b = r3
                java.lang.Object r7 = r7.b(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                Yg.J r7 = Yg.J.f24997a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Li.AbstractC3230q.c.b(Li.h, dh.e):java.lang.Object");
        }
    }

    public static final void b(InterfaceC3221h interfaceC3221h) {
        if (interfaceC3221h instanceof S) {
            throw ((S) interfaceC3221h).f11893a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(Li.InterfaceC3221h r4, mh.q r5, java.lang.Throwable r6, dh.InterfaceC5380e r7) {
        /*
            boolean r0 = r7 instanceof Li.AbstractC3230q.a
            if (r0 == 0) goto L13
            r0 = r7
            Li.q$a r0 = (Li.AbstractC3230q.a) r0
            int r1 = r0.f11930c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11930c = r1
            goto L18
        L13:
            Li.q$a r0 = new Li.q$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11929b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f11930c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f11928a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            Yg.v.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            Yg.v.b(r7)
            r0.f11928a = r6     // Catch: java.lang.Throwable -> L2e
            r0.f11930c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.s(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            Yg.J r4 = Yg.J.f24997a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            Yg.AbstractC3663g.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Li.AbstractC3230q.c(Li.h, mh.q, java.lang.Throwable, dh.e):java.lang.Object");
    }

    public static final InterfaceC3220g d(InterfaceC3220g interfaceC3220g, mh.q qVar) {
        return new b(interfaceC3220g, qVar);
    }

    public static final InterfaceC3220g e(InterfaceC3220g interfaceC3220g, InterfaceC6839p interfaceC6839p) {
        return new c(interfaceC6839p, interfaceC3220g);
    }
}
