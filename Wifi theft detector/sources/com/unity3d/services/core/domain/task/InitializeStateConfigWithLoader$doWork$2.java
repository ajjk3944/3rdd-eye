package com.unity3d.services.core.domain.task;

import c9.c;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.j0;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/j0;", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "<anonymous>", "(Lkotlinx/coroutines/j0;)Lkotlin/Result;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", i = {0, 0, 0, 1, 1, 2}, l = {58, 101, 109}, m = "invokeSuspend", n = {"$this$withContext", "configurationLoader", "config", "configurationLoader", "config", "config"}, s = {"L$0", "L$3", "L$4", "L$2", "L$3", "L$0"})
@SourceDebugExtension({"SMAP\nInitializeStateConfigWithLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializeStateConfigWithLoader.kt\ncom/unity3d/services/core/domain/task/InitializeStateConfigWithLoader$doWork$2\n+ 2 CoroutineExtensions.kt\ncom/unity3d/services/core/extensions/CoroutineExtensionsKt\n+ 3 IServiceComponent.kt\ncom/unity3d/services/core/di/IServiceComponentKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n24#2:151\n14#2,2:152\n16#2,10:162\n26#2:173\n16#3,4:154\n16#3,4:158\n1#4:172\n*S KotlinDebug\n*F\n+ 1 InitializeStateConfigWithLoader.kt\ncom/unity3d/services/core/domain/task/InitializeStateConfigWithLoader$doWork$2\n*L\n34#1:151\n34#1:152,2\n34#1:162,10\n34#1:173\n44#1:154,4\n53#1:158,4\n34#1:172\n*E\n"})
/* loaded from: classes3.dex */
public final class InitializeStateConfigWithLoader$doWork$2 extends SuspendLambda implements p {
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2(InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, c cVar) {
        super(2, cVar);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c create(@Nullable Object obj, @NotNull c cVar) {
        InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, cVar);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016a A[Catch: all -> 0x0024, CancellationException -> 0x0027, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:8:0x001f, B:56:0x01e0, B:62:0x0211, B:50:0x01ae, B:52:0x01b4, B:57:0x01ea, B:58:0x01fc, B:49:0x01a3, B:37:0x0164, B:39:0x016a, B:59:0x01fd, B:60:0x020a, B:61:0x020b, B:36:0x0159, B:27:0x0086), top: B:82:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b4 A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #6 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:8:0x001f, B:56:0x01e0, B:62:0x0211, B:50:0x01ae, B:52:0x01b4, B:57:0x01ea, B:58:0x01fc, B:49:0x01a3, B:37:0x0164, B:39:0x016a, B:59:0x01fd, B:60:0x020a, B:61:0x020b, B:36:0x0159, B:27:0x0086), top: B:82:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ea A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #6 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:8:0x001f, B:56:0x01e0, B:62:0x0211, B:50:0x01ae, B:52:0x01b4, B:57:0x01ea, B:58:0x01fc, B:49:0x01a3, B:37:0x0164, B:39:0x016a, B:59:0x01fd, B:60:0x020a, B:61:0x020b, B:36:0x0159, B:27:0x0086), top: B:82:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020b A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #6 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:8:0x001f, B:56:0x01e0, B:62:0x0211, B:50:0x01ae, B:52:0x01b4, B:57:0x01ea, B:58:0x01fc, B:49:0x01a3, B:37:0x0164, B:39:0x016a, B:59:0x01fd, B:60:0x020a, B:61:0x020b, B:36:0x0159, B:27:0x0086), top: B:82:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0231  */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, com.unity3d.services.core.configuration.Configuration] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, com.unity3d.services.core.configuration.PrivacyConfigurationLoader] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.unity3d.services.core.configuration.ConfigurationLoader] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // l9.p
    @Nullable
    public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
        return ((InitializeStateConfigWithLoader$doWork$2) create(j0Var, cVar)).invokeSuspend(s.f25199a);
    }
}
