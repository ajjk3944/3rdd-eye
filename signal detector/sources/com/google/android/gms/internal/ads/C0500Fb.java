package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Fb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500Fb {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8137a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8138b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f8139c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f8140d = new AtomicBoolean(false);

    public final synchronized void a(float f2, boolean z6) {
        this.f8138b = z6;
        this.f8139c = f2;
    }

    public final synchronized boolean b(boolean z6) {
        if (!this.f8140d.get()) {
            return z6;
        }
        return this.f8137a;
    }

    public final synchronized float c() {
        return this.f8139c;
    }
}
