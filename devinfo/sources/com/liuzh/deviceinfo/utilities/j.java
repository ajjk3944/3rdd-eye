package com.liuzh.deviceinfo.utilities;

import android.view.Choreographer;
import androidx.lifecycle.o0;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j implements Choreographer.FrameCallback {

    /* renamed from: h, reason: collision with root package name */
    public static final j f21262h = new j();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f21263a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final Choreographer f21264b = Choreographer.getInstance();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f21265c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public double f21266d = 0.0d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f21267e = new o0(16, this);

    /* renamed from: f, reason: collision with root package name */
    public long f21268f = -1;
    public int g = 0;

    public final void a(i iVar) {
        synchronized (this.f21265c) {
            if (this.f21265c.isEmpty() && !this.f21263a.getAndSet(true)) {
                this.f21264b.postFrameCallback(this);
            }
            this.f21265c.add(iVar);
        }
    }

    public final void b(i iVar) {
        synchronized (this.f21265c) {
            this.f21265c.remove(iVar);
            if (this.f21265c.isEmpty()) {
                this.f21263a.set(false);
                this.f21264b.removeFrameCallback(this);
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f21268f == -1) {
            this.f21268f = TimeUnit.NANOSECONDS.toMillis(j);
        } else {
            this.g++;
            long millis = TimeUnit.NANOSECONDS.toMillis(j);
            long j8 = millis - this.f21268f;
            if (j8 > 250) {
                this.f21266d = (this.g * 1000.0d) / j8;
                this.g = 0;
                this.f21268f = millis;
                bi.d.b(this.f21267e);
            }
        }
        if (this.f21263a.get()) {
            this.f21264b.postFrameCallback(this);
        }
    }
}
