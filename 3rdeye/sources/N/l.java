package N;

import C.C;
import C.S;
import N7.G8;
import P.a;
import P.d;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: OpenGlRenderer.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: c, reason: collision with root package name */
    public Thread f4410c;

    /* renamed from: g, reason: collision with root package name */
    public EGLConfig f4414g;
    public Surface i;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f4408a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4409b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public EGLDisplay f4411d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e, reason: collision with root package name */
    public EGLContext f4412e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: f, reason: collision with root package name */
    public int[] f4413f = P.d.f10545a;

    /* renamed from: h, reason: collision with root package name */
    public EGLSurface f4415h = EGL14.EGL_NO_SURFACE;

    /* renamed from: j, reason: collision with root package name */
    public Map<d.e, d.f> f4416j = Collections.EMPTY_MAP;

    /* renamed from: k, reason: collision with root package name */
    public d.f f4417k = null;

    /* renamed from: l, reason: collision with root package name */
    public d.e f4418l = d.e.UNKNOWN;

    /* renamed from: m, reason: collision with root package name */
    public int f4419m = -1;

    public final void a(C c10, a.C0118a c0118a) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f4411d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f4411d, iArr, 0, iArr, 1)) {
            this.f4411d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (c0118a != null) {
            String str = iArr[0] + "." + iArr[1];
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            c0118a.f10532b = str;
        }
        int i = c10.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f4411d, new int[]{12324, i, 12323, i, 12322, i, 12321, c10.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, c10.a() ? 64 : 4, 12610, c10.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f4411d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, c10.a() ? 3 : 2, 12344}, 0);
        P.d.a("eglCreateContext");
        this.f4414g = eGLConfig;
        this.f4412e = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f4411d, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public final P.c b(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f4411d;
            EGLConfig eGLConfig = this.f4414g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceI = P.d.i(eGLDisplay, eGLConfig, surface, this.f4413f);
            EGLDisplay eGLDisplay2 = this.f4411d;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12375, iArr, 0);
            int i = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12374, iArr2, 0);
            Size size = new Size(i, iArr2[0]);
            return new P.c(eGLSurfaceI, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e4) {
            S.h("OpenGlRenderer", "Failed to create EGL surface: " + e4.getMessage(), e4);
            return null;
        }
    }

    public final void c() {
        EGLDisplay eGLDisplay = this.f4411d;
        EGLConfig eGLConfig = this.f4414g;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = P.d.f10545a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        P.d.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.f4415h = eGLSurfaceEglCreatePbufferSurface;
    }

    public final K0.c<String, String> d(C c10) {
        P.d.d(false, this.f4408a);
        try {
            a(c10, null);
            c();
            f(this.f4415h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.f4411d, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new K0.c<>(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e4) {
            S.h("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e4.getMessage(), e4);
            return new K0.c<>("", "");
        } finally {
            h();
        }
    }

    public P.a e(C c10) throws Throwable {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = this.f4408a;
        P.d.d(false, atomicBoolean);
        a.C0118a c0118a = new a.C0118a();
        c0118a.f10531a = "0.0";
        c0118a.f10532b = "0.0";
        c0118a.f10533c = "";
        c0118a.f10534d = "";
        try {
            if (c10.a()) {
                K0.c<String, String> cVarD = d(c10);
                String str = cVarD.f2940a;
                str.getClass();
                String str2 = cVarD.f2941b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    S.g("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    c10 = C.f616d;
                }
                this.f4413f = P.d.f(str2, c10);
                c0118a.f10533c = str;
                c0118a.f10534d = str2;
            }
            a(c10, c0118a);
            c();
            f(this.f4415h);
            String strJ = P.d.j();
            if (strJ == null) {
                throw new NullPointerException("Null glVersion");
            }
            c0118a.f10531a = strJ;
            this.f4416j = P.d.g(c10);
            int iH = P.d.h();
            this.f4419m = iH;
            k(iH);
            this.f4410c = Thread.currentThread();
            atomicBoolean.set(true);
            String strS = c0118a.f10531a == null ? " glVersion" : "";
            if (c0118a.f10532b == null) {
                strS = strS.concat(" eglVersion");
            }
            if (c0118a.f10533c == null) {
                strS = G8.s(strS, " glExtensions");
            }
            if (c0118a.f10534d == null) {
                strS = G8.s(strS, " eglExtensions");
            }
            if (strS.isEmpty()) {
                return new P.a(c0118a.f10531a, c0118a.f10532b, c0118a.f10533c, c0118a.f10534d);
            }
            throw new IllegalStateException("Missing required properties:".concat(strS));
        } catch (IllegalArgumentException e4) {
            e = e4;
            h();
            throw e;
        } catch (IllegalStateException e10) {
            e = e10;
            h();
            throw e;
        }
    }

    public final void f(EGLSurface eGLSurface) {
        this.f4411d.getClass();
        this.f4412e.getClass();
        if (!EGL14.eglMakeCurrent(this.f4411d, eGLSurface, eGLSurface, this.f4412e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public final void g(Surface surface) {
        P.d.d(true, this.f4408a);
        P.d.c(this.f4410c);
        HashMap map = this.f4409b;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, P.d.f10553j);
    }

    public final void h() {
        Iterator<d.f> it = this.f4416j.values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(it.next().f10554a);
        }
        this.f4416j = Collections.EMPTY_MAP;
        this.f4417k = null;
        if (!Objects.equals(this.f4411d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f4411d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap map = this.f4409b;
            for (P.g gVar : map.values()) {
                if (!Objects.equals(gVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f4411d, gVar.a())) {
                    try {
                        P.d.a("eglDestroySurface");
                    } catch (IllegalStateException e4) {
                        S.c("GLUtils", e4.toString(), e4);
                    }
                }
            }
            map.clear();
            if (!Objects.equals(this.f4415h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f4411d, this.f4415h);
                this.f4415h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f4412e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f4411d, this.f4412e);
                this.f4412e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f4411d);
            this.f4411d = EGL14.EGL_NO_DISPLAY;
        }
        this.f4414g = null;
        this.f4419m = -1;
        this.f4418l = d.e.UNKNOWN;
        this.i = null;
        this.f4410c = null;
    }

    public final void i(Surface surface, boolean z10) {
        if (this.i == surface) {
            this.i = null;
            f(this.f4415h);
        }
        HashMap map = this.f4409b;
        P.g gVar = z10 ? (P.g) map.remove(surface) : (P.g) map.put(surface, P.d.f10553j);
        if (gVar == null || gVar == P.d.f10553j) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f4411d, gVar.a());
        } catch (RuntimeException e4) {
            S.h("OpenGlRenderer", "Failed to destroy EGL surface: " + e4.getMessage(), e4);
        }
    }

    public final void j(long j4, float[] fArr, Surface surface) {
        P.d.d(true, this.f4408a);
        P.d.c(this.f4410c);
        HashMap map = this.f4409b;
        A2.l.q("The surface is not registered.", map.containsKey(surface));
        P.g gVarB = (P.g) map.get(surface);
        Objects.requireNonNull(gVarB);
        if (gVarB == P.d.f10553j) {
            gVarB = b(surface);
            if (gVarB == null) {
                return;
            } else {
                map.put(surface, gVarB);
            }
        }
        if (surface != this.i) {
            f(gVarB.a());
            this.i = surface;
            GLES20.glViewport(0, 0, gVarB.c(), gVarB.b());
            GLES20.glScissor(0, 0, gVarB.c(), gVarB.b());
        }
        d.f fVar = this.f4417k;
        fVar.getClass();
        if (fVar instanceof d.g) {
            GLES20.glUniformMatrix4fv(((d.g) fVar).f10559f, 1, false, fArr, 0);
            P.d.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        P.d.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f4411d, gVarB.a(), j4);
        if (EGL14.eglSwapBuffers(this.f4411d, gVarB.a())) {
            return;
        }
        S.g("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        i(surface, false);
    }

    public final void k(int i) {
        d.f fVar = this.f4416j.get(this.f4418l);
        if (fVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f4418l);
        }
        if (this.f4417k != fVar) {
            this.f4417k = fVar;
            fVar.b();
            Log.d("OpenGlRenderer", "Using program for input format " + this.f4418l + ": " + this.f4417k);
        }
        GLES20.glActiveTexture(33984);
        P.d.b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        P.d.b("glBindTexture");
    }
}
