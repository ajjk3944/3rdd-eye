package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* loaded from: classes3.dex */
public final class Kl implements S6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f39723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ll f39724b;

    public Kl(Ll ll, StartupParamsCallback startupParamsCallback) {
        this.f39724b = ll;
        this.f39723a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.S6
    public final void a(int i, Bundle bundle) {
        this.f39724b.b(bundle, this.f39723a);
    }
}
