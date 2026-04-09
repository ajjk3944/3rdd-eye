package Xg;

import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import jp.co.cyberagent.android.gpuimage.GPUImageNativeLibrary;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private GLSurfaceView.Renderer f24330a;

    /* renamed from: b, reason: collision with root package name */
    private int f24331b;

    /* renamed from: c, reason: collision with root package name */
    private int f24332c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f24333d;

    /* renamed from: e, reason: collision with root package name */
    private EGL10 f24334e;

    /* renamed from: f, reason: collision with root package name */
    private EGLDisplay f24335f;

    /* renamed from: g, reason: collision with root package name */
    private EGLConfig[] f24336g;

    /* renamed from: h, reason: collision with root package name */
    private EGLConfig f24337h;

    /* renamed from: i, reason: collision with root package name */
    private EGLContext f24338i;

    /* renamed from: j, reason: collision with root package name */
    private EGLSurface f24339j;

    /* renamed from: k, reason: collision with root package name */
    private GL10 f24340k;

    /* renamed from: l, reason: collision with root package name */
    private String f24341l;

    public a(int i10, int i11) {
        this.f24331b = i10;
        this.f24332c = i11;
        int[] iArr = {12375, i10, 12374, i11, 12344};
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f24334e = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f24335f = eGLDisplayEglGetDisplay;
        this.f24334e.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
        EGLConfig eGLConfigA = a();
        this.f24337h = eGLConfigA;
        this.f24338i = this.f24334e.eglCreateContext(this.f24335f, eGLConfigA, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        EGLSurface eGLSurfaceEglCreatePbufferSurface = this.f24334e.eglCreatePbufferSurface(this.f24335f, this.f24337h, iArr);
        this.f24339j = eGLSurfaceEglCreatePbufferSurface;
        this.f24334e.eglMakeCurrent(this.f24335f, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, this.f24338i);
        this.f24340k = (GL10) this.f24338i.getGL();
        this.f24341l = Thread.currentThread().getName();
    }

    private EGLConfig a() {
        int[] iArr = {12325, 0, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
        int[] iArr2 = new int[1];
        this.f24334e.eglChooseConfig(this.f24335f, iArr, null, 0, iArr2);
        int i10 = iArr2[0];
        EGLConfig[] eGLConfigArr = new EGLConfig[i10];
        this.f24336g = eGLConfigArr;
        this.f24334e.eglChooseConfig(this.f24335f, iArr, eGLConfigArr, i10, iArr2);
        return this.f24336g[0];
    }

    private void b() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f24331b, this.f24332c, Bitmap.Config.ARGB_8888);
        this.f24333d = bitmapCreateBitmap;
        GPUImageNativeLibrary.adjustBitmap(bitmapCreateBitmap);
    }

    public Bitmap c() {
        if (this.f24330a == null) {
            Log.e("PixelBuffer", "getBitmap: Renderer was not set.");
            return null;
        }
        if (!Thread.currentThread().getName().equals(this.f24341l)) {
            Log.e("PixelBuffer", "getBitmap: This thread does not own the OpenGL context.");
            return null;
        }
        this.f24330a.onDrawFrame(this.f24340k);
        this.f24330a.onDrawFrame(this.f24340k);
        b();
        return this.f24333d;
    }

    public void d(GLSurfaceView.Renderer renderer) {
        this.f24330a = renderer;
        if (!Thread.currentThread().getName().equals(this.f24341l)) {
            Log.e("PixelBuffer", "setRenderer: This thread does not own the OpenGL context.");
        } else {
            this.f24330a.onSurfaceCreated(this.f24340k, this.f24337h);
            this.f24330a.onSurfaceChanged(this.f24340k, this.f24331b, this.f24332c);
        }
    }
}
