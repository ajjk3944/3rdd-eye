package com.unity3d.services.core.domain.task;

import c9.c;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.properties.SdkProperties;
import i9.g;
import java.io.File;
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
import org.json.JSONObject;
import y8.s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/j0;", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "<anonymous>", "(Lkotlinx/coroutines/j0;)Lkotlin/Result;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2", f = "ConfigFileFromLocalStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nConfigFileFromLocalStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigFileFromLocalStorage.kt\ncom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage$doWork$2\n+ 2 CoroutineExtensions.kt\ncom/unity3d/services/core/extensions/CoroutineExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n24#2:48\n14#2,12:49\n26#2:62\n1#3:61\n*S KotlinDebug\n*F\n+ 1 ConfigFileFromLocalStorage.kt\ncom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage$doWork$2\n*L\n28#1:48\n28#1:49,12\n28#1:62\n28#1:61\n*E\n"})
/* loaded from: classes3.dex */
public final class ConfigFileFromLocalStorage$doWork$2 extends SuspendLambda implements p {
    final /* synthetic */ ConfigFileFromLocalStorage.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigFileFromLocalStorage$doWork$2(ConfigFileFromLocalStorage.Params params, c cVar) {
        super(2, cVar);
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c create(@Nullable Object obj, @NotNull c cVar) {
        return new ConfigFileFromLocalStorage$doWork$2(this.$params, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objB;
        a.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        ConfigFileFromLocalStorage.Params params = this.$params;
        try {
            Result.Companion companion = Result.INSTANCE;
            File file = new File(SdkProperties.getLocalConfigurationFilepath());
            objB = Result.b(!file.exists() ? params.getDefaultConfiguration() : new Configuration(new JSONObject(g.k(file, null, 1, null))));
        } catch (CancellationException e10) {
            throw e10;
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
        return ((ConfigFileFromLocalStorage$doWork$2) create(j0Var, cVar)).invokeSuspend(s.f25199a);
    }
}
