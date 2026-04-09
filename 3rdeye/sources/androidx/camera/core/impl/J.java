package androidx.camera.core.impl;

import C.InterfaceC0625l;
import C.m0;
import java.util.ArrayList;

/* compiled from: CameraInternal.java */
/* loaded from: classes.dex */
public interface J extends InterfaceC0625l, m0.b {

    /* compiled from: CameraInternal.java */
    public enum a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);

        private final boolean mHoldsCameraSlot;

        a(boolean z10) {
            this.mHoldsCameraSlot = z10;
        }

        public boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }
    }

    @Override // C.InterfaceC0625l
    C.r a();

    boolean b();

    void d(B b10);

    InterfaceC1715t0<a> e();

    F f();

    B g();

    void i(boolean z10);

    void j(ArrayList arrayList);

    void k(ArrayList arrayList);

    boolean l();

    void m(boolean z10);

    I n();
}
