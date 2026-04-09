package w1;

import b9.C1992A;
import f9.InterfaceC4347e;
import w1.f;

/* compiled from: InvalidationTracker.kt */
@h9.e(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", l = {301, 309}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class C extends h9.i implements p9.p<r, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f47179l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f47180m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f47181n;

    /* compiled from: InvalidationTracker.kt */
    @h9.e(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1", f = "InvalidationTracker.kt", l = {313, 314}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<q<C1992A>, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public f.a[] f47182l;

        /* renamed from: m, reason: collision with root package name */
        public u f47183m;

        /* renamed from: n, reason: collision with root package name */
        public r f47184n;

        /* renamed from: o, reason: collision with root package name */
        public int f47185o;

        /* renamed from: p, reason: collision with root package name */
        public int f47186p;

        /* renamed from: q, reason: collision with root package name */
        public int f47187q;

        /* renamed from: r, reason: collision with root package name */
        public int f47188r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ f.a[] f47189s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ u f47190t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ r f47191u;

        /* compiled from: InvalidationTracker.kt */
        /* renamed from: w1.C$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0542a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f47192a;

            static {
                int[] iArr = new int[f.a.values().length];
                try {
                    iArr[f.a.NO_OP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f.a.ADD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[f.a.REMOVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f47192a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f.a[] aVarArr, u uVar, r rVar, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f47189s = aVarArr;
            this.f47190t = uVar;
            this.f47191u = rVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f47189s, this.f47190t, this.f47191u, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(q<C1992A> qVar, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(qVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
        
            if (w1.u.c(r7, r6, r12, r11) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
        
            r5 = r9;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007a -> B:27:0x007b). Please report as a decompilation issue!!! */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                g9.a r0 = g9.a.COROUTINE_SUSPENDED
                int r1 = r11.f47188r
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L24
                if (r1 == r2) goto Lc
                if (r1 != r3) goto L1c
            Lc:
                int r1 = r11.f47187q
                int r4 = r11.f47186p
                int r5 = r11.f47185o
                w1.r r6 = r11.f47184n
                w1.u r7 = r11.f47183m
                w1.f$a[] r8 = r11.f47182l
                b9.n.b(r12)
                goto L5d
            L1c:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L24:
                b9.n.b(r12)
                w1.f$a[] r12 = r11.f47189s
                int r1 = r12.length
                r4 = 0
                w1.u r5 = r11.f47190t
                w1.r r6 = r11.f47191u
                r8 = r12
                r12 = r4
                r7 = r5
            L32:
                if (r4 >= r1) goto L7d
                r5 = r8[r4]
                int r9 = r12 + 1
                int[] r10 = w1.C.a.C0542a.f47192a
                int r5 = r5.ordinal()
                r5 = r10[r5]
                if (r5 == r2) goto L7a
                if (r5 == r3) goto L65
                r10 = 3
                if (r5 != r10) goto L5f
                r11.f47182l = r8
                r11.f47183m = r7
                r11.f47184n = r6
                r11.f47185o = r9
                r11.f47186p = r4
                r11.f47187q = r1
                r11.f47188r = r3
                java.lang.Object r12 = w1.u.d(r7, r6, r12, r11)
                if (r12 != r0) goto L5c
                goto L79
            L5c:
                r5 = r9
            L5d:
                r12 = r5
                goto L7b
            L5f:
                b9.j r12 = new b9.j
                r12.<init>()
                throw r12
            L65:
                r11.f47182l = r8
                r11.f47183m = r7
                r11.f47184n = r6
                r11.f47185o = r9
                r11.f47186p = r4
                r11.f47187q = r1
                r11.f47188r = r2
                java.lang.Object r12 = w1.u.c(r7, r6, r12, r11)
                if (r12 != r0) goto L5c
            L79:
                return r0
            L7a:
                r12 = r9
            L7b:
                int r4 = r4 + r2
                goto L32
            L7d:
                b9.A r12 = b9.C1992A.f18074a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: w1.C.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(u uVar, InterfaceC4347e<? super C> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f47181n = uVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        C c10 = new C(this.f47181n, interfaceC4347e);
        c10.f47180m = obj;
        return c10;
    }

    @Override // p9.p
    public final Object invoke(r rVar, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((C) create(rVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        if (r2.c(r3, r6, r19) == r0) goto L48;
     */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r2 = r1.f47179l
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L25
            if (r2 == r3) goto L1b
            if (r2 != r4) goto L13
            b9.n.b(r20)
            goto La4
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L1b:
            java.lang.Object r2 = r1.f47180m
            w1.r r2 = (w1.r) r2
            b9.n.b(r20)
            r5 = r20
            goto L38
        L25:
            b9.n.b(r20)
            java.lang.Object r2 = r1.f47180m
            w1.r r2 = (w1.r) r2
            r1.f47180m = r2
            r1.f47179l = r3
            java.lang.Object r5 = r2.b(r1)
            if (r5 != r0) goto L38
            goto La3
        L38:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L43
            b9.A r0 = b9.C1992A.f18074a
            return r0
        L43:
            w1.u r5 = r1.f47181n
            w1.f r6 = r5.f47291h
            long[] r7 = r6.f47222b
            java.util.concurrent.locks.ReentrantLock r8 = r6.f47221a
            r8.lock()
            boolean r9 = r6.f47224d     // Catch: java.lang.Throwable -> L7b
            r10 = 0
            if (r9 != 0) goto L58
            r8.unlock()
            r12 = r10
            goto L90
        L58:
            r9 = 0
            r6.f47224d = r9     // Catch: java.lang.Throwable -> L7b
            int r11 = r7.length     // Catch: java.lang.Throwable -> L7b
            w1.f$a[] r12 = new w1.f.a[r11]     // Catch: java.lang.Throwable -> L7b
            r13 = r9
            r14 = r13
        L60:
            if (r13 >= r11) goto L89
            r15 = r7[r13]     // Catch: java.lang.Throwable -> L7b
            r17 = 0
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 <= 0) goto L6c
            r15 = r3
            goto L6d
        L6c:
            r15 = r9
        L6d:
            boolean[] r3 = r6.f47223c     // Catch: java.lang.Throwable -> L7b
            boolean r9 = r3[r13]     // Catch: java.lang.Throwable -> L7b
            if (r15 == r9) goto L80
            r3[r13] = r15     // Catch: java.lang.Throwable -> L7b
            if (r15 == 0) goto L7d
            w1.f$a r3 = w1.f.a.ADD     // Catch: java.lang.Throwable -> L7b
        L79:
            r14 = 1
            goto L82
        L7b:
            r0 = move-exception
            goto La7
        L7d:
            w1.f$a r3 = w1.f.a.REMOVE     // Catch: java.lang.Throwable -> L7b
            goto L79
        L80:
            w1.f$a r3 = w1.f.a.NO_OP     // Catch: java.lang.Throwable -> L7b
        L82:
            r12[r13] = r3     // Catch: java.lang.Throwable -> L7b
            int r13 = r13 + 1
            r3 = 1
            r9 = 0
            goto L60
        L89:
            if (r14 == 0) goto L8c
            goto L8d
        L8c:
            r12 = r10
        L8d:
            r8.unlock()
        L90:
            if (r12 == 0) goto La4
            w1.r$a r3 = w1.r.a.IMMEDIATE
            w1.C$a r6 = new w1.C$a
            r6.<init>(r12, r5, r2, r10)
            r1.f47180m = r10
            r1.f47179l = r4
            java.lang.Object r2 = r2.c(r3, r6, r1)
            if (r2 != r0) goto La4
        La3:
            return r0
        La4:
            b9.A r0 = b9.C1992A.f18074a
            return r0
        La7:
            r8.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.C.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
