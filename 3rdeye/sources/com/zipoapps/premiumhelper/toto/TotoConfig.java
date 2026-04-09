package com.zipoapps.premiumhelper.toto;

import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: TotoConfig.kt */
/* loaded from: classes3.dex */
public final class TotoConfig {
    private final List<WeightedValueParameter> params;
    private final TotoApiResponseInfo responseInfo;

    public TotoConfig(List<WeightedValueParameter> params, TotoApiResponseInfo responseInfo) {
        l.f(params, "params");
        l.f(responseInfo, "responseInfo");
        this.params = params;
        this.responseInfo = responseInfo;
    }

    public final List<WeightedValueParameter> getParams() {
        return this.params;
    }

    public final TotoApiResponseInfo getResponseInfo() {
        return this.responseInfo;
    }
}
