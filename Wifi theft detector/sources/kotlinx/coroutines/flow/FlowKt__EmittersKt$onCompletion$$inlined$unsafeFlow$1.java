package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* loaded from: classes4.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f22372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l9.q f22373b;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {113, 120, 127}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u242", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c9.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(b bVar, l9.q qVar) {
        this.f22372a = bVar;
        this.f22373b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.c r9, c9.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L55
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.flow.internal.SafeCollector r9 = (kotlinx.coroutines.flow.internal.SafeCollector) r9
            kotlin.c.b(r10)     // Catch: java.lang.Throwable -> L34
            goto L89
        L34:
            r10 = move-exception
            goto L93
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.L$0
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.c.b(r10)
            goto Lad
        L47:
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.flow.c r9 = (kotlinx.coroutines.flow.c) r9
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r2 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) r2
            kotlin.c.b(r10)     // Catch: java.lang.Throwable -> L53
            goto L68
        L53:
            r9 = move-exception
            goto L99
        L55:
            kotlin.c.b(r10)
            kotlinx.coroutines.flow.b r10 = r8.f22372a     // Catch: java.lang.Throwable -> L97
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L97
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L97
            r0.label = r5     // Catch: java.lang.Throwable -> L97
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L97
            if (r10 != r1) goto L67
            goto Lac
        L67:
            r2 = r8
        L68:
            kotlinx.coroutines.flow.internal.SafeCollector r10 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.d r4 = r0.getContext()
            r10.<init>(r9, r4)
            l9.q r9 = r2.f22373b     // Catch: java.lang.Throwable -> L8f
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L8f
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L8f
            r0.label = r3     // Catch: java.lang.Throwable -> L8f
            r2 = 6
            kotlin.jvm.internal.n.c(r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8f
            r0 = 7
            kotlin.jvm.internal.n.c(r0)     // Catch: java.lang.Throwable -> L8f
            if (r9 != r1) goto L88
            goto Lac
        L88:
            r9 = r10
        L89:
            r9.releaseIntercepted()
            y8.s r9 = y8.s.f25199a
            return r9
        L8f:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L93:
            r9.releaseIntercepted()
            throw r10
        L97:
            r9 = move-exception
            r2 = r8
        L99:
            kotlinx.coroutines.flow.g1 r10 = new kotlinx.coroutines.flow.g1
            r10.<init>(r9)
            l9.q r2 = r2.f22373b
            r0.L$0 = r9
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt__EmittersKt.a(r10, r2, r9, r0)
            if (r10 != r1) goto Lad
        Lac:
            return r1
        Lad:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.c, c9.c):java.lang.Object");
    }
}
