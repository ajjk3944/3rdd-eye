package com.apm.insight.j;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Handler f6195a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6196b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final long f6197c;

    public a(Handler handler, long j6) {
        this.f6195a = handler;
        this.f6197c = j6;
    }

    public final void a() {
        this.f6195a.post(this);
    }

    public final long b() {
        return this.f6197c;
    }

    public final void a(long j6) {
        if (j6 > 0) {
            this.f6195a.postDelayed(this, j6);
        } else {
            this.f6195a.post(this);
        }
    }
}
