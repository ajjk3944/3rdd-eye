package com.unity3d.services.core.di;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import l9.a;
import org.jetbrains.annotations.NotNull;
import y8.h;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "initializer", "Ly8/h;", "factoryOf", "(Ll9/a;)Ly8/h;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceFactoryKt {
    @NotNull
    public static final <T> h factoryOf(@NotNull a initializer) {
        p.e(initializer, "initializer");
        return new Factory(initializer);
    }
}
