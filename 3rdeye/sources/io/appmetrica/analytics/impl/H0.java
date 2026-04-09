package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes3.dex */
public final class H0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f39554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f39555b;

    public H0(C4859p1 c4859p1, Intent intent) {
        this.f39555b = c4859p1;
        this.f39554a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R7 r72 = this.f39555b.d().f39255b;
        Intent intent = this.f39554a;
        r72.getClass();
        if (intent != null) {
            r72.a(intent.getDataString(), false);
        }
    }
}
