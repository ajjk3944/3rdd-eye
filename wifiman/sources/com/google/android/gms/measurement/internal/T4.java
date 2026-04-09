package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class T4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Bundle f36215a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36216b;

    T4(C4945r4 c4945r4, Bundle bundle) {
        this.f36215a = bundle;
        this.f36216b = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4945r4.b1(this.f36216b, this.f36215a);
    }
}
