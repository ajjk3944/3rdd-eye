package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.a0;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class c extends AdInternal {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context) {
        super(context);
        p.e(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    @Nullable
    public a0 getAdSizeForAdRequest() {
        return null;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(@Nullable a0 a0Var) {
        return true;
    }
}
