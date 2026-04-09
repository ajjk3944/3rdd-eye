package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ux {

    /* renamed from: b, reason: collision with root package name */
    public long f17375b;

    /* renamed from: a, reason: collision with root package name */
    public final long f17374a = TimeUnit.MILLISECONDS.toNanos(((Long) va.s.f36163e.f36166c.a(sk.f16100e0)).longValue());

    /* renamed from: c, reason: collision with root package name */
    public boolean f17376c = true;

    public final void a(SurfaceTexture surfaceTexture, sx sxVar) {
        if (sxVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f17376c) {
            long j = timestamp - this.f17375b;
            if (Math.abs(j) < this.f17374a) {
                return;
            }
        }
        this.f17376c = false;
        this.f17375b = timestamp;
        ya.f0.f37440l.post(new s(19, sxVar));
    }
}
