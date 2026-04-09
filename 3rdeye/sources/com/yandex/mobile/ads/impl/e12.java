package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import com.yandex.mobile.ads.impl.g52;
import com.yandex.mobile.ads.impl.hf1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes3.dex */
public final class e12 extends GLSurfaceView {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f26625a;

    /* renamed from: b, reason: collision with root package name */
    private final SensorManager f26626b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f26627c;

    /* renamed from: d, reason: collision with root package name */
    private final hf1 f26628d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f26629e;

    /* renamed from: f, reason: collision with root package name */
    private final ht1 f26630f;

    /* renamed from: g, reason: collision with root package name */
    private SurfaceTexture f26631g;

    /* renamed from: h, reason: collision with root package name */
    private Surface f26632h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26633j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26634k;

    public interface b {
        void a(Surface surface);

        void b();
    }

    public e12(Context context) {
        this(context, null);
    }

    private void d() {
        boolean z10 = this.i && this.f26633j;
        Sensor sensor = this.f26627c;
        if (sensor == null || z10 == this.f26634k) {
            return;
        }
        if (z10) {
            this.f26626b.registerListener(this.f26628d, sensor, 0);
        } else {
            this.f26626b.unregisterListener(this.f26628d);
        }
        this.f26634k = z10;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26629e.post(new J2(this, 4));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f26633j = false;
        d();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f26633j = true;
        d();
    }

    public void setDefaultStereoMode(int i) {
        this.f26630f.a(i);
    }

    public void setUseSensorRotation(boolean z10) {
        this.i = z10;
        d();
    }

    public e12(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26625a = new CopyOnWriteArrayList<>();
        this.f26629e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) zf.a(context.getSystemService("sensor"));
        this.f26626b = sensorManager;
        Sensor defaultSensor = s82.f32899a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f26627c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        ht1 ht1Var = new ht1();
        this.f26630f = ht1Var;
        a aVar = new a(ht1Var);
        View.OnTouchListener g52Var = new g52(context, aVar);
        this.f26628d = new hf1(((WindowManager) zf.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), g52Var, aVar);
        this.i = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(g52Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Surface surface = this.f26632h;
        if (surface != null) {
            Iterator<b> it = this.f26625a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
        SurfaceTexture surfaceTexture = this.f26631g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        this.f26631g = null;
        this.f26632h = null;
    }

    public final qn a() {
        return this.f26630f;
    }

    public final fe2 b() {
        return this.f26630f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f26631g;
        Surface surface = this.f26632h;
        Surface surface2 = new Surface(surfaceTexture);
        this.f26631g = surfaceTexture;
        this.f26632h = surface2;
        Iterator<b> it = this.f26625a.iterator();
        while (it.hasNext()) {
            it.next().a(surface2);
        }
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SurfaceTexture surfaceTexture) {
        this.f26629e.post(new V1(4, this, surfaceTexture));
    }

    public final class a implements GLSurfaceView.Renderer, g52.a, hf1.a {

        /* renamed from: a, reason: collision with root package name */
        private final ht1 f26635a;

        /* renamed from: d, reason: collision with root package name */
        private final float[] f26638d;

        /* renamed from: e, reason: collision with root package name */
        private final float[] f26639e;

        /* renamed from: f, reason: collision with root package name */
        private final float[] f26640f;

        /* renamed from: g, reason: collision with root package name */
        private float f26641g;

        /* renamed from: h, reason: collision with root package name */
        private float f26642h;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f26636b = new float[16];

        /* renamed from: c, reason: collision with root package name */
        private final float[] f26637c = new float[16];
        private final float[] i = new float[16];

        /* renamed from: j, reason: collision with root package name */
        private final float[] f26643j = new float[16];

        public a(ht1 ht1Var) {
            float[] fArr = new float[16];
            this.f26638d = fArr;
            float[] fArr2 = new float[16];
            this.f26639e = fArr2;
            float[] fArr3 = new float[16];
            this.f26640f = fArr3;
            this.f26635a = ht1Var;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f26642h = 3.1415927f;
        }

        @Override // com.yandex.mobile.ads.impl.hf1.a
        public final synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f26638d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f11 = -f10;
            this.f26642h = f11;
            Matrix.setRotateM(this.f26639e, 0, -this.f26641g, (float) Math.cos(f11), (float) Math.sin(this.f26642h), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f26643j, 0, this.f26638d, 0, this.f26640f, 0);
                Matrix.multiplyMM(this.i, 0, this.f26639e, 0, this.f26643j, 0);
            }
            Matrix.multiplyMM(this.f26637c, 0, this.f26636b, 0, this.i, 0);
            this.f26635a.a(this.f26637c);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i10) {
            GLES20.glViewport(0, 0, i, i10);
            float f10 = i / i10;
            Matrix.perspectiveM(this.f26636b, 0, f10 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d) : 90.0f, f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            e12.this.b(this.f26635a.a());
        }

        public final synchronized void a(PointF pointF) {
            float f10 = pointF.y;
            this.f26641g = f10;
            Matrix.setRotateM(this.f26639e, 0, -f10, (float) Math.cos(this.f26642h), (float) Math.sin(this.f26642h), 0.0f);
            Matrix.setRotateM(this.f26640f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        public final boolean a(MotionEvent motionEvent) {
            return e12.this.performClick();
        }
    }
}
