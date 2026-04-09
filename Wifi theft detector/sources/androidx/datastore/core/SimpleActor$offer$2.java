package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.j0;
import l9.p;
import y8.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", i = {}, l = {122, 122}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SimpleActor$offer$2 extends SuspendLambda implements p {
    Object L$0;
    int label;
    final /* synthetic */ SimpleActor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor simpleActor, c9.c cVar) {
        super(2, cVar);
        this.this$0 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c9.c create(Object obj, c9.c cVar) {
        return new SimpleActor$offer$2(this.this$0, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r1.invoke(r6, r5) != r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[PHI: r1 r6
  0x0056: PHI (r1v1 l9.p) = (r1v2 l9.p), (r1v4 l9.p) binds: [B:16:0x0053, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r6v8 java.lang.Object) = (r6v15 java.lang.Object), (r6v0 java.lang.Object) binds: [B:16:0x0053, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:21:0x0062). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.c.b(r6)
            goto L62
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.L$0
            l9.p r1 = (l9.p) r1
            kotlin.c.b(r6)
            goto L56
        L22:
            kotlin.c.b(r6)
            androidx.datastore.core.SimpleActor r6 = r5.this$0
            java.util.concurrent.atomic.AtomicInteger r6 = androidx.datastore.core.SimpleActor.c(r6)
            int r6 = r6.get()
            if (r6 <= 0) goto L33
            r6 = r3
            goto L34
        L33:
            r6 = 0
        L34:
            if (r6 == 0) goto L71
        L36:
            androidx.datastore.core.SimpleActor r6 = r5.this$0
            kotlinx.coroutines.j0 r6 = androidx.datastore.core.SimpleActor.d(r6)
            kotlinx.coroutines.k0.f(r6)
            androidx.datastore.core.SimpleActor r6 = r5.this$0
            l9.p r1 = androidx.datastore.core.SimpleActor.a(r6)
            androidx.datastore.core.SimpleActor r6 = r5.this$0
            kotlinx.coroutines.channels.a r6 = androidx.datastore.core.SimpleActor.b(r6)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r6.x(r5)
            if (r6 != r0) goto L56
            goto L61
        L56:
            r4 = 0
            r5.L$0 = r4
            r5.label = r2
            java.lang.Object r6 = r1.invoke(r6, r5)
            if (r6 != r0) goto L62
        L61:
            return r0
        L62:
            androidx.datastore.core.SimpleActor r6 = r5.this$0
            java.util.concurrent.atomic.AtomicInteger r6 = androidx.datastore.core.SimpleActor.c(r6)
            int r6 = r6.decrementAndGet()
            if (r6 != 0) goto L36
            y8.s r6 = y8.s.f25199a
            return r6
        L71:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // l9.p
    public final Object invoke(j0 j0Var, c9.c cVar) {
        return ((SimpleActor$offer$2) create(j0Var, cVar)).invokeSuspend(s.f25199a);
    }
}
