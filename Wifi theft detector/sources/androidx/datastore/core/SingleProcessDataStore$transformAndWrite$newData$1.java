package androidx.datastore.core;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.j0;
import l9.p;
import y8.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/j0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", i = {}, l = {TTAdConstant.AD_ID_IS_NULL_CODE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SingleProcessDataStore$transformAndWrite$newData$1 extends SuspendLambda implements p {
    final /* synthetic */ Object $curData;
    final /* synthetic */ p $transform;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$transformAndWrite$newData$1(p pVar, Object obj, c9.c cVar) {
        super(2, cVar);
        this.$transform = pVar;
        this.$curData = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c9.c create(Object obj, c9.c cVar) {
        return new SingleProcessDataStore$transformAndWrite$newData$1(this.$transform, this.$curData, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = kotlin.coroutines.intrinsics.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return obj;
        }
        kotlin.c.b(obj);
        p pVar = this.$transform;
        Object obj2 = this.$curData;
        this.label = 1;
        Object objInvoke = pVar.invoke(obj2, this);
        return objInvoke == objF ? objF : objInvoke;
    }

    @Override // l9.p
    public final Object invoke(j0 j0Var, c9.c cVar) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
    }
}
