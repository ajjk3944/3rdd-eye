package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class iq extends androidx.recyclerview.widget.d0 {

    /* renamed from: c, reason: collision with root package name */
    public final Object f12417c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12418d;

    /* renamed from: e, reason: collision with root package name */
    public int f12419e;

    public iq() {
        super(1);
        this.f12417c = new Object();
        this.f12418d = false;
        this.f12419e = 0;
    }

    public final void A() {
        ya.a0.m("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f12417c) {
            ya.a0.m("markAsDestroyable: Lock acquired");
            pb.y.k(this.f12419e >= 0);
            ya.a0.m("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f12418d = true;
            B();
        }
        ya.a0.m("markAsDestroyable: Lock released");
    }

    public final void B() {
        ya.a0.m("maybeDestroy: Trying to acquire lock");
        synchronized (this.f12417c) {
            try {
                ya.a0.m("maybeDestroy: Lock acquired");
                pb.y.k(this.f12419e >= 0);
                if (this.f12418d && this.f12419e == 0) {
                    ya.a0.m("No reference is left (including root). Cleaning up engine.");
                    v(new hl(6), new hl(19));
                } else {
                    ya.a0.m("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ya.a0.m("maybeDestroy: Lock released");
    }

    public final hq y() {
        hq hqVar = new hq(this);
        ya.a0.m("createNewReference: Trying to acquire lock");
        synchronized (this.f12417c) {
            ya.a0.m("createNewReference: Lock acquired");
            v(new mx0(this, hqVar), new gq(this, hqVar));
            pb.y.k(this.f12419e >= 0);
            this.f12419e++;
        }
        ya.a0.m("createNewReference: Lock released");
        return hqVar;
    }

    public final void z() {
        ya.a0.m("releaseOneReference: Trying to acquire lock");
        synchronized (this.f12417c) {
            ya.a0.m("releaseOneReference: Lock acquired");
            pb.y.k(this.f12419e > 0);
            ya.a0.m("Releasing 1 reference for JS Engine");
            this.f12419e--;
            B();
        }
        ya.a0.m("releaseOneReference: Lock released");
    }
}
