package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lkotlinx/coroutines/flow/c;", "", "it", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/c;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {329, 258}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,328:1\n116#2,4:329\n*E\n"})
/* loaded from: classes4.dex */
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 extends SuspendLambda implements l9.q {
    final /* synthetic */ l9.r $transform$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2(c9.c cVar, l9.r rVar) {
        super(3, cVar);
        this.$transform$inlined = rVar;
    }

    @Override // l9.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(c cVar, Object[] objArr, c9.c cVar2) {
        FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 = new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2(cVar2, this.$transform$inlined);
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2.L$0 = cVar;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2.L$1 = objArr;
        return flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2.invokeSuspend(y8.s.f25199a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.c.b(r8)
            goto L56
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.c r1 = (kotlinx.coroutines.flow.c) r1
            kotlin.c.b(r8)
            goto L4a
        L22:
            kotlin.c.b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.flow.c r1 = (kotlinx.coroutines.flow.c) r1
            java.lang.Object r8 = r7.L$1
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            l9.r r4 = r7.$transform$inlined
            r5 = 0
            r5 = r8[r5]
            r6 = r8[r3]
            r8 = r8[r2]
            r7.L$0 = r1
            r7.label = r3
            r3 = 6
            kotlin.jvm.internal.n.c(r3)
            java.lang.Object r8 = r4.c(r5, r6, r8, r7)
            r3 = 7
            kotlin.jvm.internal.n.c(r3)
            if (r8 != r0) goto L4a
            goto L55
        L4a:
            r3 = 0
            r7.L$0 = r3
            r7.label = r2
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L56
        L55:
            return r0
        L56:
            y8.s r8 = y8.s.f25199a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
