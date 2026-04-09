package com.unity3d.services.core.domain.task;

import c9.c;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.j0;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2$1$webViewData$1", f = "InitializeSDK.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class InitializeSDK$doWork$2$1$webViewData$1 extends SuspendLambda implements p {
    final /* synthetic */ Object $configResult;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$2$1$webViewData$1(InitializeSDK initializeSDK, Object obj, c cVar) {
        super(2, cVar);
        this.this$0 = initializeSDK;
        this.$configResult = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c create(@Nullable Object obj, @NotNull c cVar) {
        return new InitializeSDK$doWork$2$1$webViewData$1(this.this$0, this.$configResult, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objF = a.f();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            InitializeStateLoadWeb initializeStateLoadWeb = this.this$0.initializeStateLoadWeb;
            Object obj2 = this.$configResult;
            kotlin.c.b(obj2);
            InitializeStateLoadWeb.Params params = new InitializeStateLoadWeb.Params((Configuration) obj2);
            this.label = 1;
            if (initializeStateLoadWeb.mo231invokegIAlus(params, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            ((Result) obj).getValue();
        }
        return s.f25199a;
    }

    @Override // l9.p
    @Nullable
    public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
        return ((InitializeSDK$doWork$2$1$webViewData$1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
    }
}
