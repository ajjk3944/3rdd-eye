package com.unity3d.services.core.domain.task;

import c9.c;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.NetworkIOException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.j0;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/j0;", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "<anonymous>", "(Lkotlinx/coroutines/j0;)Lkotlin/Result;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2", f = "InitializeStateConfig.kt", i = {0}, l = {32}, m = "invokeSuspend", n = {"configuration"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nInitializeStateConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializeStateConfig.kt\ncom/unity3d/services/core/domain/task/InitializeStateConfig$doWork$2\n+ 2 CoroutineExtensions.kt\ncom/unity3d/services/core/extensions/CoroutineExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n24#2:45\n14#2,12:46\n26#2:59\n1#3:58\n*S KotlinDebug\n*F\n+ 1 InitializeStateConfig.kt\ncom/unity3d/services/core/domain/task/InitializeStateConfig$doWork$2\n*L\n25#1:45\n25#1:46,12\n25#1:59\n25#1:58\n*E\n"})
/* loaded from: classes3.dex */
public final class InitializeStateConfig$doWork$2 extends SuspendLambda implements p {
    final /* synthetic */ InitializeStateConfig.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfig$doWork$2(InitializeStateConfig.Params params, InitializeStateConfig initializeStateConfig, c cVar) {
        super(2, cVar);
        this.$params = params;
        this.this$0 = initializeStateConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c create(@Nullable Object obj, @NotNull c cVar) {
        return new InitializeStateConfig$doWork$2(this.$params, this.this$0, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objB;
        Configuration configuration;
        Object objMo231invokegIAlus;
        Object objF = a.f();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                InitializeStateConfig.Params params = this.$params;
                InitializeStateConfig initializeStateConfig = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
                Configuration configuration2 = new Configuration(SdkProperties.getConfigUrl(), params.getConfig().getExperimentsReader());
                try {
                    InitializeStateConfigWithLoader initializeStateConfigWithLoader = initializeStateConfig.initializeStateConfigWithLoader;
                    InitializeStateConfigWithLoader.Params params2 = new InitializeStateConfigWithLoader.Params(configuration2);
                    this.L$0 = configuration2;
                    this.label = 1;
                    objMo231invokegIAlus = initializeStateConfigWithLoader.mo231invokegIAlus((BaseParams) params2, (c) this);
                    if (objMo231invokegIAlus == objF) {
                        return objF;
                    }
                    configuration = configuration2;
                } catch (NetworkIOException e10) {
                    e = e10;
                    configuration = configuration2;
                    throw new InitializationException(ErrorState.NetworkConfigRequest, e, configuration);
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                configuration = (Configuration) this.L$0;
                try {
                    kotlin.c.b(obj);
                    objMo231invokegIAlus = ((Result) obj).getValue();
                } catch (NetworkIOException e11) {
                    e = e11;
                    throw new InitializationException(ErrorState.NetworkConfigRequest, e, configuration);
                }
            }
            kotlin.c.b(objMo231invokegIAlus);
            objB = Result.b((Configuration) objMo231invokegIAlus);
        } catch (CancellationException e12) {
            throw e12;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        if (Result.h(objB)) {
            objB = Result.b(objB);
        } else {
            Throwable thE = Result.e(objB);
            if (thE != null) {
                objB = Result.b(kotlin.c.a(thE));
            }
        }
        return Result.a(objB);
    }

    @Override // l9.p
    @Nullable
    public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
        return ((InitializeStateConfig$doWork$2) create(j0Var, cVar)).invokeSuspend(s.f25199a);
    }
}
