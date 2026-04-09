package com.yandex.mobile.ads.impl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class t40 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f33431h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b, reason: collision with root package name */
    private final Handler f33432b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f33433c = new int[1];

    /* renamed from: d, reason: collision with root package name */
    private EGLDisplay f33434d;

    /* renamed from: e, reason: collision with root package name */
    private EGLContext f33435e;

    /* renamed from: f, reason: collision with root package name */
    private EGLSurface f33436f;

    /* renamed from: g, reason: collision with root package name */
    private SurfaceTexture f33437g;

    public static final class a extends RuntimeException {
        public /* synthetic */ a(String str, int i) {
            this(str);
        }

        private a(String str) {
            super(str);
        }
    }

    public t40(Handler handler) {
        this.f33432b = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.f33437g;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    public final void b() {
        this.f33432b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f33437g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f33433c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f33434d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f33434d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f33436f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f33434d, this.f33436f);
            }
            EGLContext eGLContext = this.f33435e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f33434d, eGLContext);
            }
            if (s82.f32899a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f33434d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f33434d);
            }
            this.f33434d = null;
            this.f33435e = null;
            this.f33436f = null;
            this.f33437g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f33432b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f33437g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public final void a(int i) {
        EGLConfig eGLConfig;
        int[] iArr;
        int[] iArr2;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        int i10 = 0;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay != null) {
            int[] iArr3 = new int[2];
            if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr3, 0, iArr3, 1)) {
                this.f33434d = eGLDisplayEglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr4 = new int[1];
                boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f33431h, 0, eGLConfigArr, 0, 1, iArr4, 0);
                if (zEglChooseConfig && iArr4[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLDisplay eGLDisplay = this.f33434d;
                    if (i == 0) {
                        iArr = new int[]{12440, 2, 12344};
                    } else {
                        iArr = new int[]{12440, 2, 12992, 1, 12344};
                    }
                    EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    if (eGLContextEglCreateContext != null) {
                        this.f33435e = eGLContextEglCreateContext;
                        EGLDisplay eGLDisplay2 = this.f33434d;
                        if (i == 1) {
                            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            if (i == 2) {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                            } else {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                            }
                            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                            if (eGLSurfaceEglCreatePbufferSurface == null) {
                                throw new a("eglCreatePbufferSurface failed", i10);
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                            this.f33436f = eGLSurfaceEglCreatePbufferSurface;
                            GLES20.glGenTextures(1, this.f33433c, 0);
                            ke0.a();
                            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f33433c[0]);
                            this.f33437g = surfaceTexture;
                            surfaceTexture.setOnFrameAvailableListener(this);
                            return;
                        }
                        throw new a("eglMakeCurrent failed", i10);
                    }
                    throw new a("eglCreateContext failed", i10);
                }
                Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]};
                int i11 = s82.f32899a;
                throw new a(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), i10);
            }
            throw new a("eglInitialize failed", i10);
        }
        throw new a("eglGetDisplay failed", i10);
    }
}
