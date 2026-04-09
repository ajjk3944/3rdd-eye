package D9;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;
import w5.u;

/* compiled from: SafeCollector.common.kt */
/* renamed from: D9.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0649k implements InterfaceC0644f<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0644f f1206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u.e f1207c;

    /* compiled from: SafeCollector.common.kt */
    @h9.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {112, 113}, m = "collect")
    /* renamed from: D9.k$a */
    public static final class a extends h9.c {

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f1208l;

        /* renamed from: m, reason: collision with root package name */
        public int f1209m;

        /* renamed from: o, reason: collision with root package name */
        public C0649k f1211o;

        /* renamed from: p, reason: collision with root package name */
        public InterfaceC0645g f1212p;

        public a(InterfaceC4347e interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f1208l = obj;
            this.f1209m |= RecyclerView.UNDEFINED_DURATION;
            return C0649k.this.b(null, this);
        }
    }

    public C0649k(InterfaceC0644f interfaceC0644f, u.e eVar) {
        this.f1206b = interfaceC0644f;
        this.f1207c = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r2.invoke(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // D9.InterfaceC0644f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(D9.InterfaceC0645g<? super java.lang.Object> r6, f9.InterfaceC4347e<? super b9.C1992A> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof D9.C0649k.a
            if (r0 == 0) goto L13
            r0 = r7
            D9.k$a r0 = (D9.C0649k.a) r0
            int r1 = r0.f1209m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1209m = r1
            goto L18
        L13:
            D9.k$a r0 = new D9.k$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1208l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f1209m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            b9.n.b(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            D9.g r6 = r0.f1212p
            D9.k r2 = r0.f1211o
            b9.n.b(r7)
            goto L4d
        L3a:
            b9.n.b(r7)
            r0.f1211o = r5
            r0.f1212p = r6
            r0.f1209m = r4
            D9.f r7 = r5.f1206b
            java.io.Serializable r7 = D9.H.b(r7, r6, r0)
            if (r7 != r1) goto L4c
            goto L60
        L4c:
            r2 = r5
        L4d:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L61
            w5.u$e r2 = r2.f1207c
            r4 = 0
            r0.f1211o = r4
            r0.f1212p = r4
            r0.f1209m = r3
            java.lang.Object r6 = r2.invoke(r6, r7, r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            b9.A r6 = b9.C1992A.f18074a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.C0649k.b(D9.g, f9.e):java.lang.Object");
    }
}
