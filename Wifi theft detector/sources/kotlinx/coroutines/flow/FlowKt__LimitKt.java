package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class FlowKt__LimitKt {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f22386a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l9.p f22387b;

        public a(b bVar, l9.p pVar) {
            this.f22386a = bVar;
            this.f22387b = pVar;
        }

        @Override // kotlinx.coroutines.flow.b
        public Object collect(c cVar, c9.c cVar2) {
            Object objCollect = this.f22386a.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), cVar, this.f22387b), cVar2);
            return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : y8.s.f25199a;
        }
    }

    public static final b b(b bVar, l9.p pVar) {
        return new a(bVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(kotlinx.coroutines.flow.c r4, java.lang.Object r5, java.lang.Object r6, c9.c r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r6 = r0.L$0
            kotlin.c.b(r7)
            goto L41
        L33:
            kotlin.c.b(r7)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.c(kotlinx.coroutines.flow.c, java.lang.Object, java.lang.Object, c9.c):java.lang.Object");
    }

    public static final b d(b bVar, int i10) {
        if (i10 > 0) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(bVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    public static final b e(b bVar, l9.q qVar) {
        return d.u(new FlowKt__LimitKt$transformWhile$1(bVar, qVar, null));
    }
}
