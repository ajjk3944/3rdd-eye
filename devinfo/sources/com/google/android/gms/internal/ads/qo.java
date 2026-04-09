package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qo {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15382a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15383b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f15384c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f15385d = new AtomicBoolean(false);

    public final synchronized void a(float f10, boolean z3) {
        this.f15383b = z3;
        this.f15384c = f10;
    }

    public final synchronized boolean b(boolean z3) {
        if (!this.f15385d.get()) {
            return z3;
        }
        return this.f15382a;
    }

    public final synchronized float c() {
        return this.f15384c;
    }
}
