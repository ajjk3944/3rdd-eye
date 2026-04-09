package com.apm.insight.j;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Handler f5016a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5017b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final long f5018c;

    public a(Handler handler, long j10) {
        this.f5016a = handler;
        this.f5018c = j10;
    }

    public final void a() {
        this.f5016a.post(this);
    }

    public final long b() {
        return this.f5018c;
    }

    public final void a(long j10) {
        if (j10 > 0) {
            this.f5016a.postDelayed(this, j10);
        } else {
            this.f5016a.post(this);
        }
    }
}
