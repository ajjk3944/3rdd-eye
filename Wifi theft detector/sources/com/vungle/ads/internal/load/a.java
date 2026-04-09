package com.vungle.ads.internal.load;

import com.vungle.ads.VungleError;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface a {
    void onFailure(@NotNull VungleError vungleError);

    void onSuccess(@NotNull q7.a aVar);
}
