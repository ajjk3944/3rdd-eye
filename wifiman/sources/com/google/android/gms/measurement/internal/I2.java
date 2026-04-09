package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
abstract class I2 extends AbstractC4845f1 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f35930b;

    I2(C4976v3 c4976v3) {
        super(c4976v3);
        this.f36331a.l();
    }

    final boolean s() {
        return this.f35930b;
    }

    protected abstract boolean t();

    protected final void u() {
        if (!s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void v() {
        if (this.f35930b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (t()) {
            return;
        }
        this.f36331a.k();
        this.f35930b = true;
    }

    public final void w() {
        if (this.f35930b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        x();
        this.f36331a.k();
        this.f35930b = true;
    }

    protected void x() {
    }
}
