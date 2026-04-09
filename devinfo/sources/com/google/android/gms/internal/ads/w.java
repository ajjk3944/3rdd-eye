package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17802a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17803b;

    public /* synthetic */ w(int i4, Object obj) {
        this.f17802a = i4;
        this.f17803b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f17802a) {
            case 0:
                ((Executor) this.f17803b).execute(runnable);
                return;
            case 1:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((ya.b0) this.f17803b).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    ya.f0 f0Var = ua.j.C.f35261c;
                    Context context = ua.j.C.f35265h.f19197e;
                    if (context != null) {
                        try {
                            if (((Boolean) dm.f10517b.u()).booleanValue()) {
                                tb.b.a(context, th2);
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    throw th2;
                }
            default:
                ((no0) this.f17803b).e(runnable);
                return;
        }
    }

    public w() {
        this.f17802a = 1;
        this.f17803b = new ya.b0(Looper.getMainLooper(), 1);
    }
}
