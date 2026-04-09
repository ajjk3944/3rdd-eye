package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class FlowKt__CollectKt$launchIn$1 extends SuspendLambda implements l9.p {
    final /* synthetic */ b $this_launchIn;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__CollectKt$launchIn$1(b bVar, c9.c cVar) {
        super(2, cVar);
        this.$this_launchIn = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c9.c create(Object obj, c9.c cVar) {
        return new FlowKt__CollectKt$launchIn$1(this.$this_launchIn, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = kotlin.coroutines.intrinsics.a.f();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            b bVar = this.$this_launchIn;
            this.label = 1;
            if (d.i(bVar, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return y8.s.f25199a;
    }

    @Override // l9.p
    public final Object invoke(kotlinx.coroutines.j0 j0Var, c9.c cVar) {
        return ((FlowKt__CollectKt$launchIn$1) create(j0Var, cVar)).invokeSuspend(y8.s.f25199a);
    }
}
