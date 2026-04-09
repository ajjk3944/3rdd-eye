package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes4.dex */
public final class DistinctFlowImpl implements b {

    /* renamed from: a, reason: collision with root package name */
    public final b f22361a;

    /* renamed from: b, reason: collision with root package name */
    public final l9.l f22362b;

    /* renamed from: c, reason: collision with root package name */
    public final l9.p f22363c;

    /* renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2, reason: invalid class name */
    public static final class AnonymousClass2 implements c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f22365b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f22366c;

        public AnonymousClass2(Ref$ObjectRef ref$ObjectRef, c cVar) {
            this.f22365b = ref$ObjectRef;
            this.f22366c = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Object] */
        @Override // kotlinx.coroutines.flow.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, c9.c r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.c.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.c.b(r7)
                kotlinx.coroutines.flow.DistinctFlowImpl r7 = kotlinx.coroutines.flow.DistinctFlowImpl.this
                l9.l r7 = r7.f22362b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.Ref$ObjectRef r2 = r5.f22365b
                T r2 = r2.element
                kotlinx.coroutines.internal.c0 r4 = kotlinx.coroutines.flow.internal.l.f22480a
                if (r2 == r4) goto L58
                kotlinx.coroutines.flow.DistinctFlowImpl r4 = kotlinx.coroutines.flow.DistinctFlowImpl.this
                l9.p r4 = r4.f22363c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                y8.s r6 = y8.s.f25199a
                return r6
            L58:
                kotlin.jvm.internal.Ref$ObjectRef r2 = r5.f22365b
                r2.element = r7
                kotlinx.coroutines.flow.c r7 = r5.f22366c
                r0.label = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                y8.s r6 = y8.s.f25199a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.DistinctFlowImpl.AnonymousClass2.emit(java.lang.Object, c9.c):java.lang.Object");
        }
    }

    public DistinctFlowImpl(b bVar, l9.l lVar, l9.p pVar) {
        this.f22361a = bVar;
        this.f22362b = lVar;
        this.f22363c = pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlinx.coroutines.internal.c0] */
    @Override // kotlinx.coroutines.flow.b
    public Object collect(c cVar, c9.c cVar2) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = kotlinx.coroutines.flow.internal.l.f22480a;
        Object objCollect = this.f22361a.collect(new AnonymousClass2(ref$ObjectRef, cVar), cVar2);
        return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : y8.s.f25199a;
    }
}
