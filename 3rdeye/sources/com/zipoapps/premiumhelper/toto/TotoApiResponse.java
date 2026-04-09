package com.zipoapps.premiumhelper.toto;

import kotlin.jvm.internal.l;
import sa.u;

/* compiled from: TotoApiResponse.kt */
/* loaded from: classes3.dex */
public final class TotoApiResponse<T> {
    private final u<T> data;
    private final TotoApiResponseInfo info;

    public TotoApiResponse(u<T> data, TotoApiResponseInfo info) {
        l.f(data, "data");
        l.f(info, "info");
        this.data = data;
        this.info = info;
    }

    public final u<T> getData() {
        return this.data;
    }

    public final TotoApiResponseInfo getInfo() {
        return this.info;
    }
}
