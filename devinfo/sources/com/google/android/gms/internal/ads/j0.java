package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j0 extends HandlerThread implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public dc0 f12552a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f12553b;

    /* renamed from: c, reason: collision with root package name */
    public Error f12554c;

    /* renamed from: d, reason: collision with root package name */
    public RuntimeException f12555d;

    /* renamed from: e, reason: collision with root package name */
    public k0 f12556e;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        dc0 dc0Var;
        int i4 = message.what;
        try {
            if (i4 == 1) {
                try {
                    int i10 = message.arg1;
                    dc0 dc0Var2 = this.f12552a;
                    if (dc0Var2 == null) {
                        throw null;
                    }
                    dc0Var2.a(i10);
                    SurfaceTexture surfaceTexture = this.f12552a.f10431f;
                    surfaceTexture.getClass();
                    this.f12556e = new k0(this, surfaceTexture, i10 != 0);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (pc0 e2) {
                    ls.H("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.f12555d = new IllegalStateException(e2);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    ls.H("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f12554c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    ls.H("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f12555d = e11;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i4 == 2) {
                try {
                    dc0Var = this.f12552a;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (dc0Var == null) {
                    throw null;
                }
                dc0Var.b();
                return true;
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
