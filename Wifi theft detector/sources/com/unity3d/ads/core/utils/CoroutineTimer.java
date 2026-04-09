package com.unity3d.ads.core.utils;

import kotlin.Metadata;
import kotlinx.coroutines.r1;
import l9.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/utils/CoroutineTimer;", "", "", "delayStartMillis", "repeatMillis", "Lkotlin/Function0;", "Ly8/s;", "action", "Lkotlinx/coroutines/r1;", "start", "(JJLl9/a;)Lkotlinx/coroutines/r1;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CoroutineTimer {
    @NotNull
    r1 start(long delayStartMillis, long repeatMillis, @NotNull a action);
}
