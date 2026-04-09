package com.unity3d.ads.core.domain.offerwall;

import c9.c;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086Bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/offerwall/LoadOfferwallAd;", "", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "offerwallManager", "<init>", "(Lcom/unity3d/ads/core/data/manager/OfferwallManager;)V", "", HandleInvocationsFromAdViewer.KEY_PLACEMENT_NAME, "Ly8/s;", "invoke", "(Ljava/lang/String;Lc9/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoadOfferwallAd {

    @NotNull
    private final OfferwallManager offerwallManager;

    public LoadOfferwallAd(@NotNull OfferwallManager offerwallManager) {
        p.e(offerwallManager, "offerwallManager");
        this.offerwallManager = offerwallManager;
    }

    @Nullable
    public final Object invoke(@NotNull String str, @NotNull c cVar) {
        Object objLoadAd = this.offerwallManager.loadAd(str, cVar);
        return objLoadAd == a.f() ? objLoadAd : s.f25199a;
    }
}
