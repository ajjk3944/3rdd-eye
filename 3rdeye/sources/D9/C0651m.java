package D9;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

/* compiled from: Errors.kt */
/* renamed from: D9.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0651m<T> implements InterfaceC0645g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0645g<T> f1216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w<Throwable> f1217c;

    /* compiled from: Errors.kt */
    @h9.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {154}, m = "emit")
    /* renamed from: D9.m$a */
    public static final class a extends h9.c {

        /* renamed from: l, reason: collision with root package name */
        public C0651m f1218l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f1219m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C0651m<T> f1220n;

        /* renamed from: o, reason: collision with root package name */
        public int f1221o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C0651m<? super T> c0651m, InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
            this.f1220n = c0651m;
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f1219m = obj;
            this.f1221o |= RecyclerView.UNDEFINED_DURATION;
            return this.f1220n.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0651m(InterfaceC0645g<? super T> interfaceC0645g, kotlin.jvm.internal.w<Throwable> wVar) {
        this.f1216b = interfaceC0645g;
        this.f1217c = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // D9.InterfaceC0645g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r5, f9.InterfaceC4347e<? super b9.C1992A> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof D9.C0651m.a
            if (r0 == 0) goto L13
            r0 = r6
            D9.m$a r0 = (D9.C0651m.a) r0
            int r1 = r0.f1221o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1221o = r1
            goto L18
        L13:
            D9.m$a r0 = new D9.m$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f1219m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f1221o
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            D9.m r5 = r0.f1218l
            b9.n.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L43
        L29:
            r6 = move-exception
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            b9.n.b(r6)
            D9.g<T> r6 = r4.f1216b     // Catch: java.lang.Throwable -> L46
            r0.f1218l = r4     // Catch: java.lang.Throwable -> L46
            r0.f1221o = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L46
            if (r5 != r1) goto L43
            return r1
        L43:
            b9.A r5 = b9.C1992A.f18074a
            return r5
        L46:
            r6 = move-exception
            r5 = r4
        L48:
            kotlin.jvm.internal.w<java.lang.Throwable> r5 = r5.f1217c
            r5.f43660b = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.C0651m.emit(java.lang.Object, f9.e):java.lang.Object");
    }
}
