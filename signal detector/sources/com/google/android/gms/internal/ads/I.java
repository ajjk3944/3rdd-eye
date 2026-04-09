package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes.dex */
public final class I extends HandlerThread implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public RunnableC1332in f9048a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f9049b;

    /* renamed from: c, reason: collision with root package name */
    public Error f9050c;

    /* renamed from: d, reason: collision with root package name */
    public RuntimeException f9051d;

    /* renamed from: e, reason: collision with root package name */
    public J f9052e;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        RunnableC1332in runnableC1332in;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    int i3 = message.arg1;
                    RunnableC1332in runnableC1332in2 = this.f9048a;
                    if (runnableC1332in2 == null) {
                        throw null;
                    }
                    runnableC1332in2.a(i3);
                    SurfaceTexture surfaceTexture = this.f9048a.f14802f;
                    surfaceTexture.getClass();
                    this.f9052e = new J(this, surfaceTexture, i3 != 0);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (C1924tn e6) {
                    AbstractC2022vd.K("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                    this.f9051d = new IllegalStateException(e6);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e7) {
                    AbstractC2022vd.K("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                    this.f9050c = e7;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e8) {
                    AbstractC2022vd.K("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.f9051d = e8;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    runnableC1332in = this.f9048a;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (runnableC1332in == null) {
                    throw null;
                }
                runnableC1332in.b();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
