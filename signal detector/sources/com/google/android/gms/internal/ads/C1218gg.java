package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: com.google.android.gms.internal.ads.gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1218gg extends Thread implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: P, reason: collision with root package name */
    public static final float[] f14336P = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: C, reason: collision with root package name */
    public SurfaceTexture f14337C;

    /* renamed from: D, reason: collision with root package name */
    public int f14338D;

    /* renamed from: E, reason: collision with root package name */
    public int f14339E;

    /* renamed from: F, reason: collision with root package name */
    public int f14340F;

    /* renamed from: G, reason: collision with root package name */
    public final FloatBuffer f14341G;

    /* renamed from: H, reason: collision with root package name */
    public final CountDownLatch f14342H;

    /* renamed from: I, reason: collision with root package name */
    public final Object f14343I;

    /* renamed from: J, reason: collision with root package name */
    public EGL10 f14344J;

    /* renamed from: K, reason: collision with root package name */
    public EGLDisplay f14345K;

    /* renamed from: L, reason: collision with root package name */
    public EGLContext f14346L;
    public EGLSurface M;

    /* renamed from: N, reason: collision with root package name */
    public volatile boolean f14347N;

    /* renamed from: O, reason: collision with root package name */
    public volatile boolean f14348O;

    /* renamed from: a, reason: collision with root package name */
    public final C1164fg f14349a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f14350b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f14351c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f14352d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f14353e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f14354f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f14355g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f14356h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f14357j;

    /* renamed from: k, reason: collision with root package name */
    public float f14358k;

    /* renamed from: l, reason: collision with root package name */
    public int f14359l;

    /* renamed from: m, reason: collision with root package name */
    public int f14360m;

    /* renamed from: n, reason: collision with root package name */
    public SurfaceTexture f14361n;

    public C1218gg(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f14341G = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(f14336P).position(0);
        this.f14350b = new float[9];
        this.f14351c = new float[9];
        this.f14352d = new float[9];
        this.f14353e = new float[9];
        this.f14354f = new float[9];
        this.f14355g = new float[9];
        this.f14356h = new float[9];
        this.i = Float.NaN;
        C1164fg c1164fg = new C1164fg(context);
        this.f14349a = c1164fg;
        c1164fg.f14116h = this;
        this.f14342H = new CountDownLatch(1);
        this.f14343I = new Object();
    }

    public static final void f(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 10 + String.valueOf(iGlGetError).length());
            sb.append(str);
            sb.append(": glError ");
            sb.append(iGlGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    public static final void g(float[] fArr, float[] fArr2, float[] fArr3) {
        float f2 = fArr2[0] * fArr3[0];
        float f5 = fArr2[1];
        float f6 = fArr3[3];
        float f7 = fArr2[2];
        float f8 = fArr3[6];
        fArr[0] = f2 + (f5 * f6) + (f7 * f8);
        float f9 = fArr2[0];
        float f10 = fArr3[1] * f9;
        float f11 = fArr3[4];
        float f12 = fArr3[7];
        fArr[1] = f10 + (f5 * f11) + (f7 * f12);
        float f13 = f9 * fArr3[2];
        float f14 = fArr2[1];
        float f15 = fArr3[5];
        float f16 = fArr3[8];
        fArr[2] = f13 + (f14 * f15) + (f7 * f16);
        float f17 = fArr2[3];
        float f18 = fArr3[0];
        float f19 = fArr2[4];
        float f20 = fArr2[5];
        fArr[3] = (f17 * f18) + (f6 * f19) + (f20 * f8);
        float f21 = fArr2[3];
        float f22 = fArr3[1];
        fArr[4] = (f21 * f22) + (f19 * f11) + (f20 * f12);
        float f23 = fArr3[2];
        fArr[5] = (f21 * f23) + (fArr2[4] * f15) + (f20 * f16);
        float f24 = fArr2[6] * f18;
        float f25 = fArr2[7];
        float f26 = fArr3[3] * f25;
        float f27 = fArr2[8];
        fArr[6] = f24 + f26 + (f8 * f27);
        float f28 = fArr2[6];
        float f29 = f12 * f27;
        fArr[7] = f29 + (f25 * fArr3[4]) + (f22 * f28);
        fArr[8] = (f28 * f23) + (fArr2[7] * fArr3[5]) + (f27 * f16);
    }

    public static final void h(float[] fArr, float f2) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d6 = f2;
        fArr[4] = (float) Math.cos(d6);
        fArr[5] = (float) (-Math.sin(d6));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d6);
        fArr[8] = (float) Math.cos(d6);
    }

    public static final void i(float[] fArr, float f2) {
        double d6 = f2;
        fArr[0] = (float) Math.cos(d6);
        fArr[1] = (float) (-Math.sin(d6));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d6);
        fArr[4] = (float) Math.cos(d6);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int j(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        f("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            f("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            f("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            f("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                f("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public final void a() {
        Object obj = this.f14343I;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b(int i, int i3) {
        Object obj = this.f14343I;
        synchronized (obj) {
            this.f14360m = i;
            this.f14359l = i3;
            this.f14347N = true;
            obj.notifyAll();
        }
    }

    public final void c() {
        Object obj = this.f14343I;
        synchronized (obj) {
            this.f14348O = true;
            this.f14337C = null;
            obj.notifyAll();
        }
    }

    public final void d(float f2, float f5) {
        int i = this.f14360m;
        int i3 = this.f14359l;
        if (i <= i3) {
            i = i3;
        }
        float f6 = i;
        this.f14357j -= (f2 * 1.7453293f) / f6;
        float f7 = this.f14358k - ((f5 * 1.7453293f) / f6);
        this.f14358k = f7;
        if (f7 < -1.5707964f) {
            this.f14358k = -1.5707964f;
            f7 = -1.5707964f;
        }
        if (f7 > 1.5707964f) {
            this.f14358k = 1.5707964f;
        }
    }

    public final void e() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.M;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.f14344J.eglMakeCurrent(this.f14345K, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f14344J.eglDestroySurface(this.f14345K, this.M);
            this.M = null;
        }
        EGLContext eGLContext = this.f14346L;
        if (eGLContext != null) {
            this.f14344J.eglDestroyContext(this.f14345K, eGLContext);
            this.f14346L = null;
        }
        EGLDisplay eGLDisplay = this.f14345K;
        if (eGLDisplay != null) {
            this.f14344J.eglTerminate(eGLDisplay);
            this.f14345K = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f14340F++;
        Object obj = this.f14343I;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1218gg.run():void");
    }
}
