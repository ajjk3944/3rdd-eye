package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
abstract class U6 extends P6 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f36229c;

    U6(C4833d7 c4833d7) {
        super(c4833d7);
        this.f36173b.N0();
    }

    protected final void q() {
        if (!s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void r() {
        if (this.f36229c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        t();
        this.f36173b.M0();
        this.f36229c = true;
    }

    final boolean s() {
        return this.f36229c;
    }

    protected abstract boolean t();
}
