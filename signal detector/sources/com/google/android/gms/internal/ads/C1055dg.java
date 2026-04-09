package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;
import q2.C2841s;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.dg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1055dg {

    /* renamed from: b, reason: collision with root package name */
    public long f13789b;

    /* renamed from: a, reason: collision with root package name */
    public final long f13788a = TimeUnit.MILLISECONDS.toNanos(((Long) C2841s.f23267e.f23270c.a(H9.f8734e0)).longValue());

    /* renamed from: c, reason: collision with root package name */
    public boolean f13790c = true;

    public final void a(SurfaceTexture surfaceTexture, C0946bg c0946bg) {
        if (c0946bg == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f13790c) {
            long j6 = timestamp - this.f13789b;
            if (Math.abs(j6) < this.f13788a) {
                return;
            }
        }
        this.f13790c = false;
        this.f13789b = timestamp;
        C2911G.f23576l.post(new RunnableC1883t(20, c0946bg));
    }
}
