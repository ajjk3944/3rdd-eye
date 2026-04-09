package o0;

import m0.AbstractC6731u0;
import m0.U0;

/* renamed from: o0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7041h {
    static /* synthetic */ void e(InterfaceC7041h interfaceC7041h, U0 u02, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC6731u0.f52948a.b();
        }
        interfaceC7041h.d(u02, i10);
    }

    static /* synthetic */ void h(InterfaceC7041h interfaceC7041h, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        interfaceC7041h.c(f10, f11);
    }

    void a(float[] fArr);

    void b(float f10, float f11, float f12, float f13, int i10);

    void c(float f10, float f11);

    void d(U0 u02, int i10);

    void f(float f10, float f11, long j10);

    void g(float f10, float f11, float f12, float f13);

    void i(float f10, long j10);
}
