package C1;

import A9.E;
import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import p9.l;
import p9.p;
import w1.k;
import w1.q;
import w1.r;

/* compiled from: DBUtil.android.kt */
@h9.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", l = {247}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b extends h9.i implements p<E, InterfaceC4347e<Object>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f826l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f827m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f828n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f829o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l<E1.a, Object> f830p;

    /* compiled from: DBUtil.kt */
    @h9.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
    public static final class a extends h9.i implements p<r, InterfaceC4347e<Object>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public r.a f831l;

        /* renamed from: m, reason: collision with root package name */
        public int f832m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f833n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f834o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f835p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ k f836q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ l f837r;

        /* compiled from: DBUtil.kt */
        @h9.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
        /* renamed from: C1.b$a$a, reason: collision with other inner class name */
        public static final class C0004a extends h9.i implements p<q<Object>, InterfaceC4347e<Object>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f838l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ l f839m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0004a(l lVar, InterfaceC4347e interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f839m = lVar;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                C0004a c0004a = new C0004a(this.f839m, interfaceC4347e);
                c0004a.f838l = obj;
                return c0004a;
            }

            @Override // p9.p
            public final Object invoke(q<Object> qVar, InterfaceC4347e<Object> interfaceC4347e) {
                return ((C0004a) create(qVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                n.b(obj);
                q qVar = (q) this.f838l;
                kotlin.jvm.internal.l.d(qVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return this.f839m.invoke(((y1.p) qVar).d());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4347e interfaceC4347e, l lVar, k kVar, boolean z10, boolean z11) {
            super(2, interfaceC4347e);
            this.f834o = z10;
            this.f835p = z11;
            this.f836q = kVar;
            this.f837r = lVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            a aVar = new a(interfaceC4347e, this.f837r, this.f836q, this.f834o, this.f835p);
            aVar.f833n = obj;
            return aVar;
        }

        @Override // p9.p
        public final Object invoke(r rVar, InterfaceC4347e<Object> interfaceC4347e) {
            return ((a) create(rVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x009e A[PHI: r1 r11
  0x009e: PHI (r1v11 w1.r) = (r1v8 w1.r), (r1v17 w1.r) binds: [B:34:0x009b, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]
  0x009e: PHI (r11v17 java.lang.Object) = (r11v15 java.lang.Object), (r11v0 java.lang.Object) binds: [B:34:0x009b, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00c3 A[RETURN] */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 212
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: C1.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC4347e interfaceC4347e, l lVar, k kVar, boolean z10, boolean z11) {
        super(2, interfaceC4347e);
        this.f827m = kVar;
        this.f828n = z10;
        this.f829o = z11;
        this.f830p = lVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new b(interfaceC4347e, this.f830p, this.f827m, this.f828n, this.f829o);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<Object> interfaceC4347e) {
        return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f826l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            return obj;
        }
        n.b(obj);
        k kVar = this.f827m;
        boolean z10 = !(kVar.l() && kVar.m()) && this.f828n;
        l<E1.a, Object> lVar = this.f830p;
        boolean z11 = this.f829o;
        k kVar2 = this.f827m;
        a aVar2 = new a(null, lVar, kVar2, z10, z11);
        this.f826l = 1;
        w1.i iVar = kVar2.f47236e;
        if (iVar != null) {
            Object objZ = iVar.f47228f.Z(z11, aVar2, this);
            return objZ == aVar ? aVar : objZ;
        }
        kotlin.jvm.internal.l.l("connectionManager");
        throw null;
    }
}
