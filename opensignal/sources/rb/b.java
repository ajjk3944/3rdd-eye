package rb;

import a5.d0;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import com.google.android.exoplayer2.video.DummySurface;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b extends HandlerThread implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21437a;

    /* renamed from: d, reason: collision with root package name */
    public Handler f21438d;

    /* renamed from: g, reason: collision with root package name */
    public Error f21439g;

    /* renamed from: r, reason: collision with root package name */
    public RuntimeException f21440r;

    /* renamed from: x, reason: collision with root package name */
    public Object f21441x;

    /* renamed from: y, reason: collision with root package name */
    public Surface f21442y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i10) {
        super(str);
        this.f21437a = i10;
    }

    public final void a(int i10) throws a5.f {
        EGLConfig eGLConfig;
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2;
        switch (this.f21437a) {
            case 0:
                ((qb.d) this.f21441x).getClass();
                qb.d dVar = (qb.d) this.f21441x;
                int[] iArr = dVar.f20772d;
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                if (eGLDisplayEglGetDisplay == null) {
                    throw new bf.n("eglGetDisplay failed");
                }
                int[] iArr2 = new int[2];
                if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1)) {
                    throw new bf.n("eglInitialize failed");
                }
                dVar.f20773g = eGLDisplayEglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr3 = new int[1];
                boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, qb.d.B, 0, eGLConfigArr, 0, 1, iArr3, 0);
                if (!zEglChooseConfig || iArr3[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                    Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
                    int i11 = qb.v.f20828a;
                    throw new bf.n(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
                }
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(dVar.f20773g, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                if (eGLContextEglCreateContext == null) {
                    throw new bf.n("eglCreateContext failed");
                }
                dVar.f20774r = eGLContextEglCreateContext;
                EGLDisplay eGLDisplay = dVar.f20773g;
                if (i10 == 1) {
                    eGLSurface = EGL14.EGL_NO_SURFACE;
                } else {
                    EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    if (eGLSurfaceEglCreatePbufferSurface == null) {
                        throw new bf.n("eglCreatePbufferSurface failed");
                    }
                    eGLSurface = eGLSurfaceEglCreatePbufferSurface;
                }
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContextEglCreateContext)) {
                    throw new bf.n("eglMakeCurrent failed");
                }
                dVar.f20775x = eGLSurface;
                GLES20.glGenTextures(1, iArr, 0);
                qb.b.h();
                SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
                dVar.f20776y = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(dVar);
                SurfaceTexture surfaceTexture2 = ((qb.d) this.f21441x).f20776y;
                surfaceTexture2.getClass();
                this.f21442y = new DummySurface(this, surfaceTexture2, i10 != 0);
                return;
            default:
                ((a5.e) this.f21441x).getClass();
                a5.e eVar = (a5.e) this.f21441x;
                int[] iArr4 = eVar.f117d;
                EGLDisplay eGLDisplayEglGetDisplay2 = EGL14.eglGetDisplay(0);
                a5.a.f("eglGetDisplay failed", eGLDisplayEglGetDisplay2 != null);
                int[] iArr5 = new int[2];
                a5.a.f("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay2, iArr5, 0, iArr5, 1));
                eVar.f118g = eGLDisplayEglGetDisplay2;
                EGLConfig[] eGLConfigArr2 = new EGLConfig[1];
                int[] iArr6 = new int[1];
                boolean zEglChooseConfig2 = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay2, a5.e.B, 0, eGLConfigArr2, 0, 1, iArr6, 0);
                boolean z10 = zEglChooseConfig2 && iArr6[0] > 0 && eGLConfigArr2[0] != null;
                Object[] objArr2 = {Boolean.valueOf(zEglChooseConfig2), Integer.valueOf(iArr6[0]), eGLConfigArr2[0]};
                int i12 = d0.f105a;
                a5.a.f(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr2), z10);
                EGLConfig eGLConfig2 = eGLConfigArr2[0];
                EGLContext eGLContextEglCreateContext2 = EGL14.eglCreateContext(eVar.f118g, eGLConfig2, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                a5.a.f("eglCreateContext failed", eGLContextEglCreateContext2 != null);
                eVar.f119r = eGLContextEglCreateContext2;
                EGLDisplay eGLDisplay2 = eVar.f118g;
                if (i10 == 1) {
                    eGLSurface2 = EGL14.EGL_NO_SURFACE;
                } else {
                    EGLSurface eGLSurfaceEglCreatePbufferSurface2 = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig2, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    a5.a.f("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface2 != null);
                    eGLSurface2 = eGLSurfaceEglCreatePbufferSurface2;
                }
                a5.a.f("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, eGLContextEglCreateContext2));
                eVar.f120x = eGLSurface2;
                GLES20.glGenTextures(1, iArr4, 0);
                StringBuilder sb2 = new StringBuilder();
                boolean z11 = false;
                while (true) {
                    int iGlGetError = GLES20.glGetError();
                    if (iGlGetError == 0) {
                        if (z11) {
                            throw new a5.f(sb2.toString());
                        }
                        SurfaceTexture surfaceTexture3 = new SurfaceTexture(iArr4[0]);
                        eVar.f121y = surfaceTexture3;
                        surfaceTexture3.setOnFrameAvailableListener(eVar);
                        SurfaceTexture surfaceTexture4 = ((a5.e) this.f21441x).f121y;
                        surfaceTexture4.getClass();
                        this.f21442y = new PlaceholderSurface(this, surfaceTexture4, i10 != 0);
                        return;
                    }
                    if (z11) {
                        sb2.append('\n');
                    }
                    sb2.append("glError: ");
                    sb2.append(GLU.gluErrorString(iGlGetError));
                    z11 = true;
                }
                break;
        }
    }

    public final void b() {
        switch (this.f21437a) {
            case 0:
                ((qb.d) this.f21441x).getClass();
                qb.d dVar = (qb.d) this.f21441x;
                dVar.f20771a.removeCallbacks(dVar);
                try {
                    SurfaceTexture surfaceTexture = dVar.f20776y;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                        GLES20.glDeleteTextures(1, dVar.f20772d, 0);
                    }
                    return;
                } finally {
                    EGLDisplay eGLDisplay = dVar.f20773g;
                    if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay2 = dVar.f20773g;
                        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface2 = dVar.f20775x;
                    if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(dVar.f20773g, dVar.f20775x);
                    }
                    EGLContext eGLContext = dVar.f20774r;
                    if (eGLContext != null) {
                        EGL14.eglDestroyContext(dVar.f20773g, eGLContext);
                    }
                    if (qb.v.f20828a >= 19) {
                        EGL14.eglReleaseThread();
                    }
                    EGLDisplay eGLDisplay3 = dVar.f20773g;
                    if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(dVar.f20773g);
                    }
                    dVar.f20773g = null;
                    dVar.f20774r = null;
                    dVar.f20775x = null;
                    dVar.f20776y = null;
                }
            default:
                ((a5.e) this.f21441x).getClass();
                a5.e eVar = (a5.e) this.f21441x;
                eVar.f116a.removeCallbacks(eVar);
                try {
                    SurfaceTexture surfaceTexture2 = eVar.f121y;
                    if (surfaceTexture2 != null) {
                        surfaceTexture2.release();
                        GLES20.glDeleteTextures(1, eVar.f117d, 0);
                    }
                    return;
                } finally {
                    EGLDisplay eGLDisplay4 = eVar.f118g;
                    if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay5 = eVar.f118g;
                        EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface4 = eVar.f120x;
                    if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(eVar.f118g, eVar.f120x);
                    }
                    EGLContext eGLContext2 = eVar.f119r;
                    if (eGLContext2 != null) {
                        EGL14.eglDestroyContext(eVar.f118g, eGLContext2);
                    }
                    if (d0.f105a >= 19) {
                        EGL14.eglReleaseThread();
                    }
                    EGLDisplay eGLDisplay6 = eVar.f118g;
                    if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(eVar.f118g);
                    }
                    eVar.f118g = null;
                    eVar.f119r = null;
                    eVar.f120x = null;
                    eVar.f121y = null;
                }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f21437a) {
            case 0:
                int i10 = message.what;
                try {
                    if (i10 == 1) {
                        try {
                            a(message.arg1);
                            synchronized (this) {
                                notify();
                            }
                        } catch (Error e4) {
                            qb.b.q("DummySurface", "Failed to initialize dummy surface", e4);
                            this.f21439g = e4;
                            synchronized (this) {
                                notify();
                            }
                        } catch (RuntimeException e10) {
                            qb.b.q("DummySurface", "Failed to initialize dummy surface", e10);
                            this.f21440r = e10;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } else if (i10 == 2) {
                        try {
                            b();
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                    return true;
                } catch (Throwable th2) {
                    synchronized (this) {
                        notify();
                        throw th2;
                    }
                }
            default:
                int i11 = message.what;
                try {
                    if (i11 == 1) {
                        try {
                            try {
                                a(message.arg1);
                                synchronized (this) {
                                    notify();
                                }
                            } catch (a5.f e11) {
                                a5.a.n("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                                this.f21440r = new IllegalStateException(e11);
                                synchronized (this) {
                                    notify();
                                }
                            } catch (RuntimeException e12) {
                                a5.a.n("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                                this.f21440r = e12;
                                synchronized (this) {
                                    notify();
                                }
                            }
                        } catch (Error e13) {
                            a5.a.n("PlaceholderSurface", "Failed to initialize placeholder surface", e13);
                            this.f21439g = e13;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } else if (i11 == 2) {
                        try {
                            b();
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                    return true;
                } catch (Throwable th3) {
                    synchronized (this) {
                        notify();
                        throw th3;
                    }
                }
        }
    }
}
