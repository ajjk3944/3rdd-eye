package i7;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.google.ar.core.Camera;
import com.google.ar.core.Config;
import com.google.ar.core.Frame;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.SessionPausedException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import e7.EnumC5426b;
import e7.f;
import e7.i;
import e7.k;
import g7.C5870c;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: i7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6080c extends GLSurfaceView implements GLSurfaceView.Renderer, InterfaceC6078a {

    /* renamed from: a, reason: collision with root package name */
    private final i f48851a;

    /* renamed from: b, reason: collision with root package name */
    private m7.e f48852b;

    /* renamed from: c, reason: collision with root package name */
    private final k f48853c;

    /* renamed from: d, reason: collision with root package name */
    private final C6083f f48854d;

    /* renamed from: e, reason: collision with root package name */
    private e7.d f48855e;

    /* renamed from: f, reason: collision with root package name */
    private e7.d f48856f;

    /* renamed from: g, reason: collision with root package name */
    private e7.d f48857g;

    /* renamed from: h, reason: collision with root package name */
    private Session f48858h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f48859i;

    /* renamed from: j, reason: collision with root package name */
    private final Config.DepthMode f48860j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f48861k;

    /* renamed from: l, reason: collision with root package name */
    private long f48862l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6080c(Context context) {
        super(context);
        AbstractC6492s.i(context, "context");
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        setRenderer(this);
        onPause();
        setRenderMode(1);
        setWillNotDraw(false);
        this.f48851a = new i();
        this.f48853c = new k(context);
        this.f48854d = new C6083f();
        this.f48860j = Config.DepthMode.RAW_DEPTH_ONLY;
    }

    private final void a() {
        Z7.b.h("Closing ArCore session", null, 2, null);
        Session session = this.f48858h;
        if (session != null) {
            session.close();
        }
        this.f48858h = null;
        this.f48859i = false;
        this.f48854d.l(TrackingState.STOPPED, TrackingFailureReason.NONE);
        this.f48854d.k(f.b.f46230a);
    }

    private final void b() {
        EnumC5426b.a aVar = EnumC5426b.Companion;
        Context context = getContext();
        AbstractC6492s.h(context, "getContext(...)");
        if (!aVar.e(context)) {
            Z7.b.h("Skipped ArCore session creation since arcore unavailable", null, 2, null);
            return;
        }
        if (this.f48858h == null) {
            Z7.b.h("Creating arcore session", null, 2, null);
            try {
                this.f48858h = new Session(getContext());
            } catch (FatalException e10) {
                Z7.b.j("ARSession creation error", e10, null, 4, null);
                this.f48854d.k(f.a.C1730a.f46227a);
                return;
            } catch (UnavailableApkTooOldException e11) {
                Z7.b.j("ARSession creation error", e11, null, 4, null);
                this.f48854d.k(f.a.b.f46228a);
                return;
            } catch (UnavailableArcoreNotInstalledException e12) {
                Z7.b.j("ARSession creation error", e12, null, 4, null);
                this.f48854d.k(f.a.b.f46228a);
                return;
            } catch (UnavailableDeviceNotCompatibleException e13) {
                Z7.b.j("ARSession creation error", e13, null, 4, null);
                this.f48854d.k(f.a.c.f46229a);
                return;
            } catch (UnavailableSdkTooOldException e14) {
                Z7.b.j("ARSession creation error", e14, null, 4, null);
                this.f48854d.k(f.a.c.f46229a);
                return;
            }
        }
        try {
            Session session = this.f48858h;
            AbstractC6492s.f(session);
            d(session);
            Session session2 = this.f48858h;
            AbstractC6492s.f(session2);
            session2.resume();
            this.f48854d.k(f.c.f46231a);
        } catch (CameraNotAvailableException unused) {
            this.f48858h = null;
        } catch (FatalException e15) {
            Z7.b.e("Failed top start ar core floorplan", e15, null, 4, null);
            this.f48858h = null;
        }
    }

    private final void c() {
        Session session = this.f48858h;
        if (session != null) {
            AbstractC6492s.f(session);
            session.pause();
            this.f48854d.l(TrackingState.PAUSED, TrackingFailureReason.NONE);
        }
    }

    private final void d(Session session) {
        Config config = session.getConfig();
        AbstractC6492s.h(config, "getConfig(...)");
        session.getConfig().setUpdateMode(Config.UpdateMode.BLOCKING);
        session.getConfig().setFocusMode(Config.FocusMode.AUTO);
        if (e(session)) {
            config.setDepthMode(this.f48860j);
        } else {
            config.setDepthMode(Config.DepthMode.DISABLED);
        }
        session.configure(config);
    }

    private final boolean e(Session session) {
        return session.isDepthModeSupported(this.f48860j);
    }

    public final void f() {
        if (this.f48861k) {
            this.f48853c.b();
            c();
            onPause();
            this.f48861k = false;
            Z7.b.h("ArCore view paused", null, 2, null);
        }
    }

    public final void g(boolean z10) {
        if (this.f48861k) {
            return;
        }
        this.f48853c.c();
        if (z10) {
            b();
        }
        onResume();
        this.f48861k = true;
        Z7.b.h("ArCore view resumed", null, 2, null);
    }

    public final InterfaceC6079b getController() {
        return this.f48854d;
    }

    public final k getDisplayRotationHelper$ar_floorplan_release() {
        return this.f48853c;
    }

    public final e7.d getFrameObjectDetector$ar_floorplan_release() {
        return this.f48857g;
    }

    public final e7.d getFrameSpacePositionProcessor$ar_floorplan_release() {
        return this.f48856f;
    }

    public final e7.d getFrameSpaceProcessor$ar_floorplan_release() {
        return this.f48855e;
    }

    public final m7.e getTilesRenderer() {
        return this.f48852b;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) throws CameraAccessException {
        e7.d dVar;
        GLES20.glClear(16640);
        Session session = this.f48858h;
        if (session != null) {
            if (!this.f48859i) {
                AbstractC6492s.f(session);
                session.setCameraTextureName(this.f48851a.g());
                this.f48859i = true;
            }
            k kVar = this.f48853c;
            Session session2 = this.f48858h;
            AbstractC6492s.f(session2);
            kVar.f(session2);
            Frame frameUpdate = null;
            try {
                Session session3 = this.f48858h;
                AbstractC6492s.f(session3);
                frameUpdate = session3.update();
            } catch (CameraNotAvailableException e10) {
                Z7.b.e("Camera not available during onDrawFrame", e10, null, 4, null);
                return;
            } catch (FatalException e11) {
                Z7.b.e("Fatal exception during onDrawFrame", e11, null, 4, null);
                a();
                this.f48854d.k(f.a.C1730a.f46227a);
                return;
            } catch (SessionPausedException unused) {
            }
            if (frameUpdate != null) {
                Camera camera = frameUpdate.getCamera();
                AbstractC6492s.h(camera, "getCamera(...)");
                if (com.ubnt.usurvey.a.f39654r.a().getConfig().i()) {
                    this.f48851a.e(frameUpdate);
                }
                C6083f c6083f = this.f48854d;
                TrackingState trackingState = camera.getTrackingState();
                AbstractC6492s.h(trackingState, "getTrackingState(...)");
                TrackingFailureReason trackingFailureReason = camera.getTrackingFailureReason();
                AbstractC6492s.h(trackingFailureReason, "getTrackingFailureReason(...)");
                c6083f.l(trackingState, trackingFailureReason);
                if (frameUpdate.getTimestamp() != this.f48862l) {
                    this.f48862l = frameUpdate.getTimestamp();
                    k kVar2 = this.f48853c;
                    Session session4 = this.f48858h;
                    AbstractC6492s.f(session4);
                    String cameraId = session4.getCameraConfig().getCameraId();
                    AbstractC6492s.h(cameraId, "getCameraId(...)");
                    int iA = kVar2.a(cameraId);
                    e7.d dVar2 = this.f48856f;
                    if (dVar2 != null) {
                        dVar2.a(frameUpdate, iA);
                    }
                    Session session5 = this.f48858h;
                    AbstractC6492s.f(session5);
                    if (e(session5) && (dVar = this.f48855e) != null) {
                        dVar.a(frameUpdate, iA);
                    }
                    e7.d dVar3 = this.f48857g;
                    if (dVar3 != null) {
                        dVar3.a(frameUpdate, iA);
                    }
                }
            }
        }
        m7.e eVar = this.f48852b;
        if (eVar != null) {
            eVar.onDrawFrame(gl10);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
        this.f48853c.d(i10, i11);
        m7.e eVar = this.f48852b;
        if (eVar != null) {
            eVar.onSurfaceChanged(gl10, i10, i11);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        C5870c.c("Failed to enable blending", "glEnable");
        i iVar = this.f48851a;
        Context context = getContext();
        AbstractC6492s.h(context, "getContext(...)");
        iVar.c(context);
        m7.e eVar = this.f48852b;
        if (eVar != null) {
            eVar.onSurfaceCreated(gl10, eGLConfig);
        }
    }

    public final void setFrameObjectDetector$ar_floorplan_release(e7.d dVar) {
        this.f48857g = dVar;
    }

    public final void setFrameSpacePositionProcessor$ar_floorplan_release(e7.d dVar) {
        this.f48856f = dVar;
    }

    public final void setFrameSpaceProcessor$ar_floorplan_release(e7.d dVar) {
        this.f48855e = dVar;
    }

    public final void setTilesRenderer(m7.e eVar) {
        this.f48852b = eVar;
    }
}
