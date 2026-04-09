package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import qb.d;
import qb.v;
import rb.b;

/* loaded from: classes.dex */
public final class DummySurface extends Surface {

    /* renamed from: r, reason: collision with root package name */
    public static int f4760r;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f4761x;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4762a;

    /* renamed from: d, reason: collision with root package name */
    public final b f4763d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4764g;

    public DummySurface(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f4763d = bVar;
        this.f4762a = z10;
    }

    public static int d(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i10 = v.f20828a;
        if (i10 >= 24 && ((i10 >= 26 || !("samsung".equals(v.f20830c) || "XT1650".equals(v.f20831d))) && ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i10 >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean e(Context context) {
        try {
            if (!f4761x) {
                f4760r = d(context);
                f4761x = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4760r != 0;
    }

    public static DummySurface f(Context context, boolean z10) {
        boolean z11 = false;
        qb.b.j(!z10 || e(context));
        b bVar = new b("ExoPlayer:DummySurface", 0);
        int i10 = z10 ? f4760r : 0;
        bVar.start();
        Handler handler = new Handler(bVar.getLooper(), bVar);
        bVar.f21438d = handler;
        bVar.f21441x = new d(handler);
        synchronized (bVar) {
            bVar.f21438d.obtainMessage(1, i10, 0).sendToTarget();
            while (((DummySurface) bVar.f21442y) == null && bVar.f21440r == null && bVar.f21439g == null) {
                try {
                    bVar.wait();
                } catch (InterruptedException unused) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = bVar.f21440r;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = bVar.f21439g;
        if (error != null) {
            throw error;
        }
        DummySurface dummySurface = (DummySurface) bVar.f21442y;
        dummySurface.getClass();
        return dummySurface;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f4763d) {
            try {
                if (!this.f4764g) {
                    b bVar = this.f4763d;
                    bVar.f21438d.getClass();
                    bVar.f21438d.sendEmptyMessage(2);
                    this.f4764g = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
