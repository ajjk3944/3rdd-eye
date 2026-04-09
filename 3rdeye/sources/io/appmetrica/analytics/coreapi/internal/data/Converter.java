package io.appmetrica.analytics.coreapi.internal.data;

/* loaded from: classes3.dex */
public interface Converter<S, P> {
    P fromModel(S s10);

    S toModel(P p10);
}
