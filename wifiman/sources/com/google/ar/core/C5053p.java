package com.google.ar.core;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ar.core.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5053p {

    /* renamed from: a, reason: collision with root package name */
    private CameraDevice f38312a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map f38313b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private SurfaceTexture f38314c = null;

    /* renamed from: d, reason: collision with root package name */
    private Surface f38315d = null;

    /* synthetic */ C5053p(byte[] bArr) {
    }

    public final CameraDevice a() {
        return this.f38312a;
    }

    public final void b(CameraDevice cameraDevice) {
        this.f38312a = cameraDevice;
    }

    public final void c(String str, List list) {
        this.f38313b.put(str, list);
    }

    public final SurfaceTexture d() {
        return this.f38314c;
    }

    public final void e(SurfaceTexture surfaceTexture) {
        this.f38314c = surfaceTexture;
    }

    public final Surface f() {
        return this.f38315d;
    }

    public final void g(Surface surface) {
        this.f38315d = surface;
    }
}
