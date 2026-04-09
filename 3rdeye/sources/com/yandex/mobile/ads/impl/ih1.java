package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* loaded from: classes3.dex */
public final class ih1 extends Surface {

    /* renamed from: e, reason: collision with root package name */
    private static int f28670e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f28671f;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28672b;

    /* renamed from: c, reason: collision with root package name */
    private final a f28673c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f28674d;

    public static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        private t40 f28675b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f28676c;

        /* renamed from: d, reason: collision with root package name */
        private Error f28677d;

        /* renamed from: e, reason: collision with root package name */
        private RuntimeException f28678e;

        /* renamed from: f, reason: collision with root package name */
        private ih1 f28679f;

        public a() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i) {
            this.f28675b.getClass();
            this.f28675b.a(i);
            this.f28679f = new ih1(this, this.f28675b.a(), i != 0, 0);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        this.f28675b.getClass();
                        this.f28675b.b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e4) {
                    rs0.a("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                    this.f28677d = e4;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    rs0.a("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f28678e = e10;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        public final ih1 a(int i) {
            boolean z10;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f28676c = handler;
            this.f28675b = new t40(handler);
            synchronized (this) {
                z10 = false;
                this.f28676c.obtainMessage(1, i, 0).sendToTarget();
                while (this.f28679f == null && this.f28678e == null && this.f28677d == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f28678e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f28677d;
            if (error != null) {
                throw error;
            }
            ih1 ih1Var = this.f28679f;
            ih1Var.getClass();
            return ih1Var;
        }
    }

    public /* synthetic */ ih1(a aVar, SurfaceTexture surfaceTexture, boolean z10, int i) {
        this(aVar, surfaceTexture, z10);
    }

    public static ih1 a(Context context, boolean z10) {
        if (!z10 || a(context)) {
            return new a().a(z10 ? f28670e : 0);
        }
        throw new IllegalStateException();
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f28673c) {
            try {
                if (!this.f28674d) {
                    a aVar = this.f28673c;
                    aVar.f28676c.getClass();
                    aVar.f28676c.sendEmptyMessage(2);
                    this.f28674d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ih1(a aVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f28673c = aVar;
        this.f28672b = z10;
    }

    public static synchronized boolean a(Context context) {
        int i;
        try {
            if (!f28671f) {
                if (ke0.a(context)) {
                    i = ke0.c() ? 1 : 2;
                } else {
                    i = 0;
                }
                f28670e = i;
                f28671f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f28670e != 0;
    }
}
