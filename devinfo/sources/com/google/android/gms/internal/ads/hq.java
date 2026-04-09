package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hq extends androidx.recyclerview.widget.d0 {

    /* renamed from: c, reason: collision with root package name */
    public final Object f11938c;

    /* renamed from: d, reason: collision with root package name */
    public final iq f11939d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11940e;

    public hq(iq iqVar) {
        super(1);
        this.f11938c = new Object();
        this.f11939d = iqVar;
    }

    public final void y() {
        ya.a0.m("release: Trying to acquire lock");
        synchronized (this.f11938c) {
            try {
                ya.a0.m("release: Lock acquired");
                if (this.f11940e) {
                    ya.a0.m("release: Lock already released");
                    return;
                }
                this.f11940e = true;
                v(new hl(5), new hl(19));
                v(new gq(this), new ix0(this));
                ya.a0.m("release: Lock released");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
