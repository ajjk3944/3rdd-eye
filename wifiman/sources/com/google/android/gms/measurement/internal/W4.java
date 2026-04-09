package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class W4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Bundle f36249a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36250b;

    W4(C4945r4 c4945r4, Bundle bundle) {
        this.f36249a = bundle;
        this.f36250b = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4945r4.S0(this.f36250b, this.f36249a);
    }
}
