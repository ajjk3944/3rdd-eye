package L0;

import java.util.List;
import l0.C6533i;
import m0.AbstractC6713l0;
import m0.C6733v0;
import m0.InterfaceC6717n0;
import m0.U0;
import m0.g1;
import o0.AbstractC7040g;
import o0.InterfaceC7039f;

/* renamed from: L0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3186p {
    static /* synthetic */ void d(InterfaceC3186p interfaceC3186p, InterfaceC6717n0 interfaceC6717n0, AbstractC6713l0 abstractC6713l0, float f10, g1 g1Var, W0.k kVar, AbstractC7040g abstractC7040g, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        interfaceC3186p.y(interfaceC6717n0, abstractC6713l0, (i11 & 4) != 0 ? Float.NaN : f10, (i11 & 8) != 0 ? null : g1Var, (i11 & 16) != 0 ? null : kVar, (i11 & 32) != 0 ? null : abstractC7040g, (i11 & 64) != 0 ? InterfaceC7039f.f55034d1.a() : i10);
    }

    static /* synthetic */ void w(InterfaceC3186p interfaceC3186p, InterfaceC6717n0 interfaceC6717n0, long j10, g1 g1Var, W0.k kVar, AbstractC7040g abstractC7040g, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        interfaceC3186p.v(interfaceC6717n0, (i11 & 2) != 0 ? C6733v0.f52951b.e() : j10, (i11 & 4) != 0 ? null : g1Var, (i11 & 8) != 0 ? null : kVar, (i11 & 16) == 0 ? abstractC7040g : null, (i11 & 32) != 0 ? InterfaceC7039f.f55034d1.a() : i10);
    }

    U0 A(int i10, int i11);

    float B(int i10, boolean z10);

    float C(int i10);

    float a();

    float b();

    void c(long j10, float[] fArr, int i10);

    W0.i e(int i10);

    float f(int i10);

    float g();

    float getHeight();

    float getWidth();

    C6533i h(int i10);

    long i(int i10);

    int j(int i10);

    float k();

    W0.i l(int i10);

    float m(int i10);

    long n(C6533i c6533i, int i10, J j10);

    int o(long j10);

    C6533i p(int i10);

    List q();

    int r(int i10);

    int s(int i10, boolean z10);

    int t();

    float u(int i10);

    void v(InterfaceC6717n0 interfaceC6717n0, long j10, g1 g1Var, W0.k kVar, AbstractC7040g abstractC7040g, int i10);

    boolean x();

    void y(InterfaceC6717n0 interfaceC6717n0, AbstractC6713l0 abstractC6713l0, float f10, g1 g1Var, W0.k kVar, AbstractC7040g abstractC7040g, int i10);

    int z(float f10);
}
