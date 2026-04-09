package Li;

import dh.InterfaceC5380e;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
abstract /* synthetic */ class u {

    public static final class a implements InterfaceC3221h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f12001a;

        public a(kotlin.jvm.internal.N n10) {
            this.f12001a = n10;
        }

        @Override // Li.InterfaceC3221h
        public Object a(Object obj, InterfaceC5380e interfaceC5380e) {
            this.f12001a.f51689a = obj;
            throw new AbortFlowException(this);
        }
    }

    public static final class b implements InterfaceC3221h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f12002a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f12003b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f12004a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f12005b;

            /* renamed from: c, reason: collision with root package name */
            int f12006c;

            /* renamed from: e, reason: collision with root package name */
            Object f12008e;

            public a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f12005b = obj;
                this.f12006c |= PduHandle.NONE;
                return b.this.a(null, this);
            }
        }

        public b(InterfaceC6839p interfaceC6839p, kotlin.jvm.internal.N n10) {
            this.f12002a = interfaceC6839p;
            this.f12003b = n10;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Li.InterfaceC3221h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof Li.u.b.a
                if (r0 == 0) goto L13
                r0 = r6
                Li.u$b$a r0 = (Li.u.b.a) r0
                int r1 = r0.f12006c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12006c = r1
                goto L18
            L13:
                Li.u$b$a r0 = new Li.u$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f12005b
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f12006c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f12008e
                java.lang.Object r0 = r0.f12004a
                Li.u$b r0 = (Li.u.b) r0
                Yg.v.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                Yg.v.b(r6)
                mh.p r6 = r4.f12002a
                r0.f12004a = r4
                r0.f12008e = r5
                r0.f12006c = r3
                r2 = 6
                kotlin.jvm.internal.AbstractC6491q.a(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.AbstractC6491q.a(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                Yg.J r5 = Yg.J.f24997a
                return r5
            L5d:
                kotlin.jvm.internal.N r6 = r0.f12003b
                r6.f51689a = r5
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Li.u.b.a(java.lang.Object, dh.e):java.lang.Object");
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f12009a;

        /* renamed from: b, reason: collision with root package name */
        Object f12010b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f12011c;

        /* renamed from: d, reason: collision with root package name */
        int f12012d;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f12011c = obj;
            this.f12012d |= PduHandle.NONE;
            return AbstractC3222i.x(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f12013a;

        /* renamed from: b, reason: collision with root package name */
        Object f12014b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f12015c;

        /* renamed from: d, reason: collision with root package name */
        int f12016d;

        d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f12015c = obj;
            this.f12016d |= PduHandle.NONE;
            return AbstractC3222i.y(null, null, this);
        }
    }

    public static final class e implements InterfaceC3221h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f12017a;

        public e(kotlin.jvm.internal.N n10) {
            this.f12017a = n10;
        }

        @Override // Li.InterfaceC3221h
        public Object a(Object obj, InterfaceC5380e interfaceC5380e) {
            this.f12017a.f51689a = obj;
            throw new AbortFlowException(this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f12018a;

        /* renamed from: b, reason: collision with root package name */
        Object f12019b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f12020c;

        /* renamed from: d, reason: collision with root package name */
        int f12021d;

        f(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f12020c = obj;
            this.f12021d |= PduHandle.NONE;
            return AbstractC3222i.z(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(Li.InterfaceC3220g r4, dh.InterfaceC5380e r5) {
        /*
            boolean r0 = r5 instanceof Li.u.c
            if (r0 == 0) goto L13
            r0 = r5
            Li.u$c r0 = (Li.u.c) r0
            int r1 = r0.f12012d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12012d = r1
            goto L18
        L13:
            Li.u$c r0 = new Li.u$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12011c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f12012d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f12010b
            Li.u$a r4 = (Li.u.a) r4
            java.lang.Object r1 = r0.f12009a
            kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
            Yg.v.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L69
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            Yg.v.b(r5)
            kotlin.jvm.internal.N r5 = new kotlin.jvm.internal.N
            r5.<init>()
            Ni.C r2 = Mi.r.f13298a
            r5.f51689a = r2
            Li.u$a r2 = new Li.u$a
            r2.<init>(r5)
            r0.f12009a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f12010b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f12012d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.b(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r1 = r5
            goto L69
        L5b:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5f:
            Mi.n.a(r5, r4)
            dh.i r4 = r0.getContext()
            Ii.A0.l(r4)
        L69:
            java.lang.Object r4 = r1.f51689a
            Ni.C r5 = Mi.r.f13298a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Li.u.a(Li.g, dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(Li.InterfaceC3220g r4, mh.InterfaceC6839p r5, dh.InterfaceC5380e r6) {
        /*
            boolean r0 = r6 instanceof Li.u.d
            if (r0 == 0) goto L13
            r0 = r6
            Li.u$d r0 = (Li.u.d) r0
            int r1 = r0.f12016d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12016d = r1
            goto L18
        L13:
            Li.u$d r0 = new Li.u$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12015c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f12016d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f12014b
            Li.u$b r4 = (Li.u.b) r4
            java.lang.Object r5 = r0.f12013a
            kotlin.jvm.internal.N r5 = (kotlin.jvm.internal.N) r5
            Yg.v.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L69
        L31:
            r6 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            Yg.v.b(r6)
            kotlin.jvm.internal.N r6 = new kotlin.jvm.internal.N
            r6.<init>()
            Ni.C r2 = Mi.r.f13298a
            r6.f51689a = r2
            Li.u$b r2 = new Li.u$b
            r2.<init>(r5, r6)
            r0.f12013a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f12014b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f12016d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.b(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r5 = r6
            goto L69
        L5b:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5f:
            Mi.n.a(r6, r4)
            dh.i r4 = r0.getContext()
            Ii.A0.l(r4)
        L69:
            java.lang.Object r4 = r5.f51689a
            Ni.C r5 = Mi.r.f13298a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Li.u.b(Li.g, mh.p, dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(Li.InterfaceC3220g r4, dh.InterfaceC5380e r5) {
        /*
            boolean r0 = r5 instanceof Li.u.f
            if (r0 == 0) goto L13
            r0 = r5
            Li.u$f r0 = (Li.u.f) r0
            int r1 = r0.f12021d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12021d = r1
            goto L18
        L13:
            Li.u$f r0 = new Li.u$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12020c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f12021d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f12019b
            Li.u$e r4 = (Li.u.e) r4
            java.lang.Object r1 = r0.f12018a
            kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
            Yg.v.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L65
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            Yg.v.b(r5)
            kotlin.jvm.internal.N r5 = new kotlin.jvm.internal.N
            r5.<init>()
            Li.u$e r2 = new Li.u$e
            r2.<init>(r5)
            r0.f12018a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f12019b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f12021d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.b(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r1 = r5
            goto L65
        L57:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5b:
            Mi.n.a(r5, r4)
            dh.i r4 = r0.getContext()
            Ii.A0.l(r4)
        L65:
            java.lang.Object r4 = r1.f51689a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Li.u.c(Li.g, dh.e):java.lang.Object");
    }
}
