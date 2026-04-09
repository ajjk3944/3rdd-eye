package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class J implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }
}
