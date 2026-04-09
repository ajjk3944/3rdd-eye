package oi;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.text.t;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import xi.AbstractC8537d;

/* loaded from: classes4.dex */
public class f implements oi.n {

    /* renamed from: d, reason: collision with root package name */
    private static final String f55715d = t.n1(f.class.getCanonicalName(), ".", "");

    /* renamed from: e, reason: collision with root package name */
    public static final oi.n f55716e = new a("NO_LOCKS", InterfaceC2014f.f55725a, oi.e.f55714b);

    /* renamed from: a, reason: collision with root package name */
    protected final oi.k f55717a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2014f f55718b;

    /* renamed from: c, reason: collision with root package name */
    private final String f55719c;

    static class a extends f {
        a(String str, InterfaceC2014f interfaceC2014f, oi.k kVar) {
            super(str, interfaceC2014f, kVar, null);
        }

        private static /* synthetic */ void j(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i10 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // oi.f
        protected o p(String str, Object obj) {
            if (str == null) {
                j(0);
            }
            o oVarA = o.a();
            if (oVarA == null) {
                j(1);
            }
            return oVarA;
        }
    }

    class b extends j {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f55720d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, InterfaceC6824a interfaceC6824a, Object obj) {
            super(fVar, interfaceC6824a);
            this.f55720d = obj;
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // oi.f.h
        protected o c(boolean z10) {
            o oVarD = o.d(this.f55720d);
            if (oVarD == null) {
                a(0);
            }
            return oVarD;
        }
    }

    class c extends k {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f55722e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f55723f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f fVar, InterfaceC6824a interfaceC6824a, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
            super(fVar, interfaceC6824a);
            this.f55722e = interfaceC6835l;
            this.f55723f = interfaceC6835l2;
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i10 != 2 ? 2 : 3];
            if (i10 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i10 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i10 == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // oi.f.h
        protected o c(boolean z10) {
            InterfaceC6835l interfaceC6835l = this.f55722e;
            if (interfaceC6835l == null) {
                o oVarC = super.c(z10);
                if (oVarC == null) {
                    a(0);
                }
                return oVarC;
            }
            o oVarD = o.d(interfaceC6835l.invoke(Boolean.valueOf(z10)));
            if (oVarD == null) {
                a(1);
            }
            return oVarD;
        }

        @Override // oi.f.i
        protected void e(Object obj) {
            if (obj == null) {
                a(2);
            }
            this.f55723f.invoke(obj);
        }
    }

    private static class d extends e implements InterfaceC7140a {
        /* synthetic */ d(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // oi.f.e, oi.InterfaceC7140a
        public Object a(Object obj, InterfaceC6824a interfaceC6824a) {
            if (interfaceC6824a == null) {
                b(2);
            }
            Object objA = super.a(obj, interfaceC6824a);
            if (objA == null) {
                b(3);
            }
            return objA;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(f fVar, ConcurrentMap concurrentMap) {
            super(fVar, concurrentMap, null);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    private static class e extends l implements InterfaceC7141b {

        class a implements InterfaceC6835l {
            a() {
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Object invoke(g gVar) {
                return gVar.f55727b.invoke();
            }
        }

        /* synthetic */ e(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public Object a(Object obj, InterfaceC6824a interfaceC6824a) {
            if (interfaceC6824a == null) {
                b(2);
            }
            return invoke(new g(obj, interfaceC6824a));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(f fVar, ConcurrentMap concurrentMap) {
            super(fVar, concurrentMap, new a());
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* renamed from: oi.f$f, reason: collision with other inner class name */
    public interface InterfaceC2014f {

        /* renamed from: a, reason: collision with root package name */
        public static final InterfaceC2014f f55725a = new a();

        /* renamed from: oi.f$f$a */
        static class a implements InterfaceC2014f {
            a() {
            }

            private static /* synthetic */ void b(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // oi.f.InterfaceC2014f
            public RuntimeException a(Throwable th2) {
                if (th2 == null) {
                    b(0);
                }
                throw AbstractC8537d.b(th2);
            }
        }

        RuntimeException a(Throwable th2);
    }

    private static class g {

        /* renamed from: a, reason: collision with root package name */
        private final Object f55726a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC6824a f55727b;

        public g(Object obj, InterfaceC6824a interfaceC6824a) {
            this.f55726a = obj;
            this.f55727b = interfaceC6824a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f55726a.equals(((g) obj).f55726a);
        }

        public int hashCode() {
            return this.f55726a.hashCode();
        }
    }

    private static class h implements oi.j {

        /* renamed from: a, reason: collision with root package name */
        private final f f55728a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC6824a f55729b;

        /* renamed from: c, reason: collision with root package name */
        private volatile Object f55730c;

        public h(f fVar, InterfaceC6824a interfaceC6824a) {
            if (fVar == null) {
                a(0);
            }
            if (interfaceC6824a == null) {
                a(1);
            }
            this.f55730c = n.NOT_COMPUTED;
            this.f55728a = fVar;
            this.f55729b = interfaceC6824a;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i10 != 2 && i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        protected void b(Object obj) {
        }

        protected o c(boolean z10) {
            o oVarP = this.f55728a.p("in a lazy value", null);
            if (oVarP == null) {
                a(2);
            }
            return oVarP;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // mh.InterfaceC6824a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f55730c
                boolean r1 = r0 instanceof oi.f.n
                if (r1 != 0) goto Lb
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.f(r0)
                return r0
            Lb:
                oi.f r0 = r4.f55728a
                oi.k r0 = r0.f55717a
                r0.lock()
                java.lang.Object r0 = r4.f55730c     // Catch: java.lang.Throwable -> L24
                boolean r1 = r0 instanceof oi.f.n     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L26
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.f(r0)     // Catch: java.lang.Throwable -> L24
            L1c:
                oi.f r1 = r4.f55728a
                oi.k r1 = r1.f55717a
                r1.unlock()
                return r0
            L24:
                r0 = move-exception
                goto L85
            L26:
                oi.f$n r1 = oi.f.n.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r0 != r1) goto L3e
                oi.f$n r2 = oi.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                r4.f55730c = r2     // Catch: java.lang.Throwable -> L24
                r2 = 1
                oi.f$o r2 = r4.c(r2)     // Catch: java.lang.Throwable -> L24
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L24
                if (r3 != 0) goto L3e
                java.lang.Object r0 = r2.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L3e:
                oi.f$n r2 = oi.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                if (r0 != r2) goto L52
                r0 = 0
                oi.f$o r0 = r4.c(r0)     // Catch: java.lang.Throwable -> L24
                boolean r2 = r0.c()     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L52
                java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L52:
                r4.f55730c = r1     // Catch: java.lang.Throwable -> L24
                mh.a r0 = r4.f55729b     // Catch: java.lang.Throwable -> L60
                java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L60
                r4.b(r0)     // Catch: java.lang.Throwable -> L60
                r4.f55730c = r0     // Catch: java.lang.Throwable -> L60
                goto L1c
            L60:
                r0 = move-exception
                boolean r1 = xi.AbstractC8537d.a(r0)     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L7e
                java.lang.Object r1 = r4.f55730c     // Catch: java.lang.Throwable -> L24
                oi.f$n r2 = oi.f.n.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r1 != r2) goto L73
                java.lang.Object r1 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.c(r0)     // Catch: java.lang.Throwable -> L24
                r4.f55730c = r1     // Catch: java.lang.Throwable -> L24
            L73:
                oi.f r1 = r4.f55728a     // Catch: java.lang.Throwable -> L24
                oi.f$f r1 = oi.f.k(r1)     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L7e:
                oi.f$n r1 = oi.f.n.NOT_COMPUTED     // Catch: java.lang.Throwable -> L24
                r4.f55730c = r1     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L85:
                oi.f r1 = r4.f55728a
                oi.k r1 = r1.f55717a
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: oi.f.h.invoke():java.lang.Object");
        }

        public boolean m() {
            return (this.f55730c == n.NOT_COMPUTED || this.f55730c == n.COMPUTING) ? false : true;
        }
    }

    private static abstract class i extends h {

        /* renamed from: d, reason: collision with root package name */
        private volatile oi.l f55731d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f fVar, InterfaceC6824a interfaceC6824a) {
            super(fVar, interfaceC6824a);
            if (fVar == null) {
                a(0);
            }
            if (interfaceC6824a == null) {
                a(1);
            }
            this.f55731d = null;
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // oi.f.h
        protected final void b(Object obj) {
            this.f55731d = new oi.l(obj);
            try {
                e(obj);
            } finally {
                this.f55731d = null;
            }
        }

        protected abstract void e(Object obj);

        @Override // oi.f.h, mh.InterfaceC6824a
        public Object invoke() {
            oi.l lVar = this.f55731d;
            return (lVar == null || !lVar.b()) ? super.invoke() : lVar.a();
        }
    }

    private static class j extends h implements oi.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(f fVar, InterfaceC6824a interfaceC6824a) {
            super(fVar, interfaceC6824a);
            if (fVar == null) {
                a(0);
            }
            if (interfaceC6824a == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // oi.f.h, mh.InterfaceC6824a
        public Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke == null) {
                a(2);
            }
            return objInvoke;
        }
    }

    private static abstract class k extends i implements oi.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(f fVar, InterfaceC6824a interfaceC6824a) {
            super(fVar, interfaceC6824a);
            if (fVar == null) {
                a(0);
            }
            if (interfaceC6824a == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // oi.f.i, oi.f.h, mh.InterfaceC6824a
        public Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke == null) {
                a(2);
            }
            return objInvoke;
        }
    }

    private static class l implements oi.h {

        /* renamed from: a, reason: collision with root package name */
        private final f f55732a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentMap f55733b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC6835l f55734c;

        public l(f fVar, ConcurrentMap concurrentMap, InterfaceC6835l interfaceC6835l) {
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (interfaceC6835l == null) {
                b(2);
            }
            this.f55732a = fVar;
            this.f55733b = concurrentMap;
            this.f55734c = interfaceC6835l;
        }

        private static /* synthetic */ void b(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        private AssertionError c(Object obj, Object obj2) {
            return (AssertionError) f.q(new AssertionError("Inconsistent key detected. " + n.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f55732a));
        }

        private AssertionError e(Object obj, Object obj2) {
            AssertionError assertionError = (AssertionError) f.q(new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f55732a));
            if (assertionError == null) {
                b(4);
            }
            return assertionError;
        }

        private AssertionError h(Object obj, Throwable th2) {
            return (AssertionError) f.q(new AssertionError("Unable to remove " + obj + " under " + this.f55732a, th2));
        }

        @Override // oi.h
        public boolean C(Object obj) {
            Object obj2 = this.f55733b.get(obj);
            return (obj2 == null || obj2 == n.COMPUTING) ? false : true;
        }

        protected o f(Object obj, boolean z10) {
            o oVarP = this.f55732a.p("", obj);
            if (oVarP == null) {
                b(3);
            }
            return oVarP;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
  0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v21 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        @Override // mh.InterfaceC6835l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                java.util.concurrent.ConcurrentMap r0 = r5.f55733b
                java.lang.Object r0 = r0.get(r6)
                if (r0 == 0) goto L11
                oi.f$n r1 = oi.f.n.COMPUTING
                if (r0 == r1) goto L11
                java.lang.Object r6 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.d(r0)
                return r6
            L11:
                oi.f r0 = r5.f55732a
                oi.k r0 = r0.f55717a
                r0.lock()
                java.util.concurrent.ConcurrentMap r0 = r5.f55733b     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L3b
                oi.f$n r1 = oi.f.n.COMPUTING     // Catch: java.lang.Throwable -> L3b
                if (r0 != r1) goto L3e
                oi.f$n r0 = oi.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L3b
                r2 = 1
                oi.f$o r2 = r5.f(r6, r2)     // Catch: java.lang.Throwable -> L3b
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L3b
                if (r3 != 0) goto L3e
                java.lang.Object r6 = r2.b()     // Catch: java.lang.Throwable -> L3b
            L33:
                oi.f r0 = r5.f55732a
                oi.k r0 = r0.f55717a
                r0.unlock()
                return r6
            L3b:
                r6 = move-exception
                goto Ld3
            L3e:
                oi.f$n r2 = oi.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L3b
                if (r0 != r2) goto L52
                r2 = 0
                oi.f$o r2 = r5.f(r6, r2)     // Catch: java.lang.Throwable -> L3b
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L3b
                if (r3 != 0) goto L52
                java.lang.Object r6 = r2.b()     // Catch: java.lang.Throwable -> L3b
                goto L33
            L52:
                if (r0 == 0) goto L59
                java.lang.Object r6 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.d(r0)     // Catch: java.lang.Throwable -> L3b
                goto L33
            L59:
                r0 = 0
                java.util.concurrent.ConcurrentMap r2 = r5.f55733b     // Catch: java.lang.Throwable -> L7e
                r2.put(r6, r1)     // Catch: java.lang.Throwable -> L7e
                mh.l r2 = r5.f55734c     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r2 = r2.invoke(r6)     // Catch: java.lang.Throwable -> L7e
                java.util.concurrent.ConcurrentMap r3 = r5.f55733b     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r4 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.b(r2)     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r3 = r3.put(r6, r4)     // Catch: java.lang.Throwable -> L7e
                if (r3 != r1) goto L79
                oi.f r6 = r5.f55732a
                oi.k r6 = r6.f55717a
                r6.unlock()
                return r2
            L79:
                java.lang.AssertionError r0 = r5.e(r6, r3)     // Catch: java.lang.Throwable -> L7e
                throw r0     // Catch: java.lang.Throwable -> L7e
            L7e:
                r1 = move-exception
                boolean r2 = xi.AbstractC8537d.a(r1)     // Catch: java.lang.Throwable -> L3b
                if (r2 == 0) goto L9d
                java.util.concurrent.ConcurrentMap r0 = r5.f55733b     // Catch: java.lang.Throwable -> L97
                java.lang.Object r0 = r0.remove(r6)     // Catch: java.lang.Throwable -> L97
                oi.f$n r2 = oi.f.n.COMPUTING     // Catch: java.lang.Throwable -> L3b
                if (r0 == r2) goto L94
                java.lang.AssertionError r6 = r5.c(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            L94:
                java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch: java.lang.Throwable -> L3b
                throw r1     // Catch: java.lang.Throwable -> L3b
            L97:
                r0 = move-exception
                java.lang.AssertionError r6 = r5.h(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            L9d:
                if (r1 == r0) goto Lbd
                java.util.concurrent.ConcurrentMap r0 = r5.f55733b     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r2 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.c(r1)     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r0 = r0.put(r6, r2)     // Catch: java.lang.Throwable -> L3b
                oi.f$n r2 = oi.f.n.COMPUTING     // Catch: java.lang.Throwable -> L3b
                if (r0 == r2) goto Lb2
                java.lang.AssertionError r6 = r5.e(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Lb2:
                oi.f r6 = r5.f55732a     // Catch: java.lang.Throwable -> L3b
                oi.f$f r6 = oi.f.k(r6)     // Catch: java.lang.Throwable -> L3b
                java.lang.RuntimeException r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Lbd:
                java.util.concurrent.ConcurrentMap r0 = r5.f55733b     // Catch: java.lang.Throwable -> Lcd
                r0.remove(r6)     // Catch: java.lang.Throwable -> Lcd
                oi.f r6 = r5.f55732a     // Catch: java.lang.Throwable -> L3b
                oi.f$f r6 = oi.f.k(r6)     // Catch: java.lang.Throwable -> L3b
                java.lang.RuntimeException r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Lcd:
                r0 = move-exception
                java.lang.AssertionError r6 = r5.h(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Ld3:
                oi.f r0 = r5.f55732a
                oi.k r0 = r0.f55717a
                r0.unlock()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: oi.f.l.invoke(java.lang.Object):java.lang.Object");
        }
    }

    private static class m extends l implements oi.g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(f fVar, ConcurrentMap concurrentMap, InterfaceC6835l interfaceC6835l) {
            super(fVar, concurrentMap, interfaceC6835l);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (interfaceC6835l == null) {
                b(2);
            }
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // oi.f.l, mh.InterfaceC6835l
        public Object invoke(Object obj) {
            Object objInvoke = super.invoke(obj);
            if (objInvoke == null) {
                b(3);
            }
            return objInvoke;
        }
    }

    private enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    private static class o {

        /* renamed from: a, reason: collision with root package name */
        private final Object f55735a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f55736b;

        private o(Object obj, boolean z10) {
            this.f55735a = obj;
            this.f55736b = z10;
        }

        public static o a() {
            return new o(null, true);
        }

        public static o d(Object obj) {
            return new o(obj, false);
        }

        public Object b() {
            return this.f55735a;
        }

        public boolean c() {
            return this.f55736b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.f55735a);
        }
    }

    /* synthetic */ f(String str, InterfaceC2014f interfaceC2014f, oi.k kVar, a aVar) {
        this(str, interfaceC2014f, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void j(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.f.j(int):void");
    }

    private static ConcurrentMap m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Throwable q(Throwable th2) {
        if (th2 == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!stackTrace[i10].getClassName().startsWith(f55715d)) {
                break;
            }
            i10++;
        }
        List listSubList = Arrays.asList(stackTrace).subList(i10, length);
        th2.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        return th2;
    }

    @Override // oi.n
    public InterfaceC7141b a() {
        return new e(this, m(), null);
    }

    @Override // oi.n
    public oi.j b(InterfaceC6824a interfaceC6824a) {
        if (interfaceC6824a == null) {
            j(30);
        }
        return new h(this, interfaceC6824a);
    }

    @Override // oi.n
    public InterfaceC7140a c() {
        return new d(this, m(), null);
    }

    @Override // oi.n
    public Object d(InterfaceC6824a interfaceC6824a) {
        if (interfaceC6824a == null) {
            j(34);
        }
        this.f55717a.lock();
        try {
            return interfaceC6824a.invoke();
        } finally {
        }
    }

    @Override // oi.n
    public oi.g e(InterfaceC6835l interfaceC6835l) {
        if (interfaceC6835l == null) {
            j(9);
        }
        oi.g gVarN = n(interfaceC6835l, m());
        if (gVarN == null) {
            j(10);
        }
        return gVarN;
    }

    @Override // oi.n
    public oi.i f(InterfaceC6824a interfaceC6824a) {
        if (interfaceC6824a == null) {
            j(23);
        }
        return new j(this, interfaceC6824a);
    }

    @Override // oi.n
    public oi.i g(InterfaceC6824a interfaceC6824a, Object obj) {
        if (interfaceC6824a == null) {
            j(26);
        }
        if (obj == null) {
            j(27);
        }
        return new b(this, interfaceC6824a, obj);
    }

    @Override // oi.n
    public oi.i h(InterfaceC6824a interfaceC6824a, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        if (interfaceC6824a == null) {
            j(28);
        }
        if (interfaceC6835l2 == null) {
            j(29);
        }
        return new c(this, interfaceC6824a, interfaceC6835l, interfaceC6835l2);
    }

    @Override // oi.n
    public oi.h i(InterfaceC6835l interfaceC6835l) {
        if (interfaceC6835l == null) {
            j(19);
        }
        oi.h hVarO = o(interfaceC6835l, m());
        if (hVarO == null) {
            j(20);
        }
        return hVarO;
    }

    public oi.g n(InterfaceC6835l interfaceC6835l, ConcurrentMap concurrentMap) {
        if (interfaceC6835l == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, interfaceC6835l);
    }

    public oi.h o(InterfaceC6835l interfaceC6835l, ConcurrentMap concurrentMap) {
        if (interfaceC6835l == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, interfaceC6835l);
    }

    protected o p(String str, Object obj) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f55719c + ")";
    }

    private f(String str, InterfaceC2014f interfaceC2014f, oi.k kVar) {
        if (str == null) {
            j(4);
        }
        if (interfaceC2014f == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f55717a = kVar;
        this.f55718b = interfaceC2014f;
        this.f55719c = str;
    }

    public f(String str) {
        this(str, (Runnable) null, (InterfaceC6835l) null);
    }

    public f(String str, Runnable runnable, InterfaceC6835l interfaceC6835l) {
        this(str, InterfaceC2014f.f55725a, oi.k.f55737a.a(runnable, interfaceC6835l));
    }
}
