package p0;

import android.graphics.Matrix;
import android.graphics.Outline;
import kotlin.jvm.internal.AbstractC6494u;
import m0.AbstractC6735w0;
import m0.C6733v0;
import m0.InterfaceC6717n0;
import m0.d1;
import mh.InterfaceC6835l;
import o0.InterfaceC7039f;

/* renamed from: p0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7183d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f57411a = a.f57412a;

    /* renamed from: p0.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f57412a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final InterfaceC6835l f57413b = C2025a.f57414a;

        /* renamed from: p0.d$a$a, reason: collision with other inner class name */
        static final class C2025a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final C2025a f57414a = new C2025a();

            C2025a() {
                super(1);
            }

            public final void a(InterfaceC7039f interfaceC7039f) {
                InterfaceC7039f.u0(interfaceC7039f, C6733v0.f52951b.d(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC7039f) obj);
                return Yg.J.f24997a;
            }
        }

        private a() {
        }

        public final InterfaceC6835l a() {
            return f57413b;
        }
    }

    long A();

    long B();

    float C();

    void D(long j10);

    float E();

    float F();

    void G(boolean z10);

    float H();

    void I(long j10);

    void J(Y0.d dVar, Y0.t tVar, C7182c c7182c, InterfaceC6835l interfaceC6835l);

    float K();

    void L(int i10);

    Matrix M();

    float N();

    void a(float f10);

    float b();

    void c(InterfaceC6717n0 interfaceC6717n0);

    void d(float f10);

    void e(float f10);

    void f(float f10);

    void g(float f10);

    void h();

    void i(float f10);

    void j(float f10);

    void k(d1 d1Var);

    void l(float f10);

    void m(float f10);

    float n();

    void o(float f10);

    AbstractC6735w0 p();

    default boolean q() {
        return true;
    }

    int r();

    void s(boolean z10);

    d1 t();

    float u();

    void v(Outline outline, long j10);

    float w();

    int x();

    void y(int i10, int i11, long j10);

    void z(long j10);
}
