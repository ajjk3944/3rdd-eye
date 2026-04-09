package D9;

import X0.o;
import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

/* compiled from: Limit.kt */
/* renamed from: D9.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0652n<T> implements InterfaceC0645g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.t f1222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0645g<T> f1223c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o.f.a f1224d;

    /* compiled from: Limit.kt */
    @h9.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {33, 34, 36}, m = "emit")
    /* renamed from: D9.n$a */
    public static final class a extends h9.c {

        /* renamed from: l, reason: collision with root package name */
        public C0652n f1225l;

        /* renamed from: m, reason: collision with root package name */
        public Object f1226m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f1227n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ C0652n<T> f1228o;

        /* renamed from: p, reason: collision with root package name */
        public int f1229p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C0652n<? super T> c0652n, InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
            this.f1228o = c0652n;
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f1227n = obj;
            this.f1229p |= RecyclerView.UNDEFINED_DURATION;
            return this.f1228o.emit(null, this);
        }
    }

    public C0652n(kotlin.jvm.internal.t tVar, InterfaceC0645g interfaceC0645g, o.f.a aVar) {
        this.f1222b = tVar;
        this.f1223c = interfaceC0645g;
        this.f1224d = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r6.f1223c.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r2.f1223c.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // D9.InterfaceC0645g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r7, f9.InterfaceC4347e<? super b9.C1992A> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof D9.C0652n.a
            if (r0 == 0) goto L13
            r0 = r8
            D9.n$a r0 = (D9.C0652n.a) r0
            int r1 = r0.f1229p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1229p = r1
            goto L18
        L13:
            D9.n$a r0 = new D9.n$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f1227n
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f1229p
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            b9.n.b(r8)
            goto L84
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f1226m
            D9.n r2 = r0.f1225l
            b9.n.b(r8)
            goto L68
        L3d:
            b9.n.b(r8)
            goto L55
        L41:
            b9.n.b(r8)
            kotlin.jvm.internal.t r8 = r6.f1222b
            boolean r8 = r8.f43657b
            if (r8 == 0) goto L58
            r0.f1229p = r5
            D9.g<T> r8 = r6.f1223c
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L55
            goto L83
        L55:
            b9.A r7 = b9.C1992A.f18074a
            return r7
        L58:
            r0.f1225l = r6
            r0.f1226m = r7
            r0.f1229p = r4
            X0.o$f$a r8 = r6.f1224d
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L67
            goto L83
        L67:
            r2 = r6
        L68:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L87
            kotlin.jvm.internal.t r8 = r2.f1222b
            r8.f43657b = r5
            r8 = 0
            r0.f1225l = r8
            r0.f1226m = r8
            r0.f1229p = r3
            D9.g<T> r8 = r2.f1223c
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L84
        L83:
            return r1
        L84:
            b9.A r7 = b9.C1992A.f18074a
            return r7
        L87:
            b9.A r7 = b9.C1992A.f18074a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.C0652n.emit(java.lang.Object, f9.e):java.lang.Object");
    }
}
