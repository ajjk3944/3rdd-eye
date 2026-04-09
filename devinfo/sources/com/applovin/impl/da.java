package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class da implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3989a;

    public /* synthetic */ da(int i4) {
        this.f3989a = i4;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3989a) {
            case 0:
                AppLovinSdkUtils.runOnUiThread(runnable);
                break;
            case 1:
                runnable.run();
                break;
            default:
                q.a.G().f32029a.f32031b.execute(runnable);
                break;
        }
    }
}
