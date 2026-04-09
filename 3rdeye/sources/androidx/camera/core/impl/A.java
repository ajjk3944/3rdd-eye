package androidx.camera.core.impl;

import G.h;
import N7.B8;
import android.hardware.camera2.CaptureResult;

/* compiled from: CameraCaptureResult.java */
/* loaded from: classes.dex */
public interface A {

    /* compiled from: CameraCaptureResult.java */
    public static final class a implements A {
        @Override // androidx.camera.core.impl.A
        public final P0 a() {
            return P0.f14934b;
        }

        @Override // androidx.camera.core.impl.A
        public final /* synthetic */ void b(h.b bVar) {
            B8.f(this, bVar);
        }

        @Override // androidx.camera.core.impl.A
        public final EnumC1721y c() {
            return EnumC1721y.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.A
        public final EnumC1722z d() {
            return EnumC1722z.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.A
        public final EnumC1716u e() {
            return EnumC1716u.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.A
        public final CaptureResult f() {
            return null;
        }

        @Override // androidx.camera.core.impl.A
        public final EnumC1719w g() {
            return EnumC1719w.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.A
        public final long getTimestamp() {
            return -1L;
        }
    }

    P0 a();

    void b(h.b bVar);

    EnumC1721y c();

    EnumC1722z d();

    EnumC1716u e();

    CaptureResult f();

    EnumC1719w g();

    long getTimestamp();
}
