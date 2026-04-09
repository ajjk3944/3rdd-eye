package com.yandex.mobile.ads.impl;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class ht1 implements fe2, qn {

    /* renamed from: j, reason: collision with root package name */
    private int f28361j;

    /* renamed from: k, reason: collision with root package name */
    private SurfaceTexture f28362k;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f28365n;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f28354b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f28355c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private final dm1 f28356d = new dm1();

    /* renamed from: e, reason: collision with root package name */
    private final kc0 f28357e = new kc0();

    /* renamed from: f, reason: collision with root package name */
    private final u42<Long> f28358f = new u42<>();

    /* renamed from: g, reason: collision with root package name */
    private final u42<bm1> f28359g = new u42<>();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f28360h = new float[16];
    private final float[] i = new float[16];

    /* renamed from: l, reason: collision with root package name */
    private volatile int f28363l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f28364m = -1;

    @Override // com.yandex.mobile.ads.impl.qn
    public final void f() {
        this.f28358f.a();
        this.f28357e.a();
        this.f28355c.set(true);
    }

    public final void a(float[] fArr) {
        GLES20.glClear(16384);
        ke0.a();
        if (this.f28354b.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f28362k;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            ke0.a();
            if (this.f28355c.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f28360h, 0);
            }
            long timestamp = this.f28362k.getTimestamp();
            Long lA = this.f28358f.a(timestamp);
            if (lA != null) {
                this.f28357e.a(lA.longValue(), this.f28360h);
            }
            bm1 bm1VarB = this.f28359g.b(timestamp);
            if (bm1VarB != null) {
                this.f28356d.a(bm1VarB);
            }
        }
        Matrix.multiplyMM(this.i, 0, fArr, 0, this.f28360h, 0);
        this.f28356d.a(this.f28361j, this.i);
    }

    public final SurfaceTexture a() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        ke0.a();
        this.f28356d.a();
        ke0.a();
        this.f28361j = ke0.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f28361j);
        this.f28362k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.yandex.mobile.ads.impl.Q0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f24233b.a(surfaceTexture2);
            }
        });
        return this.f28362k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        this.f28354b.set(true);
    }

    @Override // com.yandex.mobile.ads.impl.qn
    public final void a(long j4, float[] fArr) {
        this.f28357e.b(j4, fArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    @Override // com.yandex.mobile.ads.impl.fe2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r37, long r39, com.yandex.mobile.ads.impl.dc0 r41, android.media.MediaFormat r42) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ht1.a(long, long, com.yandex.mobile.ads.impl.dc0, android.media.MediaFormat):void");
    }

    public final void a(int i) {
        this.f28363l = i;
    }
}
