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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xx extends Thread implements SurfaceTexture.OnFrameAvailableListener {
    public static final float[] B = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public volatile boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final wx f18537a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f18538b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f18539c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f18540d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f18541e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f18542f;
    public final float[] g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f18543h;

    /* renamed from: i, reason: collision with root package name */
    public float f18544i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f18545k;

    /* renamed from: l, reason: collision with root package name */
    public int f18546l;

    /* renamed from: m, reason: collision with root package name */
    public int f18547m;

    /* renamed from: n, reason: collision with root package name */
    public SurfaceTexture f18548n;

    /* renamed from: o, reason: collision with root package name */
    public SurfaceTexture f18549o;

    /* renamed from: p, reason: collision with root package name */
    public int f18550p;

    /* renamed from: q, reason: collision with root package name */
    public int f18551q;

    /* renamed from: r, reason: collision with root package name */
    public int f18552r;

    /* renamed from: s, reason: collision with root package name */
    public final FloatBuffer f18553s;

    /* renamed from: t, reason: collision with root package name */
    public final CountDownLatch f18554t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f18555u;

    /* renamed from: v, reason: collision with root package name */
    public EGL10 f18556v;

    /* renamed from: w, reason: collision with root package name */
    public EGLDisplay f18557w;

    /* renamed from: x, reason: collision with root package name */
    public EGLContext f18558x;

    /* renamed from: y, reason: collision with root package name */
    public EGLSurface f18559y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f18560z;

    public xx(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f18553s = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(B).position(0);
        this.f18538b = new float[9];
        this.f18539c = new float[9];
        this.f18540d = new float[9];
        this.f18541e = new float[9];
        this.f18542f = new float[9];
        this.g = new float[9];
        this.f18543h = new float[9];
        this.f18544i = Float.NaN;
        wx wxVar = new wx(context);
        this.f18537a = wxVar;
        wxVar.f18233h = this;
        this.f18554t = new CountDownLatch(1);
        this.f18555u = new Object();
    }

    public static final void f(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sb2 = new StringBuilder(str.length() + 10 + String.valueOf(iGlGetError).length());
            sb2.append(str);
            sb2.append(": glError ");
            sb2.append(iGlGetError);
            Log.e("SphericalVideoRenderer", sb2.toString());
        }
    }

    public static final void g(float[] fArr, float[] fArr2, float[] fArr3) {
        float f10 = fArr2[0] * fArr3[0];
        float f11 = fArr2[1];
        float f12 = fArr3[3];
        float f13 = fArr2[2];
        float f14 = fArr3[6];
        fArr[0] = f10 + (f11 * f12) + (f13 * f14);
        float f15 = fArr2[0];
        float f16 = fArr3[1] * f15;
        float f17 = fArr3[4];
        float f18 = fArr3[7];
        fArr[1] = f16 + (f11 * f17) + (f13 * f18);
        float f19 = f15 * fArr3[2];
        float f20 = fArr2[1];
        float f21 = fArr3[5];
        float f22 = fArr3[8];
        fArr[2] = f19 + (f20 * f21) + (f13 * f22);
        float f23 = fArr2[3];
        float f24 = fArr3[0];
        float f25 = fArr2[4];
        float f26 = fArr2[5];
        fArr[3] = (f23 * f24) + (f12 * f25) + (f26 * f14);
        float f27 = fArr2[3];
        float f28 = fArr3[1];
        fArr[4] = (f27 * f28) + (f25 * f17) + (f26 * f18);
        float f29 = fArr3[2];
        fArr[5] = (f27 * f29) + (fArr2[4] * f21) + (f26 * f22);
        float f30 = fArr2[6] * f24;
        float f31 = fArr2[7];
        float f32 = fArr3[3] * f31;
        float f33 = fArr2[8];
        fArr[6] = f30 + f32 + (f14 * f33);
        float f34 = fArr2[6];
        float f35 = f18 * f33;
        fArr[7] = f35 + (f31 * fArr3[4]) + (f28 * f34);
        fArr[8] = (f34 * f29) + (fArr2[7] * fArr3[5]) + (f33 * f22);
    }

    public static final void h(float[] fArr, float f10) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d10 = f10;
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = (float) (-Math.sin(d10));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d10);
        fArr[8] = (float) Math.cos(d10);
    }

    public static final void i(float[] fArr, float f10) {
        double d10 = f10;
        fArr[0] = (float) Math.cos(d10);
        fArr[1] = (float) (-Math.sin(d10));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d10);
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int j(int i4, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i4);
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
                StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 26);
                sb2.append("Could not compile shader ");
                sb2.append(i4);
                sb2.append(":");
                Log.e("SphericalVideoRenderer", sb2.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                f("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public final void a() {
        Object obj = this.f18555u;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b(int i4, int i10) {
        Object obj = this.f18555u;
        synchronized (obj) {
            this.f18547m = i4;
            this.f18546l = i10;
            this.f18560z = true;
            obj.notifyAll();
        }
    }

    public final void c() {
        Object obj = this.f18555u;
        synchronized (obj) {
            this.A = true;
            this.f18549o = null;
            obj.notifyAll();
        }
    }

    public final void d(float f10, float f11) {
        int i4 = this.f18547m;
        int i10 = this.f18546l;
        if (i4 <= i10) {
            i4 = i10;
        }
        float f12 = i4;
        this.j -= (f10 * 1.7453293f) / f12;
        float f13 = this.f18545k - ((f11 * 1.7453293f) / f12);
        this.f18545k = f13;
        if (f13 < -1.5707964f) {
            this.f18545k = -1.5707964f;
            f13 = -1.5707964f;
        }
        if (f13 > 1.5707964f) {
            this.f18545k = 1.5707964f;
        }
    }

    public final void e() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f18559y;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.f18556v.eglMakeCurrent(this.f18557w, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f18556v.eglDestroySurface(this.f18557w, this.f18559y);
            this.f18559y = null;
        }
        EGLContext eGLContext = this.f18558x;
        if (eGLContext != null) {
            this.f18556v.eglDestroyContext(this.f18557w, eGLContext);
            this.f18558x = null;
        }
        EGLDisplay eGLDisplay = this.f18557w;
        if (eGLDisplay != null) {
            this.f18556v.eglTerminate(eGLDisplay);
            this.f18557w = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f18552r++;
        Object obj = this.f18555u;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xx.run():void");
    }
}
