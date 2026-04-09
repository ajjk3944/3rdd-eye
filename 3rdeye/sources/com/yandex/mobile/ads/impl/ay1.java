package com.yandex.mobile.ads.impl;

import android.os.ConditionVariable;

/* loaded from: classes3.dex */
final class ay1 extends Thread {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConditionVariable f25023b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ by1 f25024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay1(by1 by1Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f25024c = by1Var;
        this.f25023b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f25024c) {
            this.f25023b.open();
            this.f25024c.b();
            this.f25024c.f25466b.getClass();
        }
    }
}
