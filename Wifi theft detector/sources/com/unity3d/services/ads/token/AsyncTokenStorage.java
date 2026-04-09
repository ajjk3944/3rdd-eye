package com.unity3d.services.ads.token;

import com.unity3d.services.ads.gmascar.managers.IBiddingManager;
import com.unity3d.services.core.configuration.Configuration;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/unity3d/services/ads/token/AsyncTokenStorage;", "", "Lcom/unity3d/services/core/configuration/Configuration;", "configuration", "Ly8/s;", "setConfiguration", "(Lcom/unity3d/services/core/configuration/Configuration;)V", "onTokenAvailable", "()V", "Lcom/unity3d/services/ads/gmascar/managers/IBiddingManager;", "biddingManager", "getToken", "(Lcom/unity3d/services/ads/gmascar/managers/IBiddingManager;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AsyncTokenStorage {
    void getToken(@Nullable IBiddingManager biddingManager);

    void onTokenAvailable();

    void setConfiguration(@Nullable Configuration configuration);
}
