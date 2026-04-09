package D9;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

/* compiled from: Limit.kt */
/* loaded from: classes3.dex */
public final class p implements InterfaceC0645g<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.i f1231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f1232c;

    /* compiled from: Limit.kt */
    @h9.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {139}, m = "emit")
    public static final class a extends h9.c {

        /* renamed from: l, reason: collision with root package name */
        public p f1233l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f1234m;

        /* renamed from: n, reason: collision with root package name */
        public int f1235n;

        /* renamed from: p, reason: collision with root package name */
        public Object f1237p;

        public a(InterfaceC4347e interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f1234m = obj;
            this.f1235n |= RecyclerView.UNDEFINED_DURATION;
            return p.this.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(p9.p pVar, kotlin.jvm.internal.w wVar) {
        this.f1231b = (h9.i) pVar;
        this.f1232c = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [h9.i, p9.p] */
    @Override // D9.InterfaceC0645g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r5, f9.InterfaceC4347e<? super b9.C1992A> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof D9.p.a
            if (r0 == 0) goto L13
            r0 = r6
            D9.p$a r0 = (D9.p.a) r0
            int r1 = r0.f1235n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1235n = r1
            goto L18
        L13:
            D9.p$a r0 = new D9.p$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1234m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f1235n
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f1237p
            D9.p r0 = r0.f1233l
            b9.n.b(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            b9.n.b(r6)
            r0.f1233l = r4
            r0.f1237p = r5
            r0.f1235n = r3
            h9.i r6 = r4.f1231b
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L51
            b9.A r5 = b9.C1992A.f18074a
            return r5
        L51:
            kotlin.jvm.internal.w r6 = r0.f1232c
            r6.f43660b = r5
            E9.a r5 = new E9.a
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.p.emit(java.lang.Object, f9.e):java.lang.Object");
    }
}
