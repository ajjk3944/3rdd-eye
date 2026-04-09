package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.v4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC1996v4 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f17222b;

    public /* synthetic */ ExecutorC1996v4(Handler handler, int i) {
        this.f17221a = i;
        this.f17222b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f17221a) {
            case 0:
                this.f17222b.post(runnable);
                break;
            case 1:
                this.f17222b.post(runnable);
                break;
            default:
                this.f17222b.post(runnable);
                break;
        }
    }

    public ExecutorC1996v4(L6 l6, Handler handler) {
        this.f17221a = 0;
        this.f17222b = handler;
    }
}
