package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class i extends o {

    @Nullable
    private Long valueFirst;

    @Nullable
    private Long valueSecond;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Sdk$SDKMetric.SDKMetricType metricType) {
        super(metricType);
        kotlin.jvm.internal.p.e(metricType, "metricType");
    }

    @Nullable
    public final Long getValueFirst() {
        return this.valueFirst;
    }

    @Nullable
    public final Long getValueSecond() {
        return this.valueSecond;
    }

    public final void setValueFirst(@Nullable Long l10) {
        this.valueFirst = l10;
    }

    public final void setValueSecond(@Nullable Long l10) {
        this.valueSecond = l10;
    }
}
