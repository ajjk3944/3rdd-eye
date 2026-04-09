package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class W implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f24299b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f24299b.post(runnable);
    }
}
