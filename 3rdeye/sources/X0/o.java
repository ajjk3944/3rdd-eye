package X0;

import A9.C0597q;
import A9.E;
import D9.C0652n;
import D9.InterfaceC0644f;
import D9.InterfaceC0645g;
import D9.J;
import D9.N;
import b9.C1992A;
import b9.C2001h;
import c9.C2097r;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import p9.InterfaceC5480a;

/* compiled from: SingleProcessDataStore.kt */
/* loaded from: classes.dex */
public final class o<T> implements h<T> {

    /* renamed from: k, reason: collision with root package name */
    public static final LinkedHashSet f13452k = new LinkedHashSet();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f13453l = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f13454a;

    /* renamed from: b, reason: collision with root package name */
    public final l<T> f13455b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1639b<T> f13456c;

    /* renamed from: d, reason: collision with root package name */
    public final E f13457d;

    /* renamed from: e, reason: collision with root package name */
    public final D9.B f13458e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13459f;

    /* renamed from: g, reason: collision with root package name */
    public final b9.p f13460g;

    /* renamed from: h, reason: collision with root package name */
    public final J f13461h;
    public List<? extends p9.p<? super j<T>, ? super InterfaceC4347e<? super C1992A>, ? extends Object>> i;

    /* renamed from: j, reason: collision with root package name */
    public final n f13462j;

    /* compiled from: SingleProcessDataStore.kt */
    public static abstract class a<T> {

        /* compiled from: SingleProcessDataStore.kt */
        /* renamed from: X0.o$a$a, reason: collision with other inner class name */
        public static final class C0194a<T> extends a<T> {

            /* renamed from: a, reason: collision with root package name */
            public final B<T> f13463a;

            public C0194a(B<T> b10) {
                this.f13463a = b10;
            }
        }

        /* compiled from: SingleProcessDataStore.kt */
        public static final class b<T> extends a<T> {

            /* renamed from: a, reason: collision with root package name */
            public final h9.i f13464a;

            /* renamed from: b, reason: collision with root package name */
            public final C0597q f13465b;

            /* renamed from: c, reason: collision with root package name */
            public final B<T> f13466c;

            /* renamed from: d, reason: collision with root package name */
            public final InterfaceC4350h f13467d;

            /* JADX WARN: Multi-variable type inference failed */
            public b(p9.p pVar, C0597q c0597q, B b10, InterfaceC4350h callerContext) {
                kotlin.jvm.internal.l.f(callerContext, "callerContext");
                this.f13464a = (h9.i) pVar;
                this.f13465b = c0597q;
                this.f13466c = b10;
                this.f13467d = callerContext;
            }
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    public static final class b extends OutputStream {

        /* renamed from: b, reason: collision with root package name */
        public final FileOutputStream f13468b;

        public b(FileOutputStream fileOutputStream) {
            this.f13468b = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f13468b.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            this.f13468b.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] b10) throws IOException {
            kotlin.jvm.internal.l.f(b10, "b");
            this.f13468b.write(b10);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bytes, int i, int i10) {
            kotlin.jvm.internal.l.f(bytes, "bytes");
            this.f13468b.write(bytes, i, i10);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Throwable, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ o<T> f13469g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o<T> oVar) {
            super(1);
            this.f13469g = oVar;
        }

        @Override // p9.l
        public final C1992A invoke(Throwable th) {
            Throwable th2 = th;
            if (th2 != null) {
                J j4 = this.f13469g.f13461h;
                i iVar = new i(th2);
                j4.getClass();
                j4.g(null, iVar);
            }
            Object obj = o.f13453l;
            o<T> oVar = this.f13469g;
            synchronized (obj) {
                o.f13452k.remove(oVar.c().getAbsolutePath());
            }
            return C1992A.f18074a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    public static final class d extends kotlin.jvm.internal.m implements p9.p<a<T>, Throwable, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public static final d f13470g = new d(2);

        @Override // p9.p
        public final C1992A invoke(Object obj, Throwable th) {
            a msg = (a) obj;
            Throwable cancellationException = th;
            kotlin.jvm.internal.l.f(msg, "msg");
            if (msg instanceof a.b) {
                a.b bVar = (a.b) msg;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                bVar.f13465b.p0(cancellationException);
            }
            return C1992A.f18074a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @h9.e(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
    public static final class e extends h9.i implements p9.p<a<T>, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f13471l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f13472m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ o<T> f13473n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(o<T> oVar, InterfaceC4347e<? super e> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f13473n = oVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            e eVar = new e(this.f13473n, interfaceC4347e);
            eVar.f13472m = obj;
            return eVar;
        }

        @Override // p9.p
        public final Object invoke(Object obj, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((e) create((a) obj, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
        
            if (r6 == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
        
            if (X0.o.b(r4, (X0.o.a.b) r6, r5) == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
        
            return r0;
         */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                g9.a r0 = g9.a.COROUTINE_SUSPENDED
                int r1 = r5.f13471l
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L15:
                b9.n.b(r6)
                goto L7b
            L19:
                b9.n.b(r6)
                java.lang.Object r6 = r5.f13472m
                X0.o$a r6 = (X0.o.a) r6
                boolean r1 = r6 instanceof X0.o.a.C0194a
                X0.o<T> r4 = r5.f13473n
                if (r1 == 0) goto L6c
                X0.o$a$a r6 = (X0.o.a.C0194a) r6
                r5.f13471l = r3
                D9.J r1 = r4.f13461h
                java.lang.Object r1 = r1.getValue()
                X0.B r1 = (X0.B) r1
                boolean r2 = r1 instanceof X0.C1640c
                if (r2 == 0) goto L37
                goto L5f
            L37:
                boolean r2 = r1 instanceof X0.k
                if (r2 == 0) goto L49
                X0.B<T> r6 = r6.f13463a
                if (r1 != r6) goto L5f
                java.lang.Object r6 = r4.f(r5)
                if (r6 != r0) goto L46
                goto L61
            L46:
                b9.A r6 = b9.C1992A.f18074a
                goto L61
            L49:
                X0.C r6 = X0.C.f13424a
                boolean r6 = kotlin.jvm.internal.l.b(r1, r6)
                if (r6 == 0) goto L5b
                java.lang.Object r6 = r4.f(r5)
                if (r6 != r0) goto L58
                goto L61
            L58:
                b9.A r6 = b9.C1992A.f18074a
                goto L61
            L5b:
                boolean r6 = r1 instanceof X0.i
                if (r6 != 0) goto L64
            L5f:
                b9.A r6 = b9.C1992A.f18074a
            L61:
                if (r6 != r0) goto L7b
                goto L7a
            L64:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Can't read in final state."
                r6.<init>(r0)
                throw r6
            L6c:
                boolean r1 = r6 instanceof X0.o.a.b
                if (r1 == 0) goto L7b
                X0.o$a$b r6 = (X0.o.a.b) r6
                r5.f13471l = r2
                java.lang.Object r6 = X0.o.b(r4, r6, r5)
                if (r6 != r0) goto L7b
            L7a:
                return r0
            L7b:
                b9.A r6 = b9.C1992A.f18074a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: X0.o.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @h9.e(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
    public static final class f extends h9.i implements p9.p<InterfaceC0645g<? super T>, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f13474l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f13475m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ o<T> f13476n;

        /* compiled from: SingleProcessDataStore.kt */
        @h9.e(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
        public static final class a extends h9.i implements p9.p<B<T>, InterfaceC4347e<? super Boolean>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f13477l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ B<T> f13478m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(B<T> b10, InterfaceC4347e<? super a> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f13478m = b10;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                a aVar = new a(this.f13478m, interfaceC4347e);
                aVar.f13477l = obj;
                return aVar;
            }

            @Override // p9.p
            public final Object invoke(Object obj, InterfaceC4347e<? super Boolean> interfaceC4347e) {
                return ((a) create((B) obj, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                b9.n.b(obj);
                B<T> b10 = (B) this.f13477l;
                B<T> b11 = this.f13478m;
                boolean z10 = false;
                if (!(b11 instanceof C1640c) && !(b11 instanceof i) && b10 == b11) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(o<T> oVar, InterfaceC4347e<? super f> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f13476n = oVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            f fVar = new f(this.f13476n, interfaceC4347e);
            fVar.f13475m = obj;
            return fVar;
        }

        @Override // p9.p
        public final Object invoke(Object obj, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((f) create((InterfaceC0645g) obj, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) throws Throwable {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f13474l;
            if (i == 0) {
                b9.n.b(obj);
                InterfaceC0645g interfaceC0645g = (InterfaceC0645g) this.f13475m;
                o<T> oVar = this.f13476n;
                B b10 = (B) oVar.f13461h.getValue();
                if (!(b10 instanceof C1640c)) {
                    oVar.f13462j.a(new a.C0194a(b10));
                }
                a aVar2 = new a(b10, null);
                this.f13474l = 1;
                if (interfaceC0645g instanceof N) {
                    ((N) interfaceC0645g).getClass();
                    throw null;
                }
                Object objB = oVar.f13461h.b(new C0652n(new kotlin.jvm.internal.t(), new p(interfaceC0645g), aVar2), this);
                if (objB != aVar) {
                    objB = C1992A.f18074a;
                }
                if (objB != aVar) {
                    objB = C1992A.f18074a;
                }
                if (objB != aVar) {
                    objB = C1992A.f18074a;
                }
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    public static final class g extends kotlin.jvm.internal.m implements InterfaceC5480a<File> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ o<T> f13479g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(o<T> oVar) {
            super(0);
            this.f13479g = oVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.m, p9.a] */
        @Override // p9.InterfaceC5480a
        public final File invoke() {
            File file = (File) this.f13479g.f13454a.invoke();
            String it = file.getAbsolutePath();
            synchronized (o.f13453l) {
                LinkedHashSet linkedHashSet = o.f13452k;
                if (linkedHashSet.contains(it)) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                kotlin.jvm.internal.l.e(it, "it");
                linkedHashSet.add(it);
            }
            return file;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(InterfaceC5480a<? extends File> interfaceC5480a, l<T> serializer, List<? extends p9.p<? super j<T>, ? super InterfaceC4347e<? super C1992A>, ? extends Object>> list, InterfaceC1639b<T> interfaceC1639b, E e4) {
        kotlin.jvm.internal.l.f(serializer, "serializer");
        this.f13454a = (kotlin.jvm.internal.m) interfaceC5480a;
        this.f13455b = serializer;
        this.f13456c = interfaceC1639b;
        this.f13457d = e4;
        this.f13458e = new D9.B(new f(this, null));
        this.f13459f = ".tmp";
        this.f13460g = C2001h.b(new g(this));
        this.f13461h = D9.E.c(C.f13424a);
        this.i = C2097r.G0(list);
        this.f13462j = new n(e4, new c(this), d.f13470g, new e(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        if (r8 != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r2v10, types: [h9.i, p9.p] */
    /* JADX WARN: Type inference failed for: r2v3, types: [h9.i, p9.p] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X0.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [X0.o] */
    /* JADX WARN: Type inference failed for: r8v12, types: [A9.p] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(X0.o r8, X0.o.a.b r9, h9.c r10) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.o.b(X0.o, X0.o$a$b, h9.c):java.lang.Object");
    }

    @Override // X0.h
    public final Object a(p9.p pVar, h9.c cVar) throws Throwable {
        C0597q c0597q = new C0597q();
        this.f13462j.a(new a.b(pVar, c0597q, (B) this.f13461h.getValue(), cVar.getContext()));
        Object objT = c0597q.t(cVar);
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        return objT;
    }

    public final File c() {
        return (File) this.f13460g.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(h9.c r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.o.d(h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(h9.c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X0.u
            if (r0 == 0) goto L13
            r0 = r5
            X0.u r0 = (X0.u) r0
            int r1 = r0.f13514o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13514o = r1
            goto L18
        L13:
            X0.u r0 = new X0.u
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13512m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f13514o
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            X0.o r0 = r0.f13511l
            b9.n.b(r5)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            b9.n.b(r5)
            r0.f13511l = r4     // Catch: java.lang.Throwable -> L46
            r0.f13514o = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L46
            if (r5 != r1) goto L41
            return r1
        L41:
            b9.A r5 = b9.C1992A.f18074a
            return r5
        L44:
            r0 = r4
            goto L48
        L46:
            r5 = move-exception
            goto L44
        L48:
            D9.J r0 = r0.f13461h
            X0.k r1 = new X0.k
            r1.<init>(r5)
            r0.getClass()
            r2 = 0
            r0.g(r2, r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.o.e(h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(h9.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X0.v
            if (r0 == 0) goto L13
            r0 = r5
            X0.v r0 = (X0.v) r0
            int r1 = r0.f13518o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13518o = r1
            goto L18
        L13:
            X0.v r0 = new X0.v
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13516m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f13518o
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            X0.o r0 = r0.f13515l
            b9.n.b(r5)     // Catch: java.lang.Throwable -> L29
            goto L53
        L29:
            r5 = move-exception
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            b9.n.b(r5)
            r0.f13515l = r4     // Catch: java.lang.Throwable -> L43
            r0.f13518o = r3     // Catch: java.lang.Throwable -> L43
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L43
            if (r5 != r1) goto L53
            return r1
        L41:
            r0 = r4
            goto L45
        L43:
            r5 = move-exception
            goto L41
        L45:
            D9.J r0 = r0.f13461h
            X0.k r1 = new X0.k
            r1.<init>(r5)
            r0.getClass()
            r5 = 0
            r0.g(r5, r1)
        L53:
            b9.A r5 = b9.C1992A.f18074a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.o.f(h9.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [X0.o] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [X0.w] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [X0.o] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(h9.c r5) throws java.io.FileNotFoundException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X0.w
            if (r0 == 0) goto L13
            r0 = r5
            X0.w r0 = (X0.w) r0
            int r1 = r0.f13523p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13523p = r1
            goto L18
        L13:
            X0.w r0 = new X0.w
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13521n
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f13523p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileInputStream r1 = r0.f13520m
            X0.o r0 = r0.f13519l
            b9.n.b(r5)     // Catch: java.lang.Throwable -> L2b
            goto L53
        L2b:
            r5 = move-exception
            goto L60
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            b9.n.b(r5)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L66
            java.io.File r2 = r4.c()     // Catch: java.io.FileNotFoundException -> L66
            r5.<init>(r2)     // Catch: java.io.FileNotFoundException -> L66
            X0.l<T> r2 = r4.f13455b     // Catch: java.lang.Throwable -> L5e
            r0.f13519l = r4     // Catch: java.lang.Throwable -> L5e
            r0.f13520m = r5     // Catch: java.lang.Throwable -> L5e
            r0.f13523p = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r2.c(r5)     // Catch: java.lang.Throwable -> L5e
            if (r0 != r1) goto L50
            return r1
        L50:
            r1 = r5
            r5 = r0
            r0 = r4
        L53:
            r2 = 0
            A9.I.o(r1, r2)     // Catch: java.io.FileNotFoundException -> L58
            return r5
        L58:
            r5 = move-exception
            goto L68
        L5a:
            r1 = r5
            r5 = r0
            r0 = r4
            goto L60
        L5e:
            r0 = move-exception
            goto L5a
        L60:
            throw r5     // Catch: java.lang.Throwable -> L61
        L61:
            r2 = move-exception
            A9.I.o(r1, r5)     // Catch: java.io.FileNotFoundException -> L58
            throw r2     // Catch: java.io.FileNotFoundException -> L58
        L66:
            r5 = move-exception
            r0 = r4
        L68:
            java.io.File r1 = r0.c()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L79
            X0.l<T> r5 = r0.f13455b
            java.lang.Object r5 = r5.b()
            return r5
        L79:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.o.g(h9.c):java.lang.Object");
    }

    @Override // X0.h
    public final InterfaceC0644f<T> getData() {
        return this.f13458e;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(h9.c r8) throws X0.C1638a, java.io.FileNotFoundException {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X0.x
            if (r0 == 0) goto L13
            r0 = r8
            X0.x r0 = (X0.x) r0
            int r1 = r0.f13528p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13528p = r1
            goto L18
        L13:
            X0.x r0 = new X0.x
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f13526n
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f13528p
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f13525m
            java.lang.Object r0 = r0.f13524l
            X0.a r0 = (X0.C1638a) r0
            b9.n.b(r8)     // Catch: java.io.IOException -> L33
            return r1
        L33:
            r8 = move-exception
            goto L8b
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.f13525m
            X0.a r2 = (X0.C1638a) r2
            java.lang.Object r4 = r0.f13524l
            X0.o r4 = (X0.o) r4
            b9.n.b(r8)
            goto L79
        L49:
            java.lang.Object r2 = r0.f13524l
            X0.o r2 = (X0.o) r2
            b9.n.b(r8)     // Catch: X0.C1638a -> L51
            return r8
        L51:
            r8 = move-exception
            goto L66
        L53:
            b9.n.b(r8)
            r0.f13524l = r7     // Catch: X0.C1638a -> L64
            r0.f13528p = r5     // Catch: X0.C1638a -> L64
            java.lang.Object r8 = r7.g(r0)     // Catch: X0.C1638a -> L64
            if (r8 != r1) goto L61
            goto L85
        L61:
            return r8
        L62:
            r2 = r7
            goto L66
        L64:
            r8 = move-exception
            goto L62
        L66:
            X0.b<T> r5 = r2.f13456c
            r0.f13524l = r2
            r0.f13525m = r8
            r0.f13528p = r4
            java.lang.Object r4 = r5.a(r8)
            if (r4 != r1) goto L75
            goto L85
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.f13524l = r2     // Catch: java.io.IOException -> L89
            r0.f13525m = r8     // Catch: java.io.IOException -> L89
            r0.f13528p = r3     // Catch: java.io.IOException -> L89
            java.lang.Object r0 = r4.j(r8, r0)     // Catch: java.io.IOException -> L89
            if (r0 != r1) goto L86
        L85:
            return r1
        L86:
            return r8
        L87:
            r0 = r2
            goto L8b
        L89:
            r8 = move-exception
            goto L87
        L8b:
            b9.x.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.o.h(h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(p9.p r10, f9.InterfaceC4350h r11, h9.c r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X0.y
            if (r0 == 0) goto L13
            r0 = r12
            X0.y r0 = (X0.y) r0
            int r1 = r0.f13534q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13534q = r1
            goto L18
        L13:
            X0.y r0 = new X0.y
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f13532o
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f13534q
            java.lang.String r3 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r4 = 0
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L47
            if (r2 == r6) goto L3b
            if (r2 != r5) goto L33
            java.lang.Object r10 = r0.f13530m
            X0.o r11 = r0.f13529l
            b9.n.b(r12)
            goto La0
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            java.lang.Object r10 = r0.f13531n
            java.lang.Object r11 = r0.f13530m
            X0.c r11 = (X0.C1640c) r11
            X0.o r2 = r0.f13529l
            b9.n.b(r12)
            goto L7a
        L47:
            b9.n.b(r12)
            D9.J r12 = r9.f13461h
            java.lang.Object r12 = r12.getValue()
            X0.c r12 = (X0.C1640c) r12
            T r2 = r12.f13425a
            if (r2 == 0) goto L5b
            int r2 = r2.hashCode()
            goto L5c
        L5b:
            r2 = r4
        L5c:
            int r8 = r12.f13426b
            if (r2 != r8) goto Lba
            X0.z r2 = new X0.z
            T r8 = r12.f13425a
            r2.<init>(r10, r8, r7)
            r0.f13529l = r9
            r0.f13530m = r12
            r0.f13531n = r8
            r0.f13534q = r6
            java.lang.Object r10 = A9.C0575f.h(r11, r2, r0)
            if (r10 != r1) goto L76
            goto L9d
        L76:
            r2 = r9
            r11 = r12
            r12 = r10
            r10 = r8
        L7a:
            T r6 = r11.f13425a
            if (r6 == 0) goto L83
            int r6 = r6.hashCode()
            goto L84
        L83:
            r6 = r4
        L84:
            int r11 = r11.f13426b
            if (r6 != r11) goto Lb4
            boolean r11 = kotlin.jvm.internal.l.b(r10, r12)
            if (r11 == 0) goto L8f
            return r10
        L8f:
            r0.f13529l = r2
            r0.f13530m = r12
            r0.f13531n = r7
            r0.f13534q = r5
            java.lang.Object r10 = r2.j(r12, r0)
            if (r10 != r1) goto L9e
        L9d:
            return r1
        L9e:
            r10 = r12
            r11 = r2
        La0:
            D9.J r11 = r11.f13461h
            X0.c r12 = new X0.c
            if (r10 == 0) goto Laa
            int r4 = r10.hashCode()
        Laa:
            r12.<init>(r10, r4)
            r11.getClass()
            r11.g(r7, r12)
            return r10
        Lb4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r3)
            throw r10
        Lba:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.o.i(p9.p, f9.h, h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Object r8, h9.c r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.o.j(java.lang.Object, h9.c):java.lang.Object");
    }
}
