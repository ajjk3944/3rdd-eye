package y1;

import c9.C2087h;
import java.util.concurrent.atomic.AtomicBoolean;
import w1.r;
import x1.C5756b;

/* compiled from: ConnectionPoolImpl.kt */
/* loaded from: classes.dex */
public final class k implements r, p {

    /* renamed from: a, reason: collision with root package name */
    public final C5797h f47964a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47965b;

    /* renamed from: c, reason: collision with root package name */
    public final C2087h<c> f47966c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f47967d;

    /* compiled from: ConnectionPoolImpl.kt */
    public final class a implements E1.c {

        /* renamed from: b, reason: collision with root package name */
        public final E1.c f47968b;

        /* renamed from: c, reason: collision with root package name */
        public final long f47969c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f47970d;

        public a(k kVar, E1.c delegate) {
            kotlin.jvm.internal.l.f(delegate, "delegate");
            this.f47970d = kVar;
            this.f47968b = delegate;
            this.f47969c = C5756b.a();
        }

        @Override // E1.c
        public final void Q(int i, String value) {
            kotlin.jvm.internal.l.f(value, "value");
            if (this.f47970d.f47967d.get()) {
                A2.l.G(21, "Statement is recycled");
                throw null;
            }
            if (this.f47969c == C5756b.a()) {
                this.f47968b.Q(i, value);
            } else {
                A2.l.G(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // E1.c
        public final boolean T() {
            return getLong(0) != 0;
        }

        @Override // E1.c
        public final void b(int i, long j4) {
            if (this.f47970d.f47967d.get()) {
                A2.l.G(21, "Statement is recycled");
                throw null;
            }
            if (this.f47969c == C5756b.a()) {
                this.f47968b.b(i, j4);
            } else {
                A2.l.G(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws Exception {
            if (this.f47970d.f47967d.get()) {
                A2.l.G(21, "Statement is recycled");
                throw null;
            }
            if (this.f47969c == C5756b.a()) {
                this.f47968b.close();
            } else {
                A2.l.G(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // E1.c
        public final void f(int i) {
            if (this.f47970d.f47967d.get()) {
                A2.l.G(21, "Statement is recycled");
                throw null;
            }
            if (this.f47969c == C5756b.a()) {
                this.f47968b.f(i);
            } else {
                A2.l.G(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // E1.c
        public final String g0(int i) {
            if (this.f47970d.f47967d.get()) {
                A2.l.G(21, "Statement is recycled");
                throw null;
            }
            if (this.f47969c == C5756b.a()) {
                return this.f47968b.g0(i);
            }
            A2.l.G(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // E1.c
        public final int getColumnCount() {
            if (this.f47970d.f47967d.get()) {
                A2.l.G(21, "Statement is recycled");
                throw null;
            }
            if (this.f47969c == C5756b.a()) {
                return this.f47968b.getColumnCount();
            }
            A2.l.G(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // E1.c
        public final String getColumnName(int i) {
            if (this.f47970d.f47967d.get()) {
                A2.l.G(21, "Statement is recycled");
                throw null;
            }
            if (this.f47969c == C5756b.a()) {
                return this.f47968b.getColumnName(i);
            }
            A2.l.G(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // E1.c
        public final long getLong(int i) {
            if (this.f47970d.f47967d.get()) {
                A2.l.G(21, "Statement is recycled");
                throw null;
            }
            if (this.f47969c == C5756b.a()) {
                return this.f47968b.getLong(i);
            }
            A2.l.G(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // E1.c
        public final boolean isNull(int i) {
            if (this.f47970d.f47967d.get()) {
                A2.l.G(21, "Statement is recycled");
                throw null;
            }
            if (this.f47969c == C5756b.a()) {
                return this.f47968b.isNull(i);
            }
            A2.l.G(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // E1.c
        public final void reset() {
            if (this.f47970d.f47967d.get()) {
                A2.l.G(21, "Statement is recycled");
                throw null;
            }
            if (this.f47969c == C5756b.a()) {
                this.f47968b.reset();
            } else {
                A2.l.G(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // E1.c
        public final boolean x() {
            if (this.f47970d.f47967d.get()) {
                A2.l.G(21, "Statement is recycled");
                throw null;
            }
            if (this.f47969c == C5756b.a()) {
                return this.f47968b.x();
            }
            A2.l.G(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    /* compiled from: ConnectionPoolImpl.kt */
    public final class b<T> implements w1.q<T>, p {
        public b() {
        }

        @Override // w1.g
        public final Object a(String str, p9.l lVar, h9.c cVar) {
            return k.this.a(str, lVar, cVar);
        }

        @Override // y1.p
        public final E1.a d() {
            return k.this.f47964a;
        }
    }

    /* compiled from: ConnectionPoolImpl.kt */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f47972a;

        public c(int i) {
            this.f47972a = i;
        }
    }

    /* compiled from: ConnectionPoolImpl.kt */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47973a;

        static {
            int[] iArr = new int[r.a.values().length];
            try {
                iArr[r.a.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.a.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.a.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f47973a = iArr;
        }
    }

    public k(C5797h delegate, boolean z10) {
        kotlin.jvm.internal.l.f(delegate, "delegate");
        this.f47964a = delegate;
        this.f47965b = z10;
        this.f47966c = new C2087h<>();
        this.f47967d = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // w1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r7, p9.l r8, h9.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof y1.o
            if (r0 == 0) goto L13
            r0 = r9
            y1.o r0 = (y1.o) r0
            int r1 = r0.f47998r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47998r = r1
            goto L18
        L13:
            y1.o r0 = new y1.o
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f47996p
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f47998r
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            y1.h r7 = r0.f47995o
            p9.l r8 = r0.f47994n
            java.lang.String r1 = r0.f47993m
            y1.k r0 = r0.f47992l
            b9.n.b(r9)
            r9 = r7
            r7 = r1
            goto L6f
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            b9.n.b(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r6.f47967d
            boolean r9 = r9.get()
            r2 = 21
            if (r9 != 0) goto L97
            f9.h r9 = r0.getContext()
            y1.a$a r5 = y1.C5790a.f47921c
            f9.h$a r9 = r9.get(r5)
            y1.a r9 = (y1.C5790a) r9
            if (r9 == 0) goto L91
            y1.k r9 = r9.f47922b
            if (r9 != r6) goto L91
            r0.f47992l = r6
            r0.f47993m = r7
            r0.f47994n = r8
            y1.h r9 = r6.f47964a
            r0.f47995o = r9
            r0.f47998r = r4
            K9.a r2 = r9.f47949c
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L6e
            return r1
        L6e:
            r0 = r6
        L6f:
            y1.k$a r1 = new y1.k$a     // Catch: java.lang.Throwable -> L8c
            y1.h r2 = r0.f47964a     // Catch: java.lang.Throwable -> L8c
            E1.c r7 = r2.K0(r7)     // Catch: java.lang.Throwable -> L8c
            r1.<init>(r0, r7)     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r7 = r8.invoke(r1)     // Catch: java.lang.Throwable -> L85
            r1.close()     // Catch: java.lang.Throwable -> L8c
            r9.c(r3)
            return r7
        L85:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L87
        L87:
            r8 = move-exception
            k8.F.d(r1, r7)     // Catch: java.lang.Throwable -> L8c
            throw r8     // Catch: java.lang.Throwable -> L8c
        L8c:
            r7 = move-exception
            r9.c(r3)
            throw r7
        L91:
            java.lang.String r7 = "Attempted to use connection on a different coroutine"
            A2.l.G(r2, r7)
            throw r3
        L97:
            java.lang.String r7 = "Connection is recycled"
            A2.l.G(r2, r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.k.a(java.lang.String, p9.l, h9.c):java.lang.Object");
    }

    @Override // w1.r
    public final Object b(h9.i iVar) {
        if (this.f47967d.get()) {
            A2.l.G(21, "Connection is recycled");
            throw null;
        }
        C5790a c5790a = (C5790a) iVar.getContext().get(C5790a.f47921c);
        if (c5790a != null && c5790a.f47922b == this) {
            return Boolean.valueOf(!this.f47966c.isEmpty());
        }
        A2.l.G(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // w1.r
    public final Object c(r.a aVar, p9.p pVar, h9.i iVar) {
        if (this.f47967d.get()) {
            A2.l.G(21, "Connection is recycled");
            throw null;
        }
        C5790a c5790a = (C5790a) iVar.getContext().get(C5790a.f47921c);
        if (c5790a != null && c5790a.f47922b == this) {
            return g(aVar, pVar, iVar);
        }
        A2.l.G(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // y1.p
    public final E1.a d() {
        return this.f47964a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(w1.r.a r8, h9.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "SAVEPOINT '"
            boolean r1 = r9 instanceof y1.l
            if (r1 == 0) goto L15
            r1 = r9
            y1.l r1 = (y1.l) r1
            int r2 = r1.f47979q
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f47979q = r2
            goto L1a
        L15:
            y1.l r1 = new y1.l
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f47977o
            g9.a r2 = g9.a.COROUTINE_SUSPENDED
            int r3 = r1.f47979q
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            y1.h r8 = r1.f47976n
            w1.r$a r2 = r1.f47975m
            y1.k r1 = r1.f47974l
            b9.n.b(r9)
            r9 = r8
            r8 = r2
            goto L50
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            b9.n.b(r9)
            r1.f47974l = r7
            r1.f47975m = r8
            y1.h r9 = r7.f47964a
            r1.f47976n = r9
            r1.f47979q = r4
            K9.a r3 = r9.f47949c
            java.lang.Object r1 = r3.a(r1)
            if (r1 != r2) goto L4f
            return r2
        L4f:
            r1 = r7
        L50:
            r2 = 0
            c9.h<y1.k$c> r3 = r1.f47966c     // Catch: java.lang.Throwable -> L73
            int r5 = r3.f18574d     // Catch: java.lang.Throwable -> L73
            boolean r6 = r3.isEmpty()     // Catch: java.lang.Throwable -> L73
            y1.h r1 = r1.f47964a
            if (r6 == 0) goto L87
            int[] r0 = y1.k.d.f47973a     // Catch: java.lang.Throwable -> L73
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L73
            r8 = r0[r8]     // Catch: java.lang.Throwable -> L73
            if (r8 == r4) goto L81
            r0 = 2
            if (r8 == r0) goto L7b
            r0 = 3
            if (r8 != r0) goto L75
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            A2.l.v(r1, r8)     // Catch: java.lang.Throwable -> L73
            goto L9b
        L73:
            r8 = move-exception
            goto La9
        L75:
            b9.j r8 = new b9.j     // Catch: java.lang.Throwable -> L73
            r8.<init>()     // Catch: java.lang.Throwable -> L73
            throw r8     // Catch: java.lang.Throwable -> L73
        L7b:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            A2.l.v(r1, r8)     // Catch: java.lang.Throwable -> L73
            goto L9b
        L81:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            A2.l.v(r1, r8)     // Catch: java.lang.Throwable -> L73
            goto L9b
        L87:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L73
            r8.append(r5)     // Catch: java.lang.Throwable -> L73
            r0 = 39
            r8.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L73
            A2.l.v(r1, r8)     // Catch: java.lang.Throwable -> L73
        L9b:
            y1.k$c r8 = new y1.k$c     // Catch: java.lang.Throwable -> L73
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L73
            r3.e(r8)     // Catch: java.lang.Throwable -> L73
            b9.A r8 = b9.C1992A.f18074a     // Catch: java.lang.Throwable -> L73
            r9.c(r2)
            return r8
        La9:
            r9.c(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.k.e(w1.r$a, h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(boolean r8, h9.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r1 = "RELEASE SAVEPOINT '"
            boolean r2 = r9 instanceof y1.m
            if (r2 == 0) goto L17
            r2 = r9
            y1.m r2 = (y1.m) r2
            int r3 = r2.f47985q
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f47985q = r3
            goto L1c
        L17:
            y1.m r2 = new y1.m
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.f47983o
            g9.a r3 = g9.a.COROUTINE_SUSPENDED
            int r4 = r2.f47985q
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            boolean r8 = r2.f47982n
            y1.h r3 = r2.f47981m
            y1.k r2 = r2.f47980l
            b9.n.b(r9)
            goto L51
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            b9.n.b(r9)
            r2.f47980l = r7
            y1.h r9 = r7.f47964a
            r2.f47981m = r9
            r2.f47982n = r8
            r2.f47985q = r5
            K9.a r4 = r9.f47949c
            java.lang.Object r2 = r4.a(r2)
            if (r2 != r3) goto L4f
            return r3
        L4f:
            r2 = r7
            r3 = r9
        L51:
            r9 = 0
            c9.h<y1.k$c> r4 = r2.f47966c     // Catch: java.lang.Throwable -> L75
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r5 != 0) goto Lb2
            java.lang.Object r5 = c9.C2095p.g0(r4)     // Catch: java.lang.Throwable -> L75
            y1.k$c r5 = (y1.k.c) r5     // Catch: java.lang.Throwable -> L75
            r6 = 39
            y1.h r2 = r2.f47964a
            if (r8 == 0) goto L8c
            r5.getClass()     // Catch: java.lang.Throwable -> L75
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L77
            java.lang.String r8 = "END TRANSACTION"
            A2.l.v(r2, r8)     // Catch: java.lang.Throwable -> L75
            goto Lac
        L75:
            r8 = move-exception
            goto Lba
        L77:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L75
            int r0 = r5.f47972a     // Catch: java.lang.Throwable -> L75
            r8.append(r0)     // Catch: java.lang.Throwable -> L75
            r8.append(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L75
            A2.l.v(r2, r8)     // Catch: java.lang.Throwable -> L75
            goto Lac
        L8c:
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L98
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            A2.l.v(r2, r8)     // Catch: java.lang.Throwable -> L75
            goto Lac
        L98:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L75
            int r0 = r5.f47972a     // Catch: java.lang.Throwable -> L75
            r8.append(r0)     // Catch: java.lang.Throwable -> L75
            r8.append(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L75
            A2.l.v(r2, r8)     // Catch: java.lang.Throwable -> L75
        Lac:
            b9.A r8 = b9.C1992A.f18074a     // Catch: java.lang.Throwable -> L75
            r3.c(r9)
            return r8
        Lb2:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "Not in a transaction"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L75
            throw r8     // Catch: java.lang.Throwable -> L75
        Lba:
            r3.c(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.k.f(boolean, h9.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(1:(1:(2:15|16)(4:17|75|18|69))(2:22|23))(2:24|25))(6:26|81|27|(1:44)|45|(1:63)(1:48)))(1:31))(5:32|(1:34)|35|(1:38)|63)|77|39|(4:42|(0)|45|(0))|63|(2:(1:72)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
    
        r13 = r12;
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
    
        r0.f47986l = null;
        r0.f47987m = null;
        r0.f47991q = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ba, code lost:
    
        if (r13.f(false, r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bd, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00be, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bf, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c0, code lost:
    
        r9 = r12;
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c4, code lost:
    
        r0.f47986l = r9;
        r0.f47987m = r12;
        r0.f47991q = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ce, code lost:
    
        if (r13.f(false, r0) != r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d1, code lost:
    
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d7, code lost:
    
        b9.x.a(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00db, code lost:
    
        throw r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(w1.r.a r12, p9.p r13, h9.c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.k.g(w1.r$a, p9.p, h9.c):java.lang.Object");
    }
}
