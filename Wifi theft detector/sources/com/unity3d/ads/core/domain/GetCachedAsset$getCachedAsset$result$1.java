package com.unity3d.ads.core.domain;

import c9.c;
import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.j0;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Lcom/unity3d/ads/core/data/model/CacheResult;", "<anonymous>", "(Lkotlinx/coroutines/j0;)Lcom/unity3d/ads/core/data/model/CacheResult;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.unity3d.ads.core.domain.GetCachedAsset$getCachedAsset$result$1", f = "GetCachedAsset.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GetCachedAsset$getCachedAsset$result$1 extends SuspendLambda implements p {
    final /* synthetic */ String $fileName;
    int label;
    final /* synthetic */ GetCachedAsset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCachedAsset$getCachedAsset$result$1(GetCachedAsset getCachedAsset, String str, c cVar) {
        super(2, cVar);
        this.this$0 = getCachedAsset;
        this.$fileName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c create(@Nullable Object obj, @NotNull c cVar) {
        return new GetCachedAsset$getCachedAsset$result$1(this.this$0, this.$fileName, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
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
        CacheRepository cacheRepository = this.this$0.cacheRepository;
        String str = this.$fileName;
        this.label = 1;
        Object objRetrieveFile = cacheRepository.retrieveFile(str, this);
        return objRetrieveFile == objF ? objF : objRetrieveFile;
    }

    @Override // l9.p
    @Nullable
    public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
        return ((GetCachedAsset$getCachedAsset$result$1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
    }
}
