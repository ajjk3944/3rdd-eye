package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.appmetrica.analytics.impl.xl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5082xl implements X2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f42090a;

    public C5082xl(Context context) {
        this.f42090a = context;
    }

    public final Context b() {
        return this.f42090a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.X2, io.appmetrica.analytics.impl.InterfaceC4673hm
    public final void a(C4544cm c4544cm) {
    }
}
