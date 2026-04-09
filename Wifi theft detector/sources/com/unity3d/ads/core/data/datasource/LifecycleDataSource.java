package com.unity3d.ads.core.data.datasource;

import kotlin.Metadata;
import kotlinx.coroutines.flow.d1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "", "", "appIsForeground", "()Z", "Lkotlinx/coroutines/flow/d1;", "getAppActive", "()Lkotlinx/coroutines/flow/d1;", "appActive", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LifecycleDataSource {
    boolean appIsForeground();

    @NotNull
    d1 getAppActive();
}
