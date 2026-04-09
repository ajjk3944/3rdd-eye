package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Savable;

/* loaded from: classes3.dex */
public final class H implements Savable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f39553a;

    public H(I i) {
        this.f39553a = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean getValue() {
        return Boolean.valueOf(this.f39553a.f39591a.a(false));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    public final /* bridge */ /* synthetic */ void setValue(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    public final void a(boolean z10) {
        this.f39553a.f39591a.e(z10);
    }
}
