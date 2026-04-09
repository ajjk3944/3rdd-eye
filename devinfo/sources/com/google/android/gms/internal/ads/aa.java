package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class aa implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f9289b;

    public /* synthetic */ aa(Handler handler, int i4) {
        this.f9288a = i4;
        this.f9289b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f9288a) {
            case 0:
                this.f9289b.post(runnable);
                break;
            case 1:
                this.f9289b.post(runnable);
                break;
            default:
                this.f9289b.post(runnable);
                break;
        }
    }

    public aa(fk0 fk0Var, Handler handler) {
        this.f9288a = 0;
        this.f9289b = handler;
    }
}
