package sb;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import j4.o;
import java.util.concurrent.CopyOnWriteArrayList;
import qb.v;

/* loaded from: classes.dex */
public final class l extends GLSurfaceView {
    public static final /* synthetic */ int H = 0;
    public SurfaceTexture B;
    public Surface D;
    public boolean E;
    public boolean F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f21981a;

    /* renamed from: d, reason: collision with root package name */
    public final SensorManager f21982d;

    /* renamed from: g, reason: collision with root package name */
    public final Sensor f21983g;

    /* renamed from: r, reason: collision with root package name */
    public final d f21984r;

    /* renamed from: x, reason: collision with root package name */
    public final Handler f21985x;

    /* renamed from: y, reason: collision with root package name */
    public final i f21986y;

    public l(Context context) {
        super(context, null);
        this.f21981a = new CopyOnWriteArrayList();
        this.f21985x = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f21982d = sensorManager;
        Sensor defaultSensor = v.f20828a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f21983g = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f21986y = iVar;
        j jVar = new j(this, iVar);
        View.OnTouchListener mVar = new m(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f21984r = new d(windowManager.getDefaultDisplay(), mVar, jVar);
        this.E = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(mVar);
    }

    public final void a() {
        boolean z10 = this.E && this.F;
        Sensor sensor = this.f21983g;
        if (sensor == null || z10 == this.G) {
            return;
        }
        d dVar = this.f21984r;
        SensorManager sensorManager = this.f21982d;
        if (z10) {
            sensorManager.registerListener(dVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(dVar);
        }
        this.G = z10;
    }

    public a getCameraMotionListener() {
        return this.f21986y;
    }

    public rb.l getVideoFrameMetadataListener() {
        return this.f21986y;
    }

    public Surface getVideoSurface() {
        return this.D;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21985x.post(new o(17, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.F = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.F = true;
        a();
    }

    public void setDefaultStereoMode(int i10) {
        this.f21986y.G = i10;
    }

    public void setUseSensorRotation(boolean z10) {
        this.E = z10;
        a();
    }
}
