package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes4.dex */
public final class FlowKt__LimitKt$dropWhile$1$1 implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f22388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f22389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l9.p f22390c;

    public FlowKt__LimitKt$dropWhile$1$1(Ref$BooleanRef ref$BooleanRef, c cVar, l9.p pVar) {
        this.f22388a = ref$BooleanRef;
        this.f22389b = cVar;
        this.f22390c = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r8.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r8.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r7, c9.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.c.b(r8)
            goto L88
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.L$1
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1) r2
            kotlin.c.b(r8)
            goto L6c
        L41:
            kotlin.c.b(r8)
            goto L59
        L45:
            kotlin.c.b(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f22388a
            boolean r8 = r8.element
            if (r8 == 0) goto L5c
            kotlinx.coroutines.flow.c r8 = r6.f22389b
            r0.label = r5
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L59
            goto L87
        L59:
            y8.s r7 = y8.s.f25199a
            return r7
        L5c:
            l9.p r8 = r6.f22390c
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L6b
            goto L87
        L6b:
            r2 = r6
        L6c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L8b
            kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f22388a
            r8.element = r5
            kotlinx.coroutines.flow.c r8 = r2.f22389b
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L88
        L87:
            return r1
        L88:
            y8.s r7 = y8.s.f25199a
            return r7
        L8b:
            y8.s r7 = y8.s.f25199a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1.emit(java.lang.Object, c9.c):java.lang.Object");
    }
}
