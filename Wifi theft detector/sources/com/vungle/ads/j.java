package com.vungle.ads;

import android.content.Context;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface j extends a {
    @Override // com.vungle.ads.a
    @Nullable
    /* synthetic */ Boolean canPlayAd();

    @Override // com.vungle.ads.a
    /* synthetic */ void load(@Nullable String str);

    void play(@Nullable Context context);
}
