package qb;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* loaded from: classes.dex */
public final class d implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] B = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    public final Handler f20771a;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f20772d = new int[1];

    /* renamed from: g, reason: collision with root package name */
    public EGLDisplay f20773g;

    /* renamed from: r, reason: collision with root package name */
    public EGLContext f20774r;

    /* renamed from: x, reason: collision with root package name */
    public EGLSurface f20775x;

    /* renamed from: y, reason: collision with root package name */
    public SurfaceTexture f20776y;

    public d(Handler handler) {
        this.f20771a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f20771a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f20776y;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
