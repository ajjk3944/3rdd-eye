package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes3.dex */
public final class L implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f39735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Qi f39736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M f39737c;

    public L(M m10, Context context, Qi qi) {
        this.f39737c = m10;
        this.f39735a = context;
        this.f39736b = qi;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f39737c.f39815a.a(this.f39735a, this.f39736b);
    }
}
