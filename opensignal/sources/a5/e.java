package a5;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* loaded from: classes.dex */
public final class e implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] B = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    public final Handler f116a;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f117d = new int[1];

    /* renamed from: g, reason: collision with root package name */
    public EGLDisplay f118g;

    /* renamed from: r, reason: collision with root package name */
    public EGLContext f119r;

    /* renamed from: x, reason: collision with root package name */
    public EGLSurface f120x;

    /* renamed from: y, reason: collision with root package name */
    public SurfaceTexture f121y;

    public e(Handler handler) {
        this.f116a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f116a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f121y;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
