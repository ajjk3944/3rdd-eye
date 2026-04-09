package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes3.dex */
public final class FinalConfigProvider<T> implements ConfigProvider<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f42402a;

    public FinalConfigProvider(T t10) {
        this.f42402a = t10;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    public T getConfig() {
        return (T) this.f42402a;
    }
}
