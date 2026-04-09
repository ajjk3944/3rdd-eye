package androidx.media3.exoplayer.video;

import a5.a;
import a5.d0;
import a5.e;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import rb.b;

/* loaded from: classes.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: r, reason: collision with root package name */
    public static int f1941r;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f1942x;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1943a;

    /* renamed from: d, reason: collision with root package name */
    public final b f1944d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1945g;

    public PlaceholderSurface(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f1944d = bVar;
        this.f1943a = z10;
    }

    public static int d(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i10 = d0.f105a;
        if (i10 >= 24 && ((i10 >= 26 || !("samsung".equals(d0.f107c) || "XT1650".equals(d0.f108d))) && ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i10 >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean e(Context context) {
        try {
            if (!f1942x) {
                f1941r = d(context);
                f1942x = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f1941r != 0;
    }

    public static PlaceholderSurface f(Context context, boolean z10) {
        boolean z11 = false;
        a.i(!z10 || e(context));
        b bVar = new b("ExoPlayer:PlaceholderSurface", 1);
        int i10 = z10 ? f1941r : 0;
        bVar.start();
        Handler handler = new Handler(bVar.getLooper(), bVar);
        bVar.f21438d = handler;
        bVar.f21441x = new e(handler);
        synchronized (bVar) {
            bVar.f21438d.obtainMessage(1, i10, 0).sendToTarget();
            while (((PlaceholderSurface) bVar.f21442y) == null && bVar.f21440r == null && bVar.f21439g == null) {
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
        PlaceholderSurface placeholderSurface = (PlaceholderSurface) bVar.f21442y;
        placeholderSurface.getClass();
        return placeholderSurface;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f1944d) {
            try {
                if (!this.f1945g) {
                    b bVar = this.f1944d;
                    bVar.f21438d.getClass();
                    bVar.f21438d.sendEmptyMessage(2);
                    this.f1945g = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
