package com.zipoapps.ads.config;

import b9.C1992A;
import com.zipoapps.ads.config.AdManagerConfiguration;
import p9.l;

/* compiled from: AdManagerConfiguration.kt */
/* loaded from: classes3.dex */
public final class AdManagerConfigurationKt {
    public static final AdManagerConfiguration adManagerConfig(l<? super AdManagerConfiguration.Builder, C1992A> buildConfig) {
        kotlin.jvm.internal.l.f(buildConfig, "buildConfig");
        AdManagerConfiguration.Builder builder = new AdManagerConfiguration.Builder(null, 1, null);
        buildConfig.invoke(builder);
        return builder.build();
    }
}
