package com.google.android.gms.internal.ads;

import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.vc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2021vc extends B3.u {

    /* renamed from: c, reason: collision with root package name */
    public final Object f17277c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17278d;

    /* renamed from: e, reason: collision with root package name */
    public int f17279e;

    public C2021vc() {
        super(3, false);
        this.f17277c = new Object();
        this.f17278d = false;
        this.f17279e = 0;
    }

    public final C1967uc D() {
        C1967uc c1967uc = new C1967uc(this);
        AbstractC2907C.m("createNewReference: Trying to acquire lock");
        synchronized (this.f17277c) {
            AbstractC2907C.m("createNewReference: Lock acquired");
            A(new Rx(this, c1967uc), new L6(this, c1967uc));
            int i = this.f17279e;
            if (i < 0) {
                throw new IllegalStateException();
            }
            this.f17279e = i + 1;
        }
        AbstractC2907C.m("createNewReference: Lock released");
        return c1967uc;
    }

    public final void E() {
        AbstractC2907C.m("releaseOneReference: Trying to acquire lock");
        synchronized (this.f17277c) {
            AbstractC2907C.m("releaseOneReference: Lock acquired");
            if (this.f17279e <= 0) {
                throw new IllegalStateException();
            }
            AbstractC2907C.m("Releasing 1 reference for JS Engine");
            this.f17279e--;
            G();
        }
        AbstractC2907C.m("releaseOneReference: Lock released");
    }

    public final void F() {
        AbstractC2907C.m("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f17277c) {
            AbstractC2907C.m("markAsDestroyable: Lock acquired");
            if (this.f17279e < 0) {
                throw new IllegalStateException();
            }
            AbstractC2907C.m("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f17278d = true;
            G();
        }
        AbstractC2907C.m("markAsDestroyable: Lock released");
    }

    public final void G() {
        AbstractC2907C.m("maybeDestroy: Trying to acquire lock");
        synchronized (this.f17277c) {
            try {
                AbstractC2907C.m("maybeDestroy: Lock acquired");
                int i = this.f17279e;
                if (i < 0) {
                    throw new IllegalStateException();
                }
                if (this.f17278d && i == 0) {
                    AbstractC2907C.m("No reference is left (including root). Cleaning up engine.");
                    A(new W9(6), new W9(20));
                } else {
                    AbstractC2907C.m("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC2907C.m("maybeDestroy: Lock released");
    }
}
