package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4830d4 extends AbstractC4803a4 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f36374b;

    AbstractC4830d4(C4976v3 c4976v3) {
        super(c4976v3);
        this.f36331a.l();
    }

    protected void k() {
    }

    protected final void l() {
        if (!o()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.f36374b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (p()) {
            return;
        }
        this.f36331a.k();
        this.f36374b = true;
    }

    public final void n() {
        if (this.f36374b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        k();
        this.f36331a.k();
        this.f36374b = true;
    }

    final boolean o() {
        return this.f36374b;
    }

    protected abstract boolean p();
}
