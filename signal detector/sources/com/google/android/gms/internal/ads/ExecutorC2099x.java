package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executor;
import t2.C2911G;
import t2.HandlerC2908D;

/* renamed from: com.google.android.gms.internal.ads.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC2099x implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17529a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17530b;

    public /* synthetic */ ExecutorC2099x(int i, Object obj) {
        this.f17529a = i;
        this.f17530b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f17529a) {
            case 0:
                ((Executor) this.f17530b).execute(runnable);
                return;
            case 1:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((HandlerC2908D) this.f17530b).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    C2911G c2911g = p2.j.f22785C.f22790c;
                    Context context = p2.j.f22785C.f22795h.f8972e;
                    if (context != null) {
                        try {
                            if (((Boolean) AbstractC1857sa.f16750b.v()).booleanValue()) {
                                Q2.b.a(context, th);
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    throw th;
                }
            default:
                ((C1231gt) this.f17530b).e(runnable);
                return;
        }
    }

    public ExecutorC2099x() {
        this.f17529a = 1;
        this.f17530b = new HandlerC2908D(Looper.getMainLooper(), 3);
    }
}
