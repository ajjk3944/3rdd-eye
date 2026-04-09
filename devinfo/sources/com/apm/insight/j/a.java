package com.apm.insight.j;

import android.os.Handler;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Handler f3240a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3241b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final long f3242c;

    public a(Handler handler, long j) {
        this.f3240a = handler;
        this.f3242c = j;
    }

    public final void a() {
        this.f3240a.post(this);
    }

    public final long b() {
        return this.f3242c;
    }

    public final void a(long j) {
        if (j > 0) {
            this.f3240a.postDelayed(this, j);
        } else {
            this.f3240a.post(this);
        }
    }
}
