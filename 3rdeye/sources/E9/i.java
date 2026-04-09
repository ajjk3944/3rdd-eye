package E9;

import A9.E;
import D9.InterfaceC0644f;
import D9.InterfaceC0645g;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.concurrent.atomic.AtomicInteger;
import p9.InterfaceC5480a;

/* compiled from: Combine.kt */
/* loaded from: classes3.dex */
public final class i {

    /* compiled from: Combine.kt */
    @h9.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public C9.g f1501l;

        /* renamed from: m, reason: collision with root package name */
        public byte[] f1502m;

        /* renamed from: n, reason: collision with root package name */
        public int f1503n;

        /* renamed from: o, reason: collision with root package name */
        public int f1504o;

        /* renamed from: p, reason: collision with root package name */
        public int f1505p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f1506q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0644f<Object>[] f1507r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.m f1508s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ h9.i f1509t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0645g<Object> f1510u;

        /* compiled from: Combine.kt */
        @h9.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
        /* renamed from: E9.i$a$a, reason: collision with other inner class name */
        public static final class C0019a extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public int f1511l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ InterfaceC0644f<Object>[] f1512m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ int f1513n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f1514o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ C9.b f1515p;

            /* compiled from: Combine.kt */
            /* renamed from: E9.i$a$a$a, reason: collision with other inner class name */
            public static final class C0020a<T> implements InterfaceC0645g {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C9.b f1516b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f1517c;

                /* compiled from: Combine.kt */
                @h9.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, 30}, m = "emit")
                /* renamed from: E9.i$a$a$a$a, reason: collision with other inner class name */
                public static final class C0021a extends h9.c {

                    /* renamed from: l, reason: collision with root package name */
                    public /* synthetic */ Object f1518l;

                    /* renamed from: m, reason: collision with root package name */
                    public final /* synthetic */ C0020a<T> f1519m;

                    /* renamed from: n, reason: collision with root package name */
                    public int f1520n;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0021a(C0020a<? super T> c0020a, InterfaceC4347e<? super C0021a> interfaceC4347e) {
                        super(interfaceC4347e);
                        this.f1519m = c0020a;
                    }

                    @Override // h9.AbstractC4424a
                    public final Object invokeSuspend(Object obj) {
                        this.f1518l = obj;
                        this.f1520n |= RecyclerView.UNDEFINED_DURATION;
                        return this.f1519m.emit(null, this);
                    }
                }

                public C0020a(C9.b bVar, int i) {
                    this.f1516b = bVar;
                    this.f1517c = i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:59:0x00df, code lost:
                
                    if (r11 == r1) goto L60;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // D9.InterfaceC0645g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T r11, f9.InterfaceC4347e<? super b9.C1992A> r12) {
                    /*
                        Method dump skipped, instructions count: 229
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: E9.i.a.C0019a.C0020a.emit(java.lang.Object, f9.e):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0019a(InterfaceC0644f[] interfaceC0644fArr, int i, AtomicInteger atomicInteger, C9.b bVar, InterfaceC4347e interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f1512m = interfaceC0644fArr;
                this.f1513n = i;
                this.f1514o = atomicInteger;
                this.f1515p = bVar;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return new C0019a(this.f1512m, this.f1513n, this.f1514o, this.f1515p, interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                return ((C0019a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                int i = this.f1511l;
                AtomicInteger atomicInteger = this.f1514o;
                C9.b bVar = this.f1515p;
                try {
                    if (i == 0) {
                        b9.n.b(obj);
                        InterfaceC0644f<Object>[] interfaceC0644fArr = this.f1512m;
                        int i10 = this.f1513n;
                        InterfaceC0644f<Object> interfaceC0644f = interfaceC0644fArr[i10];
                        C0020a c0020a = new C0020a(bVar, i10);
                        this.f1511l = 1;
                        if (interfaceC0644f.b(c0020a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b9.n.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        bVar.h(null);
                    }
                    return C1992A.f18074a;
                } finally {
                    if (atomicInteger.decrementAndGet() == 0) {
                        bVar.h(null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC0645g interfaceC0645g, InterfaceC4347e interfaceC4347e, InterfaceC5480a interfaceC5480a, p9.q qVar, InterfaceC0644f[] interfaceC0644fArr) {
            super(2, interfaceC4347e);
            this.f1507r = interfaceC0644fArr;
            this.f1508s = (kotlin.jvm.internal.m) interfaceC5480a;
            this.f1509t = (h9.i) qVar;
            this.f1510u = interfaceC0645g;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.m, p9.a] */
        /* JADX WARN: Type inference failed for: r4v0, types: [h9.i, p9.q] */
        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            ?? r42 = this.f1509t;
            a aVar = new a(this.f1510u, interfaceC4347e, this.f1508s, r42, this.f1507r);
            aVar.f1506q = obj;
            return aVar;
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00de, code lost:
        
            if (r9 != 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
        
            r13 = (java.lang.Object[]) r19.f1508s.invoke();
            r14 = r19.f1509t;
            r15 = r19.f1510u;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
        
            if (r13 != null) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
        
            r19.f1506q = r10;
            r19.f1501l = r11;
            r19.f1502m = r2;
            r19.f1503n = r9;
            r19.f1504o = r12;
            r19.f1505p = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00fe, code lost:
        
            if (r14.invoke(r15, r10, r19) != r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0101, code lost:
        
            c9.C2088i.f(r10, 0, r13, 0, 14);
            r19.f1506q = r10;
            r19.f1501l = r11;
            r19.f1502m = r2;
            r19.f1503n = r9;
            r19.f1504o = r12;
            r19.f1505p = 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0116, code lost:
        
            if (r14.invoke(r15, r13, r19) != r1) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
        
            if (r9 != 0) goto L20;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:42:0x00de, B:36:0x00cd], limit reached: 52 */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00bd A[LOOP:0: B:31:0x00bd->B:54:?, LOOP_START, PHI: r9 r13
  0x00bd: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:28:0x00b8, B:54:?] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r13v4 c9.w) = (r13v3 c9.w), (r13v10 c9.w) binds: [B:28:0x00b8, B:54:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r13v11, types: [kotlin.jvm.internal.m, p9.a] */
        /* JADX WARN: Type inference failed for: r14v6, types: [h9.i, p9.q] */
        /* JADX WARN: Type inference failed for: r2v12, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fe -> B:20:0x009b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0116 -> B:51:0x0119). Please report as a decompilation issue!!! */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 283
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: E9.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object a(InterfaceC0645g interfaceC0645g, InterfaceC4347e interfaceC4347e, InterfaceC5480a interfaceC5480a, p9.q qVar, InterfaceC0644f[] interfaceC0644fArr) {
        a aVar = new a(interfaceC0645g, null, interfaceC5480a, qVar, interfaceC0644fArr);
        l lVar = new l(interfaceC4347e, interfaceC4347e.getContext());
        Object objE = A2.l.E(lVar, lVar, aVar);
        return objE == g9.a.COROUTINE_SUSPENDED ? objE : C1992A.f18074a;
    }
}
