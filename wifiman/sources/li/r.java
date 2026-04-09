package Li;

import Ii.InterfaceC3091y0;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
abstract /* synthetic */ class r {

    public static final class a implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f11946a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ mh.q f11947b;

        /* renamed from: Li.r$a$a, reason: collision with other inner class name */
        public static final class C0470a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f11948a;

            /* renamed from: b, reason: collision with root package name */
            int f11949b;

            /* renamed from: d, reason: collision with root package name */
            Object f11951d;

            /* renamed from: e, reason: collision with root package name */
            Object f11952e;

            public C0470a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f11948a = obj;
                this.f11949b |= PduHandle.NONE;
                return a.this.b(null, this);
            }
        }

        public a(InterfaceC3220g interfaceC3220g, mh.q qVar) {
            this.f11946a = interfaceC3220g;
            this.f11947b = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Li.InterfaceC3220g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object b(Li.InterfaceC3221h r6, dh.InterfaceC5380e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof Li.r.a.C0470a
                if (r0 == 0) goto L13
                r0 = r7
                Li.r$a$a r0 = (Li.r.a.C0470a) r0
                int r1 = r0.f11949b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f11949b = r1
                goto L18
            L13:
                Li.r$a$a r0 = new Li.r$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f11948a
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f11949b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                Yg.v.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f11952e
                Li.h r6 = (Li.InterfaceC3221h) r6
                java.lang.Object r2 = r0.f11951d
                Li.r$a r2 = (Li.r.a) r2
                Yg.v.b(r7)
                goto L53
            L40:
                Yg.v.b(r7)
                Li.g r7 = r5.f11946a
                r0.f11951d = r5
                r0.f11952e = r6
                r0.f11949b = r4
                java.lang.Object r7 = Li.AbstractC3222i.g(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                mh.q r2 = r2.f11947b
                r4 = 0
                r0.f11951d = r4
                r0.f11952e = r4
                r0.f11949b = r3
                r3 = 6
                kotlin.jvm.internal.AbstractC6491q.a(r3)
                java.lang.Object r6 = r2.s(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.AbstractC6491q.a(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                Yg.J r6 = Yg.J.f24997a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Li.r.a.b(Li.h, dh.e):java.lang.Object");
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11953a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11954b;

        /* renamed from: c, reason: collision with root package name */
        int f11955c;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11954b = obj;
            this.f11955c |= PduHandle.NONE;
            return AbstractC3222i.g(null, null, this);
        }
    }

    static final class c implements InterfaceC3221h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3221h f11956a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f11957b;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f11958a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f11959b;

            /* renamed from: d, reason: collision with root package name */
            int f11961d;

            a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f11959b = obj;
                this.f11961d |= PduHandle.NONE;
                return c.this.a(null, this);
            }
        }

        c(InterfaceC3221h interfaceC3221h, kotlin.jvm.internal.N n10) {
            this.f11956a = interfaceC3221h;
            this.f11957b = n10;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Li.InterfaceC3221h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof Li.r.c.a
                if (r0 == 0) goto L13
                r0 = r6
                Li.r$c$a r0 = (Li.r.c.a) r0
                int r1 = r0.f11961d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f11961d = r1
                goto L18
            L13:
                Li.r$c$a r0 = new Li.r$c$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f11959b
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f11961d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f11958a
                Li.r$c r5 = (Li.r.c) r5
                Yg.v.b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                Yg.v.b(r6)
                Li.h r6 = r4.f11956a     // Catch: java.lang.Throwable -> L4a
                r0.f11958a = r4     // Catch: java.lang.Throwable -> L4a
                r0.f11961d = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.a(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                Yg.J r5 = Yg.J.f24997a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.N r5 = r5.f11957b
                r5.f51689a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Li.r.c.a(java.lang.Object, dh.e):java.lang.Object");
        }
    }

    public static final InterfaceC3220g a(InterfaceC3220g interfaceC3220g, mh.q qVar) {
        return new a(interfaceC3220g, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(Li.InterfaceC3220g r4, Li.InterfaceC3221h r5, dh.InterfaceC5380e r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof Li.r.b
            if (r0 == 0) goto L13
            r0 = r6
            Li.r$b r0 = (Li.r.b) r0
            int r1 = r0.f11955c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11955c = r1
            goto L18
        L13:
            Li.r$b r0 = new Li.r$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f11954b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f11955c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f11953a
            kotlin.jvm.internal.N r4 = (kotlin.jvm.internal.N) r4
            Yg.v.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            Yg.v.b(r6)
            kotlin.jvm.internal.N r6 = new kotlin.jvm.internal.N
            r6.<init>()
            Li.r$c r2 = new Li.r$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f11953a = r6     // Catch: java.lang.Throwable -> L51
            r0.f11955c = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.b(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            java.lang.Object r4 = r4.f51689a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            dh.i r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            Yg.AbstractC3663g.a(r4, r5)
            throw r4
        L72:
            Yg.AbstractC3663g.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Li.r.b(Li.g, Li.h, dh.e):java.lang.Object");
    }

    private static final boolean c(Throwable th2, InterfaceC5384i interfaceC5384i) {
        InterfaceC3091y0 interfaceC3091y0 = (InterfaceC3091y0) interfaceC5384i.get(InterfaceC3091y0.f9363O);
        if (interfaceC3091y0 == null || !interfaceC3091y0.isCancelled()) {
            return false;
        }
        return d(th2, interfaceC3091y0.getCancellationException());
    }

    private static final boolean d(Throwable th2, Throwable th3) {
        return th3 != null && AbstractC6492s.d(th3, th2);
    }
}
