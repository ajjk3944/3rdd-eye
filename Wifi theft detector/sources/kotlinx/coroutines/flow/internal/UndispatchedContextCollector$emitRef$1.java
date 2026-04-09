package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import y8.s;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "Ly8/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {Sdk$SDKError.Reason.INVALID_BID_PAYLOAD_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class UndispatchedContextCollector$emitRef$1 extends SuspendLambda implements l9.p {
    final /* synthetic */ kotlinx.coroutines.flow.c $downstream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndispatchedContextCollector$emitRef$1(kotlinx.coroutines.flow.c cVar, c9.c cVar2) {
        super(2, cVar2);
        this.$downstream = cVar;
    }

    @Override // l9.p
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Object obj, c9.c cVar) {
        return ((UndispatchedContextCollector$emitRef$1) create(obj, cVar)).invokeSuspend(s.f25199a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c9.c create(Object obj, c9.c cVar) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.$downstream, cVar);
        undispatchedContextCollector$emitRef$1.L$0 = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = kotlin.coroutines.intrinsics.a.f();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            Object obj2 = this.L$0;
            kotlinx.coroutines.flow.c cVar = this.$downstream;
            this.label = 1;
            if (cVar.emit(obj2, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return s.f25199a;
    }
}
