package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes3.dex */
public final class K implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f39702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f39703b;

    public K(M m10, Context context) {
        this.f39703b = m10;
        this.f39702a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f39703b.f39815a.a(this.f39702a);
    }
}
