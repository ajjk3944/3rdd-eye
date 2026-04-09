package D9;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Channels.kt */
/* renamed from: D9.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0646h {

    /* compiled from: Channels.kt */
    @h9.e(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
    /* renamed from: D9.h$a */
    public static final class a<T> extends h9.c {

        /* renamed from: l, reason: collision with root package name */
        public InterfaceC0645g f1194l;

        /* renamed from: m, reason: collision with root package name */
        public C9.w f1195m;

        /* renamed from: n, reason: collision with root package name */
        public C9.i f1196n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f1197o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f1198p;

        /* renamed from: q, reason: collision with root package name */
        public int f1199q;

        public a() {
            throw null;
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f1198p = obj;
            this.f1199q |= RecyclerView.UNDEFINED_DURATION;
            return C0646h.a(null, null, false, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0056, B:29:0x006b, B:31:0x0073, B:20:0x0047, B:24:0x0052), top: B:52:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [D9.g] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object a(D9.InterfaceC0645g<? super T> r7, C9.w<? extends T> r8, boolean r9, f9.InterfaceC4347e<? super b9.C1992A> r10) {
        /*
            boolean r0 = r10 instanceof D9.C0646h.a
            if (r0 == 0) goto L13
            r0 = r10
            D9.h$a r0 = (D9.C0646h.a) r0
            int r1 = r0.f1199q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1199q = r1
            goto L18
        L13:
            D9.h$a r0 = new D9.h$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f1198p
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f1199q
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            boolean r9 = r0.f1197o
            C9.i r7 = r0.f1196n
            C9.w r8 = r0.f1195m
            D9.g r2 = r0.f1194l
            b9.n.b(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r2
            goto L56
        L35:
            r7 = move-exception
            goto L90
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.f1197o
            C9.i r7 = r0.f1196n
            C9.w r8 = r0.f1195m
            D9.g r2 = r0.f1194l
            b9.n.b(r10)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L4b:
            b9.n.b(r10)
            boolean r10 = r7 instanceof D9.N
            if (r10 != 0) goto Lab
            C9.i r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L56:
            r0.f1194l = r7     // Catch: java.lang.Throwable -> L35
            r0.f1195m = r8     // Catch: java.lang.Throwable -> L35
            r0.f1196n = r10     // Catch: java.lang.Throwable -> L35
            r0.f1197o = r9     // Catch: java.lang.Throwable -> L35
            r0.f1199q = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L67
            goto L87
        L67:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L35
            r0.f1194l = r2     // Catch: java.lang.Throwable -> L35
            r0.f1195m = r8     // Catch: java.lang.Throwable -> L35
            r0.f1196n = r7     // Catch: java.lang.Throwable -> L35
            r0.f1197o = r9     // Catch: java.lang.Throwable -> L35
            r0.f1199q = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L32
        L87:
            return r1
        L88:
            if (r9 == 0) goto L8d
            r8.c(r3)
        L8d:
            b9.A r7 = b9.C1992A.f18074a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto Laa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L9b:
            if (r3 != 0) goto La7
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        La7:
            r8.c(r3)
        Laa:
            throw r10
        Lab:
            D9.N r7 = (D9.N) r7
            r7.getClass()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.C0646h.a(D9.g, C9.w, boolean, f9.e):java.lang.Object");
    }
}
